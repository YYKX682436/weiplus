package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f64151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.t6 f64152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64155h;

    public f6(in.b bVar, com.tencent.mm.chatroom.ui.t6 t6Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, android.content.Context context, java.lang.String str) {
        this.f64151d = bVar;
        this.f64152e = t6Var;
        this.f64153f = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64154g = context;
        this.f64155h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in.b bVar = this.f64151d;
        int size = bVar.f292719e.size();
        java.util.LinkedList linkedList = bVar.f292720f;
        java.util.LinkedList linkedList2 = bVar.f292719e;
        com.tencent.mm.chatroom.ui.t6 t6Var = this.f64152e;
        if (size > 1) {
            com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
            com.tencent.mm.chatroom.ui.t6.i(t6Var, this.f64153f.U6(), linkedList2, ((in.a) linkedList.get(0)).f292715e);
        } else if (linkedList2.size() == 1) {
            android.content.Context context = this.f64154g;
            kotlin.jvm.internal.o.f(context, "$context");
            java.lang.Object obj = linkedList2.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            in.c cVar = (in.c) obj;
            java.lang.String ticket = ((in.a) linkedList.get(0)).f292715e;
            kotlin.jvm.internal.o.f(ticket, "ticket");
            java.lang.String str = this.f64155h;
            t6Var.getClass();
            un.q qVar = un.w.f429333f;
            java.lang.String userName = cVar.f292721d;
            kotlin.jvm.internal.o.f(userName, "userName");
            qVar.a(context, str, userName, cVar.f292722e, null, true, ticket);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
