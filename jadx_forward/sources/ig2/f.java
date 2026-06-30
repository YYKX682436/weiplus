package ig2;

/* loaded from: classes10.dex */
public final class f implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public final mg2.e f372906d;

    /* renamed from: e, reason: collision with root package name */
    public final mg2.a f372907e;

    public f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f372906d = new mg2.e(context);
        this.f372907e = new mg2.a(context);
    }

    @Override // kg2.a
    public void a() {
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        mg2.a aVar = this.f372907e;
        aVar.getClass();
        aVar.u(onAnimationEndCallback);
    }

    @Override // ig2.r
    public ig2.n c() {
        return this.f372906d.b();
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
        this.f372907e.d(switchParams);
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
        this.f372906d.e(switchParams);
        mg2.a aVar = this.f372907e;
        aVar.getClass();
        aVar.f400098p = switchParams;
    }

    @Override // kg2.b
    public void f(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        this.f372906d.f(renderView, onFirstFrameRenderCallback, isDetachInvokeFun);
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        this.f372906d.g(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        this.f372906d.h();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f372906d.f400104r;
    }
}
