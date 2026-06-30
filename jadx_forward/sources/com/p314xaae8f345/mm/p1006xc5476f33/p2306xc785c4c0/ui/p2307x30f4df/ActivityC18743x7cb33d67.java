package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI */
/* loaded from: classes11.dex */
public class ActivityC18743x7cb33d67 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f256433t = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f256434d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f256435e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f256436f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f256437g;

    /* renamed from: n, reason: collision with root package name */
    public long f256441n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f256438h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f256439i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f256440m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f256442o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f256443p = "";

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f256444q = null;

    /* renamed from: r, reason: collision with root package name */
    public final r35.d2 f256445r = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.o1(this);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f256446s = new java.util.HashSet();

    public final boolean V6() {
        if ((((java.lang.Object) this.f256442o) + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f256438h, ",")).equals(this.f256443p)) {
            finish();
            return true;
        }
        db5.e1.A(this, getString(this.f256444q != null ? com.p314xaae8f345.mm.R.C30867xcad56011.k0q : com.p314xaae8f345.mm.R.C30867xcad56011.k0o), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0t), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.m1(this), null);
        return false;
    }

    public void W6(java.util.List list, boolean z17) {
        java.util.List list2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list == null ? -1 : list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealOnAddContact %s", objArr);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list2 = this.f256438h;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!((java.util.ArrayList) list2).contains(str) && r17 != null && !r17.equals(str) && (n17 = Bi.n(str, true)) != null && (n17.r2() || !z17)) {
                ((java.util.ArrayList) list2).add(str);
                ((java.util.ArrayList) this.f256440m).add(str);
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f256434d;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.S(list2);
            this.f256434d.s();
        }
        if (((java.util.ArrayList) list2).size() > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f256434d;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(true);
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f256434d;
            c19662x4f7a67f33.T(true);
            c19662x4f7a67f33.V(false);
        }
        X6();
        Y6();
    }

    public final void X6() {
        java.util.List list = this.f256440m;
        if (((java.util.ArrayList) list).isEmpty()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256437g).m("revert_pref", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256437g).m("revert_pref", false);
            this.f256436f.L(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0r, java.lang.Integer.valueOf(((java.util.ArrayList) list).size())));
        }
    }

    public void Y6() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(this.f256442o);
        spannableStringBuilder.append((java.lang.CharSequence) ("(" + ((java.util.ArrayList) this.f256438h).size() + ")"));
        mo56583xbf7c1df6(spannableStringBuilder);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        V6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576498cu;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f256437g = m79336x8b97809d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("roominfo_contact_anchor");
        this.f256434d = c19662x4f7a67f3;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.R(this.f256437g, c19662x4f7a67f3.f279313q);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f256434d;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(true);
            this.f256434d.Q(this.f256438h);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f33 = this.f256434d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.n1(this);
            lz.f fVar = c19662x4f7a67f33.M;
            if (fVar != null) {
                ((r35.u1) fVar).f450808g = n1Var;
            }
            c19662x4f7a67f33.Z(this.f256445r);
        }
        this.f256435e = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256437g).h("desc");
        this.f256436f = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256437g).h("revert_pref");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f256437g).m("revert_pref", true);
        getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.k1(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.l1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onActivityResult %s", stringExtra);
            java.lang.String r17 = c01.z1.r();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (r17 == null) {
                r17 = "";
            }
            boolean equals = r17.equals(stringExtra);
            java.util.List list = this.f256438h;
            if (equals) {
                z17 = true;
            } else if (list == null) {
                z17 = false;
            } else {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                z17 = false;
                while (it.hasNext()) {
                    if (((java.lang.String) it.next()).equals(stringExtra)) {
                        z17 = true;
                    }
                }
            }
            if (z17) {
                db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571373d8), "");
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (P1 == null) {
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("App_MsgId");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) || !stringExtra2.equals("fromSns")) {
                W6(P1, true);
            } else {
                W6(P1, false);
            }
            if (!(((java.lang.Object) this.f256442o) + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",")).equals(this.f256443p) || this.f256441n == 0) {
                m78501x43e00957(true);
            } else {
                m78501x43e00957(false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
        java.util.List a17 = k35.c.a();
        java.lang.String stringExtra = getIntent().getStringExtra("k_topstory_user_list");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra);
        java.util.List list = this.f256438h;
        if (!K0) {
            java.util.List<java.lang.String> asList = java.util.Arrays.asList(stringExtra.split(","));
            this.f256439i = asList;
            for (java.lang.String str : asList) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !((java.util.ArrayList) a17).contains(str)) {
                    ((java.util.ArrayList) list).add(str);
                }
            }
        }
        mo43517x10010bd5();
        this.f256441n = getIntent().getIntExtra("k_topstory_type", 0);
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        long j17 = this.f256441n;
        mf0.f0 f0Var = mf0.f0.Medium;
        if (j17 == 1) {
            this.f256442o = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0x);
            lf0.h0 h0Var = (lf0.h0) g0Var;
            if (h0Var.Ai()) {
                this.f256435e.L(h0Var.wi(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.omt), "#", getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2), f0Var, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz)));
                this.f256442o = h0Var.wi(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.omu), "#", (int) m78519xb1736e47().getTextSize(), f0Var, m78519xb1736e47().getCurrentTextColor());
            } else {
                this.f256435e.J(com.p314xaae8f345.mm.R.C30867xcad56011.k0y);
            }
        } else {
            this.f256442o = getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0m);
            lf0.h0 h0Var2 = (lf0.h0) g0Var;
            if (h0Var2.Ai()) {
                this.f256435e.L(h0Var2.wi(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.omr), "#", getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2), f0Var, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560744sz)));
                this.f256442o = h0Var2.wi(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.oms), "#", (int) m78519xb1736e47().getTextSize(), f0Var, m78519xb1736e47().getCurrentTextColor());
            } else {
                this.f256435e.J(com.p314xaae8f345.mm.R.C30867xcad56011.k0n);
            }
        }
        gm0.j1.d().a(2859, this);
        m78501x43e00957(false);
        Y6();
        this.f256443p = ((java.lang.Object) this.f256442o) + " " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ",");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f256434d;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.getClass();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f256444q;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(2859, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (!"revert_pref".equals(c21560x1fce98fb.f279313q)) {
            return false;
        }
        db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0o), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0t), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j1(this), null);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof sm4.i) {
            sm4.i iVar = (sm4.i) m1Var;
            boolean z17 = false;
            boolean z18 = i17 == 0 && i18 == 0;
            if (!z18 || (i19 = ((r45.o50) iVar.f491481f.f152244b.f152233a).f76492x92037252.f458492d) == 0) {
                z17 = z18;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", java.lang.Integer.valueOf(i19));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", java.lang.Boolean.valueOf(z17));
            java.util.Set set = this.f256446s;
            if (!z17) {
                int i27 = iVar.f491484i + 1;
                iVar.f491484i = i27;
                if (i27 < 2) {
                    sm4.i iVar2 = new sm4.i(iVar);
                    gm0.j1.n().f354821b.g(iVar2);
                    ((java.util.HashSet) set).add(iVar2);
                }
            }
            java.util.HashSet hashSet = (java.util.HashSet) set;
            if (hashSet.contains(m1Var)) {
                hashSet.remove(m1Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", java.lang.Integer.valueOf(hashSet.size()));
                if (hashSet.isEmpty()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f256444q;
                    if (u3Var != null) {
                        u3Var.dismiss();
                        this.f256444q = null;
                    }
                    finish();
                }
            }
        }
    }
}
