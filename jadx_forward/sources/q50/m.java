package q50;

/* loaded from: classes.dex */
public final class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f441689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f441690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f441691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10609x3df00f35 f441692g;

    public m(java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, com.p314xaae8f345.mm.p689xc5a27af6.p749xd7a392c5.ui.ActivityC10609x3df00f35 activityC10609x3df00f35) {
        this.f441689d = list;
        this.f441690e = h0Var;
        this.f441691f = a3Var;
        this.f441692g = activityC10609x3df00f35;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/PreviewProfileUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_chat_group_avatar", "view_clk", kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290830d))), 32337);
        java.lang.String str = (java.lang.String) this.f441689d.get(i17);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = (java.lang.String) this.f441690e.f391656d;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f441691f;
        java.lang.String z07 = a3Var != null ? a3Var.z0(str) : null;
        intent.putExtra("room_name", str2);
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_ChatRoomId", str2);
        intent.putExtra("Contact_RoomNickname", z07);
        intent.putExtra("Contact_Scene", 14);
        j45.l.j(this.f441692g.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/PreviewProfileUI$onCreate$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
