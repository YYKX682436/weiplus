package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes8.dex */
public class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f241357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241358e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3, e04.n3 n3Var) {
        this.f241358e = activityC17301x38c077a3;
        this.f241357d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e04.n3 n3Var = this.f241357d;
        java.lang.String str = n3Var.f69636xce9b2b61;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241358e;
        activityC17301x38c077a3.X6(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", n3Var.f69636xce9b2b61);
        int i18 = activityC17301x38c077a3.f240854s;
        intent.putExtra("geta8key_scene", i18 == 4 ? 11 : i18 == 3 ? 12 : 0);
        j45.l.j(activityC17301x38c077a3.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
