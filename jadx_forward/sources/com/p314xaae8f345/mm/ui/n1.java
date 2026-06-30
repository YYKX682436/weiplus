package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class n1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.q1 f290929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 f290930e;

    public n1(com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 abstractActivityC21348x43985120, com.p314xaae8f345.mm.ui.q1 q1Var) {
        this.f290930e = abstractActivityC21348x43985120;
        this.f290929d = q1Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120.f278120y;
        this.f290930e.getClass();
        android.view.View.OnLongClickListener onLongClickListener = this.f290929d.f291068i;
        boolean onLongClick = onLongClickListener != null ? onLongClickListener.onLongClick(view) : false;
        yj0.a.i(onLongClick, this, "com/tencent/mm/ui/BaseActivity$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return onLongClick;
    }
}
