package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class lj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.WelcomeActivity f74022d;

    public lj(com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity) {
        this.f74022d = welcomeActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String[] strArr = com.tencent.mm.plugin.account.ui.WelcomeActivity.f73691h;
        com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity = this.f74022d;
        welcomeActivity.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) != null) {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
        ((cy1.a) rVar).Hj("login_account", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f433441a;
            android.content.Intent intent = new android.content.Intent(welcomeActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginSelectUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity2 = this.f74022d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(welcomeActivity2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welcomeActivity2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(welcomeActivity2, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(welcomeActivity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
            intent2.putExtra("mobile_input_purpose", 1);
            com.tencent.mm.plugin.account.ui.WelcomeActivity welcomeActivity3 = this.f74022d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(welcomeActivity3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welcomeActivity3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(welcomeActivity3, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/WelcomeActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
