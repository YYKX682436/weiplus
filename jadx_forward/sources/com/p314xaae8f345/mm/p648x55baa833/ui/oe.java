package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public class oe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 f145950d;

    public oe(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 activityC10377x84ecdd3) {
        this.f145950d = activityC10377x84ecdd3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeworkRoomUpgradeResultUI", "click return wework");
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3 activityC10377x84ecdd3 = this.f145950d;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10377x84ecdd3.T6(activityC10377x84ecdd3);
        activityC10377x84ecdd3.finish();
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/WeworkRoomUpgradeResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
