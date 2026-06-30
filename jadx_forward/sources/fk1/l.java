package fk1;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344811d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344811d = activityC12732x6baffca6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f344811d, 1, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344811d;
        k0Var.X1 = true;
        k0Var.f293405n = new fk1.e(activityC12732x6baffca6);
        k0Var.f293414s = new fk1.k(activityC12732x6baffca6);
        k0Var.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6.a7(activityC12732x6baffca6, 601L, 3L, 1, 1, null, 16, null);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
