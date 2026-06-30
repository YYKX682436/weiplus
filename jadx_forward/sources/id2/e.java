package id2;

/* loaded from: classes3.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.l f372073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f372074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.y6 f372075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc f372076g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f372077h;

    public e(id2.l lVar, r45.j01 j01Var, mm2.y6 y6Var, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.widget.Button button) {
        this.f372073d = lVar;
        this.f372074e = j01Var;
        this.f372075f = y6Var;
        this.f372076g = c23001x9d3a0bdc;
        this.f372077h = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.eq1 eq1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        id2.l lVar = this.f372073d;
        intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", lVar.f372184e);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_UNSELECT", lVar.f372185f);
        intent.putExtra("KEY_PARAMS_WHITE_LIST_CHATROOM_ID", lVar.f372183d);
        r45.j01 j01Var = this.f372074e;
        intent.putExtra("KEY_PARAMS_IS_SUPER_FANS_CLUB", (j01Var == null || (eq1Var = j01Var.A) == null) ? false : eq1Var.m75933x41a8a7f2(10));
        boolean z17 = lVar.f372184e;
        if (z17) {
            lVar.f372184e = !z17;
        }
        mm2.y6 y6Var = this.f372075f;
        y6Var.c(intent);
        intent.setClass(lVar.m80379x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) m158354x19263085).m78751x5dc77fb5(intent)).f279410a = new id2.d(lVar, y6Var, this.f372076g, this.f372077h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$beforeGotoLive$2$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
