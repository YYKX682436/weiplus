package com.tencent.mm.plugin.facedetectaction.ui;

@db5.a(3)
/* loaded from: classes.dex */
public class FaceTransStubUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f100210d = this;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100211e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100212f = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onActivityResult] %s, resultCode: %s , isRestoreCreate: %s , data: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f100211e), intent);
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("hasRestoredState", false);
            this.f100211e = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] get restore key: %s", java.lang.Boolean.valueOf(z17));
        }
        this.f100212f = wz2.a.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] %s, isRestoreCreate: %s, isOpenFaceRestoreSwitch: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f100211e), java.lang.Boolean.valueOf(this.f100212f));
        if (this.f100211e && this.f100212f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceTransStubUI", "[onCreate] isRestoreCreate, return");
            return;
        }
        com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
        int intExtra = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        am.jr jrVar = requestFaceVerifyForPayEvent.f54694g;
        jrVar.f7067a = intExtra;
        jrVar.f7068b = getIntent().getStringExtra("package");
        jrVar.f7069c = getIntent().getStringExtra("packageSign");
        jrVar.f7070d = getIntent().getStringExtra("otherVerifyTitle");
        jrVar.f7071e = getIntent().getStringExtra("otherVerifyTitleFront");
        jrVar.f7072f = getIntent().getStringExtra("needFrontPage");
        jrVar.f7073g = getIntent().getStringExtra("faceVerifyTitle");
        jrVar.f7074h = 63;
        android.content.Context context = this.f100210d;
        if (context instanceof android.app.Activity) {
            jrVar.f7076j = (android.app.Activity) context;
        }
        requestFaceVerifyForPayEvent.e();
        am.kr krVar = requestFaceVerifyForPayEvent.f54695h;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onCreate] start face detect event result: %b", java.lang.Boolean.valueOf(krVar.f7177a));
        if (krVar.f7177a) {
            return;
        }
        if (krVar.f7178b != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(krVar.f7178b);
            setResult(1, intent);
        } else {
            setResult(1);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onDestroy] %s", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onRestoreInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        this.f100211e = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onSaveInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceTransStubUI", "[onSaveInstanceState] set restore key");
            bundle.putBoolean("hasRestoredState", true);
        }
    }
}
