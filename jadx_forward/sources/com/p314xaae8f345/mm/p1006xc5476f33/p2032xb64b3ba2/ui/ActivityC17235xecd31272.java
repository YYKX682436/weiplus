package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSelectUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI */
/* loaded from: classes10.dex */
public final class ActivityC17235xecd31272 extends com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.AbstractActivityC17237x95180387 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f239867d = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ch7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g2.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.AbstractActivityC17237x95180387, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        pf5.u uVar = pf5.u.f435469a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).f218266g.add(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui.ActivityC17235xecd31272.class);
        super.onCreate(bundle);
        if (getIntent().getIntExtra("ringtone_caller", 1) == 1) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574371i30);
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
            if (stringExtra != null) {
                if (c01.e2.l(stringExtra).I == 2) {
                    mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574373i32);
                } else {
                    mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574372i31);
                }
            }
        }
        mo54448x9c8c0d33(new ay3.k(this));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            mo74404x84f07bce(1, com.p314xaae8f345.mm.R.raw.f80339xd9eb969c, new ay3.l(this));
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_privacy_switch, true)) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new ay3.m(this));
        }
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        ((hy2.f) ((iz2.b) uVar.c(this).c(iz2.b.class))).f367590f = 7;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return;
        }
        m78551x8f8ecf18(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(pf5.a0.a(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(iz2.b.class)));
    }
}
