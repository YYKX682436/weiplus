package ys4;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        r45.sj5 sj5Var = new r45.sj5();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        sj5Var.f467316e = str2;
        sj5Var.f467317f = str3;
        sj5Var.f467315d = str;
        sj5Var.f467318g = str4;
        lVar.f152197a = sj5Var;
        lVar.f152198b = new r45.tj5();
        lVar.f152200d = 2752;
        lVar.f152199c = "/cgi-bin/mmpay-bin/tenpay/realnameverifysms";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRealnameVerifySms", "verify sms: %s, %s, reqkey: %s", str3, str2, str);
    }
}
