package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f230891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f230892e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908, boolean z17) {
        this.f230891d = c16548x9f1d7908;
        this.f230892e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("match max progress to play reverse ani, ani end ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f230891d;
        sb6.append(c16548x9f1d7908.f230695u);
        sb6.append(", ");
        sb6.append(c16548x9f1d7908.f230680J);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", sb6.toString());
        if (!c16548x9f1d7908.f230680J) {
            c16548x9f1d7908.f230695u = false;
            return;
        }
        if (!c16548x9f1d7908.f230695u) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u3 u3Var = c16548x9f1d7908.f230690p;
            if (u3Var != null) {
                ((yt3.v2) u3Var).a();
                return;
            }
            return;
        }
        c16548x9f1d7908.f230695u = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b2 b2Var = c16548x9f1d7908.F;
        if (b2Var != null) {
            b2Var.a(this.f230892e);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "match max progress to play reverse ani, ani start");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908.L;
        this.f230891d.e();
    }
}
