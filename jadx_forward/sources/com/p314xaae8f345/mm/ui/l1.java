package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.q1 f290593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 f290594e;

    public l1(com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 abstractActivityC21348x43985120, com.p314xaae8f345.mm.ui.q1 q1Var) {
        this.f290594e = abstractActivityC21348x43985120;
        this.f290593d = q1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.MenuItem menuItem = this.f290594e.f278132r;
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f290593d.f291067h;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(menuItem);
        }
        yj0.a.h(this, "com/tencent/mm/ui/BaseActivity$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
