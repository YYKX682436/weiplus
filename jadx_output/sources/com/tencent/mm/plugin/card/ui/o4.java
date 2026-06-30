package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class o4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt1.b f95101d;

    public o4(com.tencent.mm.plugin.card.ui.q4 q4Var, xt1.b bVar) {
        this.f95101d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CellAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean isChecked = ((android.widget.CheckBox) view).isChecked();
        xt1.b bVar = this.f95101d;
        if (isChecked) {
            bVar.f456446w = true;
        } else {
            bVar.f456446w = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CellAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
