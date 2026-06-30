package com.p314xaae8f345.mm.ui.p2690x38b72420;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.ui.contact.ModRemarkNameUI */
/* loaded from: classes11.dex */
public class ActivityC22313x70d15e01 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f287999y1 = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public java.lang.String D;
    public android.view.View K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.LinearLayout N;
    public java.lang.String P;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 R;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 S;
    public boolean X;
    public long Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f288001d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f288002e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f288003f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.ya f288004g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f288005h;

    /* renamed from: i, reason: collision with root package name */
    public int f288006i;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f288010o;

    /* renamed from: p0, reason: collision with root package name */
    public int f288012p0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f288014q;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f288019v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f288020w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f288021x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f288024y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f288026z;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f288008m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f288009n = "";

    /* renamed from: p, reason: collision with root package name */
    public int f288011p = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f288015r = false;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a f288016s = null;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f288017t = "";

    /* renamed from: u, reason: collision with root package name */
    public boolean f288018u = false;
    public int E = 0;
    public final java.util.ArrayList F = new java.util.ArrayList();
    public final java.util.ArrayList G = new java.util.ArrayList();
    public final java.util.ArrayList H = new java.util.ArrayList();
    public int I = 9;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.e6 f288000J = new com.p314xaae8f345.mm.ui.p2690x38b72420.e6(this, null);
    public int Q = 0;
    public java.util.List T = new java.util.ArrayList();
    public final java.util.List U = new java.util.ArrayList();
    public final java.util.List V = new java.util.ArrayList();
    public boolean W = false;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashSet f288022x0 = new java.util.HashSet();

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.HashSet f288025y0 = new java.util.HashSet();

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.HashSet f288007l1 = new java.util.HashSet();

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.HashSet f288013p1 = new java.util.HashSet();

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.HashSet f288023x1 = new java.util.HashSet();

    public static void T6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01, int i17) {
        activityC22313x70d15e01.E--;
        java.util.ArrayList arrayList = activityC22313x70d15e01.F;
        arrayList.remove(i17);
        if (i17 == 0) {
            activityC22313x70d15e01.f288026z.setVisibility(8);
        } else if (i17 == 1) {
            activityC22313x70d15e01.A.setVisibility(8);
        } else if (i17 == 2) {
            activityC22313x70d15e01.B.setVisibility(8);
        }
        activityC22313x70d15e01.f288024y.setVisibility(0);
        activityC22313x70d15e01.C.setVisibility(8);
        activityC22313x70d15e01.f7(arrayList, 0);
        activityC22313x70d15e01.X6();
    }

    public static void U6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01) {
        int i17 = activityC22313x70d15e01.f288006i;
        if (i17 != 0) {
            if (i17 == 3) {
                java.lang.String trim = activityC22313x70d15e01.f288001d.m79028xfb85ada3().toString().trim();
                android.content.Intent intent = new android.content.Intent();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                    trim = activityC22313x70d15e01.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfq);
                }
                intent.putExtra("k_sns_tag_name", trim);
                activityC22313x70d15e01.setResult(-1, intent);
                activityC22313x70d15e01.finish();
                return;
            }
            if (i17 != 4) {
                return;
            }
            java.lang.String trim2 = activityC22313x70d15e01.f288001d.m79028xfb85ada3().toString().trim();
            if (trim2.length() > 32) {
                db5.e1.y(activityC22313x70d15e01.mo55332x76847179(), activityC22313x70d15e01.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574414i41), activityC22313x70d15e01.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6g), activityC22313x70d15e01.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), null);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_Nick", trim2);
            activityC22313x70d15e01.setResult(-1, intent2);
            activityC22313x70d15e01.finish();
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785().e();
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "!MMCore.hasSetUin()");
        } else if (activityC22313x70d15e01.f288001d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "remarkName == null in dealModNickName(), return");
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC22313x70d15e01.f288003f.d1(), true);
            if (n17 != null && !android.text.TextUtils.isEmpty(n17.d1())) {
                activityC22313x70d15e01.f288003f = n17;
            }
            java.lang.String trim3 = activityC22313x70d15e01.f288001d.m79028xfb85ada3().toString().trim();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "Set New RemarkName : " + trim3 + ", Report kvStat, addContactScene = " + activityC22313x70d15e01.I);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10448, java.lang.Integer.valueOf(activityC22313x70d15e01.I));
            if (activityC22313x70d15e01.f288018u) {
                activityC22313x70d15e01.f288003f.n1(trim3);
                activityC22313x70d15e01.f288003f.d3(activityC22313x70d15e01.f288016s.m79028xfb85ada3().toString());
                boolean d76 = activityC22313x70d15e01.d7();
                java.util.ArrayList arrayList = activityC22313x70d15e01.H;
                if (d76) {
                    java.util.ArrayList arrayList2 = activityC22313x70d15e01.F;
                    int size = arrayList2 != null ? arrayList2.size() : 0;
                    if (size > 0) {
                        for (int i18 = 0; i18 < size; i18++) {
                            java.lang.String c17 = i21.q.h().c(activityC22313x70d15e01.f288005h, i18);
                            if (!c17.equals(arrayList2.get(i18))) {
                                com.p314xaae8f345.mm.vfs.w6.c((java.lang.String) arrayList2.get(i18), c17);
                                com.p314xaae8f345.mm.vfs.w6.h((java.lang.String) arrayList2.get(i18));
                            }
                            arrayList.add(c17);
                        }
                    }
                    activityC22313x70d15e01.Z6();
                } else {
                    arrayList.clear();
                    arrayList.addAll(activityC22313x70d15e01.G);
                }
                activityC22313x70d15e01.f288003f.e3(com.p314xaae8f345.mm.p670x38b72420.b.b(arrayList));
                com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ya(activityC22313x70d15e01.f288003f.d1(), trim3);
                yaVar.f66690xbe857eff = activityC22313x70d15e01.f288016s.m79028xfb85ada3().toString().trim();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22313x70d15e01.P)) {
                    yaVar.f66693x91130dba = activityC22313x70d15e01.P;
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(yaVar);
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).l0(activityC22313x70d15e01.f288003f);
            }
            activityC22313x70d15e01.finish();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "cpan[saveStranger]");
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(activityC22313x70d15e01.f288005h);
        java.util.List list = activityC22313x70d15e01.V;
        if (list != null) {
            java.lang.String h17 = ((b93.b) c93.a.a()).h(list);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                z07.f66693x91130dba = "";
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            } else {
                z07.f66693x91130dba = h17;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07.f66694xdd77ad16)) {
                    z07.f66694xdd77ad16 = activityC22313x70d15e01.f288005h;
                }
                ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).mo11260x413cb2b4(z07);
            }
        }
        pf5.z zVar = pf5.z.f435481a;
        if (((j93.n) zVar.a(activityC22313x70d15e01).a(j93.n.class)).R6()) {
            ((j93.n) zVar.a(activityC22313x70d15e01).a(j93.n.class)).T6();
        }
        activityC22313x70d15e01.a7(1L);
    }

    public static void V6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01, int i17) {
        activityC22313x70d15e01.getClass();
        android.content.Intent intent = new android.content.Intent(activityC22313x70d15e01, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22294xac144901.class);
        intent.putExtra("Contact_User", activityC22313x70d15e01.f288005h);
        intent.putExtra("remark_image_path", activityC22313x70d15e01.F);
        intent.putExtra("selected_item", i17);
        intent.putExtra("view_only", false);
        activityC22313x70d15e01.startActivityForResult(intent, 400);
    }

    public final boolean W6(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
        java.util.Collections.sort(arrayList);
        java.util.Collections.sort(arrayList2);
        return !arrayList.equals(arrayList2);
    }

    public final void X6() {
        this.W = this.R.e();
        if (!c7() && !e7() && !d7() && !this.W) {
            m78501x43e00957(false);
        } else if (this.f288001d.c() || this.f288016s.c()) {
            m78501x43e00957(false);
        } else {
            m78501x43e00957(true);
        }
        if (((j93.n) m80391xac8f1cfd(j93.n.class)).R6()) {
            m78501x43e00957(true);
        }
    }

    public final java.lang.String Y6(java.lang.String str, int i17) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            return null;
        }
        int a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
        java.lang.String str2 = i21.q.h().c(this.f288005h, i17) + ".tmp";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x.v(str, 1080, 1080, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "createThumbNail big pic fail");
            return null;
        }
        if (a17 == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x.y0(str2, a17, android.graphics.Bitmap.CompressFormat.JPEG, 80, str2)) {
            return str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "rotate big pic fail");
        return null;
    }

    public final void Z6() {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.String a17 = i21.q.h().a(this.f288005h);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.p314xaae8f345.mm.vfs.w6.s(a17, true)) != null) {
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    if (!this.H.contains(a17 + x1Var.f294765b)) {
                        x1Var.a();
                    }
                }
            }
        }
    }

    public void a7(long j17) {
        if (j17 == 1) {
            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).f351781m.b(this.f288001d.m79028xfb85ada3().toString(), this.R.m75370xcd47ad5f(), this.F, this.f288001d);
            ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).O6();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.u5(this, j17));
    }

    public final void b7() {
        boolean e76 = e7();
        boolean c76 = c7();
        if (e76 || c76 || d7()) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgj), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgl), getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgk), new com.p314xaae8f345.mm.ui.p2690x38b72420.s5(this), new com.p314xaae8f345.mm.ui.p2690x38b72420.t5(this));
        } else {
            finish();
            a7(2L);
        }
    }

    public final boolean c7() {
        java.lang.String trim = this.f288016s.m79028xfb85ada3().toString().trim();
        java.lang.String str = this.f288017t;
        return (str == null || !str.equals(trim)) && !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288017t) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim));
    }

    public final boolean d7() {
        java.util.ArrayList arrayList = this.G;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.F;
        return (size == arrayList2.size() && arrayList.containsAll(arrayList2)) ? false : true;
    }

    public final boolean e7() {
        java.lang.String trim = this.f288001d.m79028xfb85ada3().toString().trim();
        if (trim == null) {
            trim = "";
        }
        int i17 = this.f288006i;
        if (i17 == 0) {
            int i18 = this.f288011p;
            if (i18 == 1) {
                return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) || this.f288015r;
            }
            if (i18 == 2) {
                return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288010o)) || trim.equals(this.f288010o)) ? false : true;
            }
        }
        if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288010o)) {
            return !this.f288010o.equals(trim);
        }
        java.lang.String str = this.f288009n;
        if (str == null || !str.equals(trim)) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288009n) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) ? false : true;
        }
        return false;
    }

    public final void f7(java.util.ArrayList arrayList, int i17) {
        android.graphics.Bitmap a17;
        this.C.setVisibility(8);
        this.f288024y.setVisibility(0);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            float g17 = i65.a.g(this);
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a18.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
            if ((!m17.a() ? false : m17.f294799a.F(m17.f294800b)) && (a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str, g17)) != null) {
                if (i17 == 0) {
                    this.E = 1;
                    this.f288026z.setVisibility(0);
                    this.f288026z.setImageBitmap(a17);
                    this.A.setVisibility(8);
                    this.B.setVisibility(8);
                } else if (i17 == 1) {
                    this.E = 2;
                    this.A.setVisibility(0);
                    this.A.setImageBitmap(a17);
                    this.B.setVisibility(8);
                } else if (i17 == 2) {
                    this.E = 3;
                    this.B.setVisibility(0);
                    this.B.setImageBitmap(a17);
                    this.f288024y.setVisibility(8);
                    this.C.setVisibility(0);
                }
                i17++;
            }
        }
    }

    public final void g7() {
        java.util.List list;
        com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f288005h);
        this.f288004g = z07;
        if (z07 != null) {
            this.P = z07.f66693x91130dba;
            list = ((b93.b) c93.a.a()).f(this.P);
        } else {
            list = null;
        }
        if (this.T == null) {
            this.T = new java.util.ArrayList();
        }
        java.util.List list2 = this.U;
        ((java.util.ArrayList) list2).clear();
        this.T.clear();
        java.util.List list3 = this.V;
        ((java.util.ArrayList) list3).clear();
        if (list != null) {
            this.T.addAll(list);
            ((java.util.ArrayList) list2).addAll(list);
            ((java.util.ArrayList) list3).addAll(list);
        } else {
            new java.util.ArrayList();
        }
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        if (c17 != null) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) c17;
                if (i17 >= arrayList.size()) {
                    break;
                }
                if (!this.T.contains(arrayList.get(i17))) {
                    this.T.add((java.lang.String) arrayList.get(i17));
                }
                i17++;
            }
        }
        h7(list2);
        this.Z = ((java.util.ArrayList) c17).size();
        this.f288012p0 = ((java.util.ArrayList) list2).size();
        this.f288022x0.addAll(list2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2d;
    }

    public final void h7(java.util.List list) {
        java.util.ArrayList arrayList = (java.util.ArrayList) ((j93.n) pf5.z.f435481a.a(this).a(j93.n.class)).W6(list);
        if (arrayList.isEmpty()) {
            this.L.setText("");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (i17 < arrayList.size()) {
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append(i17 < arrayList.size() + (-1) ? "，" : "");
            i17++;
        }
        this.L.setText(sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(gc0.p2.class);
        hashSet.add(vf5.j.class);
        hashSet.add(j93.n.class);
        hashSet.add(hr3.w1.class);
        hashSet.add(gc0.b.class);
        return hashSet;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        boolean z17;
        boolean z18;
        android.widget.TextView textView;
        r61.a h17;
        int i17;
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        this.f288005h = stringExtra;
        if (stringExtra != null && stringExtra.length() > 0) {
            this.f288003f = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f288005h, true);
            this.f288004g = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(this.f288005h);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = this.f288005h;
            objArr[1] = java.lang.Boolean.valueOf(this.f288003f != null);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f288003f;
            objArr[2] = z3Var2 != null ? z3Var2.d1() : "null";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "initView() called user:%s contact:%s contactUsername:%s", objArr);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f288003f;
            if (z3Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var3.d1())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(this.f288005h);
                this.f288003f = z3Var4;
                java.lang.String str = this.f288008m;
                if (str == null) {
                    str = "";
                }
                z3Var4.M1(str);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var5 = this.f288003f;
                java.lang.String str2 = this.f288009n;
                if (str2 == null) {
                    str2 = "";
                }
                z3Var5.n1(str2);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var6 = this.f288003f;
            if (z3Var6 != null) {
                this.D = z3Var6.f318124z1;
            }
            if (x51.t1.b(this.D) || this.D.startsWith("http://")) {
                java.lang.String b17 = i21.q.h().b(this.f288005h);
                if (i21.q.h().i(this.f288005h)) {
                    this.D = b17;
                } else {
                    this.D = "";
                }
            }
        }
        this.f288002e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obp);
        this.f288001d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.cdb);
        this.S = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) findViewById(com.p314xaae8f345.mm.R.id.uya);
        this.f288016s = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) findViewById(com.p314xaae8f345.mm.R.id.cda);
        this.f288024y = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cdj);
        this.f288026z = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ha7);
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ha9);
        this.B = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ha8);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.har);
        this.R = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) findViewById(com.p314xaae8f345.mm.R.id.f567494jp2);
        com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179());
        int i18 = com.p314xaae8f345.mm.ui.bl.b(mo55332x76847179()).x;
        if (i18 > 0) {
            int dimensionPixelSize = (i18 - getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)) / 3;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f288026z.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            this.f288026z.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams2.width = dimensionPixelSize;
            layoutParams2.height = dimensionPixelSize;
            this.A.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams3.width = dimensionPixelSize;
            layoutParams3.height = dimensionPixelSize;
            this.B.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f288024y.getLayoutParams();
            layoutParams4.width = dimensionPixelSize;
            layoutParams4.height = dimensionPixelSize;
            this.f288024y.setLayoutParams(layoutParams4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2 n2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var7 = this.f288003f;
        java.util.Iterator it = (z3Var7 == null ? kz5.p0.f395529d : n2Var.e(z3Var7.d1())).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.G;
            if (!hasNext) {
                break;
            }
            java.lang.String str3 = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                java.lang.String str4 = a17.f294812f;
                if (str4 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                    if (!str4.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    arrayList.add(str3);
                    this.F.add(str3);
                }
            }
        }
        f7(arrayList, 0);
        this.f288026z.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.b6(this));
        this.A.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.c6(this));
        this.B.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.d6(this));
        this.f288026z.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.l5(this));
        this.A.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.o5(this));
        this.B.setOnLongClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.r5(this));
        this.f288024y.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.v5(this));
        com.p314xaae8f345.mm.ui.p2690x38b72420.w5 w5Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.w5(this);
        com.p314xaae8f345.mm.ui.p2690x38b72420.x5 x5Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.x5(this);
        x5Var.f273429d = w5Var;
        this.f288001d.b(x5Var);
        this.f288001d.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z19) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this;
                if (z19) {
                    activityC22313x70d15e01.f288015r = true;
                    activityC22313x70d15e01.Q = 1;
                } else {
                    int i19 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
                    activityC22313x70d15e01.getClass();
                }
            }
        });
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var8 = this.f288003f;
        if (z3Var8 != null && (i17 = this.f288006i) != 3) {
            if (i17 == 4) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = this.f288001d;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str5 = this.f288008m;
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str5 == null) {
                    str5 = "";
                }
                float m79030x40077844 = this.f288001d.m79030x40077844();
                ((ke0.e) xVar).getClass();
                c21503x6e5a020a.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str5, m79030x40077844));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var8.w0())) {
                if (this.f288006i != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288009n)) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a2 = this.f288001d;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String w07 = this.f288003f.w0();
                    if (w07 == null) {
                        w07 = "";
                    }
                    float m79030x400778442 = this.f288001d.m79030x40077844();
                    ((ke0.e) xVar2).getClass();
                    c21503x6e5a020a2.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, w07, m79030x400778442));
                } else {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a3 = this.f288001d;
                    le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str6 = this.f288009n;
                    float m79030x400778443 = this.f288001d.m79030x40077844();
                    ((ke0.e) xVar3).getClass();
                    c21503x6e5a020a3.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str6, m79030x400778443));
                }
                this.f288003f.w0().equals(this.f288009n);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288009n)) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a4 = this.f288001d;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str7 = this.f288009n;
                if (str7 == null) {
                    str7 = "";
                }
                float m79030x400778444 = this.f288001d.m79030x40077844();
                ((ke0.e) xVar4).getClass();
                c21503x6e5a020a4.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str7, m79030x400778444));
                this.f288003f.w0().equals(this.f288009n);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288003f.P0())) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288008m)) {
                    java.lang.String P0 = this.f288003f.P0();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P0) && P0.length() <= 50) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a5 = this.f288001d;
                        le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String g27 = this.f288003f.g2();
                        if (g27 == null) {
                            g27 = "";
                        }
                        float m79030x400778445 = this.f288001d.m79030x40077844();
                        ((ke0.e) xVar5).getClass();
                        c21503x6e5a020a5.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, g27, m79030x400778445));
                    } else {
                        this.f288001d.m79040x765074af("");
                    }
                } else {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a6 = this.f288001d;
                    le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str8 = this.f288008m;
                    if (str8 == null) {
                        str8 = "";
                    }
                    float m79030x400778446 = this.f288001d.m79030x40077844();
                    ((ke0.e) xVar6).getClass();
                    c21503x6e5a020a6.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str8, m79030x400778446));
                }
            } else if (this.f288006i != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288008m) || this.f288003f.r2()) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a7 = this.f288001d;
                le0.x xVar7 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String P02 = this.f288003f.P0();
                if (P02 == null) {
                    P02 = "";
                }
                float m79030x400778447 = this.f288001d.m79030x40077844();
                ((ke0.e) xVar7).getClass();
                c21503x6e5a020a7.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, P02, m79030x400778447));
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a8 = this.f288001d;
                le0.x xVar8 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str9 = this.f288008m;
                if (str9 == null) {
                    str9 = "";
                }
                float m79030x400778448 = this.f288001d.m79030x40077844();
                ((ke0.e) xVar8).getClass();
                c21503x6e5a020a8.m79033x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str9, m79030x400778448));
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a9 = this.f288001d;
            c21503x6e5a020a9.m79037xf579a34a(c21503x6e5a020a9.m79028xfb85ada3().length());
        }
        if (this.f288006i != 0 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f288005h)) {
            int i19 = this.f288006i;
            if (i19 == 3) {
                this.f288002e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574839jo5);
                this.f288001d.m79033x764b0e09("");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288008m)) {
                    this.f288001d.m79040x765074af(this.f288008m);
                }
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cdc);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574509ij0);
                textView2.setVisibility(0);
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.jp6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f567493jp1);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i19 == 4) {
                this.f288002e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i5k);
                this.f288001d.m79033x764b0e09("");
                android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cdc);
                textView3.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i6d);
                textView3.setVisibility(0);
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f288005h)) {
                this.f288002e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574839jo5);
            }
        } else {
            this.f288002e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.bf9);
            if (com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p() || (h17 = m61.k.wi().h(this.f288003f.d1())) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.h()) || h17.h().equals(this.f288001d.m79028xfb85ada3())) {
                z17 = false;
            } else {
                java.lang.String f17 = h17.f();
                if (f17 == null) {
                    f17 = "";
                }
                f17.replace(" ", "");
                this.f288019v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpd);
                android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f567497jp5);
                this.f288020w = findViewById3;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initMobileNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView4 = this.f288019v;
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh7, h17.h());
                if (string == null) {
                    string = "";
                }
                textView4.setText(string);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                f0Var.c(new com.p314xaae8f345.mm.ui.p2690x38b72420.g6(this, h17.h()), 0, f0Var.length(), 17);
                this.f288019v.append(" ");
                this.f288019v.append(f0Var);
                this.f288019v.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                z17 = true;
            }
            if (!z17) {
                if (!com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2562xc84ac380.C20630xe35b63ae.p()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "initChatRoomNameArea() chatroomName: %s, mobileName: %s, remarkName: %s", this.f288021x, this.f288019v, this.f288001d.m79028xfb85ada3());
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288021x) && (((textView = this.f288019v) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(textView.getText())) && (this.f288001d.m79028xfb85ada3() == null || !this.f288021x.equals(this.f288001d.m79028xfb85ada3().toString())))) {
                        this.f288019v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpd);
                        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f567497jp5);
                        this.f288020w = findViewById4;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(findViewById4, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initChatRoomNameArea", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView5 = this.f288019v;
                        le0.x xVar9 = (le0.x) i95.n0.c(le0.x.class);
                        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bh6, this.f288021x);
                        if (string2 == null) {
                            string2 = "";
                        }
                        float textSize = this.f288019v.getTextSize();
                        ((ke0.e) xVar9).getClass();
                        textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, string2, textSize));
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.la6));
                        f0Var2.c(new com.p314xaae8f345.mm.ui.p2690x38b72420.g6(this, this.f288021x), 0, f0Var2.length(), 17);
                        this.f288019v.append(" ");
                        this.f288019v.append(f0Var2);
                        this.f288019v.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        z18 = true;
                        if (!z18 && ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1)) {
                            ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).V6(new gc0.b0(this.f288005h, this.f288008m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$d
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    return com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.f288001d.getEditText();
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$e
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    return com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.R.m75370xcd47ad5f();
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$f
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    return java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.R.f());
                                }
                            }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$g
                                @Override // yz5.l
                                /* renamed from: invoke */
                                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                    java.lang.String str10 = (java.lang.String) obj;
                                    int i27 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
                                    com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this;
                                    com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) activityC22313x70d15e01.findViewById(com.p314xaae8f345.mm.R.id.f567494jp2);
                                    if (!activityC22313x70d15e01.R.f()) {
                                        return java.lang.Boolean.FALSE;
                                    }
                                    c19645x574159e9.c(str10, false, false);
                                    return java.lang.Boolean.TRUE;
                                }
                            }, null, null);
                        }
                    }
                }
                z18 = false;
                if (!z18) {
                    ((gc0.p2) pf5.z.f435481a.a(this).a(gc0.p2.class)).V6(new gc0.b0(this.f288005h, this.f288008m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$d
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.f288001d.getEditText();
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$e
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.R.m75370xcd47ad5f();
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$f
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return java.lang.Boolean.valueOf(!com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.R.f());
                        }
                    }, new yz5.l() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$g
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            java.lang.String str10 = (java.lang.String) obj;
                            int i27 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
                            com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this;
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9) activityC22313x70d15e01.findViewById(com.p314xaae8f345.mm.R.id.f567494jp2);
                            if (!activityC22313x70d15e01.R.f()) {
                                return java.lang.Boolean.FALSE;
                            }
                            c19645x574159e9.c(str10, false, false);
                            return java.lang.Boolean.TRUE;
                        }
                    }, null, null);
                }
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f288005h)) {
                android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.jp6);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f567493jp1);
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById6, arrayList7.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(1);
            }
        }
        mo54450xbf7c1df6("");
        if (this.f288001d.m79021xfb8046fd() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288001d.m79021xfb8046fd().toString())) {
            this.f288010o = this.f288001d.m79021xfb8046fd().toString();
            this.f288011p = 1;
        }
        if (this.f288001d.m79028xfb85ada3() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288001d.m79028xfb85ada3().toString())) {
            this.f288010o = this.f288001d.m79028xfb85ada3().toString();
            this.f288011p = 2;
        }
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.ui.p2690x38b72420.y5(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
        mo78530x8b45058f();
        this.f39322x2305be9.G0(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aay));
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new java.lang.Runnable() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i27 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.f287999y1;
                com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this.b7();
            }
        });
        m78560xe21cbbf(false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a10 = this.f288016s;
        le0.x xVar10 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str10 = this.f288017t;
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str10 == null) {
            str10 = "";
        }
        float m79030x400778449 = this.f288016s.m79030x40077844();
        ((ke0.e) xVar10).getClass();
        android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str10, m79030x400778449);
        c21503x6e5a020a10.getClass();
        c21503x6e5a020a10.editText.append(j17);
        com.p314xaae8f345.mm.p2621x8fb0427b.ya yaVar = this.f288004g;
        if (yaVar != null) {
            java.lang.String str11 = yaVar.f66690xbe857eff;
            if (str11 == null) {
                str11 = "";
            }
            this.f288017t = str11;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288017t) && (z3Var = this.f288003f) != null) {
            this.f288017t = z3Var.f318122y1;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f288017t)) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a11 = this.f288016s;
            le0.x xVar11 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str12 = this.f288017t;
            java.lang.String str13 = str12 != null ? str12 : "";
            float m79030x4007784410 = this.f288016s.m79030x40077844();
            ((ke0.e) xVar11).getClass();
            c21503x6e5a020a11.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str13, m79030x4007784410));
        }
        this.f288016s.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.f6(this, null));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = this.F;
        if (i17 == 100) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            arrayList.add(Y6(b17, arrayList.size()));
            f7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 200) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
                return;
            }
            java.util.Iterator<java.lang.String> it = intent.getStringArrayListExtra("CropImage_OutputPath_List").iterator();
            while (it.hasNext()) {
                arrayList.add(Y6(it.next(), arrayList.size()));
            }
            f7(arrayList, 0);
            X6();
            return;
        }
        if (i17 == 400) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
                return;
            }
            if (intent.getBooleanExtra("response_delete", false)) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("remark_image_path");
                if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                    this.E = 0;
                    this.f288026z.setVisibility(8);
                    this.A.setVisibility(8);
                    this.B.setVisibility(8);
                }
                f7(stringArrayListExtra, 0);
                arrayList.clear();
                arrayList.addAll(stringArrayListExtra);
                X6();
                return;
            }
            return;
        }
        if (i17 != 600) {
            return;
        }
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.ModRemarkName", "data shouldnot be null");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("result_label_id_list");
        ((j93.n) pf5.z.f435481a.a(this).a(j93.n.class)).O6(stringArrayListExtra2, intent.getIntExtra("recommend_label_adopt_count", 0));
        java.util.List c17 = ((b93.b) c93.a.a()).c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "onAcvityResult，labelLists: %s, allLabelListsNow: %s.", stringArrayListExtra2, c17);
        if (!W6(stringArrayListExtra2, this.V) && !W6(c17, this.T)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "onAcvityResult checkLebalChanges.");
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("contact_search_label_new_list");
        if (stringArrayListExtra3 != null) {
            this.f288025y0.addAll(stringArrayListExtra3);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra4 = intent.getStringArrayListExtra("contact_search_label_add_list");
        if (stringArrayListExtra4 != null) {
            this.f288007l1.addAll(stringArrayListExtra4);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra5 = intent.getStringArrayListExtra("contact_select_label_add_list");
        if (stringArrayListExtra5 != null) {
            this.f288023x1.addAll(stringArrayListExtra5);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra6 = intent.getStringArrayListExtra("contact_select_label_new_list");
        if (stringArrayListExtra6 != null) {
            this.f288013p1.addAll(stringArrayListExtra6);
        }
        if (this.T == null) {
            this.T = new java.util.ArrayList();
        }
        g7();
        if (i18 == -1) {
            m78501x43e00957(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a;
        super.onCreate(bundle);
        this.Y = java.lang.System.currentTimeMillis();
        this.I = getIntent().getIntExtra("Contact_Scene", 9);
        this.f288021x = getIntent().getStringExtra("Contact_RoomNickname");
        this.f288006i = getIntent().getIntExtra("Contact_mode_name_type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Nick");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f288008m = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("Contact_RemarkName");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        this.f288009n = str;
        this.f288014q = str;
        this.f288018u = getIntent().getBooleanExtra("Contact_ModStrangerRemark", true);
        mo43517x10010bd5();
        int i17 = 8;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f288005h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "initLabelPanelAll, isOpenIM, userName: %s.", this.f288005h);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cd9);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cd8);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            this.M = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cd9);
            this.K = findViewById(com.p314xaae8f345.mm.R.id.cd8);
            this.N = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cd8);
            this.L = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cd6);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a4u);
            if (imageView != null) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this, com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, i65.a.d(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
            }
            this.N.setOnClickListener(this.f288000J);
            if (this.f288006i != 0) {
                android.view.View view = this.K;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.M.setVisibility(8);
            } else {
                android.view.View view2 = this.K;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI", "initLabelPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.M.setVisibility(0);
                this.L.setVisibility(0);
            }
            g7();
        }
        X6();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f288003f;
        if ((z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) && (c21503x6e5a020a = this.f288001d) != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) c21503x6e5a020a.getParent();
            int childCount = viewGroup.getChildCount();
            int i18 = 0;
            while (i18 < childCount) {
                android.view.View childAt = viewGroup.getChildAt(i18);
                int id6 = childAt.getId();
                if (id6 != com.p314xaae8f345.mm.R.id.cdc && id6 != com.p314xaae8f345.mm.R.id.cdb) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(childAt, arrayList5.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/ui/contact/ModRemarkNameUI", "hideNonRemarkField", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i18++;
                i17 = 8;
            }
        }
        ((j93.n) m80391xac8f1cfd(j93.n.class)).S6(this.f288005h, true, (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) findViewById(com.p314xaae8f345.mm.R.id.u8m), new yz5.a() { // from class: com.tencent.mm.ui.contact.ModRemarkNameUI$$c
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01.this;
                activityC22313x70d15e01.h7(activityC22313x70d15e01.U);
                activityC22313x70d15e01.X6();
                return null;
            }
        });
        ((hr3.w1) m80391xac8f1cfd(hr3.w1.class)).P6(iy1.c.WeChatNotesandTabsPage);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        b7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.f72435x366c91de, this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(kd1.c.f72435x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.mo808xfb85f7b0() == 44) {
            if (i17 == 0 || i18 >= 0) {
                finish();
            } else {
                android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574431i64, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                finish();
            }
        }
    }
}
