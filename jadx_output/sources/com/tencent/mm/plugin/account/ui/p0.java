package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI f74103d;

    public p0(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        this.f74103d = baseLoginVoiceUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI = this.f74103d;
        if (itemId == 7009) {
            com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.e7(baseLoginVoiceUI, baseLoginVoiceUI.getString(com.tencent.mm.R.string.l8k) + com.tencent.mm.sdk.platformtools.m2.d());
            return;
        }
        if (itemId == 7010) {
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            java.lang.String str2 = wo.w0.k() + "_" + java.lang.System.currentTimeMillis();
            java.lang.String e17 = com.tencent.mm.sdk.platformtools.m2.e();
            u11.a a17 = u11.b.a(e17);
            if (a17 != null) {
                e17 = a17.f423728b;
                str = a17.f423729c;
            } else {
                str = "";
            }
            com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.e7(baseLoginVoiceUI, baseLoginVoiceUI.getString(com.tencent.mm.R.string.lse, d17, str2, e17, str));
            return;
        }
        if (itemId == 7012) {
            com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.e7(baseLoginVoiceUI, baseLoginVoiceUI.getString(com.tencent.mm.R.string.ff_, com.tencent.mm.sdk.platformtools.m2.d()));
            return;
        }
        switch (itemId) {
            case com.tencent.liteav.TXLiteAVCode.WARNING_MICROPHONE_HOWLING_DETECTED /* 7002 */:
                baseLoginVoiceUI.I[4] = 1;
                android.content.Intent intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
                intent.putExtra("mobile_input_purpose", 1);
                int[] iArr = new int[5];
                iArr[4] = 1;
                intent.putExtra("kv_report_login_method_data", iArr);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(baseLoginVoiceUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseLoginVoiceUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(baseLoginVoiceUI, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 7003:
                int i18 = com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.L;
                baseLoginVoiceUI.getClass();
                com.tencent.mm.plugin.account.ui.GateWayMobileUI.f73277p.a(baseLoginVoiceUI, new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.class));
                return;
            case 7004:
                com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.U6(baseLoginVoiceUI);
                return;
            default:
                return;
        }
    }
}
