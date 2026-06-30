package mr2;

/* loaded from: classes.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f412379t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String orderId) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderId, "orderId");
        this.f412379t = "Finder.CgiFinderLiveEcCustomerGetOrderInfo";
        r45.kg0 kg0Var = new r45.kg0();
        kg0Var.set(1, orderId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = kg0Var;
        r45.lg0 lg0Var = new r45.lg0();
        lg0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lg0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = lg0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/eccustomergetorderinfo";
        lVar.f152200d = 10063;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveEcCustomerGetOrderInfo", "init CgiFinderLiveEcCustomerGetOrderInfo");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.lg0 resp = (r45.lg0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f412379t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
