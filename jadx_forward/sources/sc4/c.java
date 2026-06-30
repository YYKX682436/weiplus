package sc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final sc4.c f488093a = new sc4.c();

    public static final void a(sc4.c cVar, r45.jj4 jj4Var, r45.jj4 jj4Var2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        cVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        if (jj4Var == null || jj4Var2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        } else {
            r45.g96 g96Var = jj4Var.H1;
            java.lang.String str = g96Var != null ? g96Var.f456560d : null;
            if (str == null) {
                str = "";
            }
            r45.g96 g96Var2 = jj4Var2.H1;
            java.lang.String str2 = g96Var2 != null ? g96Var2.f456560d : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "checkClearOldVideo >> dbOldMediaCtx: " + str + "  newMediaCtx: " + str3);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str3)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "go to clear old video start mediaId: " + jj4Var.f459388d);
                java.util.Iterator it = t21.d3.o(jj4Var.f459388d).iterator();
                while (it.hasNext()) {
                    t21.v2 v2Var = (t21.v2) it.next();
                    java.lang.String str4 = v2Var.B;
                    boolean z17 = false;
                    if (str4 != null) {
                        if (str4.length() > 0) {
                            z17 = true;
                        }
                    }
                    if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v2Var.B, "xV2")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear old video >> " + v2Var.d());
                        dw3.c0.f325715a.j(v2Var.C);
                        t21.d3.e(v2Var.d());
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear finish >> costTime: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
    }
}
