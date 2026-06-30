package md1;

/* loaded from: classes7.dex */
public class n0 extends md1.s {

    /* renamed from: CTRL_INDEX */
    public static final int f72856x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f72857x24728b = "join1v1VoIPChat";

    public n0() {
        si1.e.a(f72857x24728b);
    }

    @Override // md1.s, md1.q0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        fb1.c ec6 = fb1.e.f342369e.ec(fb1.d.f342365g, false, new md1.f0(this, c0Var));
        if (ec6 instanceof fb1.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "can not join voip chat now, message:%s", ((fb1.a) ec6).f342360a);
            java.util.HashMap hashMap = new java.util.HashMap();
            C(hashMap, D(-10086, -7));
            c0Var.a(i17, p(java.lang.String.format("fail: %d, %d, can not join voip chat now", -10086, -7), hashMap));
            return;
        }
        this.f407332v = c0Var.mo48798x74292566();
        I(c0Var);
        fw1.b G = G(c0Var, jSONObject);
        if (G == null) {
            c0Var.a(i17, o("fail: param error!"));
            this.f407335y = false;
            return;
        }
        G.f348582c = "wx766655dab8fe851b";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: appId:" + this.f407332v + ", data:" + jSONObject.toString());
        this.f407334x = 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f407333w = android.os.SystemClock.elapsedRealtime();
        md1.j1 b17 = md1.j1.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f407318g;
        int i18 = this.f407319h;
        b17.f407284a = v5Var;
        b17.f407285b = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "init, roomType:%d", java.lang.Integer.valueOf(i18));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        md1.g0 g0Var = new md1.g0(this, G, c0Var, i17);
        md1.h0 h0Var = new md1.h0(this, c0Var, G);
        md1.i0 i0Var = new md1.i0(this, c0Var);
        md1.j0 j0Var = new md1.j0(this, c0Var);
        md1.k0 k0Var = new md1.k0(this, c0Var);
        md1.l0 l0Var = new md1.l0(this, c0Var);
        md1.m0 m0Var = new md1.m0(this, c0Var);
        p0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "jd: trigger join room. %s, %s, %d, %d, %d", G.f348581b, G.f348582c, java.lang.Long.valueOf(G.f348594o), java.lang.Integer.valueOf(G.f348580a), java.lang.Integer.valueOf(G.f348587h));
        p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.c2(p0Var, G, g0Var, h0Var, i0Var, j0Var, k0Var, l0Var, m0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: JsApiJoin1v1VoIPChat callbackId:" + i17);
    }
}
