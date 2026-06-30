package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1161x38eb0007.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/message/ui/PCWxaLaunchNotifyProxyActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.message.ui.PCWxaLaunchNotifyProxyActivity */
/* loaded from: classes3.dex */
public final class ActivityC12432x1b909df4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "onCreate");
        com.p314xaae8f345.mm.ui.bk.j0(this);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("appid") : null;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("enter_path") : null;
        android.content.Intent intent3 = getIntent();
        java.lang.Integer valueOf = intent3 != null ? java.lang.Integer.valueOf(intent3.getIntExtra("version_type", 0)) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        int intValue = valueOf.intValue();
        android.content.Intent intent4 = getIntent();
        java.lang.String stringExtra3 = intent4 != null ? intent4.getStringExtra("sceneNote") : null;
        android.content.Intent intent5 = getIntent();
        java.lang.String stringExtra4 = intent5 != null ? intent5.getStringExtra("system_popup_text") : null;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = stringExtra;
                b1Var.f398549c = intValue;
                b1Var.f398567l = stringExtra3;
                b1Var.f398555f = stringExtra2;
                b1Var.f398565k = 1392;
                b1Var.f398560h0 = stringExtra4;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "launchCommon2 appId:" + stringExtra + ", versionType:" + intValue + ", enterPath:" + stringExtra2 + ", sceneNote:" + stringExtra3);
                finish();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "finish PCWxaLaunchNotifyProxyActivity");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "appId or enterPath is null");
        finish();
    }
}
