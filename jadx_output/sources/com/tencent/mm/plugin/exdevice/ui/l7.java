package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class l7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f99558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.SportHistoryUI f99559e;

    public l7(r45.ed6 ed6Var, com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI) {
        this.f99558d = ed6Var;
        this.f99559e = sportHistoryUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.service.f6 f6Var = (com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class);
        r45.ed6 ed6Var = this.f99558d;
        ((k91.g4) f6Var).Ni(ed6Var.f373327d, new com.tencent.mm.plugin.exdevice.ui.k7(this.f99559e, ed6Var));
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
