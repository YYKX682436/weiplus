package wf;

/* loaded from: classes7.dex */
public class p extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public wf.a0 f527011a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wf.b f527012b;

    public p(wf.b bVar) {
        this.f527012b = bVar;
    }

    @Override // tf.d
    public int c() {
        return this.f527012b.f334030d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f527012b.v();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f527012b.w();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f527011a == null) {
            this.f527011a = new wf.a0(this.f527012b);
        }
        return this.f527011a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.LivePlayer;
    }
}
