package com.tencent.mm.appbrand.commonjni.buffer;

/* loaded from: classes7.dex */
public final class BufferUtilsJNI {
    private static final java.lang.String TAG = "MicroMsg.AppBrandCommBinding.BufferUtilsJNI";

    /* loaded from: classes7.dex */
    public static final class BufferHolderJNI {
        public long address;
        public long length;

        /* JADX INFO: Access modifiers changed from: private */
        public void releaseInternal() {
            synchronized (this) {
                try {
                    if (this.address != 0) {
                        com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.nativeReleaseBufferHolder(this);
                    }
                } finally {
                    this.address = 0L;
                }
            }
        }

        public void finalize() {
            releaseInternal();
            super.finalize();
        }
    }

    /* loaded from: classes7.dex */
    public static final class FileDescriptorJNI {

        /* renamed from: fd, reason: collision with root package name */
        public int f53942fd;
        public long length;
        public long startOffset;
    }

    static {
        bl.d.f21674a.loadLibrary("wxa-runtime-binding");
    }

    private BufferUtilsJNI() {
    }

    public static com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI createBufferHolderFromFileDescriptor(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return null;
        }
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            try {
                com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.FileDescriptorJNI fileDescriptorJNI = new com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.FileDescriptorJNI();
                fileDescriptorJNI.f53942fd = parcelFileDescriptor.detachFd();
                fileDescriptorJNI.startOffset = assetFileDescriptor.getStartOffset();
                fileDescriptorJNI.length = assetFileDescriptor.getLength();
                com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI nativeCreateBufferHolderFromFileDescriptor = nativeCreateBufferHolderFromFileDescriptor(fileDescriptorJNI);
                parcelFileDescriptor.close();
                return nativeCreateBufferHolderFromFileDescriptor;
            } finally {
            }
        } catch (java.io.IOException e17) {
            bl.h.f21675a.e(TAG, "createDirectByteBufferFromScriptFileDescriptor parse fd get exception:%s", e17);
            return null;
        }
    }

    private static native com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI nativeCreateBufferHolderFromFileDescriptor(com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.FileDescriptorJNI fileDescriptorJNI);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeReleaseBufferHolder(com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI bufferHolderJNI);

    public static void releaseBufferHolder(com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI bufferHolderJNI) {
        if (bufferHolderJNI == null) {
            return;
        }
        bufferHolderJNI.releaseInternal();
    }
}
