package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f267131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 f267132e;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l1 l1Var, int i17) {
        this.f267132e = l1Var;
        this.f267131d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View view2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e1 e1Var = this.f267132e.f267159g.f265196u;
        e1Var.f265655i = this.f267131d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.d1 d1Var = e1Var.f265649c;
        if (d1Var != null) {
            d1Var.m8146xced61ae5();
        }
        android.content.Context context = e1Var.f265648b;
        if (context != null && (view2 = e1Var.f265651e) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(e1Var.f265651e);
            }
            e1Var.f265647a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 3);
            e1Var.a(context);
            e1Var.f265647a.t(e1Var.f265651e);
        }
        e1Var.f265647a.C();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthAppDataUI$AppDataAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
