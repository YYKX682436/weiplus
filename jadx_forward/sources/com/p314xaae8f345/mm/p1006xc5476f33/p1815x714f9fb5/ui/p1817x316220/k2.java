package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes3.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 f226373e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var, java.lang.String str) {
        this.f226373e = y1Var;
        this.f226372d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = this.f226373e;
        intent.setClass(y1Var.f226261d, com.p314xaae8f345.mm.ui.w2.class);
        intent.putExtra("rawUrl", this.f226372d);
        intent.putExtra("showShare", false);
        j45.l.u(y1Var.f226261d, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
