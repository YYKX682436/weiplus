package md1;

/* loaded from: classes7.dex */
public class u0 extends md1.q0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72866x366c91de = 780;

    /* renamed from: NAME */
    public static final java.lang.String f72867x24728b = "subscribeVoIPMembers";

    public u0() {
        si1.e.a(f72867x24728b);
    }

    @Override // md1.q0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiSubscribeVoIPMembers", "hy: appId:" + c0Var.mo48798x74292566() + ", parmas:" + jSONObject.toString());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        md1.t0 t0Var = new md1.t0(this, c0Var, i17);
        p0Var.getClass();
        p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.k1(p0Var, t0Var, jSONObject));
    }
}
