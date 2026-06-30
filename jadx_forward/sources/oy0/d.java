package oy0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final oy0.d f431370a = new oy0.d();

    public final void a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.k5 snsTemplateListData, android.content.Context context, yz5.a onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsTemplateListData, "snsTemplateListData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        java.lang.String str = snsTemplateListData.f151567k;
        if (str == null || str.length() == 0) {
            onClick.mo152xb9724478();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("kv_ai_permission", false)) {
            onClick.mo152xb9724478();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AITemplateUtils", "checkAITemplatePermission :" + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.m(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.hh_));
        android.widget.Button button = z2Var.f293601t;
        if (button != null) {
            com.p314xaae8f345.mm.ui.bk.s0(button.getPaint());
        }
        android.widget.Button button2 = z2Var.f293602u;
        if (button2 != null) {
            com.p314xaae8f345.mm.ui.bk.s0(button2.getPaint());
        }
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.dms);
        oy0.b bVar = new oy0.b(z2Var);
        oy0.c cVar = new oy0.c(z2Var, onClick);
        z2Var.D = bVar;
        z2Var.E = cVar;
        z2Var.C();
        b(1);
    }

    public final void b(int i17) {
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6709x9f81f895 c6709x9f81f895 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6709x9f81f895();
        c6709x9f81f895.f140501e = c6709x9f81f895.b("sessionid_", Bi, true);
        c6709x9f81f895.f140500d = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AITemplateUtils", "reportDialogAction sessionId:" + Bi + " action:" + i17);
        c6709x9f81f895.k();
    }
}
