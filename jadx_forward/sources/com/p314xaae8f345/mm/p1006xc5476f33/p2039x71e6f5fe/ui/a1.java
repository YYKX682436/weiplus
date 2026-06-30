package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes8.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f241033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241034e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3, e04.n3 n3Var) {
        this.f241034e = activityC17301x38c077a3;
        this.f241033d = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.d(this.f241034e.mo55332x76847179(), intent, android.net.Uri.parse(this.f241033d.f69638x5727ab76), "video/*", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241034e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC17301x38c077a3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17301x38c077a3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC17301x38c077a3, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ProductUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
