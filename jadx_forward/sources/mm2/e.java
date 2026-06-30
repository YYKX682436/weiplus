package mm2;

/* loaded from: classes3.dex */
public abstract class e extends p012xc85e97e9.p093xedfae76a.c1 implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f410496d;

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f410497e;

    public e(gk2.e liveContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410496d = liveContext;
        this.f410497e = new im5.c();
    }

    /* renamed from: business */
    public p012xc85e97e9.p093xedfae76a.c1 m147920xbba4bfc0(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        gk2.e owner = this.f410496d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(owner.getViewModel(), new gk2.a(owner)).a(bu6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    @Override // im5.b
    /* renamed from: keep */
    public void mo46316x322b85(im5.a target) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f410497e.mo46316x322b85(target);
    }
}
