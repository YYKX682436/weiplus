package jm3;

/* loaded from: classes8.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 f381904d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62) {
        this.f381904d = activityC16654xdc9bdf62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62.f232415n;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62 activityC16654xdc9bdf62 = this.f381904d;
        activityC16654xdc9bdf62.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16654xdc9bdf62, 1, false);
        k0Var.l(activityC16654xdc9bdf62.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0));
        k0Var.t(true);
        k0Var.f293405n = new jm3.s0(activityC16654xdc9bdf62);
        k0Var.f293414s = new jm3.t0(activityC16654xdc9bdf62, k0Var);
        k0Var.f293387d = jm3.u0.f381889d;
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
