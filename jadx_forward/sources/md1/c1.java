package md1;

/* loaded from: classes7.dex */
public class c1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72840x366c91de = 520;

    /* renamed from: NAME */
    public static final java.lang.String f72841x24728b = "onVoIPChatInterrupted";

    public c1() {
        si1.e.a(f72841x24728b);
    }

    public void x(dz.k kVar) {
        md1.b1 b1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OnVoIPChatInterruptedJsEvent", "hy: dispath reason: %s", kVar);
        java.util.HashMap hashMap = new java.util.HashMap(2);
        switch (kVar) {
            case ReasonInterrupted:
                b1Var = new md1.b1(this, "call interrupted due to native reason", -1000);
                break;
            case ReasonManual:
                b1Var = new md1.b1(this, "user manually exit the call", -1000);
                break;
            case ReasonDevice:
                b1Var = new md1.b1(this, "device start failed", -1000);
                break;
            case ReasonInCommingCall:
                b1Var = new md1.b1(this, "in comming call", -2);
                break;
            case ReasonSessionUpdateFailed:
                b1Var = new md1.b1(this, "session update failed", -1000);
                break;
            case ReasonWeappEnterBackground:
                b1Var = new md1.b1(this, "current mini app entered background", -1);
                break;
            case ReasonWeappStopFromPassiveFloatBall:
                b1Var = new md1.b1(this, "call interrupted due to close passive float ball", -3);
                break;
            default:
                b1Var = new md1.b1(this, "unknown reason", -1000);
                break;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = b1Var.f407253a;
        sb6.append(str);
        sb6.append(", room id: ");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.Y);
        hashMap.put("errMsg", sb6.toString());
        hashMap.put("errCode", java.lang.Integer.valueOf(b1Var.f407254b));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str);
        t(hashMap);
        m();
    }
}
