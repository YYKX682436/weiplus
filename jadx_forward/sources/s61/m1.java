package s61;

/* loaded from: classes5.dex */
public class m1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f484903d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f484905f;

    /* renamed from: h, reason: collision with root package name */
    public final s61.k1 f484907h;

    /* renamed from: i, reason: collision with root package name */
    public r61.e1 f484908i;

    /* renamed from: m, reason: collision with root package name */
    public r61.e1 f484909m;

    /* renamed from: p, reason: collision with root package name */
    public final s61.l1 f484912p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f484904e = false;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f484906g = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f484910n = true;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f484911o = "";

    public m1(s61.l1 l1Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, s61.k1 k1Var) {
        this.f484912p = l1Var;
        this.f484903d = abstractActivityC21394xb3d2c0cf;
        this.f484907h = k1Var;
        z61.a aVar = (z61.a) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(z61.a.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf lifecycleOwner = this.f484903d;
        s61.g1 g1Var = new s61.g1(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        aVar.f273902d.m127126x9d92d11c(lifecycleOwner, g1Var);
    }

    public final void a(int i17, android.os.Bundle bundle) {
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = this.f484912p;
        if (l1Var2 == l1Var || l1Var2 == s61.l1.CHANGEMOBILE) {
            gm0.j1.d().q(132, this);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f484911o)) {
            bundle.putString("policyTicket", this.f484911o);
        }
        s61.k1 k1Var = this.f484907h;
        if (k1Var != null) {
            k1Var.a(i17, bundle);
        }
    }

    public void b() {
        gm0.j1.d().q(132, this);
        this.f484903d = null;
        this.f484904e = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f484906g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    public final void c() {
        java.lang.String str = this.f484911o;
        s61.l1 l1Var = this.f484912p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "sendGetVerifyReq %s policyTicket:%s", l1Var, str);
        s61.l1 l1Var2 = s61.l1.BINDMOBILE;
        s61.l1 l1Var3 = s61.l1.CHANGEMOBILE;
        if (l1Var == l1Var2 || l1Var == l1Var3) {
            r61.e1 e1Var = new r61.e1(this.f484905f, l1Var == l1Var3 ? 18 : 1, "", 0, "");
            this.f484909m = e1Var;
            ((r45.di) e1Var.f474393d.f152243a.f152217a).D = this.f484911o;
            gm0.j1.d().g(this.f484909m);
        }
    }

    public void d(java.lang.String str) {
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = this.f484912p;
        if (l1Var2 == l1Var || l1Var2 == s61.l1.CHANGEMOBILE) {
            gm0.j1.d().a(132, this);
        }
        this.f484905f = str;
        this.f484904e = false;
        c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f484906g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f484903d;
        this.f484906g = db5.e1.Q(abstractActivityC21394xb3d2c0cf, "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, new s61.h1(this));
    }

    public void e(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "start send verify sms %s %s %s", str, str2, java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f484905f)) {
            this.f484905f = str;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f484906g;
        if (u3Var != null) {
            u3Var.setCancelable(true);
        }
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = s61.l1.CHANGEMOBILE;
        s61.l1 l1Var3 = this.f484912p;
        if (l1Var3 == l1Var || l1Var3 == l1Var2) {
            gm0.j1.d().a(132, this);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5616x50897eb6 c5616x50897eb6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5616x50897eb6();
            c5616x50897eb6.f135940g.f88484a = this.f484903d;
            c5616x50897eb6.e();
            java.lang.String str4 = c5616x50897eb6.f135941h.f88565a;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5617x25f2ff67 c5617x25f2ff67 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5617x25f2ff67();
            c5617x25f2ff67.e();
            java.lang.String str5 = c5617x25f2ff67.f135942g.f88681a;
            if (l1Var3 == l1Var2 && i17 != 25) {
                i17 = 19;
            }
            this.f484904e = false;
            r61.e1 e1Var = new r61.e1(this.f484905f, i17, str2, 0, "", str4, str5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = e1Var.f474393d.f152243a.f152217a;
            ((r45.di) fVar).E = str3;
            this.f484908i = e1Var;
            ((r45.di) fVar).D = this.f484911o;
            gm0.j1.d().g(this.f484908i);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f484906g;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f484903d;
            this.f484906g = db5.e1.Q(abstractActivityC21394xb3d2c0cf, "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahe), false, true, new s61.i1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f484906g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var != this.f484908i && m1Var != this.f484909m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd, doScene is not called by this class");
            return;
        }
        if (this.f484904e) {
            return;
        }
        boolean z17 = true;
        if (i17 == 4 && i18 == -445 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (b17 = tm.a.b(str)) != null && b17.f501933c == 9) {
            c71.b.c(this.f484903d, b17.f501931a, 0, true);
            return;
        }
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = s61.l1.CHANGEMOBILE;
        s61.l1 l1Var3 = this.f484912p;
        if ((l1Var != l1Var3 && l1Var2 != l1Var3) || m1Var.mo808xfb85f7b0() != 132) {
            iz5.a.g("code path should not be here!", false);
            return;
        }
        r61.e1 e1Var = (r61.e1) m1Var;
        int I = e1Var.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "bindMobileOnSceneEnd %s %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(I));
        if (I == 1 || I == 2 || I == 18 || I == 19 || I == 25) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = e1Var.f474393d;
            if (i17 == 0 && i18 == 0) {
                if (e1Var.I() != 2 && e1Var.I() != 25 && e1Var.I() != 19) {
                    a(1, new android.os.Bundle());
                    return;
                }
                if (this.f484910n) {
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    x51.e.a(x51.e.f533523b);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                if (e1Var.I() == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmsBindMobileObserver", "bind mobile check, ticket %s", ((r45.ei) oVar.f152244b.f152233a).f455042d);
                    bundle.putString("setpwd_ticket", ((r45.ei) oVar.f152244b.f152233a).f455042d);
                }
                if (((r45.ei) oVar.f152244b.f152233a).B != 0) {
                    bundle.putBoolean("restart_wechat", true);
                }
                a(2, bundle);
                return;
            }
            if (i18 == -445 || i18 == -214) {
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    if (b18.f501933c == 8) {
                        c71.b.c(this.f484903d, b18.f501931a, 100, true);
                    } else {
                        b18.c(this.f484903d, null, null);
                    }
                }
            } else if (i18 == -74) {
                db5.e1.m(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.f572245ag3, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            } else if (i18 != -59) {
                if (i18 != -57) {
                    if (i18 == -43) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SmsBindMobileObserver", "dealErrCodeBindMobile");
                        if (l1Var == l1Var3 || l1Var3 == l1Var2) {
                            gm0.j1.u().c().w(4097, "");
                            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, "");
                            gm0.j1.u().c().w(6, this.f484905f);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                                if (c17.m(u3Var2, "").equals(str2)) {
                                    gm0.j1.u().c().x(u3Var2, c01.z1.r());
                                }
                                java.util.Iterator it = ((java.util.HashSet) c01.uc.f119047c.d()).iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = (java.lang.String) it.next();
                                    c01.uc ucVar = c01.uc.f119047c;
                                    if (str2.equals(ucVar.c(str3, "login_user_name"))) {
                                        ucVar.h(str3, "login_user_name", str3);
                                    }
                                }
                            }
                            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                            x51.e.a(x51.e.f533523b);
                        }
                        a(2, new android.os.Bundle());
                        dp.a.m125853x26a183b(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.f572246ag4, 0).show();
                    } else if (i18 == -41) {
                        dp.a.m125853x26a183b(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.ag6, 0).show();
                    } else if (i18 != -1) {
                        switch (i18) {
                            case -36:
                                dp.a.m125853x26a183b(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.ag9, 0).show();
                                break;
                            case -35:
                                db5.e1.m(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.f572247ag5, com.p314xaae8f345.mm.R.C30867xcad56011.aho, new s61.j1(this));
                                break;
                            case -34:
                                dp.a.m125853x26a183b(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.ag7, 0).show();
                                break;
                            default:
                                z17 = false;
                                break;
                        }
                    }
                }
                dp.a.m125853x26a183b(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, 0).show();
            } else {
                db5.e1.m(this.f484903d, com.p314xaae8f345.mm.R.C30867xcad56011.ag8, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            }
            if (z17) {
                if (i18 == -445) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("setpwd_ticket", ((r45.ei) oVar.f152244b.f152233a).E);
                    a(3, bundle2);
                    return;
                }
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f484903d;
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(abstractActivityC21394xb3d2c0cf, i17, i18, str, 4)) {
                return;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f484903d;
            dp.a.m125854x26a183b(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
