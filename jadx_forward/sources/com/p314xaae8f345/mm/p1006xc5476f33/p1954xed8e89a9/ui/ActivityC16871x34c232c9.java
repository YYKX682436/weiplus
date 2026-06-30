package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI */
/* loaded from: classes11.dex */
public class ActivityC16871x34c232c9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {
    public static final /* synthetic */ int O1 = 0;
    public java.lang.String B;
    public android.view.View K1;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a L1;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 M;
    public java.lang.String M1;
    public android.view.View N1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 P;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 Q;
    public android.widget.Button R;
    public java.lang.String T;
    public java.lang.String U;
    public boolean W;
    public int X;
    public int Y;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235346d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f235347e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f235348f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f235349g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f235350h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f235351i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f235353m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f235354n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f235356p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f235359q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f235360r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f235361s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f235362t;

    /* renamed from: u, reason: collision with root package name */
    public int f235363u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f235364v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f235365w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f235366x;

    /* renamed from: o, reason: collision with root package name */
    public android.app.ProgressDialog f235355o = null;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f235369y = new int[8];

    /* renamed from: z, reason: collision with root package name */
    public final int[] f235372z = new int[6];
    public int[] A = new int[3];
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public java.util.List f235345J = new java.util.ArrayList();
    public java.util.ArrayList K = new java.util.ArrayList();
    public final java.util.ArrayList L = new java.util.ArrayList();
    public final java.util.ArrayList N = new java.util.ArrayList();
    public boolean S = false;
    public int V = 0;
    public java.lang.String Z = "";

    /* renamed from: p0, reason: collision with root package name */
    public java.util.List f235357p0 = new java.util.ArrayList();

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashSet f235367x0 = new java.util.HashSet();

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.HashSet f235370y0 = new java.util.HashSet();

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.HashSet f235352l1 = new java.util.HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.HashSet f235358p1 = new java.util.HashSet();

    /* renamed from: x1, reason: collision with root package name */
    public boolean f235368x1 = false;

    /* renamed from: y1, reason: collision with root package name */
    public long f235371y1 = java.lang.System.currentTimeMillis();

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.CharSequence f235373z1 = null;
    public final boolean[] A1 = {true};
    public final boolean[] B1 = {false};
    public final android.text.TextWatcher C1 = new hr3.xg(this);
    public final long D1 = java.lang.System.currentTimeMillis();
    public int E1 = 0;
    public int F1 = 1;
    public int G1 = 1;
    public int H1 = 11;
    public int I1 = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 J1 = null;

    public final void T6(java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r21.w.Ai().b1(this.f235359q);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 e07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).e0(this.f235359q);
        if (list == null || !list.contains(this.f235359q)) {
            return;
        }
        boolean z17 = !e07.r2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "buildContact userName:%s contact.getContactID():%s type:%s isNewContact:%s", this.f235359q, java.lang.Integer.valueOf((int) e07.E2), java.lang.Integer.valueOf(e07.m124896xfb85f7b0()), java.lang.Boolean.valueOf(z17));
        if (((int) e07.E2) == 0) {
            e07 = y35.r.f(b17);
            e07.X1(this.f235359q);
            if (!(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).i0(e07) > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiWithSnsPermissionUI", "canAddContact fail, insert fail");
                return;
            }
        }
        c01.e2.m0(e07);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).g();
        r21.w.wi().k1(this.f235359q, 1);
        if (z17) {
            y35.r.l(this.f235359q, this.f235363u, "sayhiui1");
        }
    }

    public void U6() {
        this.R.setEnabled(false);
        this.R.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        this.R.setBackground(getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy));
    }

    public void V6() {
        this.R.setEnabled(true);
        this.R.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
        this.R.setBackground(getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
    }

    public final boolean W6() {
        return ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1);
    }

    public final boolean X6(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.addAll(list);
        arrayList2.addAll(list2);
        java.util.Collections.sort(arrayList);
        java.util.Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    public final void Y6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1960x9f5a7715.C16879x6e8fc134 c16879x6e8fc134 = ((bs3.m) pf5.z.f435481a.a(this).a(bs3.m.class)).f105535d;
        boolean z17 = false;
        if (c16879x6e8fc134 != null) {
            if ((c16879x6e8fc134.permission & 2) != 0) {
                z17 = true;
            }
        }
        if (this.G && z17) {
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r2) p94.w0.f()).P0(this.f235359q, 5L)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235359q, true);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(n17.d1());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
                am.oo ooVar = c5845xa0f7b469.f136154g;
                ooVar.f89103e = linkedList;
                ooVar.f89099a = 1;
                ooVar.f89100b = 5L;
                ooVar.f89102d = true;
                c5845xa0f7b469.e();
            }
        }
        if (this.f235364v) {
            java.lang.String trim = this.f235346d.m79028xfb85ada3().toString().trim();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) || trim.equals(this.f235373z1) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235356p)) {
                c01.d9.b().p().w(294913, "");
            } else {
                c01.d9.b().p().w(294913, trim);
            }
        }
    }

    public final void Z6() {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismissTipDialog ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", sb6.toString());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "dismissTipDialog");
        }
        android.app.ProgressDialog progressDialog = this.f235355o;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f235355o = null;
        }
    }

    public void a7(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).f351781m.b(c7(), ((hr3.ld) pf5.z.f435481a.a(this).a(hr3.ld.class)).Q6(), null, this.f235350h);
            ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new hr3.pg(this, j17));
    }

    public final java.util.List b7(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiWithSnsPermissionUI", "getLabelIdList, %s", e17.getMessage());
            }
        }
        return arrayList2;
    }

    public final java.lang.String c7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235350h;
        java.lang.String charSequence = (c21503x6e5a020a == null || c21503x6e5a020a.m79028xfb85ada3() == null) ? "" : this.f235350h.m79028xfb85ada3().toString();
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence) || charSequence.length() <= 50) ? charSequence : charSequence.substring(0, 50);
    }

    public final java.lang.String d7() {
        java.lang.String trim = this.f235346d.m79028xfb85ada3().toString().trim();
        return com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(this.f235346d.m79028xfb85ada3().toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2) <= 100 ? trim : trim.substring(0, 100);
    }

    public final java.util.ArrayList e7() {
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07;
        if (this.K == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z08 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f235359q);
        java.lang.String str = z08 != null ? z08.f66693x91130dba : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f235359q, true);
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

    public void f7(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.class);
        intent.putExtras(getIntent().getExtras());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        int O6 = ((bs3.m) pf5.z.f435481a.a(this).a(bs3.m.class)).O6();
        if (z17) {
            if (str != null && !str.isEmpty()) {
                intent.putExtra("AntispamTicket", str);
            }
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        }
        intent.putExtra("Contact_default_permission", O6);
        intent.putExtra("Contact_RemarkName", c7());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final boolean g7() {
        this.f235372z[0] = 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 b17 = r21.w.Ai().b1(this.f235359q);
        if (b17 != null) {
            y35.r c17 = y35.r.c(this, b17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f540766b) && !c17.f540766b.equals(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbh))) {
                this.B = c17.f540766b;
            }
        }
        if (W6()) {
            java.lang.String str = this.f235359q;
            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).V6(new gc0.b0(str, this.f235361s), new yz5.a() { // from class: hr3.hg$$i
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this.f235350h.getEditText();
                }
            }, new yz5.a() { // from class: hr3.hg$$j
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                    activityC16871x34c232c9.getClass();
                    return ((hr3.ld) pf5.z.f435481a.a(activityC16871x34c232c9).a(hr3.ld.class)).Q6();
                }
            }, new yz5.a() { // from class: hr3.hg$$k
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                    activityC16871x34c232c9.getClass();
                    if (((hr3.ld) pf5.z.f435481a.a(activityC16871x34c232c9).a(hr3.ld.class)).f365299d != null) {
                        return java.lang.Boolean.valueOf(!r0.f());
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editPhoneNumberView");
                    throw null;
                }
            }, new yz5.l() { // from class: hr3.hg$$l
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                    activityC16871x34c232c9.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "onclick AddPhone");
                    return java.lang.Boolean.valueOf(((hr3.ld) pf5.z.f435481a.a(activityC16871x34c232c9).a(hr3.ld.class)).O6((java.lang.String) obj));
                }
            }, null, new yz5.a() { // from class: hr3.hg$$g
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16871x34c232c9.B)) {
                        return null;
                    }
                    activityC16871x34c232c9.i7(activityC16871x34c232c9.B);
                    return null;
                }
            });
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            i7(this.B);
        }
        this.f235369y[3] = 3;
        this.f235365w = true;
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chk;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void h7(boolean z17) {
        int i17 = this.f235364v ? z17 ? 1 : 4 : z17 ? 2 : 3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c7())) {
            this.F1 = 3;
        } else if (c7().equals(this.f235361s) || c7().equals(this.f235360r)) {
            this.F1 = 2;
        } else if (this.E && !this.S) {
            this.F1 = 4;
        }
        if (this.D) {
            this.G1 = 6;
        } else {
            int i18 = this.E1;
            if ((i18 & 8) != 0) {
                this.G1 = 5;
            } else if ((i18 & 1) != 0 && (i18 & 2) != 0) {
                this.G1 = 4;
            } else if ((i18 & 2) != 0) {
                this.G1 = 3;
            } else if ((i18 & 1) != 0) {
                this.G1 = 2;
            }
        }
        int i19 = this.f235363u;
        if (i19 == 1) {
            this.H1 = 4;
        } else if (i19 != 3) {
            if (i19 != 6 && i19 != 10 && i19 != 52) {
                if (i19 == 17) {
                    this.H1 = 5;
                } else if (i19 == 18 || i19 == 44) {
                    this.H1 = 9;
                } else {
                    if (i19 != 45) {
                        if (i19 == 48) {
                            this.H1 = 8;
                        } else if (i19 != 49) {
                            if (i19 != 78 && i19 != 79 && i19 != 181 && i19 != 182) {
                                switch (i19) {
                                    case 13:
                                        break;
                                    case 14:
                                        this.H1 = 7;
                                        break;
                                    case 15:
                                        this.H1 = 2;
                                        break;
                                    default:
                                        switch (i19) {
                                            case 21:
                                                break;
                                            default:
                                                switch (i19) {
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                        break;
                                                    case 30:
                                                        break;
                                                    default:
                                                        this.H1 = 11;
                                                        break;
                                                }
                                            case 22:
                                            case 23:
                                            case 24:
                                                this.H1 = 10;
                                                break;
                                        }
                                }
                            } else {
                                this.H1 = 12;
                            }
                        }
                    }
                    this.H1 = 6;
                }
            }
            this.H1 = 1;
        } else {
            this.H1 = 3;
        }
        int intExtra = getIntent().getIntExtra("Contact_Source_Add", -1);
        if (intExtra == 185) {
            this.H1 = 14;
        } else if (intExtra == 184) {
            this.H1 = 13;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new hr3.lg(this, i17));
    }

    public final void i7(java.lang.String str) {
        android.view.View view = this.f235351i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "setRecomRemarkTipSelect", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f235353m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh9, str);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (string == null) {
            string = "";
        }
        float textSize = this.f235353m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string, textSize));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la7));
        f0Var.c(new hr3.gh(this, str), 0, f0Var.length(), 17);
        this.f235353m.append(" ");
        this.f235353m.append(f0Var);
        this.f235353m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20214x7e305b95()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "preloadXWeb() called preloadWebViewEnable:%s", java.lang.Boolean.valueOf(z18));
        if (z18) {
            ((jd0.c) ((kd0.e2) i95.n0.c(kd0.e2.class))).getClass();
            uy3.z.b(3, 0L);
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
        hashSet.add(j93.n.class);
        hashSet.add(bs3.m.class);
        hashSet.add(or3.k.class);
        hashSet.add(bs3.l.class);
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
        this.f235364v = getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false);
        this.f235366x = getIntent().getBooleanExtra("sayhi_with_sns_perm_add_remark", false);
        this.f235359q = getIntent().getStringExtra("Contact_User");
        this.f235363u = getIntent().getIntExtra("Contact_Scene", 9);
        this.f235356p = getIntent().getStringExtra("room_name");
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_RemarkName");
        this.f235362t = stringExtra;
        this.U = stringExtra;
        this.f235361s = getIntent().getStringExtra("Contact_Nick");
        this.f235360r = getIntent().getStringExtra("Contact_RoomNickname");
        this.f235351i = findViewById(com.p314xaae8f345.mm.R.id.jp7);
        this.f235353m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jp8);
        this.R = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.g68);
        boolean z18 = true;
        boolean z19 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s1.d(this.f235359q) && !getIntent().getBooleanExtra("Contact_IsForceVerifyFriend", false);
        this.H = z19;
        this.I = !z19 && this.f235364v;
        this.Q = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) findViewById(com.p314xaae8f345.mm.R.id.v08);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4) findViewById(com.p314xaae8f345.mm.R.id.v0c);
        this.P = c16924x6da766a4;
        if (c16924x6da766a4 != null) {
            c16924x6da766a4.m67736x5db1c8a().c().setId(com.p314xaae8f345.mm.R.id.u8m);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235359q)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "initLabelPanelAll, isOpenIM, userName: %s.", this.f235359q);
                this.P.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 c16924x6da766a42 = this.Q;
                if (c16924x6da766a42 != null) {
                    c16924x6da766a42.setVisibility(8);
                }
            } else {
                this.P.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hg$$e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                        activityC16871x34c232c9.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC16871x34c232c9, array);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All startContactLabelUI].");
                        android.content.Intent intent = new android.content.Intent();
                        java.util.ArrayList<java.lang.String> arrayList2 = activityC16871x34c232c9.K;
                        if (arrayList2 != null) {
                            intent.putStringArrayListExtra("label_str_list", arrayList2);
                        }
                        activityC16871x34c232c9.W = true;
                        intent.putExtra("save_label_to_contact_on_prepage", false);
                        intent.putExtra("label_username", activityC16871x34c232c9.f235359q);
                        intent.putExtra("is_stranger", true);
                        ((j93.n) activityC16871x34c232c9.m80391xac8f1cfd(j93.n.class)).V6(600, intent, false, activityC16871x34c232c9.K);
                        yj0.a.h(activityC16871x34c232c9, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.Q.setOnClickListener(new android.view.View.OnClickListener() { // from class: hr3.hg$$f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                        activityC16871x34c232c9.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC16871x34c232c9, array);
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(activityC16871x34c232c9.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16833xebe5488f.class);
                        intent.putExtra("Contact_User", activityC16871x34c232c9.f235359q);
                        intent.putExtra("Contact_verify_string", activityC16871x34c232c9.B);
                        intent.putExtra("key_intent_assemble_ui_half_screen_title", activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_k));
                        kr3.s1.f393008a.a(intent, activityC16871x34c232c9, activityC16871x34c232c9.f235359q, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.h.class, 100, false);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("note_sid", (java.lang.String) ((jz5.n) ((gc0.b) activityC16871x34c232c9.m80391xac8f1cfd(gc0.b.class)).f351631d).mo141623x754a37bb());
                        hashMap.put("add_username", activityC16871x34c232c9.f235359q);
                        hashMap.put("view_id", "add_describe_float");
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 33926);
                        yj0.a.h(activityC16871x34c232c9, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.f235345J = b93.r.wi().k1();
                java.util.ArrayList e76 = e7();
                if (e76 != null) {
                    this.K.addAll(e76);
                    java.util.ArrayList arrayList = this.L;
                    java.util.ArrayList arrayList2 = this.K;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    if (arrayList2 != null) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(b93.r.wi().p1((java.lang.String) it.next()));
                        }
                    }
                    arrayList.addAll(arrayList3);
                }
                java.util.List list = this.f235345J;
                if (list != null) {
                    this.X = list.size();
                }
                if (e76 != null) {
                    this.Y = e76.size();
                    this.f235357p0.addAll(e76);
                }
                k7(e76);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "onCreate isCurrentHappenChatting:%s needVerify:%s", java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(this.f235364v));
        this.C = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235359q, true);
        gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXCEED_FRIEND_LIMIT_FLAG_INT_SYNC, 0);
        pf5.z zVar = pf5.z.f435481a;
        ((hr3.ld) zVar.a(this).a(hr3.ld.class)).S6();
        findViewById(com.p314xaae8f345.mm.R.id.f564963at4).setOnClickListener(new hr3.qg(this));
        this.Q.m67737xe9f5bdb7(n18.f318122y1);
        j7();
        this.G = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f235359q);
        ((bs3.m) zVar.a(this).a(bs3.m.class)).getClass();
        if (this.f235364v) {
            this.f235346d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.m9y);
            this.f235348f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mnm);
            this.f235349g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c8o);
            if (this.I) {
                ((hr3.pf) m80391xac8f1cfd(hr3.pf.class)).V6(new yz5.a() { // from class: hr3.hg$$h
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this.F = true;
                        return null;
                    }
                });
            }
            java.lang.String l17 = c01.z1.l();
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.iih);
            if (string.length() + l17.length() > 50) {
                l17 = l17.substring(0, 50 - string.length());
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235356p) || (n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235356p, true)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
                spannableString = null;
            } else {
                java.lang.String z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f235356p).z0(c01.z1.r());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(z07)) {
                    z07 = l17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "chatroomName:%s nick:%s", this.f235356p, n17.P0());
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                java.lang.String string2 = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iii, n17.P0(), z07);
                float m79030x40077844 = this.f235346d.m79030x40077844();
                ((ke0.e) xVar).getClass();
                spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, string2, m79030x40077844);
                this.f235373z1 = spannableString;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f235373z1)) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                java.lang.String format = java.lang.String.format(string, l17);
                float m79030x400778442 = this.f235346d.m79030x40077844();
                ((ke0.e) xVar2).getClass();
                this.f235373z1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, format, m79030x400778442);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(spannableString)) {
                this.f235346d.m79039x765074af(this.f235373z1);
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = mo55332x76847179();
                float m79030x400778443 = this.f235346d.m79030x40077844();
                ((ke0.e) xVar3).getClass();
                this.f235346d.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471793, spannableString, m79030x400778443));
            }
            this.f235347e = this.f235346d.m79028xfb85ada3().toString();
            this.f235346d.b(new hr3.rg(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235346d;
        if (c21503x6e5a020a == null || !(c21503x6e5a020a.getParent() instanceof android.widget.LinearLayout)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "updateSayHiContextVisiable");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "updateSayHiContextVisiable, needVerify = %s, sayHiContent= %s, isNeedSendSayHiContext= %s.", java.lang.Boolean.valueOf(this.f235364v), java.lang.Boolean.valueOf(this.H), java.lang.Boolean.valueOf(this.I));
            if (this.I) {
                ((android.widget.LinearLayout) this.f235346d.getParent()).setVisibility(0);
            } else {
                ((android.widget.LinearLayout) this.f235346d.getParent()).setVisibility(8);
            }
        }
        if (this.f235366x) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.m_1);
            this.f235350h = c21503x6e5a020a2;
            ((android.widget.LinearLayout) c21503x6e5a020a2.getParent()).setVisibility(0);
            this.f235354n = findViewById(com.p314xaae8f345.mm.R.id.uya);
            this.f235350h.b(this.C1);
            if (!this.f235364v) {
                this.f235350h.clearFocus();
            }
            if (this.f235364v) {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hny);
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hnq);
                this.f235369y[0] = 1;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235362t)) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235361s)) {
                    if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p()) {
                        this.f235350h.m79033x764b0e09(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574084gy1));
                        this.f235350h.m79034x5afba1b1(false);
                    } else {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a3 = this.f235350h;
                        le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = mo55332x76847179();
                        java.lang.String str = this.f235361s;
                        float m79030x400778444 = this.f235350h.m79030x40077844();
                        ((ke0.e) xVar4).getClass();
                        c21503x6e5a020a3.m79033x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471794, str, m79030x400778444));
                    }
                    this.f235350h.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: hr3.hg$$d
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(android.view.View view, boolean z27) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                            if (z27) {
                                activityC16871x34c232c9.S = true;
                            } else {
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                                activityC16871x34c232c9.getClass();
                            }
                        }
                    });
                }
                switch (this.f235363u) {
                    case 8:
                    case 14:
                        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235360r) && !this.f235360r.equals(this.f235350h.m79028xfb85ada3().toString())) {
                            this.f235372z[0] = 2;
                            android.view.View view = this.f235351i;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initChatroomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView = this.f235353m;
                            le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh6, this.f235360r);
                            java.lang.String str2 = string3 != null ? string3 : "";
                            float textSize = this.f235353m.getTextSize();
                            ((ke0.e) xVar5).getClass();
                            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str2, textSize));
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                            f0Var.c(new hr3.gh(this, this.f235360r), 0, f0Var.length(), 17);
                            this.f235353m.append(" ");
                            this.f235353m.append(f0Var);
                            this.f235353m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            this.f235369y[3] = 2;
                            z17 = true;
                            break;
                        }
                        break;
                    case 10:
                    case 11:
                    case 13:
                        if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() && (h17 = m61.k.wi().h(this.f235359q)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h()) && !h17.h().equals(this.f235350h.m79028xfb85ada3().toString())) {
                            android.view.View view2 = this.f235351i;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList5.add(0);
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.widget.TextView textView2 = this.f235353m;
                            le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string4 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh7, h17.h());
                            if (string4 == null) {
                                string4 = "";
                            }
                            float textSize2 = this.f235353m.getTextSize();
                            ((ke0.e) xVar6).getClass();
                            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string4, textSize2));
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                            f0Var2.c(new hr3.gh(this, h17.h()), 0, f0Var2.length(), 17);
                            this.f235353m.append(" ");
                            this.f235353m.append(f0Var2);
                            this.f235353m.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                            z18 = true;
                            this.f235369y[3] = 1;
                            java.lang.String f17 = h17.f();
                            if (f17 == null) {
                                f17 = "";
                            }
                            this.Z = f17.replace(" ", "");
                            z17 = z18;
                            break;
                        }
                        break;
                    case 18:
                        this.f235372z[0] = 1;
                        com.p314xaae8f345.mm.p2621x8fb0427b.t8[] L0 = r21.w.Bi().L0(this.f235359q, 1);
                        com.p314xaae8f345.mm.p2621x8fb0427b.t8 t8Var = L0 != null ? L0[0] : null;
                        if (t8Var != null) {
                            java.lang.String str3 = t8Var.f66512x7236dff2;
                            this.B = str3;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && !W6()) {
                                i7(str3);
                                this.f235369y[3] = 3;
                                this.f235365w = true;
                                z17 = z18;
                                break;
                            }
                        }
                        break;
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        this.f235372z[0] = 1;
                        com.p314xaae8f345.mm.p2621x8fb0427b.pa[] D0 = r21.w.Di().D0(this.f235359q, 1);
                        com.p314xaae8f345.mm.p2621x8fb0427b.pa paVar = D0 != null ? D0[0] : null;
                        if (paVar != null) {
                            java.lang.String str4 = y35.r.d(this, paVar).f540766b;
                            this.B = str4;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !W6()) {
                                i7(str4);
                                this.f235369y[3] = 3;
                                this.f235365w = true;
                                z17 = z18;
                                break;
                            }
                        }
                        break;
                }
                if ((com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() || !this.f235364v) && !z17) {
                    g7();
                }
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a4 = this.f235350h;
                le0.x xVar7 = (le0.x) i95.n0.c(le0.x.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = mo55332x76847179();
                java.lang.String str5 = this.f235362t;
                float m79030x400778445 = this.f235350h.m79030x40077844();
                ((ke0.e) xVar7).getClass();
                c21503x6e5a020a4.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471795, str5, m79030x400778445));
                this.f235369y[6] = 1;
                if (!this.f235364v && W6()) {
                    g7();
                }
            }
            if (this.f235350h.m79021xfb8046fd() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235350h.m79021xfb8046fd().toString())) {
                this.T = this.f235350h.m79021xfb8046fd().toString();
            }
            if (this.f235350h.m79028xfb85ada3() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f235350h.m79028xfb85ada3().toString())) {
                this.T = this.f235350h.m79028xfb85ada3().toString();
            }
        }
        if (!this.G && !this.f235364v && W6()) {
            ((hr3.ld) zVar.a(this).a(hr3.ld.class)).T6(this.f235359q, this.Z);
        }
        java.lang.String string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        if (!this.f235364v) {
            string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
        }
        if (this.H) {
            string5 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5);
        }
        java.lang.String a17 = fo3.l.a(3);
        this.R.setText(string5);
        this.R.setOnClickListener(new hr3.sg(this, a17));
        this.R.setOnTouchListener(new hr3.vg(this, a17));
        V6();
        mo54448x9c8c0d33(new hr3.wg(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(this);
        this.M = f5Var;
        f5Var.f291933e = this;
        if (this.H) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hnr);
        }
        if (this.f235350h.c()) {
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

    public final void j7() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16924x6da766a4 O6 = ((bs3.l) pf5.z.f435481a.a(this).a(bs3.l.class)).O6();
        boolean z17 = (O6 != null ? O6.getContent() : null) != null;
        int[] iArr = this.f235372z;
        if (z17) {
            iArr[5] = 1;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235359q, true);
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(this.f235359q);
        if (z07 == null || (str = z07.f66690xbe857eff) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && n17 != null) {
            str = n17.f318122y1;
        }
        if (this.Q != null) {
            iArr[4] = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.g(str);
            this.Q.m67737xe9f5bdb7(str);
        }
    }

    public final void k7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) m80391xac8f1cfd(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.P.m67737xe9f5bdb7("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.P.m67737xe9f5bdb7(sb6.toString());
    }

    public final void l7(java.lang.String str, int i17, long j17) {
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
                this.A = intent.getIntArrayExtra("Contact_get_desc_report_data");
            }
            j7();
            return;
        }
        if ((i18 == -1 || intent == null) && i17 == 600 && intent != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("result_label_id_list");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            ((j93.n) m80391xac8f1cfd(j93.n.class)).O6(stringArrayListExtra, intent.getIntExtra("recommend_label_adopt_count", 0));
            java.util.List<java.lang.String> c17 = ((b93.b) c93.a.a()).c();
            if (X6(stringArrayListExtra, this.K) || X6(c17, this.f235345J)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All onActivityResult], labelLists: %s", stringArrayListExtra);
                if (c17 == null) {
                    c17 = new java.util.ArrayList();
                }
                if (this.f235345J == null) {
                    this.f235345J = new java.util.ArrayList();
                }
                for (java.lang.String str : c17) {
                    if (!this.f235345J.contains(str)) {
                        java.util.ArrayList arrayList = this.N;
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                }
                this.f235345J = c17;
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    if (this.f235345J.contains(next)) {
                        this.f235345J.remove(next);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(this.f235345J);
                this.f235345J.clear();
                this.f235345J.addAll(stringArrayListExtra);
                this.f235345J.addAll(arrayList2);
                this.K.clear();
                this.K.addAll(stringArrayListExtra);
                java.util.ArrayList arrayList3 = this.L;
                arrayList3.clear();
                java.util.ArrayList arrayList4 = this.K;
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
                    this.f235367x0.addAll(stringArrayListExtra2);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_add_list");
                if (stringArrayListExtra3 != null) {
                    this.f235370y0.addAll(stringArrayListExtra3);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_select_label_add_list");
                if (stringArrayListExtra4 != null) {
                    this.f235358p1.addAll(stringArrayListExtra4);
                }
                java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_new_list");
                if (stringArrayListExtra5 != null) {
                    this.f235352l1.addAll(stringArrayListExtra5);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "cpan[All onActivityResult], labelLists: %s, mCurrentSelectLabelStrList: %s,mAllCanShowLabelStrList:%s.", stringArrayListExtra, this.K, this.f235345J);
                k7(this.K);
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
        gr3.k.f356422a.a("page_in", this.f235356p, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f235359q, true), 50101);
        c01.d9.e().a(30, this);
        c01.d9.e().a(243, this);
        c01.d9.e().a(td1.h.f76804x366c91de, this);
        ((j93.n) m80391xac8f1cfd(j93.n.class)).S6(this.f235359q, true, this.P.m67736x5db1c8a().c(), new yz5.a() { // from class: hr3.hg$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.O1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.this;
                activityC16871x34c232c9.k7(activityC16871x34c232c9.e7());
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
        int[] iArr = this.f235369y;
        g0Var.d(14036, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]), java.lang.Integer.valueOf(iArr[5]), java.lang.Integer.valueOf(iArr[6]), java.lang.Integer.valueOf(iArr[7]), this.f235359q);
        super.onDestroy();
        m78548x39037dd1();
        fo3.s.INSTANCE.E7("ie_ver_usr");
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.M;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f235350h;
        if (c21503x6e5a020a != null) {
            c21503x6e5a020a.e(this.C1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f235369y[0] = 1;
        finish();
        h7(false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.M;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.M;
        if (f5Var != null) {
            f5Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ff A[Catch: all -> 0x0224, Exception -> 0x04f0, TryCatch #0 {Exception -> 0x04f0, blocks: (B:23:0x01b1, B:36:0x022a, B:38:0x022e, B:46:0x02bb, B:53:0x02ef, B:57:0x0332, B:73:0x036a, B:76:0x0371, B:78:0x0393, B:104:0x02d9, B:43:0x02ae, B:108:0x02b9, B:123:0x03df, B:125:0x03ff, B:127:0x0403, B:128:0x0444, B:130:0x0448, B:137:0x045c, B:142:0x0475, B:144:0x04b3, B:146:0x04c5, B:162:0x04e8), top: B:19:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c5 A[Catch: all -> 0x0224, Exception -> 0x04f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x04f0, blocks: (B:23:0x01b1, B:36:0x022a, B:38:0x022e, B:46:0x02bb, B:53:0x02ef, B:57:0x0332, B:73:0x036a, B:76:0x0371, B:78:0x0393, B:104:0x02d9, B:43:0x02ae, B:108:0x02b9, B:123:0x03df, B:125:0x03ff, B:127:0x0403, B:128:0x0444, B:130:0x0448, B:137:0x045c, B:142:0x0475, B:144:0x04b3, B:146:0x04c5, B:162:0x04e8), top: B:19:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x014c A[Catch: Exception -> 0x0220, all -> 0x0224, TryCatch #3 {all -> 0x0224, blocks: (B:232:0x0148, B:234:0x014c, B:236:0x0155, B:10:0x0188, B:13:0x0193, B:15:0x0199, B:17:0x01a3, B:23:0x01b1, B:26:0x01d7, B:28:0x01db, B:30:0x01f3, B:34:0x01ff, B:35:0x0206, B:36:0x022a, B:38:0x022e, B:110:0x023a, B:112:0x0241, B:114:0x0299, B:116:0x02a1, B:46:0x02bb, B:48:0x02c4, B:51:0x02eb, B:53:0x02ef, B:55:0x0327, B:57:0x0332, B:59:0x0343, B:73:0x036a, B:76:0x0371, B:78:0x0393, B:87:0x0651, B:104:0x02d9, B:106:0x02dd, B:43:0x02ae, B:45:0x02b6, B:108:0x02b9, B:123:0x03df, B:125:0x03ff, B:127:0x0403, B:128:0x0444, B:130:0x0448, B:132:0x044b, B:134:0x044f, B:136:0x0453, B:137:0x045c, B:142:0x0475, B:144:0x04b3, B:146:0x04c5, B:159:0x04e0, B:162:0x04e8, B:163:0x04f5, B:166:0x04ff, B:168:0x052a, B:178:0x053f, B:182:0x055c, B:187:0x0580, B:194:0x0595, B:196:0x059b, B:197:0x05a8, B:202:0x05b2, B:207:0x05c5, B:209:0x05c9, B:211:0x05e3, B:212:0x05f2, B:213:0x062d, B:243:0x0134, B:9:0x0183), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022e A[Catch: all -> 0x0224, Exception -> 0x04f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x04f0, blocks: (B:23:0x01b1, B:36:0x022a, B:38:0x022e, B:46:0x02bb, B:53:0x02ef, B:57:0x0332, B:73:0x036a, B:76:0x0371, B:78:0x0393, B:104:0x02d9, B:43:0x02ae, B:108:0x02b9, B:123:0x03df, B:125:0x03ff, B:127:0x0403, B:128:0x0444, B:130:0x0448, B:137:0x045c, B:142:0x0475, B:144:0x04b3, B:146:0x04c5, B:162:0x04e8), top: B:19:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0393 A[Catch: all -> 0x0224, Exception -> 0x04f0, TryCatch #0 {Exception -> 0x04f0, blocks: (B:23:0x01b1, B:36:0x022a, B:38:0x022e, B:46:0x02bb, B:53:0x02ef, B:57:0x0332, B:73:0x036a, B:76:0x0371, B:78:0x0393, B:104:0x02d9, B:43:0x02ae, B:108:0x02b9, B:123:0x03df, B:125:0x03ff, B:127:0x0403, B:128:0x0444, B:130:0x0448, B:137:0x045c, B:142:0x0475, B:144:0x04b3, B:146:0x04c5, B:162:0x04e8), top: B:19:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0370  */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List, java.util.ArrayList] */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r32, int r33, java.lang.String r34, com.p314xaae8f345.mm.p944x882e457a.m1 r35) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.M;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "height:%s", java.lang.Integer.valueOf(i17));
    }
}
