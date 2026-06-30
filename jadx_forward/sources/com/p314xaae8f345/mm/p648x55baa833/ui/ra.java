package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 f146018d;

    public ra(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2) {
        this.f146018d = activityC10362xd5e3feb2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2 = this.f146018d;
        java.lang.String str = activityC10362xd5e3feb2.f145449o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        java.lang.String P0 = n17.P0();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = activityC10362xd5e3feb2.f145441d;
        java.lang.String z07 = a3Var != null ? a3Var.z0(activityC10362xd5e3feb2.f145449o) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            z07 = n17.g2();
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2.T6(activityC10362xd5e3feb2, activityC10362xd5e3feb2.f145449o, z07, P0, false);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
