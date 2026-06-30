package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class hb extends wm3.a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f242636e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242638g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f242639h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f242640i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f242640i = true;
    }

    public final void T6() {
        if (this.f242639h) {
            return;
        }
        this.f242639h = true;
        java.lang.Object l17 = gm0.j1.u().c().l(5, null);
        this.f242637f = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        gm0.j1.d().a(138, this);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(256, this);
        gm0.j1.d().a(108, this);
        gm0.j1.d().a(255, this);
    }

    public final void U6() {
        gm0.j1.d().q(138, this);
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(256, this);
        gm0.j1.d().q(108, this);
        gm0.j1.d().q(255, this);
    }

    public final void V6() {
        X6();
        U6();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        android.content.Intent intent = new android.content.Intent(m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tb.class);
        pf5.j0.a(intent, v14.y.class);
        intent.putExtra("verify_email_address", this.f242638g);
        lk5.s.e(intent, true);
        android.app.Activity m80379x76847179 = m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(2);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "sendEmailVerifySuccess", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void W6(java.lang.String emailAddress, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emailAddress, "emailAddress");
        T6();
        this.f242640i = z17;
        this.f242638g = emailAddress;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y0(emailAddress)) {
            db5.e1.i(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574971k64, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        boolean z18 = (((java.lang.Integer) l17).intValue() & 2) != 0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f242638g, this.f242637f) && z18) {
            return;
        }
        v61.i0 i0Var = new v61.i0(1, this.f242638g);
        gm0.j1.d().g(i0Var);
        this.f242635d = db5.e1.Q(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ipz), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gb(i0Var));
    }

    public final void X6() {
        if (this.f242639h) {
            U6();
            this.f242637f = null;
            this.f242639h = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailCgiUIC", "REQUEST_CODE_VERIFY_EMAIL");
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
            if (P6 != null) {
                P6.finish();
                return;
            }
            return;
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailCgiUIC", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.f242637f + " newEmail: " + this.f242638g);
            gm0.j1.d().g(new r61.f1(4));
            this.f242635d = db5.e1.Q(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.irw), true, true, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.na.f242887d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailCgiUIC", "email cgi listener onCreate");
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailCgiUIC", "email cgi listener onDestroy");
        X6();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: sceneType = ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
        sb6.append(m1Var.mo808xfb85f7b0());
        sb6.append(" errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(" errMsg = ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsEmailCgiUIC", sb6.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242635d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f242635d = null;
        }
        o25.s1 a17 = f14.g.a();
        android.app.Activity m80379x76847179 = m80379x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(m80379x76847179, i17, i18, str, 4)) {
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 254) {
            if (i17 == 0 && i18 == 0) {
                r61.f1 f1Var = (r61.f1) m1Var;
                this.f242636e = ((r45.t20) f1Var.f474404e.f152244b.f152233a).f467609e;
                f1Var.H();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242636e)) {
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.w0(2));
                    return;
                } else {
                    gm0.j1.d().g(new v61.i0(2, this.f242637f));
                    return;
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f242635d;
            if (u3Var2 != null) {
                u3Var2.dismiss();
                this.f242635d = null;
            }
            if (i18 == -3) {
                db5.e1.C(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wa(this), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xa.f243266d);
                return;
            }
            switch (i18) {
                case -85:
                    db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inq, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bb.f242398d);
                    return;
                case -84:
                    db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ab.f242342d);
                    return;
                case -83:
                    db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.za.f243353d);
                    return;
                case -82:
                    db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ya.f243314d);
                    return;
                default:
                    return;
            }
        }
        if (m1Var.mo808xfb85f7b0() != 256) {
            if (m1Var.mo808xfb85f7b0() != 138) {
                if (m1Var.mo808xfb85f7b0() == 108) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f242635d;
                    if (u3Var3 != null) {
                        u3Var3.dismiss();
                        this.f242635d = null;
                    }
                    if (i17 == 0 && i18 == 0) {
                        V6();
                        return;
                    } else {
                        db5.e1.t(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ta.f243102d);
                        return;
                    }
                }
                if (m1Var.mo808xfb85f7b0() == 255) {
                    if (i18 == 0) {
                        gm0.j1.d().g(new v61.i0(2, this.f242637f));
                        return;
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = this.f242635d;
                    if (u3Var4 != null) {
                        u3Var4.dismiss();
                        this.f242635d = null;
                    }
                    db5.e1.C(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ua(this), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.va.f243171d);
                    return;
                }
                return;
            }
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).Zi();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((v61.i0) m1Var).f514981e.f152243a.f152217a;
        if (((r45.rh) fVar).f466394d != 1) {
            if (((r45.rh) fVar).f466394d == 2) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var5 = this.f242635d;
                if (u3Var5 != null) {
                    u3Var5.dismiss();
                    this.f242635d = null;
                }
                if (i17 != 0 || i18 != 0) {
                    o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                    ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
                    com.p314xaae8f345.mm.ui.pc.a(m158354x19263085, i17, i18, str, 4);
                    return;
                }
                java.lang.Object l17 = gm0.j1.u().c().l(7, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
                gm0.j1.u().c().w(7, java.lang.Integer.valueOf(((java.lang.Integer) l17).intValue() | 2));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242636e)) {
                    db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inr, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sa.f243068d);
                    return;
                } else {
                    db5.e1.y(m80379x76847179(), this.f242636e, "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ra.f243034d);
                    m158354x19263085().finish();
                    return;
                }
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            if (this.f242640i) {
                V6();
                return;
            }
            android.app.Activity m80379x768471792 = m80379x76847179();
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x768471792);
            e4Var.f293309c = "已发送";
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var6 = this.f242635d;
        if (u3Var6 != null) {
            u3Var6.dismiss();
            this.f242635d = null;
        }
        switch (i18) {
            case -86:
                db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iny, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pa.f242965d);
                return;
            case -85:
                db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inq, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oa.f242918d);
                return;
            case -84:
                db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eb.f242524d);
                return;
            case -83:
                db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.db.f242472d);
                return;
            case -82:
                db5.e1.m(m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.cb.f242439d);
                return;
            default:
                o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
                ((com.p314xaae8f345.mm.app.o7) wi7).getClass();
                if (com.p314xaae8f345.mm.ui.pc.a(m158354x192630852, i17, i18, str, 4)) {
                    return;
                }
                db5.e1.t(m80379x76847179(), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qa.f243002d);
                return;
        }
    }
}
