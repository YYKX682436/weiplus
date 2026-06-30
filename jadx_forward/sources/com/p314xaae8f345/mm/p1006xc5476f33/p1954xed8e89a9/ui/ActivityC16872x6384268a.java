package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 */
/* loaded from: classes11.dex */
public class ActivityC16872x6384268a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int R1 = 0;
    public boolean A;
    public boolean C;
    public android.view.View N1;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a O1;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 P;
    public java.lang.String P1;
    public android.view.View Q1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 R;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 S;
    public android.widget.Button T;
    public java.lang.Boolean U;
    public java.lang.String Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235376e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f235377f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f235378g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235379h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f235380i;

    /* renamed from: l1, reason: collision with root package name */
    public int f235381l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f235382m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f235383n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235384o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f235385p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f235388q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f235389r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f235390s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f235392u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f235393v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f235394w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f235395x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f235396x0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f235398y;

    /* renamed from: y0, reason: collision with root package name */
    public int f235399y0;

    /* renamed from: z, reason: collision with root package name */
    public int f235401z;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f235391t = null;
    public boolean B = false;
    public final int[] D = new int[8];
    public final int[] E = new int[6];
    public int[] F = new int[3];
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f235374J = false;
    public boolean K = false;
    public java.util.List L = new java.util.ArrayList();
    public java.util.ArrayList M = new java.util.ArrayList();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public final java.util.ArrayList Q = new java.util.ArrayList();
    public boolean V = false;
    public boolean W = false;
    public boolean X = false;

    /* renamed from: p0, reason: collision with root package name */
    public int f235386p0 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f235387p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public java.lang.String f235397x1 = "";

    /* renamed from: y1, reason: collision with root package name */
    public java.util.List f235400y1 = new java.util.ArrayList();

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashSet f235402z1 = new java.util.HashSet();
    public final java.util.HashSet A1 = new java.util.HashSet();
    public final java.util.HashSet B1 = new java.util.HashSet();
    public final java.util.HashSet C1 = new java.util.HashSet();
    public boolean D1 = false;
    public java.lang.CharSequence E1 = null;
    public final boolean[] F1 = {true};
    public final boolean[] G1 = {false};
    public final android.text.TextWatcher H1 = new hr3.kh(this);
    public final long I1 = java.lang.System.currentTimeMillis();
    public int J1 = 0;
    public int K1 = 0;
    public int L1 = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 M1 = null;

    public final void T6(java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r21.w.Ai().b1(this.f235393v);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235393v, true);
        if (list == null || !list.contains(this.f235393v)) {
            return;
        }
        boolean z17 = !n17.r2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "buildContact userName:%s contact.getContactID():%s type:%s isNewContact:%s", this.f235393v, java.lang.Integer.valueOf((int) n17.E2), java.lang.Integer.valueOf(n17.m124896xfb85f7b0()), java.lang.Boolean.valueOf(z17));
        if (((int) n17.E2) == 0) {
            n17 = y35.r.f(b17);
            n17.X1(this.f235393v);
            if (!(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(n17) > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiWithSnsPermissionUI3", "canAddContact fail, insert fail");
                return;
            }
        }
        c01.e2.m0(n17);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
        r21.w.wi().k1(this.f235393v, 1);
        if (z17) {
            y35.r.l(this.f235393v, this.f235401z, "sayhiui1");
        }
    }

    public void U6() {
        this.T.setEnabled(false);
        this.T.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        this.T.setBackground(getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
    }

    public void V6() {
        this.T.setEnabled(true);
        this.T.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
        this.T.setBackground(getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
    }

    public final boolean W6(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        java.util.Collections.sort(arrayList);
        java.util.Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    public final void X6() {
        if (this.A) {
            java.lang.String trim = this.f235375d.m79028xfb85ada3().toString().trim();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) || trim.equals(this.E1) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235392u)) {
                c01.d9.b().p().w(294913, "");
            } else {
                c01.d9.b().p().w(294913, trim);
            }
        }
    }

    public final void Y6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "dismissTipDialog");
        android.app.ProgressDialog progressDialog = this.f235391t;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f235391t = null;
        }
    }

    public void Z6(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).f351781m.b(a7(), ((hr3.ld) pf5.z.f435481a.a(this).a(hr3.ld.class)).Q6(), null, this.f235379h);
            ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new hr3.wh(this, j17));
    }

    public final java.lang.String a7() {
        java.lang.String charSequence = this.f235379h.m79028xfb85ada3() != null ? this.f235379h.m79028xfb85ada3().toString() : "";
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence) || charSequence.length() <= 50) ? charSequence : charSequence.substring(0, 50);
    }

    public final java.lang.String b7() {
        java.lang.String trim = this.f235375d.m79028xfb85ada3().toString().trim();
        return com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(this.f235375d.m79028xfb85ada3().toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) <= 100 ? trim : trim.substring(0, 100);
    }

    public final java.util.ArrayList c7() {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        if (this.M == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f235393v);
        java.lang.String str = z08 != null ? z08.f66693x91130dba : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235393v, true);
            if (n17 != null) {
                java.lang.String J0 = n17.J0();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0) && (z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(J0)) != null) {
                    str = z07.f66693x91130dba;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.ya z09 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(n17.d1());
                    if (z09 != null) {
                        str = z09.f66693x91130dba;
                    }
                }
            }
        }
        return (java.util.ArrayList) ((b93.b) c93.a.a()).f(str);
    }

    public void d7(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        int i17 = g7() ? 8 : 1;
        if (z17) {
            if (str != null && !str.isEmpty()) {
                intent.putExtra("AntispamTicket", str);
            }
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", i17);
        intent.putExtra("Contact_RemarkName", a7());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final boolean e7() {
        this.E[0] = 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r21.w.Ai().b1(this.f235393v);
        if (b17 != null) {
            y35.r c17 = y35.r.c(this, b17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f540766b) && !c17.f540766b.equals(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbh))) {
                this.f235397x1 = c17.f540766b;
            }
        }
        if (((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
            java.lang.String str = this.f235393v;
            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).V6(new gc0.b0(str, this.f235395x), new yz5.a() { // from class: hr3.hh$$i
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this.f235379h.getEditText();
                }
            }, new yz5.a() { // from class: hr3.hh$$j
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                    activityC16872x6384268a.getClass();
                    return ((hr3.ld) pf5.z.f435481a.a(activityC16872x6384268a).a(hr3.ld.class)).Q6();
                }
            }, new yz5.a() { // from class: hr3.hh$$k
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                    activityC16872x6384268a.getClass();
                    if (((hr3.ld) pf5.z.f435481a.a(activityC16872x6384268a).a(hr3.ld.class)).f365299d != null) {
                        return java.lang.Boolean.valueOf(!r0.f());
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
                    throw null;
                }
            }, new yz5.l() { // from class: hr3.hh$$l
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                    activityC16872x6384268a.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onclick AddPhone");
                    return java.lang.Boolean.valueOf(((hr3.ld) pf5.z.f435481a.a(activityC16872x6384268a).a(hr3.ld.class)).O6((java.lang.String) obj));
                }
            }, null, new yz5.a() { // from class: hr3.hh$$e
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16872x6384268a.f235397x1)) {
                        return null;
                    }
                    activityC16872x6384268a.h7(activityC16872x6384268a.f235397x1);
                    return null;
                }
            });
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235397x1)) {
            h7(this.f235397x1);
        }
        this.D[3] = 3;
        this.B = true;
        return true;
    }

    public final boolean f7() {
        return ((java.lang.Boolean) this.f235389r.getTag()).booleanValue();
    }

    public final boolean g7() {
        return ((java.lang.Boolean) this.f235388q.getTag()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chm;
    }

    public final void h7(java.lang.String str) {
        android.view.View view = this.f235380i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f235382m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh9, str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        float textSize = this.f235382m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string, textSize));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la7));
        f0Var.c(new hr3.mi(this, str), 0, f0Var.length(), 17);
        this.f235382m.append(" ");
        this.f235382m.append(f0Var);
        this.f235382m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void i7() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O6 = ((bs3.l) pf5.z.f435481a.a(this).a(bs3.l.class)).O6();
        boolean z17 = (O6 != null ? O6.getContent() : null) != null;
        int[] iArr = this.E;
        if (z17) {
            iArr[5] = 1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235393v, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f235393v);
        if (z07 == null || (str = z07.f66690xbe857eff) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && n17 != null) {
            str = n17.f318122y1;
        }
        if (this.S != null) {
            iArr[4] = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(str);
            this.S.m67737xe9f5bdb7(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(ir3.f.class);
        hashSet.add(hr3.ld.class);
        hashSet.add(gc0.p2.class);
        hashSet.add(hr3.pf.class);
        hashSet.add(bs3.l.class);
        hashSet.add(j93.n.class);
        hashSet.add(hr3.gg.class);
        hashSet.add(hr3.w1.class);
        hashSet.add(gc0.b.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        r61.a h17;
        android.text.SpannableString spannableString;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17;
        boolean z17 = false;
        this.A = getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false);
        this.C = getIntent().getBooleanExtra("sayhi_with_sns_perm_add_remark", false);
        this.f235393v = getIntent().getStringExtra("Contact_User");
        this.f235401z = getIntent().getIntExtra("Contact_Scene", 9);
        this.f235392u = getIntent().getStringExtra("room_name");
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_RemarkName");
        this.f235398y = stringExtra;
        this.Z = stringExtra;
        this.f235395x = getIntent().getStringExtra("Contact_Nick");
        this.f235394w = getIntent().getStringExtra("Contact_RoomNickname");
        this.f235380i = findViewById(com.p314xaae8f345.mm.R.id.jp7);
        this.f235382m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jp8);
        this.T = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g68);
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s1.d(this.f235393v) && !getIntent().getBooleanExtra("Contact_IsForceVerifyFriend", false);
        this.V = z18;
        this.W = !z18 && this.A;
        this.S = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) findViewById(com.p314xaae8f345.mm.R.id.v08);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) findViewById(com.p314xaae8f345.mm.R.id.v0c);
        this.R = c16924x6da766a4;
        if (c16924x6da766a4 != null) {
            c16924x6da766a4.m67736x5db1c8a().c().setId(com.p314xaae8f345.mm.R.id.u8m);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235393v)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "initLabelPanelAll, isOpenIM, userName: %s.", this.f235393v);
                this.R.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a42 = this.S;
                if (c16924x6da766a42 != null) {
                    c16924x6da766a42.setVisibility(8);
                }
            } else {
                this.R.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hh$$f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                        activityC16872x6384268a.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC16872x6384268a, array);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All startContactLabelUI].");
                        android.content.Intent intent = new android.content.Intent();
                        java.util.ArrayList<java.lang.String> arrayList2 = activityC16872x6384268a.M;
                        if (arrayList2 != null) {
                            intent.putStringArrayListExtra("label_str_list", arrayList2);
                        }
                        activityC16872x6384268a.f235396x0 = true;
                        intent.putExtra("save_label_to_contact_on_prepage", false);
                        intent.putExtra("label_username", activityC16872x6384268a.f235393v);
                        intent.putExtra("is_stranger", true);
                        ((j93.n) activityC16872x6384268a.m80391xac8f1cfd(j93.n.class)).V6(600, intent, false, activityC16872x6384268a.M);
                        yj0.a.h(activityC16872x6384268a, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.S.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hh$$g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                        activityC16872x6384268a.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC16872x6384268a, array);
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(activityC16872x6384268a.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.class);
                        intent.putExtra("Contact_User", activityC16872x6384268a.f235393v);
                        intent.putExtra("key_intent_assemble_ui_half_screen_title", activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_k));
                        kr3.s1.f393008a.a(intent, activityC16872x6384268a, activityC16872x6384268a.f235393v, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h.class, 100, false);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("note_sid", (java.lang.String) ((jz5.n) ((hr3.w1) activityC16872x6384268a.m80391xac8f1cfd(hr3.w1.class)).f365663e).mo141623x754a37bb());
                        hashMap.put("add_username", activityC16872x6384268a.f235393v);
                        hashMap.put("view_id", "add_describe_float");
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 33926);
                        yj0.a.h(activityC16872x6384268a, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.L = b93.r.wi().k1();
                java.util.ArrayList c76 = c7();
                if (c76 != null) {
                    this.M.addAll(c76);
                    java.util.ArrayList arrayList = this.N;
                    java.util.ArrayList arrayList2 = this.M;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (arrayList2 != null) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(b93.r.wi().p1((java.lang.String) it.next()));
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                java.util.List list = this.L;
                if (list != null) {
                    this.f235399y0 = list.size();
                }
                if (c76 != null) {
                    this.f235381l1 = c76.size();
                    this.f235400y1.addAll(c76);
                }
                j7(c76);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "isCurrentHappenChatting = " + this.V);
        boolean z19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        this.G = z19;
        if (!z19) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nxt);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235393v, true);
        this.I = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0) == 1;
        this.f235384o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.kdq).findViewById(com.p314xaae8f345.mm.R.id.kdu);
        getIntent().getBooleanExtra("sayhi_with_sns_permission", false);
        this.f235384o.m81392x52cfa5c6(n18.x2());
        this.f235388q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nxq);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.n_y);
        this.f235389r = imageView;
        imageView.setVisibility(0);
        this.f235388q.setVisibility(0);
        l02.n.a(this.f235389r, "checkbox_cell_off");
        l02.n.a(this.f235388q, "checkbox_cell_off");
        android.widget.ImageView imageView2 = this.f235389r;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        imageView2.setTag(bool);
        this.f235388q.setTag(bool);
        this.f235390s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nxr);
        this.f235385p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.n6q).findViewById(com.p314xaae8f345.mm.R.id.f567692ke3);
        this.f235385p.m81392x52cfa5c6(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(this.f235393v, 5L));
        pf5.z zVar = pf5.z.f435481a;
        ((hr3.ld) zVar.a(this).a(hr3.ld.class)).S6();
        findViewById(com.p314xaae8f345.mm.R.id.f564963at4).setOnClickListener(new hr3.qh(this));
        i7();
        int i17 = n18.I;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kdv);
        if (i17 == 1) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jdc);
        } else if (i17 == 2) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.jdb);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567693ke4);
        if (i17 == 1) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j9h);
        } else if (i17 == 2) {
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j9g);
        }
        boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235393v);
        this.K = m47;
        if (m47) {
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nxt);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.kds);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById3, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            ((android.view.View) this.f235388q.getParent()).setOnClickListener(new hr3.xh(this));
            ((android.view.View) this.f235389r.getParent()).setOnClickListener(this.H ? null : new hr3.yh(this));
            int intExtra = getIntent().getIntExtra("Contact_default_permission", -1);
            if (intExtra > 0) {
                if ((intExtra & 8) == 8) {
                    this.U = bool;
                    k7(false);
                } else {
                    this.U = java.lang.Boolean.TRUE;
                    k7(true);
                }
            }
        }
        if (this.K) {
            this.f235385p.m81392x52cfa5c6(true);
        }
        if (this.A) {
            this.f235375d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.m9y);
            this.f235377f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mnm);
            this.f235378g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c8o);
            if (this.W) {
                ((hr3.pf) m80391xac8f1cfd(hr3.pf.class)).V6(new yz5.a() { // from class: hr3.hh$$h
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this.f235374J = true;
                        return null;
                    }
                });
            }
            java.lang.String l17 = c01.z1.l();
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iih);
            if (string.length() + l17.length() > 50) {
                l17 = l17.substring(0, 50 - string.length());
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235392u) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235392u, true)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
                spannableString = null;
            } else {
                java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f235392u).z0(c01.z1.r());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(z07)) {
                    z07 = l17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "chatroomName:%s nick:%s", this.f235392u, n17.P0());
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.String string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iii, n17.P0(), z07);
                float m79030x40077844 = this.f235375d.m79030x40077844();
                ((ke0.e) xVar).getClass();
                spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, string2, m79030x40077844);
                this.E1 = spannableString;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.E1)) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                java.lang.String format = java.lang.String.format(string, l17);
                float m79030x400778442 = this.f235375d.m79030x40077844();
                ((ke0.e) xVar2).getClass();
                this.E1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, format, m79030x400778442);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString)) {
                this.f235375d.m79039x765074af(this.E1);
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                float m79030x400778443 = this.f235375d.m79030x40077844();
                ((ke0.e) xVar3).getClass();
                this.f235375d.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471793, spannableString, m79030x400778443));
            }
            this.f235376e = this.f235375d.m79028xfb85ada3().toString();
            this.f235375d.b(new hr3.zh(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235375d;
        if (c21503x6e5a020a == null || !(c21503x6e5a020a.getParent() instanceof android.widget.LinearLayout)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "updateSayHiContextVisiable");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s.", java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.V), java.lang.Boolean.valueOf(this.W));
            if (this.W) {
                ((android.widget.LinearLayout) this.f235375d.getParent()).setVisibility(0);
            } else {
                ((android.widget.LinearLayout) this.f235375d.getParent()).setVisibility(8);
            }
        }
        if (this.C) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.m_1);
            this.f235379h = c21503x6e5a020a2;
            ((android.widget.LinearLayout) c21503x6e5a020a2.getParent()).setVisibility(0);
            this.f235383n = findViewById(com.p314xaae8f345.mm.R.id.uya);
            this.f235379h.b(this.H1);
            if (!this.A) {
                this.f235379h.clearFocus();
            }
            if (this.A) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hny);
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hnq);
                this.D[0] = 1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235398y)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235395x)) {
                    if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p()) {
                        this.f235379h.m79033x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574084gy1));
                        this.f235379h.m79034x5afba1b1(false);
                    } else {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a3 = this.f235379h;
                        le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = mo55332x76847179();
                        java.lang.String str = this.f235395x;
                        float m79030x400778444 = this.f235379h.m79030x40077844();
                        ((ke0.e) xVar4).getClass();
                        c21503x6e5a020a3.m79033x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471794, str, m79030x400778444));
                    }
                    this.f235379h.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: hr3.hh$$d
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(android.view.View view, boolean z27) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                            if (z27) {
                                activityC16872x6384268a.X = true;
                            } else {
                                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                                activityC16872x6384268a.getClass();
                            }
                        }
                    });
                }
                switch (this.f235401z) {
                    case 8:
                    case 14:
                        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235394w) && !this.f235394w.equals(this.f235379h.m79028xfb85ada3().toString())) {
                            this.E[0] = 2;
                            android.view.View view = this.f235380i;
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                            arrayList7.add(0);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView3 = this.f235382m;
                            le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh6, this.f235394w);
                            java.lang.String str2 = string3 != null ? string3 : "";
                            float textSize = this.f235382m.getTextSize();
                            ((ke0.e) xVar5).getClass();
                            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str2, textSize));
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                            f0Var.c(new hr3.mi(this, this.f235394w), 0, f0Var.length(), 17);
                            this.f235382m.append(" ");
                            this.f235382m.append(f0Var);
                            this.f235382m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            this.D[3] = 2;
                            z17 = true;
                            break;
                        }
                        break;
                    case 10:
                    case 11:
                    case 13:
                        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() && (h17 = m61.k.wi().h(this.f235393v)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h()) && !h17.h().equals(this.f235379h.m79028xfb85ada3().toString())) {
                            android.view.View view2 = this.f235380i;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                            arrayList8.add(0);
                            java.util.Collections.reverse(arrayList8);
                            yj0.a.d(view2, arrayList8.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView4 = this.f235382m;
                            le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh7, h17.h());
                            if (string4 == null) {
                                string4 = "";
                            }
                            float textSize2 = this.f235382m.getTextSize();
                            ((ke0.e) xVar6).getClass();
                            textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string4, textSize2));
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                            f0Var2.c(new hr3.mi(this, h17.h()), 0, f0Var2.length(), 17);
                            this.f235382m.append(" ");
                            this.f235382m.append(f0Var2);
                            this.f235382m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            this.D[3] = 1;
                            java.lang.String f17 = h17.f();
                            if (f17 == null) {
                                f17 = "";
                            }
                            this.f235387p1 = f17.replace(" ", "");
                            z17 = true;
                            break;
                        }
                        break;
                }
                if ((com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() || !this.A) && !z17) {
                    e7();
                }
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a4 = this.f235379h;
                le0.x xVar7 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = mo55332x76847179();
                java.lang.String str3 = this.f235398y;
                float m79030x400778445 = this.f235379h.m79030x40077844();
                ((ke0.e) xVar7).getClass();
                c21503x6e5a020a4.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471795, str3, m79030x400778445));
                this.D[6] = 1;
                if (!this.A && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
                    e7();
                }
            }
            if (this.f235379h.m79021xfb8046fd() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235379h.m79021xfb8046fd().toString())) {
                this.Y = this.f235379h.m79021xfb8046fd().toString();
            }
            if (this.f235379h.m79028xfb85ada3() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235379h.m79028xfb85ada3().toString())) {
                this.Y = this.f235379h.m79028xfb85ada3().toString();
            }
        }
        if (!this.K && !this.A && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
            ((hr3.ld) zVar.a(this).a(hr3.ld.class)).T6(this.f235393v, this.f235387p1);
        }
        java.lang.String string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        if (!this.A) {
            string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
        }
        if (this.V) {
            string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
        }
        java.lang.String a17 = fo3.l.a(3);
        this.T.setText(string5);
        this.T.setOnClickListener(new hr3.ai(this, a17));
        this.T.setOnTouchListener(new hr3.di(this, a17));
        mo54448x9c8c0d33(new hr3.ei(this));
        U6();
        if (!this.G) {
            V6();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.P = f5Var;
        f5Var.f291933e = this;
        if (this.V) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hnr);
        }
        int intExtra2 = getIntent().getIntExtra("Contact_default_permission", -1);
        if (!this.K && intExtra2 > 0) {
            V6();
        }
        l7();
        if (this.f235379h.c()) {
            U6();
        } else {
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: isHideVKBWhenScroll */
    public boolean mo48757x621268a8() {
        return true;
    }

    public final void j7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) m80391xac8f1cfd(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.R.m67737xe9f5bdb7("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.R.m67737xe9f5bdb7(sb6.toString());
    }

    public final void k7(boolean z17) {
        this.f235389r.setVisibility(0);
        this.f235388q.setVisibility(0);
        if (z17) {
            l02.n.a(this.f235389r, "checkbox_cell_on");
            l02.n.a(this.f235388q, "checkbox_cell_off");
            this.f235389r.setTag(java.lang.Boolean.TRUE);
            this.f235388q.setTag(java.lang.Boolean.FALSE);
            return;
        }
        l02.n.a(this.f235389r, "checkbox_cell_off");
        l02.n.a(this.f235388q, "checkbox_cell_on");
        this.f235389r.setTag(java.lang.Boolean.FALSE);
        this.f235388q.setTag(java.lang.Boolean.TRUE);
    }

    public final void l7() {
        android.widget.ImageView imageView = this.f235389r;
        if (imageView != null) {
            imageView.setContentDescription(!f7() ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8m) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8l));
        }
        android.widget.ImageView imageView2 = this.f235388q;
        if (imageView2 != null) {
            imageView2.setContentDescription(!g7() ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8m) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8l));
        }
    }

    public final void m7() {
        android.content.res.Resources resources;
        int i17;
        this.U = java.lang.Boolean.valueOf((this.I || this.H) ? false : true);
        this.f235388q.setVisibility(0);
        this.f235389r.setVisibility(0);
        k7(this.U.booleanValue());
        ((android.view.View) this.f235388q.getParent()).setOnClickListener(new hr3.lh(this));
        ((android.view.View) this.f235389r.getParent()).setOnClickListener(this.H ? null : new hr3.mh(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kds);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568570na3);
        if (this.H) {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk;
        } else {
            resources = getResources();
            i17 = com.p314xaae8f345.mm.R.C30859x5a72f63.a0c;
        }
        textView.setTextColor(resources.getColor(i17));
        if (this.H) {
            this.f235390s.setVisibility(0);
        }
        this.I = false;
    }

    public final void n7(java.lang.String str, int i17, long j17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
        am.oo ooVar = c5845xa0f7b469.f136154g;
        ooVar.f89103e = linkedList;
        ooVar.f89099a = i17;
        ooVar.f89100b = j17;
        c5845xa0f7b469.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 100) {
            if (intent != null && intent.hasExtra("Contact_get_desc_report_data")) {
                this.F = intent.getIntArrayExtra("Contact_get_desc_report_data");
            }
            i7();
            return;
        }
        if (i18 == -1 && intent != null && i17 == 600) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            ((j93.n) m80391xac8f1cfd(j93.n.class)).O6(stringArrayListExtra, intent.getIntExtra("recommend_label_adopt_count", 0));
            java.util.List<java.lang.String> c17 = ((b93.b) c93.a.a()).c();
            if (W6(stringArrayListExtra, this.M) || W6(c17, this.L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (c17 == null) {
                    c17 = new java.util.ArrayList();
                }
                if (this.L == null) {
                    this.L = new java.util.ArrayList();
                }
                for (java.lang.String str : c17) {
                    if (!this.L.contains(str)) {
                        java.util.ArrayList arrayList = this.Q;
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                }
                this.L = c17;
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    if (this.L.contains(next)) {
                        this.L.remove(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(this.L);
                this.L.clear();
                this.L.addAll(stringArrayListExtra);
                this.L.addAll(arrayList2);
                this.M.clear();
                this.M.addAll(stringArrayListExtra);
                java.util.ArrayList arrayList3 = this.N;
                arrayList3.clear();
                java.util.ArrayList arrayList4 = this.M;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                if (arrayList4 != null) {
                    java.util.Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(b93.r.wi().p1((java.lang.String) it6.next()));
                    }
                }
                arrayList3.addAll(arrayList5);
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("contact_search_label_new_list");
                if (stringArrayListExtra2 != null) {
                    this.f235402z1.addAll(stringArrayListExtra2);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.A1.addAll(stringArrayListExtra3);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.C1.addAll(stringArrayListExtra4);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.B1.addAll(stringArrayListExtra5);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.M, this.L);
                j7(this.M);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        gc0.p2 p2Var = (gc0.p2) m80391xac8f1cfd(gc0.p2.class);
        p2Var.f351780i = true;
        p2Var.f351781m.f351678d = true;
        mo43517x10010bd5();
        gm0.j1.i();
        gr3.k.f356422a.a("page_in", this.f235392u, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235393v, true), 50101);
        c01.d9.e().a(30, this);
        c01.d9.e().a(243, this);
        c01.d9.e().a(td1.h.f76804x366c91de, this);
        ((j93.n) m80391xac8f1cfd(j93.n.class)).S6(this.f235393v, true, this.R.m67736x5db1c8a().c(), new yz5.a() { // from class: hr3.hh$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.R1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a.this;
                activityC16872x6384268a.j7(activityC16872x6384268a.c7());
                return null;
            }
        });
        if (getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false)) {
            ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).P6(iy1.c.WeChatFriendRequestPage);
        } else {
            ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).P6(iy1.c.WeChatFriendVerificationProcessPge);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(30, this);
        c01.d9.e().q(243, this);
        c01.d9.e().q(td1.h.f76804x366c91de, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int[] iArr = this.D;
        g0Var.d(14036, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]), java.lang.Integer.valueOf(iArr[5]), java.lang.Integer.valueOf(iArr[6]), java.lang.Integer.valueOf(iArr[7]), this.f235393v);
        super.onDestroy();
        m78548x39037dd1();
        fo3.s.INSTANCE.E7("ie_ver_usr");
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235379h;
        if (c21503x6e5a020a != null) {
            c21503x6e5a020a.e(this.H1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.D[0] = 1;
        finish();
        ((ku5.t0) ku5.t0.f394148d).q(new hr3.ph(this, false));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        int i19;
        long j17;
        r45.v60 v60Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p944x882e457a.n nVar;
        java.util.List list;
        int i27;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        try {
            try {
                Y6();
                if (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: getopCode: %s.", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).M()));
                    if ((i17 != 0 || i18 != 0) && ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).M() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd:is MM_VERIFYUSER_ADDCONTACT return");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        return;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "onSceneEnd: is no NetSceneVerifyUser.");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "sendrequest_second");
                X6();
                if (i17 == 0 && i18 == 0) {
                    db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.iim));
                    r61.z1.c(this.f235393v, 1);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293 c5891xc4a59293 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5891xc4a59293();
                    am.hq hqVar = c5891xc4a59293.f136199g;
                    hqVar.f88395a = this.f235393v;
                    hqVar.f88396b = 1;
                    c5891xc4a59293.e();
                    if (this.f235401z == 17 && (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3)) {
                        long longExtra = getIntent().getLongExtra("key_msg_id", 0L);
                        java.lang.String stringExtra = getIntent().getStringExtra("key_msg_talker");
                        if (longExtra > 0) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(stringExtra, longExtra);
                            if (Li.m124847x74d37ac6() > 0) {
                                Li.l1(Li.F | 2048);
                                ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj()).bb(longExtra, Li);
                                com.p314xaae8f345.mm.p957x53236a1b.g1.L(Li, 21, 2);
                            }
                        }
                    }
                    if (this.C) {
                        java.lang.String a76 = a7();
                        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a76);
                        int[] iArr = this.D;
                        if (!K0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "set temp remark of %s: %s", this.f235393v, a76);
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 m17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).m(this.f235393v);
                            m17.n1(a76);
                            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f235393v);
                            z07.v0(this.f235393v);
                            z07.u0(a76);
                            ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
                            ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).l0(m17);
                            iArr[2] = 1;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235395x) && !a76.equals(this.f235395x)) {
                                iArr[5] = 1;
                            }
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235395x)) {
                            iArr[2] = 2;
                        } else {
                            iArr[2] = 0;
                        }
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        if (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) {
                            i27 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).M();
                            list = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).L();
                        } else {
                            if (m1Var instanceof l41.h0) {
                                linkedList.add(((l41.h0) m1Var).H());
                            }
                            list = linkedList;
                            i27 = 0;
                        }
                        if (i27 == 3 || (m1Var instanceof l41.h0)) {
                            T6(list);
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 m18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).m(this.f235393v);
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
                            am.jw jwVar = c6082xbd84dd0a.f136360g;
                            jwVar.getClass();
                            jwVar.f88635a = false;
                            jwVar.f88636b = this.f235393v;
                            c6082xbd84dd0a.e();
                            if (this.f235384o.d()) {
                                c01.e2.r0(m18);
                            } else {
                                c01.e2.x0(m18, false, true);
                            }
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
                            am.jw jwVar2 = c6082xbd84dd0a2.f136360g;
                            jwVar2.getClass();
                            jwVar2.f88635a = true;
                            java.lang.String str4 = this.f235393v;
                            jwVar2.f88636b = str4;
                            jwVar2.f88637c = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(str4, 5L);
                            n7(this.f235393v, !this.f235385p.d() ? 2 : 1, 5L);
                            c6082xbd84dd0a2.e();
                            ((hr3.ld) pf5.z.f435481a.a(this).a(hr3.ld.class)).P6(m18);
                            if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false)) {
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("friend_message_transfer_username", this.f235393v);
                                intent.setAction("friend_message_accept_" + this.f235393v);
                                intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
                                intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
                                j45.l.i(this, "subapp", ".ui.friend.FMessageTransferUI", intent);
                            }
                        }
                    }
                    getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(getIntent(), 1, 1, this.f235393v);
                    setResult(-1, getIntent());
                    if (this.W) {
                        if (m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) {
                            r45.v60 H = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).H();
                            j17 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).K();
                            java.lang.String I = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).I();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "prepare createSendMessage from NetSceneVerifyUser, userName=%s, respUsername=%s, encryptUsername=%s, svrMsgId=%d", this.f235393v, ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).J(), I, java.lang.Long.valueOf(j17));
                            str3 = I;
                            v60Var = H;
                        } else {
                            j17 = 0;
                            v60Var = null;
                            str3 = null;
                        }
                        if (m1Var instanceof l41.f0) {
                            com.p314xaae8f345.mm.p944x882e457a.o oVar = ((l41.f0) m1Var).f397342e;
                            long j18 = (oVar == null || (nVar = oVar.f152244b) == null) ? 0L : ((r45.iz5) nVar.f152233a).f458949d;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "prepare createSendMessage from NetSceneSendOpenIMVerifyRequest, userName=%s, svrMsgId=%d", this.f235393v, java.lang.Long.valueOf(j18));
                            j17 = j18;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "call ProfileUtilsKt.createSendMessage, userName=%s, addContactScene=%d, svrMsgId=%d, encryptUsername=%s", this.f235393v, java.lang.Integer.valueOf(this.f235401z), java.lang.Long.valueOf(j17), str3);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.b(this.f235393v, b7(), 1, this.f235401z, v60Var, this.D1, java.lang.Long.valueOf(j17), str3);
                    }
                    finish();
                    ((ku5.t0) ku5.t0.f394148d).q(new hr3.ph(this, true));
                    Z6(1L);
                    if ((this.J1 & 8) == 0) {
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
                    }
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str2 = "";
                    } else {
                        tm.a b17 = tm.a.b(str);
                        if (b17 == null || (str2 = b17.f501932b) == null) {
                            str2 = str;
                        }
                    }
                    if (i17 == 4 && i18 == -302) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SayHiWithSnsPermissionUI3", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0() == 30 ? ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3) m1Var).M() : 0));
                        db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bja), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571537i6), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.nh(this, m1Var), null);
                    } else {
                        if (i17 != 4) {
                            i19 = 4;
                        } else if (i18 != -24 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            i19 = 4;
                        } else if (!((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(this, i17, i18, str)) {
                            android.widget.Toast.makeText(this, str2, 1).show();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                            return;
                        }
                        if (i17 == i19 && ((i18 == -2 || i18 == -101) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2))) {
                            db5.e1.y(this, str2, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
                        } else if (this.A && (i18 == -24 || i18 == -34)) {
                            android.widget.Toast.makeText(this, com.p314xaae8f345.mm.R.C30867xcad56011.fbm, 0).show();
                        } else if (i17 == 4 && i18 == -3400 && this.G) {
                            this.H = true;
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 1);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                this.f235390s.setText(str2);
                            }
                            m7();
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
                            u1Var.g(str2);
                            u1Var.a(true);
                            u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hmr));
                            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.hms);
                            u1Var.b(new hr3.oh(this));
                            u1Var.p();
                        } else {
                            android.widget.Toast.makeText(this, com.p314xaae8f345.mm.R.C30867xcad56011.iil, 0).show();
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SayHiWithSnsPermissionUI3", e17, "onSceneEnd: EXCEPTION occurred", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "[onCreate] %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.P;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "height:%s", java.lang.Integer.valueOf(i17));
    }
}
