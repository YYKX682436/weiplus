package e33;

/* loaded from: classes10.dex */
public class v2 extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f329032g;

    /* renamed from: h, reason: collision with root package name */
    public final int f329033h;

    /* renamed from: n, reason: collision with root package name */
    public boolean f329036n;

    /* renamed from: s, reason: collision with root package name */
    public e33.s2 f329041s;

    /* renamed from: t, reason: collision with root package name */
    public e33.r2 f329042t;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f329034i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f329035m = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f329037o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public int f329038p = -1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f329039q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f329040r = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f329043u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f329044v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329045w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f329046x = "";

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f329047y = new e33.p2(this, android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f329048z = new java.util.HashMap();
    public final e33.m3 A = new e33.m3(this);
    public final e33.l3 B = new e33.l3(this);

    public v2(android.content.Context context, int i17) {
        this.f329032g = context;
        this.f329033h = i17;
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        e33.u2 u2Var = (e33.u2) e17.getTag();
        if (u2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "position : %d getMultiTouchImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17 && u2Var.f329017b.getVisibility() == 8) {
            return null;
        }
        return u2Var.f329017b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        e33.u2 u2Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        java.lang.String str2;
        int i18;
        android.view.View view3;
        int i19;
        com.p314xaae8f345.mm.vfs.x1 m17;
        java.lang.Object obj;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d;
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        if (view == null || view.getTag() == null) {
            android.view.View inflate = android.view.View.inflate(this.f329032g, com.p314xaae8f345.mm.R.C30864xbddafb2a.bke, null);
            e33.u2 u2Var2 = new e33.u2();
            u2Var2.f329017b = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) inflate.findViewById(com.p314xaae8f345.mm.R.id.h88);
            u2Var2.f329018c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) inflate.findViewById(com.p314xaae8f345.mm.R.id.pr8);
            u2Var2.f329019d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ozf);
            u2Var2.f329020e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jdz);
            u2Var2.f329021f = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465) inflate.findViewById(com.p314xaae8f345.mm.R.id.p0x);
            inflate.setTag(u2Var2);
            view2 = inflate;
            u2Var = u2Var2;
        } else {
            e33.u2 u2Var3 = (e33.u2) view.getTag();
            u2Var3.f329017b.setVisibility(4);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = u2Var3.f329018c;
            if (this.f329043u && c21537x5f41189f != null && (c1451x2b77465d2 = c21537x5f41189f.f149750f) != null) {
                c1451x2b77465d2.m15693x408b7293();
            }
            u2Var3.f329018c.setVisibility(4);
            u2Var3.f329019d.setVisibility(0);
            u2Var3.f329020e.setVisibility(8);
            o(u2Var3);
            view2 = view;
            u2Var = u2Var3;
        }
        if (this.f329036n) {
            abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f329035m.get(i17);
            str = abstractC15633xee433078.f219963e;
            str2 = abstractC15633xee433078.f219966h;
            i18 = abstractC15633xee433078.mo63659xfb85f7b0();
        } else {
            java.lang.String str3 = (java.lang.String) this.f329034i.get(i17);
            if (t23.p0.l() != null) {
                int indexOf = t23.p0.l().indexOf(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str3, str3, ""));
                if (indexOf >= 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) t23.p0.l().get(indexOf);
                    i18 = abstractC15633xee4330782.mo63659xfb85f7b0();
                    str2 = null;
                    str = str3;
                    abstractC15633xee433078 = abstractC15633xee4330782;
                }
            }
            str = str3;
            abstractC15633xee433078 = null;
            str2 = null;
            i18 = -1;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(abstractC15633xee433078 != null ? abstractC15633xee433078.mo63659xfb85f7b0() : -1);
        objArr[3] = abstractC15633xee433078 != null ? abstractC15633xee433078.f219971p : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "getView >> position: %d，filePath: %s, itemType: %d, mimeType: %s", objArr);
        view2.setTag(com.p314xaae8f345.mm.R.id.tzk, java.lang.Integer.valueOf(i18));
        if (abstractC15633xee433078 != null && abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
            u2Var.f329016a = false;
            u2Var.f329019d.setVisibility(0);
            u2Var.f329020e.setVisibility(8);
            u2Var.f329019d.setOnClickListener(new e33.t2(this, u2Var, str, this.f329041s));
            u2Var.f329021f.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330783 = abstractC15633xee433078;
            u2Var.f329021f.f(new ok4.w(new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6953x6177b4fc(), java.lang.System.currentTimeMillis(), 3));
            u2Var.f329021f.mo69326x360a109e(new e33.k2(this, u2Var));
            if (t23.p0.k().f496830f == 4 || t23.p0.k().f496830f == 3 || t23.p0.k().f496830f == 14) {
                abstractC15633xee433078 = abstractC15633xee4330783;
                t23.r2 r2Var = new t23.r2(abstractC15633xee433078.f219963e, i17, (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078, new e33.l2(this, u2Var));
                if (!r2Var.m165765xb2c87fbf(u2Var.f329020e.getTag())) {
                    u2Var.f329020e.setTag(r2Var);
                    ((ku5.t0) ku5.t0.f394148d).g(r2Var);
                }
                view3 = view2;
            } else {
                view3 = view2;
                abstractC15633xee433078 = abstractC15633xee4330783;
            }
        } else {
            if (abstractC15633xee433078 != null && (abstractC15633xee433078.mo63659xfb85f7b0() == 6 || ((abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) abstractC15633xee433078).f219958w))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "livePhotoMediaItem getView >> position: %d, mediaId: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(abstractC15633xee433078.f219967i));
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 D7 = abstractC15633xee433078.mo63659xfb85f7b0() == 6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078 : com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.D7((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b) abstractC15633xee433078);
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830(this.f329032g, null);
                c15628x6bc05830.f219940d = 1;
                c15628x6bc05830.a(D7);
                c15628x6bc05830.b(D7.A);
                java.lang.String tips = i65.a.r(this.f329032g, com.p314xaae8f345.mm.R.C30867xcad56011.meg);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tips, "tips");
                y51.c Ai = ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).Ai(new a61.a(new a61.d(true, c15628x6bc05830, false, false, true, tips, false, null, true, null), new a61.c(1, D7.f219966h, java.lang.Boolean.valueOf(D7.G == 1).booleanValue(), D7.f219963e, java.lang.Long.valueOf(D7.f219967i), new e33.m2(this, D7, c15628x6bc05830), null)), this.f329032g);
                c15628x6bc05830.m63655xdc00daf7(new e33.n2(this, i17, Ai, D7));
                Ai.mo176508x4c403202(new e33.o2(this));
                c15628x6bc05830.setVisibility(0);
                android.view.View view4 = (android.view.View) Ai;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                u2Var.f329019d.setVisibility(8);
                u2Var.f329019d.setOnClickListener(null);
                u2Var.f329016a = false;
                y51.b bVar = (y51.b) Ai;
                bVar.d();
                if (i17 == this.f329044v && D7.H == 1 && D7.A != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "getView is current live photo to play");
                    bVar.c();
                    p(D7, 1);
                }
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f329032g);
                frameLayout.addView(view4, new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setTag(com.p314xaae8f345.mm.R.id.tzk, java.lang.Integer.valueOf(i18));
                if (this.f329033h == 2) {
                    fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
                    java.lang.String str4 = java.lang.System.currentTimeMillis() + "";
                    java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
                    java.lang.String e17 = kk.k.e(D7.f219963e);
                    java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
                    int i27 = D7.B;
                    ((ee0.r4) m4Var).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLivePhotoExposure", "com.tencent.mm.feature.sns.SnsReportHelperService");
                    ke4.a.f388558a.b(str4, 0, "", Bi, 1, e17, Ni, i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLivePhotoExposure", "com.tencent.mm.feature.sns.SnsReportHelperService");
                }
                android.view.View findViewById = c15628x6bc05830.findViewById(com.p314xaae8f345.mm.R.id.ut_);
                if (com.p314xaae8f345.mm.ui.b4.c(this.f329032g) && findViewById != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onSelectItem >> avoidNavigationBarForApi35");
                    com.p314xaae8f345.mm.ui.a4.e(findViewById, false, false, 2, null);
                }
                return frameLayout;
            }
            if (t23.p0.k().f496830f == 3 && abstractC15633xee433078 != null && abstractC15633xee433078.f219971p.equalsIgnoreCase("image/gif")) {
                android.widget.TextView textView = u2Var.f329020e;
                android.content.Context context = this.f329032g;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                java.lang.String str5 = a17.f294812f;
                if (str5 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                    if (!a17.f294812f.equals(l17)) {
                        view3 = view2;
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fii, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L)));
                        u2Var.f329020e.setVisibility(0);
                        u2Var.f329016a = false;
                        i19 = 8;
                    }
                }
                view3 = view2;
                com.p314xaae8f345.mm.vfs.z2 m182 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m182.a()) {
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fii, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0((m182.a() && (m17 = m182.f294799a.m(m182.f294800b)) != null) ? m17.f294766c : 0L)));
                    u2Var.f329020e.setVisibility(0);
                    u2Var.f329016a = false;
                    i19 = 8;
                }
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fii, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0((m182.a() && (m17 = m182.f294799a.m(m182.f294800b)) != null) ? m17.f294766c : 0L)));
                u2Var.f329020e.setVisibility(0);
                u2Var.f329016a = false;
                i19 = 8;
            } else {
                view3 = view2;
                i19 = 8;
                u2Var.f329020e.setVisibility(8);
                u2Var.f329016a = true;
            }
            u2Var.f329019d.setVisibility(i19);
            u2Var.f329019d.setOnClickListener(null);
        }
        if (t23.p0.k().f496830f != 3 || (!(abstractC15633xee433078 == null && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(str)) && (abstractC15633xee433078 == null || !abstractC15633xee433078.f219971p.equalsIgnoreCase("image/gif")))) {
            long j17 = abstractC15633xee433078 == null ? 0L : abstractC15633xee433078.f219968m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "initImageView, filePath: %s.", str);
            e33.l3 l3Var = this.B;
            if (((lt0.f) l3Var.f328857g).k(str)) {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) l3Var.f328857g).i(str);
                if (bitmap.isRecycled()) {
                    ((jt0.i) l3Var.f328857g).mo141381xc84af884(str);
                } else {
                    q(u2Var, bitmap);
                }
            }
            android.graphics.Bitmap g17 = t23.p0.h().g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? str : str2, str, -1L, null, j17);
            boolean c17 = rq5.a.c(com.p314xaae8f345.mm.vfs.w6.i(str, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "isSupport: %s, path: %s.", java.lang.Boolean.valueOf(c17), str);
            if (c17) {
                u2Var.f329017b.setVisibility(4);
                u2Var.f329018c.setVisibility(0);
                android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
                if (n07 != null) {
                    int a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(str);
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f2 = u2Var.f329018c;
                    int i28 = n07.outWidth;
                    int i29 = n07.outHeight;
                    c21537x5f41189f2.f149752h = i28;
                    c21537x5f41189f2.f149753i = i29;
                    c21537x5f41189f2.m79320x1a6eb00e(a18);
                    u2Var.f329018c.i();
                    u2Var.f329018c.m45747xe60f5d4e(new e33.q2(this, u2Var, g17, str, i18));
                    if (g17 != null) {
                        u2Var.f329018c.t(str, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1449xe4cdf536.m15526x34f23cf1(g17));
                    } else {
                        u2Var.f329018c.t(str, null);
                    }
                }
            } else {
                q(u2Var, g17);
                java.util.HashSet hashSet = this.f329037o;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    u2Var.f329017b.setTag(u2Var);
                    l3Var.b(u2Var.f329017b, str, i18);
                }
            }
        } else {
            u2Var.f329017b.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f3 = u2Var.f329018c;
            if (this.f329043u && c21537x5f41189f3 != null && (c1451x2b77465d = c21537x5f41189f3.f149750f) != null) {
                c1451x2b77465d.m15693x408b7293();
            }
            u2Var.f329018c.setVisibility(4);
            u2Var.f329017b.mo79202xa3d97c26(1.0f);
            u2Var.f329017b.m79195x464b3146(false);
            u2Var.f329017b.m79197xb2d06f47(str);
            u2Var.f329017b.mo45742x548ba9bf(new android.graphics.Matrix());
            u2Var.f329017b.h();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = u2Var.f329017b;
            if (c21524xecd57b9a.f279186p0 && (obj = c21524xecd57b9a.f279195x0) != null) {
                ((og5.e) obj).stop();
                ((og5.e) c21524xecd57b9a.f279195x0).start();
            }
        }
        android.os.SystemClock.elapsedRealtime();
        return view3;
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        y51.c j17 = j(i17);
        if (j17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "destroyItem >> to release livePhotoPlayer: %d", java.lang.Integer.valueOf(i17));
            ((y51.b) j17).e();
        }
        if (this.f329036n) {
            viewGroup.removeView((android.view.View) obj);
            super.mo7741x89d2022d(viewGroup, i17, obj);
        } else {
            if (obj == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "[destroyItem] position:%s", java.lang.Integer.valueOf(i17));
                return;
            }
            if (this.f329039q != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "[destroyItem] position:%s object:%s lastVisibleView:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(obj.hashCode()), java.lang.Integer.valueOf(this.f329039q.hashCode()));
            }
            if (obj == this.f329039q && this.f329040r) {
                return;
            }
            super.mo7741x89d2022d(viewGroup, i17, obj);
            viewGroup.removeView((android.view.View) obj);
        }
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition view is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        e33.u2 u2Var = (e33.u2) e17.getTag();
        if (u2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "position : %d getWxImageViewByPosition holder is null.", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (z17 && u2Var.f329018c.getVisibility() == 8) {
            return null;
        }
        return u2Var.f329018c;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f329036n ? this.f329035m.size() : this.f329034i.size();
    }

    public java.lang.String i(int i17) {
        if (this.f329036n) {
            java.util.ArrayList arrayList = this.f329035m;
            if (i17 >= 0 && i17 < arrayList.size()) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).f219963e;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "error position %d, mediaitems size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return "";
        }
        java.util.ArrayList arrayList2 = this.f329034i;
        if (i17 >= 0 && i17 < arrayList2.size()) {
            return (java.lang.String) arrayList2.get(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList2.size()));
        return "";
    }

    @Override // db5.p8, p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        if (this.f329036n) {
            return super.mo7744x8d1aed1d(viewGroup, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "[instantiateItem] position:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f329038p));
        int i18 = this.f329038p;
        if (i17 != i18 || !this.f329040r) {
            return super.mo7744x8d1aed1d(viewGroup, i17);
        }
        this.f310003e.put(this.f329039q, java.lang.Integer.valueOf(i18));
        this.f310004f.put(this.f329038p, this.f329039q);
        this.f329038p = -1;
        this.f329040r = false;
        return this.f329039q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y51.c j(int i17) {
        java.lang.Object tag;
        java.lang.Object obj = this.f310004f.get(i17);
        if (obj != null && (tag = ((android.view.View) obj).getTag(com.p314xaae8f345.mm.R.id.tzk)) != null) {
            boolean z17 = ((java.lang.Integer) tag).intValue() == 6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "getLivePhotoPlayViewByPosition position: %d, isLivePhoto: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            if (z17) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                int childCount = viewGroup.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    android.view.View childAt = viewGroup.getChildAt(i18);
                    if (childAt instanceof y51.c) {
                        return (y51.c) childAt;
                    }
                }
                return null;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(obj == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "getLivePhotoPlayViewByPosition >> position: %d is no livePhoto object is null: %b", objArr);
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k(int i17) {
        int indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = null;
        if (this.f329036n) {
            java.util.ArrayList arrayList = this.f329035m;
            if (i17 >= 0 && i17 < arrayList.size()) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "error position %d mediaitems size", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
            return null;
        }
        java.util.ArrayList arrayList2 = this.f329034i;
        if (i17 < 0 || i17 >= arrayList2.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "error position %d, imagePaths size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList2.size()));
            return null;
        }
        java.lang.String str = (java.lang.String) arrayList2.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, str, "");
        if (t23.p0.l() != null && (indexOf = t23.p0.l().indexOf(b17)) >= 0) {
            abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) t23.p0.l().get(indexOf);
        }
        if (abstractC15633xee433078 != null || t23.p0.m().isEmpty()) {
            return abstractC15633xee433078;
        }
        java.util.Iterator it = t23.p0.m().iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (abstractC15633xee4330782.m63662xb2c87fbf(b17)) {
                return abstractC15633xee4330782;
            }
        }
        return abstractC15633xee433078;
    }

    public void l() {
        y51.c cVar;
        y51.f fVar;
        android.util.SparseArray sparseArray = this.f310004f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "notifyBottomHeightChange >> cacheSize: %d", java.lang.Integer.valueOf(sparseArray.size()));
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            android.view.View view = (android.view.View) sparseArray.get(keyAt);
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.tzk);
            if (tag != null) {
                boolean z17 = ((java.lang.Integer) tag).intValue() == 6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "view Cache position: %d, isLivePhoto: %b", java.lang.Integer.valueOf(keyAt), java.lang.Boolean.valueOf(z17));
                if (z17) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= childCount) {
                            cVar = null;
                            break;
                        }
                        android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i18);
                        if (childAt instanceof y51.c) {
                            cVar = (y51.c) childAt;
                            break;
                        }
                        i18++;
                    }
                    if (cVar != null) {
                        z51.r rVar = (z51.r) ((y51.b) cVar).a(z51.r.class);
                        rVar.f("changeTagViewLocation >> locationDepends: " + rVar.f551749k);
                        if (rVar.f551744f && (fVar = rVar.f551748j) != null && !rVar.f551746h && rVar.f551749k != 0) {
                            int c17 = fVar.c();
                            rVar.f("changeTagViewLocation >> bottomHeight: " + c17);
                            rVar.k(c17);
                        }
                    }
                }
            }
        }
    }

    public void m(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 k17;
        if (i17 >= 0 && (k17 = k(i17)) != null && k17.mo63659xfb85f7b0() == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) k17;
            int i18 = c15632xfc4fd0d0.A;
            if (i18 == 1) {
                o23.m.f423959a.D.a(2);
            } else if (i18 == 2) {
                o23.m.f423959a.D.a(1);
            } else if (i18 == 0) {
                o23.m.f423959a.D.a(c15632xfc4fd0d0.I != 1 ? 1 : 2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(boolean r12, int r13) {
        /*
            r11 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.ImageAdapter"
            java.lang.String r2 = "onSelectItem >> position: %d, isSelect: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = r11.k(r13)
            if (r0 == 0) goto Lad
            int r2 = r0.mo63659xfb85f7b0()
            r3 = 6
            if (r2 == r3) goto L22
            goto Lad
        L22:
            android.util.SparseArray r2 = r11.f310004f
            java.lang.Object r2 = r2.get(r13)
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L7c
            r7 = r2
            android.view.View r7 = (android.view.View) r7
            r8 = 2131309176(0x7f093278, float:1.8236628E38)
            java.lang.Object r7 = r7.getTag(r8)
            if (r7 == 0) goto L7c
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r3) goto L43
            r3 = r4
            goto L44
        L43:
            r3 = r6
        L44:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "getLivePhotoTagViewByPosition position: %d, isLivePhoto: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8, r7)
            if (r3 == 0) goto L7c
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r7 = r3.getChildCount()
            r8 = r6
        L5f:
            if (r8 >= r7) goto L6f
            android.view.View r9 = r3.getChildAt(r8)
            boolean r10 = r9 instanceof y51.c
            if (r10 == 0) goto L6c
            y51.c r9 = (y51.c) r9
            goto L70
        L6c:
            int r8 = r8 + 1
            goto L5f
        L6f:
            r9 = r5
        L70:
            if (r9 == 0) goto L7c
            y51.b r9 = (y51.b) r9
            android.view.View r1 = r9.m176506x5aa37cae()
            r5 = r1
            com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830) r5
            goto L93
        L7c:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r3[r6] = r7
            if (r2 != 0) goto L88
            r6 = r4
        L88:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            r3[r4] = r2
            java.lang.String r2 = "getLivePhotoTagViewByPosition >> position: %d is no livePhoto object is null: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r3)
        L93:
            if (r5 == 0) goto L98
            r5.c(r12)
        L98:
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) r0
            int r12 = r0.A
            if (r12 != r4) goto Lad
            y51.c r12 = r11.j(r13)
            if (r12 == 0) goto Lad
            y51.b r12 = (y51.b) r12
            r12.c()
            r12 = 4
            r11.p(r0, r12)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.v2.n(boolean, int):void");
    }

    public final void o(e33.u2 u2Var) {
        u2Var.f329021f.setVisibility(8);
        u2Var.f329019d.setVisibility(0);
        u2Var.f329018c.setVisibility(0);
        u2Var.f329017b.setVisibility(0);
        this.f329047y.removeMessages(1);
    }

    public final void p(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0, int i17) {
        if (this.f329033h != 2) {
            return;
        }
        fe0.m4 m4Var = (fe0.m4) i95.n0.c(fe0.m4.class);
        java.lang.String str = java.lang.System.currentTimeMillis() + "";
        java.lang.String e17 = kk.k.e(c15632xfc4fd0d0.f219963e);
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        java.lang.String Bi = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi();
        int i18 = c15632xfc4fd0d0.B;
        ((ee0.r4) m4Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLivePhotoPlay", "com.tencent.mm.feature.sns.SnsReportHelperService");
        ke4.a.f388558a.c(i17, str, 1, e17, Ni, 0, "", Bi, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLivePhotoPlay", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }

    public void q(e33.u2 u2Var, android.graphics.Bitmap bitmap) {
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "showImage, bmp:%s, trace: %s.", bitmap, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (bitmap == null) {
            u2Var.f329017b.setVisibility(4);
            u2Var.f329018c.setVisibility(4);
            return;
        }
        u2Var.f329017b.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f c21537x5f41189f = u2Var.f329018c;
        if (this.f329043u && c21537x5f41189f != null && (c1451x2b77465d = c21537x5f41189f.f149750f) != null) {
            c1451x2b77465d.m15693x408b7293();
        }
        u2Var.f329018c.setVisibility(4);
        u2Var.f329017b.mo79202xa3d97c26(4.5f);
        u2Var.f329017b.m79195x464b3146(false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = u2Var.f329017b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        c21524xecd57b9a.f279184o = width;
        c21524xecd57b9a.f279185p = height;
        u2Var.f329017b.setImageBitmap(bitmap);
        u2Var.f329017b.requestLayout();
    }

    public void r() {
        e33.u2 u2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "stop all video");
        android.util.SparseArray sparseArray = this.f310004f;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            java.lang.Object valueAt = sparseArray.valueAt(i17);
            if ((valueAt instanceof android.view.View) && (u2Var = (e33.u2) ((android.view.View) valueAt).getTag()) != null && u2Var.f329021f.mo69420xf582434a()) {
                u2Var.f329021f.mo69303x360802();
                o(u2Var);
            }
        }
        this.f329047y.removeMessages(1);
    }
}
