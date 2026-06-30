package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class g2 extends i95.w implements wd0.n1 {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CHATTING_SEND_BUTTON_LIKE_IOS_REPORT_NEW_INT;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.m(u3Var, 0), 0)) {
            boolean n17 = gm0.j1.u().c().n(66832, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Boolean.valueOf(n17));
            hashMap.put("init_report", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
            gm0.j1.u().c().x(u3Var, 1);
        }
    }

    public void wi(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c c7010x69e1879c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c();
        c7010x69e1879c.f143232d = num != null ? num.intValue() : 0L;
        if (str == null) {
            str = "";
        }
        c7010x69e1879c.p(str);
        c7010x69e1879c.f143234f = num2 != null ? num2.intValue() : 0L;
        c7010x69e1879c.f143235g = num3 != null ? num3.intValue() : 0L;
        c7010x69e1879c.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c7010x69e1879c.g());
        java.lang.String n17 = c7010x69e1879c.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportFeatureService", "report%s %s", valueOf, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
    }
}
