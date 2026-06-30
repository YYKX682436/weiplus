package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee f146168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jt5 f146169e;

    public x1(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee, r45.jt5 jt5Var) {
        this.f146168d = activityC10339x9e5e23ee;
        this.f146169e = jt5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/ChatroomManagerUI$showGroupBindAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee = this.f146168d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = activityC10339x9e5e23ee.f145272r;
        if (z2Var != null) {
            z2Var.B();
        }
        activityC10339x9e5e23ee.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC10339x9e5e23ee.mo55332x76847179(), 1, true);
        r45.jt5 jt5Var = this.f146169e;
        k0Var.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(activityC10339x9e5e23ee.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayd, jt5Var.f459633e), new java.lang.Object[0]), 17, i65.a.b(activityC10339x9e5e23ee, 14), null);
        k0Var.f293405n = new com.p314xaae8f345.mm.p648x55baa833.ui.b2(activityC10339x9e5e23ee);
        k0Var.f293414s = new com.p314xaae8f345.mm.p648x55baa833.ui.d2(jt5Var, activityC10339x9e5e23ee, k0Var);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/ChatroomManagerUI$showGroupBindAppInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
