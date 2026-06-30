package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.i5 f99456d;

    public f5(com.tencent.mm.plugin.exdevice.ui.i5 i5Var) {
        this.f99456d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = (com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI) this.f99456d.f99509i;
        exdeviceRankInfoUI.getClass();
        ve4.g.a(31);
        exdeviceRankInfoUI.a7();
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
