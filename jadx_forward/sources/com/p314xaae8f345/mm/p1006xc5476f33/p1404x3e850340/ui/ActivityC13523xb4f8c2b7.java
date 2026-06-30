package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI */
/* loaded from: classes.dex */
public class ActivityC13523xb4f8c2b7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("KEY_EXTRAS");
        if (!bundleExtra.containsKey("k_user_name") && gm0.j1.b().n()) {
            bundleExtra.putString("k_user_name", c01.z1.b());
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5928xb1bcc367 c5928xb1bcc367 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5928xb1bcc367();
        am.or orVar = c5928xb1bcc367.f136232g;
        orVar.f89106a = this;
        orVar.f89108c = intExtra;
        orVar.f89107b = bundleExtra;
        c5928xb1bcc367.e();
        am.pr prVar = c5928xb1bcc367.f136233h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", java.lang.Boolean.valueOf(prVar.f89187a));
        if (prVar.f89187a) {
            return;
        }
        if (prVar.f89188b != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(prVar.f89188b);
            setResult(1, intent);
        } else {
            setResult(1);
        }
        finish();
    }
}
