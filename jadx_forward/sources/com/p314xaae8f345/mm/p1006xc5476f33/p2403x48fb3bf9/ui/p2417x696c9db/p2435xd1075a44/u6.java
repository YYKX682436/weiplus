package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes7.dex */
public class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f269109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f269110e;

    public u6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.w6 w6Var, r45.jv5 jv5Var, android.widget.ImageView imageView) {
        this.f269109d = jv5Var;
        this.f269110e = imageView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.jv5 jv5Var = this.f269109d;
        int i17 = jv5Var.f459666f;
        android.widget.ImageView imageView = this.f269110e;
        if (i17 == 2) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80524x3921d096);
            jv5Var.f459666f = 1;
        } else if (i17 == 1) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80522x24cd9309);
            jv5Var.f459666f = 2;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebAuthorizeDialog$LoginAuthListAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
