package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem.OnMenuItemClickListener f95072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailBaseUI f95073e;

    public m(com.tencent.mm.plugin.card.ui.CardDetailBaseUI cardDetailBaseUI, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f95073e = cardDetailBaseUI;
        this.f95072d = onMenuItemClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f95072d;
        if (onMenuItemClickListener != null) {
            onMenuItemClickListener.onMenuItemClick(new db5.h4(this.f95073e.getContext(), 0, 0));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardDetailBaseUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
