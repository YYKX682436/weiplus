package x44;

/* loaded from: classes4.dex */
public final class o1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        long optLong = data.optLong(dm.i4.f66865x76d1ec5a, 0L);
        boolean z17 = false;
        int optInt = data.optInt("opType", 0);
        if (optLong <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OperateDownloadTask", "the download id is invalid");
            b(g("the download id is invalid"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OperateDownloadTask", "activity is null !!");
            b(g("activity is null !!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            return;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
        if (optInt == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(a17)) {
                if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFreeSimCard", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
                    if (m69779x9cf0d20b != null && m69779x9cf0d20b.m69908x2290b4f1()) {
                        z17 = true;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFreeSimCard", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    if (!z17) {
                        ((ku5.t0) ku5.t0.f394148d).B(new x44.n1(a17, this, optLong, i17));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
                    }
                }
                p(optLong, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdJs.OperateDownloadTask", "there is no network now");
                b(w44.d.k(this, -1, "there is no network now", null, 4, null));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resumeTask", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            }
        } else if (optInt == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pause", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            if (i17.o(optLong)) {
                b(l());
            } else {
                b(w44.d.k(this, -1, "pause error", null, 4, null));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pause", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        } else if (optInt != 2) {
            b(g("no op type!!!"));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("remove", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
            i17.t(optLong);
            b(l());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remove", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
    }

    public final void p(long j17, vz.s1 s1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
        x44.n nVar = x44.n.f533392d;
        w44.b d17 = d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnEvent", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        nVar.j(j17, new x44.e3(d17.f524428e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0) s1Var;
        boolean w17 = r0Var.w(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 p17 = r0Var.p(j17);
        yb0.a aVar = yb0.a.f542145a;
        java.lang.String str = p17 != null ? p17.f178495e : null;
        if (str == null) {
            str = "";
        }
        java.lang.String m17 = d().b().m();
        aVar.a(str, m17 != null ? m17 : "");
        if (w17) {
            b(l());
        } else {
            b(w44.d.k(this, -1, "resume error", null, 4, null));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resume", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OperateDownloadTask");
    }
}
