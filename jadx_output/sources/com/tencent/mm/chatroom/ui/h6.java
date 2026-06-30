package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class h6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.t6 f64204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.b f64206f;

    public h6(com.tencent.mm.chatroom.ui.t6 t6Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, in.b bVar) {
        this.f64204d = t6Var;
        this.f64205e = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64206f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
        java.lang.String U6 = this.f64205e.U6();
        in.b bVar = this.f64206f;
        com.tencent.mm.chatroom.ui.t6.i(this.f64204d, U6, bVar.f292719e, ((in.a) bVar.f292720f.get(0)).f292715e);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
