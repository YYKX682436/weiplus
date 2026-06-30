package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class m5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f145894d;

    public m5(com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var) {
        this.f145894d = x5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f145894d;
        rl5.r rVar = (rl5.r) ((jz5.n) x5Var.f146186m).mo141623x754a37bb();
        com.p314xaae8f345.mm.p648x55baa833.ui.k5 k5Var = com.p314xaae8f345.mm.p648x55baa833.ui.k5.f145805d;
        com.p314xaae8f345.mm.p648x55baa833.ui.l5 l5Var = new com.p314xaae8f345.mm.p648x55baa833.ui.l5(x5Var, view);
        java.lang.Float f17 = x5Var.f146183g;
        int floatValue = f17 != null ? (int) f17.floatValue() : 0;
        java.lang.Float f18 = x5Var.f146184h;
        rVar.h(view, k5Var, l5Var, floatValue, f18 != null ? (int) f18.floatValue() : 0);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
