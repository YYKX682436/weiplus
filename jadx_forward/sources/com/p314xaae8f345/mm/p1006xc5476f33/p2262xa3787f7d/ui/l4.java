package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public class l4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.m4 f254595a;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.m4 m4Var) {
        this.f254595a = m4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.m4 m4Var = this.f254595a;
            android.content.Intent intent = new android.content.Intent(m4Var.f254605d.f254614d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.class);
            intent.putExtra("intent_process", 5);
            com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9 activityC18580x3cc47ed9 = m4Var.f254605d.f254614d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC18580x3cc47ed9, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18580x3cc47ed9.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC18580x3cc47ed9, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
