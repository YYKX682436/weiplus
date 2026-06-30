package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class la implements com.tencent.mm.plugin.account.ui.ec, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.MobileInputUI f74008d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct f74009e = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();

    /* renamed from: f, reason: collision with root package name */
    public boolean f74010f = false;

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void a(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74008d = mobileInputUI;
        mobileInputUI.f73484i.setVisibility(0);
        mobileInputUI.f73480e.setVisibility(0);
        mobileInputUI.f73481f.requestFocus();
        mobileInputUI.f73490r.setText(com.tencent.mm.R.string.gh8);
        mobileInputUI.f73490r.setVisibility(0);
        mobileInputUI.f73491s.setVisibility(0);
        mobileInputUI.f73493u.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        db5.h4 h4Var = new db5.h4(this.f74008d, 2001, 0);
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
        if (z8Var.a()) {
            h4Var.f228376t = com.tencent.mm.R.string.ghl;
        } else {
            h4Var.f228376t = com.tencent.mm.R.string.ghn;
        }
        arrayList.add(h4Var);
        db5.h4 h4Var2 = new db5.h4(this.f74008d, 2002, 0);
        if (u11.c.c()) {
            h4Var2.f228376t = com.tencent.mm.R.string.ghi;
            arrayList.add(h4Var2);
        }
        if (arrayList.size() > 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f74008d, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.account.ui.ga(this, arrayList);
            k0Var.f211881s = new com.tencent.mm.plugin.account.ui.ha(this);
            k0Var.f211854d = new com.tencent.mm.plugin.account.ui.ia(this);
            this.f74008d.f73494v.setText(com.tencent.mm.R.string.ghm);
            this.f74008d.f73494v.setOnClickListener(new com.tencent.mm.plugin.account.ui.ja(this, k0Var, arrayList, h4Var2));
        } else {
            if (z8Var.a()) {
                this.f74008d.f73494v.setText(com.tencent.mm.R.string.ghl);
            } else {
                this.f74008d.f73494v.setText(com.tencent.mm.R.string.ghn);
            }
            this.f74008d.f73494v.setOnClickListener(new com.tencent.mm.plugin.account.ui.ka(this));
        }
        this.f74008d.f73494v.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void b(com.tencent.mm.plugin.account.ui.dc dcVar) {
        int ordinal = dcVar.ordinal();
        if (ordinal == 0) {
            v61.d.f(2);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2 && this.f74010f) {
                this.f74010f = false;
                c();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74008d;
        mobileInputUI.f73498z = com.tencent.mm.sdk.platformtools.c5.a(mobileInputUI.D);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74008d;
        java.lang.String phoneNumber = mobileInputUI2.f73481f.getText().toString();
        kotlin.jvm.internal.o.g(phoneNumber, "phoneNumber");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNumber).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        mobileInputUI2.A = replaceAll;
        com.tencent.mm.sdk.platformtools.c5.h(this.f74008d.f73498z + this.f74008d.A);
        android.content.Intent intent = new android.content.Intent(this.f74008d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", -1);
        intent.putExtra("mobile_auth_type", 7);
        intent.putExtra("from_switch_account", this.f74008d.N);
        intent.putExtra("couttry_code", this.f74008d.D);
        intent.putExtra("input_mobile_number", this.f74008d.A);
        intent.putExtra("login_sessionid", this.f74008d.T);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74008d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileInputUI3, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "checkMobileState", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileInputUI3, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "checkMobileState", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void c() {
        this.f74008d.L[0] = 1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_switch_account", this.f74008d.N);
        intent.putExtra("login_sessionid", this.f74008d.T);
        intent.setClass(this.f74008d, com.tencent.mm.plugin.account.ui.LoginUI.class);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74008d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mobileInputUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mobileInputUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mobileInputUI, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f74008d.finish();
        v61.d.f(2);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f74008d.f73486n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f74008d.f73486n = null;
        }
        if (m1Var.getType() != 252) {
            m1Var.getType();
        }
        if (m1Var.getType() == 145 && ((h11.e) m1Var).M() == 13) {
            if (i18 == -106) {
                if (tm.a.b(str) != null) {
                    x51.i1.c(this.f74008d, str, 32045);
                    return;
                } else {
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74008d;
                    dp.a.makeText(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                    return;
                }
            }
            if (i18 == -41) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    b17.c(this.f74008d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f74008d, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    return;
                }
            }
            if (i18 == -1) {
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74008d;
                dp.a.makeText(mobileInputUI2, mobileInputUI2.getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            if (i18 == -34) {
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74008d;
                db5.e1.s(mobileInputUI3, mobileInputUI3.getString(com.tencent.mm.R.string.ag7), "");
                return;
            }
            this.f74008d.hideVKB();
            android.content.Intent intent = new android.content.Intent(this.f74008d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", -1);
            intent.putExtra("mobile_auth_type", 7);
            intent.putExtra("from_switch_account", this.f74008d.N);
            intent.putExtra("couttry_code", this.f74008d.D);
            intent.putExtra("input_mobile_number", this.f74008d.A);
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI4 = this.f74008d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mobileInputUI4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileInputUI4.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mobileInputUI4, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void start() {
        gm0.j1.d().a(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.la.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_100");
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void stop() {
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.la.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
