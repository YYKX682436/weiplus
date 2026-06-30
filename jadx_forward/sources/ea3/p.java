package ea3;

/* loaded from: classes10.dex */
public class p extends android.widget.FrameLayout implements t23.m1, ea3.j {
    public boolean A;
    public int B;
    public int C;
    public e60.z0 D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 E;
    public final ea3.z F;
    public java.util.LinkedList G;
    public final java.util.ArrayList H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.util.LinkedList f332180J;
    public final java.util.LinkedList K;
    public final e60.y0 L;
    public final e60.x0 M;
    public final ea3.k N;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f332181d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f332182e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f332183f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f332184g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f332185h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f332186i;

    /* renamed from: m, reason: collision with root package name */
    public d85.f0 f332187m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f332188n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f332189o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f332190p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f332191q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f332192r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f332193s;

    /* renamed from: t, reason: collision with root package name */
    public ul5.k f332194t;

    /* renamed from: u, reason: collision with root package name */
    public ea3.n f332195u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f332196v;

    /* renamed from: w, reason: collision with root package name */
    public int f332197w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f332198x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f332199y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f332200z;

    public p(android.content.Context context, android.app.Activity activity, ea3.z zVar) {
        super(context);
        this.f332181d = "android.permission.WRITE_EXTERNAL_STORAGE";
        this.f332184g = true;
        this.f332185h = false;
        this.f332188n = false;
        this.f332189o = false;
        this.f332197w = 9;
        this.f332198x = "single";
        this.f332199y = "disable";
        this.f332200z = false;
        this.A = false;
        this.B = 3;
        this.C = 3;
        this.H = new java.util.ArrayList();
        this.I = false;
        this.f332180J = new java.util.LinkedList();
        this.K = new java.util.LinkedList();
        this.L = new ea3.C28286x337571(this);
        this.M = new e60.x0() { // from class: ea3.p$$b
            @Override // e60.x0
            public final boolean a(java.util.LinkedList linkedList, java.lang.Boolean bool) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183;
                ea3.p pVar = ea3.p.this;
                pVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "IonAlbumQueryResultFunction! switch:%B size:%d", bool, java.lang.Integer.valueOf(linkedList.size()));
                if (!linkedList.isEmpty()) {
                    if (pVar.G != null && linkedList.size() != pVar.G.size()) {
                        pVar.f332185h = true;
                    }
                    if (pVar.f332185h || pVar.E == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "first result switch:%B!", bool);
                        pVar.E = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) linkedList.get(0);
                        pVar.f332185h = false;
                    }
                    pVar.G = linkedList;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = pVar.E;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "before refreshCurrentFolder folder:%s %s", c15630x7d8d01832.f219948d, c15630x7d8d01832.f219951g);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01833 = pVar.E;
                    java.util.Iterator it = pVar.G.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) pVar.G.get(0);
                            break;
                        }
                        c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next();
                        if (c15630x7d8d01833.f219948d.equals(c15630x7d8d0183.f219948d) && c15630x7d8d01833.f219951g.equals(c15630x7d8d0183.f219951g)) {
                            break;
                        }
                    }
                    pVar.E = c15630x7d8d0183;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "after refreshCurrentFolder folder:%s %s", c15630x7d8d0183.f219948d, c15630x7d8d0183.f219951g);
                    pVar.f332189o = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01834 = pVar.E;
                    java.lang.String str = c15630x7d8d01834.f219951g;
                    if (str == null) {
                        str = "";
                    }
                    ((t23.d) pVar.D).c(c15630x7d8d01834.f219948d, bool, str);
                }
                return true;
            }
        };
        this.N = new ea3.C28288x337573(this);
        this.f332182e = context;
        this.f332183f = activity;
        this.F = zVar;
    }

    public static java.lang.String f(int i17) {
        if (i17 == 1) {
            return "image";
        }
        if (i17 == 2) {
            return "video";
        }
        if (i17 == 6) {
            return "image";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "can not conver type:%d", java.lang.Integer.valueOf(i17));
        return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    /* renamed from: setAdapterMode */
    private void m127214x931ccbd0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setAdapterMode:%s", str);
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -902265784:
                if (str.equals("single")) {
                    c17 = 0;
                    break;
                }
                break;
            case 104256825:
                if (str.equals("multi")) {
                    c17 = 1;
                    break;
                }
                break;
            case 152731817:
                if (str.equals("exclusive-video-single")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1686617758:
                if (str.equals("exclusive")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                ea3.n nVar = this.f332195u;
                nVar.f332169p = true;
                nVar.I(1);
                ea3.n nVar2 = this.f332195u;
                nVar2.f332170q = true;
                nVar2.f332171r = false;
                nVar2.x();
                return;
            case 1:
                ea3.n nVar3 = this.f332195u;
                nVar3.f332169p = false;
                nVar3.f332170q = false;
                nVar3.I(this.f332197w);
                ea3.n nVar4 = this.f332195u;
                nVar4.f332171r = true;
                nVar4.x();
                return;
            case 2:
                ea3.n nVar5 = this.f332195u;
                nVar5.f332169p = true;
                nVar5.f332170q = true;
                nVar5.I(this.f332197w);
                ea3.n nVar6 = this.f332195u;
                nVar6.f332171r = true;
                nVar6.x();
                return;
            case 3:
                ea3.n nVar7 = this.f332195u;
                nVar7.f332169p = true;
                nVar7.f332170q = false;
                nVar7.I(this.f332197w);
                ea3.n nVar8 = this.f332195u;
                nVar8.f332171r = true;
                nVar8.x();
                return;
            default:
                ea3.n nVar9 = this.f332195u;
                nVar9.f332169p = true;
                nVar9.I(1);
                ea3.n nVar10 = this.f332195u;
                nVar10.f332170q = true;
                nVar10.f332171r = false;
                nVar10.x();
                return;
        }
    }

    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "QueryMedia type:%d livePhoto:%b LivePhotoOsSupportLivePhoto:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f332200z), java.lang.Boolean.valueOf(this.A));
        if (this.D != null) {
            if (!this.f332188n || this.f332187m == null || c()) {
                ((t23.d) this.D).b(this.B, java.lang.Boolean.valueOf(this.f332200z && this.A));
            }
        }
    }

    public void b() {
        boolean wi6 = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).wi(this.f332182e);
        this.f332184g = wi6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart needReCheck:%b", java.lang.Boolean.valueOf(wi6));
        if (!this.f332184g) {
            android.view.View view = this.f332192r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (this.f332192r == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "init bottomGuidePermissionTipsView");
            android.view.ViewStub viewStub = (android.view.ViewStub) this.f332190p.findViewById(com.p314xaae8f345.mm.R.id.s_2);
            if (viewStub != null) {
                viewStub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.eip);
                android.view.View inflate = viewStub.inflate();
                this.f332192r = inflate;
                inflate.setOnClickListener(new ea3.u(this));
            }
        }
        android.view.View view2 = this.f332192r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "checkBottomPermissionTipsForOnlyCanShowMediaPart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean c() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, this.f332187m, new ea3.v(this))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getBusinessPermission true!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getBusinessPermission false!");
        this.f332188n = false;
        return true;
    }

    public final boolean d() {
        android.content.Context context;
        int i17;
        boolean Di;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context2 = getContext();
        ((sb0.f) jVar).getClass();
        if (zo.e.b(context2)) {
            Di = true;
        } else {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity activity = this.f332183f;
            java.lang.String[] strArr = {this.f332181d};
            java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht);
            if (android.os.Build.VERSION.SDK_INT < 33) {
                context = getContext();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o7f;
            } else {
                context = getContext();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o7a;
            }
            Di = ((sb0.f) jVar2).Di(activity, strArr, 145, string, context.getString(i17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkMediaStorageOnCreate: %b", java.lang.Boolean.valueOf(Di));
        return Di;
    }

    public final void e() {
        if (!this.f332188n || this.f332187m == null || c()) {
            if (i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: hadMediaStorage");
                o();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "checkPermissionAndQuery: not hadMediaStorage");
                p(java.lang.Boolean.TRUE);
            }
        }
    }

    public final java.util.Map g(int i17, int i18, long j17, int i19, int i27, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("width", java.lang.Integer.valueOf(i17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        hashMap.put("size", java.lang.Long.valueOf(j17));
        hashMap.put("duration", java.lang.Integer.valueOf(i19));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37652x913da09d, java.lang.Integer.valueOf(i27));
        hashMap.put("isGif", java.lang.Boolean.valueOf(z17));
        return hashMap;
    }

    public final java.util.Map h(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078;
            int round = (int) java.lang.Math.round(c15635xf0ea441b.f219979x / 1000);
            int i17 = c15635xf0ea441b.f219981z;
            int i18 = c15635xf0ea441b.f219980y;
            int i19 = c15635xf0ea441b.C;
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(abstractC15633xee433078.f219963e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video duration:%d width:%d height:%d framerate:%d size:%d", java.lang.Integer.valueOf(round), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(k17));
            return g(i17, i18, k17, round, i19, false);
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String o17 = abstractC15633xee433078.mo63659xfb85f7b0() == 6 ? abstractC15633xee433078.o() : abstractC15633xee433078.f219963e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(o17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "getItemInfo", "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)Ljava/util/Map;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "getItemInfo", "(Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;)Ljava/util/Map;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        int i27 = options.outWidth;
        int i28 = options.outHeight;
        long k18 = com.p314xaae8f345.mm.vfs.w6.k(o17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image width:%d height:%d size:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(k18));
        return g(i27, i28, k18, 0, 0, abstractC15633xee433078.f219971p.equalsIgnoreCase("image/gif"));
    }

    public boolean i() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, this.f332181d, true);
        this.f332186i = d17;
        return d17;
    }

    public void j() {
        android.view.View view = this.f332191q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "hideNoPermissioView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f332193s;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(0);
        }
    }

    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eiq, (android.view.ViewGroup) this, false);
        this.f332190p = inflate;
        addView(inflate, -1, -1);
        this.f332195u = new ea3.n(getContext(), this);
        this.f332191q = this.f332190p.findViewById(com.p314xaae8f345.mm.R.id.u_p);
        this.f332193s = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f332190p.findViewById(com.p314xaae8f345.mm.R.id.u_r);
        this.f332196v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.u_q);
        android.content.Context context = this.f332182e;
        this.f332194t = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22716xe73ca68f(context);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f332193s.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f332193s);
        }
        this.f332194t.mo82175x76516a27(this.f332193s);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22718xa7b47fcb) this.f332194t).q();
        addView(this.f332194t.mo82160xfb86a31b(), 0);
        this.f332193s.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16228x4d5e614a(getContext(), 4));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f332193s;
        e60.c1 c1Var = (e60.c1) i95.n0.c(e60.c1.class);
        android.content.Context context2 = getContext();
        ((d60.y) c1Var).getClass();
        android.content.res.Resources resources = context2.getResources();
        c1163xf1deaba4.N(new e33.h2(resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1z), resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1z), b3.l.m9702x7444d5ad(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn), true, new java.util.ArrayList(), 0, 0, null));
        this.f332195u.f332175v = this.N;
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (zo.e.b(context)) {
            ea3.l lVar = new ea3.l(2);
            this.f332195u.E(2);
            java.util.LinkedList linkedList = this.f332195u.f332167n;
            linkedList.remove(lVar);
            linkedList.add(lVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: add selectSystemMediaHeader");
        }
        ea3.n nVar = this.f332195u;
        nVar.f332166m = this.B;
        nVar.I(this.f332197w);
        this.f332195u.f332171r = true;
        m127214x931ccbd0(this.f332198x);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f332193s;
        ea3.n nVar2 = this.f332195u;
        nVar2.getClass();
        c1163xf1deaba42.mo7960x6cab2c8d(nVar2);
        b();
        ((d60.y) ((e60.c1) i95.n0.c(e60.c1.class))).getClass();
        t23.d dVar = new t23.d();
        this.D = dVar;
        e60.x0 x0Var = this.M;
        int i17 = this.B;
        e60.y0 y0Var = this.L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumMediaQueryServiceImpl", "setup: queryType=" + i17);
        dVar.f496658a = x0Var;
        dVar.f496659b = i17;
        dVar.f496661d = y0Var;
        this.f332186i = d();
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        this.A = qp.b.f447211e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "init checkMediaStorage[%b] LivePhotoOsSupportLivePhoto[%b]", java.lang.Boolean.valueOf(this.f332186i), java.lang.Boolean.valueOf(this.A));
        if (this.f332186i) {
            a(this.B);
        } else {
            this.f332193s.setVisibility(8);
        }
    }

    public final boolean l(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        java.util.Iterator it = this.H.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next()).f219963e.equals(abstractC15633xee433078.f219963e)) {
                return false;
            }
        }
        return true;
    }

    public void m(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onSelectItemChanged count:%d, position:%d selectPosition:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.util.ArrayList arrayList = this.f332195u.f332163g;
        if (i27 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i19);
            if (l(abstractC15633xee433078)) {
                java.util.ArrayList arrayList2 = this.H;
                arrayList2.add(abstractC15633xee433078);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList2.size()));
            }
        }
        n(arrayList);
    }

    public final void n(java.util.ArrayList arrayList) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", f(abstractC15633xee433078.mo63659xfb85f7b0()));
            java.lang.String str4 = "";
            if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
                java.lang.String str5 = abstractC15633xee433078.f219963e;
                ((yg0.u4) r3Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b17);
                str = b17.f264269e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video:%s", str);
            } else {
                boolean z17 = true;
                if (abstractC15633xee433078.mo63659xfb85f7b0() == 1) {
                    str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(abstractC15633xee433078.f219963e).f264269e;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image:%s", str);
                } else if (abstractC15633xee433078.mo63659xfb85f7b0() == 6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) abstractC15633xee433078;
                    if (c15632xfc4fd0d0.H == 1 && ((i17 = c15632xfc4fd0d0.A) == 1 || i17 == 0)) {
                        if (c15632xfc4fd0d0.G != 1) {
                            aq.u0 Ai = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).Ai(abstractC15633xee433078.f219967i, abstractC15633xee433078.f219963e, abstractC15633xee433078.f219966h, 0L);
                            boolean z18 = Ai.f94508a.f94493a;
                            c15632xfc4fd0d0.G = 1;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "livePhoto is no parse >> parse result :%b errCode: %s", java.lang.Boolean.valueOf(z18), Ai.m8808x9616526c());
                            z17 = z18;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "isParsedVideo == 1!");
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getVideoMetaData success");
                            zg0.r3 r3Var2 = (zg0.r3) i95.n0.c(zg0.r3.class);
                            java.lang.String str6 = abstractC15633xee433078.f219963e;
                            ((yg0.u4) r3Var2).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m4.b(str6);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().a(b18);
                            str3 = b18.f264269e;
                            str2 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(abstractC15633xee433078.f219966h).f264269e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s videolocal id is : %s", abstractC15633xee433078.f219963e, str2, str3);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "getVideoMetaData fail");
                            java.lang.String str7 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(abstractC15633xee433078.f219966h).f264269e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s", abstractC15633xee433078.f219966h, str7);
                            str2 = "";
                            str4 = str7;
                            str3 = str2;
                        }
                        java.lang.String str8 = str4;
                        str4 = str3;
                        str = str8;
                        hashMap.put("info", h(abstractC15633xee433078));
                        if (!str4.isEmpty() || str2.isEmpty()) {
                            hashMap.put(dm.i4.f66867x2a5c95c7, str);
                        } else {
                            hashMap.put(dm.i4.f66867x2a5c95c7, str2);
                            hashMap.put("videoLocalId", str4);
                        }
                        arrayList2.add(hashMap);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "live photo but not trigger the live state");
                        str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(abstractC15633xee433078.f219966h).f264269e;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "now filepath is : %s, local id is : %s", abstractC15633xee433078.f219966h, str);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "onSelectItemChangedEvent item no support type:%d", java.lang.Integer.valueOf(abstractC15633xee433078.mo63659xfb85f7b0()));
                }
            }
            str2 = "";
            hashMap.put("info", h(abstractC15633xee433078));
            if (str4.isEmpty()) {
            }
            hashMap.put(dm.i4.f66867x2a5c95c7, str);
            arrayList2.add(hashMap);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("selectedItems", arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81 c16227xc3198c81 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16227xc3198c81) this.F;
        c16227xc3198c81.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumView", "onSelectedItemsChanged" + hashMap2);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = c16227xc3198c81.f225654e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onSelectedItemsChanged", hashMap2);
        }
    }

    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "showGalleryAfterPermissionRequestSuccess: ");
        j();
        b();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (zo.e.b(this.f332182e)) {
            ea3.l lVar = new ea3.l(2);
            ea3.n nVar = this.f332195u;
            if (nVar != null) {
                nVar.E(2);
                java.util.LinkedList linkedList = this.f332195u.f332167n;
                linkedList.remove(lVar);
                linkedList.add(lVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: add selectSystemMediaHeader");
        } else {
            ea3.n nVar2 = this.f332195u;
            if (nVar2 != null) {
                nVar2.E(2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "initView: delete selectSystemMediaHeader");
        }
        a(this.B);
    }

    public void p(java.lang.Boolean bool) {
        java.lang.String string;
        if (this.f332191q == null || this.f332193s == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "[showNoPermissionView] view found null, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "showNoPermissionView: from sys=%b", bool);
        android.view.View view = this.f332191q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumViewImpl", "showNoPermissionView", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f332193s.setVisibility(8);
        android.widget.TextView textView = (android.widget.TextView) this.f332191q.findViewById(com.p314xaae8f345.mm.R.id.f564417qr);
        android.widget.TextView textView2 = (android.widget.TextView) this.f332191q.findViewById(com.p314xaae8f345.mm.R.id.f564418qs);
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        if (bool.booleanValue()) {
            textView.setText(android.os.Build.VERSION.SDK_INT < 33 ? com.p314xaae8f345.mm.R.C30867xcad56011.o7e : com.p314xaae8f345.mm.R.C30867xcad56011.o7d);
            textView2.setOnClickListener(new ea3.s(this));
            return;
        }
        d85.f0 f0Var = this.f332187m;
        java.lang.String str = f0Var == null ? "" : f0Var.f308709d;
        java.lang.String str2 = null;
        if (android.os.Build.VERSION.SDK_INT < 33) {
            android.content.Context context = getContext();
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            if (str != null && (str2 = (java.lang.String) e85.i.f331851d.get(str)) == null) {
                str2 = "";
            }
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7b, str2 != null ? str2 : "");
        } else {
            android.content.Context context2 = getContext();
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            if (str != null && (str2 = (java.lang.String) e85.i.f331851d.get(str)) == null) {
                str2 = "";
            }
            string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o7c, str2 != null ? str2 : "");
        }
        textView.setText(string);
        textView2.setOnClickListener(new ea3.t(this));
    }

    public final void q(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2;
        int i17;
        ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
        if (t23.p0.l() != null) {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            arrayList2 = new java.util.ArrayList(t23.p0.l());
        } else {
            arrayList2 = this.f332195u.f332162f;
        }
        if (arrayList == null || this.f332195u == null) {
            return;
        }
        int i18 = 0;
        x.d dVar = new x.d(0);
        for (int i19 = 0; i19 < this.f332195u.f332163g.size(); i19++) {
            int indexOf = this.f332195u.f332162f.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f332195u.f332163g.get(i19));
            if (indexOf != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf));
            }
        }
        java.util.ArrayList arrayList3 = this.f332195u.f332163g;
        arrayList3.clear();
        if (arrayList2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "setSelectedMediaPaths but null");
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                int indexOf2 = arrayList2.indexOf(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(0, 0L, str, "", ""));
                if (indexOf2 >= 0) {
                    arrayList3.add((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(indexOf2));
                } else {
                    if (str != null && arrayList2.size() > 0) {
                        i17 = 0;
                        while (i17 < arrayList2.size()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(i17);
                            if (abstractC15633xee433078.getClass() == com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0.class && abstractC15633xee433078.o().equals(str)) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                    i17 = -1;
                    if (i17 >= 0) {
                        arrayList3.add((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(i17));
                    } else {
                        java.lang.String c17 = q75.g.c(str);
                        if (str.toLowerCase().endsWith("mp4")) {
                            arrayList3.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, 0L, str, "", ""));
                        } else {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                                c17 = "";
                            }
                            arrayList3.add(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(1, 0L, str, "", c17));
                        }
                    }
                }
            }
        }
        ea3.n nVar = this.f332195u;
        while (true) {
            java.util.ArrayList arrayList4 = nVar.f332163g;
            if (i18 >= arrayList4.size()) {
                break;
            }
            int indexOf3 = nVar.f332162f.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList4.get(i18));
            if (indexOf3 != -1) {
                dVar.add(java.lang.Integer.valueOf(indexOf3));
            }
            i18++;
        }
        java.util.Iterator it6 = dVar.iterator();
        while (it6.hasNext()) {
            nVar.m8147xed6e4d18(((java.lang.Integer) it6.next()).intValue() + nVar.y());
        }
        java.util.ArrayList arrayList5 = this.f332195u.f332163g;
        java.util.Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it7.next();
            if (l(abstractC15633xee4330782)) {
                java.util.ArrayList arrayList6 = this.H;
                arrayList6.add(abstractC15633xee4330782);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList6.size()));
            }
        }
        n(arrayList5);
    }

    public void r() {
        java.util.LinkedList linkedList = this.K;
        linkedList.clear();
        java.util.Iterator it = this.f332180J.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
            int i17 = this.C;
            boolean z17 = true;
            if (i17 != 3 && i17 != mo63659xfb85f7b0 && (i17 != 1 || mo63659xfb85f7b0 != 6)) {
                z17 = false;
            }
            if (z17) {
                linkedList.add(abstractC15633xee433078);
            }
        }
    }

    /* renamed from: setBusiness */
    public void m127215x32375e42(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setBusiness:%d", java.lang.Integer.valueOf(i17));
        for (d85.f0 f0Var : d85.f0.m123703xcee59d22()) {
            int i18 = f0Var.f308710e;
            if (i18 == i17) {
                this.f332187m = f0Var;
                this.f332188n = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "business matched! %d %s", java.lang.Integer.valueOf(i18), this.f332187m.f308709d);
                return;
            }
        }
        this.f332188n = false;
    }

    /* renamed from: setLivePhoto */
    public void m127216x970c8264(boolean z17) {
        this.f332200z = z17;
        if (this.f332195u != null) {
            this.f332185h = true;
            this.I = true;
            if (this.f332186i) {
                a(this.B);
            }
        }
    }

    /* renamed from: setPreview */
    public void m127217x9e476d06(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setPreview:%s", str);
        this.f332199y = str;
    }

    /* renamed from: setQueryMode */
    public void m127218xf00b5449(java.lang.String str) {
        this.f332198x = str;
        if (this.f332195u != null) {
            m127214x931ccbd0(str);
        }
    }

    /* renamed from: setQueryType */
    public void m127219xf00ea9e0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setQueryType %d", java.lang.Integer.valueOf(i17));
        this.B = i17;
        ea3.n nVar = this.f332195u;
        if (nVar != null) {
            nVar.f332166m = i17;
            this.f332185h = true;
            this.I = true;
            if (this.f332186i) {
                a(i17);
            }
        }
    }

    /* renamed from: setSelectLimitCount */
    public void m127220xf58734b2(int i17) {
        if (this.f332195u != null && !"single".equals(this.f332198x)) {
            this.f332195u.I(i17);
        }
        this.f332197w = i17;
    }

    /* renamed from: setSelectedIds */
    public void m127221x7d601c5b(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(new java.util.LinkedHashSet(arrayList));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).isEmpty()) {
                it.remove();
            }
        }
        java.util.Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            if (((java.lang.String) it6.next()).startsWith("liteappLocalId")) {
                it6.remove();
            }
        }
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            java.lang.String str = (java.lang.String) it7.next();
            int i17 = 0;
            while (true) {
                arrayList2 = this.H;
                if (i17 >= arrayList2.size()) {
                    i17 = -1;
                    break;
                } else if (str.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(i17)).f219963e)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList3.add((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(i17));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setSelectedIds: " + java.util.Arrays.toString(arrayList3.toArray()));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        ea3.n nVar = this.f332195u;
        if (nVar != null) {
            java.util.ArrayList arrayList6 = nVar.f332163g;
            arrayList6.clear();
            arrayList6.addAll(arrayList3);
            nVar.m8146xced61ae5();
            arrayList5 = this.f332195u.f332163g;
        }
        n(arrayList5);
    }

    /* renamed from: setShowType */
    public void m127222x6260b659(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "setShowType:%d", java.lang.Integer.valueOf(i17));
        this.C = i17;
        if (this.f332195u != null) {
            r();
            ea3.n nVar = this.f332195u;
            java.util.LinkedList linkedList = this.K;
            java.util.ArrayList arrayList = nVar.f332162f;
            arrayList.clear();
            arrayList.addAll(linkedList);
            nVar.m8146xced61ae5();
        }
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onQueryMediaFinished size:%d", java.lang.Integer.valueOf(linkedList.size()));
    }
}
