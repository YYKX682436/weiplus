package x44;

/* loaded from: classes4.dex */
public final class p1 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        boolean m69904xd1a8be83;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryContactState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.f66875xa013b0d5);
        if (f()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            m69904xd1a8be83 = false;
            if (Bi != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && (n17 = Bi.n(optString, true)) != null && n17.r2()) {
                m69904xd1a8be83 = true;
            }
        } else {
            m69904xd1a8be83 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69904xd1a8be83(optString);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isContact", m69904xd1a8be83);
        m(jSONObject);
        b(jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.Contact", "the contact state is " + m69904xd1a8be83);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryContactState");
    }
}
