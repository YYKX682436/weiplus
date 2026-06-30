package x44;

/* loaded from: classes4.dex */
public final class t0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (env.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.OpenAuthManagementUI", "activity is null!!");
            b(g("activity is null!!"));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
            return;
        }
        m54.l b17 = env.b();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landig_pages_from_source", b17.l());
        intent.putExtra("sns_landing_pages_ux_info", a54.h.a(b17));
        java.lang.String j17 = b17.j();
        if (!(j17 == null || j17.length() == 0)) {
            intent.putExtra("sns_landing_pages_rawSnsId", b17.j());
        }
        j45.l.j(env.a(), "sns", ".ui.SnsAdLBSAuthManagerUI", intent, null);
        b(l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenAuthManagementUI");
    }
}
