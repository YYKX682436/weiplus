package fa3;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: J, reason: collision with root package name */
    public static fa3.b f342247J;
    public static final java.lang.Object K = new java.lang.Object();
    public java.util.Map A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g B;
    public android.view.View E;
    public android.view.TextureView F;
    public android.util.Size H;

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f342248a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f342249b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f342250c;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 f342257j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f342258k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f342259l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f342260m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f342261n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f342262o;

    /* renamed from: p, reason: collision with root package name */
    public float f342263p;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342251d = "back";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342252e = "auto";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f342253f = ya.b.f77490x87518375;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f342254g = "normal";

    /* renamed from: h, reason: collision with root package name */
    public int f342255h = 1080;

    /* renamed from: i, reason: collision with root package name */
    public int f342256i = 1920;

    /* renamed from: q, reason: collision with root package name */
    public boolean f342264q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f342265r = -1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f342266s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f342267t = false;

    /* renamed from: u, reason: collision with root package name */
    public long f342268u = -1;

    /* renamed from: v, reason: collision with root package name */
    public long f342269v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f342270w = true;

    /* renamed from: x, reason: collision with root package name */
    public long f342271x = 30;

    /* renamed from: y, reason: collision with root package name */
    public wu5.c f342272y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f342273z = false;
    public final java.util.Set C = new java.util.HashSet();
    public boolean D = true;
    public boolean G = false;
    public boolean I = false;

    public static void a(fa3.b bVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashMap.put("error", "stopRecord file not exist");
            gVar.a(hashMap);
            return;
        }
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        bVar.c(ai3.d.p(str), bVar.f342261n);
        bVar.f342260m = str;
        hashMap.put("tempThumbPath", bVar.f342261n);
        hashMap.put("tempVideoPath", bVar.f342260m);
        hashMap.put("timeout", java.lang.Boolean.valueOf(bVar.I));
        if (bVar.I) {
            gVar.e(hashMap);
        } else {
            gVar.a(hashMap);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "tempThumbPath:%s", bVar.f342261n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "tempVideoPath:%s", bVar.f342260m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "timeout:%s", java.lang.Boolean.valueOf(bVar.I));
        java.util.HashSet hashSet = (java.util.HashSet) bVar.C;
        hashSet.add(bVar.f342260m);
        hashSet.add(bVar.f342261n);
    }

    public static fa3.b e() {
        fa3.b bVar;
        synchronized (K) {
            if (f342247J == null) {
                f342247J = new fa3.b();
                ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.n) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.n.class))).wi();
            }
            bVar = f342247J;
        }
        return bVar;
    }

    public void b(boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCameraManager destroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = this.f342257j;
        if (c16529x1336da53 != null) {
            c16529x1336da53.m66795x54cde6fb(null);
            this.f342257j.m66794x2ec5a399(null);
            kt3.n nVar = (kt3.n) this.f342257j.f230365d;
            kt3.l lVar = nVar.f393540d;
            if (lVar != null) {
                lVar.mo9065x41012807();
            }
            nVar.f393549p = null;
            this.f342257j = null;
            if (this.F != null) {
                this.f342249b.removeView(this.E);
                this.F = null;
                this.E = null;
            }
            this.f342265r = -1;
            this.f342263p = 0.0f;
            this.f342264q = false;
            this.f342266s = false;
            this.f342267t = false;
            this.f342270w = true;
            this.f342271x = 30L;
            this.f342272y = null;
            this.f342273z = false;
            this.A = null;
            this.B = null;
            this.D = true;
        }
        this.f342249b = null;
        this.f342248a = null;
        if (!z17 || (str = this.f342258k) == null || str.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "delete temp saved files in :%s", this.f342258k);
        java.util.HashSet hashSet = (java.util.HashSet) this.C;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2 != null && !str2.isEmpty()) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2));
                if (r6Var.m()) {
                    r6Var.l();
                }
            }
        }
        hashSet.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r2 > 100) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.graphics.Bitmap r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.LiteAppCameraManager"
            r1 = 0
            if (r8 == 0) goto L8e
            boolean r2 = r8.isRecycled()
            if (r2 != 0) goto L8e
            r8.getWidth()     // Catch: java.lang.Exception -> L80
            r8.getHeight()     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = "normal"
            java.lang.String r3 = r7.f342254g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L80
            r3 = 1
            if (r2 == 0) goto L1f
            r2 = 44
            goto L57
        L1f:
            java.lang.String r2 = "low"
            java.lang.String r4 = r7.f342254g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L2c
            r2 = 25
            goto L57
        L2c:
            java.lang.String r2 = "original"
            java.lang.String r4 = r7.f342254g     // Catch: java.lang.Exception -> L80
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L80
            r4 = 100
            if (r2 == 0) goto L3a
        L38:
            r2 = r4
            goto L57
        L3a:
            java.lang.String r2 = r7.f342254g     // Catch: java.lang.Exception -> L4a
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L4a
            r5 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r5
            int r2 = (int) r2
            if (r2 >= 0) goto L47
            r2 = r1
        L47:
            if (r2 <= r4) goto L57
            goto L38
        L4a:
            java.lang.String r2 = "mQuality %s is illegal"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L80
            java.lang.String r5 = r7.f342254g     // Catch: java.lang.Exception -> L80
            r4[r1] = r5     // Catch: java.lang.Exception -> L80
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2, r4)     // Catch: java.lang.Exception -> L80
            r2 = 90
        L57:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L80
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r8, r2, r4, r9, r3)     // Catch: java.lang.Exception -> L80
            java.lang.String r8 = "bitmap filelenth %s"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L80
            long r5 = com.p314xaae8f345.mm.vfs.w6.k(r9)     // Catch: java.lang.Exception -> L80
            java.lang.Long r9 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L80
            r4[r1] = r9     // Catch: java.lang.Exception -> L80
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8, r4)     // Catch: java.lang.Exception -> L80
            java.lang.String r8 = "mQuality:%s, quality:%d"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Exception -> L80
            java.lang.String r4 = r7.f342254g     // Catch: java.lang.Exception -> L80
            r9[r1] = r4     // Catch: java.lang.Exception -> L80
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L80
            r9[r3] = r2     // Catch: java.lang.Exception -> L80
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8, r9)     // Catch: java.lang.Exception -> L80
            return r3
        L80:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "error for saveBitmapToImage %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r9, r8)
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.b.c(android.graphics.Bitmap, java.lang.String):boolean");
    }

    public void d(final android.content.Context context, java.lang.String str, android.view.ViewGroup viewGroup, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658, java.util.Map map, final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        int width;
        int height;
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.n) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.n.class))).wi();
        this.f342249b = viewGroup;
        this.f342248a = context;
        this.f342250c = str;
        f(map);
        android.content.Context context2 = this.f342248a;
        if (context2 instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) this.f342248a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            width = displayMetrics.widthPixels;
            height = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context2.getSystemService("window")).getDefaultDisplay();
            width = defaultDisplay.getWidth();
            height = defaultDisplay.getHeight();
        }
        this.H = new android.util.Size(width, height);
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.CAMERA", 16, "", "", new j35.b0() { // from class: fa3.b$$b
            @Override // j35.b0
            /* renamed from: onRequestPermissionsResult */
            public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
                fa3.b bVar = fa3.b.this;
                bVar.getClass();
                int i18 = iArr[0];
                if (i18 == 0) {
                    if (i18 == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "get camera permission granted");
                    }
                } else {
                    final android.content.Context context3 = context;
                    db5.e1.C(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbo), context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbm), context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbp), context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: fa3.b$$c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                            dialogInterface.dismiss();
                            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                            j35.u.g(context3);
                        }
                    }, new fa3.DialogInterfaceOnClickListenerC28327x2d1842());
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("error", "camera permission denied");
                    gVar.f(hashMap);
                    bVar.D = false;
                }
            }
        })) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "do not have camera permission");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "initalizeCamera");
        i();
        if (this.f342257j == null) {
            android.graphics.SurfaceTexture mo138117x299653ae = interfaceC28980x1159d658.mo138022xdee757ca().mo138117x299653ae();
            this.f342257j = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.view.Surface(mo138117x299653ae), this.f342255h, this.f342256i);
            android.view.View inflate = android.view.LayoutInflater.from(this.f342248a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570748dv0, (android.view.ViewGroup) null);
            this.E = inflate;
            android.view.TextureView textureView = (android.view.TextureView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o5m);
            this.F = textureView;
            textureView.setSurfaceTexture(mo138117x299653ae);
            this.f342249b.addView(this.E);
        }
        if (!this.G) {
            this.f342249b.setOnTouchListener(new fa3.e(this));
        }
        this.f342262o = false;
        l();
        ((kt3.n) this.f342257j.f230365d).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRecordViewImpl", "set34PreviewVideoSize");
        this.f342257j.m66788xf6c2fdeb((this.f342255h * 1.0f) / this.f342256i);
        this.f342257j.m66796x234227c9(1);
        this.f342257j.d(600000, 4800000, 30, 64000, 44100);
        this.f342257j.m66800x1474a01a(this.f342260m);
        this.f342257j.m66786x6da83fed(true);
        this.f342257j.m66787x84a70c6a(true);
        this.f342257j.m66789xac31fcad(this.H);
        this.f342257j.m66799x6e2af291("back".equals(this.f342251d));
        this.f342257j.m66795x54cde6fb(new fa3.f(this, gVar));
        this.f342257j.m66794x2ec5a399(new fa3.g(this, gVar));
        this.f342257j.f();
        this.f342257j.f230365d.getClass();
        this.f342265r = 1;
    }

    public void f(java.util.Map map) {
        if (map.containsKey("width")) {
            this.f342255h = ik1.w.c((int) java.lang.Math.round(java.lang.Double.parseDouble(map.get("width").toString())));
        }
        if (map.containsKey("height")) {
            this.f342256i = ik1.w.c((int) java.lang.Math.round(java.lang.Double.parseDouble(map.get("height").toString())));
        }
        if (map.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1)) {
            this.f342253f = map.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54473x7fe978e1).toString();
        }
        if (map.containsKey(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa)) {
            this.f342251d = map.get(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15509x87ec77fa).toString();
        }
        if (map.containsKey("flash")) {
            this.f342252e = map.get("flash").toString();
        }
        if (map.containsKey("forbidGesture")) {
            java.lang.Object obj = map.get("forbidGesture");
            if (obj instanceof java.lang.Boolean) {
                this.G = ((java.lang.Boolean) obj).booleanValue();
            }
        }
    }

    public void g(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera stopRecord");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (this.f342257j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "recordView is null");
            hashMap.put("error", "recordView is null");
            gVar.a(hashMap);
            return;
        }
        if (this.f342265r == 2) {
            if (this.f342267t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "recordView is IsStopping");
                hashMap.put("error", "is IsStopping");
                gVar.a(hashMap);
                return;
            } else {
                if (map.containsKey("compressed")) {
                    this.f342264q = ((java.lang.Boolean) map.get("compressed")).booleanValue();
                }
                this.f342267t = true;
                this.f342257j.h(new fa3.m(this, hashMap, gVar));
                return;
            }
        }
        if (!this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppCameraManager", "stopRecord is not recording");
            hashMap.put("error", "is not recording, can not stop");
            gVar.a(hashMap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppCameraManager", "has timeout just return path");
            hashMap.put("tempThumbPath", this.f342261n);
            hashMap.put("tempVideoPath", this.f342260m);
            hashMap.put("timeout", java.lang.Boolean.TRUE);
            gVar.a(hashMap);
            this.I = false;
        }
    }

    public final void h() {
        java.lang.String str;
        if (this.f342257j == null || (str = this.f342252e) == null) {
            return;
        }
        if (str.equals("auto")) {
            this.f342257j.m66792x175c5771(3);
            return;
        }
        if (this.f342252e.equals("torch")) {
            this.f342257j.m66792x175c5771(1);
            return;
        }
        if (!this.f342252e.equals("on")) {
            this.f342257j.m66792x175c5771(2);
        } else if (this.f342265r == 2 || !this.f342252e.equals("on")) {
            this.f342257j.m66792x175c5771(1);
        } else {
            this.f342257j.m66792x175c5771(2);
        }
    }

    public final void i() {
        java.lang.String str = this.f342258k;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(this.f342250c, null, null) + "LiteAppCamera";
            this.f342258k = str2;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
        }
        java.lang.String str4 = "MicroMsg_" + java.lang.System.currentTimeMillis();
        this.f342260m = this.f342258k + "/" + str4 + ".mp4";
        this.f342261n = this.f342258k + "/" + str4 + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        if (com.p314xaae8f345.mm.vfs.w6.j(this.f342260m)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.e(this.f342260m);
    }

    public void j(final java.util.Map map, final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        final android.content.Context context = this.f342248a;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(context, "android.permission.RECORD_AUDIO", 80, "", "", new j35.b0() { // from class: fa3.b$$a
            @Override // j35.b0
            /* renamed from: onRequestPermissionsResult */
            public final void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
                fa3.b bVar = fa3.b.this;
                bVar.getClass();
                int i18 = iArr[0];
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar2 = gVar;
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "get microphone permission granted");
                    bVar.f342273z = true;
                    bVar.A = map;
                    bVar.B = gVar2;
                    return;
                }
                final android.content.Context context2 = context;
                db5.e1.C(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbq), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbn), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbp), context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mbl), false, new android.content.DialogInterface.OnClickListener() { // from class: fa3.b$$e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        dialogInterface.dismiss();
                        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                        j35.u.g(context2);
                    }
                }, new fa3.DialogInterfaceOnClickListenerC28329x2d1844());
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("error", "microPhone permission denied");
                gVar2.e(hashMap);
                bVar.D = false;
            }
        })) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera startRecord");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f342257j == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "recordView is null");
                hashMap.put("error", "recordView is null");
                gVar.e(hashMap);
                return;
            }
            if (this.f342265r == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "camera is already recording, can not takePhoto twice");
                hashMap.put("error", "camera is already recording");
                gVar.e(hashMap);
                return;
            }
            if (!this.f342262o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "take photo err, isn't init done");
                hashMap.put("error", "camera has not initDone");
                gVar.e(hashMap);
                return;
            }
            if (map.containsKey("selfieMirror")) {
                this.f342270w = ((java.lang.Boolean) map.get("selfieMirror")).booleanValue();
            }
            if (map.containsKey("timeout")) {
                this.f342271x = java.lang.Long.parseLong(map.get("timeout").toString());
            }
            this.f342257j.g(this.f342270w, false);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f342269v = android.os.SystemClock.elapsedRealtime();
            this.f342265r = 2;
            ku5.u0 u0Var = ku5.t0.f394148d;
            fa3.k kVar = new fa3.k(this, map, gVar);
            long j17 = this.f342271x * 1000;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            this.f342272y = t0Var.z(kVar, j17, false);
            hashMap.put("tempThumbPath", this.f342261n);
            hashMap.put("tempVideoPath", this.f342260m);
            gVar.e(hashMap);
            this.I = false;
        }
    }

    public void k(java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        wu5.c cVar = this.f342272y;
        if (cVar != null) {
            cVar.cancel(false);
        }
        long j17 = this.f342269v;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 1500) {
            g(map, gVar);
            return;
        }
        long j18 = 1500 - elapsedRealtime;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "stopRecord in %d ms later", java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new fa3.l(this, map, gVar), j18);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f342253f
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            r1 = 720(0x2d0, float:1.009E-42)
            if (r0 != 0) goto L4b
            java.lang.String r0 = r5.f342253f
            int r2 = r0.hashCode()
            r3 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            r4 = 1
            if (r2 == r3) goto L35
            r3 = 107348(0x1a354, float:1.50427E-40)
            if (r2 == r3) goto L2b
            r3 = 3202466(0x30dda2, float:4.48761E-39)
            if (r2 == r3) goto L21
            goto L3f
        L21:
            java.lang.String r2 = "high"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L2b:
            java.lang.String r2 = "low"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L35:
            java.lang.String r2 = "medium"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3f
            r0 = 2
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L48
            if (r0 == r4) goto L45
            goto L4b
        L45:
            r0 = 480(0x1e0, float:6.73E-43)
            goto L4a
        L48:
            r0 = 1080(0x438, float:1.513E-42)
        L4a:
            r1 = r0
        L4b:
            com.tencent.mm.plugin.mmsight.api.MMSightRecordView r0 = r5.f342257j
            r0.m66797x14794dd4(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.b.l():void");
    }
}
