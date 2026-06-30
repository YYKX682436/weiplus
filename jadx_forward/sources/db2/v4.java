package db2;

/* loaded from: classes2.dex */
public final class v4 extends az2.j {
    public v4(java.lang.String str) {
        super(null, null, 3, null);
        bw5.qe qeVar = new bw5.qe();
        bw5.sc scVar = new bw5.sc();
        scVar.mo11468x92b714fd(db2.t4.f309704a.b(14246, this.f97668n).mo14344x5f01b1f6());
        qeVar.f113589d = scVar;
        boolean[] zArr = qeVar.f113591f;
        zArr[2] = true;
        qeVar.f113590e = str == null ? "" : str;
        zArr[3] = true;
        bw5.re reVar = new bw5.re();
        reVar.f76492x92037252 = new r45.ie();
        reVar.f114032d[1] = true;
        r45.ie mo11484xe92ab0a8 = reVar.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qeVar;
        lVar.f152198b = reVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdeloftenreadauthor";
        lVar.f152200d = 21880;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DelOftenReadAuthorReqCgi", "[init] request=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i00.a(qeVar) + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        bw5.re resp = (bw5.re) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DelOftenReadAuthorReqCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ", resp=" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i00.a(resp));
    }
}
