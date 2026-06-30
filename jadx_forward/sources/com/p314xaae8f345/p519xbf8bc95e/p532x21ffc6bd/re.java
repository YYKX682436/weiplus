package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class re {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f132678a = "tileOverlay";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f132679b = "getTile";

    /* renamed from: c, reason: collision with root package name */
    public static final int f132680c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f132681d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f132682e = 100;

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f132683j = "x";

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f132684k = "y";

    /* renamed from: l, reason: collision with root package name */
    private static final java.lang.String f132685l = "z";

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f132686f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz> f132687g = new java.util.Hashtable(4);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132688h;

    /* renamed from: i, reason: collision with root package name */
    final java.lang.String f132689i;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rg f132690m;

    /* renamed from: n, reason: collision with root package name */
    private final android.content.Context f132691n;

    public re(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        this.f132691n = context;
        this.f132688h = neVar;
        this.f132686f = neVar.f132039f;
        this.f132689i = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b().getPath();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne b() {
        return this.f132688h;
    }

    private boolean c() {
        return this.f132686f.v();
    }

    private void d() {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz> map = this.f132687g;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar : (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz[]) this.f132687g.values().toArray(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz[this.f132687g.keySet().size()])) {
            qzVar.mo36414xc84af884();
        }
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz a(int i17) {
        if (i17 >= 0) {
            return this.f132687g.get(java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    private android.content.Context a() {
        return this.f132691n;
    }

    private void c(int i17) {
        if (this.f132686f == null) {
            return;
        }
        this.f132687g.remove(java.lang.Integer.valueOf(i17));
        this.f132686f.f(i17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, this.f132688h.K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if ((r1 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sq) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c r5) {
        /*
            r4 = this;
            com.tencent.mapsdk.internal.qz r0 = r4.a(r5)
            if (r5 == 0) goto L17
            com.tencent.tencentmap.mapsdk.maps.model.TileProvider r1 = r5.m100003x4638c135()
            if (r1 == 0) goto L17
            boolean r2 = r1 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ro
            r3 = 0
            if (r2 == 0) goto L12
            goto L18
        L12:
            boolean r1 = r1 instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sq
            if (r1 == 0) goto L17
            goto L18
        L17:
            r3 = 1
        L18:
            if (r3 == 0) goto L29
            if (r0 == 0) goto L29
            if (r5 == 0) goto L29
            int r1 = r5.m100002x41a9136e()
            int r5 = r5.m100000x83d90780()
            r0.a(r1, r5)
        L29:
            com.tencent.mapsdk.internal.ne r5 = r4.f132688h
            int r5 = r5.K
            java.lang.String r1 = "TTO"
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(r1, r5)
            com.tencent.mapsdk.internal.ay r5 = new com.tencent.mapsdk.internal.ay
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re.b(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions):com.tencent.tencentmap.mapsdk.maps.model.TileOverlay");
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar) {
        int i17;
        if (qzVar == null || (i17 = qzVar.f132665p) <= 0) {
            return;
        }
        this.f132687g.put(java.lang.Integer.valueOf(i17), qzVar);
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        if (this.f132690m == null) {
            this.f132690m = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rg(this);
        }
        return this.f132690m.a(c26089x9c7ff29c);
    }

    private void a(boolean z17) {
        this.f132686f.j(z17);
    }

    private int a(com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407 interfaceC4232xedf03407, boolean z17, boolean z18, int i17) {
        if (this.f132686f == null) {
            return -1;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, this.f132688h.K);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132686f;
        return ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17(interfaceC4232xedf03407, z17, z18, i17), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17) (-1))).intValue();
    }

    public final void b(int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132686f;
        if (tkVar == null) {
            return;
        }
        tkVar.b(i17, i18, i19);
    }

    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132686f;
        if (tkVar == null) {
            return;
        }
        tkVar.g(i17);
    }

    public final void a(int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132686f;
        if (tkVar == null) {
            return;
        }
        tkVar.b(i17, i18);
    }

    public final void a(int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f132686f;
        if (tkVar == null) {
            return;
        }
        tkVar.a(i17, i18, i19);
    }

    public final byte[] a(java.lang.String str) {
        int a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz qzVar;
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(parse.getAuthority(), f132679b) || (a17 = a(parse)) == -1 || (qzVar = this.f132687g.get(java.lang.Integer.valueOf(a17))) == null) {
                return null;
            }
            int a18 = a(parse, f132683j);
            int a19 = a(parse, f132684k);
            int a27 = a(parse, f132685l);
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = qzVar.f132667r;
            if (c26089x9c7ff29c != null && c26089x9c7ff29c.m100003x4638c135() != null && a27 >= 0) {
                java.lang.String format = java.lang.String.format(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz.f132660b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(qzVar.f132667r.m100004x2e41070()), java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(a19), java.lang.Integer.valueOf(a27));
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce mo36666xfb85bb24 = qzVar.f132667r.m100003x4638c135().mo36666xfb85bb24(a18, a19, a27);
                if (mo36666xfb85bb24 != null && mo36666xfb85bb24 != com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce.f49783xdf8baa80) {
                    byte[] bArr = mo36666xfb85bb24.f49784x62065b7;
                    if (bArr != null && bArr.length > 0) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "cacheId", (java.lang.Object) format, qzVar.f132669t);
                        qzVar.a(format, bArr);
                    }
                    return bArr;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "Provider没有瓦片数据，返回空瓦块");
                byte[] a28 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a();
                qzVar.a(format, a28);
                return a28;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "无效坐标，返回空瓦块");
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
            return null;
        }
    }

    private static int a(android.net.Uri uri) {
        java.lang.String lastPathSegment;
        if (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(lastPathSegment);
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
            return -1;
        }
    }

    private static int a(android.net.Uri uri, java.lang.String str) {
        if (uri == null) {
            return -1;
        }
        try {
            return java.lang.Integer.parseInt(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
            return -1;
        }
    }

    private static void a(android.content.Context context) {
        java.io.File[] listFiles;
        if (context == null) {
            return;
        }
        java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b().getPath() + "/tile/");
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.io.File file2 : listFiles) {
            if (currentTimeMillis - file2.lastModified() > java.util.concurrent.TimeUnit.DAYS.toMillis(7L)) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2);
            }
        }
    }
}
