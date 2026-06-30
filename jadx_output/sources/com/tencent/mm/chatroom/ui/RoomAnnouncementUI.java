package com.tencent.mm.chatroom.ui;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public class RoomAnnouncementUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.WebView f63840d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f63841e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63842f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.s_;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f492909i74);
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) findViewById(com.tencent.mm.R.id.phz);
        mMWebView.getClass();
        this.f63840d = mMWebView;
        mMWebView.getSettings().E(true);
        this.f63840d.getSettings().z(true);
        this.f63840d.getSettings().r(true);
        this.f63840d.getSettings().P(true);
        this.f63840d.getSettings().G(true);
        this.f63840d.getSettings().M(false);
        this.f63840d.getSettings().L(false);
        this.f63840d.getSettings().C(false);
        this.f63840d.getSettings().D(false);
        this.f63840d.setWebChromeClient(new com.tencent.mm.chatroom.ui.l8(this));
        this.f63840d.setWebViewClient(new com.tencent.mm.chatroom.ui.m8(this));
        setBackBtn(new com.tencent.mm.chatroom.ui.n8(this));
        this.f63840d.loadUrl(getString(com.tencent.mm.R.string.f490843b03, com.tencent.mm.sdk.platformtools.m2.d()));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f63841e = getIntent().getBooleanExtra("need_bind_mobile", false);
        this.f63842f = getIntent().getStringExtra("RoomInfo_Id");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.xweb.WebView webView = this.f63840d;
        if (webView != null) {
            webView.setVisibility(8);
            ((android.view.ViewGroup) this.f63840d.getParent()).removeView(this.f63840d);
            this.f63840d.removeAllViews();
            this.f63840d.destroy();
            this.f63840d = null;
            java.lang.System.gc();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
