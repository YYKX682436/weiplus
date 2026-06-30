package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class t7 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.z7 f146079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f146080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in.c f146082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in.b f146083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.p314xaae8f345.mm.p648x55baa833.ui.z7 z7Var, android.content.Context context, java.lang.String str, in.c cVar, in.b bVar) {
        super(1, null);
        this.f146079e = z7Var;
        this.f146080f = context;
        this.f146081g = str;
        this.f146082h = cVar;
        this.f146083i = bVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p648x55baa833.ui.z7 z7Var = this.f146079e;
        android.content.Context context = this.f146080f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.String str = this.f146081g;
        in.c cVar = this.f146082h;
        java.lang.String userName = cVar.f374254d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
        java.lang.String str2 = cVar.f374255e;
        java.lang.String ticket = ((in.a) this.f146083i.f374253f.get(0)).f374248e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket, "ticket");
        com.p314xaae8f345.mm.p648x55baa833.ui.z7.i(z7Var, context, str, userName, str2, null, true, ticket);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewinvitee", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f374254d)), 25772);
    }
}
