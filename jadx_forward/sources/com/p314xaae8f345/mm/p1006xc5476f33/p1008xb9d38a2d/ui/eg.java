package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes11.dex */
public class eg implements js.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fg f155361a;

    public eg(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fg fgVar) {
        this.f155361a = fgVar;
    }

    @Override // js.v0
    /* renamed from: onActivityResult */
    public void mo48693x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("setpwd_ticket");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fg fgVar = this.f155361a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc activityC11463xc681e6dc = fgVar.f155398d;
                activityC11463xc681e6dc.f155147v = stringExtra;
                activityC11463xc681e6dc.f155148w = 6;
                android.view.View view = activityC11463xc681e6dc.f155142q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI$1$1", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = fgVar.f155398d.f155139n;
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
