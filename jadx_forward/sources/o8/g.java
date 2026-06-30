package o8;

/* loaded from: classes15.dex */
public class g extends o8.a {

    /* renamed from: e, reason: collision with root package name */
    public final o8.d f425142e = new o8.d();

    /* renamed from: f, reason: collision with root package name */
    public java.nio.ByteBuffer f425143f;

    /* renamed from: g, reason: collision with root package name */
    public long f425144g;

    /* renamed from: h, reason: collision with root package name */
    public final int f425145h;

    public g(int i17) {
        this.f425145h = i17;
    }

    public void l() {
        this.f425127d = 0;
        java.nio.ByteBuffer byteBuffer = this.f425143f;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final java.nio.ByteBuffer m(int i17) {
        int i18 = this.f425145h;
        if (i18 == 1) {
            return java.nio.ByteBuffer.allocate(i17);
        }
        if (i18 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i17);
        }
        java.nio.ByteBuffer byteBuffer = this.f425143f;
        throw new java.lang.IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i17 + ")");
    }

    public void n(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f425143f;
        if (byteBuffer == null) {
            this.f425143f = m(i17);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f425143f.position();
        int i18 = i17 + position;
        if (capacity >= i18) {
            return;
        }
        java.nio.ByteBuffer m17 = m(i18);
        if (position > 0) {
            this.f425143f.position(0);
            this.f425143f.limit(position);
            m17.put(this.f425143f);
        }
        this.f425143f = m17;
    }
}
