package md1;

/* loaded from: classes7.dex */
public class c0 extends md1.q0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72838x366c91de = 521;

    /* renamed from: NAME */
    public static final java.lang.String f72839x24728b = "updateVoIPChatMuteConfig";

    /* renamed from: i, reason: collision with root package name */
    public boolean f407255i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f407256m = false;

    public c0() {
        si1.e.a(f72839x24728b);
    }

    @Override // md1.q0
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        try {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("muteConfig");
            boolean z17 = jSONObject2.getBoolean("muteMicrophone");
            boolean z18 = jSONObject2.getBoolean("muteEarphone");
            boolean optBoolean = jSONObject.optBoolean("handsFree", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "hy: muteMicroPhone:%b, muteEarPhone:%b, handsFree:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(optBoolean));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", "invokeImp data:%s", jSONObject);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
            p0Var.s(z18, new md1.y(this, c0Var, i17));
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.t(z17, new md1.a0(this, z17, c0Var, i17));
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.r(optBoolean, new md1.b0(this));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoice.JsApiCloudVoiceUpdateVoIPChatMuteConfig", e17, "", new java.lang.Object[0]);
        }
    }
}
