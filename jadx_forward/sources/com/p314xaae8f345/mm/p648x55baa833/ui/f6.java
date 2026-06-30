package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f145684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.t6 f145685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f145686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f145687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145688h;

    public f6(in.b bVar, com.p314xaae8f345.mm.p648x55baa833.ui.t6 t6Var, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, android.content.Context context, java.lang.String str) {
        this.f145684d = bVar;
        this.f145685e = t6Var;
        this.f145686f = activityC10349x67700120;
        this.f145687g = context;
        this.f145688h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in.b bVar = this.f145684d;
        int size = bVar.f374252e.size();
        java.util.LinkedList linkedList = bVar.f374253f;
        java.util.LinkedList linkedList2 = bVar.f374252e;
        com.p314xaae8f345.mm.p648x55baa833.ui.t6 t6Var = this.f145685e;
        if (size > 1) {
            com.p314xaae8f345.mm.p648x55baa833.ui.u6 u6Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120.f145361i;
            com.p314xaae8f345.mm.p648x55baa833.ui.t6.i(t6Var, this.f145686f.U6(), linkedList2, ((in.a) linkedList.get(0)).f374248e);
        } else if (linkedList2.size() == 1) {
            android.content.Context context = this.f145687g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            java.lang.Object obj = linkedList2.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            in.c cVar = (in.c) obj;
            java.lang.String ticket = ((in.a) linkedList.get(0)).f374248e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket, "ticket");
            java.lang.String str = this.f145688h;
            t6Var.getClass();
            un.q qVar = un.w.f510866f;
            java.lang.String userName = cVar.f374254d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "userName");
            qVar.a(context, str, userName, cVar.f374255e, null, true, ticket);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
