package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

@db5.a(640)
@pk.b(pk.a.NAVIGATION_BAR)
/* loaded from: classes8.dex */
public class TmplWebViewMMUI extends com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI {
    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.y()) ? getIntent().getBooleanExtra("convertActivityFromTranslucent", false) : getIntent().getBooleanExtra("convertActivityFromTranslucent", true);
    }

    @Override // com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public boolean n7(java.lang.String str) {
        return com.tencent.mm.ui.b4.c(this) && this.G1.a();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
