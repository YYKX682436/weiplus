package od5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od5.g f426190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f426191e;

    public d(od5.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f426190d = gVar;
        this.f426191e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/mvvm/MvvmChattingItem$dealItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sb5.g1 g1Var = (sb5.g1) this.f426190d.f426195f.f542241c.a(sb5.g1.class);
        long mo78012x3fdd41df = this.f426191e.mo78012x3fdd41df();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f6 f6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f6) g1Var;
        f6Var.getClass();
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20051x1b5725bd()) != 0) {
            f6Var.f280546e = !f6Var.f280546e;
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) f6Var.f280113d.f542241c.a(sb5.z.class))).h(new java.lang.Object());
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "in_chat_time_button");
            lVarArr[1] = new jz5.l("chat_name", f6Var.f280113d.x());
            lVarArr[2] = new jz5.l("after_click_time_status", java.lang.Integer.valueOf(f6Var.f280546e ? 1 : 2));
            lVarArr[3] = new jz5.l("message_timestamp", java.lang.Long.valueOf(mo78012x3fdd41df));
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 35480);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMsgTimeDetailComponent", "changeShowTimeDetailState: " + f6Var.f280546e);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItem$dealItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
