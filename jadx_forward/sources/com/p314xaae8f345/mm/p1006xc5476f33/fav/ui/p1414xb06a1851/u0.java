package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 f182333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182335f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var, java.lang.String str) {
        this.f182335f = activityC13591xdaafa82c;
        this.f182333d = a1Var;
        this.f182334e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = this.f182333d;
        r45.gp0 gp0Var = a1Var.f182216a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = this.f182335f;
        android.graphics.Bitmap g17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.g(gp0Var, activityC13591xdaafa82c.f182160o, true);
        if (g17 == null) {
            g17 = activityC13591xdaafa82c.a7(a1Var.f182216a);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.t0(this, g17));
    }
}
