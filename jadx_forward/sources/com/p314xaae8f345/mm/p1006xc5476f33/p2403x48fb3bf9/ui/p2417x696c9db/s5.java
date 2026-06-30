package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f268373d;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var) {
        this.f268373d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265460t = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f268373d;
        dx4.f fVar = b5Var.f265480o;
        if (fVar != null && fVar.mo74477x143f1b92() != null) {
            b5Var.f265480o.mo74477x143f1b92().O0(3);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = b5Var.f265471f;
        if (k0Var != null && k0Var.i()) {
            b5Var.f265471f.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.b(b5Var.l(), b5Var.f265480o.mo74477x143f1b92().f263449a, b5Var.f265466a, b5Var.f265480o.mo74478x833e7d13(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r5(this));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
