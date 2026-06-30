package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class x1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1 {

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f264212u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f264213v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f264214w;

    public x1(android.content.Context context, android.view.View view) {
        super(context);
        this.f264212u = view;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9x, (android.view.ViewGroup) this, false);
        this.f264213v = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aak);
        f(inflate, view);
        this.f264214w = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pip);
    }

    public void g() {
        m74245x8e3d1bf8(false);
        android.view.View view = this.f264213v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setTransparent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f264212u.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    /* renamed from: setBgColor */
    public void m74246xa5089f5c(int i17) {
        ((android.view.ViewGroup) this.f264213v.getParent()).setBackgroundColor(i17);
    }

    /* renamed from: setCurrentUrl */
    public void m74247xdb7c7738(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f264214w.setVisibility(8);
            return;
        }
        java.lang.String host = android.net.Uri.parse(str).getHost();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) == 1) {
            this.f264214w.setVisibility(8);
            return;
        }
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6m, host);
        this.f264214w.setVisibility(0);
        this.f264214w.setText(string);
    }

    /* renamed from: setPullDownViewVisibility */
    public void m74248x3a4db300(int i17) {
        android.view.View view = this.f264213v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggagePullDownWebView", "setPullDownViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
