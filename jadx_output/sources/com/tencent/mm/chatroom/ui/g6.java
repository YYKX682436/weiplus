package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in.b f64180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.t6 f64181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64182f;

    public g6(in.b bVar, com.tencent.mm.chatroom.ui.t6 t6Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        this.f64180d = bVar;
        this.f64181e = t6Var;
        this.f64182f = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
        in.b bVar = this.f64180d;
        u6Var.a(bVar);
        com.tencent.mm.chatroom.ui.t6.i(this.f64181e, this.f64182f.U6(), bVar.f292719e, ((in.a) bVar.f292720f.get(0)).f292715e);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
