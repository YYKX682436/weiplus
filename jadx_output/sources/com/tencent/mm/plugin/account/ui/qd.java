package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class qd implements com.tencent.mm.plugin.account.ui.ge, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.MobileVerifyUI f74139d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f74140e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.fa f74141f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f74142g = true;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct f74143h = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();

    @Override // com.tencent.mm.plugin.account.ui.ge
    public boolean a(com.tencent.mm.plugin.account.ui.fe feVar) {
        int ordinal = feVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74139d;
            db5.e1.A(mobileVerifyUI, mobileVerifyUI.getString(com.tencent.mm.R.string.gxm), "", this.f74139d.getString(com.tencent.mm.R.string.gxn), this.f74139d.getString(com.tencent.mm.R.string.gxo), new com.tencent.mm.plugin.account.ui.gd(this), new com.tencent.mm.plugin.account.ui.hd(this));
            return true;
        }
        if (ordinal == 1) {
            gm0.j1.d().a(145, this);
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f74139d;
            h11.e eVar = new h11.e(mobileVerifyUI2.f73528h, 15, mobileVerifyUI2.f73525e.getText().toString().trim(), 0, "");
            eVar.S(this.f74139d.f73542y);
            gm0.j1.d().g(eVar);
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI3 = this.f74139d;
            mobileVerifyUI3.f73526f = db5.e1.Q(mobileVerifyUI3, mobileVerifyUI3.getString(com.tencent.mm.R.string.f490573yv), this.f74139d.getString(com.tencent.mm.R.string.ahe), true, true, new com.tencent.mm.plugin.account.ui.id(this, eVar));
            return false;
        }
        if (ordinal == 2) {
            gm0.j1.d().a(145, this);
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI4 = this.f74139d;
            h11.e eVar2 = mobileVerifyUI4.f73533p ? new h11.e(mobileVerifyUI4.f73528h, 14, "", 1, mobileVerifyUI4.f73534q) : new h11.e(mobileVerifyUI4.f73528h, 14, "", 0, "");
            eVar2.S(this.f74139d.f73542y);
            gm0.j1.d().g(eVar2);
            v61.u0.a(v61.t0.SENT);
            return false;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return false;
            }
            d();
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.qd.class.getName());
        sb6.append(",R200_350_auto,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_350_auto"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        gm0.j1.d().a(145, this);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI5 = this.f74139d;
        h11.e eVar3 = new h11.e(mobileVerifyUI5.f73528h, 15, mobileVerifyUI5.f73525e.getText().toString().trim(), 0, "");
        eVar3.S(this.f74139d.f73542y);
        gm0.j1.d().g(eVar3);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI6 = this.f74139d;
        mobileVerifyUI6.f73526f = db5.e1.Q(mobileVerifyUI6, mobileVerifyUI6.getString(com.tencent.mm.R.string.f490573yv), this.f74139d.getString(com.tencent.mm.R.string.ahe), true, true, new com.tencent.mm.plugin.account.ui.fd(this, eVar3));
        return false;
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void b(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f74139d = mobileVerifyUI;
    }

    public final void c() {
        if (c01.uc.f37515d) {
            c01.uc ucVar = c01.uc.f37514c;
            ucVar.a(c01.z1.r());
            ucVar.g(c01.z1.r(), c01.z1.q());
            c01.uc.f37515d = false;
        }
    }

    public void d() {
        h11.e eVar = new h11.e(this.f74139d.f73528h, 26, "", 0, "");
        eVar.S(this.f74139d.f73542y);
        gm0.j1.d().g(eVar);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74139d;
        mobileVerifyUI.f73526f = db5.e1.Q(mobileVerifyUI, mobileVerifyUI.getString(com.tencent.mm.R.string.f490573yv), this.f74139d.getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.dd(this, eVar));
    }

    public final void e(h11.e eVar) {
        java.lang.String str = ((h11.d) eVar.f278071d).f278069b.f342925a.f373509d;
        this.f74140e = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "uploadNickAndAvatar ticket:%s", str);
        gm0.j1.d().a(126, this);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74139d;
        com.tencent.mm.modelsimple.z0 z0Var = new com.tencent.mm.modelsimple.z0("", mobileVerifyUI.f73529i, mobileVerifyUI.f73531n, 0, "", mobileVerifyUI.f73528h, "", "", this.f74140e, mobileVerifyUI.f73541x, "", "", "", true, mobileVerifyUI.f73530m.booleanValue());
        z0Var.L(this.f74139d.f73542y);
        z0Var.M(this.f74139d.f73543z);
        gm0.j1.d().g(z0Var);
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f74139d;
        mobileVerifyUI2.f73526f = db5.e1.Q(mobileVerifyUI2, mobileVerifyUI2.getString(com.tencent.mm.R.string.f490573yv), this.f74139d.getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.ed(this, z0Var));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int D1;
        java.util.LinkedList linkedList;
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f74139d.f73526f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f74139d.f73526f = null;
        }
        if (m1Var.getType() == 255) {
            gm0.j1.d().q(255, this);
            if (i18 == -3 && i17 == 4) {
                this.f74139d.W6(this.f74142g);
                return;
            }
            return;
        }
        if ((m1Var.getType() == 701 || m1Var.getType() == 701) && this.f74141f != null) {
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            this.f74141f.a(this.f74139d, i17, i18, str, m1Var);
            if (i17 == 0 && i18 == 0) {
                if (m1Var instanceof com.tencent.mm.modelsimple.v0) {
                    this.f74142g = ((com.tencent.mm.modelsimple.v0) m1Var).V();
                }
                gm0.j1.d().a(255, this);
                com.tencent.mm.modelsimple.w0 w0Var = new com.tencent.mm.modelsimple.w0(1);
                gm0.j1.d().g(w0Var);
                com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f74139d;
                mobileVerifyUI.f73526f = db5.e1.Q(mobileVerifyUI, mobileVerifyUI.getString(com.tencent.mm.R.string.f490573yv), this.f74139d.getString(com.tencent.mm.R.string.f490468vx), true, true, new com.tencent.mm.plugin.account.ui.jd(this, w0Var));
                return;
            }
            return;
        }
        int type = m1Var.getType();
        com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct thirdAppRegisterStruct = this.f74143h;
        if (type == 145) {
            gm0.j1.d().q(145, this);
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(M);
            com.tencent.mm.network.v0 v0Var = eVar.f278071d;
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "MMFunc_BindMobileForReg opCode=%s needDoPostCheck=%s", valueOf, java.lang.Integer.valueOf(((h11.d) v0Var).f278069b.f342925a.F));
            if (M == 15) {
                if (i17 == 0 && i18 == 0) {
                    if (this.f74139d.f73532o == 1) {
                        if (((h11.d) v0Var).f278069b.f342925a.F == 1) {
                            d();
                            return;
                        } else {
                            e(eVar);
                            return;
                        }
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("regsetinfo_ticket", ((h11.d) v0Var).f278069b.f342925a.f373509d);
                    intent.putExtra("regsetinfo_user", this.f74139d.f73528h);
                    intent.putExtra("regsetinfo_pwd", this.f74139d.f73529i);
                    intent.putExtra("regsession_id", this.f74139d.f73542y);
                    intent.putExtra("reg_3d_app_ticket", this.f74139d.f73543z);
                    intent.putExtra("reg_3d_app_type", this.f74139d.A);
                    intent.putExtra("regsetinfo_ismobile", 4);
                    intent.putExtra("regsetinfo_NextControl", eVar.L());
                    intent.putExtra("key_reg_style", this.f74139d.f73532o);
                    intent.setClass(this.f74139d, com.tencent.mm.plugin.account.ui.RegSetInfoUI.class);
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f74139d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mobileVerifyUI2, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mobileVerifyUI2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(mobileVerifyUI2, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    v61.u0.a(v61.t0.VERIFIED);
                    return;
                }
                if (i18 == -35) {
                    tm.a b18 = tm.a.b(str);
                    thirdAppRegisterStruct.f61234d = this.f74139d.A;
                    thirdAppRegisterStruct.f61235e = 7L;
                    thirdAppRegisterStruct.k();
                    if (b18 != null) {
                        b18.c(this.f74139d, new com.tencent.mm.plugin.account.ui.ld(this, m1Var, eVar), new com.tencent.mm.plugin.account.ui.md(this));
                        return;
                    } else {
                        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI3 = this.f74139d;
                        db5.e1.u(mobileVerifyUI3, mobileVerifyUI3.getString(com.tencent.mm.R.string.afq), null, new com.tencent.mm.plugin.account.ui.od(this, m1Var), new com.tencent.mm.plugin.account.ui.pd(this));
                        return;
                    }
                }
                if (i18 == -212) {
                    android.content.Intent intent2 = new android.content.Intent(this.f74139d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.class);
                    intent2.putExtra("ticket", ((h11.d) v0Var).f278069b.f342925a.f373509d);
                    intent2.putExtra("moble", this.f74139d.f73528h);
                    intent2.putExtra("regsession_id", this.f74139d.f73542y);
                    intent2.putExtra("reg_3d_app_ticket", this.f74139d.f73543z);
                    intent2.putExtra("reg_3d_app_type", this.f74139d.A);
                    intent2.putExtra("next_controll", eVar.L());
                    intent2.putExtra(dm.i4.COL_USERNAME, eVar.Q());
                    intent2.putExtra("password", eVar.P());
                    intent2.putExtra("nickname", eVar.O());
                    intent2.putExtra("avatar_url", eVar.N());
                    intent2.putExtra("key_reg_style", this.f74139d.f73532o);
                    intent2.putExtra("need_do_post_check", ((h11.d) v0Var).f278069b.f342925a.F);
                    intent2.putExtra("kintent_password", this.f74139d.f73529i);
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI4 = this.f74139d;
                    if (mobileVerifyUI4.f73532o == 1) {
                        intent2.putExtra("kintent_nickname", mobileVerifyUI4.f73531n);
                        intent2.putExtra("kintent_hasavatar", this.f74139d.f73530m);
                    }
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI5 = this.f74139d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(mobileVerifyUI5, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mobileVerifyUI5.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(mobileVerifyUI5, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                if (i18 == -51) {
                    tm.a b19 = tm.a.b(str);
                    if (b19 != null) {
                        b19.c(this.f74139d, null, null);
                        return;
                    } else {
                        db5.e1.i(this.f74139d, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho);
                        return;
                    }
                }
            } else if (M == 26) {
                if (i17 == 0 && i18 == 0) {
                    e(eVar);
                } else {
                    x51.i1.c(this.f74139d, str, 30844);
                }
            }
        } else if (m1Var.getType() == 126) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI6 = this.f74139d;
                java.lang.String str2 = mobileVerifyUI6.f73528h;
                java.lang.Boolean bool = mobileVerifyUI6.f73530m;
                thirdAppRegisterStruct.f61234d = mobileVerifyUI6.A;
                thirdAppRegisterStruct.f61235e = 6L;
                thirdAppRegisterStruct.k();
                com.tencent.mm.modelsimple.z0 z0Var = (com.tencent.mm.modelsimple.z0) m1Var;
                r45.w56 w56Var = ((c01.i9) z0Var.f71456e).f37253b.f342914a.G;
                if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.gg6 gg6Var = (r45.gg6) it.next();
                        if (gg6Var.f375237d == 1) {
                            i19 = com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
                            break;
                        }
                    }
                }
                i19 = 0;
                java.lang.String H = z0Var.H();
                int I = z0Var.I();
                java.lang.String J2 = z0Var.J();
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(J2, "wording", null);
                if (d17 != null) {
                    java.lang.String str3 = (java.lang.String) d17.get(".wording.switch");
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || ((D1 = com.tencent.mm.sdk.platformtools.t8.D1(str3, 0)) != 0 && D1 == 1)) {
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "hasSetAvatar , %s", bool);
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "styleId , %s", java.lang.Integer.valueOf(i19));
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "nextStep , %s", H);
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "nextStyle , %s", java.lang.Integer.valueOf(I));
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyRegLogic", "mShowStyleContactUploadWordings , %s", J2);
                gm0.m.E();
                gm0.m.f273232u = true;
                com.tencent.mm.plugin.report.service.b1.f(1, 8);
                com.tencent.mm.plugin.report.service.b1.f(1, 3);
                com.tencent.mm.plugin.report.service.b1.f(1, 1);
                if (bool.booleanValue()) {
                    java.lang.String str4 = lp0.b.j() + "temp.avatar";
                    java.lang.String str5 = lp0.b.j() + "temp.avatar.hd";
                    com.tencent.mm.vfs.w6.w(str4, str5);
                    com.tencent.mm.vfs.w6.h(str4);
                    com.tencent.mm.sdk.platformtools.x.x(str5, 156, 156, android.graphics.Bitmap.CompressFormat.JPEG, 90, str4, true);
                    kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI7 = this.f74139d;
                    java.lang.String str6 = lp0.b.j() + "temp.avatar";
                    ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
                    new com.tencent.mm.modelavatar.y0(mobileVerifyUI7, str6, true).a(1, new com.tencent.mm.plugin.account.ui.bd(this, m1Var, str2), new com.tencent.mm.plugin.account.ui.cd(this, m1Var, str2));
                } else {
                    z0Var.K();
                    c01.b9.f37069c.d("login_user_name", str2);
                    android.content.Intent b27 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this.f74139d);
                    b27.addFlags(67108864);
                    b27.putExtra("LauncherUI.enter_from_reg", true);
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI8 = this.f74139d;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(b27);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mobileVerifyUI8, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mobileVerifyUI8.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(mobileVerifyUI8, "com/tencent/mm/plugin/account/ui/MobileVerifyRegLogic", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    gm0.j1.b();
                    sb6.append(gm0.m.e());
                    sb6.append(",");
                    sb6.append(this.f74139d.getClass().getName());
                    sb6.append(",R200_900_phone,");
                    gm0.j1.b();
                    sb6.append(gm0.m.f("R200_900_phone"));
                    sb6.append(",4");
                    n71.a.b(10645, sb6.toString());
                    c();
                    this.f74139d.finish();
                }
            }
            tm.a b28 = tm.a.b(str);
            if (b28 != null) {
                b28.c(this.f74139d, null, null);
                return;
            }
        }
        if (this.f74139d.V6(i17, i18, str)) {
            return;
        }
        if ((m1Var.getType() == 252 || m1Var.getType() == 701) && (b17 = tm.a.b(str)) != null && b17.c(this.f74139d, null, null)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI9 = this.f74139d;
        dp.a.makeText(mobileVerifyUI9, mobileVerifyUI9.getString(com.tencent.mm.R.string.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void start() {
        gm0.j1.d().a(126, this);
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void stop() {
        gm0.j1.d().q(126, this);
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(255, this);
    }
}
