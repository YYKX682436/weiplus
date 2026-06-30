package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class d7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Bitmap f171194x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f171195y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f171196z;

    public d7(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str) {
        super(context);
        this.f171194x = bitmap;
        s(true);
        setBackground(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569625h2, (android.view.ViewGroup) this, false);
        this.f171196z = inflate;
        addView(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f171195y = textView;
        textView.setText(wg1.b.f527250m.h().equals(str) ? com.p314xaae8f345.mm.R.C30867xcad56011.ggc : com.p314xaae8f345.mm.R.C30867xcad56011.n_);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.hlr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc
    public java.lang.String D() {
        return "AppBrandRuntimeRestartLoadingSplash";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
        post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c7(this, aVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f171194x.recycle();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setAppServiceType */
    public /* bridge */ /* synthetic */ void mo52967xf31bdbb0(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setCanShowHideAnimation */
    public /* bridge */ /* synthetic */ void mo52968x5fa745f7(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.hc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.jc, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
    }

    /* renamed from: setPromptText */
    public void m52975x5952c6b3(java.lang.String str) {
        this.f171195y.setText(str);
    }

    /* renamed from: setPromptVisible */
    public void m52976x1816b92c(boolean z17) {
        android.view.View view = this.f171196z;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandRuntimeRestartLoadingSplash", "setPromptVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
