package ys4;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public b(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        r45.yj5 yj5Var = new r45.yj5();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        yj5Var.f472688d = str;
        yj5Var.f472689e = str2;
        yj5Var.f472690f = i17;
        yj5Var.f472691g = str3;
        lVar.f152197a = yj5Var;
        lVar.f152198b = new r45.pj5();
        lVar.f152200d = 1923;
        lVar.f152199c = "/cgi-bin/mmpay-bin/tenpay/realnamesendsms";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRealnameSendSms", "send sms: %s, %s, isRetry: %s", str2, str, java.lang.Integer.valueOf(i17));
    }
}
