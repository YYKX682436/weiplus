package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class p6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f292169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f292170e;

    public p6(com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f292170e = s6Var;
        this.f292169d = onCreateContextMenuListener;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f292170e;
        s6Var.f292259m.clear();
        this.f292169d.onCreateContextMenu(s6Var.f292259m, view, null);
        s6Var.f292255f = new com.p314xaae8f345.mm.ui.p2740x696c9db.o6(this);
        s6Var.f292254e.V1 = true;
        s6Var.d();
        yj0.a.i(true, this, "com/tencent/mm/ui/tools/MMListMenuHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
