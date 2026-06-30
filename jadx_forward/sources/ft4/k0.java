package ft4;

/* loaded from: classes14.dex */
public final class k0 implements ft4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348176a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f) {
        this.f348176a = activityC19138xce65e38f;
    }

    @Override // ft4.a
    public void a(ft4.j itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click detail ");
        ft4.k kVar = itemData.f348165b;
        sb6.append(kVar.f348170b);
        sb6.append(' ');
        sb6.append(kVar.f348171c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348176a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 15, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", activityC19138xce65e38f.f261961d);
        int i17 = activityC19138xce65e38f.f261971q;
        if (i17 == 3) {
            ft4.u uVar = activityC19138xce65e38f.D;
            if (uVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                throw null;
            }
            intent.putExtra("key_from_date", uVar.f348233d);
            ft4.u uVar2 = activityC19138xce65e38f.D;
            if (uVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                throw null;
            }
            intent.putExtra("key_to_date", uVar2.f348234e);
        } else if (i17 != 2) {
            intent.putExtra("key_from_date", ((kVar.f348170b / 100) * 100) + 1);
            intent.putExtra("key_to_date", ((kVar.f348170b / 100) * 100) + 32);
        }
        intent.putExtra("key_select_type", activityC19138xce65e38f.f261970p);
        j45.l.j(activityC19138xce65e38f.mo55332x76847179(), "wallet_core", ".ui.ledger.WalletLedgerDayDetailUI", intent, null);
    }

    @Override // ft4.a
    public void b(dt4.u itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "click item " + itemData.f324825a + ' ' + itemData.f324826b + ' ' + itemData.f324827c);
        int i17 = itemData.f324827c > 0 ? 10 : 11;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348176a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", activityC19138xce65e38f.f261961d);
        intent.putExtra("key_username", itemData.f324826b);
        intent.putExtra("key_amount", itemData.f324827c);
        int i18 = activityC19138xce65e38f.f261971q;
        if (i18 == 3) {
            if (activityC19138xce65e38f.f261969o == 2) {
                ft4.u uVar = activityC19138xce65e38f.D;
                if (uVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                    throw null;
                }
                intent.putExtra("key_from_date", uVar.f348233d);
                ft4.u uVar2 = activityC19138xce65e38f.D;
                if (uVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
                    throw null;
                }
                intent.putExtra("key_to_date", uVar2.f348234e);
            } else {
                intent.putExtra("key_date", itemData.f324825a);
            }
        } else if (i18 == 2) {
            intent.putExtra("key_date", itemData.f324825a);
        } else if (activityC19138xce65e38f.f261969o == 2) {
            intent.putExtra("key_from_date", ((itemData.f324825a / 100) * 100) + 1);
            intent.putExtra("key_to_date", ((itemData.f324825a / 100) * 100) + 32);
        } else {
            intent.putExtra("key_date", itemData.f324825a);
        }
        intent.putExtra("key_select_type", activityC19138xce65e38f.f261970p);
        j45.l.j(activityC19138xce65e38f.mo55332x76847179(), "wallet_core", ".ui.ledger.WalletLedgerPersonUI", intent, null);
    }

    @Override // ft4.a
    public void c(ft4.j itemData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "click header ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f.U6(this.f348176a, itemData.f348165b.f348170b);
    }
}
