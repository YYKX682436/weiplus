package com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.facedetectaction.ui.FaceTransStubUI */
/* loaded from: classes.dex */
public class ActivityC13536x38e0bdcd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f181743d = this;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181744e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181745f = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onActivityResult] %s, resultCode: %s , isRestoreCreate: %s , data: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f181744e), intent);
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("hasRestoredState", false);
            this.f181744e = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] get restore key: %s", java.lang.Boolean.valueOf(z17));
        }
        this.f181745f = wz2.a.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] %s, isRestoreCreate: %s, isOpenFaceRestoreSwitch: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f181744e), java.lang.Boolean.valueOf(this.f181745f));
        if (this.f181744e && this.f181745f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceTransStubUI", "[onCreate] isRestoreCreate, return");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76();
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        am.jr jrVar = c5925x646e9c76.f136227g;
        jrVar.f88600a = intExtra;
        jrVar.f88601b = getIntent().getStringExtra("package");
        jrVar.f88602c = getIntent().getStringExtra("packageSign");
        jrVar.f88603d = getIntent().getStringExtra("otherVerifyTitle");
        jrVar.f88604e = getIntent().getStringExtra("otherVerifyTitleFront");
        jrVar.f88605f = getIntent().getStringExtra("needFrontPage");
        jrVar.f88606g = getIntent().getStringExtra("faceVerifyTitle");
        jrVar.f88607h = 63;
        android.content.Context context = this.f181743d;
        if (context instanceof android.app.Activity) {
            jrVar.f88609j = (android.app.Activity) context;
        }
        c5925x646e9c76.e();
        am.kr krVar = c5925x646e9c76.f136228h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] start face detect event result: %b", java.lang.Boolean.valueOf(krVar.f88710a));
        if (krVar.f88710a) {
            return;
        }
        if (krVar.f88711b != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(krVar.f88711b);
            setResult(1, intent);
        } else {
            setResult(1);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onDestroy] %s", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onRestoreInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        this.f181744e = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onSaveInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceTransStubUI", "[onSaveInstanceState] set restore key");
            bundle.putBoolean("hasRestoredState", true);
        }
    }
}
