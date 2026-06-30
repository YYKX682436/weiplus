package md1;

/* loaded from: classes7.dex */
public abstract class m1 {
    public static void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "closeFloatBall, appId is empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:closeFloatBall, appId:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e();
        xf1.a aVar = c12295xd16fc59e.f165456g;
        aVar.f535755a = str;
        aVar.f535756b = 16;
        aVar.f535757c = 2;
        c12295xd16fc59e.e();
    }

    public static boolean b() {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, is1v1:%s", java.lang.Boolean.valueOf(p0Var.U));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (!p0Var.T) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, voip is stopped");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, stop voip talking");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.j(new md1.l1(), dz.k.ReasonWeappStopFromPassiveFloatBall);
        return true;
    }

    public static void c(java.lang.String str) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:showFloatBall, appId:%s, is1v1:%s", str, java.lang.Boolean.valueOf(p0Var.U));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (p0Var.T || ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e();
            xf1.a aVar = c12295xd16fc59e.f165456g;
            aVar.f535755a = str;
            aVar.f535756b = 16;
            aVar.f535757c = 1;
            c12295xd16fc59e.e();
        }
    }
}
