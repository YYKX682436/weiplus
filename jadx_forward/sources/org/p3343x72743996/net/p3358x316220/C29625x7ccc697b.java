package org.p3343x72743996.net.p3358x316220;

/* renamed from: org.chromium.net.impl.Preconditions */
/* loaded from: classes15.dex */
public final class C29625x7ccc697b {
    private C29625x7ccc697b() {
    }

    /* renamed from: checkDirect */
    public static void m154258x139c8711(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    /* renamed from: checkHasRemaining */
    public static void m154259x4ef375a4(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
