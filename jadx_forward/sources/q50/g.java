package q50;

/* loaded from: classes.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q50.i f441678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c f441679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441680f;

    public g(q50.i iVar, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c activityC0053x3d3f670c, java.lang.String str) {
        this.f441678d = iVar;
        this.f441679e = activityC0053x3d3f670c;
        this.f441680f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f441678d.getClass();
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_Readonly", true).putExtra("Chat_BackBtnStyle", 0).putExtra("kHalfScreenClearTop", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        java.lang.String str = this.f441680f;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
            c11207x71c7a1c1.f153807f = 0;
            c11207x71c7a1c1.f153820v = false;
            putExtra.putExtra("key_start_conversation_request", c11207x71c7a1c1);
        }
        putExtra.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(4));
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).wi(this.f441679e, str, putExtra);
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a.o(str, 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_chat_three_dotdot", "view_clk", kz5.c1.k(new jz5.l("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290830d)), new jz5.l("click_username", str)), 32337);
        yj0.a.h(this, "com/tencent/mm/feature/forward/ui/ForwardPreviewConversationConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
