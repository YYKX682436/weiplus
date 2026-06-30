package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class v7 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f146132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in.c f146134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(android.content.Context context, java.lang.String str, in.c cVar) {
        super(1, null);
        this.f146132e = context;
        this.f146133f = str;
        this.f146134g = cVar;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Context context = this.f146132e;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10375x35d0ae60.class);
        intent.putExtra("RoomInfo_Id", this.f146133f);
        in.c cVar = this.f146134g;
        intent.putExtra("room_member", cVar.f374254d);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iem));
        android.content.Context context2 = this.f146132e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationItemHolder$onBindViewHolder$6$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("base_chatroom_invite_manage_viewhistory", view, kz5.b1.e(new jz5.l("Invitee_username", cVar.f374254d)), 25772);
    }
}
