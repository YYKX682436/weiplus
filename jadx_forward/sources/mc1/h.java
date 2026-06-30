package mc1;

/* loaded from: classes7.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72824x366c91de = 1039;

    /* renamed from: NAME */
    public static final java.lang.String f72825x24728b = "getGameLivePermission";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (!java.lang.Boolean.valueOf(ti1.c.a(c0Var.t3())).booleanValue()) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeNotPermitted, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetGameLivePermission", "not permitted");
            return;
        }
        if (((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(c0Var.mo48798x74292566(), c0Var.t3().u0().f158814g).booleanValue()) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeIsLiving, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetGameLivePermission", "is Living");
            return;
        }
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.T) {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeVoipConflict, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetGameLivePermission", "is voIPTalking");
        } else if (tb1.b.f498422a.a().length <= 0) {
            C(c0Var, 1, mc1.g.GameLiveStatusErrCodeNormal, i17);
        } else {
            C(c0Var, 0, mc1.g.GameLiveStatusErrCodeCameraConfict, i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetGameLivePermission", "is Camera Capturing");
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, mc1.g gVar, int i18) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        hashMap.put("errCode", java.lang.Integer.valueOf(gVar.f407140d));
        c0Var.a(i18, p("ok", hashMap));
    }
}
