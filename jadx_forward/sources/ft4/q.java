package ft4;

/* loaded from: classes14.dex */
public final class q extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f f348208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f) {
        super(false);
        this.f348208d = activityC19137x536ca21f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerDayDetailUI", "clickTypeBtnListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f = this.f348208d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 5, 2, java.lang.Integer.valueOf(activityC19137x536ca21f.f261947e), java.lang.Integer.valueOf(activityC19137x536ca21f.f261948f));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19137x536ca21f.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ft4.u1 u1Var = new ft4.u1(mo55332x76847179);
        activityC19137x536ca21f.f261951i = u1Var;
        u1Var.D(activityC19137x536ca21f.f261950h);
        ft4.u1 u1Var2 = activityC19137x536ca21f.f261951i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var2);
        ft4.s callback = activityC19137x536ca21f.f261960u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        u1Var2.R = callback;
        ft4.u1 u1Var3 = activityC19137x536ca21f.f261951i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var3);
        u1Var3.C();
    }
}
