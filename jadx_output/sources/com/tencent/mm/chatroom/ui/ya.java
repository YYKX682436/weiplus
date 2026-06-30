package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class ya implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f64689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.za f64690e;

    public ya(com.tencent.mm.chatroom.ui.za zaVar, int i17) {
        this.f64690e = zaVar;
        this.f64689d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.za zaVar = this.f64690e;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) zaVar.f64724d;
        int i17 = this.f64689d;
        java.lang.String str = ((com.tencent.mm.chatroom.ui.xa) arrayList2.get(i17)).f64665b;
        com.tencent.mm.storage.a3 a3Var = zaVar.f64727g.f63908d;
        java.lang.String z07 = a3Var != null ? a3Var.z0(((com.tencent.mm.chatroom.ui.xa) ((java.util.ArrayList) zaVar.f64724d).get(i17)).f64664a) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            java.lang.String str2 = ((com.tencent.mm.chatroom.ui.xa) ((java.util.ArrayList) zaVar.f64724d).get(i17)).f64664a;
            if (str2 == null) {
                str2 = "";
            }
            z07 = Bi.n(str2, true).g2();
        }
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.T6(zaVar.f64727g, ((com.tencent.mm.chatroom.ui.xa) ((java.util.ArrayList) zaVar.f64724d).get(i17)).f64664a, z07, str, true);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
