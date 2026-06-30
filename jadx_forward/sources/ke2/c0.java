package ke2;

/* loaded from: classes.dex */
public final class c0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388473t;

    public c0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        this.f388473t = "CgiFinderLivePurchaseContentList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 10988;
        r45.s91 s91Var = new r45.s91();
        s91Var.set(3, gVar);
        s91Var.set(1, db2.t4.f309704a.a(10988));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        s91Var.set(2, xy2.c.e(context));
        lVar.f152197a = s91Var;
        lVar.f152198b = new r45.t91();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetpurchasedcontentlist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLivePurchaseContentList", "last_buffer:" + s91Var.m75934xbce7f2f(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t91 resp = (r45.t91) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388473t, "purchased_count:" + resp.m75939xb282bd08(4) + ",continueFlag:" + resp.m75939xb282bd08(3));
    }
}
