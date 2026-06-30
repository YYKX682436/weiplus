package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class db implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {
    public db(com.p314xaae8f345.mm.ui.ga gaVar) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (!z17) {
            jx3.f.INSTANCE.d(15181, 2);
            return;
        }
        jx3.f.INSTANCE.d(15181, 3);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
        intent.addFlags(268435456);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController$9", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/MMActivityController$9", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
