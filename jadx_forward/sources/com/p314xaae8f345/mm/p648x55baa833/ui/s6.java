package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class s6 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in.c f146038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, in.c cVar) {
        super(1, null);
        this.f146037e = activityC10349x67700120;
        this.f146038f = cVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120 = this.f146037e;
        android.content.Intent intent = new android.content.Intent(activityC10349x67700120.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60.class);
        com.p314xaae8f345.mm.p648x55baa833.ui.u6 u6Var = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120.f145361i;
        intent.putExtra("RoomInfo_Id", activityC10349x67700120.U6());
        in.c cVar = this.f146038f;
        intent.putExtra("room_member", cVar.f374254d);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC10349x67700120.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iem));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC10349x67700120.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$updateExtraInfoView$2$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationItemHolder$updateExtraInfoView$2$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewhistory", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f374254d)), 25772);
    }
}
