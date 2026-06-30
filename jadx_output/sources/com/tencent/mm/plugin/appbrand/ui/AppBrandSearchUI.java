package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class AppBrandSearchUI extends com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI {

    /* renamed from: d5, reason: collision with root package name */
    public android.view.View f89407d5;

    /* renamed from: e5, reason: collision with root package name */
    public java.lang.String f89408e5;

    /* renamed from: f5, reason: collision with root package name */
    public java.lang.String f89409f5;

    /* renamed from: g5, reason: collision with root package name */
    public int f89410g5;

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void B8() {
        super.B8();
        if (this.F4 == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f184246c4)) {
            return;
        }
        this.F4.getFtsEditText().n(this.f184246c4, null);
        this.F4.getFtsEditText().d();
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        android.view.View view;
        if (!android.text.TextUtils.isEmpty(str2) && (view = this.f89407d5) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.K1;
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSearchUI", "invoker is null");
        } else {
            try {
                v0Var.i(10001, null);
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSearchUI", "refresh keyword id error : %s", e17);
            }
        }
        super.C3(str, str2, list, oVar);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, tj5.n
    public boolean G0() {
        android.view.View view = this.f89407d5;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "onSearchKeyDown", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.G0();
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI
    public void R7(int i17, android.os.Bundle bundle) {
        super.R7(i17, bundle);
        if (i17 != 142) {
            return;
        }
        this.Q2.post(new com.tencent.mm.plugin.appbrand.ui.g7(this, bundle.getString("fts_key_json_data"), bundle.getInt("fts_key_is_cache_data", 0), bundle.getInt("fts_key_is_expired", 1), bundle.getInt("fts_key_is_preload", 0)));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int S6() {
        if (fp.m.d()) {
            fp.m.e();
        }
        com.tencent.mm.ui.bk.i0(getWindow(), true);
        return -855310;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        super.dealContentView(view);
        this.f89408e5 = getIntent().getStringExtra("key_nearby_url");
        getIntent().getStringExtra("key_nearby_list_id");
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f488087gv, (android.view.ViewGroup) view, false);
        this.f89407d5 = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.k5d);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.appbrand.ui.f7(this));
        if (android.text.TextUtils.isEmpty(this.f89408e5)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f89407d5;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f89407d5;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/AppBrandSearchUI", "dealContentView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view instanceof android.widget.FrameLayout) {
            ((android.widget.FrameLayout) view).addView(this.f89407d5);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (getWindow().hasFeature(9)) {
            android.view.View view4 = this.f89407d5;
            int paddingLeft = view4.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            int s76 = s7();
            android.view.View decorView = getWindow().getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            int height = decorView.getHeight();
            int[] iArr = new int[2];
            decorView.getLocationOnScreen(iArr);
            if (height == 0) {
                s76 += fp.j0.a(getContext(), 0);
            }
            view4.setPadding(paddingLeft, ((height - rect.height() < 0 || iArr[1] <= 200) ? s76 + rect.top : s76 + (height - rect.height())) + this.f89407d5.getPaddingTop(), this.f89407d5.getPaddingRight(), this.f89407d5.getPaddingBottom());
        }
        addContentView(this.f89407d5, layoutParams);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
    public java.lang.String ha() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_search_place_holder");
        return (stringExtra == null || stringExtra.length() <= 0) ? super.ha() : stringExtra;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.websearch.l2.f181563b = com.tencent.mm.plugin.websearch.l2.a(3);
        this.f89409f5 = getIntent().getStringExtra("key_session_id");
        this.f89410g5 = getIntent().getIntExtra("ftsbizscene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSearchUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", this.f89409f5);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13929, this.f89409f5, "", 1, java.lang.Integer.valueOf(this.f89410g5));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_session_id", this.f89409f5);
        intent.putExtra("ftsbizscene", this.f89410g5);
        setResult(-1, intent);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        int i17 = this.f89410g5;
        if (i17 == 3 || i17 == 16) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13929, this.f89409f5, k01.n.f303048a, 2, java.lang.Integer.valueOf(this.f89410g5));
        }
        super.onDestroy();
    }
}
