package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ra implements com.tencent.mm.plugin.account.ui.ec, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.MobileInputUI f74160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f74161e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74162f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f74164h;

    /* renamed from: g, reason: collision with root package name */
    public int f74163g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f74165i = 1;

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void a(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74160d = mobileInputUI;
        java.lang.String str = "";
        if (o45.wf.f343033k) {
            str = "" + j65.v.b(mobileInputUI);
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        mobileInputUI.setMMTitle(str);
        mobileInputUI.showOptionMenu(false);
        mobileInputUI.f73492t.setVisibility(0);
        mobileInputUI.f73492t.setVisibility(0);
        mobileInputUI.f73484i.setVisibility(0);
        mobileInputUI.f73480e.setVisibility(0);
        mobileInputUI.f73481f.requestFocus();
        android.view.View view = mobileInputUI.f73487o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mobileInputUI.f73482g.setVisibility(0);
        mobileInputUI.f73496x.setVisibility(8);
        mobileInputUI.f73490r.setVisibility(0);
        mobileInputUI.f73490r.setText(com.tencent.mm.R.string.gir);
        mobileInputUI.f73489q.setOnClickListener(new com.tencent.mm.plugin.account.ui.ma(this, mobileInputUI));
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void b(com.tencent.mm.plugin.account.ui.dc dcVar) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.String str;
        if (dcVar.ordinal() != 1) {
            return;
        }
        this.f74160d.hideVKB();
        if (!this.f74160d.f73488p.isChecked()) {
            this.f74160d.f73487o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f74160d, com.tencent.mm.R.anim.f477737y));
            return;
        }
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74160d;
        if (c71.b.a(mobileInputUI, mobileInputUI.f73479d.getText().toString())) {
            int i17 = this.f74165i;
            if (i17 != 1) {
                int i18 = 2;
                if (i17 != 2) {
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74160d;
                    mobileInputUI2.f73498z = com.tencent.mm.sdk.platformtools.c5.a(mobileInputUI2.D);
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74160d;
                    mobileInputUI3.A = mobileInputUI3.f73480e.getText().toString();
                    java.lang.String str2 = this.f74160d.f73498z + this.f74160d.A;
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI4 = this.f74160d;
                    if (c71.b.a(mobileInputUI4, mobileInputUI4.f73479d.getText().toString()) && ((u3Var = this.f74160d.f73486n) == null || !u3Var.isShowing())) {
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI5 = this.f74160d;
                        mobileInputUI5.f73486n = db5.e1.Q(mobileInputUI5, mobileInputUI5.getString(com.tencent.mm.R.string.f490573yv), this.f74160d.getString(com.tencent.mm.R.string.f492797hw3), true, true, new com.tencent.mm.plugin.account.ui.na(this));
                        java.lang.String obj = this.f74160d.f73480e.getText().toString();
                        java.lang.String str3 = this.f74161e;
                        if (str3 == null || this.f74162f == null || obj.equals(str3) || !obj.equals(this.f74162f)) {
                            java.lang.String str4 = this.f74161e;
                            if (str4 == null || (str = this.f74162f) == null || str.equals(str4) || obj.equals(this.f74162f)) {
                                i18 = 0;
                            }
                        } else {
                            i18 = 1;
                        }
                        h11.e eVar = new h11.e(str2, 12, "", 0, "");
                        int i19 = this.f74163g;
                        com.tencent.mm.network.v0 v0Var = eVar.f278071d;
                        ((o45.eh) v0Var.getReqObj()).f342922a.f372494s = i19;
                        ((o45.eh) v0Var.getReqObj()).f342922a.f372495t = i18;
                        fo3.s sVar = fo3.s.INSTANCE;
                        if (sVar.wf("ie_reg_eu")) {
                            sVar.E7("ie_reg_eu");
                        }
                        r45.k57 k57Var = new r45.k57();
                        r45.cu5 cu5Var = new r45.cu5();
                        cu5Var.d(sVar.Ph("ie_reg_eu"));
                        k57Var.f378394d = cu5Var;
                        r45.cu5 cu5Var2 = new r45.cu5();
                        cu5Var2.d(sVar.Ci("ce_reg"));
                        k57Var.f378395e = cu5Var2;
                        r45.e40 e40Var = new r45.e40();
                        e40Var.f373003f = 2L;
                        r45.cu5 cu5Var3 = new r45.cu5();
                        cu5Var3.d(sVar.Ec(1, e40Var.toByteArrayOrNull()));
                        k57Var.f378396f = cu5Var3;
                        r45.cu5 cu5Var4 = new r45.cu5();
                        cu5Var4.d(sVar.L9());
                        k57Var.f378400m = cu5Var4;
                        java.lang.String Sf = sVar.Sf("ce_reg");
                        if (Sf != null) {
                            r45.cu5 cu5Var5 = new r45.cu5();
                            cu5Var5.d(Sf.getBytes());
                            k57Var.f378401n = cu5Var5;
                        }
                        eVar.R(k57Var);
                        gm0.j1.d().g(eVar);
                        this.f74161e = this.f74160d.f73480e.getText().toString();
                        this.f74163g++;
                    }
                } else {
                    c();
                }
            } else {
                c71.b.c(this.f74160d, this.f74160d.getString(com.tencent.mm.R.string.gbd, com.tencent.mm.sdk.platformtools.m2.d(), u11.b.d(this.f74160d.D), "reg", 1, 0), 32047, false);
            }
            this.f74165i = 0;
        }
    }

    public final void c() {
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74160d;
        mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), this.f74160d.getString(com.tencent.mm.R.string.f492797hw3), true, true, new com.tencent.mm.plugin.account.ui.qa(this));
        h11.e eVar = new h11.e(this.f74160d.f73498z + this.f74160d.A, 14, "", 0, "");
        eVar.S(this.f74164h);
        gm0.j1.d().g(eVar);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI;
        int i19;
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f74160d.f73486n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f74160d.f73486n = null;
        }
        if (i18 == -75) {
            db5.e1.i(this.f74160d, com.tencent.mm.R.string.f489998i0, com.tencent.mm.R.string.hv6);
            return;
        }
        if (m1Var.getType() == 145) {
            if (i18 == -41 || i18 == -59) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    b17.c(this.f74160d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f74160d, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    return;
                }
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            com.tencent.mm.network.v0 v0Var = eVar.f278071d;
            if (M == 12) {
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74160d;
                mobileInputUI2.A = com.tencent.mm.sdk.platformtools.c5.h(mobileInputUI2.A);
                this.f74162f = this.f74160d.f73498z + this.f74160d.A;
                this.f74164h = ((h11.d) v0Var).f278069b.f342925a.A;
                if (i18 == -36 || i18 == -35 || i18 == -3) {
                    java.lang.String str2 = ((h11.d) v0Var).f278069b.f342925a.f373522t;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        this.f74160d.A = str2.trim();
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    gm0.j1.b();
                    sb6.append(gm0.m.e());
                    sb6.append(",");
                    sb6.append(com.tencent.mm.plugin.account.ui.ra.class.getName());
                    sb6.append(",R200_200,");
                    gm0.j1.b();
                    sb6.append(gm0.m.f("R200_200"));
                    sb6.append(",1");
                    n71.a.c(10645, true, sb6.toString());
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this.f74160d, new com.tencent.mm.plugin.account.ui.oa(this), new com.tencent.mm.plugin.account.ui.pa(this));
                        return;
                    }
                    c();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    gm0.j1.b();
                    sb7.append(gm0.m.e());
                    sb7.append(",");
                    sb7.append(com.tencent.mm.plugin.account.ui.ra.class.getName());
                    sb7.append(",R200_200,");
                    gm0.j1.b();
                    sb7.append(gm0.m.f("R200_200"));
                    sb7.append(",2");
                    n71.a.c(10645, true, sb7.toString());
                    return;
                }
                if (i18 == -355) {
                    x51.i1.c(this.f74160d, str, 32046);
                    return;
                } else if (i18 == -34) {
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74160d;
                    db5.e1.s(mobileInputUI3, mobileInputUI3.getString(com.tencent.mm.R.string.ag7), "");
                    return;
                }
            }
            if (M == 14) {
                if (i18 == 0 || str == null) {
                    if (eVar.H() == 1) {
                        java.lang.String str3 = this.f74160d.f73498z + this.f74160d.A;
                        java.lang.String str4 = ((h11.d) v0Var).f278069b.f342925a.f373527y;
                        java.lang.String str5 = ((h11.d) v0Var).f278069b.f342925a.f373526x;
                        android.content.Intent intent = new android.content.Intent(this.f74160d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.class);
                        intent.putExtra("from_mobile", str3);
                        intent.putExtra("to_mobile", str4);
                        intent.putExtra("verify_code", str5);
                        intent.putExtra("key_reg_style", 2);
                        intent.putExtra("kintent_password", this.f74160d.f73479d.getText().toString());
                        intent.putExtra("regsession_id", this.f74164h);
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI4 = this.f74160d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(mobileInputUI4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mobileInputUI4.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(mobileInputUI4, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        n71.a.e("R200_300");
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("bindmcontact_mobile", this.f74160d.f73498z + " " + this.f74160d.f73480e.getText().toString());
                        intent2.putExtra("bindmcontact_shortmobile", this.f74160d.A);
                        intent2.putExtra("country_name", this.f74160d.C);
                        intent2.putExtra("couttry_code", this.f74160d.D);
                        intent2.putExtra("mobileverify_countdownsec", eVar.I());
                        intent2.putExtra("mobileverify_fb", eVar.K());
                        r45.w56 w56Var = ((h11.d) v0Var).f278069b.f342925a.f373524v;
                        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.gg6 gg6Var = (r45.gg6) it.next();
                                if (gg6Var.f375237d == 10) {
                                    i19 = com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
                                    break;
                                }
                            }
                        }
                        i19 = 0;
                        intent2.putExtra("mobileverify_reg_qq", i19 > 0);
                        intent2.putExtra("key_reg_style", 2);
                        intent2.putExtra("kintent_password", this.f74160d.f73479d.getText().toString());
                        intent2.putExtra("mobile_verify_purpose", 2);
                        intent2.putExtra("regsession_id", this.f74164h);
                        intent2.setClass(this.f74160d, com.tencent.mm.plugin.account.ui.MobileVerifyUI.class);
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI5 = this.f74160d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(mobileInputUI5, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mobileInputUI5.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(mobileInputUI5, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        v61.u0.a(v61.t0.SENT);
                    }
                } else if (i18 == -34) {
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI6 = this.f74160d;
                    db5.e1.s(mobileInputUI6, mobileInputUI6.getString(com.tencent.mm.R.string.ag7), "");
                    return;
                } else {
                    o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI7 = this.f74160d;
                    ((com.tencent.mm.app.o7) wi6).getClass();
                    if (com.tencent.mm.ui.pc.a(mobileInputUI7, i17, i18, str, 4)) {
                        return;
                    }
                }
            }
            tm.a b19 = tm.a.b(str);
            if (b19 == null || (mobileInputUI = this.f74160d) == null) {
                return;
            }
            b19.c(mobileInputUI, null, null);
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void start() {
        gm0.j1.d().a(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ra.class.getName());
        sb6.append(",R200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("R200_100");
        this.f74163g = 0;
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void stop() {
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ra.class.getName());
        sb6.append(",R200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
