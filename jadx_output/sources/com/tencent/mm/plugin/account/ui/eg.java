package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class eg implements js.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.fg f73828a;

    public eg(com.tencent.mm.plugin.account.ui.fg fgVar) {
        this.f73828a = fgVar;
    }

    @Override // js.v0
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("setpwd_ticket");
            com.tencent.mars.xlog.Log.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.account.ui.fg fgVar = this.f73828a;
                com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI regByMobileSetPwdUI = fgVar.f73865d;
                regByMobileSetPwdUI.f73614v = stringExtra;
                regByMobileSetPwdUI.f73615w = 6;
                android.view.View view = regByMobileSetPwdUI.f73609q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = fgVar.f73865d.f73606n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
