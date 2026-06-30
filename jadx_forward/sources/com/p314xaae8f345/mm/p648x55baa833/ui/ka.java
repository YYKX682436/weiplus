package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 f145813d;

    public ka(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5) {
        this.f145813d = activityC10361xc5a22f5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5 = this.f145813d;
        int i17 = activityC10361xc5a22f5.f145438u;
        if (i17 != 1) {
            if (i17 == 2 || i17 == 5) {
                if (activityC10361xc5a22f5.f145440w) {
                    activityC10361xc5a22f5.T6();
                } else {
                    android.content.Intent intent = new android.content.Intent(activityC10361xc5a22f5, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10352xd9ce0ff6.class);
                    intent.putExtra("need_bind_mobile", false);
                    intent.putExtra("RoomInfo_Id", activityC10361xc5a22f5.f145424d);
                    activityC10361xc5a22f5.startActivityForResult(intent, 600);
                }
            }
        } else if (activityC10361xc5a22f5.f145440w) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ea.a(activityC10361xc5a22f5, activityC10361xc5a22f5.f145424d, true);
        } else {
            android.content.Intent intent2 = new android.content.Intent(activityC10361xc5a22f5, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10352xd9ce0ff6.class);
            intent2.putExtra("need_bind_mobile", true);
            intent2.putExtra("RoomInfo_Id", activityC10361xc5a22f5.f145424d);
            activityC10361xc5a22f5.startActivityForResult(intent2, 600);
        }
        yj0.a.h(this, "com/tencent/mm/chatroom/ui/RoomUpgradeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
