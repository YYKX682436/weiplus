package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI f99656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.r2 f99657e;

    public s2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI, com.tencent.mm.plugin.exdevice.ui.r2 r2Var) {
        this.f99656d = exdeviceFollowsUI;
        this.f99657e = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI = this.f99656d;
        android.content.Intent intent = new android.content.Intent(exdeviceFollowsUI, (java.lang.Class<?>) com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.class);
        intent.putExtra(dm.i4.COL_USERNAME, this.f99657e.f99639e.f373005e);
        exdeviceFollowsUI.startActivityForResult(intent, exdeviceFollowsUI.f99281n);
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceFollowsUI$FollowItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
