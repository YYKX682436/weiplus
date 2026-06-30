package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class f9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf f291952d;

    public f9(com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf) {
        this.f291952d = c22520x90c681bf;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf = this.f291952d;
        c22520x90c681bf.f291677e.setText("");
        com.p314xaae8f345.mm.ui.p2740x696c9db.i9 i9Var = c22520x90c681bf.f291680h;
        if (i9Var != null) {
            ((or1.j2) i9Var).f429046a.mo26063x7b383410();
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
