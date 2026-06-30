package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public final class o3 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.l3 f74077d;

    /* renamed from: e, reason: collision with root package name */
    public final h11.e f74078e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Application f74079f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f74080g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f74081h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.n3 f74082i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f74083m;

    public o3(android.app.Activity activity, com.tencent.mm.plugin.account.ui.l3 options, h11.e expected) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(expected, "expected");
        this.f74077d = options;
        this.f74078e = expected;
        android.app.Application application = activity.getApplication();
        kotlin.jvm.internal.o.f(application, "getApplication(...)");
        this.f74079f = application;
        this.f74080g = new java.lang.ref.WeakReference(activity);
        com.tencent.mm.plugin.account.ui.n3 n3Var = new com.tencent.mm.plugin.account.ui.n3(this);
        this.f74082i = n3Var;
        application.registerActivityLifecycleCallbacks(n3Var);
    }

    public final void a() {
        if (this.f74083m) {
            return;
        }
        this.f74083m = true;
        try {
            this.f74079f.unregisterActivityLifecycleCallbacks(this.f74082i);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "unregisterActivityLifecycleCallbacks error");
        }
        gm0.j1.d().q(145, this);
        com.tencent.mm.plugin.account.ui.q3.f74130c.post(new com.tencent.mm.plugin.account.ui.m3(this));
        try {
            android.app.ProgressDialog progressDialog = this.f74081h;
            if (progressDialog != null) {
                kotlin.jvm.internal.o.d(progressDialog);
                if (progressDialog.isShowing()) {
                    android.app.ProgressDialog progressDialog2 = this.f74081h;
                    kotlin.jvm.internal.o.d(progressDialog2);
                    progressDialog2.dismiss();
                }
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "dismiss dialog error");
        }
        this.f74081h = null;
    }

    public final void b(int i17, int i18, java.lang.String str, h11.e eVar) {
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "scene is null");
            return;
        }
        if (eVar.M() != 16) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "unexpected opCode: %d", java.lang.Integer.valueOf(eVar.M()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "LOGIN_READY end, errType=%d errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.app.Activity activity = (android.app.Activity) this.f74080g.get();
        if (activity == null || activity.isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "activity gone, abort handle");
            return;
        }
        if (i18 != 0) {
            if (i18 == -41) {
                db5.e1.i(activity, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                return;
            }
            if (i18 == -75) {
                db5.e1.s(activity, activity.getString(com.tencent.mm.R.string.f489997hz), "");
                return;
            }
            if (i18 == -106) {
                x51.i1.c(activity, str, 32045);
                return;
            }
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.c(activity, null, null);
                return;
            }
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = activity.getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            e4Var.c();
            return;
        }
        com.tencent.mm.network.v0 v0Var = eVar.f278071d;
        java.lang.String str2 = ((h11.d) v0Var).f278069b.f342925a.f373526x;
        java.lang.String str3 = ((h11.d) v0Var).f278069b.f342925a.f373527y;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "LOGIN_READY ok, verifyCode=%s toMobile=%s", str2, str3);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI.class);
        com.tencent.mm.plugin.account.ui.l3 l3Var = this.f74077d;
        intent.putExtra("from_mobile", l3Var.f73997a);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_login_sms_up_verify_code", str2);
        intent.putExtra("key_login_sms_up_to_mobile", str3 != null ? str3 : "");
        intent.putExtra("from_switch_account", l3Var.f73998b);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l3Var.f73999c)) {
            intent.putExtra("switch_login_wx_id", l3Var.f73999c);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l3Var.f74000d)) {
            intent.putExtra("last_login_auth_target_username", l3Var.f74000d);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(l3Var.f74001e)) {
            intent.putExtra("last_login_user_showname", l3Var.f74001e);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsLauncher$SceneEndDispatcher", "launchPage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsLauncher$SceneEndDispatcher", "launchPage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == this.f74078e && !this.f74083m) {
            try {
                b(i17, i18, str, m1Var instanceof h11.e ? (h11.e) m1Var : null);
            } finally {
                try {
                    a();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "detach failed", th6);
                }
                com.tencent.mm.plugin.account.ui.q3 q3Var = com.tencent.mm.plugin.account.ui.q3.f74128a;
                com.tencent.mm.plugin.account.ui.q3.f74129b = false;
            }
        }
    }
}
