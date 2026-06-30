package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public abstract class ea {
    public static void a(android.app.Activity activity, java.lang.String str, boolean z17) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5.class);
            intent.setFlags(603979776);
            intent.putExtra("room_name", str);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(activity, "com.tencent.mm.plugin.account.ui.bind.BindMobileUI");
            intent2.putExtra("is_bind_for_chatroom_upgrade", true);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(activity, intent2, intent);
            return;
        }
        android.content.Intent intent3 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5.class);
        intent3.setFlags(603979776);
        intent3.putExtra("room_name", str);
        intent3.putExtra("announce_ok", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent3);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/chatroom/ui/RoomUpgradeHelper", "goUpgrade", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/chatroom/ui/RoomUpgradeHelper", "goUpgrade", "(Landroid/app/Activity;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
