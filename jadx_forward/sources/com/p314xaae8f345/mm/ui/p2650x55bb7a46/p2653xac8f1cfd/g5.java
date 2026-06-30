package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 f280612d;

    public g5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var) {
        this.f280612d = b5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = this.f280612d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) b5Var.f280113d.f542241c.a(sb5.z.class));
        if (kVar.L0() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingMoreBtnBarHelper", "ignore click del btn, selected items count is 0");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            android.app.Activity g17 = b5Var.f280113d.g();
            db5.e1.B(g17, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f5(this, kVar, g17), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
            tb5.i0.f498588a.c(b5Var.p0(), "del", b5Var.f280113d.x(), b5Var.f280236q);
            yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingMoreComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
