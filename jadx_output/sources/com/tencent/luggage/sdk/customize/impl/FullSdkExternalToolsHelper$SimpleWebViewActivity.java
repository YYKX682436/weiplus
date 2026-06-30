package com.tencent.luggage.sdk.customize.impl;

/* loaded from: classes7.dex */
public class FullSdkExternalToolsHelper$SimpleWebViewActivity extends com.tencent.mm.ui.BaseActivity {

    /* renamed from: z, reason: collision with root package name */
    public android.webkit.WebView f47311z;

    @Override // com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvd;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // com.tencent.mm.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f47311z = (android.webkit.WebView) findViewById(com.tencent.mm.R.id.phz);
        java.lang.String stringExtra = getIntent().getStringExtra("_url_");
        this.f47311z.stopLoading();
        this.f47311z.loadUrl(stringExtra);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("_url_");
        this.f47311z.stopLoading();
        this.f47311z.loadUrl(stringExtra);
    }
}
