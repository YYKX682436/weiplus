package sz3;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f495499a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f495500b;

    /* renamed from: c, reason: collision with root package name */
    public int f495501c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f495502d;

    /* renamed from: e, reason: collision with root package name */
    public int f495503e;

    /* renamed from: f, reason: collision with root package name */
    public int f495504f;

    public b1(byte[] bArr) {
        if (bArr != null) {
            this.f495499a = java.nio.ByteBuffer.wrap(bArr);
        } else {
            this.f495499a = null;
        }
    }

    public final byte[] a() {
        byte[] bArr = null;
        java.nio.ByteBuffer byteBuffer = this.f495499a;
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.hasArray()) {
            return byteBuffer.array();
        }
        if (this.f495500b == null) {
            if (byteBuffer != null && byteBuffer.remaining() > 0) {
                bArr = et5.h.f(byteBuffer);
            }
            this.f495500b = bArr;
        }
        return this.f495500b;
    }

    public b1(java.nio.ByteBuffer byteBuffer) {
        this.f495499a = byteBuffer;
    }
}
