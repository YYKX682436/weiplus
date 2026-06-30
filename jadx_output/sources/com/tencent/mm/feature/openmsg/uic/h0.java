package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n0 f67337d;

    public h0(com.tencent.mm.feature.openmsg.uic.n0 n0Var) {
        this.f67337d = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$MoreConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.openmsg.uic.n0 n0Var = this.f67337d;
        n0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgDeviceUIC", "onMoreClick");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n0Var.getContext(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        com.tencent.mm.storage.f9 f9Var = n0Var.f67360e;
        kotlin.jvm.internal.o.d(f9Var);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", n0Var.f67361f);
        android.app.Activity context = n0Var.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onMoreClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onMoreClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.feature.openmsg.uic.k0 k0Var = new com.tencent.mm.feature.openmsg.uic.k0(n0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(k0Var, 200L, false);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$MoreConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
