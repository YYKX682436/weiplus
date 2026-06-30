package ek2;

/* loaded from: classes.dex */
public final class m0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335035u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.l0 f335036v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(long j17, byte[] bArr, java.lang.String str, long j18, int i17, java.util.List songInfoList, ek2.l0 l0Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoList, "songInfoList");
        this.f335035u = "Finder.CgiFinderLiveBatchGetMusicInfo";
        this.f335036v = l0Var;
        r45.fm1 fm1Var = new r45.fm1();
        fm1Var.set(1, db2.t4.f309704a.a(6887));
        fm1Var.set(6, java.lang.Long.valueOf(j17));
        fm1Var.set(5, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        fm1Var.set(2, str);
        fm1Var.set(7, java.lang.Long.valueOf(j18));
        fm1Var.set(4, java.lang.Integer.valueOf(i17));
        fm1Var.set(3, new java.util.LinkedList());
        fm1Var.set(8, new java.util.LinkedList(songInfoList));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fm1Var;
        r45.gm1 gm1Var = new r45.gm1();
        gm1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) gm1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = gm1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivebatchgetmusicinfo";
        lVar.f152200d = 6887;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveBatchGetMusicInfo init ");
        sb6.append(fm1Var.m75942xfb822ef2(6));
        sb6.append(',');
        sb6.append(fm1Var.m75945x2fec8307(2));
        sb6.append(',');
        sb6.append(fm1Var.m75939xb282bd08(4));
        sb6.append(",liveCookies is null:");
        sb6.append(fm1Var.m75934xbce7f2f(5) == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveBatchGetMusicInfo", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gm1 resp = (r45.gm1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f335035u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        ek2.l0 l0Var = this.f335036v;
        if (l0Var != null) {
            l0Var.a(i17, i18, str, resp);
        }
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "FinderLiveBatchGetMusicInfoResponse:" + pm0.b0.g(resp));
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }
}
