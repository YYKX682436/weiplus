package md1;

/* loaded from: classes7.dex */
public class e0 extends md1.q0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72844x366c91de = 877;

    /* renamed from: NAME */
    public static final java.lang.String f72845x24728b = "hasJoinVoIPChat";

    @Override // md1.q0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", f72845x24728b);
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.D0(new md1.d0(this, c0Var, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "IFloatBallService is null");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("join", java.lang.Boolean.FALSE);
        c0Var.a(i17, p("ok", hashMap));
    }
}
