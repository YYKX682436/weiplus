package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes.dex */
public final class o3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 f242908a;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67) {
        this.f242908a = activityC17393x8aef9d67;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            try {
                android.content.Intent intent = new android.content.Intent("android.settings.FINGERPRINT_ENROLL");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(this.f242908a.mo55332x76847179(), intent, true, false)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d67 = this.f242908a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC17393x8aef9d67, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC17393x8aef9d67.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC17393x8aef9d67, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17393x8aef9d67 activityC17393x8aef9d672 = this.f242908a;
                    android.content.Intent intent2 = new android.content.Intent("android.settings.BIOMETRIC_ENROLL");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC17393x8aef9d672, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC17393x8aef9d672.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC17393x8aef9d672, "com/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI$switchBtnChanged$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (java.lang.Exception e17) {
                rk0.c.b("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] error in goto fingerprint settings, errMsg is " + e17, new java.lang.Object[0]);
            }
        }
    }
}
