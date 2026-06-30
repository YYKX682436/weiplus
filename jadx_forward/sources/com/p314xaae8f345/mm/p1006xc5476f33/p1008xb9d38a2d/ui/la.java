package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class la implements com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155541d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 f155542e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();

    /* renamed from: f, reason: collision with root package name */
    public boolean f155543f = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc) {
        this.f155541d = activityC11453xa58e34bc;
        activityC11453xa58e34bc.f155017i.setVisibility(0);
        activityC11453xa58e34bc.f155013e.setVisibility(0);
        activityC11453xa58e34bc.f155014f.requestFocus();
        activityC11453xa58e34bc.f155023r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gh8);
        activityC11453xa58e34bc.f155023r.setVisibility(0);
        activityC11453xa58e34bc.f155024s.setVisibility(0);
        activityC11453xa58e34bc.f155026u.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        db5.h4 h4Var = new db5.h4(this.f155541d, 2001, 0);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
        if (z8Var.a()) {
            h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.ghl;
        } else {
            h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.ghn;
        }
        arrayList.add(h4Var);
        db5.h4 h4Var2 = new db5.h4(this.f155541d, 2002, 0);
        if (u11.c.c()) {
            h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.ghi;
            arrayList.add(h4Var2);
        }
        if (arrayList.size() > 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f155541d, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ga(this, arrayList);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ha(this);
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ia(this);
            this.f155541d.f155027v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghm);
            this.f155541d.f155027v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ja(this, k0Var, arrayList, h4Var2));
        } else {
            if (z8Var.a()) {
                this.f155541d.f155027v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghl);
            } else {
                this.f155541d.f155027v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ghn);
            }
            this.f155541d.f155027v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ka(this));
        }
        this.f155541d.f155027v.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc dcVar) {
        int ordinal = dcVar.ordinal();
        if (ordinal == 0) {
            v61.d.f(2);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2 && this.f155543f) {
                this.f155543f = false;
                c();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155541d;
        activityC11453xa58e34bc.f155031z = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.a(activityC11453xa58e34bc.D);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155541d;
        java.lang.String phoneNumber = activityC11453xa58e34bc2.f155014f.getText().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneNumber, "phoneNumber");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNumber).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        activityC11453xa58e34bc2.A = replaceAll;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f155541d.f155031z + this.f155541d.A);
        android.content.Intent intent = new android.content.Intent(this.f155541d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
        intent.putExtra("mobile_input_purpose", -1);
        intent.putExtra("mobile_auth_type", 7);
        intent.putExtra("from_switch_account", this.f155541d.N);
        intent.putExtra("couttry_code", this.f155541d.D);
        intent.putExtra("input_mobile_number", this.f155541d.A);
        intent.putExtra("login_sessionid", this.f155541d.T);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155541d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11453xa58e34bc3, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "checkMobileState", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11453xa58e34bc3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11453xa58e34bc3, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "checkMobileState", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void c() {
        this.f155541d.L[0] = 1;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_switch_account", this.f155541d.N);
        intent.putExtra("login_sessionid", this.f155541d.T);
        intent.setClass(this.f155541d, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155541d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC11453xa58e34bc, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11453xa58e34bc.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC11453xa58e34bc, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "jumpToLoginWeXinQQMail", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f155541d.finish();
        v61.d.f(2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputLoginLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155541d.f155019n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f155541d.f155019n = null;
        }
        if (m1Var.mo808xfb85f7b0() != 252) {
            m1Var.mo808xfb85f7b0();
        }
        if (m1Var.mo808xfb85f7b0() == 145 && ((h11.e) m1Var).M() == 13) {
            if (i18 == -106) {
                if (tm.a.b(str) != null) {
                    x51.i1.c(this.f155541d, str, 32045);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155541d;
                    dp.a.m125854x26a183b(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                    return;
                }
            }
            if (i18 == -41) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    b17.c(this.f155541d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f155541d, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    return;
                }
            }
            if (i18 == -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155541d;
                dp.a.m125854x26a183b(activityC11453xa58e34bc2, activityC11453xa58e34bc2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            if (i18 == -34) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155541d;
                db5.e1.s(activityC11453xa58e34bc3, activityC11453xa58e34bc3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag7), "");
                return;
            }
            this.f155541d.mo48674x36654fab();
            android.content.Intent intent = new android.content.Intent(this.f155541d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent.putExtra("mobile_input_purpose", -1);
            intent.putExtra("mobile_auth_type", 7);
            intent.putExtra("from_switch_account", this.f155541d.N);
            intent.putExtra("couttry_code", this.f155541d.D);
            intent.putExtra("input_mobile_number", this.f155541d.A);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc4 = this.f155541d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC11453xa58e34bc4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11453xa58e34bc4.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC11453xa58e34bc4, "com/tencent/mm/plugin/account/ui/MobileInputLoginLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    /* renamed from: start */
    public void mo48691x68ac462() {
        gm0.j1.d().a(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_100");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    /* renamed from: stop */
    public void mo48692x360802() {
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.la.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
