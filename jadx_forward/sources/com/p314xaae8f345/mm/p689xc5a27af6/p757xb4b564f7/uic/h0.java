package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 f148870d;

    public h0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var) {
        this.f148870d = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$MoreConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var = this.f148870d;
        n0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgDeviceUIC", "onMoreClick");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n0Var.m80379x76847179(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = n0Var.f148893e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", n0Var.f148894f);
        android.app.Activity m80379x76847179 = n0Var.m80379x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m80379x76847179, arrayList2.toArray(), "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onMoreClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onMoreClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.k0 k0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.k0(n0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(k0Var, 200L, false);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$MoreConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
