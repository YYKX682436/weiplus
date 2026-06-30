package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI f64417d;

    public oe(com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI weworkRoomUpgradeResultUI) {
        this.f64417d = weworkRoomUpgradeResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "click return wework");
        com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI weworkRoomUpgradeResultUI = this.f64417d;
        com.tencent.mm.chatroom.ui.WeworkRoomUpgradeResultUI.T6(weworkRoomUpgradeResultUI);
        weworkRoomUpgradeResultUI.finish();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
