package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.StringCodec */
/* loaded from: classes13.dex */
public final class C28693x7d6ca65 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.lang.String> {

    /* renamed from: UTF8 */
    private static final java.nio.charset.Charset f71640x27e791 = java.nio.charset.Charset.forName("UTF8");

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65 f71639x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65();

    private C28693x7d6ca65() {
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: decodeMessage, reason: avoid collision after fix types in other method */
    public java.lang.String mo138407x37439e39(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr;
        int i17;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i17 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i17 = 0;
        }
        return new java.lang.String(bArr, i17, remaining, f71640x27e791);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: encodeMessage, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.nio.ByteBuffer mo138408x6b057511(java.lang.String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f71640x27e791);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
