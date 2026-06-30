package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderPoiContainerUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@db5.c9
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiContainerUI */
/* loaded from: classes2.dex */
public final class ActivityC13658x4433fc11 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570594ed4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        double doubleExtra = getIntent().getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = getIntent().getDoubleExtra("kwebmap_lng", 0.0d);
        java.lang.String stringExtra = getIntent().getStringExtra("kPoiid");
        java.lang.String stringExtra2 = getIntent().getStringExtra("Kwebmap_locaion");
        java.lang.String stringExtra3 = getIntent().getStringExtra("kPoiName");
        r45.f96 f96Var = new r45.f96();
        f96Var.set(1, java.lang.Float.valueOf((float) doubleExtra));
        f96Var.set(0, java.lang.Float.valueOf((float) doubleExtra2));
        f96Var.set(5, stringExtra);
        f96Var.set(4, stringExtra2);
        f96Var.set(3, stringExtra3);
        int intExtra = getIntent().getIntExtra("key_from_mp_idx", 0);
        int intExtra2 = getIntent().getIntExtra("key_from_mp_biz_uin", 0);
        int intExtra3 = getIntent().getIntExtra("key_from_mp_appmsg_id", 0);
        if (intExtra != 0 || intExtra2 != 0 || intExtra3 != 0) {
            r45.wo2 wo2Var = new r45.wo2();
            wo2Var.set(2, java.lang.Integer.valueOf(intExtra));
            wo2Var.set(0, java.lang.Integer.valueOf(intExtra2));
            wo2Var.set(1, java.lang.Integer.valueOf(intExtra3));
            f96Var.set(21, wo2Var);
        }
        getIntent().putExtra("key_location", f96Var.mo14344x5f01b1f6());
        getIntent().putExtra("key_entrance_type", 3);
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai) a17;
        intent.putExtra("key_half_screen_mode", la2.a.f399034e);
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a18 = lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.class, intent, false, false, false, null, 60, null);
        gx2.q R6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai.R6(aiVar, a18, null, null, 6, null);
        aiVar.O6(new ia2.g(aiVar, this));
        int g17 = com.p314xaae8f345.mm.ui.bl.g(this);
        if (g17 > 0 && R6 != null) {
            R6.mo62645x46e30de3(R6.getF213466e() + g17);
            android.widget.FrameLayout m132453x9f6a8176 = R6.m132453x9f6a8176();
            m132453x9f6a8176.setPadding(m132453x9f6a8176.getPaddingLeft(), m132453x9f6a8176.getPaddingTop(), m132453x9f6a8176.getPaddingRight(), g17 + R6.m132453x9f6a8176().getPaddingBottom());
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = a18.f292654p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC22579xbed01a37, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(R6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.m7((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) abstractActivityC22579xbed01a37, this, a18, R6, null, null, 4, d85.f0.D.f308710e, 24, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(zy2.t7.class)));
    }
}
