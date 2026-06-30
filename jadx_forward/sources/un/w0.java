package un;

/* loaded from: classes11.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f510869d;

    public w0(un.g1 g1Var) {
        this.f510869d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry");
        un.g1 g1Var = this.f510869d;
        g1Var.f510797o = null;
        g1Var.f510801s = null;
        g1Var.f510795m = false;
        g1Var.f510799q = false;
        g1Var.f510794i = true;
        g1Var.f510798p = true;
        g1Var.X6();
        ((qg5.p0) ((rd0.v0) i95.n0.c(rd0.v0.class))).getClass();
        java.util.List list = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287734a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "onCreate: msgList is Empty");
        } else {
            g1Var.f510800r = new java.util.ArrayList(list);
        }
        android.util.Pair i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.i(g1Var.m158354x19263085(), "msginfo@fakeuser", true, "msginfo@fakeuser");
        g1Var.f510796n = i17;
        if (((java.lang.Boolean) i17.second).booleanValue()) {
            g1Var.Y6();
        } else {
            ((com.p314xaae8f345.mm.p648x55baa833.ui.uic.C10386x9087a77d) ((jz5.n) g1Var.f510802t).mo141623x754a37bb()).mo48813x58998cd();
        }
        a14.a.a().f82122h++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "click warn to retry, msgId:%s direct:%s", java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5) g1Var.f510796n.first).f231013d), g1Var.f510796n.second);
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$onCreate$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
