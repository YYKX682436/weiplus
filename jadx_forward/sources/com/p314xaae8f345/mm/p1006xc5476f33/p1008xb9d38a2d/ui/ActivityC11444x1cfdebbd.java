package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginVoiceUI */
/* loaded from: classes14.dex */
public class ActivityC11444x1cfdebbd extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e {
    public static final /* synthetic */ int M = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e
    public void X6() {
        super.X6();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154788p;
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(w6Var.f155819b, this.C, "", 0);
        v0Var.T(this.C);
        java.lang.String str = this.C;
        if (str != null) {
            str.length();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.C);
        java.lang.String str2 = w6Var.f155820c;
        if (str2 != null) {
            str2.length();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(w6Var.f155820c);
        this.f154786n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y7(this, v0Var));
        gm0.j1.d().g(v0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e
    public boolean c7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570766bt2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        tm.a b17;
        super.mo43517x10010bd5();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("key_errMsg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "initView,errType %d,errCode %d", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.b(intExtra, intExtra2) || (b17 = tm.a.b(stringExtra)) == null) {
                return;
            }
            b17.d(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z7(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = 4;
        android.view.View view = this.f154781f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginVoiceUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.p314xaae8f345.mm.R.id.p5d).setEnabled(false);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p5m)).setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f561085ab3));
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p5m)).setBackgroundResource(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f154781f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x7(this));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).V6();
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.j.f441794a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginVoiceUI$$a
            @Override // q61.k
            public final void a(final boolean z17, r45.nf5 nf5Var) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.M;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd activityC11444x1cfdebbd = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.this;
                activityC11444x1cfdebbd.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                activityC11444x1cfdebbd.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginVoiceUI$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd activityC11444x1cfdebbd2 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.this;
                        java.lang.ref.WeakReference weakReference3 = weakReference2;
                        boolean z18 = z17;
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.M;
                        activityC11444x1cfdebbd2.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd activityC11444x1cfdebbd3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd) weakReference3.get();
                        if (!z18 || activityC11444x1cfdebbd3 == null || activityC11444x1cfdebbd3.isFinishing()) {
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "isEnableChange：%b isNotTimeOut:%b", java.lang.Boolean.valueOf((activityC11444x1cfdebbd2.f154781f == null || activityC11444x1cfdebbd2.mo78538xecd98af8()) ? false : true), java.lang.Boolean.valueOf(q61.j.f441799f));
                        if (((activityC11444x1cfdebbd2.f154781f == null || activityC11444x1cfdebbd2.mo78538xecd98af8()) ? false : true) && q61.j.f441799f) {
                            boolean z19 = activityC11444x1cfdebbd2.getIntent().getIntExtra("LastLoginType", -2) == -1;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI LastLoginType %d", java.lang.Integer.valueOf(activityC11444x1cfdebbd2.getIntent().getIntExtra("LastLoginType", -2)));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI loginType %d", java.lang.Integer.valueOf(activityC11444x1cfdebbd2.G));
                            if (z19 && activityC11444x1cfdebbd2.G > 3) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "gotoFastSwitchLogin");
                                db5.f.h(activityC11444x1cfdebbd2);
                                android.content.Intent intent = new android.content.Intent(activityC11444x1cfdebbd2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
                                intent.putExtra("login_sessionid", activityC11444x1cfdebbd2.H);
                                intent.putExtra("login_type", 3);
                                intent.putExtra("switch_login_wx_id", activityC11444x1cfdebbd2.f154794v);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(intent);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(activityC11444x1cfdebbd2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "gotoFastSwitchLogin", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                activityC11444x1cfdebbd2.startActivity((android.content.Intent) arrayList2.get(0));
                                yj0.a.f(activityC11444x1cfdebbd2, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "gotoFastSwitchLogin", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i0(activityC11444x1cfdebbd2), 100L);
                                db5.f.h(activityC11444x1cfdebbd2);
                                return;
                            }
                        }
                        activityC11444x1cfdebbd2.V6();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginVoiceUI", "PushLoginURLTAG3MainDeviceCGI scuccess but can not change");
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class);
    }
}
