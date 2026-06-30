package mc1;

/* loaded from: classes7.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72830x366c91de = 1077;

    /* renamed from: NAME */
    public static final java.lang.String f72831x24728b = "shareInvitationToLiveRoom";

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f407144g = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareInvitationToLiveRoom", "invoke jsapi");
        if (!f407144g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiShareInvitationToLiveRoom", "enableInvoke is false");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
            return;
        }
        f407144g = false;
        ((ku5.t0) ku5.t0.f394148d).k(new mc1.RunnableC29139x31a3f5(), 300L);
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        android.content.Context context = c0Var.mo50352x76847179();
        java.lang.String appId = c0Var.mo48798x74292566();
        int i18 = c0Var.t3().u0().f158814g;
        mc1.C29140x31a3f6 c29140x31a3f6 = new mc1.C29140x31a3f6(this, c0Var, i17);
        h63.v0 v0Var = (h63.v0) r1Var;
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i18).booleanValue()) {
            ((ku5.t0) ku5.t0.f394148d).B(new h63.q0(v0Var, context, jSONObject, appId, i18, c29140x31a3f6));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAppbrandProcessService", "startPlayGameAnchorSetting failed, not gameliving");
        }
    }
}
