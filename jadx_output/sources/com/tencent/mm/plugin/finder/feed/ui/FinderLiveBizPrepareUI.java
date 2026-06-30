package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveBizPrepareUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveBizPrepareUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f109346v = "";

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.z1 f109347w;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aoo;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string2 = extras != null ? extras.getString("finder_biz_live_article_url") : null;
        java.lang.String str = "";
        if (string2 == null) {
            string2 = "";
        }
        this.f109346v = string2;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483276a54);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f109347w = ((yg0.a) ((zg0.r2) i95.n0.c(zg0.r2.class))).wi(this, this.f109346v, null, new com.tencent.mm.plugin.webview.ui.tools.widget.e0(0.0f, null, false, 0, null, true, null, null, null, false, 987, null));
        if (getContext().getResources().getConfiguration().orientation == 2 && isFragmentMode()) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = (com.tencent.mm.ui.dl.d(this).y - com.tencent.mm.ui.bl.h(getContext())) - getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479649bo);
            viewGroup.setLayoutParams(layoutParams);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ngc);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            findViewById2.getLayoutParams().height = -2;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.f109347w;
        if (z1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.z1.B6(z1Var, null, 1, null);
            com.tencent.mm.plugin.webview.ui.tools.WebViewKeyboardLinearLayout webViewKeyboardLinearLayout = ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).f187467i;
            java.lang.Object parent = webViewKeyboardLinearLayout != null ? webViewKeyboardLinearLayout.getParent() : null;
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            viewGroup.addView(webViewKeyboardLinearLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ngc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.d8(this));
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (string = extras2.getString("finder_biz_live_article_title")) != null) {
            str = string;
        }
        setMMTitle(str);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.e8(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.webview.ui.tools.widget.z1 z1Var = this.f109347w;
        if (z1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) z1Var).l();
        }
    }
}
