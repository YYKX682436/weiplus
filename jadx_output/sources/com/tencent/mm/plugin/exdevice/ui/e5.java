package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i5 f99445d;

    public e5(com.tencent.mm.plugin.exdevice.ui.i5 i5Var) {
        this.f99445d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.i5 i5Var = this.f99445d;
        ((com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI) i5Var.f99509i).X6(i5Var.f99507g);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
