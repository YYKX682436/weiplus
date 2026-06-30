package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 f148858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0 f148859e;

    public c0(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var, com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0 e0Var) {
        this.f148858d = n0Var;
        this.f148859e = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zh1.w0 w0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0 n0Var = this.f148858d;
        n0Var.getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.e0 item = this.f148859e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgDeviceUIC", "onDeviceClick item:" + item);
        db0.j jVar = n0Var.f148895g;
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = item.f148863d;
        if (jVar != null && (w0Var = jVar.f309364a) != null) {
            ((di1.f) w0Var).h(1L, c10597xb1f0d2.f148119d, c10597xb1f0d2.f148121f, c10597xb1f0d2.f148127o ? c10597xb1f0d2.f148128p : 3L);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n0Var.m80379x76847179(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = n0Var.f148893e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", n0Var.f148894f);
        intent.putExtra("NetworkDeviceInfo", c10597xb1f0d2);
        android.app.Activity m80379x76847179 = n0Var.m80379x76847179();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(m80379x76847179, arrayList2.toArray(), "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onDeviceClick", "(Lcom/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onDeviceClick", "(Lcom/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
