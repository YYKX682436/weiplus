package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class sa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f291311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f291312e;

    public sa(com.p314xaae8f345.mm.ui.ga gaVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f291312e = gaVar;
        this.f291311d = onMenuItemClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMActivityController$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        view.setSelected(false);
        view.setPressed(false);
        view.clearFocus();
        view.invalidate();
        view.post(new com.p314xaae8f345.mm.ui.ra(this));
        yj0.a.h(this, "com/tencent/mm/ui/MMActivityController$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
