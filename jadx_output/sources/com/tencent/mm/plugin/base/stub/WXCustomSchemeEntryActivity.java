package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class WXCustomSchemeEntryActivity extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f93675f = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f93676d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93677e = false;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04c9 A[RETURN] */
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.tencent.mm.pluginsdk.ui.p r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01cb  */
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Y6(android.content.Intent r30) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity.Y6(android.content.Intent):boolean");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.app.ActivityManager.RunningTaskInfo z17;
        if ((this.f93677e || (z17 = com.tencent.mm.sdk.platformtools.t8.z(this, getTaskId())) == null || getComponentName() == null || !getComponentName().equals(z17.topActivity) || (!getComponentName().equals(z17.baseActivity) && !isTaskRoot())) ? false : true) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488222l1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f93677e = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXCustomSchemeEntryActivity", "onCreate");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f93676d = arrayList;
        arrayList.add("cardpackage");
        this.f93676d.add("connectToFreeWifi");
        this.f93676d.add("wap");
        this.f93676d.add("pay");
        this.f93676d.add("yuanbao");
        super.onCreate(bundle);
        setTitleVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f93677e = false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        this.f93677e = intent == null || (intent.getFlags() & 268435456) != 268435456;
    }
}
