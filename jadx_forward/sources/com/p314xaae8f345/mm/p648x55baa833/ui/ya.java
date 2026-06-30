package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class ya implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.za f146223e;

    public ya(com.p314xaae8f345.mm.p648x55baa833.ui.za zaVar, int i17) {
        this.f146223e = zaVar;
        this.f146222d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.za zaVar = this.f146223e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) zaVar.f146257d;
        int i17 = this.f146222d;
        java.lang.String str = ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) arrayList2.get(i17)).f146198b;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = zaVar.f146260g.f145441d;
        java.lang.String z07 = a3Var != null ? a3Var.z0(((com.p314xaae8f345.mm.p648x55baa833.ui.xa) ((java.util.ArrayList) zaVar.f146257d).get(i17)).f146197a) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            java.lang.String str2 = ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) ((java.util.ArrayList) zaVar.f146257d).get(i17)).f146197a;
            if (str2 == null) {
                str2 = "";
            }
            z07 = Bi.n(str2, true).g2();
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2.T6(zaVar.f146260g, ((com.p314xaae8f345.mm.p648x55baa833.ui.xa) ((java.util.ArrayList) zaVar.f146257d).get(i17)).f146197a, z07, str, true);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
