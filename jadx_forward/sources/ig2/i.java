package ig2;

/* loaded from: classes10.dex */
public final class i implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public final ng2.s f372916d;

    /* renamed from: e, reason: collision with root package name */
    public final ng2.c f372917e;

    public i(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f372916d = new ng2.s(context);
        this.f372917e = new ng2.c(context);
    }

    @Override // kg2.a
    public void a() {
        this.f372917e.getClass();
        ig2.m.f372926a.d();
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        ng2.c cVar = this.f372917e;
        cVar.getClass();
        cVar.u(onAnimationEndCallback);
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
        this.f372917e.d(switchParams);
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
        this.f372916d.e(switchParams);
        ng2.c cVar = this.f372917e;
        cVar.getClass();
        cVar.f400098p = switchParams;
    }

    @Override // kg2.b
    public void f(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        this.f372916d.f(renderView, onFirstFrameRenderCallback, isDetachInvokeFun);
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        ng2.s sVar = this.f372916d;
        sVar.getClass();
        sVar.u(onAnimationEndCallback);
    }

    @Override // ez2.b
    public void h() {
        this.f372916d.h();
    }

    @Override // kg2.b
    public boolean i() {
        return this.f372916d.f400104r;
    }

    @Override // ig2.r
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public ig2.j c() {
        return this.f372916d.d();
    }
}
