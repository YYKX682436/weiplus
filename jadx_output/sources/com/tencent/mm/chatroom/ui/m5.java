package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class m5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64361d;

    public m5(com.tencent.mm.chatroom.ui.x5 x5Var) {
        this.f64361d = x5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.chatroom.ui.x5 x5Var = this.f64361d;
        rl5.r rVar = (rl5.r) ((jz5.n) x5Var.f64653m).getValue();
        com.tencent.mm.chatroom.ui.k5 k5Var = com.tencent.mm.chatroom.ui.k5.f64272d;
        com.tencent.mm.chatroom.ui.l5 l5Var = new com.tencent.mm.chatroom.ui.l5(x5Var, view);
        java.lang.Float f17 = x5Var.f64650g;
        int floatValue = f17 != null ? (int) f17.floatValue() : 0;
        java.lang.Float f18 = x5Var.f64651h;
        rVar.h(view, k5Var, l5Var, floatValue, f18 != null ? (int) f18.floatValue() : 0);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
