package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns;

/* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting */
/* loaded from: classes9.dex */
public class ActivityC16340xe900d22f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f227287g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f227288h;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368
    public boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof ac3.a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "free pwd setting onWalletSceneEnd, errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
            if (i17 != 0 || i18 != 0) {
                X6(119);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
                Z6();
            } else if (((ac3.a) m1Var).f84611d == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
                X6(119);
                Y6(true);
            } else {
                Y6(false);
                X6(118);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
            }
        }
        return false;
    }

    public final void X6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12 c6075x544e5a12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6075x544e5a12();
        am.gw gwVar = c6075x544e5a12.f136357g;
        gwVar.f88328a = i17;
        gwVar.getClass();
        gwVar.getClass();
        c6075x544e5a12.e();
    }

    public final void Y6(boolean z17) {
        m79333x58c0be88().edit().putBoolean("open_sns_pay_pref", z17).commit();
        this.f227288h.O(z17);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f227287g).notifyDataSetChanged();
    }

    public final void Z6() {
        boolean z17 = bc3.a.a() == 1;
        this.f227288h.O(z17);
        m79333x58c0be88().edit().putBoolean("open_sns_pay_pref", z17).commit();
        if (android.text.TextUtils.isEmpty(bc3.a.b())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "SetSnsPayTitle is empty");
            this.f227288h.J(com.p314xaae8f345.mm.R.C30867xcad56011.gl7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "SetSnsPayTitle:" + bc3.a.b());
            this.f227288h.L(bc3.a.b());
        }
        if (android.text.TextUtils.isEmpty(bc3.a.c())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "getSetSnsPayWording is empty");
            this.f227288h.G(com.p314xaae8f345.mm.R.C30867xcad56011.gl6);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "SetSnsPayWording:" + bc3.a.c());
            this.f227288h.H(bc3.a.c());
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f227287g).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576492cp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f227287g = m79336x8b97809d();
        mo54448x9c8c0d33(new zb3.c(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.gl8);
        this.f227288h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f227287g).h("open_sns_pay_pref");
        Z6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        X6(116);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if ("open_sns_pay_pref".equals(c21560x1fce98fb.f279313q)) {
            if (this.f227288h.N() || bc3.a.a() != 1) {
                X6(120);
                com.p314xaae8f345.mm.p2802xd031a825.a.j(this, zb3.b.class, null, null);
            } else {
                V6().d(new ac3.a(0, "", ""), true);
                X6(117);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        Z6();
        super.onResume();
    }
}
