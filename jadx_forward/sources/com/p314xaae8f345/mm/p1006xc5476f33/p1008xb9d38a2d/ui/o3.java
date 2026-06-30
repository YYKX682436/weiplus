package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public final class o3 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l3 f155610d;

    /* renamed from: e, reason: collision with root package name */
    public final h11.e f155611e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Application f155612f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f155613g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f155614h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n3 f155615i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f155616m;

    public o3(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l3 options, h11.e expected) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expected, "expected");
        this.f155610d = options;
        this.f155611e = expected;
        android.app.Application application = activity.getApplication();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(application, "getApplication(...)");
        this.f155612f = application;
        this.f155613g = new java.lang.ref.WeakReference(activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n3 n3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n3(this);
        this.f155615i = n3Var;
        application.registerActivityLifecycleCallbacks(n3Var);
    }

    public final void a() {
        if (this.f155616m) {
            return;
        }
        this.f155616m = true;
        try {
            this.f155612f.unregisterActivityLifecycleCallbacks(this.f155615i);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "unregisterActivityLifecycleCallbacks error");
        }
        gm0.j1.d().q(145, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.f155663c.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m3(this));
        try {
            android.app.ProgressDialog progressDialog = this.f155614h;
            if (progressDialog != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog);
                if (progressDialog.isShowing()) {
                    android.app.ProgressDialog progressDialog2 = this.f155614h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(progressDialog2);
                    progressDialog2.dismiss();
                }
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "dismiss dialog error");
        }
        this.f155614h = null;
    }

    public final void b(int i17, int i18, java.lang.String str, h11.e eVar) {
        if (eVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "scene is null");
            return;
        }
        if (eVar.M() != 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "unexpected opCode: %d", java.lang.Integer.valueOf(eVar.M()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "LOGIN_READY end, errType=%d errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.app.Activity activity = (android.app.Activity) this.f155613g.get();
        if (activity == null || activity.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginByMobileSendSmsLauncher", "activity gone, abort handle");
            return;
        }
        if (i18 != 0) {
            if (i18 == -41) {
                db5.e1.i(activity, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                return;
            }
            if (i18 == -75) {
                db5.e1.s(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571530hz), "");
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
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.f293309c = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            e4Var.c();
            return;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
        java.lang.String str2 = ((h11.d) v0Var).f359602b.f424458a.f455059x;
        java.lang.String str3 = ((h11.d) v0Var).f359602b.f424458a.f455060y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginByMobileSendSmsLauncher", "LOGIN_READY ok, verifyCode=%s toMobile=%s", str2, str3);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l3 l3Var = this.f155610d;
        intent.putExtra("from_mobile", l3Var.f155530a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("key_login_sms_up_verify_code", str2);
        intent.putExtra("key_login_sms_up_to_mobile", str3 != null ? str3 : "");
        intent.putExtra("from_switch_account", l3Var.f155531b);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l3Var.f155532c)) {
            intent.putExtra("switch_login_wx_id", l3Var.f155532c);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l3Var.f155533d)) {
            intent.putExtra("last_login_auth_target_username", l3Var.f155533d);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l3Var.f155534e)) {
            intent.putExtra("last_login_user_showname", l3Var.f155534e);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsLauncher$SceneEndDispatcher", "launchPage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsLauncher$SceneEndDispatcher", "launchPage", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == this.f155611e && !this.f155616m) {
            try {
                b(i17, i18, str, m1Var instanceof h11.e ? (h11.e) m1Var : null);
            } finally {
                try {
                    a();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginByMobileSendSmsLauncher", "detach failed", th6);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3 q3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.f155661a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.f155662b = false;
            }
        }
    }
}
