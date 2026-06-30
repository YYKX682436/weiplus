package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f232487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232488e;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232488e = activityC16662x5873ebce;
        this.f232487d = activityC16662x5873ebce.f232437g.intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f232487d + 100;
        this.f232487d = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232488e;
        if (i17 >= activityC16662x5873ebce.f232451x) {
            wu5.c cVar = activityC16662x5873ebce.A;
            if (cVar != null) {
                cVar.cancel(true);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.a0 a0Var = activityC16662x5873ebce.f232436f;
        if (a0Var != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.x(a0Var, i17));
        }
    }
}
