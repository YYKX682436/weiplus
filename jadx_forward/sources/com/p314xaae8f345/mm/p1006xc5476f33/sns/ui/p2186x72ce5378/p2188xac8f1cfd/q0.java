package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class q0 {
    public q0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final android.view.View a(android.content.Context context, int i17) {
        android.view.View h3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (i17 == 10) {
            h3Var = new tc4.h3(context);
        } else if (i17 == 98) {
            h3Var = new n94.a(context);
        } else if (i17 == 100) {
            h3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18276x90e09c10(context);
        } else if (i17 == 12) {
            h3Var = new tc4.c(context);
        } else if (i17 != 13) {
            switch (i17) {
                case 0:
                    h3Var = new tc4.q3(context);
                    break;
                case 1:
                    h3Var = new tc4.s2(context);
                    break;
                case 2:
                    h3Var = new tc4.t3(context);
                    break;
                case 3:
                    h3Var = new tc4.k4(context);
                    break;
                case 4:
                    h3Var = new tc4.j3(context);
                    break;
                case 5:
                    h3Var = new tc4.n0(context);
                    break;
                case 6:
                    h3Var = new tc4.a0(context);
                    break;
                case 7:
                    h3Var = new tc4.r0(context);
                    break;
                case 8:
                    h3Var = new tc4.c3(context);
                    break;
                default:
                    h3Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2187x77cdc570.C18204xc21d6449(context);
                    break;
            }
        } else {
            h3Var = new tc4.b4(context);
        }
        yc4.s sVar = yc4.s.f542397a;
        int hashCode = h3Var.hashCode();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sVar.a(hashCode);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) yc4.s.f542398b.get(java.lang.Integer.valueOf(hashCode));
        if (c6898xf2e84d22 != null) {
            c6898xf2e84d22.f142146f = (int) currentTimeMillis2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        return h3Var;
    }

    public final java.lang.String b(zc4.b item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeYbRetouchReportStr", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList MediaObjList = item.n().h1().f39014x86965dde.f451373h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaObjList, "MediaObjList");
        int i17 = 0;
        for (java.lang.Object obj : MediaObjList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String YuanBaoTemplateId = ((r45.jj4) obj).I1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(YuanBaoTemplateId, "YuanBaoTemplateId");
            if (YuanBaoTemplateId.length() > 0) {
                if (sb6.length() > 0) {
                    sb6.append("_");
                }
                sb6.append(i17);
            }
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeYbRetouchReportStr", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$Companion");
        return sb7;
    }
}
