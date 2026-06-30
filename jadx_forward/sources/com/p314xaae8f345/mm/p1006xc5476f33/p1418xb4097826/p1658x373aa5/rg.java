package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class rg implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 f214492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f214493e;

    public rg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 c15330x673c21f7, v65.n nVar) {
        this.f214492d = c15330x673c21f7;
        this.f214493e = nVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f214493e.a(jz5.f0.f384359a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xf xfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7.B;
        this.f214492d.v();
        this.f214493e.a(jz5.f0.f384359a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPopupBubbleView", "animation_end");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        android.widget.TextView m62291x7531c8a2;
        java.lang.String str;
        int m62293x6adea43b;
        int m62285xa53cf079;
        int m62283x4fdde990;
        r45.u56 u56Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 c15330x673c21f7 = this.f214492d;
        m62291x7531c8a2 = c15330x673c21f7.m62291x7531c8a2();
        r45.hp2 hp2Var = c15330x673c21f7.f212888u;
        if (hp2Var == null || (u56Var = hp2Var.f457908e) == null || (str = u56Var.f468609d) == null) {
            str = "";
        }
        m62291x7531c8a2.setText(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("animation_start=");
        m62293x6adea43b = c15330x673c21f7.m62293x6adea43b();
        sb6.append(m62293x6adea43b);
        sb6.append(',');
        m62285xa53cf079 = c15330x673c21f7.m62285xa53cf079();
        sb6.append(m62285xa53cf079);
        sb6.append(',');
        m62283x4fdde990 = c15330x673c21f7.m62283x4fdde990();
        sb6.append(m62283x4fdde990);
        sb6.append(',');
        sb6.append(c15330x673c21f7.f212884q);
        sb6.append(',');
        sb6.append(c15330x673c21f7.f212885r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPopupBubbleView", sb6.toString());
    }
}
