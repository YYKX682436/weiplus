package g75;

/* loaded from: classes10.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final g75.r f350934a;

    public t(g75.r pipeline) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
        this.f350934a = pipeline;
    }

    public final void a(j75.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f350934a.f350933o.B3(action);
    }

    public final void b(yz5.l observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        g75.r rVar = this.f350934a;
        rVar.f350933o.L2(rVar, observer);
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public final void f(yz5.l processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        g75.r rVar = this.f350934a;
        rVar.f350933o.z3(rVar, processor);
    }

    public final void g(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        g75.r rVar = this.f350934a;
        rVar.getClass();
        if (rVar.f350929h) {
            d75.b.g(block);
        } else {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) rVar.f350931m).mo141623x754a37bb(), null, new g75.p(block, null), 1, null);
        }
    }

    public final g75.z h() {
        return (g75.z) this.f350934a.f350933o.f379609g;
    }
}
