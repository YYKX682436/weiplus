package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f213941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kl2 f213943f;

    public j2(android.content.Context context, java.lang.String str, r45.kl2 kl2Var) {
        this.f213941d = context;
        this.f213942e = str;
        this.f213943f = kl2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAuthorCopyIDDialog$Companion$copyIDAndShowOK$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k2 k2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.l2.f214070a;
        android.content.Context context = this.f213941d;
        k2Var.a(context, this.f213942e, "learn_more_copy_videoid", "view_clk");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAuthorCopyIDDialog", "Click more info link");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.f213943f.m75945x2fec8307(1)));
        intent.putExtra("vertical_scroll", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAuthorCopyIDDialog$Companion$copyIDAndShowOK$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
