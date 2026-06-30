package com.p314xaae8f345.p425x1ea3c036.sdk.p435x600e8c43.p436x316220;

/* renamed from: com.tencent.luggage.sdk.customize.impl.FullSdkExternalToolsHelper$SimpleWebViewActivity */
/* loaded from: classes7.dex */
public class ActivityC3902x4b54b7c5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 {

    /* renamed from: z, reason: collision with root package name */
    public android.webkit.WebView f128844z;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120
    /* renamed from: getLayoutId */
    public int mo32073x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvd;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f128844z = (android.webkit.WebView) findViewById(com.p314xaae8f345.mm.R.id.phz);
        java.lang.String stringExtra = getIntent().getStringExtra("_url_");
        this.f128844z.stopLoading();
        this.f128844z.loadUrl(stringExtra);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("_url_");
        this.f128844z.stopLoading();
        this.f128844z.loadUrl(stringExtra);
    }
}
