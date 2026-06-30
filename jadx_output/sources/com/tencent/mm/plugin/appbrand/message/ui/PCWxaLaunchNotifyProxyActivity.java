package com.tencent.mm.plugin.appbrand.message.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/message/ui/PCWxaLaunchNotifyProxyActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PCWxaLaunchNotifyProxyActivity extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "onCreate");
        com.tencent.mm.ui.bk.j0(this);
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
        kotlin.jvm.internal.o.d(valueOf);
        int intValue = valueOf.intValue();
        android.content.Intent intent4 = getIntent();
        java.lang.String stringExtra3 = intent4 != null ? intent4.getStringExtra("sceneNote") : null;
        android.content.Intent intent5 = getIntent();
        java.lang.String stringExtra4 = intent5 != null ? intent5.getStringExtra("system_popup_text") : null;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = stringExtra;
                b1Var.f317016c = intValue;
                b1Var.f317034l = stringExtra3;
                b1Var.f317022f = stringExtra2;
                b1Var.f317032k = 1392;
                b1Var.f317027h0 = stringExtra4;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "launchCommon2 appId:" + stringExtra + ", versionType:" + intValue + ", enterPath:" + stringExtra2 + ", sceneNote:" + stringExtra3);
                finish();
                com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "finish PCWxaLaunchNotifyProxyActivity");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchNotifyProxyActivity", "appId or enterPath is null");
        finish();
    }
}
