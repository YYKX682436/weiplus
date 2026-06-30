package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.BinaryCodec */
/* loaded from: classes5.dex */
public final class C28678x7b41475 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<java.nio.ByteBuffer> {

    /* renamed from: INSTANCE */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28678x7b41475 f71591x4fbc8495 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28678x7b41475();

    /* renamed from: INSTANCE_DIRECT */
    public static final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28678x7b41475 f71592x6f9aa6d3 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28678x7b41475(true);

    /* renamed from: returnsDirectByteBufferFromDecoding */
    private final boolean f71593xc086dea9;

    private C28678x7b41475() {
        this.f71593xc086dea9 = false;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: encodeMessage, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public java.nio.ByteBuffer mo138408x6b057511(java.nio.ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f
    /* renamed from: decodeMessage, reason: avoid collision after fix types in other method */
    public java.nio.ByteBuffer mo138407x37439e39(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null || this.f71593xc086dea9) {
            return byteBuffer;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
        allocate.put(byteBuffer);
        allocate.rewind();
        return allocate;
    }

    private C28678x7b41475(boolean z17) {
        this.f71593xc086dea9 = z17;
    }
}
