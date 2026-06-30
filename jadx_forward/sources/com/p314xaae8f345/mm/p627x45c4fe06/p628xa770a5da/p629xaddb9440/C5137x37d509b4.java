package com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440;

/* renamed from: com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI */
/* loaded from: classes7.dex */
public final class C5137x37d509b4 {
    private static final java.lang.String TAG = "MicroMsg.AppBrandCommBinding.BufferUtilsJNI";

    /* renamed from: com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI$BufferHolderJNI */
    /* loaded from: classes7.dex */
    public static final class BufferHolderJNI {

        /* renamed from: address */
        public long f21480xbb979bf4;

        /* renamed from: length */
        public long f21481xbe0e3ae6;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: releaseInternal */
        public void m43216x95125be4() {
            synchronized (this) {
                try {
                    if (this.f21480xbb979bf4 != 0) {
                        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.m43213xd336821c(this);
                    }
                } finally {
                    this.f21480xbb979bf4 = 0L;
                }
            }
        }

        /* renamed from: finalize */
        public void m43217xd764dc1e() {
            m43216x95125be4();
            super.finalize();
        }
    }

    /* renamed from: com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI$FileDescriptorJNI */
    /* loaded from: classes7.dex */
    public static final class FileDescriptorJNI {

        /* renamed from: fd, reason: collision with root package name */
        public int f135475fd;

        /* renamed from: length */
        public long f21482xbe0e3ae6;

        /* renamed from: startOffset */
        public long f21483x8926c395;
    }

    static {
        bl.d.f103207a.mo10716xeb57c8f5("wxa-runtime-binding");
    }

    private C5137x37d509b4() {
    }

    /* renamed from: createBufferHolderFromFileDescriptor */
    public static com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.BufferHolderJNI m43211x3d9f679d(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return null;
        }
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptor.getParcelFileDescriptor();
            try {
                com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.FileDescriptorJNI fileDescriptorJNI = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.FileDescriptorJNI();
                fileDescriptorJNI.f135475fd = parcelFileDescriptor.detachFd();
                fileDescriptorJNI.f21483x8926c395 = assetFileDescriptor.getStartOffset();
                fileDescriptorJNI.f21482xbe0e3ae6 = assetFileDescriptor.getLength();
                com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.BufferHolderJNI m43212xb426ac54 = m43212xb426ac54(fileDescriptorJNI);
                parcelFileDescriptor.close();
                return m43212xb426ac54;
            } finally {
            }
        } catch (java.io.IOException e17) {
            bl.h.f103208a.e(TAG, "createDirectByteBufferFromScriptFileDescriptor parse fd get exception:%s", e17);
            return null;
        }
    }

    /* renamed from: nativeCreateBufferHolderFromFileDescriptor */
    private static native com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.BufferHolderJNI m43212xb426ac54(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.FileDescriptorJNI fileDescriptorJNI);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeReleaseBufferHolder */
    public static native void m43213xd336821c(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.BufferHolderJNI bufferHolderJNI);

    /* renamed from: releaseBufferHolder */
    public static void m43214x427cc7b3(com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.p629xaddb9440.C5137x37d509b4.BufferHolderJNI bufferHolderJNI) {
        if (bufferHolderJNI == null) {
            return;
        }
        bufferHolderJNI.m43216x95125be4();
    }
}
