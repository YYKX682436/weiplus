package g63;

/* loaded from: classes8.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.s f350692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f350693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f350694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g63.b f350695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f350696h;

    public q(g63.s sVar, z53.i iVar, int i17, g63.b bVar, android.view.View view) {
        this.f350692d = sVar;
        this.f350693e = iVar;
        this.f350694f = i17;
        this.f350695g = bVar;
        this.f350696h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f350694f;
        g63.s sVar = this.f350692d;
        g63.s.a(sVar, this.f350693e, 2L, i17);
        z53.i iVar = (z53.i) this.f350695g.f374658i;
        g63.c cVar = sVar.f350705b;
        if (cVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            android.view.View view2 = this.f350696h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "view");
            ((d63.e) ((u53.b0) i95.n0.c(u53.b0.class))).wi();
            g63.t0 t0Var = ((g63.d0) cVar).f350631a.f350639a;
            if (t0Var != null) {
                java.lang.String field_sessionId = iVar.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                java.lang.String field_selfUserName = iVar.f67668x5568d387;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                java.lang.String field_talker = iVar.f67670x114ef53e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_Self", field_selfUserName);
                intent.putExtra("Chat_User", field_sessionId);
                intent.putExtra("finish_direct", true);
                j45.l.u(((com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025) t0Var).mo55332x76847179(), ".ui.chatting.ChattingUI", intent, null);
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(field_talker);
                ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).wi(field_selfUserName);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
