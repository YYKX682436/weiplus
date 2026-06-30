package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes7.dex */
public class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px4 f265423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f265424e;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c2 c2Var, r45.px4 px4Var, android.widget.ImageView imageView) {
        this.f265423d = px4Var;
        this.f265424e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.px4 px4Var = this.f265423d;
        int i17 = px4Var.f464993f;
        android.widget.ImageView imageView = this.f265424e;
        if (i17 == 2) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562792or);
            px4Var.f464993f = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78851xab463e5f);
            px4Var.f464993f = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthOtherUI$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
