package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64503f;

    public s5(com.tencent.mm.chatroom.ui.x5 x5Var, android.view.View view, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        this.f64501d = x5Var;
        this.f64502e = view;
        this.f64503f = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMMMenuItemSelected : id=");
        sb6.append(menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null);
        sb6.append(", index=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", sb6.toString());
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        android.view.View view = this.f64502e;
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64501d;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : delete");
                java.util.List list = x5Var.f64648e;
                java.lang.Object tag = view.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
                ((dm.w9) list.get(((java.lang.Integer) tag).intValue())).deleteFromDB(gm0.j1.u().f273153f, true);
                return;
            }
            return;
        }
        in.b bVar = new in.b();
        java.util.List list2 = x5Var.f64648e;
        java.lang.Object tag2 = view.getTag();
        kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.Int");
        bVar.parseFrom(((dm.w9) list2.get(((java.lang.Integer) tag2).intValue())).field_data);
        java.util.List list3 = x5Var.f64648e;
        java.lang.Object tag3 = view.getTag();
        kotlin.jvm.internal.o.e(tag3, "null cannot be cast to non-null type kotlin.Int");
        java.lang.String str = ((dm.w9) list3.get(((java.lang.Integer) tag3).intValue())).field_chatRoomName;
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onMMMenuItemSelected : revoke");
        android.content.Context context = x5Var.f64652i;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
        com.tencent.mm.chatroom.ui.x5 x5Var2 = this.f64501d;
        v65.i.b(x5Var2.f64649f, null, new com.tencent.mm.chatroom.ui.r5(str, bVar, Q, x5Var2, this.f64503f, null), 1, null);
    }
}
