package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class id implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f266374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266377g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266378h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266379i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld f266380m;

    public id(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar, boolean z17, java.lang.String str, int i17, java.lang.String str2, boolean z18, java.lang.String str3) {
        this.f266380m = ldVar;
        this.f266374d = z17;
        this.f266375e = str;
        this.f266376f = i17;
        this.f266377g = str2;
        this.f266378h = z18;
        this.f266379i = str3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = this.f266380m;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = ldVar.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (android.os.SystemClock.elapsedRealtime() - ldVar.f267199q < 175) {
            ldVar.f267191i.mo50302x6b17ad39(null);
            ldVar.f267187e.k7();
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ldVar.f267199q = android.os.SystemClock.elapsedRealtime();
            ldVar.f267191i.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.hd(this), 175L);
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
