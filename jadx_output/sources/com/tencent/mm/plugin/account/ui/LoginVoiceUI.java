package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginVoiceUI extends com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI {
    public static final /* synthetic */ int M = 0;

    @Override // com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI
    public void X6() {
        super.X6();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73255p;
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(w6Var.f74286b, this.C, "", 0);
        v0Var.T(this.C);
        java.lang.String str = this.C;
        if (str != null) {
            str.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(this.C);
        java.lang.String str2 = w6Var.f74287c;
        if (str2 != null) {
            str2.length();
        }
        com.tencent.mm.sdk.platformtools.t8.G1(w6Var.f74287c);
        this.f73253n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.y7(this, v0Var));
        gm0.j1.d().g(v0Var);
    }

    @Override // com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI
    public boolean c7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489233bt2;
    }

    @Override // com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        tm.a b17;
        super.initView();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("key_errMsg");
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "initView,errType %d,errCode %d", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2));
            if (!com.tencent.mm.plugin.account.ui.d.b(intExtra, intExtra2) || (b17 = tm.a.b(stringExtra)) == null) {
                return;
            }
            b17.d(this, new com.tencent.mm.plugin.account.ui.z7(this));
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = 4;
        android.view.View view = this.f73248f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.tencent.mm.R.id.p5d).setEnabled(false);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.p5m)).setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.f479552ab3));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.p5m)).setBackgroundResource(getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f73248f.setOnClickListener(new com.tencent.mm.plugin.account.ui.x7(this));
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).V6();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.j.f360261a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginVoiceUI$$a
            @Override // q61.k
            public final void a(final boolean z17, r45.nf5 nf5Var) {
                int i17 = com.tencent.mm.plugin.account.ui.LoginVoiceUI.M;
                final com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI = com.tencent.mm.plugin.account.ui.LoginVoiceUI.this;
                loginVoiceUI.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                loginVoiceUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginVoiceUI$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI2 = com.tencent.mm.plugin.account.ui.LoginVoiceUI.this;
                        java.lang.ref.WeakReference weakReference3 = weakReference2;
                        boolean z18 = z17;
                        int i18 = com.tencent.mm.plugin.account.ui.LoginVoiceUI.M;
                        loginVoiceUI2.getClass();
                        com.tencent.mm.plugin.account.ui.LoginVoiceUI loginVoiceUI3 = (com.tencent.mm.plugin.account.ui.LoginVoiceUI) weakReference3.get();
                        if (!z18 || loginVoiceUI3 == null || loginVoiceUI3.isFinishing()) {
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "isEnableChange：%b isNotTimeOut:%b", java.lang.Boolean.valueOf((loginVoiceUI2.f73248f == null || loginVoiceUI2.isPaused()) ? false : true), java.lang.Boolean.valueOf(q61.j.f360266f));
                        if (((loginVoiceUI2.f73248f == null || loginVoiceUI2.isPaused()) ? false : true) && q61.j.f360266f) {
                            boolean z19 = loginVoiceUI2.getIntent().getIntExtra("LastLoginType", -2) == -1;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI LastLoginType %d", java.lang.Integer.valueOf(loginVoiceUI2.getIntent().getIntExtra("LastLoginType", -2)));
                            com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI loginType %d", java.lang.Integer.valueOf(loginVoiceUI2.G));
                            if (z19 && loginVoiceUI2.G > 3) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "gotoFastSwitchLogin");
                                db5.f.h(loginVoiceUI2);
                                android.content.Intent intent = new android.content.Intent(loginVoiceUI2, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
                                intent.putExtra("login_sessionid", loginVoiceUI2.H);
                                intent.putExtra("login_type", 3);
                                intent.putExtra("switch_login_wx_id", loginVoiceUI2.f73261v);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(intent);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(loginVoiceUI2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "gotoFastSwitchLogin", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                loginVoiceUI2.startActivity((android.content.Intent) arrayList2.get(0));
                                yj0.a.f(loginVoiceUI2, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "gotoFastSwitchLogin", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.account.ui.i0(loginVoiceUI2), 100L);
                                db5.f.h(loginVoiceUI2);
                                return;
                            }
                        }
                        loginVoiceUI2.V6();
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI scuccess but can not change");
                    }
                });
            }
        });
    }

    @Override // com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.account.ui.k3.class);
    }
}
