package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82;

/* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache */
/* loaded from: classes13.dex */
public final class C4383x7b69cbc5<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ke<D> {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f130246a = "DiskCache";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f130247b = ".disk_idx";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f130248c = ".disk_idx_root";

    /* renamed from: k, reason: collision with root package name */
    private static final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a f130249k = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.1
        @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
        public final java.io.File a(java.lang.String str, java.lang.String str2, byte[] bArr) {
            java.io.File file = new java.io.File(str2, str);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, bArr);
            return file;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
        public final byte[] a(java.lang.String str, java.io.File file) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(file);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a
        public final boolean a(java.io.File file) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ka.a<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b> f130250d;

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c f130251e;

    /* renamed from: f, reason: collision with root package name */
    private java.io.File f130252f;

    /* renamed from: g, reason: collision with root package name */
    private java.io.File f130253g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f130254h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.List<java.lang.String> f130255i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f130256j;

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$a */
    /* loaded from: classes13.dex */
    public interface a {
        java.io.File a(java.lang.String str, java.lang.String str2, byte[] bArr);

        boolean a(java.io.File file);

        byte[] a(java.lang.String str, java.io.File file);
    }

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$b */
    /* loaded from: classes13.dex */
    public static final class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz {

        /* renamed from: a, reason: collision with root package name */
        java.io.File f130257a;

        /* renamed from: b, reason: collision with root package name */
        private int f130258b;

        public b(java.io.File file, int i17) {
            this.f130257a = file;
            this.f130258b = i17;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
        public final void a(byte[] bArr) {
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
        public final byte[] b() {
            return new byte[this.f130258b];
        }

        /* renamed from: toString */
        public final java.lang.String m36136x9616526c() {
            return this.f130257a.getName() + "," + this.f130258b;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz
        public final int a() {
            return this.f130258b;
        }
    }

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$c */
    /* loaded from: classes13.dex */
    public static class c extends com.tencent.mapsdk.internal.ke.c {

        /* renamed from: b, reason: collision with root package name */
        static final long f130259b = -1;

        /* renamed from: c, reason: collision with root package name */
        public java.io.File f130260c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f130261d;

        /* renamed from: e, reason: collision with root package name */
        public com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a f130262e;

        /* renamed from: f, reason: collision with root package name */
        long f130263f;

        /* renamed from: g, reason: collision with root package name */
        int f130264g;

        /* renamed from: h, reason: collision with root package name */
        final com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b> f130265h;

        /* renamed from: i, reason: collision with root package name */
        com.tencent.mapsdk.internal.jy.b<java.io.File> f130266i;

        public c() {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f130260c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d;
            this.f130261d = "tmp";
            this.f130262e = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.f130249k;
            this.f130263f = -1L;
            this.f130265h = new com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar2.f130257a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar.f130257a);
                    return true;
                }
            };
        }

        @Override // com.tencent.mapsdk.internal.ke.c
        /* renamed from: toString */
        public final java.lang.String mo36137x9616526c() {
            return "Options{mCacheDirectory=" + this.f130260c + ", mCacheName='" + this.f130261d + "', fileAccessStrategy=" + this.f130262e + "} " + super.mo36137x9616526c();
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c a(com.tencent.mapsdk.internal.jy.b<java.io.File> bVar) {
            this.f130266i = bVar;
            return this;
        }

        private java.io.File d() {
            return new java.io.File(this.f130260c, this.f130261d);
        }

        public final com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c c() {
            this.f130263f = 1024L;
            return this;
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a aVar) {
            this.f130262e = aVar;
            return this;
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c a(java.io.File file) {
            this.f130260c = file;
            return this;
        }

        private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c a(java.lang.String str) {
            this.f130261d = str;
            return this;
        }

        private c(java.lang.String str) {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f130260c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d;
            this.f130261d = "tmp";
            this.f130262e = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.f130249k;
            this.f130263f = -1L;
            this.f130265h = new com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar2.f130257a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar.f130257a);
                    return true;
                }
            };
            this.f130261d = str;
        }

        public c(int i17) {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f130260c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f131719d;
            this.f130261d = "tmp";
            this.f130262e = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.f130249k;
            this.f130263f = -1L;
            this.f130265h = new com.tencent.mapsdk.internal.jy.b<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar2.f130257a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c.this.f130266i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f130257a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(bVar.f130257a);
                    return true;
                }
            };
            this.f130264g = i17;
        }
    }

    public C4383x7b69cbc5(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c cVar) {
        super(cVar);
        this.f130251e = cVar;
        if (cVar != null) {
            this.f130252f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(cVar.f130260c, cVar.f130261d);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c cVar2 = this.f130251e;
            int i17 = cVar2.f131607k;
            boolean z17 = i17 == -1;
            this.f130256j = z17;
            if (!z17) {
                this.f130250d = new com.tencent.mapsdk.internal.ka.a<>(i17, cVar2.f130265h);
            }
            this.f130253g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130252f, f130248c);
            this.f130255i = new java.util.ArrayList();
            this.f130254h = new java.util.HashMap();
            java.util.List<java.lang.String> d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g);
            if (d17 != null) {
                for (java.lang.String str : d17) {
                    if (str.length() > 0) {
                        java.lang.String[] split = str.split("#");
                        if (split.length > 1) {
                            for (java.lang.String str2 : split[1].split(",")) {
                                this.f130254h.put(str2, split[0]);
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("loadRootIndex count:" + this.f130254h.size(), "disk_cache_dir:" + this.f130252f);
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c n() {
        return this.f130251e;
    }

    private void o() {
        this.f130253g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130252f, f130248c);
        this.f130255i = new java.util.ArrayList();
        this.f130254h = new java.util.HashMap();
        java.util.List<java.lang.String> d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g);
        if (d17 != null) {
            for (java.lang.String str : d17) {
                if (str.length() > 0) {
                    java.lang.String[] split = str.split("#");
                    if (split.length > 1) {
                        for (java.lang.String str2 : split[1].split(",")) {
                            this.f130254h.put(str2, split[0]);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("loadRootIndex count:" + this.f130254h.size(), "disk_cache_dir:" + this.f130252f);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void a(java.lang.String str, D d17) {
        if (android.text.TextUtils.isEmpty(str) || d17 == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131749q, str, this.f130251e.f130264g);
        java.lang.String a17 = this.f130251e.f131608l.a(str);
        byte[] b17 = d17.b();
        if (b17 != null) {
            java.io.File a18 = this.f130251e.f130262e.a(a17, this.f130252f.getAbsolutePath(), b17);
            if (!this.f130256j || this.f130251e.f130263f != -1) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b(a18, b17.length);
                if (!this.f130256j) {
                    this.f130250d.a((com.tencent.mapsdk.internal.ka.a<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>) a17, (java.lang.String) bVar);
                }
                java.io.File file = bVar.f130257a;
                if (file != null) {
                    java.io.File parentFile = file.getParentFile();
                    java.io.File b18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(parentFile, f130247b);
                    java.lang.String str2 = a17 + "#" + bVar.m36136x9616526c();
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(b18, str2) == -1) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("index writeLine data:".concat(java.lang.String.valueOf(str2)));
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(b18, str2);
                    }
                    int d18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g, parentFile.getAbsolutePath());
                    if (d18 != -1) {
                        java.lang.String concat = ",".concat(java.lang.String.valueOf(a17));
                        java.lang.String a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d18);
                        if (a19 != null && !a19.contains(a17)) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("root writeAppend data:".concat(java.lang.String.valueOf(concat)));
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d18, ",".concat(java.lang.String.valueOf(a17)));
                        }
                    } else {
                        java.lang.String str3 = parentFile.getAbsolutePath() + "#" + a17;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("root writeLine data:".concat(java.lang.String.valueOf(str3)));
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f130253g, str3);
                    }
                    this.f130254h.put(a17, parentFile.getAbsolutePath());
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131749q, str, (java.lang.Object) "put data length", b17 == null ? 0 : b17.length);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void b() {
        java.io.File file = this.f130252f;
        if (file != null) {
            if (this.f130256j) {
                this.f130251e.f130262e.a(file);
            } else {
                this.f130250d.a();
                this.f130251e.f130262e.a(this.f130252f);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long c() {
        int size;
        if (this.f130256j) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c cVar = this.f130251e;
            if (cVar == null || cVar.f130263f == -1) {
                return -1L;
            }
            size = this.f130254h.size();
        } else {
            size = this.f130250d.d().size();
        }
        return size;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long d() {
        if (this.f130256j) {
            return -1L;
        }
        return this.f130250d.b();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final long e() {
        if (this.f130256j) {
            return -1L;
        }
        return this.f130250d.c();
    }

    public final void f() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.c cVar = this.f130251e;
        if (cVar == null || cVar.f130263f == -1 || this.f130254h.size() <= this.f130251e.f130263f) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a("cached tile count:" + this.f130254h.size());
        this.f130254h.size();
        b();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ke
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ke.c g() {
        return this.f130251e;
    }

    private void d(java.lang.String str) {
        java.lang.String a17;
        java.lang.String str2 = this.f130254h.get(str);
        if (str2 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("key：".concat(java.lang.String.valueOf(str)), "dir : ".concat(str2));
            java.io.File file = new java.io.File(new java.io.File(str2), f130247b);
            int d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(file, str);
            if (d17 != -1) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file, d17);
            }
            int d18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g, str2);
            if (d18 == -1 || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d18)) == null || !a17.contains(str)) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130253g, d18, a17.replaceAll(str + ",", ""));
        }
    }

    private void c(java.lang.String str) {
        java.lang.String str2 = this.f130254h.get(str);
        if (str2 == null || this.f130255i.contains(str2)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("key：".concat(java.lang.String.valueOf(str)), "dir : ".concat(str2));
        java.util.List<java.lang.String> d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(new java.io.File(str2), f130247b));
        if (d17 == null || d17.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a(d17.toArray());
        if (this.f130250d != null) {
            java.util.Iterator<java.lang.String> it = d17.iterator();
            while (it.hasNext()) {
                java.lang.String[] split = it.next().split("#");
                java.lang.String[] split2 = split[1].split(",");
                java.lang.String str3 = split[0];
                java.lang.String str4 = split2[0];
                this.f130250d.a((com.tencent.mapsdk.internal.ka.a<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>) str3, (java.lang.String) new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b(new java.io.File(str2, str4), java.lang.Integer.parseInt(split2[1])));
            }
        }
        if (d17.size() > 0) {
            this.f130255i.add(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D a(java.lang.String r10, java.lang.Class<D> r11) {
        /*
            r9 = this;
            java.lang.String r0 = " must have a empty construct. #"
            java.lang.String r1 = "The "
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r2 = r9.f130251e
            com.tencent.mapsdk.internal.ke$b r2 = r2.f131608l
            java.lang.String r2 = r2.a(r10)
            boolean r3 = r9.f130256j
            r4 = 0
            if (r3 == 0) goto L1b
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r3 = r9.f130251e
            long r5 = r3.f130263f
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L2f
        L1b:
            r9.c(r2)
            boolean r3 = r9.f130256j
            if (r3 != 0) goto L2f
            com.tencent.mapsdk.internal.ka$a<com.tencent.mapsdk.core.utils.cache.DiskCache$b> r3 = r9.f130250d
            java.lang.Object r3 = r3.b(r2)
            com.tencent.mapsdk.core.utils.cache.DiskCache$b r3 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b) r3
            if (r3 == 0) goto L2f
            java.io.File r3 = r3.f130257a
            goto L30
        L2f:
            r3 = r4
        L30:
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r5 = r9.f130251e
            com.tencent.mapsdk.core.utils.cache.DiskCache$a r5 = r5.f130262e
            byte[] r2 = r5.a(r2, r3)
            if (r2 == 0) goto L87
            java.lang.Object r3 = r11.newInstance()     // Catch: java.lang.InstantiationException -> L45 java.lang.IllegalAccessException -> L66
            r4 = r3
            com.tencent.mapsdk.internal.jz r4 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz) r4     // Catch: java.lang.InstantiationException -> L45 java.lang.IllegalAccessException -> L66
            r4.a(r2)     // Catch: java.lang.InstantiationException -> L45 java.lang.IllegalAccessException -> L66
            goto L87
        L45:
            r10 = move-exception
            java.lang.Error r2 = new java.lang.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r11 = r11.getSimpleName()
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r10.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r10)
            throw r2
        L66:
            r10 = move-exception
            java.lang.Error r2 = new java.lang.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r11 = r11.getSimpleName()
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r10.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r10)
            throw r2
        L87:
            if (r2 != 0) goto L8b
            r11 = 0
            goto L8c
        L8b:
            int r11 = r2.length
        L8c:
            java.lang.String r0 = "DC"
            java.lang.String r1 = "get data length"
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(r0, r10, r1, r11)
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r11 = r9.f130251e
            int r11 = r11.f130264g
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f(r0, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.a(java.lang.String, java.lang.Class):com.tencent.mapsdk.internal.jz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final boolean a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String a17;
        java.lang.String a18 = this.f130251e.f131608l.a(str);
        if (!this.f130256j || this.f130251e.f130263f != -1) {
            c(a18);
            if (!this.f130256j) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b) this.f130250d.b((com.tencent.mapsdk.internal.ka.a<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b>) a18);
                r1 = bVar != null ? bVar.f130257a : null;
                if (r1 != null && r1.exists()) {
                    this.f130250d.c(a18);
                }
            }
            if (r1 != null && r1.exists() && (str2 = this.f130254h.get(a18)) != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("key：".concat(java.lang.String.valueOf(a18)), "dir : ".concat(str2));
                java.io.File file = new java.io.File(new java.io.File(str2), f130247b);
                int d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(file, a18);
                if (d17 != -1) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file, d17);
                }
                int d18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g, str2);
                if (d18 != -1 && (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d18)) != null && a17.contains(a18)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130253g, d18, a17.replaceAll(a18 + ",", ""));
                }
            }
        }
        return this.f130251e.f130262e.a(r1);
    }

    private void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.p529x5a0af82.C4383x7b69cbc5.b bVar) {
        java.io.File file = bVar.f130257a;
        if (file == null) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        java.io.File b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(parentFile, f130247b);
        java.lang.String str2 = str + "#" + bVar.m36136x9616526c();
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(b17, str2) == -1) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("index writeLine data:".concat(java.lang.String.valueOf(str2)));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(b17, str2);
        }
        int d17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.d(this.f130253g, parentFile.getAbsolutePath());
        if (d17 != -1) {
            java.lang.String concat = ",".concat(java.lang.String.valueOf(str));
            java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d17);
            if (a17 != null && !a17.contains(str)) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("root writeAppend data:".concat(java.lang.String.valueOf(concat)));
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130253g, d17, ",".concat(java.lang.String.valueOf(str)));
            }
        } else {
            java.lang.String str3 = parentFile.getAbsolutePath() + "#" + str;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(f130246a).a("root writeLine data:".concat(java.lang.String.valueOf(str3)));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f130253g, str3);
        }
        this.f130254h.put(str, parentFile.getAbsolutePath());
    }
}
