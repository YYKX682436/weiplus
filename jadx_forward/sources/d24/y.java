package d24;

/* loaded from: classes11.dex */
public final class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307505d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1) {
        this.f307505d = c17513xe6a0fae1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307505d;
        android.widget.CheckBox checkBox = c17513xe6a0fae1.f243399y;
        if (checkBox != null) {
            if (checkBox != null && checkBox.isChecked()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "push notify mode exit");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(99L, 143L, 1L, false);
                g0Var.d(11545, java.lang.Integer.valueOf(c17513xe6a0fae1.f243394t));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
                o4Var.getClass();
                o4Var.putBoolean("is_in_notify_mode", true).commit();
                c17513xe6a0fae1.C7(false);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "normally exit");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var2.mo68477x336bdfd8(99L, 144L, 1L, false);
        g0Var2.d(11545, java.lang.Integer.valueOf(c17513xe6a0fae1.f243395u));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
        if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
            gm0.j1.d().f152297d.C(false);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
        c17513xe6a0fae1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSettingItem", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
        if (!gm0.j1.b().t() || c01.z1.x()) {
            c17513xe6a0fae1.E7();
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        d24.n nVar = new d24.n(c17513xe6a0fae1);
        c17513xe6a0fae1.A = nVar;
        d17.a(281, nVar);
        de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
        gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) wi6);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new d24.o(wi6, c17513xe6a0fae1), false);
        c17513xe6a0fae1.f243400z = b4Var;
        b4Var.c(5000L, 5000L);
        c17513xe6a0fae1.B = db5.e1.Q(c17513xe6a0fae1.m80379x76847179(), c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l7z), true, true, new d24.p(wi6, c17513xe6a0fae1));
    }
}
