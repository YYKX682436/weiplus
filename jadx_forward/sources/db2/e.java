package db2;

/* loaded from: classes.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f309483t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f309484u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, int i18, java.util.List feedIdList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIdList, "feedIdList");
        this.f309483t = i18;
        this.f309484u = feedIdList;
        r45.sw0 sw0Var = new r45.sw0();
        sw0Var.set(1, gVar);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(feedIdList);
        sw0Var.set(2, linkedList);
        sw0Var.set(8, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiCheckPrefetch", "initCommReqResp: checkType=" + i17 + ", tabType=" + i18 + ", feedIds=" + kz5.n0.g0(feedIdList, ";", null, null, 0, null, db2.b.f309437d, 30, null) + ", lastBuffer=" + gVar);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        sw0Var.set(9, db2.t4.f309704a.n());
        lVar.f152197a = sw0Var;
        r45.tw0 tw0Var = new r45.tw0();
        tw0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) tw0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = tw0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercheckprefetch";
        lVar.f152200d = 6658;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tw0 resp = (r45.tw0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiCheckPrefetch", "onCgiEnd: errType " + i17 + ", errCode " + i18 + ", errMsg " + str + ", tabType = " + this.f309483t + ", requestFeedIds:" + kz5.n0.g0(this.f309484u, ";", null, null, 0, null, null, 62, null));
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCheck_result(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            if (((r45.e20) obj).m75942xfb822ef2(1) != 0) {
                arrayList.add(obj);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiCheckPrefetch", "onCgiEnd: spamFeedSize = " + arrayList.size() + ", spamFeedIds = [" + kz5.n0.g0(arrayList, ";", null, null, 0, null, db2.c.f309446d, 30, null) + ']');
        pm0.v.V(100L, new db2.d(arrayList, this));
    }
}
