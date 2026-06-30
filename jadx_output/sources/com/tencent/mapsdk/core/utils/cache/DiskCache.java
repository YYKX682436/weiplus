package com.tencent.mapsdk.core.utils.cache;

/* loaded from: classes13.dex */
public final class DiskCache<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.ke<D> {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f48713a = "DiskCache";

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f48714b = ".disk_idx";

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f48715c = ".disk_idx_root";

    /* renamed from: k, reason: collision with root package name */
    private static final com.tencent.mapsdk.core.utils.cache.DiskCache.a f48716k = new com.tencent.mapsdk.core.utils.cache.DiskCache.a() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.1
        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final java.io.File a(java.lang.String str, java.lang.String str2, byte[] bArr) {
            java.io.File file = new java.io.File(str2, str);
            com.tencent.mapsdk.internal.ks.a(file, bArr);
            return file;
        }

        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final byte[] a(java.lang.String str, java.io.File file) {
            return com.tencent.mapsdk.internal.ks.c(file);
        }

        @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
        public final boolean a(java.io.File file) {
            return com.tencent.mapsdk.internal.ks.b(file);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ka.a<com.tencent.mapsdk.core.utils.cache.DiskCache.b> f48717d;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mapsdk.core.utils.cache.DiskCache.c f48718e;

    /* renamed from: f, reason: collision with root package name */
    private java.io.File f48719f;

    /* renamed from: g, reason: collision with root package name */
    private java.io.File f48720g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f48721h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.List<java.lang.String> f48722i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f48723j;

    /* loaded from: classes13.dex */
    public interface a {
        java.io.File a(java.lang.String str, java.lang.String str2, byte[] bArr);

        boolean a(java.io.File file);

        byte[] a(java.lang.String str, java.io.File file);
    }

    /* loaded from: classes13.dex */
    public static final class b extends com.tencent.mapsdk.internal.jz {

        /* renamed from: a, reason: collision with root package name */
        java.io.File f48724a;

        /* renamed from: b, reason: collision with root package name */
        private int f48725b;

        public b(java.io.File file, int i17) {
            this.f48724a = file;
            this.f48725b = i17;
        }

        @Override // com.tencent.mapsdk.internal.jz
        public final void a(byte[] bArr) {
        }

        @Override // com.tencent.mapsdk.internal.jz
        public final byte[] b() {
            return new byte[this.f48725b];
        }

        public final java.lang.String toString() {
            return this.f48724a.getName() + "," + this.f48725b;
        }

        @Override // com.tencent.mapsdk.internal.jz
        public final int a() {
            return this.f48725b;
        }
    }

    /* loaded from: classes13.dex */
    public static class c extends com.tencent.mapsdk.internal.ke.c {

        /* renamed from: b, reason: collision with root package name */
        static final long f48726b = -1;

        /* renamed from: c, reason: collision with root package name */
        public java.io.File f48727c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f48728d;

        /* renamed from: e, reason: collision with root package name */
        public com.tencent.mapsdk.core.utils.cache.DiskCache.a f48729e;

        /* renamed from: f, reason: collision with root package name */
        long f48730f;

        /* renamed from: g, reason: collision with root package name */
        int f48731g;

        /* renamed from: h, reason: collision with root package name */
        final com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.core.utils.cache.DiskCache.b> f48732h;

        /* renamed from: i, reason: collision with root package name */
        com.tencent.mapsdk.internal.jy.b<java.io.File> f48733i;

        public c() {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f48727c = com.tencent.mapsdk.internal.ks.f50186d;
            this.f48728d = "tmp";
            this.f48729e = com.tencent.mapsdk.core.utils.cache.DiskCache.f48716k;
            this.f48730f = -1L;
            this.f48732h = new com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.core.utils.cache.DiskCache.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar2.f48724a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar.f48724a);
                    return true;
                }
            };
        }

        @Override // com.tencent.mapsdk.internal.ke.c
        public final java.lang.String toString() {
            return "Options{mCacheDirectory=" + this.f48727c + ", mCacheName='" + this.f48728d + "', fileAccessStrategy=" + this.f48729e + "} " + super.toString();
        }

        private com.tencent.mapsdk.core.utils.cache.DiskCache.c a(com.tencent.mapsdk.internal.jy.b<java.io.File> bVar) {
            this.f48733i = bVar;
            return this;
        }

        private java.io.File d() {
            return new java.io.File(this.f48727c, this.f48728d);
        }

        public final com.tencent.mapsdk.core.utils.cache.DiskCache.c c() {
            this.f48730f = 1024L;
            return this;
        }

        private com.tencent.mapsdk.core.utils.cache.DiskCache.c a(com.tencent.mapsdk.core.utils.cache.DiskCache.a aVar) {
            this.f48729e = aVar;
            return this;
        }

        private com.tencent.mapsdk.core.utils.cache.DiskCache.c a(java.io.File file) {
            this.f48727c = file;
            return this;
        }

        private com.tencent.mapsdk.core.utils.cache.DiskCache.c a(java.lang.String str) {
            this.f48728d = str;
            return this;
        }

        private c(java.lang.String str) {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f48727c = com.tencent.mapsdk.internal.ks.f50186d;
            this.f48728d = "tmp";
            this.f48729e = com.tencent.mapsdk.core.utils.cache.DiskCache.f48716k;
            this.f48730f = -1L;
            this.f48732h = new com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.core.utils.cache.DiskCache.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar2.f48724a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar.f48724a);
                    return true;
                }
            };
            this.f48728d = str;
        }

        public c(int i17) {
            super(com.tencent.mapsdk.internal.ke.a.DISK);
            this.f48727c = com.tencent.mapsdk.internal.ks.f50186d;
            this.f48728d = "tmp";
            this.f48729e = com.tencent.mapsdk.core.utils.cache.DiskCache.f48716k;
            this.f48730f = -1L;
            this.f48732h = new com.tencent.mapsdk.internal.jy.b<com.tencent.mapsdk.core.utils.cache.DiskCache.b>() { // from class: com.tencent.mapsdk.core.utils.cache.DiskCache.c.1
                @Override // com.tencent.mapsdk.internal.jy.b
                public final /* synthetic */ boolean a(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar2 = bVar;
                    if (bVar2 == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar3 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar3 != null ? bVar3.a(bVar2.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar2.f48724a);
                    return true;
                }

                /* renamed from: a, reason: avoid collision after fix types in other method */
                private boolean a2(com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    com.tencent.mapsdk.internal.jy.b<java.io.File> bVar2 = com.tencent.mapsdk.core.utils.cache.DiskCache.c.this.f48733i;
                    boolean a17 = bVar2 != null ? bVar2.a(bVar.f48724a) : false;
                    if (a17) {
                        return a17;
                    }
                    com.tencent.mapsdk.internal.ks.b(bVar.f48724a);
                    return true;
                }
            };
            this.f48731g = i17;
        }
    }

    public DiskCache(com.tencent.mapsdk.core.utils.cache.DiskCache.c cVar) {
        super(cVar);
        this.f48718e = cVar;
        if (cVar != null) {
            this.f48719f = com.tencent.mapsdk.internal.ks.a(cVar.f48727c, cVar.f48728d);
            com.tencent.mapsdk.core.utils.cache.DiskCache.c cVar2 = this.f48718e;
            int i17 = cVar2.f50074k;
            boolean z17 = i17 == -1;
            this.f48723j = z17;
            if (!z17) {
                this.f48717d = new com.tencent.mapsdk.internal.ka.a<>(i17, cVar2.f48732h);
            }
            this.f48720g = com.tencent.mapsdk.internal.ks.b(this.f48719f, f48715c);
            this.f48722i = new java.util.ArrayList();
            this.f48721h = new java.util.HashMap();
            java.util.List<java.lang.String> d17 = com.tencent.mapsdk.internal.ks.d(this.f48720g);
            if (d17 != null) {
                for (java.lang.String str : d17) {
                    if (str.length() > 0) {
                        java.lang.String[] split = str.split("#");
                        if (split.length > 1) {
                            for (java.lang.String str2 : split[1].split(",")) {
                                this.f48721h.put(str2, split[0]);
                            }
                        }
                    }
                }
            }
            com.tencent.mapsdk.internal.lb.a("loadRootIndex count:" + this.f48721h.size(), "disk_cache_dir:" + this.f48719f);
        }
    }

    private com.tencent.mapsdk.core.utils.cache.DiskCache.c n() {
        return this.f48718e;
    }

    private void o() {
        this.f48720g = com.tencent.mapsdk.internal.ks.b(this.f48719f, f48715c);
        this.f48722i = new java.util.ArrayList();
        this.f48721h = new java.util.HashMap();
        java.util.List<java.lang.String> d17 = com.tencent.mapsdk.internal.ks.d(this.f48720g);
        if (d17 != null) {
            for (java.lang.String str : d17) {
                if (str.length() > 0) {
                    java.lang.String[] split = str.split("#");
                    if (split.length > 1) {
                        for (java.lang.String str2 : split[1].split(",")) {
                            this.f48721h.put(str2, split[0]);
                        }
                    }
                }
            }
        }
        com.tencent.mapsdk.internal.lb.a("loadRootIndex count:" + this.f48721h.size(), "disk_cache_dir:" + this.f48719f);
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void a(java.lang.String str, D d17) {
        if (android.text.TextUtils.isEmpty(str) || d17 == null) {
            return;
        }
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50216q, str, this.f48718e.f48731g);
        java.lang.String a17 = this.f48718e.f50075l.a(str);
        byte[] b17 = d17.b();
        if (b17 != null) {
            java.io.File a18 = this.f48718e.f48729e.a(a17, this.f48719f.getAbsolutePath(), b17);
            if (!this.f48723j || this.f48718e.f48730f != -1) {
                com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar = new com.tencent.mapsdk.core.utils.cache.DiskCache.b(a18, b17.length);
                if (!this.f48723j) {
                    this.f48717d.a((com.tencent.mapsdk.internal.ka.a<com.tencent.mapsdk.core.utils.cache.DiskCache.b>) a17, (java.lang.String) bVar);
                }
                java.io.File file = bVar.f48724a;
                if (file != null) {
                    java.io.File parentFile = file.getParentFile();
                    java.io.File b18 = com.tencent.mapsdk.internal.ks.b(parentFile, f48714b);
                    java.lang.String str2 = a17 + "#" + bVar.toString();
                    if (com.tencent.mapsdk.internal.ks.d(b18, str2) == -1) {
                        com.tencent.mapsdk.internal.lb.a(f48713a).a("index writeLine data:".concat(java.lang.String.valueOf(str2)));
                        com.tencent.mapsdk.internal.ks.c(b18, str2);
                    }
                    int d18 = com.tencent.mapsdk.internal.ks.d(this.f48720g, parentFile.getAbsolutePath());
                    if (d18 != -1) {
                        java.lang.String concat = ",".concat(java.lang.String.valueOf(a17));
                        java.lang.String a19 = com.tencent.mapsdk.internal.ks.a(this.f48720g, d18);
                        if (a19 != null && !a19.contains(a17)) {
                            com.tencent.mapsdk.internal.lb.a(f48713a).a("root writeAppend data:".concat(java.lang.String.valueOf(concat)));
                            com.tencent.mapsdk.internal.ks.a(this.f48720g, d18, ",".concat(java.lang.String.valueOf(a17)));
                        }
                    } else {
                        java.lang.String str3 = parentFile.getAbsolutePath() + "#" + a17;
                        com.tencent.mapsdk.internal.lb.a(f48713a).a("root writeLine data:".concat(java.lang.String.valueOf(str3)));
                        com.tencent.mapsdk.internal.ks.c(this.f48720g, str3);
                    }
                    this.f48721h.put(a17, parentFile.getAbsolutePath());
                }
            }
        }
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50216q, str, (java.lang.Object) "put data length", b17 == null ? 0 : b17.length);
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void b() {
        java.io.File file = this.f48719f;
        if (file != null) {
            if (this.f48723j) {
                this.f48718e.f48729e.a(file);
            } else {
                this.f48717d.a();
                this.f48718e.f48729e.a(this.f48719f);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long c() {
        int size;
        if (this.f48723j) {
            com.tencent.mapsdk.core.utils.cache.DiskCache.c cVar = this.f48718e;
            if (cVar == null || cVar.f48730f == -1) {
                return -1L;
            }
            size = this.f48721h.size();
        } else {
            size = this.f48717d.d().size();
        }
        return size;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long d() {
        if (this.f48723j) {
            return -1L;
        }
        return this.f48717d.b();
    }

    @Override // com.tencent.mapsdk.internal.jy, com.tencent.mapsdk.internal.kf
    public final long e() {
        if (this.f48723j) {
            return -1L;
        }
        return this.f48717d.c();
    }

    public final void f() {
        com.tencent.mapsdk.core.utils.cache.DiskCache.c cVar = this.f48718e;
        if (cVar == null || cVar.f48730f == -1 || this.f48721h.size() <= this.f48718e.f48730f) {
            return;
        }
        com.tencent.mapsdk.internal.lb.a("cached tile count:" + this.f48721h.size());
        this.f48721h.size();
        b();
    }

    @Override // com.tencent.mapsdk.internal.ke
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.ke.c g() {
        return this.f48718e;
    }

    private void d(java.lang.String str) {
        java.lang.String a17;
        java.lang.String str2 = this.f48721h.get(str);
        if (str2 != null) {
            com.tencent.mapsdk.internal.lb.a(f48713a).a("key：".concat(java.lang.String.valueOf(str)), "dir : ".concat(str2));
            java.io.File file = new java.io.File(new java.io.File(str2), f48714b);
            int d17 = com.tencent.mapsdk.internal.ks.d(file, str);
            if (d17 != -1) {
                com.tencent.mapsdk.internal.ks.b(file, d17);
            }
            int d18 = com.tencent.mapsdk.internal.ks.d(this.f48720g, str2);
            if (d18 == -1 || (a17 = com.tencent.mapsdk.internal.ks.a(this.f48720g, d18)) == null || !a17.contains(str)) {
                return;
            }
            com.tencent.mapsdk.internal.ks.b(this.f48720g, d18, a17.replaceAll(str + ",", ""));
        }
    }

    private void c(java.lang.String str) {
        java.lang.String str2 = this.f48721h.get(str);
        if (str2 == null || this.f48722i.contains(str2)) {
            return;
        }
        com.tencent.mapsdk.internal.lb.a(f48713a).a("key：".concat(java.lang.String.valueOf(str)), "dir : ".concat(str2));
        java.util.List<java.lang.String> d17 = com.tencent.mapsdk.internal.ks.d(com.tencent.mapsdk.internal.ks.b(new java.io.File(str2), f48714b));
        if (d17 == null || d17.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.lb.a(f48713a).a(d17.toArray());
        if (this.f48717d != null) {
            java.util.Iterator<java.lang.String> it = d17.iterator();
            while (it.hasNext()) {
                java.lang.String[] split = it.next().split("#");
                java.lang.String[] split2 = split[1].split(",");
                java.lang.String str3 = split[0];
                java.lang.String str4 = split2[0];
                this.f48717d.a((com.tencent.mapsdk.internal.ka.a<com.tencent.mapsdk.core.utils.cache.DiskCache.b>) str3, (java.lang.String) new com.tencent.mapsdk.core.utils.cache.DiskCache.b(new java.io.File(str2, str4), java.lang.Integer.parseInt(split2[1])));
            }
        }
        if (d17.size() > 0) {
            this.f48722i.add(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    @Override // com.tencent.mapsdk.internal.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D a(java.lang.String r10, java.lang.Class<D> r11) {
        /*
            r9 = this;
            java.lang.String r0 = " must have a empty construct. #"
            java.lang.String r1 = "The "
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r2 = r9.f48718e
            com.tencent.mapsdk.internal.ke$b r2 = r2.f50075l
            java.lang.String r2 = r2.a(r10)
            boolean r3 = r9.f48723j
            r4 = 0
            if (r3 == 0) goto L1b
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r3 = r9.f48718e
            long r5 = r3.f48730f
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L2f
        L1b:
            r9.c(r2)
            boolean r3 = r9.f48723j
            if (r3 != 0) goto L2f
            com.tencent.mapsdk.internal.ka$a<com.tencent.mapsdk.core.utils.cache.DiskCache$b> r3 = r9.f48717d
            java.lang.Object r3 = r3.b(r2)
            com.tencent.mapsdk.core.utils.cache.DiskCache$b r3 = (com.tencent.mapsdk.core.utils.cache.DiskCache.b) r3
            if (r3 == 0) goto L2f
            java.io.File r3 = r3.f48724a
            goto L30
        L2f:
            r3 = r4
        L30:
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r5 = r9.f48718e
            com.tencent.mapsdk.core.utils.cache.DiskCache$a r5 = r5.f48729e
            byte[] r2 = r5.a(r2, r3)
            if (r2 == 0) goto L87
            java.lang.Object r3 = r11.newInstance()     // Catch: java.lang.InstantiationException -> L45 java.lang.IllegalAccessException -> L66
            r4 = r3
            com.tencent.mapsdk.internal.jz r4 = (com.tencent.mapsdk.internal.jz) r4     // Catch: java.lang.InstantiationException -> L45 java.lang.IllegalAccessException -> L66
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
            com.tencent.mapsdk.internal.lb.a(r0, r10, r1, r11)
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r11 = r9.f48718e
            int r11 = r11.f48731g
            com.tencent.mapsdk.internal.lb.f(r0, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.core.utils.cache.DiskCache.a(java.lang.String, java.lang.Class):com.tencent.mapsdk.internal.jz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mapsdk.internal.jy
    public final boolean a(java.lang.String str) {
        java.lang.String str2;
        java.lang.String a17;
        java.lang.String a18 = this.f48718e.f50075l.a(str);
        if (!this.f48723j || this.f48718e.f48730f != -1) {
            c(a18);
            if (!this.f48723j) {
                com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar = (com.tencent.mapsdk.core.utils.cache.DiskCache.b) this.f48717d.b((com.tencent.mapsdk.internal.ka.a<com.tencent.mapsdk.core.utils.cache.DiskCache.b>) a18);
                r1 = bVar != null ? bVar.f48724a : null;
                if (r1 != null && r1.exists()) {
                    this.f48717d.c(a18);
                }
            }
            if (r1 != null && r1.exists() && (str2 = this.f48721h.get(a18)) != null) {
                com.tencent.mapsdk.internal.lb.a(f48713a).a("key：".concat(java.lang.String.valueOf(a18)), "dir : ".concat(str2));
                java.io.File file = new java.io.File(new java.io.File(str2), f48714b);
                int d17 = com.tencent.mapsdk.internal.ks.d(file, a18);
                if (d17 != -1) {
                    com.tencent.mapsdk.internal.ks.b(file, d17);
                }
                int d18 = com.tencent.mapsdk.internal.ks.d(this.f48720g, str2);
                if (d18 != -1 && (a17 = com.tencent.mapsdk.internal.ks.a(this.f48720g, d18)) != null && a17.contains(a18)) {
                    com.tencent.mapsdk.internal.ks.b(this.f48720g, d18, a17.replaceAll(a18 + ",", ""));
                }
            }
        }
        return this.f48718e.f48729e.a(r1);
    }

    private void a(java.lang.String str, com.tencent.mapsdk.core.utils.cache.DiskCache.b bVar) {
        java.io.File file = bVar.f48724a;
        if (file == null) {
            return;
        }
        java.io.File parentFile = file.getParentFile();
        java.io.File b17 = com.tencent.mapsdk.internal.ks.b(parentFile, f48714b);
        java.lang.String str2 = str + "#" + bVar.toString();
        if (com.tencent.mapsdk.internal.ks.d(b17, str2) == -1) {
            com.tencent.mapsdk.internal.lb.a(f48713a).a("index writeLine data:".concat(java.lang.String.valueOf(str2)));
            com.tencent.mapsdk.internal.ks.c(b17, str2);
        }
        int d17 = com.tencent.mapsdk.internal.ks.d(this.f48720g, parentFile.getAbsolutePath());
        if (d17 != -1) {
            java.lang.String concat = ",".concat(java.lang.String.valueOf(str));
            java.lang.String a17 = com.tencent.mapsdk.internal.ks.a(this.f48720g, d17);
            if (a17 != null && !a17.contains(str)) {
                com.tencent.mapsdk.internal.lb.a(f48713a).a("root writeAppend data:".concat(java.lang.String.valueOf(concat)));
                com.tencent.mapsdk.internal.ks.a(this.f48720g, d17, ",".concat(java.lang.String.valueOf(str)));
            }
        } else {
            java.lang.String str3 = parentFile.getAbsolutePath() + "#" + str;
            com.tencent.mapsdk.internal.lb.a(f48713a).a("root writeLine data:".concat(java.lang.String.valueOf(str3)));
            com.tencent.mapsdk.internal.ks.c(this.f48720g, str3);
        }
        this.f48721h.put(str, parentFile.getAbsolutePath());
    }
}
