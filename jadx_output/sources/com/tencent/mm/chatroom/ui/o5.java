package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class o5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xy f64407e;

    public o5(com.tencent.mm.chatroom.ui.x5 x5Var, r45.xy xyVar) {
        this.f64406d = x5Var;
        this.f64407e = xyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onClick : left");
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64406d;
        android.content.Context context = x5Var.f64652i;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490604zq), false, false, null);
        com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI = x5Var.f64658r;
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) roomAccessVerifyApplicationByQrOrInvitationUI.f63833h).getValue(), null, new com.tencent.mm.chatroom.ui.v5(this.f64407e, roomAccessVerifyApplicationByQrOrInvitationUI, Q, null), 1, null);
    }
}
