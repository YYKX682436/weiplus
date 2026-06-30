package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class t5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f146061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146062e;

    public t5(com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120) {
        this.f146061d = x5Var;
        this.f146062e = activityC10349x67700120;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListenerWithRevokeQR$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f146061d;
        rl5.r rVar = (rl5.r) ((jz5.n) x5Var.f146186m).mo141623x754a37bb();
        com.p314xaae8f345.mm.p648x55baa833.ui.n5 n5Var = com.p314xaae8f345.mm.p648x55baa833.ui.n5.f145922d;
        com.p314xaae8f345.mm.p648x55baa833.ui.s5 s5Var = new com.p314xaae8f345.mm.p648x55baa833.ui.s5(x5Var, v17, this.f146062e);
        java.lang.Float f17 = x5Var.f146183g;
        int floatValue = f17 != null ? (int) f17.floatValue() : 0;
        java.lang.Float f18 = x5Var.f146184h;
        rVar.h(v17, n5Var, s5Var, floatValue, f18 != null ? (int) f18.floatValue() : 0);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$longClickListenerWithRevokeQR$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
