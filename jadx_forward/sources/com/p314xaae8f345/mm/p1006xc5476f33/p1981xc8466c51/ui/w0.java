package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f237125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f237126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f237127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f237128g;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f237128g = activityC16969x3ace7680;
        this.f237125d = list;
        this.f237126e = str;
        this.f237127f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f237128g;
        java.lang.String t17 = bt3.g2.t(activityC16969x3ace7680.f236833v, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, 1);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c();
        c11280xa65cf99c.m48460x4ab94e43(t17);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11280xa65cf99c;
        r45.gp0 gp0Var = activityC16969x3ace7680.f236833v;
        c11286x34a5504.f33130x6942258 = gp0Var.f456937d;
        c11286x34a5504.f33121x993583fc = gp0Var.f456941f;
        c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(bt3.g2.H(gp0Var, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, 1));
        for (java.lang.String str : this.f237125d) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, "", "", str, 3, null);
            ((dk5.s5) tg3.t1.a()).Ui(this.f237126e, str);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f237127f);
    }

    /* renamed from: toString */
    public java.lang.String m67882x9616526c() {
        return super.toString() + "|onActivityResult2";
    }
}
