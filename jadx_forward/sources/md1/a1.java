package md1;

/* loaded from: classes7.dex */
public class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72834x366c91de = 1444;

    /* renamed from: NAME */
    public static final java.lang.String f72835x24728b = "onVoIPChatCmdMsg";

    public a1() {
        si1.e.a(f72835x24728b);
    }

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OnVoIPChatCmdMsgEvent", "dispatch onVoipChatCmdMsgEvent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.d(c0Var.getF229341e(), map, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3) c0Var.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.t3.class));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OnVoIPChatCmdMsgEvent", "get native buffer ret: %s", d17.toString());
        if (d17 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.OK) {
            if (d17 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.v3.b(c0Var, yc1.p.f77526x24728b);
            }
        } else {
            java.lang.String jSONObject = new org.json.JSONObject(map).toString();
            u(c0Var);
            this.f163907f = jSONObject;
            m();
        }
    }
}
