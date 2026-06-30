package ft4;

/* loaded from: classes14.dex */
public final class t implements ft4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f f348227a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f) {
        this.f348227a = activityC19137x536ca21f;
    }

    @Override // ft4.a
    public void a(ft4.j itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
    }

    @Override // ft4.a
    public void b(dt4.u itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDayDetailUI", "click item " + itemData.f324825a + ' ' + itemData.f324826b + ' ' + itemData.f324827c);
        int i17 = itemData.f324827c > 0 ? 10 : 11;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f = this.f348227a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC19137x536ca21f.f261947e), java.lang.Integer.valueOf(activityC19137x536ca21f.f261948f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", activityC19137x536ca21f.f261946d);
        intent.putExtra("key_username", itemData.f324826b);
        intent.putExtra("key_amount", itemData.f324827c);
        intent.putExtra("key_date", itemData.f324825a);
        intent.putExtra("key_select_type", activityC19137x536ca21f.f261950h);
        j45.l.j(activityC19137x536ca21f.mo55332x76847179(), "wallet_core", ".ui.ledger.WalletLedgerPersonUI", intent, null);
    }

    @Override // ft4.a
    public void c(ft4.j itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
    }
}
