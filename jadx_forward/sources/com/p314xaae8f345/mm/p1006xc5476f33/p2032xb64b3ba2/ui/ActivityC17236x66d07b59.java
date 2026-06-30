package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSettingsUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI */
/* loaded from: classes10.dex */
public final class ActivityC17236x66d07b59 extends com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.AbstractActivityC17237x95180387 {
    public final void U6() {
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clu;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.k1.class, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x1.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        boolean z17 = true;
        if (i17 != 5) {
            if (i17 == 8 && i18 == -1 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (stringExtra != null && stringExtra.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    mx3.s.a(mx3.u.f414153f, this, 2, stringExtra, ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class)).f240032e, false, null, 48, null);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsNewRingtoneUI", "empty or null contact: " + stringExtra);
                return;
            }
            return;
        }
        if (i18 != 6) {
            return;
        }
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("exclusvie_name") : null;
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv_ringtone_info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        if (M.getBoolean("ringtone_exclusive_has_been_educated", false)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 2, 3, false);
        z2Var.y(getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.i2t));
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgv);
        z2Var.F = new ay3.n(z2Var);
        z2Var.C();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.AbstractActivityC17237x95180387, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ixs);
        mo54448x9c8c0d33(new ay3.o(this));
        mo78491xd9193382(0, "历史记录", new ay3.p(this));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
        mo64405x4dab7448(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
