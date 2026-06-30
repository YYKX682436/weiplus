package un;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f510778d;

    public d0(un.k0 k0Var) {
        this.f510778d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/uic/ChatroomSearchMemberUIC$onCreate$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = this.f510778d.P6();
        if (P6 != null) {
            P6.finish();
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/uic/ChatroomSearchMemberUIC$onCreate$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
