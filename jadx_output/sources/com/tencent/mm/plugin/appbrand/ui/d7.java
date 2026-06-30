package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class d7 extends com.tencent.mm.plugin.appbrand.ui.hc {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Bitmap f89661x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f89662y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f89663z;

    public d7(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(context);
        this.f89661x = bitmap;
        s(true);
        setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488092h2, (android.view.ViewGroup) this, false);
        this.f89663z = inflate;
        addView(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f89662y = textView;
        textView.setText(wg1.b.f445717m.h().equals(str) ? com.tencent.mm.R.string.ggc : com.tencent.mm.R.string.n_);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.hlr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        return "AppBrandRuntimeRestartLoadingSplash";
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public android.view.View getView() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void k(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        post(new com.tencent.mm.plugin.appbrand.ui.c7(this, aVar));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.jc, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f89661x.recycle();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setCanShowHideAnimation(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public void setProgress(int i17) {
    }

    public void setPromptText(java.lang.String str) {
        this.f89662y.setText(str);
    }

    public void setPromptVisible(boolean z17) {
        android.view.View view = this.f89663z;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
