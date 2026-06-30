package ft4;

/* loaded from: classes14.dex */
public final class x extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f f348258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f) {
        super(false);
        this.f348258d = activityC19138xce65e38f;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "clickTypeBtnListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f = this.f348258d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 2, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        ft4.u1 u1Var = activityC19138xce65e38f.f261972r;
        if (u1Var != null) {
            u1Var.B();
            activityC19138xce65e38f.f261972r = null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19138xce65e38f.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ft4.u1 u1Var2 = new ft4.u1(mo55332x76847179);
        activityC19138xce65e38f.f261972r = u1Var2;
        u1Var2.D(activityC19138xce65e38f.f261970p);
        ft4.u1 u1Var3 = activityC19138xce65e38f.f261972r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var3);
        ft4.h0 callback = activityC19138xce65e38f.F;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        u1Var3.R = callback;
        ft4.u1 u1Var4 = activityC19138xce65e38f.f261972r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var4);
        u1Var4.C();
    }
}
