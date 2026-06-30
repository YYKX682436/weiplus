package com.tencent.mm.appbrand.v8;

/* loaded from: classes7.dex */
public class NativeBufferJNI implements cl.u {
    private long nativeInst = nativeCreate();

    static {
        int i17 = cl.o3.f42713b;
    }

    private native void nativeBindTo(long j17, long j18, long j19);

    private native long nativeCreate();

    private native void nativeDestroy(long j17);

    private native int nativeGenerateId(long j17);

    private native byte[] nativeGetBuffer(long j17, int i17);

    private native java.nio.ByteBuffer nativeGetDirectBuffer(long j17, int i17);

    private native void nativeReleaseDirectBuffer(java.nio.ByteBuffer byteBuffer);

    private native void nativeSetBuffer(long j17, int i17, java.nio.ByteBuffer byteBuffer);

    private native void nativeSetBufferForLegacyArray(long j17, int i17, byte[] bArr, int i18);

    public void bindTo(long j17, long j18) {
        nativeBindTo(this.nativeInst, j17, j18);
    }

    @Override // cl.u
    public void bufferStoreBindTo(long j17, long j18) {
        bindTo(j17, j18);
    }

    public void destroy() {
    }

    public void finalize() {
        super.finalize();
        long j17 = this.nativeInst;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.nativeInst = 0L;
        }
    }

    @Override // cl.u
    public int generateId() {
        return nativeGenerateId(this.nativeInst);
    }

    @Override // cl.u
    public java.nio.ByteBuffer getBuffer(int i17, boolean z17) {
        if (z17) {
            return nativeGetDirectBuffer(this.nativeInst, i17);
        }
        byte[] nativeGetBuffer = nativeGetBuffer(this.nativeInst, i17);
        if (nativeGetBuffer == null) {
            return null;
        }
        return java.nio.ByteBuffer.wrap(nativeGetBuffer);
    }

    @Override // cl.u
    public void releaseDirectByteBuffer(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            nativeReleaseDirectBuffer(byteBuffer);
        }
    }

    @Override // cl.u
    public void setBuffer(int i17, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || byteBuffer.capacity() == 0) {
            return;
        }
        if (byteBuffer.isDirect()) {
            nativeSetBuffer(this.nativeInst, i17, byteBuffer);
        } else {
            byte[] array = byteBuffer.array();
            nativeSetBufferForLegacyArray(this.nativeInst, i17, array, array.length);
        }
    }

    @Override // cl.u
    public boolean supportBufferStoreBindTo() {
        return true;
    }
}
