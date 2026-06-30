package b04;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f98418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98419e;

    public d0(b04.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185) {
        this.f98418d = j0Var;
        this.f98419e = c22675xc8629185;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "moreBtnClickListener() called");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f98419e;
        al5.s0 s0Var = new al5.s0(c22675xc8629185.getContext(), 1, false);
        b04.j0 j0Var = this.f98418d;
        j0Var.f98449e = s0Var;
        al5.s0 s0Var2 = j0Var.f98449e;
        if (s0Var2 != null) {
            s0Var2.f293405n = new b04.b0(j0Var);
        }
        if (s0Var2 != null) {
            s0Var2.f293414s = new b04.c0(j0Var, c22675xc8629185);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.m("view_clk", "face2face_get_red_packets_more_btn", j0Var.T6());
        al5.s0 s0Var3 = j0Var.f98449e;
        if (s0Var3 != null) {
            s0Var3.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/qrcode/RedPacketUIC$createItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
