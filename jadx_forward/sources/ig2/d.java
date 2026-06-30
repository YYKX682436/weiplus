package ig2;

/* loaded from: classes3.dex */
public final class d implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public ig2.n f372903d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f372904e;

    @Override // kg2.a
    public void a() {
        ig2.m.f372926a.d();
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
    }

    @Override // ig2.r
    public ig2.n c() {
        return this.f372903d;
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchParams, "switchParams");
        this.f372903d = switchParams;
    }

    @Override // kg2.b
    public void f(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderView, "renderView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        android.view.TextureView textureView = new android.view.TextureView(renderView.getContext());
        ig2.n nVar = this.f372903d;
        mn0.b0 b0Var = nVar != null ? nVar.f372942h : null;
        renderView.mo46533x473bda1f(textureView);
        textureView.setSurfaceTextureListener(new ig2.b(this, b0Var, renderView));
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new ig2.c(this, onFirstFrameRenderCallback));
        }
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        onAnimationEndCallback.mo152xb9724478();
    }

    @Override // ez2.b
    public void h() {
    }

    @Override // kg2.b
    public boolean i() {
        return false;
    }
}
