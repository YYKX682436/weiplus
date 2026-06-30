package d7;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f308357a;

    public m(byte[] bArr, int i17) {
        this.f308357a = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.BIG_ENDIAN).limit(i17);
    }

    public short a(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f308357a;
        if (byteBuffer.remaining() - i17 >= 2) {
            return byteBuffer.getShort(i17);
        }
        return (short) -1;
    }
}
