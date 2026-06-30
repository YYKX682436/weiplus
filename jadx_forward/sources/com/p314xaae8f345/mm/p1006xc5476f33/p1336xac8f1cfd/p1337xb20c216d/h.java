package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f178098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd f178099g;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13154xb3ef6cfd activityC13154xb3ef6cfd, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f178099g = activityC13154xb3ef6cfd;
        this.f178096d = list;
        this.f178097e = str;
        this.f178098f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String c17 = hx1.b.c(this.f178099g.f178003s);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c c11280xa65cf99c = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c();
        c11280xa65cf99c.m48460x4ab94e43(c17);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11280xa65cf99c;
        r45.gp0 gp0Var = this.f178099g.f178003s;
        c11286x34a5504.f33130x6942258 = gp0Var.f456937d;
        c11286x34a5504.f33121x993583fc = gp0Var.f456941f;
        c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(hx1.b.e(gp0Var));
        for (java.lang.String str : this.f178096d) {
            ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a5504, "", "", str, 3, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178097e)) {
                if (w11.t1.a(str)) {
                    w11.r1 a17 = w11.s1.a(str);
                    a17.g(str);
                    a17.e(this.f178097e);
                    a17.h(c01.e2.C(str));
                    a17.b();
                } else {
                    w11.r1 a18 = w11.s1.a(str);
                    a18.g(str);
                    a18.e(this.f178097e);
                    a18.h(c01.e2.C(str));
                    a18.f523664f = 0;
                    a18.f523667i = 4;
                    a18.a().a();
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.g(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f178098f);
    }

    /* renamed from: toString */
    public java.lang.String m54584x9616526c() {
        return super.toString() + "|onActivityResult2";
    }
}
