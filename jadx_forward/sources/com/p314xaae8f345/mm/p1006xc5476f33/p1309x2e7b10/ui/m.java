package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes3.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f176605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.AbstractActivityC13045xe08b6026 f176606e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.AbstractActivityC13045xe08b6026 abstractActivityC13045xe08b6026, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f176606e = abstractActivityC13045xe08b6026;
        this.f176605d = onMenuItemClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f176605d;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(this.f176606e.mo55332x76847179(), 0, 0));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
