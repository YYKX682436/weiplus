package db2;

/* loaded from: classes2.dex */
public final class n1 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.u6 u6Var = new bw5.u6();
        u6Var.f115275d = finderUsername;
        boolean[] zArr = u6Var.f115280i;
        zArr[2] = true;
        u6Var.f115277f = gVar;
        zArr[4] = true;
        u6Var.f115278g = str == null ? "" : str;
        zArr[5] = true;
        u6Var.f115279h = str2;
        zArr[6] = true;
        lVar.f152197a = u6Var;
        bw5.v6 v6Var = new bw5.v6();
        v6Var.f76492x92037252 = new r45.ie();
        v6Var.f115697g[1] = true;
        r45.ie mo11484xe92ab0a8 = v6Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = v6Var;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getfinderhomepageproducttab";
        lVar.f152200d = 21912;
        p(lVar.a());
    }
}
