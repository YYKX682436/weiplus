package com.tencent.mm.plugin.card.ui;

/* loaded from: classes.dex */
public class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardIndexUI f95099d;

    public o2(com.tencent.mm.plugin.card.ui.CardIndexUI cardIndexUI) {
        this.f95099d = cardIndexUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardIndexUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f95099d.getClass();
        throw null;
    }
}
