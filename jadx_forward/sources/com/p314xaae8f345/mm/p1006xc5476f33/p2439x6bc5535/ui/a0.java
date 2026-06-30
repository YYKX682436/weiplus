package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui;

/* loaded from: classes11.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 f269526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ug3.k f269527e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var, ug3.k kVar) {
        this.f269526d = k0Var;
        this.f269527e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "filehelper");
        intent.putExtra("key_show_bottom_app_panel", true);
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.k0 k0Var = this.f269526d;
        y7Var.j(intent, k0Var.f269554d);
        int i17 = this.f269527e.f474004n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.r rVar = k0Var.f269555e;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.ui.ActivityC19504xce272b91) rVar).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
