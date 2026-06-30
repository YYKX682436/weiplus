package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class i6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f145756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.t6 f145757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145759g;

    public i6(in.b bVar, com.p314xaae8f345.mm.p648x55baa833.ui.t6 t6Var, android.content.Context context, java.lang.String str) {
        this.f145756d = bVar;
        this.f145757e = t6Var;
        this.f145758f = context;
        this.f145759g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.u6 u6Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120.f145361i;
        in.b bVar = this.f145756d;
        u6Var.a(bVar);
        android.content.Context context = this.f145758f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.Object obj = bVar.f374252e.get(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        in.c cVar = (in.c) obj;
        java.lang.String ticket = ((in.a) bVar.f374253f.get(0)).f374248e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket, "ticket");
        java.lang.String str = this.f145759g;
        this.f145757e.getClass();
        un.q qVar = un.w.f510866f;
        java.lang.String userName = cVar.f374254d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
        qVar.a(context, str, userName, cVar.f374255e, null, true, ticket);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
