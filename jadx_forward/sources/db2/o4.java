package db2;

/* loaded from: classes.dex */
public final class o4 extends bq.e {
    public o4(r45.qt2 qt2Var, java.lang.String str) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.vj2 vj2Var = new r45.vj2();
        vj2Var.set(1, db2.t4.f309704a.b(19699, qt2Var));
        if (str != null) {
            java.lang.String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                vj2Var.set(2, str2);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init nextPageBuffer=");
        sb6.append(str);
        sb6.append(" hasContextObj=");
        sb6.append(qt2Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiNativeDramaStreamRecommend", sb6.toString());
        lVar.f152197a = vj2Var;
        r45.wj2 wj2Var = new r45.wj2();
        wj2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) wj2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = wj2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findernativedramastreamrecommend";
        lVar.f152200d = 19699;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiNativeDramaStreamRecommend", "CgiNativeDramaStreamRecommend nextPageBuffer " + str);
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.wj2 resp = (r45.wj2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiNativeDramaStreamRecommend", "processCgiResult errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", itemCount=" + resp.m75941xfb821914(1).size() + " nextPageBuffer " + resp.m75945x2fec8307(2));
    }
}
