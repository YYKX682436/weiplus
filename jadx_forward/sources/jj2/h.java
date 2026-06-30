package jj2;

/* loaded from: classes10.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jj2.a f381524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 f381525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f381526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f381527g;

    public h(jj2.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, v65.n nVar) {
        this.f381524d = aVar;
        this.f381525e = c14246xaa893502;
        this.f381526f = c0Var;
        this.f381527g = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.f381525e;
        jj2.d dVar = c14246xaa893502.f193253f;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initData");
            throw null;
        }
        jj2.a aVar = this.f381524d;
        aVar.b(dVar);
        c14246xaa893502.f193251d.add(aVar);
        if (c14246xaa893502.f193256i) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f381526f;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        this.f381527g.a(jz5.f0.f384359a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
