package ft4;

/* loaded from: classes14.dex */
public final class a1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c f348113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c) {
        super(false);
        this.f348113d = activityC19139x26e1e89c;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "clickTypeBtnListener");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348113d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 4, 2, java.lang.Integer.valueOf(activityC19139x26e1e89c.f261983f), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261984g));
        ft4.u1 u1Var = activityC19139x26e1e89c.f261989o;
        if (u1Var != null) {
            u1Var.B();
            activityC19139x26e1e89c.f261989o = null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19139x26e1e89c.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        ft4.u1 u1Var2 = new ft4.u1(mo55332x76847179);
        activityC19139x26e1e89c.f261989o = u1Var2;
        u1Var2.D(activityC19139x26e1e89c.f261987m);
        ft4.u1 u1Var3 = activityC19139x26e1e89c.f261989o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var3);
        ft4.d1 callback = activityC19139x26e1e89c.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        u1Var3.R = callback;
        ft4.u1 u1Var4 = activityC19139x26e1e89c.f261989o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u1Var4);
        u1Var4.C();
    }
}
