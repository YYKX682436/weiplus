package com.tencent.mm.plugin.facedetect.ui;

@db5.a(3)
/* loaded from: classes.dex */
public class FaceTransparentStubUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("KEY_EXTRAS");
        if (!bundleExtra.containsKey("k_user_name") && gm0.j1.b().n()) {
            bundleExtra.putString("k_user_name", c01.z1.b());
        }
        com.tencent.mm.autogen.events.RequestStartFaceDetectEvent requestStartFaceDetectEvent = new com.tencent.mm.autogen.events.RequestStartFaceDetectEvent();
        am.or orVar = requestStartFaceDetectEvent.f54699g;
        orVar.f7573a = this;
        orVar.f7575c = intExtra;
        orVar.f7574b = bundleExtra;
        requestStartFaceDetectEvent.e();
        am.pr prVar = requestStartFaceDetectEvent.f54700h;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", java.lang.Boolean.valueOf(prVar.f7654a));
        if (prVar.f7654a) {
            return;
        }
        if (prVar.f7655b != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(prVar.f7655b);
            setResult(1, intent);
        } else {
            setResult(1);
        }
        finish();
    }
}
