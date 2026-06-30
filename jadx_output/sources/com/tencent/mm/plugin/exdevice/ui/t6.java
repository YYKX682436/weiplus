package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class t6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99680d;

    public t6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99680d = exdeviceRankInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p32.g.c(this.f99680d);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
