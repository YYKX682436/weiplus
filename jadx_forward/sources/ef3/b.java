package ef3;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public b(int i17, int i18, int i19, int i27) {
        r45.xk3 xk3Var = new r45.xk3();
        xk3Var.f471712d = i17;
        xk3Var.f471713e = i18;
        xk3Var.f471714f = i19;
        xk3Var.f471715g = i27;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = xk3Var;
        lVar.f152198b = new r45.yk3();
        lVar.f152200d = 2680;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpayfunctionswitchlist";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 1;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetPayFunctionSwitchList", "TpaCountry: %s", java.lang.Integer.valueOf(i17));
    }
}
