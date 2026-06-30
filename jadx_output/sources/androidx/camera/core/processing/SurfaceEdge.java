package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public class SurfaceEdge {
    private final android.graphics.Rect mCropRect;
    private final int mFormat;
    private final boolean mHasCameraTransform;
    private final boolean mMirroring;
    private androidx.camera.core.SurfaceRequest mProviderSurfaceRequest;
    private int mRotationDegrees;
    private final android.graphics.Matrix mSensorToBufferTransform;
    private androidx.camera.core.processing.SurfaceEdge.SettableSurface mSettableSurface;
    private final androidx.camera.core.impl.StreamSpec mStreamSpec;
    private int mTargetRotation;
    private final int mTargets;
    private boolean mHasConsumer = false;
    private final java.util.Set<java.lang.Runnable> mOnInvalidatedListeners = new java.util.HashSet();
    private boolean mIsClosed = false;
    private final java.util.List<m3.a> mTransformationUpdatesListeners = new java.util.ArrayList();

    /* loaded from: classes14.dex */
    public static class SettableSurface extends androidx.camera.core.impl.DeferrableSurface {
        t2.k mCompleter;
        private androidx.camera.core.processing.SurfaceOutputImpl mConsumer;
        private androidx.camera.core.impl.DeferrableSurface mProvider;
        final wa.a mSurfaceFuture;

        public SettableSurface(android.util.Size size, int i17) {
            super(size, i17);
            this.mSurfaceFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$a
                @Override // t2.m
                public final java.lang.Object attachCompleter(t2.k kVar) {
                    java.lang.Object lambda$new$0;
                    lambda$new$0 = androidx.camera.core.processing.SurfaceEdge.SettableSurface.this.lambda$new$0(kVar);
                    return lambda$new$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$close$1() {
            androidx.camera.core.processing.SurfaceOutputImpl surfaceOutputImpl = this.mConsumer;
            if (surfaceOutputImpl != null) {
                surfaceOutputImpl.requestClose();
            }
            if (this.mProvider == null) {
                t2.k kVar = this.mCompleter;
                kVar.f414655d = true;
                t2.o oVar = kVar.f414653b;
                if (oVar != null && oVar.f414658e.cancel(true)) {
                    kVar.f414652a = null;
                    kVar.f414653b = null;
                    kVar.f414654c = null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
            this.mCompleter = kVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        public boolean canSetProvider() {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            return this.mProvider == null && !isClosed();
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void close() {
            super.close();
            androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceEdge.SettableSurface.this.lambda$close$1();
                }
            });
        }

        public boolean hasProvider() {
            return this.mProvider != null;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public wa.a provideSurface() {
            return this.mSurfaceFuture;
        }

        public void setConsumer(androidx.camera.core.processing.SurfaceOutputImpl surfaceOutputImpl) {
            m3.h.e(this.mConsumer == null, "Consumer can only be linked once.");
            this.mConsumer = surfaceOutputImpl;
        }

        public boolean setProvider(final androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.lang.Runnable runnable) {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            deferrableSurface.getClass();
            androidx.camera.core.impl.DeferrableSurface deferrableSurface2 = this.mProvider;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            m3.h.e(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            m3.h.b(getPrescribedSize().equals(deferrableSurface.getPrescribedSize()), java.lang.String.format("The provider's size(%s) must match the parent(%s)", getPrescribedSize(), deferrableSurface.getPrescribedSize()));
            m3.h.b(getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat(), java.lang.String.format("The provider's format(%s) must match the parent(%s)", java.lang.Integer.valueOf(getPrescribedStreamFormat()), java.lang.Integer.valueOf(deferrableSurface.getPrescribedStreamFormat())));
            m3.h.e(!isClosed(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.mProvider = deferrableSurface;
            androidx.camera.core.impl.utils.futures.Futures.propagate(deferrableSurface.getSurface(), this.mCompleter);
            deferrableSurface.incrementUseCount();
            getTerminationFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.DeferrableSurface.this.decrementUseCount();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
            return true;
        }
    }

    public SurfaceEdge(int i17, int i18, androidx.camera.core.impl.StreamSpec streamSpec, android.graphics.Matrix matrix, boolean z17, android.graphics.Rect rect, int i19, int i27, boolean z18) {
        this.mTargets = i17;
        this.mFormat = i18;
        this.mStreamSpec = streamSpec;
        this.mSensorToBufferTransform = matrix;
        this.mHasCameraTransform = z17;
        this.mCropRect = rect;
        this.mRotationDegrees = i19;
        this.mTargetRotation = i27;
        this.mMirroring = z18;
        this.mSettableSurface = new androidx.camera.core.processing.SurfaceEdge.SettableSurface(streamSpec.getResolution(), i18);
    }

    private void checkAndSetHasConsumer() {
        m3.h.e(!this.mHasConsumer, "Consumer can only be linked once.");
        this.mHasConsumer = true;
    }

    private void checkNotClosed() {
        m3.h.e(!this.mIsClosed, "Edge is already closed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public wa.a lambda$createSurfaceOutputFuture$2(final androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface, int i17, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2, android.view.Surface surface) {
        surface.getClass();
        try {
            settableSurface.incrementUseCount();
            androidx.camera.core.processing.SurfaceOutputImpl surfaceOutputImpl = new androidx.camera.core.processing.SurfaceOutputImpl(surface, getTargets(), i17, this.mStreamSpec.getResolution(), cameraInputInfo, cameraInputInfo2, this.mSensorToBufferTransform);
            surfaceOutputImpl.getCloseFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$f
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceEdge.SettableSurface.this.decrementUseCount();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            settableSurface.setConsumer(surfaceOutputImpl);
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(surfaceOutputImpl);
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e17) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSurfaceRequest$0() {
        if (this.mIsClosed) {
            return;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSurfaceRequest$1() {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceEdge.this.lambda$createSurfaceRequest$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTransformation$3(int i17, int i18) {
        boolean z17;
        boolean z18 = true;
        if (this.mRotationDegrees != i17) {
            this.mRotationDegrees = i17;
            z17 = true;
        } else {
            z17 = false;
        }
        if (this.mTargetRotation != i18) {
            this.mTargetRotation = i18;
        } else {
            z18 = z17;
        }
        if (z18) {
            notifyTransformationInfoUpdate();
        }
    }

    private void notifyTransformationInfoUpdate() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.SurfaceRequest.TransformationInfo of6 = androidx.camera.core.SurfaceRequest.TransformationInfo.of(this.mCropRect, this.mRotationDegrees, this.mTargetRotation, hasCameraTransform(), this.mSensorToBufferTransform, this.mMirroring);
        androidx.camera.core.SurfaceRequest surfaceRequest = this.mProviderSurfaceRequest;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(of6);
        }
        java.util.Iterator<m3.a> it = this.mTransformationUpdatesListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(of6);
        }
    }

    public void addOnInvalidatedListener(java.lang.Runnable runnable) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        this.mOnInvalidatedListeners.add(runnable);
    }

    public void addTransformationUpdateListener(m3.a aVar) {
        aVar.getClass();
        this.mTransformationUpdatesListeners.add(aVar);
    }

    public final void close() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.mSettableSurface.close();
        this.mIsClosed = true;
    }

    public wa.a createSurfaceOutputFuture(final int i17, final androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, final androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        final androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.mSettableSurface;
        return androidx.camera.core.impl.utils.futures.Futures.transformAsync(settableSurface.getSurface(), new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.processing.SurfaceEdge$$e
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final wa.a apply(java.lang.Object obj) {
                wa.a lambda$createSurfaceOutputFuture$2;
                lambda$createSurfaceOutputFuture$2 = androidx.camera.core.processing.SurfaceEdge.this.lambda$createSurfaceOutputFuture$2(settableSurface, i17, cameraInputInfo, cameraInputInfo2, (android.view.Surface) obj);
                return lambda$createSurfaceOutputFuture$2;
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    public androidx.camera.core.SurfaceRequest createSurfaceRequest(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return createSurfaceRequest(cameraInternal, true);
    }

    public final void disconnect() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        this.mSettableSurface.close();
    }

    public android.graphics.Rect getCropRect() {
        return this.mCropRect;
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        checkAndSetHasConsumer();
        return this.mSettableSurface;
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.mSettableSurface;
    }

    public int getFormat() {
        return this.mFormat;
    }

    public int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    public androidx.camera.core.impl.StreamSpec getStreamSpec() {
        return this.mStreamSpec;
    }

    public int getTargets() {
        return this.mTargets;
    }

    public boolean hasCameraTransform() {
        return this.mHasCameraTransform;
    }

    public boolean hasProvider() {
        return this.mSettableSurface.hasProvider();
    }

    public void invalidate() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        if (this.mSettableSurface.canSetProvider()) {
            return;
        }
        this.mHasConsumer = false;
        this.mSettableSurface.close();
        this.mSettableSurface = new androidx.camera.core.processing.SurfaceEdge.SettableSurface(this.mStreamSpec.getResolution(), this.mFormat);
        java.util.Iterator<java.lang.Runnable> it = this.mOnInvalidatedListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean isClosed() {
        return this.mIsClosed;
    }

    public boolean isMirroring() {
        return this.mMirroring;
    }

    public void removeTransformationUpdateListener(m3.a aVar) {
        aVar.getClass();
        this.mTransformationUpdatesListeners.remove(aVar);
    }

    public void setProvider(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.mSettableSurface;
        java.util.Objects.requireNonNull(settableSurface);
        settableSurface.setProvider(deferrableSurface, new androidx.camera.core.processing.SurfaceEdge$$b(settableSurface));
    }

    public void updateTransformation(int i17) {
        updateTransformation(i17, -1);
    }

    public androidx.camera.core.SurfaceRequest createSurfaceRequest(androidx.camera.core.impl.CameraInternal cameraInternal, boolean z17) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        checkNotClosed();
        androidx.camera.core.SurfaceRequest surfaceRequest = new androidx.camera.core.SurfaceRequest(this.mStreamSpec.getResolution(), cameraInternal, z17, this.mStreamSpec.getDynamicRange(), this.mStreamSpec.getExpectedFrameRateRange(), new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceEdge.this.lambda$createSurfaceRequest$1();
            }
        });
        try {
            final androidx.camera.core.impl.DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.mSettableSurface;
            java.util.Objects.requireNonNull(settableSurface);
            if (settableSurface.setProvider(deferrableSurface, new androidx.camera.core.processing.SurfaceEdge$$b(settableSurface))) {
                wa.a terminationFuture = settableSurface.getTerminationFuture();
                java.util.Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.DeferrableSurface.this.close();
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
            this.mProviderSurfaceRequest = surfaceRequest;
            notifyTransformationInfoUpdate();
            return surfaceRequest;
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e17) {
            throw new java.lang.AssertionError("Surface is somehow already closed", e17);
        } catch (java.lang.RuntimeException e18) {
            surfaceRequest.willNotProvideSurface();
            throw e18;
        }
    }

    public void updateTransformation(final int i17, final int i18) {
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceEdge.this.lambda$updateTransformation$3(i17, i18);
            }
        });
    }
}
