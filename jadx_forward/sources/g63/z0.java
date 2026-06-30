package g63;

/* loaded from: classes8.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6 f350719d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16048x951c5ec6 activityC16048x951c5ec6) {
        this.f350719d = activityC16048x951c5ec6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        for (int i17 = 0; i17 < 51; i17++) {
            z53.i iVar = new z53.i();
            iVar.f67669xbed8694c = "test" + i17;
            iVar.f67663xf66fcca9 = "digest" + i17;
            iVar.f67672xa783a79b = java.lang.System.currentTimeMillis();
            iVar.f67670x114ef53e = "talker" + i17;
            iVar.f67668x5568d387 = this.f350719d.f223533e;
            Ui.mo880xb970c2b9(iVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
