package bg;

/* loaded from: classes7.dex */
public class h0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public bg.h1 f19799a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.f f19800b;

    public h0(bg.f fVar) {
        this.f19800b = fVar;
    }

    @Override // tf.d
    public int c() {
        return this.f19800b.f252497d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f19800b.z();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f19800b.A();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f19799a == null) {
            this.f19799a = new bg.h1(this.f19800b);
        }
        return this.f19799a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.Video;
    }
}
