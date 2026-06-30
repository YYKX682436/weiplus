package ke2;

/* loaded from: classes.dex */
public final class m extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.LinkedList encryptedItems) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedItems, "encryptedItems");
        this.f388498t = "CgiFinderLiveDecrypt";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 24286;
        r45.oo1 oo1Var = new r45.oo1();
        oo1Var.set(2, encryptedItems);
        oo1Var.set(1, db2.t4.f309704a.a(24286));
        lVar.f152197a = oo1Var;
        lVar.f152198b = new r45.po1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivedecrypt";
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.po1 resp = (r45.po1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388498t, "decrypted_item_list:" + resp.m75941xfb821914(1));
    }
}
