package db2;

/* loaded from: classes.dex */
public final class d0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309473t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i17, java.lang.String contentId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentId, "contentId");
        this.f309473t = "Finder.CgiFinderDeletePurchasedContent";
        r45.h11 h11Var = new r45.h11();
        h11Var.set(1, db2.t4.f309704a.b(6662, this.f97668n));
        h11Var.set(2, java.lang.Integer.valueOf(i17));
        h11Var.set(3, contentId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = h11Var;
        r45.i11 i11Var = new r45.i11();
        i11Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) i11Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = i11Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdeletepurchasedcontent";
        lVar.f152200d = 9480;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderDeletePurchasedContent", "init " + h11Var.m75939xb282bd08(2) + ',' + h11Var.m75945x2fec8307(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.i11 resp = (r45.i11) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309473t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
