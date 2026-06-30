package ft4;

/* loaded from: classes14.dex */
public final class a0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f) {
        super(false);
        this.f348112d = activityC19138xce65e38f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348112d;
        int i17 = activityC19138xce65e38f.f261969o;
        if (i17 == 1) {
            activityC19138xce65e38f.f261969o = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 13, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        } else if (i17 == 2) {
            activityC19138xce65e38f.f261969o = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 14, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        }
        activityC19138xce65e38f.Y6(activityC19138xce65e38f.f261969o);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click switch MODE_DAY:");
        sb6.append(activityC19138xce65e38f.f261969o == 1);
        sb6.append(" visible:");
        android.widget.LinearLayout linearLayout = activityC19138xce65e38f.f261979y;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
            throw null;
        }
        sb6.append(linearLayout.getVisibility() != 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", sb6.toString());
        android.widget.LinearLayout linearLayout2 = activityC19138xce65e38f.f261979y;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noTradeLayout");
            throw null;
        }
        if (linearLayout2.getVisibility() != 0) {
            activityC19138xce65e38f.X6(0);
        }
    }
}
