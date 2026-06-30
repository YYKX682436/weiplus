package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class t5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64529e;

    public t5(com.tencent.mm.chatroom.ui.x5 x5Var, com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI) {
        this.f64528d = x5Var;
        this.f64529e = roomAccessVerifyApplicationByQrOrInvitationUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListenerWithRevokeQR$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64528d;
        rl5.r rVar = (rl5.r) ((jz5.n) x5Var.f64653m).getValue();
        com.tencent.mm.chatroom.ui.n5 n5Var = com.tencent.mm.chatroom.ui.n5.f64389d;
        com.tencent.mm.chatroom.ui.s5 s5Var = new com.tencent.mm.chatroom.ui.s5(x5Var, v17, this.f64529e);
        java.lang.Float f17 = x5Var.f64650g;
        int floatValue = f17 != null ? (int) f17.floatValue() : 0;
        java.lang.Float f18 = x5Var.f64651h;
        rVar.h(v17, n5Var, s5Var, floatValue, f18 != null ? (int) f18.floatValue() : 0);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListenerWithRevokeQR$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
