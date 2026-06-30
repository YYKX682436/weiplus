package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class q5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f64449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.b f64450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64452h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64453i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.modelbase.f fVar, in.b bVar, com.tencent.mm.chatroom.ui.x5 x5Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f64448d = u3Var;
        this.f64449e = fVar;
        this.f64450f = bVar;
        this.f64451g = x5Var;
        this.f64452h = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64453i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.chatroom.ui.q5(this.f64448d, this.f64449e, this.f64450f, this.f64451g, this.f64452h, this.f64453i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.chatroom.ui.q5 q5Var = (com.tencent.mm.chatroom.ui.q5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f64448d.dismiss();
        com.tencent.mm.modelbase.f fVar = this.f64449e;
        boolean b17 = fVar.b();
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64451g;
        if (b17) {
            r45.xc3 xc3Var = (r45.xc3) fVar.f70618d;
            r45.xy xyVar = (xc3Var == null || (linkedList = xc3Var.f389968d) == null) ? null : (r45.xy) linkedList.get(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetChatRoomQRCodeStatus:");
            sb6.append(xyVar != null ? new java.lang.Integer(xyVar.f390590e) : null);
            sb6.append(' ');
            sb6.append(xyVar != null ? xyVar.f390589d : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
            if (xyVar == null || xyVar.f390590e != 1) {
                android.content.Context context = x5Var.f64652i;
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = x5Var.f64647d.getContext().getString(com.tencent.mm.R.string.p6e);
                e4Var.c();
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("revoke inviter: ");
                in.b bVar = this.f64450f;
                sb7.append(bVar.f292718d.f292721d);
                sb7.append(", ");
                sb7.append(bVar.f292718d.f292722e);
                sb7.append(' ');
                sb7.append(bVar.f292718d.f292728n);
                com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb7.toString());
                android.content.Context context2 = x5Var.f64652i;
                com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI = this.f64452h;
                java.lang.String string = roomAccessVerifyApplicationByQrOrInvitationUI.getString(com.tencent.mm.R.string.p6i);
                java.lang.String chatRoomName = this.f64453i;
                kotlin.jvm.internal.o.f(chatRoomName, "$chatRoomName");
                in.c inviter = bVar.f292718d;
                kotlin.jvm.internal.o.f(inviter, "inviter");
                android.content.Context context3 = x5Var.f64652i;
                kotlin.jvm.internal.o.f(context3, "access$getContext$p(...)");
                db5.e1.A(context2, string, roomAccessVerifyApplicationByQrOrInvitationUI.getString(com.tencent.mm.R.string.p6j, java.lang.String.valueOf(roomAccessVerifyApplicationByQrOrInvitationUI.V6(chatRoomName, inviter, context3, null))), roomAccessVerifyApplicationByQrOrInvitationUI.getString(com.tencent.mm.R.string.f490567yp), roomAccessVerifyApplicationByQrOrInvitationUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.chatroom.ui.o5(x5Var, xyVar), com.tencent.mm.chatroom.ui.p5.f64424d);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "GetChatRoomQRCodeStatus : fail");
            android.content.Context context4 = x5Var.f64652i;
            db5.t7.g(context4, context4.getResources().getString(com.tencent.mm.R.string.p6f));
        }
        return jz5.f0.f302826a;
    }
}
