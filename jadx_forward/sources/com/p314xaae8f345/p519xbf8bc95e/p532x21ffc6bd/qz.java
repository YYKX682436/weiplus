package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class qz extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po implements com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407 {

    /* renamed from: b, reason: collision with root package name */
    static final java.lang.String f132660b = "%s" + java.io.File.separatorChar + "%d-%d-%d";

    /* renamed from: d, reason: collision with root package name */
    static final java.lang.String f132661d = "/tile/";

    /* renamed from: u, reason: collision with root package name */
    private static final java.lang.String f132662u = "GLTileOverlay";

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f132663v = false;

    /* renamed from: w, reason: collision with root package name */
    private static final long f132664w = 1024;
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb A;

    /* renamed from: p, reason: collision with root package name */
    public int f132665p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re f132666q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c f132667r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> f132668s;

    /* renamed from: t, reason: collision with root package name */
    final int f132669t;

    /* renamed from: x, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.Integer> f132670x;

    /* renamed from: y, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw f132671y;

    /* renamed from: z, reason: collision with root package name */
    private java.util.concurrent.BlockingQueue<java.lang.Runnable> f132672z;

    public qz(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c) {
        super((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az) reVar.f132688h.f130532b);
        this.f132670x = new java.util.concurrent.ConcurrentHashMap();
        this.A = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb() { // from class: com.tencent.mapsdk.internal.qz.1
            @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
            public final void a(java.lang.String str, byte[] bArr) {
                super.a(str, bArr);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz.this.f132666q.f132688h;
                if (neVar == null) {
                    return;
                }
                neVar.f132039f.a(str, bArr);
            }

            @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mb, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
            public final void b(java.lang.String str) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz.this.f132671y;
                if (lwVar != null) {
                    com.tencent.mapsdk.internal.lw.a aVar = lwVar.f131912a.get(str);
                    java.lang.Runnable runnable = aVar != null ? aVar.f131926a : null;
                    if (runnable != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz.this.f132672z.remove(runnable);
                    }
                }
            }
        };
        this.f132669t = reVar.f132688h.K;
        this.f132666q = reVar;
        this.f132667r = c26089x9c7ff29c;
        int i17 = -1;
        if (c26089x9c7ff29c == null) {
            this.f132665p = -1;
            return;
        }
        this.f132668s = f();
        boolean m100007x54ff3b34 = c26089x9c7ff29c.m100007x54ff3b34();
        boolean m100008x3fbad538 = c26089x9c7ff29c.m100008x3fbad538();
        int m99997x3c6a8001 = c26089x9c7ff29c.m99997x3c6a8001();
        if (reVar.f132686f != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, reVar.f132688h.K);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = reVar.f132686f;
            i17 = ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17(this, m100007x54ff3b34, m100008x3fbad538, m99997x3c6a8001), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass17) (-1))).intValue();
        }
        this.f132665p = i17;
        if (i17 > 0) {
            reVar.a(i17, c26089x9c7ff29c.m100001x11a8fe3e(), c26089x9c7ff29c.m99998xf561d36c());
        }
        a(c26089x9c7ff29c.m100005x397e976e());
    }

    private int h() {
        return this.f132665p;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re i() {
        return this.f132666q;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26090xef1182df j() {
        return this.f132667r.m100003x4638c135();
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rd k() {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rd(this.f132666q);
    }

    private void l() {
        a(true);
    }

    private void m() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> jyVar = this.f132668s;
        if (jyVar == null) {
            return;
        }
        if (jyVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kb) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy a17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kb) jyVar).a(0);
            if (a17 instanceof com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1) {
                a17.b();
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy a18 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kb) this.f132668s).a(1);
            if (a18 instanceof com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5) {
                ((com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5) a18).f();
            }
        } else if (jyVar instanceof com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1) {
            jyVar.b();
        }
        this.f132670x.clear();
    }

    public int b(int i17) {
        return i17 + 100;
    }

    public final synchronized com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw d() {
        if (this.f132671y == null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw();
            this.f132671y = lwVar;
            lwVar.a(this.A);
            java.util.concurrent.ThreadPoolExecutor c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.c();
            this.f132672z = c17.getQueue();
            this.f132671y.f131913b = c17;
        }
        return this.f132671y;
    }

    public final void e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> jyVar = this.f132668s;
        if (jyVar == null) {
            return;
        }
        jyVar.b();
        this.f132670x.clear();
    }

    /* renamed from: equals */
    public boolean m36944xb2c87fbf(java.lang.Object obj) {
        return obj != null && (obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz) && this.f132665p == ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz) obj).f132665p;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> f() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c;
        if (this.f132666q == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a aVar = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4384xb667a2e1.a(this.f132669t);
        aVar.f130276d = false;
        aVar.f130274b = this.f132667r.m99999x34876694(this.f132666q.f132688h);
        aVar.f130275c = new com.tencent.mapsdk.internal.qz.a((byte) 0);
        if (android.text.TextUtils.isEmpty(this.f132666q.f132689i) || (c26089x9c7ff29c = this.f132667r) == null || android.text.TextUtils.isEmpty(c26089x9c7ff29c.m99996x13c02cde())) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(this.f132669t, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb.class, aVar);
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c cVar = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c(this.f132669t);
        if (!android.text.TextUtils.isEmpty(g())) {
            cVar.c();
        }
        java.lang.String str = g() + this.f132667r.m99996x13c02cde();
        cVar.f130260c = new java.io.File(this.f132666q.f132689i);
        cVar.f130261d = str;
        cVar.f131607k = -1;
        cVar.f131608l = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ra();
        cVar.f130262e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rc(this.f132666q.f132689i + java.io.File.separator + str);
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(this.f132669t, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb.class, aVar, cVar);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return null;
    }

    public java.lang.String g() {
        return f132661d;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        if (this.f132666q == null || this.f132665p < 0) {
            return;
        }
        m();
        synchronized (this) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = this.f132671y;
            if (lwVar != null) {
                lwVar.a();
                this.f132671y = null;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f132666q;
        int i17 = this.f132665p;
        if (reVar.f132686f != null) {
            reVar.f132687g.remove(java.lang.Integer.valueOf(i17));
            reVar.f132686f.f(i17);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, reVar.f132688h.K);
        }
    }

    /* renamed from: hashCode */
    public int m36945x8cdac1b() {
        return y().hashCode();
    }

    @Override // com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407
    /* renamed from: onLoadTile */
    public android.graphics.Bitmap mo35235x131bcbb3(int i17, int i18, int i19, byte[] bArr) {
        int i27;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = this.f132667r;
        if (c26089x9c7ff29c == null || c26089x9c7ff29c.m100003x4638c135() == null) {
            return null;
        }
        java.lang.String format = java.lang.String.format(f132660b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f132667r.m100004x2e41070()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        int e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "load-count", this.f132669t);
        int d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "cache-count", this.f132669t);
        int d18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "data-count", this.f132669t);
        int d19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "req-count", this.f132669t);
        int d27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "cancel-count", this.f132669t);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(this.f132668s).b(format, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb.class);
        if (rbVar != null) {
            d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "cache-count", this.f132669t);
            i27 = rbVar.f131616e;
            if (e17 == d19 + d18 + d17 + d27) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, this.f132669t);
            }
        } else {
            i27 = 0;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("get from cache of cacheId:".concat(java.lang.String.valueOf(format)), "dataLength:".concat(java.lang.String.valueOf(i27)), "loadCount:".concat(java.lang.String.valueOf(e17)), "reqCount:".concat(java.lang.String.valueOf(d19)), "dataCount:".concat(java.lang.String.valueOf(d18)), "cacheCount:".concat(java.lang.String.valueOf(d17)), "cancelCount:".concat(java.lang.String.valueOf(d27)));
        if (rbVar != null) {
            this.f132670x.remove(format);
            rbVar.e();
            return rbVar.c();
        }
        java.lang.Integer num = this.f132670x.get(format);
        if (num == null || num.intValue() <= 10) {
            this.f132670x.put(format, java.lang.Integer.valueOf(num == null ? 0 : num.intValue() + 1));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
            sb6.append("tileOverlay://getTile/");
            sb6.append(this.f132665p);
            sb6.append("?x=");
            sb6.append(i17);
            sb6.append("&y=");
            sb6.append(i18);
            sb6.append("&z=");
            sb6.append(i19);
            byte[] bytes = sb6.toString().getBytes();
            java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
            return null;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Integer>> it = this.f132670x.entrySet().iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().getValue().intValue() > 10) {
                i28++;
            }
            if (i28 > 50) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d("超过50个瓦片请求大于10次，重新加载TileOverlay");
                a(true);
                break;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(128);
        sb7.append("tileOverlay://getTile/");
        sb7.append(this.f132665p);
        sb7.append("?x=");
        sb7.append(i17);
        sb7.append("&y=");
        sb7.append(i18);
        sb7.append("&z=");
        sb7.append(i19);
        byte[] bytes2 = sb7.toString().getBytes();
        java.lang.System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        return null;
    }

    @Override // com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407
    /* renamed from: onLoadTileFinish */
    public void mo35236x1e417226(int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(this.f132668s).b(java.lang.String.format(f132660b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f132667r.m100004x2e41070()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb.class);
        if (rbVar != null) {
            rbVar.d();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public boolean mo36424x64f7944(float f17, float f18) {
        return false;
    }

    @Override // com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407
    /* renamed from: onWriteTile */
    public void mo35237xaa57540e(int i17, int i18, int i19, java.lang.String str, byte[] bArr) {
    }

    /* loaded from: classes13.dex */
    public static class a implements com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> {
        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.jy.b
        public final /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar2 = rbVar;
            if (rbVar2 == null) {
                return true;
            }
            rbVar2.f();
            return true;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar) {
            if (rbVar == null) {
                return true;
            }
            rbVar.f();
            return true;
        }
    }

    public final void a(boolean z17) {
        java.util.concurrent.BlockingQueue<java.lang.Runnable> blockingQueue;
        if (this.f132666q == null || this.f132665p < 0) {
            return;
        }
        m();
        this.f132666q.b(this.f132665p);
        if (z17 && (blockingQueue = this.f132672z) != null) {
            blockingQueue.clear();
        }
    }

    private void b(int i17, int i18) {
        int i19;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f132666q;
        if (reVar == null || (i19 = this.f132665p) < 0) {
            return;
        }
        reVar.a(i19, i17, i18);
    }

    public final void a(int i17) {
        if (this.f132666q == null || this.f132665p < 0) {
            return;
        }
        if (i17 < 0) {
            i17 = 0;
        }
        this.f132666q.a(this.f132665p, b(i17));
    }

    public final void a(int i17, int i18) {
        int i19;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f132666q;
        if (reVar == null || (i19 = this.f132665p) < 0) {
            return;
        }
        reVar.b(i19, i17, i18);
    }

    private void a(java.lang.String str) {
        if (this.f132667r == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f132667r.m99994xb2cd9a68(str);
        this.f132668s = f();
    }

    private byte[] a(int i17, int i18, int i19) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = this.f132667r;
        if (c26089x9c7ff29c != null && c26089x9c7ff29c.m100003x4638c135() != null && i19 >= 0) {
            java.lang.String format = java.lang.String.format(f132660b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f132667r.m100004x2e41070()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce mo36666xfb85bb24 = this.f132667r.m100003x4638c135().mo36666xfb85bb24(i17, i18, i19);
            if (mo36666xfb85bb24 != null && mo36666xfb85bb24 != com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26087x27c6ce.f49783xdf8baa80) {
                byte[] bArr = mo36666xfb85bb24.f49784x62065b7;
                if (bArr != null && bArr.length > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "cacheId", (java.lang.Object) format, this.f132669t);
                    a(format, bArr);
                }
                return bArr;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "Provider没有瓦片数据，返回空瓦块");
            byte[] a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a();
            a(format, a17);
            return a17;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131735c, "无效坐标，返回空瓦块");
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a();
    }

    public final void a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb rbVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb(bArr);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rb> jyVar = this.f132668s;
        if (jyVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(jyVar);
            if (a17 != null) {
                a17.b(str, (java.lang.String) rbVar);
            } else {
                this.f132668s.a(str, (java.lang.String) rbVar);
            }
        }
    }
}
