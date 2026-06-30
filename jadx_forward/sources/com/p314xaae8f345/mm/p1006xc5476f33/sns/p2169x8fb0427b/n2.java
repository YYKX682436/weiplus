package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n2 f247612a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n2();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanLocalResource", "com.tencent.mm.plugin.sns.storage.SnsResourceManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String t07 = ca4.z0.t0(info.f68891x29d1292e);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = info.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        for (r45.jj4 jj4Var : qa4.f.a(m70371x485d7)) {
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
            ot5.g.c("MicroMsg.SnsResourceManager", "snsIdStr:" + t07 + " clean media:" + jj4Var.f459388d);
            int i17 = jj4Var.f459389e;
            if (i17 == 2) {
                java.lang.String str = d17 + ca4.z0.U(jj4Var);
                java.lang.String str2 = d17 + ca4.z0.J(jj4Var);
                java.lang.String str3 = d17 + ca4.z0.W(jj4Var);
                java.lang.String str4 = d17 + ca4.z0.a0(jj4Var);
                dw3.c0 c0Var = dw3.c0.f325715a;
                c0Var.j(str);
                c0Var.j(str2);
                c0Var.j(str3);
                c0Var.j(str4);
            } else if (i17 == 4 || i17 == 6) {
                java.lang.String U = ca4.z0.U(jj4Var);
                dw3.c0.f325715a.j(d17 + U);
                java.util.Iterator it = t21.d3.o(jj4Var.f459388d).iterator();
                while (it.hasNext()) {
                    t21.v2 v2Var = (t21.v2) it.next();
                    dw3.c0.f325715a.j(v2Var.C);
                    t21.d3.e(v2Var.d());
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanLocalResource", "com.tencent.mm.plugin.sns.storage.SnsResourceManager");
    }
}
