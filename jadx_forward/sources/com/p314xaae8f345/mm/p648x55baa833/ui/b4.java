package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class b4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x3 f145584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.c4 f145585e;

    public b4(com.p314xaae8f345.mm.p648x55baa833.ui.c4 c4Var, com.p314xaae8f345.mm.p648x55baa833.ui.x3 x3Var) {
        this.f145585e = c4Var;
        this.f145584d = x3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 g1Var = ((com.p314xaae8f345.mm.p648x55baa833.ui.n3) this.f145585e.f145605h).f145920a.f145310m;
        com.p314xaae8f345.mm.p648x55baa833.ui.x3 x3Var = this.f145584d;
        g1Var.o(x3Var);
        x3Var.f146178m.performHapticFeedback(0, 2);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/GroupToolsManagereUI$ToolAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
