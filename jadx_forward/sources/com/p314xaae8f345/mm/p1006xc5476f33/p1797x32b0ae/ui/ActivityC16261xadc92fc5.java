package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetBGUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetBGUI */
/* loaded from: classes8.dex */
public final class ActivityC16261xadc92fc5 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f225884d = "MicroMsg.WxaLiteAppSheetBGUI";

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559256k, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        setResult(i18, intent);
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f225884d, "LiteAppProcessProfileInit has no init.");
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null && bundleExtra.containsKey("halfScreenConfig")) {
        }
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570749bq0);
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        if (rootView != null) {
            rootView.setBackgroundColor(0);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f225884d, "rootView:" + rootView);
        }
        n3.h2.a(getWindow(), true);
        setRequestedOrientation(10);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        getIntent().setFlags(0);
        getIntent().setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16262x8382bfc0.class);
        startActivityForResult(getIntent(), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(com.p314xaae8f345.mm.ui.bk.E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37145xa386663b);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559256k, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
    }
}
