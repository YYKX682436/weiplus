package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i5 f99427d;

    public d5(com.tencent.mm.plugin.exdevice.ui.i5 i5Var) {
        this.f99427d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceRankAdapter", "hy: user clicked on the content");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.exdevice.ui.i5 i5Var = this.f99427d;
        com.tencent.mm.plugin.exdevice.ui.e7 e7Var = (com.tencent.mm.plugin.exdevice.ui.e7) i5Var.f99505e.get(intValue);
        ((com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI) i5Var.f99509i).X6(e7Var.f99447a.field_username);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
