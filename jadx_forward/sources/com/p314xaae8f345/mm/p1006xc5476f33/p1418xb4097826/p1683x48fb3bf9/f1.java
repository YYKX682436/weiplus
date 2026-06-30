package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218400d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218400d = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218400d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = n1Var.f218435f;
        if (k0Var != null && k0Var.i()) {
            n1Var.f218435f.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.b(n1Var.f().getContext(), n1Var.f().mo63373x86b9ebe3(), n1Var.f218430a, n1Var.f().mo63372x833e7d13(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.e1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/WebViewLongClickHelper$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
