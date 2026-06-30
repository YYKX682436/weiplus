package ss4;

/* loaded from: classes2.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public c(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.nr6 nr6Var = new r45.nr6();
        nr6Var.f463165e = str;
        nr6Var.f463166f = java.lang.System.currentTimeMillis();
        lVar.f152197a = nr6Var;
        lVar.f152198b = new r45.or6();
        lVar.f152199c = "/cgi-bin/mmpay-bin/mktuncheckmchservicepos";
        lVar.f152200d = 2595;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiUnCheckMchServicePos", "CgiUnCheckMchServicePos: %s", str);
    }
}
