package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f230869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f230870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f230871f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908, boolean z17, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f230869d = c16548x9f1d7908;
        this.f230870e = z17;
        this.f230871f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "outerView ani end");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f230869d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16546x2fd54791 c16546x2fd54791 = c16548x9f1d7908.f230684g;
        if (c16546x2fd54791 != null) {
            c16546x2fd54791.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startProgress ");
        sb6.append(c16548x9f1d7908.D);
        sb6.append(", ");
        sb6.append(c16548x9f1d7908.E);
        sb6.append(", ");
        sb6.append(c16548x9f1d7908.isEnabled());
        sb6.append(", ");
        boolean z17 = this.f230870e;
        sb6.append(z17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.ImproveMMSightRecordButton", sb6.toString(), new java.lang.Object[0]);
        if (c16548x9f1d7908.f230694t) {
            c16548x9f1d7908.G = java.lang.System.currentTimeMillis();
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r rVar = c16548x9f1d7908.f230688n;
                if (rVar != null) {
                    ((yt3.w2) rVar).f547240a.n(true);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.r rVar2 = c16548x9f1d7908.f230688n;
                if (rVar2 != null) {
                    ((yt3.w2) rVar2).f547240a.n(false);
                }
            }
            c16548x9f1d7908.f230695u = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16547xe8ba10c2 c16547xe8ba10c2 = c16548x9f1d7908.f230683f;
            if (c16547xe8ba10c2 != null) {
                c16547xe8ba10c2.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16547xe8ba10c2 c16547xe8ba10c22 = c16548x9f1d7908.f230683f;
            if (c16547xe8ba10c22 != null) {
                int i17 = c16548x9f1d7908.D;
                int i18 = c16548x9f1d7908.E;
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.m(c16548x9f1d7908);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightCircularProgressBar", "setInitData >> " + i17 + ", " + i18);
                c16547xe8ba10c22.f230676o = (float) i17;
                c16547xe8ba10c22.f230677p = (float) i18;
                c16547xe8ba10c22.f230674m = mVar;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16547xe8ba10c2 c16547xe8ba10c23 = c16548x9f1d7908.f230683f;
            if (c16547xe8ba10c23 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightCircularProgressBar", "startProgress");
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q qVar = c16547xe8ba10c23.f230679r;
                if (qVar != null) {
                    qVar.f230935j = false;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = qVar.f230929d;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    qVar.f230929d = null;
                    qVar.f230932g = 0L;
                    qVar.f230936k = null;
                    c16547xe8ba10c23.f230679r = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q qVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q(c16547xe8ba10c23.f230676o, c16547xe8ba10c23.f230677p);
                qVar2.f230936k = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d(c16547xe8ba10c23);
                qVar2.f230932g = java.lang.System.currentTimeMillis();
                qVar2.f230935j = true;
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = qVar2.f230929d;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                qVar2.f230929d = p3325xe03a0797.p3326xc267989b.l.d(qVar2.f230928c, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.o(qVar2, null), 3, null);
                c16547xe8ba10c23.f230679r = qVar2;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImproveMMSightRecordButton", "startProgress but is enable, is cancel");
        }
        this.f230871f.setListener(null);
    }
}
