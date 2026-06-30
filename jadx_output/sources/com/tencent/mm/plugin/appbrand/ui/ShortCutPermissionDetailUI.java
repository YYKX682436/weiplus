package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class ShortCutPermissionDetailUI extends com.tencent.mm.plugin.webview.ui.tools.WebViewUI {
    public long A3 = 0;

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A3 = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortCutPermissionDetailUI", "onStop");
        android.content.Intent intent = getIntent();
        if (intent != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15786, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A3), java.lang.Integer.valueOf(intent.getIntExtra("extra_permission_and_jump_status", 0)), 0, intent.getStringExtra("extra_app_id"));
        }
        this.A3 = 0L;
    }
}
