package i61;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public c(int i17, int i18, int i19, java.lang.String str, int i27, int i28, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.e0 e0Var = new r45.e0();
        e0Var.f454412d = i17;
        e0Var.f454413e = i18;
        e0Var.f454414f = i19;
        e0Var.f454415g = str;
        e0Var.f454416h = i27;
        e0Var.f454417i = i28;
        e0Var.f454418m = str2;
        lVar.f152197a = e0Var;
        lVar.f152198b = new r45.f0();
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaquerylist";
        lVar.f152200d = 1676;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2);
    }

    public c(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.e0 e0Var = new r45.e0();
        e0Var.f454412d = i17;
        e0Var.f454413e = i18;
        e0Var.f454414f = i19;
        lVar.f152197a = e0Var;
        lVar.f152198b = new r45.f0();
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaquerylist";
        lVar.f152200d = 1676;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }
}
