package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ra implements com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155694e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155695f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155697h;

    /* renamed from: g, reason: collision with root package name */
    public int f155696g = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f155698i = 1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc) {
        this.f155693d = activityC11453xa58e34bc;
        java.lang.String str = "";
        if (o45.wf.f424566k) {
            str = "" + j65.v.b(activityC11453xa58e34bc);
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        activityC11453xa58e34bc.mo54450xbf7c1df6(str);
        activityC11453xa58e34bc.mo74408xb0dfae51(false);
        activityC11453xa58e34bc.f155025t.setVisibility(0);
        activityC11453xa58e34bc.f155025t.setVisibility(0);
        activityC11453xa58e34bc.f155017i.setVisibility(0);
        activityC11453xa58e34bc.f155013e.setVisibility(0);
        activityC11453xa58e34bc.f155014f.requestFocus();
        android.view.View view = activityC11453xa58e34bc.f155020o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "initView", "(Lcom/tencent/mm/plugin/account/ui/MobileInputUI;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC11453xa58e34bc.f155015g.setVisibility(0);
        activityC11453xa58e34bc.f155029x.setVisibility(8);
        activityC11453xa58e34bc.f155023r.setVisibility(0);
        activityC11453xa58e34bc.f155023r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gir);
        activityC11453xa58e34bc.f155022q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ma(this, activityC11453xa58e34bc));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc dcVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        java.lang.String str;
        if (dcVar.ordinal() != 1) {
            return;
        }
        this.f155693d.mo48674x36654fab();
        if (!this.f155693d.f155021p.isChecked()) {
            this.f155693d.f155020o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f155693d, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155693d;
        if (c71.b.a(activityC11453xa58e34bc, activityC11453xa58e34bc.f155012d.getText().toString())) {
            int i17 = this.f155698i;
            if (i17 != 1) {
                int i18 = 2;
                if (i17 != 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155693d;
                    activityC11453xa58e34bc2.f155031z = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.a(activityC11453xa58e34bc2.D);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155693d;
                    activityC11453xa58e34bc3.A = activityC11453xa58e34bc3.f155013e.m78931xfb85ada3().toString();
                    java.lang.String str2 = this.f155693d.f155031z + this.f155693d.A;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc4 = this.f155693d;
                    if (c71.b.a(activityC11453xa58e34bc4, activityC11453xa58e34bc4.f155012d.getText().toString()) && ((u3Var = this.f155693d.f155019n) == null || !u3Var.isShowing())) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc5 = this.f155693d;
                        activityC11453xa58e34bc5.f155019n = db5.e1.Q(activityC11453xa58e34bc5, activityC11453xa58e34bc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155693d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574330hw3), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.na(this));
                        java.lang.String obj = this.f155693d.f155013e.m78931xfb85ada3().toString();
                        java.lang.String str3 = this.f155694e;
                        if (str3 == null || this.f155695f == null || obj.equals(str3) || !obj.equals(this.f155695f)) {
                            java.lang.String str4 = this.f155694e;
                            if (str4 == null || (str = this.f155695f) == null || str.equals(str4) || obj.equals(this.f155695f)) {
                                i18 = 0;
                            }
                        } else {
                            i18 = 1;
                        }
                        h11.e eVar = new h11.e(str2, 12, "", 0, "");
                        int i19 = this.f155696g;
                        com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
                        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454027s = i19;
                        ((o45.eh) v0Var.mo47979x2d63726f()).f424455a.f454028t = i18;
                        fo3.s sVar = fo3.s.INSTANCE;
                        if (sVar.wf("ie_reg_eu")) {
                            sVar.E7("ie_reg_eu");
                        }
                        r45.k57 k57Var = new r45.k57();
                        r45.cu5 cu5Var = new r45.cu5();
                        cu5Var.d(sVar.Ph("ie_reg_eu"));
                        k57Var.f459927d = cu5Var;
                        r45.cu5 cu5Var2 = new r45.cu5();
                        cu5Var2.d(sVar.Ci("ce_reg"));
                        k57Var.f459928e = cu5Var2;
                        r45.e40 e40Var = new r45.e40();
                        e40Var.f454536f = 2L;
                        r45.cu5 cu5Var3 = new r45.cu5();
                        cu5Var3.d(sVar.Ec(1, e40Var.m75963xebb06ba0()));
                        k57Var.f459929f = cu5Var3;
                        r45.cu5 cu5Var4 = new r45.cu5();
                        cu5Var4.d(sVar.L9());
                        k57Var.f459933m = cu5Var4;
                        java.lang.String Sf = sVar.Sf("ce_reg");
                        if (Sf != null) {
                            r45.cu5 cu5Var5 = new r45.cu5();
                            cu5Var5.d(Sf.getBytes());
                            k57Var.f459934n = cu5Var5;
                        }
                        eVar.R(k57Var);
                        gm0.j1.d().g(eVar);
                        this.f155694e = this.f155693d.f155013e.m78931xfb85ada3().toString();
                        this.f155696g++;
                    }
                } else {
                    c();
                }
            } else {
                c71.b.c(this.f155693d, this.f155693d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbd, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), u11.b.d(this.f155693d.D), "reg", 1, 0), 32047, false);
            }
            this.f155698i = 0;
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155693d;
        activityC11453xa58e34bc.f155019n = db5.e1.Q(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155693d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574330hw3), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qa(this));
        h11.e eVar = new h11.e(this.f155693d.f155031z + this.f155693d.A, 14, "", 0, "");
        eVar.S(this.f155697h);
        gm0.j1.d().g(eVar);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc;
        int i19;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputRegLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155693d.f155019n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f155693d.f155019n = null;
        }
        if (i18 == -75) {
            db5.e1.i(this.f155693d, com.p314xaae8f345.mm.R.C30867xcad56011.f571531i0, com.p314xaae8f345.mm.R.C30867xcad56011.hv6);
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 145) {
            if (i18 == -41 || i18 == -59) {
                tm.a b17 = tm.a.b(str);
                if (b17 != null) {
                    b17.c(this.f155693d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f155693d, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    return;
                }
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var = eVar.f359604d;
            if (M == 12) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155693d;
                activityC11453xa58e34bc2.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(activityC11453xa58e34bc2.A);
                this.f155695f = this.f155693d.f155031z + this.f155693d.A;
                this.f155697h = ((h11.d) v0Var).f359602b.f424458a.A;
                if (i18 == -36 || i18 == -35 || i18 == -3) {
                    java.lang.String str2 = ((h11.d) v0Var).f359602b.f424458a.f455055t;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        this.f155693d.A = str2.trim();
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    gm0.j1.b();
                    sb6.append(gm0.m.e());
                    sb6.append(",");
                    sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra.class.getName());
                    sb6.append(",R200_200,");
                    gm0.j1.b();
                    sb6.append(gm0.m.f("R200_200"));
                    sb6.append(",1");
                    n71.a.c(10645, true, sb6.toString());
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this.f155693d, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.oa(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pa(this));
                        return;
                    }
                    c();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    gm0.j1.b();
                    sb7.append(gm0.m.e());
                    sb7.append(",");
                    sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra.class.getName());
                    sb7.append(",R200_200,");
                    gm0.j1.b();
                    sb7.append(gm0.m.f("R200_200"));
                    sb7.append(",2");
                    n71.a.c(10645, true, sb7.toString());
                    return;
                }
                if (i18 == -355) {
                    x51.i1.c(this.f155693d, str, 32046);
                    return;
                } else if (i18 == -34) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155693d;
                    db5.e1.s(activityC11453xa58e34bc3, activityC11453xa58e34bc3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag7), "");
                    return;
                }
            }
            if (M == 14) {
                if (i18 == 0 || str == null) {
                    if (eVar.H() == 1) {
                        java.lang.String str3 = this.f155693d.f155031z + this.f155693d.A;
                        java.lang.String str4 = ((h11.d) v0Var).f359602b.f424458a.f455060y;
                        java.lang.String str5 = ((h11.d) v0Var).f359602b.f424458a.f455059x;
                        android.content.Intent intent = new android.content.Intent(this.f155693d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11462xec7fb918.class);
                        intent.putExtra("from_mobile", str3);
                        intent.putExtra("to_mobile", str4);
                        intent.putExtra("verify_code", str5);
                        intent.putExtra("key_reg_style", 2);
                        intent.putExtra("kintent_password", this.f155693d.f155012d.getText().toString());
                        intent.putExtra("regsession_id", this.f155697h);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc4 = this.f155693d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activityC11453xa58e34bc4, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC11453xa58e34bc4.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activityC11453xa58e34bc4, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        n71.a.e("R200_300");
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("bindmcontact_mobile", this.f155693d.f155031z + " " + this.f155693d.f155013e.m78931xfb85ada3().toString());
                        intent2.putExtra("bindmcontact_shortmobile", this.f155693d.A);
                        intent2.putExtra("country_name", this.f155693d.C);
                        intent2.putExtra("couttry_code", this.f155693d.D);
                        intent2.putExtra("mobileverify_countdownsec", eVar.I());
                        intent2.putExtra("mobileverify_fb", eVar.K());
                        r45.w56 w56Var = ((h11.d) v0Var).f359602b.f424458a.f455057v;
                        if (w56Var != null && (linkedList = w56Var.f470438e) != null && linkedList.size() > 0) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.gg6 gg6Var = (r45.gg6) it.next();
                                if (gg6Var.f456770d == 10) {
                                    i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(gg6Var.f456771e, 0);
                                    break;
                                }
                            }
                        }
                        i19 = 0;
                        intent2.putExtra("mobileverify_reg_qq", i19 > 0);
                        intent2.putExtra("key_reg_style", 2);
                        intent2.putExtra("kintent_password", this.f155693d.f155012d.getText().toString());
                        intent2.putExtra("mobile_verify_purpose", 2);
                        intent2.putExtra("regsession_id", this.f155697h);
                        intent2.setClass(this.f155693d, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af.class);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc5 = this.f155693d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activityC11453xa58e34bc5, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC11453xa58e34bc5.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activityC11453xa58e34bc5, "com/tencent/mm/plugin/account/ui/MobileInputRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        v61.u0.a(v61.t0.SENT);
                    }
                } else if (i18 == -34) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc6 = this.f155693d;
                    db5.e1.s(activityC11453xa58e34bc6, activityC11453xa58e34bc6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ag7), "");
                    return;
                } else {
                    o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc7 = this.f155693d;
                    ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
                    if (com.p314xaae8f345.mm.ui.pc.a(activityC11453xa58e34bc7, i17, i18, str, 4)) {
                        return;
                    }
                }
            }
            tm.a b19 = tm.a.b(str);
            if (b19 == null || (activityC11453xa58e34bc = this.f155693d) == null) {
                return;
            }
            b19.c(activityC11453xa58e34bc, null, null);
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
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra.class.getName());
        sb6.append(",R200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("R200_100");
        this.f155696g = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    /* renamed from: stop */
    public void mo48692x360802() {
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ra.class.getName());
        sb6.append(",R200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
