package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class i6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f64223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.t6 f64224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64226g;

    public i6(in.b bVar, com.tencent.mm.chatroom.ui.t6 t6Var, android.content.Context context, java.lang.String str) {
        this.f64223d = bVar;
        this.f64224e = t6Var;
        this.f64225f = context;
        this.f64226g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
        in.b bVar = this.f64223d;
        u6Var.a(bVar);
        android.content.Context context = this.f64225f;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.Object obj = bVar.f292719e.get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        in.c cVar = (in.c) obj;
        java.lang.String ticket = ((in.a) bVar.f292720f.get(0)).f292715e;
        kotlin.jvm.internal.o.f(ticket, "ticket");
        java.lang.String str = this.f64226g;
        this.f64224e.getClass();
        un.q qVar = un.w.f429333f;
        java.lang.String userName = cVar.f292721d;
        kotlin.jvm.internal.o.f(userName, "userName");
        qVar.a(context, str, userName, cVar.f292722e, null, true, ticket);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
