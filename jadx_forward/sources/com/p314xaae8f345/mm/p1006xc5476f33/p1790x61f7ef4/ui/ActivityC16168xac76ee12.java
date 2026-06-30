package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

/* renamed from: com.tencent.mm.plugin.label.ui.ContactLabelEditUI */
/* loaded from: classes11.dex */
public class ActivityC16168xac76ee12 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int I = 0;
    public android.app.ProgressDialog C;
    public java.lang.String D;
    public java.lang.String E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224753d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224755f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 f224756g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224757h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224758i;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f224762p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f224763q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f224764r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 f224765s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f224766t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b f224767u;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224759m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224760n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f224761o = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f224768v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f224769w = true;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f224770x = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f224771y = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f224772z = new java.util.HashSet();
    public final java.util.HashSet A = new java.util.HashSet();
    public final java.util.HashSet B = new java.util.HashSet();
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73 G = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73();
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 H = new f93.g1(this, android.os.Looper.getMainLooper());

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12) {
        activityC16168xac76ee12.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveLabelChange]");
        activityC16168xac76ee12.C = db5.e1.Q(activityC16168xac76ee12, activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9k), true, true, new f93.c1(activityC16168xac76ee12));
        java.lang.String str = activityC16168xac76ee12.f224754e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        activityC16168xac76ee12.f224754e = str;
        java.lang.String trim = str.trim();
        activityC16168xac76ee12.f224754e = trim;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            activityC16168xac76ee12.m65196xce38d9a();
            activityC16168xac76ee12.a7(activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g96));
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(activityC16168xac76ee12.f224754e) > 36) {
            activityC16168xac76ee12.m65196xce38d9a();
            activityC16168xac76ee12.a7(java.lang.String.format(activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571363cy), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(36, ""))));
            return;
        }
        boolean z18 = true;
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b93.r.wi().p1(activityC16168xac76ee12.f224754e))) || !activityC16168xac76ee12.f224768v) {
            if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b93.r.wi().p1(activityC16168xac76ee12.f224754e))) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16168xac76ee12.f224753d) || activityC16168xac76ee12.f224753d.equals(activityC16168xac76ee12.f224754e)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(activityC16168xac76ee12.f224755f);
                if (activityC16168xac76ee12.f224768v || n17.f66584x284d1882) {
                    c01.d9.e().g(new e93.a(activityC16168xac76ee12.f224754e));
                } else {
                    c01.d9.e().g(new e93.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(activityC16168xac76ee12.f224755f, 0), activityC16168xac76ee12.f224754e));
                }
                java.lang.String str2 = activityC16168xac76ee12.f224760n;
                if (str2 != null) {
                    int length = str2.length();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        int codePointAt = str2.codePointAt(i17);
                        if (!java.lang.Character.isWhitespace(codePointAt)) {
                            z18 = false;
                            break;
                        }
                        i17 += java.lang.Character.charCount(codePointAt);
                    }
                    if (z18) {
                        return;
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "label_update_finish_btn");
                    hashMap.put("label_business_type", java.lang.Integer.valueOf(activityC16168xac76ee12.f224761o));
                    hashMap.put("label_select_sessionid", activityC16168xac76ee12.f224760n);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", activityC16168xac76ee12.m79335xcc101dd9(), hashMap, 33926);
                    return;
                }
                return;
            }
        }
        activityC16168xac76ee12.m65196xce38d9a();
        activityC16168xac76ee12.a7(activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571359cu));
    }

    public final void W6(com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        if (b93.r.wi().mo9951xb06685ab(d4Var, "labelID")) {
            setResult(-1);
            finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan[doDeleteContactLabel] fail.");
            a7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5));
        }
    }

    public final void X6() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.util.HashSet hashSet = this.f224772z;
        objArr[0] = java.lang.Integer.valueOf(hashSet == null ? 0 : hashSet.size());
        java.util.HashSet hashSet2 = this.B;
        objArr[1] = java.lang.Integer.valueOf(hashSet2 != null ? hashSet2.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (hashSet != null && hashSet.size() > 0) {
            hashSet.size();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n((java.lang.String) it.next(), true);
                java.lang.String D0 = n17.D0();
                java.lang.String b17 = b93.n.b(D0, this.f224755f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "labels:%s mixLabelIds:%s", D0, b17);
                if (!b17.equalsIgnoreCase(D0)) {
                    r45.gw6 gw6Var = new r45.gw6();
                    gw6Var.f457114d = n17.d1();
                    gw6Var.f457115e = b17;
                    linkedList.add(gw6Var);
                }
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            hashSet2.size();
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                java.lang.String D02 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true).D0();
                java.lang.String c17 = b93.n.c(D02, this.f224755f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "username:%s labels:%s mixLabelIds:%s", str, D02, c17);
                if (!c17.equalsIgnoreCase(D02)) {
                    r45.gw6 gw6Var2 = new r45.gw6();
                    gw6Var2.f457114d = str;
                    gw6Var2.f457115e = c17;
                    linkedList.add(gw6Var2);
                }
            }
        }
        if (linkedList.size() > 0) {
            c01.d9.e().g(new e93.e(linkedList));
        } else {
            Y6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12.Y6():void");
    }

    public final void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[saveFailed]");
        m65196xce38d9a();
        a7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571360cv));
    }

    public void a7(java.lang.String str) {
        db5.e1.t(this, str, "", new f93.d1(this));
    }

    public final void b7() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f224764r;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.Q(this.f224770x);
            java.util.ArrayList arrayList = this.f224770x;
            if (arrayList == null || arrayList.size() <= 0) {
                this.f224764r.N();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58 = this.f224765s;
        if (c16179x5fcf4d58 != null) {
            c16179x5fcf4d58.N(this.f224754e);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getIdentString */
    public s75.b mo65195x6a200eb() {
        return new s75.b(this.f224768v ? "_New" : "_Edit");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576431ay;
    }

    /* renamed from: hideLoading */
    public final void m65196xce38d9a() {
        android.app.ProgressDialog progressDialog = this.C;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.C.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 0, 2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 0, 3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224755f)) {
            this.f224768v = true;
            this.f224762p = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574252hl2);
        } else {
            this.f224768v = false;
            this.f224756g = b93.r.wi().n1(this.f224755f);
            this.f224762p = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574251hl1);
        }
        mo54450xbf7c1df6(this.f224762p);
        mo54448x9c8c0d33(new f93.h1(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new f93.i1(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f224763q = m79336x8b97809d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("contact_label_contact_list");
        this.f224764r = c19662x4f7a67f3;
        c19662x4f7a67f3.R(this.f224763q, c19662x4f7a67f3.f279313q);
        this.f224764r.T(true);
        this.f224764r.V(true);
        lz.f fVar = this.f224764r.M;
        if (fVar != null) {
            ((r35.u1) fVar).f450807f.getClass();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f224764r;
        lz.f fVar2 = c19662x4f7a67f32.M;
        if (fVar2 != null) {
            ((r35.u1) fVar2).f450806e = false;
        }
        f93.j1 j1Var = new f93.j1(this);
        if (fVar2 != null) {
            ((r35.u1) fVar2).f450808g = j1Var;
        }
        c19662x4f7a67f32.Z(new f93.k1(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d58 = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).h("contact_label_name");
        this.f224765s = c16179x5fcf4d58;
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8z);
        c16179x5fcf4d58.M = string;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c16179x5fcf4d58.S;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setHint(string);
        }
        this.f224765s.N = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d582 = this.f224765s;
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571361cw);
        c16179x5fcf4d582.P = string2;
        android.widget.TextView textView = c16179x5fcf4d582.U;
        if (textView != null) {
            textView.setText(string2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16179x5fcf4d58 c16179x5fcf4d583 = this.f224765s;
        c16179x5fcf4d583.Q = 36;
        c16179x5fcf4d583.R = this.f224768v;
        c16179x5fcf4d583.W = new f93.l1(this);
        c16179x5fcf4d583.N(this.f224754e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.H;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
        }
        if (this.f224768v) {
            java.util.ArrayList arrayList = this.f224770x;
            if (arrayList == null || arrayList.size() <= 0) {
                lz.f fVar3 = this.f224764r.M;
                if (fVar3 != null) {
                    r35.u1 u1Var = (r35.u1) fVar3;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(0);
                    r35.v1 v1Var = u1Var.f450807f;
                    v1Var.f450840z = false;
                    v1Var.f450824g = arrayList2;
                    u1Var.a(null);
                }
            } else {
                this.f224764r.Q(this.f224770x);
            }
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new f93.m1(this));
        }
        if (m79335xcc101dd9() != null) {
            m79335xcc101dd9().setOnScrollListener(new f93.n1(this));
        }
        this.f224766t = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).h("contact_label_delete");
        this.f224767u = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).h("contact_label_empty_category");
        if (!this.f224768v) {
            if (this.f224759m) {
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).v(this.f224766t);
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).v(this.f224766t);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f224763q).v(this.f224767u);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 7001) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onActivityResult] %s", stringExtra + "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i19 = 0; i19 < size; i19++) {
                    java.lang.String str = (java.lang.String) P1.get(i19);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f224770x.contains(str) || str.equals(this.D)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f224770x.add(str);
                            java.util.ArrayList arrayList = this.f224771y;
                            if (arrayList != null && !arrayList.contains(P1.get(i19))) {
                                this.f224772z.add(str);
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73 c6380x9b776c73 = this.G;
                                c6380x9b776c73.f137277l++;
                                c6380x9b776c73.f137278m = c6380x9b776c73.b("TotoalAddUinList", c6380x9b776c73.f137278m + ";" + str, true);
                            }
                            if (booleanExtra) {
                                this.A.add(str);
                            }
                            java.util.HashSet hashSet = this.B;
                            if (hashSet != null && hashSet.contains(str)) {
                                hashSet.remove(str);
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.H;
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224754e) && !this.f224754e.equals(this.f224753d)) || (((hashSet = this.f224772z) != null && hashSet.size() > 0) || ((hashSet2 = this.B) != null && hashSet2.size() > 0))) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8_), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.apf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.api), new f93.e1(this), new f93.f1(this));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.D = c01.z1.r();
        this.f224755f = getIntent().getStringExtra("label_id");
        this.f224753d = getIntent().getStringExtra("label_name");
        this.f224754e = getIntent().getStringExtra("label_name");
        this.f224757h = getIntent().getBooleanExtra("Is_Chatroom", false);
        this.f224758i = getIntent().getIntExtra("last_page_source_type", 0) == 1;
        java.lang.String stringExtra = getIntent().getStringExtra("label_source");
        this.E = stringExtra;
        this.F = stringExtra != null && stringExtra.equals("label_source_Address");
        this.f224759m = getIntent().getBooleanExtra("is_show_delete", true);
        this.f224760n = getIntent().getStringExtra("contact_select_label_session_id");
        this.f224761o = getIntent().getIntExtra("contact_select_label_from_scene", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
            this.f224770x = new java.util.ArrayList();
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.String str = (java.lang.String) P1.get(i17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f224770x.contains(str) || str.equals(this.D)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f224770x.add(str);
                            this.f224772z.add(str);
                            if (this.f224757h) {
                                this.A.add(str);
                            }
                        }
                    }
                }
            }
        }
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
        c01.d9.e().a(637, this);
        c01.d9.e().a(638, this);
        mo43517x10010bd5();
        int i18 = java.util.Objects.equals(this.E, "label_source_Address") ? 1 : java.util.Objects.equals(this.E, "label_source_SNS") ? 2 : -1;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6380x9b776c73 c6380x9b776c73 = this.G;
        c6380x9b776c73.f137269d = i18;
        c6380x9b776c73.f137270e = c6380x9b776c73.b("SessionID", this.D + "-" + java.lang.System.currentTimeMillis(), true);
        c6380x9b776c73.f137271f = c6380x9b776c73.b("LabelID", this.f224755f, true);
        c6380x9b776c73.f137273h = 0;
        c6380x9b776c73.f137274i = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        c01.d9.e().q(637, this);
        c01.d9.e().q(638, this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = this.f224764r;
        if (c19662x4f7a67f3 != null) {
            c19662x4f7a67f3.getClass();
        }
        super.onDestroy();
        this.G.k();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan [onPreferenceTreeClick] key is null.");
            return false;
        }
        if (str.equals("contact_label_delete")) {
            db5.e1.B(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8v), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8u), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new f93.o1(this), new f93.b1(this), com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        m78501x43e00957(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224754e));
        b7();
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.H;
        switch (mo808xfb85f7b0) {
            case kd1.c.f72435x366c91de /* 635 */:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                java.util.LinkedList linkedList = ((r45.c4) ((e93.a) m1Var).f331881d.f152244b.f152233a).f452793e;
                if (linkedList == null || linkedList.size() <= 0) {
                    Z6();
                    return;
                }
                r45.f54 f54Var = (r45.f54) linkedList.get(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", f54Var.f455555e + "", f54Var.f455554d);
                this.f224755f = f54Var.f455555e + "";
                com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
                java.lang.String str2 = this.f224755f;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f224772z);
                wi6.getClass();
                java.lang.String str3 = "cacheNewLabelUsers() called with: id = [" + str2 + "], size= [" + arrayList.size() + "], user = [" + arrayList + "] stack:%s";
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", str3, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                wi6.f276538g.put(str2, arrayList);
                X6();
                return;
            case 636:
                if (i17 != 0 || i18 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelEditUI", "cpan[onSceneEnd] delete fail.");
                    a7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572576bo5));
                    return;
                } else {
                    W6(this.f224756g);
                    if (n3Var != null) {
                        n3Var.mo50307xb9e94560(6002, 300L);
                        return;
                    }
                    return;
                }
            case 637:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                java.lang.String str4 = this.f224755f;
                java.lang.String str5 = this.f224754e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelEditUI", "cpan[doInsertOrUpdateLable]");
                try {
                    i19 = java.lang.Integer.valueOf(str4).intValue();
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelEditUI", "id is not integer type:%s", str4 + "");
                    i19 = -1;
                }
                if (i19 != -1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1(str4);
                    if (n17 == null) {
                        n17 = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                    }
                    n17.f66585x70ce48ca = i19;
                    n17.f66586x7661fe9a = str5;
                    n17.f66587x68c44467 = x51.k.a(str5);
                    n17.f66588xb0759da4 = x51.k.b(str5);
                    b93.r.wi().mo9952xce0038c9(n17, "labelID");
                } else {
                    Z6();
                }
                X6();
                return;
            case 638:
                if (i17 != 0 || i18 != 0) {
                    Z6();
                    return;
                }
                Y6();
                if (n3Var != null) {
                    n3Var.mo50307xb9e94560(6002, 300L);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
