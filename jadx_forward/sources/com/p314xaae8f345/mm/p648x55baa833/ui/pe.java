package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public class pe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 f145967d;

    public pe(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 activityC10377x84ecdd3) {
        this.f145967d = activityC10377x84ecdd3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 activityC10377x84ecdd3 = this.f145967d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "[goToChattingUI] username:%s", activityC10377x84ecdd3.f145541d);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Main_User", activityC10377x84ecdd3.f145541d);
        putExtra.putExtra("From_fail_notify", true);
        putExtra.addFlags(67108864);
        putExtra.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        j45.l.u(activityC10377x84ecdd3, "com.tencent.mm.ui.LauncherUI", putExtra, null);
        activityC10377x84ecdd3.finish();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
