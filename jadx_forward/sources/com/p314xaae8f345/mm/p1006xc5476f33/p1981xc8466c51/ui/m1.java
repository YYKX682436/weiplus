package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes9.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f236986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 f236987g;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f236987g = activityC16969x3ace7680;
        this.f236984d = list;
        this.f236985e = str;
        this.f236986f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16969x3ace7680 activityC16969x3ace7680 = this.f236987g;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(bt3.g2.t(activityC16969x3ace7680.f236833v, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, 1));
        for (java.lang.String str : this.f236984d) {
            if (r6Var.m()) {
                java.lang.String U6 = activityC16969x3ace7680.U6();
                r6Var.o();
                if (activityC16969x3ace7680.T6() == 15) {
                    tg3.a1 a17 = tg3.t1.a();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16969x3ace7680.mo55332x76847179();
                    java.lang.String o17 = r6Var.o();
                    r45.gp0 gp0Var = activityC16969x3ace7680.f236833v;
                    ((dk5.s5) a17).nj(mo55332x76847179, str, o17, U6, 62, gp0Var.f456981y, false, false, "", gp0Var.f456964q2);
                } else {
                    tg3.a1 a18 = tg3.t1.a();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16969x3ace7680.mo55332x76847179();
                    java.lang.String o18 = r6Var.o();
                    r45.gp0 gp0Var2 = activityC16969x3ace7680.f236833v;
                    ((dk5.s5) a18).nj(mo55332x768471792, str, o18, U6, 1, gp0Var2.f456981y, false, false, "", gp0Var2.f456964q2);
                }
            } else {
                java.lang.String str2 = activityC16969x3ace7680.f236833v.A;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9 c11298x4d56d1f9 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11298x4d56d1f9();
                    c11298x4d56d1f9.f33238x44a0a2f4 = str2;
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(c11298x4d56d1f9);
                    java.lang.String str3 = activityC16969x3ace7680.f236833v.f456937d;
                    java.lang.String string = activityC16969x3ace7680.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy);
                    if (str3 == null) {
                        str3 = string;
                    }
                    c11286x34a5504.f33122xe4128443 = c11298x4d56d1f9;
                    c11286x34a5504.f33130x6942258 = str3;
                    r45.gp0 gp0Var3 = activityC16969x3ace7680.f236833v;
                    c11286x34a5504.f33121x993583fc = gp0Var3.f456941f;
                    byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(bt3.g2.H(gp0Var3, activityC16969x3ace7680.f236831t, activityC16969x3ace7680.f236830s, 1));
                    c11286x34a5504.f33128x4f3b3aa0 = x17;
                    if (x17 == null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(c01.d9.b().e());
                        sb6.append("web/");
                        java.lang.String str4 = activityC16969x3ace7680.f236833v.G;
                        if (str4 == null) {
                            str4 = "";
                        }
                        sb6.append(kk.k.g(str4.getBytes()));
                        c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(sb6.toString());
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, "", "", str, 3, null);
                }
            }
            ((dk5.s5) tg3.t1.a()).Ui(this.f236985e, str);
        }
        activityC16969x3ace7680.b7(2, 7);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f236986f);
    }

    /* renamed from: toString */
    public java.lang.String m67875x9616526c() {
        return super.toString() + "|onActivityResult1";
    }
}
