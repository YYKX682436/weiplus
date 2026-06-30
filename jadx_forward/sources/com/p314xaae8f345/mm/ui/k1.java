package com.p314xaae8f345.mm.ui;

/* loaded from: classes3.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f290547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 f290548e;

    public k1(com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 abstractActivityC21348x43985120, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f290548e = abstractActivityC21348x43985120;
        this.f290547d = onMenuItemClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290547d.onMenuItemClick(new db5.h4(this.f290548e.f278127m, 0, 0));
        yj0.a.h(this, "com/tencent/mm/ui/BaseActivity$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
