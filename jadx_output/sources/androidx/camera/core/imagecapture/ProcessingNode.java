package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
public class ProcessingNode implements androidx.camera.core.processing.Node<androidx.camera.core.imagecapture.ProcessingNode.In, java.lang.Void> {
    private static final java.lang.String TAG = "ProcessingNode";
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> mBitmap2JpegBytes;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> mBitmapEffect;
    final java.util.concurrent.Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, android.graphics.Bitmap> mImage2Bitmap;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Image2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> mImage2JpegBytes;
    final androidx.camera.core.processing.InternalImageProcessor mImageProcessor;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> mInput2Packet;
    private androidx.camera.core.imagecapture.ProcessingNode.In mInputEdge;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> mJpegBytes2CroppedBitmap;
    private androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> mJpegBytes2Image;
    private androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>, androidx.camera.core.ImageProxy> mJpegImage2Result;
    private final androidx.camera.core.impl.Quirks mQuirks;

    /* loaded from: classes14.dex */
    public static abstract class In {
        public static androidx.camera.core.imagecapture.ProcessingNode.In of(int i17, int i18) {
            return new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In(new androidx.camera.core.processing.Edge(), new androidx.camera.core.processing.Edge(), i17, i18);
        }

        public abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getPostviewEdge();
    }

    /* loaded from: classes14.dex */
    public static abstract class InputPacket {
        public static androidx.camera.core.imagecapture.ProcessingNode.InputPacket of(androidx.camera.core.imagecapture.ProcessingRequest processingRequest, androidx.camera.core.ImageProxy imageProxy) {
            return new androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        public abstract androidx.camera.core.ImageProxy getImageProxy();

        public abstract androidx.camera.core.imagecapture.ProcessingRequest getProcessingRequest();
    }

    public ProcessingNode(java.util.concurrent.Executor executor) {
        this(executor, null, androidx.camera.core.internal.compat.quirk.DeviceQuirks.getAll());
    }

    private androidx.camera.core.processing.Packet<byte[]> cropAndMaybeApplyEffect(androidx.camera.core.processing.Packet<byte[]> packet, int i17) {
        m3.h.e(androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(packet.getFormat()), null);
        androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply = this.mJpegBytes2CroppedBitmap.apply(packet);
        androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<android.graphics.Bitmap>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            apply = operation.apply(apply);
        }
        return this.mBitmap2JpegBytes.apply(androidx.camera.core.imagecapture.Bitmap2JpegBytes.In.of(apply, i17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(final androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$f
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.ProcessingNode.this.lambda$transform$0(inputPacket);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$3(final androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$e
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.ProcessingNode.this.lambda$transform$2(inputPacket);
                }
            });
        } else {
            androidx.camera.core.Logger.w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private static void sendError(final androidx.camera.core.imagecapture.ProcessingRequest processingRequest, final androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$d
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.ProcessingRequest.this.onProcessFailure(imageCaptureException);
            }
        });
    }

    public void injectProcessingInput2Packet(androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.ProcessingNode.InputPacket, androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    public androidx.camera.core.ImageProxy processInMemoryCapture(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> apply = this.mInput2Packet.apply(inputPacket);
        if ((apply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && this.mInputEdge.getOutputFormat() == 256) {
            androidx.camera.core.processing.Packet<byte[]> apply2 = this.mImage2JpegBytes.apply(androidx.camera.core.imagecapture.Image2JpegBytes.In.of(apply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                apply2 = cropAndMaybeApplyEffect(apply2, processingRequest.getJpegQuality());
            }
            apply = this.mJpegBytes2Image.apply(apply2);
        }
        return this.mJpegImage2Result.apply(apply);
    }

    /* renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$0(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        final androidx.camera.core.imagecapture.ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                final androidx.camera.core.ImageProxy processInMemoryCapture = processInMemoryCapture(inputPacket);
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$g
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.imagecapture.ProcessingRequest.this.onFinalResult(processInMemoryCapture);
                    }
                });
            } else {
                final androidx.camera.core.ImageCapture.OutputFileResults processOnDiskCapture = processOnDiskCapture(inputPacket);
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.imagecapture.ProcessingRequest.this.onFinalResult(processOnDiskCapture);
                    }
                });
            }
        } catch (androidx.camera.core.ImageCaptureException e17) {
            sendError(processingRequest, e17);
        } catch (java.lang.OutOfMemoryError e18) {
            sendError(processingRequest, new androidx.camera.core.ImageCaptureException(0, "Processing failed due to low memory.", e18));
        } catch (java.lang.RuntimeException e19) {
            sendError(processingRequest, new androidx.camera.core.ImageCaptureException(0, "Processing failed.", e19));
        }
    }

    public androidx.camera.core.ImageCapture.OutputFileResults processOnDiskCapture(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        m3.h.b(androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(outputFormat), java.lang.String.format("On-disk capture only support JPEG and JPEG/R output formats. Output format: %s", java.lang.Integer.valueOf(outputFormat)));
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        androidx.camera.core.processing.Packet<byte[]> apply = this.mImage2JpegBytes.apply(androidx.camera.core.imagecapture.Image2JpegBytes.In.of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (apply.hasCropping() || this.mBitmapEffect != null) {
            apply = cropAndMaybeApplyEffect(apply, processingRequest.getJpegQuality());
        }
        androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        java.util.Objects.requireNonNull(outputFileOptions);
        return operation.apply(androidx.camera.core.imagecapture.JpegBytes2Disk.In.of(apply, outputFileOptions));
    }

    /* renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$2(androidx.camera.core.imagecapture.ProcessingNode.InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        m3.h.b(outputFormat == 35 || outputFormat == 256, java.lang.String.format("Postview only support YUV and JPEG output formats. Output format: %s", java.lang.Integer.valueOf(outputFormat)));
        final androidx.camera.core.imagecapture.ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            final android.graphics.Bitmap apply = this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket));
            androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.imagecapture.ProcessingRequest.this.onPostviewBitmapAvailable(apply);
                }
            });
        } catch (java.lang.Exception e17) {
            inputPacket.getImageProxy().close();
            androidx.camera.core.Logger.e(TAG, "process postview input packet failed.", e17);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    public ProcessingNode(java.util.concurrent.Executor executor, androidx.camera.core.impl.Quirks quirks) {
        this(executor, null, quirks);
    }

    @Override // androidx.camera.core.processing.Node
    public java.lang.Void transform(androidx.camera.core.imagecapture.ProcessingNode.In in6) {
        this.mInputEdge = in6;
        in6.getEdge().setListener(new m3.a() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$b
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.imagecapture.ProcessingNode.this.lambda$transform$1((androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj);
            }
        });
        in6.getPostviewEdge().setListener(new m3.a() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$c
            @Override // m3.a
            public final void accept(java.lang.Object obj) {
                androidx.camera.core.imagecapture.ProcessingNode.this.lambda$transform$3((androidx.camera.core.imagecapture.ProcessingNode.InputPacket) obj);
            }
        });
        this.mInput2Packet = new androidx.camera.core.imagecapture.ProcessingInput2Packet();
        this.mImage2JpegBytes = new androidx.camera.core.imagecapture.Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new androidx.camera.core.imagecapture.JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new androidx.camera.core.imagecapture.Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new androidx.camera.core.imagecapture.JpegBytes2Disk();
        this.mJpegImage2Result = new androidx.camera.core.imagecapture.JpegImage2Result();
        this.mImage2Bitmap = new androidx.camera.core.imagecapture.Image2Bitmap();
        if (in6.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new androidx.camera.core.imagecapture.JpegBytes2Image();
        }
        androidx.camera.core.processing.InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new androidx.camera.core.imagecapture.BitmapEffect(internalImageProcessor);
        return null;
    }

    public ProcessingNode(java.util.concurrent.Executor executor, androidx.camera.core.processing.InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, androidx.camera.core.internal.compat.quirk.DeviceQuirks.getAll());
    }

    public ProcessingNode(java.util.concurrent.Executor executor, androidx.camera.core.processing.InternalImageProcessor internalImageProcessor, androidx.camera.core.impl.Quirks quirks) {
        if (androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class);
    }
}
