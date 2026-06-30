package bg;

/* loaded from: classes7.dex */
public class h0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public bg.h1 f101332a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.f f101333b;

    public h0(bg.f fVar) {
        this.f101333b = fVar;
    }

    @Override // tf.d
    public int c() {
        return this.f101333b.f334030d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f101333b.z();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f101333b.A();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f101332a == null) {
            this.f101332a = new bg.h1(this.f101333b);
        }
        return this.f101332a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.Video;
    }
}
