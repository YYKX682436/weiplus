package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class s6 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.c f64505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, in.c cVar) {
        super(1, null);
        this.f64504e = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64505f = cVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI = this.f64504e;
        android.content.Intent intent = new android.content.Intent(roomAccessVerifyApplicationByQrOrInvitationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.class);
        com.tencent.mm.chatroom.ui.u6 u6Var = com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.f63828i;
        intent.putExtra("RoomInfo_Id", roomAccessVerifyApplicationByQrOrInvitationUI.U6());
        in.c cVar = this.f64505f;
        intent.putExtra("room_member", cVar.f292721d);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, roomAccessVerifyApplicationByQrOrInvitationUI.getContext().getString(com.tencent.mm.R.string.iem));
        androidx.appcompat.app.AppCompatActivity context = roomAccessVerifyApplicationByQrOrInvitationUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$updateExtraInfoView$2$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$updateExtraInfoView$2$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewhistory", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f292721d)), 25772);
    }
}
