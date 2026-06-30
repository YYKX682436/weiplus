package ss4;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public a(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g10 g10Var = new r45.g10();
        g10Var.f456331e = str;
        g10Var.f456332f = java.lang.System.currentTimeMillis();
        lVar.f152197a = g10Var;
        lVar.f152198b = new r45.h10();
        lVar.f152199c = "/cgi-bin/mmpay-bin/mktcheckmchservicepos";
        lVar.f152200d = 2553;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiCheckMchServicePos", "CgiCheckMchServicePos: %s", str);
    }
}
