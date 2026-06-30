package ww1;

/* loaded from: classes2.dex */
public class q extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public q(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiVoiceOperateSwitchMch", "CgiSaveQrcodeNotifyMch request：op_type：%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g17 g17Var = new r45.g17();
        g17Var.f456362d = i17;
        g17Var.f456363e = j17;
        lVar.f152197a = g17Var;
        lVar.f152198b = new r45.h17();
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtoprecvvoice";
        lVar.f152200d = 4997;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }
}
