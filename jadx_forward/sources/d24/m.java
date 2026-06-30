package d24;

/* loaded from: classes11.dex */
public final class m implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d f307478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f307479b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d c17512x6b00b84d, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f307478a = c17512x6b00b84d;
        this.f307479b = z2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d c17512x6b00b84d = this.f307478a;
        android.view.ViewGroup viewGroup = c17512x6b00b84d.f243375g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById;
        v61.d.d("close_wechat_ack_btn", checkBox.isChecked() ? 1 : 0, 2);
        if (checkBox.isChecked()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "push notify mode exit");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(99L, 143L, 1L, false);
            g0Var.d(11545, java.lang.Integer.valueOf(c17512x6b00b84d.f243377i));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.p971x6de15a2e.x2.j();
            o4Var.getClass();
            o4Var.putBoolean("is_in_notify_mode", true).commit();
            c17512x6b00b84d.x7(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "normally exit");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(99L, 144L, 1L, false);
            g0Var2.d(11545, java.lang.Integer.valueOf(c17512x6b00b84d.f243378m));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
            if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
                gm0.j1.d().f152297d.C(false);
            }
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
            c17512x6b00b84d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseSettingItem", "dklogout User EXIT Now uin:%d", java.lang.Integer.valueOf(gm0.j1.b().h()));
            if (!gm0.j1.b().t() || c01.z1.x()) {
                c17512x6b00b84d.y7();
            } else {
                com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                d24.e eVar = new d24.e(c17512x6b00b84d);
                c17512x6b00b84d.f243380o = eVar;
                d17.a(281, eVar);
                de0.i wi6 = ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).wi(2);
                gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) wi6);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new d24.f(wi6, c17512x6b00b84d), false);
                c17512x6b00b84d.f243379n = b4Var;
                b4Var.c(5000L, 5000L);
                c17512x6b00b84d.f243381p = db5.e1.Q(c17512x6b00b84d.m80379x76847179(), c17512x6b00b84d.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c17512x6b00b84d.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.l7z), true, true, new d24.g(wi6, c17512x6b00b84d));
            }
        }
        this.f307479b.B();
    }
}
