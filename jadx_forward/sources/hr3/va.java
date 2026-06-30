package hr3;

/* loaded from: classes11.dex */
public abstract class va implements com.p314xaae8f345.mm.p944x882e457a.u0, i35.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f365641d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365642e;

    public va(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        this.f365642e = c16861xdcf09668;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(hr3.va r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.va.b(hr3.va):void");
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365642e;
        if (i17 != 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g25Var.f456374d)) {
                db5.e1.s(c16861xdcf09668.K1, g25Var.f456374d, g25Var.f456375e);
                return;
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c16861xdcf09668.K1;
                db5.e1.s(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571901t1), "");
                return;
            }
        }
        if (!str.equals(c16861xdcf09668.L.d1())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalUserFooterPreference", "not current contact %s,%s", c16861xdcf09668.L.d1(), str);
            return;
        }
        int i18 = c16861xdcf09668.N;
        if (i18 == 12) {
            r61.w1 h17 = m61.k.Ri().h(str);
            if (h17 != null) {
                h17.f474512b = 1;
                m61.k.Ri().i(h17.f474511a, h17);
            }
        } else if (i18 == 13) {
            r61.a h18 = m61.k.wi().h(str);
            if (h18 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h18.f474338u)) {
                h18.f474332o = 1;
                m61.k.wi().j(h18.e(), h18);
            }
        } else if (i18 != 31) {
            switch (i18) {
                case 58:
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                case 60:
                    m61.k.Di().P0(str, 2, 0);
                    break;
            }
        } else {
            r61.f0 Bi = m61.k.Bi();
            Bi.getClass();
            r61.e0 e0Var = null;
            android.database.Cursor f17 = Bi.f474402d.f("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.username = \"" + str + "\"", null, 2);
            if (f17 != null) {
                if (f17.moveToFirst()) {
                    e0Var = new r61.e0();
                    e0Var.a(f17);
                }
                f17.close();
            }
            if (e0Var != null) {
                e0Var.f474378d = 100;
                m61.k.Bi().m0(e0Var);
            }
        }
        if (c16861xdcf09668.N == 9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "add scene unkown, check the contact getsource: " + c16861xdcf09668.L.m43619x2fa78b11());
            int m43619x2fa78b11 = c16861xdcf09668.L.m43619x2fa78b11();
            if (m43619x2fa78b11 == 10 || m43619x2fa78b11 == 13) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "delete the system contact info added by wechat");
            }
        }
        if (c16861xdcf09668.P == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, c16861xdcf09668.f279303d);
        } else {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = c16861xdcf09668.K1;
            abstractActivityC21394xb3d2c0cf2.setResult(-1, abstractActivityC21394xb3d2c0cf2.getIntent().putExtra("_delete_ok_", true));
            ((android.app.Activity) c16861xdcf09668.f279303d).finish();
        }
    }

    public final void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalUserFooterPreference", "mod stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365642e;
        intent.putExtra("Contact_Scene", c16861xdcf09668.N);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", c16861xdcf09668.L.d1());
        intent.putExtra("Contact_Nick", c16861xdcf09668.L.P0());
        intent.putExtra("Contact_RemarkName", c16861xdcf09668.L.w0());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.y(intent, c16861xdcf09668.f279303d);
    }

    public void c() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365642e;
        g0Var.d(14553, 2, 2, c16861xdcf09668.L.d1());
        java.lang.String d17 = c16861xdcf09668.L.d1();
        if (c01.e2.M(d17)) {
            c16861xdcf09668.L.s3();
            ((e21.z0) c01.d9.b().w()).c(new e21.l(d17, true));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).k(d17);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).y0(d17);
            return;
        }
        this.f365641d = false;
        android.content.Context context = c16861xdcf09668.f279303d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), c16861xdcf09668.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hr3.ga(this));
        if (this.f365641d) {
            str = null;
        } else {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(c16861xdcf09668.L.d1());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            d(d17);
            return;
        }
        Q.dismiss();
        android.content.Context context2 = c16861xdcf09668.f279303d;
        db5.e1.L(context2, false, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575058kl3, str), null, c16861xdcf09668.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs8), c16861xdcf09668.f279303d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boj), new hr3.ha(this), new hr3.ia(this, Q, d17), -1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
    }

    public final void d(java.lang.String str) {
        this.f365642e.L.s3();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(str);
            ((c01.k7) c01.n8.a()).e(str);
        } else {
            aq1.n nVar = (aq1.n) ((i35.g) gm0.j1.s(i35.g.class));
            nVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteContactService", "delete contact %s", str);
            nVar.a(str, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = r10.f365642e
            int r2 = r1.N
            r3 = 45
            r4 = 1
            java.lang.String r5 = "k_outside_expose_proof_item_list"
            if (r2 == r4) goto L98
            r6 = 2
            if (r2 == r6) goto L98
            r7 = 3
            if (r2 == r7) goto L98
            r8 = 9
            r9 = 35
            if (r2 == r8) goto La6
            r8 = 18
            if (r2 == r8) goto L84
            switch(r2) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto La6;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 22: goto L70;
                case 23: goto L70;
                case 24: goto L70;
                case 25: goto L3b;
                case 26: goto L70;
                case 27: goto L70;
                case 28: goto L70;
                case 29: goto L70;
                case 30: goto L2b;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 58: goto L98;
                case 59: goto L98;
                case 60: goto L98;
                default: goto L29;
            }
        L29:
            goto La6
        L2b:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            r9 = 7
            java.util.ArrayList r2 = r21.a.b(r9, r2)
            r0.putStringArrayListExtra(r5, r2)
            goto La6
        L3b:
            boolean r2 = r1.Q
            if (r2 == 0) goto L41
            r4 = 6
            goto L42
        L41:
            r4 = 5
        L42:
            r9 = r4
            if (r2 == 0) goto L53
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.b(r9, r2)
            r0.putExtra(r5, r2)
            goto La6
        L53:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.K2
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L62
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.K2
            goto L68
        L62:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
        L68:
            java.util.ArrayList r2 = r21.a.a(r2)
            r0.putExtra(r5, r2)
            goto La6
        L70:
            boolean r2 = r1.Q
            if (r2 == 0) goto L75
            r7 = 4
        L75:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.d(r2)
            r0.putStringArrayListExtra(r5, r2)
            r9 = r7
            goto La6
        L84:
            boolean r2 = r1.Q
            if (r2 == 0) goto L89
            r4 = r6
        L89:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.c(r2)
            r0.putStringArrayListExtra(r5, r2)
            r9 = r4
            goto La6
        L98:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.b(r3, r2)
            r0.putExtra(r5, r2)
            r9 = r3
        La6:
            com.tencent.mm.storage.z3 r2 = r1.L
            boolean r2 = r2.r2()
            if (r2 != 0) goto Laf
            goto Lb0
        Laf:
            r3 = r9
        Lb0:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.lang.String r4 = "k_username"
            r0.putExtra(r4, r2)
            java.lang.String r2 = "showShare"
            r4 = 0
            r0.putExtra(r2, r4)
            java.lang.String r2 = com.p314xaae8f345.mm.ui.n2.f290931a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "rawUrl"
            r0.putExtra(r3, r2)
            com.tencent.mm.ui.MMActivity r1 = r1.K1
            r2 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            j45.l.j(r1, r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.va.e():void");
    }

    public abstract void f();

    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365642e;
        if (c16861xdcf09668.V) {
            c16861xdcf09668.K1.mo74408xb0dfae51(false);
            return;
        }
        if (c01.z1.r().equals(c16861xdcf09668.L.d1())) {
            return;
        }
        if (!c16861xdcf09668.L.r2()) {
            k(false, false);
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(c16861xdcf09668.L.d1())) {
                return;
            }
            j();
        }
    }

    public void h() {
        f();
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365642e;
        c16861xdcf09668.D1.setOnClickListener(new hr3.pa(this));
        c16861xdcf09668.G1.setOnClickListener(new hr3.qa(this));
        c16861xdcf09668.E1.setOnClickListener(new hr3.ra(this));
        c16861xdcf09668.f235270y1.setOnClickListener(new hr3.sa(this));
        c16861xdcf09668.A1.setOnClickListener(new hr3.ta(this));
        c16861xdcf09668.F1.setOnClickListener(new hr3.ua(this));
        ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f94603d).add(this);
    }

    public void i() {
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
    }

    public void j() {
        this.f365642e.K1.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new hr3.ja(this));
    }

    public void k(boolean z17, boolean z18) {
        if (z17 && z18) {
            return;
        }
        this.f365642e.K1.mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new hr3.oa(this, z17, z18));
    }

    public final void l() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f365642e.K1, 1, false);
        k0Var.f293405n = new hr3.da(this);
        k0Var.f293388d2 = true;
        k0Var.Y1 = true;
        k0Var.f293414s = new hr3.ea(this);
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalUserFooterPreference", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.mo808xfb85f7b0());
    }
}
