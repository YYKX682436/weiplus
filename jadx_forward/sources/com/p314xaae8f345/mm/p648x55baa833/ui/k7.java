package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class k7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.m7 f145809d;

    public k7(com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var) {
        this.f145809d = m7Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var = this.f145809d;
        rl5.r rVar = (rl5.r) ((jz5.n) m7Var.f145900h).mo141623x754a37bb();
        com.p314xaae8f345.mm.p648x55baa833.ui.i7 i7Var = new com.p314xaae8f345.mm.p648x55baa833.ui.i7();
        com.p314xaae8f345.mm.p648x55baa833.ui.j7 j7Var = new com.p314xaae8f345.mm.p648x55baa833.ui.j7(m7Var, v17);
        java.lang.Float f17 = m7Var.f145898f;
        int floatValue = f17 != null ? (int) f17.floatValue() : 0;
        java.lang.Float f18 = m7Var.f145899g;
        rVar.h(v17, i7Var, j7Var, floatValue, f18 != null ? (int) f18.floatValue() : 0);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
