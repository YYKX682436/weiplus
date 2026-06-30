package mi1;

/* loaded from: classes7.dex */
public final class u0 extends mi1.g0 implements mi1.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f408228d;

    /* renamed from: e, reason: collision with root package name */
    public int f408229e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.Animator f408230f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408228d = runtime;
        this.f408229e = Integer.MIN_VALUE;
    }

    public static final void n(mi1.u0 u0Var, al1.q qVar, boolean z17) {
        if (qVar == null) {
            u0Var.getClass();
            return;
        }
        u0Var.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = u0Var.f408228d;
        mi1.q1 q1Var = c11510xdd90c2f2.f156354z.f408240f;
        jz5.g gVar = mi1.q1.f408195h;
        q1Var.c(true, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d d17 = c11510xdd90c2f2.f156354z.d();
        android.view.View a17 = c11510xdd90c2f2.f156354z.a(com.p314xaae8f345.mm.R.id.eyp);
        if (a17 != null) {
            d17.removeView(a17);
        }
        qVar.setId(com.p314xaae8f345.mm.R.id.eyp);
        qVar.mo2260x52d2f021(d17.m53338xf50dc028());
        d17.f172566d.setVisibility(8);
        d17.f172567e = qVar;
        d17.addView(qVar);
        qVar.setAlpha(0.0f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new al1.o(qVar));
        ofFloat.start();
        if (z17) {
            android.animation.Animator l17 = u0Var.l(d17.m53337x2a1ea81());
            l17.start();
            u0Var.f408230f = l17;
        }
    }

    @Override // mi1.w0
    public void b(java.lang.CharSequence charSequence) {
    }

    @Override // mi1.w0
    public void c(android.graphics.drawable.Drawable drawable) {
        p(drawable);
    }

    @Override // mi1.w0
    /* renamed from: dismiss */
    public void mo147359x63a3b28a() {
        p(null);
    }

    @Override // mi1.w0
    public void e(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        o(params);
    }

    @Override // mi1.w0
    public void f(int i17, boolean z17) {
        this.f408229e = i17;
    }

    @Override // mi1.w0
    public void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationFinish isCustomStatus:%b", java.lang.Boolean.valueOf(z17));
        this.f408228d.C1(false, this.f408229e, z17);
    }

    public void o(java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        java.lang.Object obj = params.get("key_type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarBlinkHelper.CustomStatus");
        mi1.a aVar = (mi1.a) obj;
        java.lang.Object obj2 = params.get("key_allow_animation");
        java.lang.Boolean bool = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        mi1.a aVar2 = mi1.a.TRADE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f408228d;
        if (aVar == aVar2) {
            new al1.w(c11510xdd90c2f2.f156354z.d().getContext(), params, new mi1.r0(this, booleanValue));
        } else if (aVar == mi1.a.KOUBEI) {
            new al1.u(c11510xdd90c2f2.f156354z.d().getContext(), params, new mi1.s0(this, booleanValue));
        }
        int ordinal = aVar.ordinal();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationStart isCustomStatus:%b", java.lang.Boolean.TRUE);
        c11510xdd90c2f2.C1(true, ordinal, true);
    }

    public void p(android.graphics.drawable.Drawable drawable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f408228d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d.C12762x8fe39d2d d17 = c11510xdd90c2f2.f156354z.d();
        q();
        boolean z17 = drawable != null;
        boolean z18 = (z17 || d17.f172567e == null) ? false : true;
        c11510xdd90c2f2.f156354z.f408240f.c(false, drawable != null);
        d17.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleBarBlinkWrapper", "applyLogo isStart " + z17);
        if (z17) {
            int i17 = this.f408229e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationStart isCustomStatus:%b", java.lang.Boolean.valueOf(z18));
            c11510xdd90c2f2.C1(true, i17, z18);
        } else {
            i(z18);
        }
        if (drawable != null) {
            d17.m53336x6fbe8813().setImageDrawable(drawable);
            android.animation.Animator l17 = l(d17.m53336x6fbe8813());
            ((android.animation.ValueAnimator) l17).addUpdateListener(new mi1.t0(d17, drawable));
            l17.start();
            this.f408230f = l17;
        }
    }

    public final void q() {
        android.animation.Animator animator = this.f408230f;
        if (animator != null) {
            animator.cancel();
        }
        android.widget.ImageView m53336x6fbe8813 = this.f408228d.f156354z.d().m53336x6fbe8813();
        if (m53336x6fbe8813 != null) {
            m53336x6fbe8813.clearAnimation();
        }
    }
}
