package b04;

/* loaded from: classes5.dex */
public final class j0 extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f98448d;

    /* renamed from: e, reason: collision with root package name */
    public al5.s0 f98449e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f98450f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98451g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f98452h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f98453i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f98452h = jz5.h.b(new b04.h0(this));
        this.f98453i = jz5.h.b(b04.a0.f98409d);
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f98452h).mo141623x754a37bb()).intValue();
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "reportBackDialogAction: action=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(37640, java.lang.String.valueOf(i17));
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185(m80379x76847179(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f400799d = com.p314xaae8f345.mm.R.raw.f80107x47781f6f;
        aVar.f400800e = c22675xc8629185.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        java.lang.String string = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nlh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        aVar.f400801f = string;
        java.lang.String string2 = c22675xc8629185.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        aVar.f400802g = string2;
        aVar.f400805m = true;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f388183o, aVar, T6(), null);
        kd0.i2 i2Var = (kd0.i2) i95.n0.c(kd0.i2.class);
        kd0.g3 g3Var = kd0.g3.f388184p;
        int T6 = T6();
        b04.d0 d0Var = new b04.d0(this, c22675xc8629185);
        ((hs.d0) i2Var).getClass();
        aVar.f400806n = new hs.c0(g3Var, aVar, T6, d0Var);
        aVar.f400804i = new b04.g0(c22675xc8629185, this);
        c22675xc8629185.m48330xfcfee142(aVar);
        return c22675xc8629185;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (this.f98451g) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f98453i).mo141623x754a37bb();
            if (!(o4Var != null ? o4Var.getBoolean("back_dialog_shown", false) : false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "showBackConfirmDialog: show exit dialog");
                U6(1);
                db5.e1.E(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkv), "", m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, new b04.i0(this));
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "onBackPressed: dialog already shown, execute default back");
        return super.mo2274xbdc3c5dc();
    }
}
