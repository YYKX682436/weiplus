package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.n0 f67325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.e0 f67326e;

    public c0(com.tencent.mm.feature.openmsg.uic.n0 n0Var, com.tencent.mm.feature.openmsg.uic.e0 e0Var) {
        this.f67325d = n0Var;
        this.f67326e = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zh1.w0 w0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.openmsg.uic.n0 n0Var = this.f67325d;
        n0Var.getClass();
        com.tencent.mm.feature.openmsg.uic.e0 item = this.f67326e;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgDeviceUIC", "onDeviceClick item:" + item);
        db0.j jVar = n0Var.f67362g;
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = item.f67330d;
        if (jVar != null && (w0Var = jVar.f227831a) != null) {
            ((di1.f) w0Var).h(1L, networkDeviceInfo.f66586d, networkDeviceInfo.f66588f, networkDeviceInfo.f66594o ? networkDeviceInfo.f66595p : 3L);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n0Var.getContext(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI");
        com.tencent.mm.storage.f9 f9Var = n0Var.f67360e;
        kotlin.jvm.internal.o.d(f9Var);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", n0Var.f67361f);
        intent.putExtra("NetworkDeviceInfo", networkDeviceInfo);
        android.app.Activity context = n0Var.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onDeviceClick", "(Lcom/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC", "onDeviceClick", "(Lcom/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/uic/OpenMsgDeviceUIC$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
