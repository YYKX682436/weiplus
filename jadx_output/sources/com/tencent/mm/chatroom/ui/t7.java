package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class t7 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z7 f64546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in.c f64549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in.b f64550i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.chatroom.ui.z7 z7Var, android.content.Context context, java.lang.String str, in.c cVar, in.b bVar) {
        super(1, null);
        this.f64546e = z7Var;
        this.f64547f = context;
        this.f64548g = str;
        this.f64549h = cVar;
        this.f64550i = bVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        com.tencent.mm.chatroom.ui.z7 z7Var = this.f64546e;
        android.content.Context context = this.f64547f;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.String str = this.f64548g;
        in.c cVar = this.f64549h;
        java.lang.String userName = cVar.f292721d;
        kotlin.jvm.internal.o.f(userName, "userName");
        java.lang.String str2 = cVar.f292722e;
        java.lang.String ticket = ((in.a) this.f64550i.f292720f.get(0)).f292715e;
        kotlin.jvm.internal.o.f(ticket, "ticket");
        com.tencent.mm.chatroom.ui.z7.i(z7Var, context, str, userName, str2, null, true, ticket);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewinvitee", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f292721d)), 25772);
    }
}
