package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI f64485d;

    public ra(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        this.f64485d = seeAccessVerifyInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = this.f64485d;
        java.lang.String str = seeAccessVerifyInfoUI.f63916o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        java.lang.String P0 = n17.P0();
        com.tencent.mm.storage.a3 a3Var = seeAccessVerifyInfoUI.f63908d;
        java.lang.String z07 = a3Var != null ? a3Var.z0(seeAccessVerifyInfoUI.f63916o) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = n17.g2();
        }
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI.T6(seeAccessVerifyInfoUI, seeAccessVerifyInfoUI.f63916o, z07, P0, false);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
