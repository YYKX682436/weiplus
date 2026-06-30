package com.tencent.mm.chatroom.ui;

/* loaded from: classes4.dex */
public final class v7 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f64600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in.c f64601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(android.content.Context context, java.lang.String str, in.c cVar) {
        super(1, null);
        this.f64599e = context;
        this.f64600f = str;
        this.f64601g = cVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Context context = this.f64599e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.class);
        intent.putExtra("RoomInfo_Id", this.f64600f);
        in.c cVar = this.f64601g;
        intent.putExtra("room_member", cVar.f292721d);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(com.tencent.mm.R.string.iem));
        android.content.Context context2 = this.f64599e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewhistory", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f292721d)), 25772);
    }
}
