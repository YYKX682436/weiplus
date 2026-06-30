package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class by implements com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2 {

    /* renamed from: a, reason: collision with root package name */
    com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 f130588a;

    /* renamed from: b, reason: collision with root package name */
    com.tencent.mapsdk.internal.by.a f130589b;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f130590c;

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz f130591d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 f130592e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f130593f;

    /* renamed from: g, reason: collision with root package name */
    private final java.io.File f130594g;

    /* renamed from: h, reason: collision with root package name */
    private final java.io.File f130595h;

    /* renamed from: i, reason: collision with root package name */
    private final java.io.File f130596i;

    /* renamed from: j, reason: collision with root package name */
    private java.lang.String f130597j;

    /* renamed from: k, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw f130598k;

    /* renamed from: l, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.by.b f130599l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f130600m;

    /* renamed from: n, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn f130601n;

    /* loaded from: classes13.dex */
    public interface a {
        void a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, int i17);

        void a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, boolean z17);

        void b(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, boolean z17);
    }

    /* loaded from: classes13.dex */
    public class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ly implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv {

        /* renamed from: c, reason: collision with root package name */
        private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx f130606c;

        /* renamed from: d, reason: collision with root package name */
        private java.io.File f130607d;

        private b() {
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str) {
            this.f130607d = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130593f, this.f131936b + ".tmp");
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "开始下载:[" + this.f130607d + "]");
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.START);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void b(java.lang.String str) {
            if (this.f130607d != null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "取消下载:[" + this.f130607d + "]");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130607d);
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.CANCEL);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void c(java.lang.String str) {
            java.io.File file = this.f130607d;
            if (file == null || !file.exists()) {
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "完成下载:[" + this.f130607d + "]");
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "创建城市缓存文件:[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130595h + "]");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130595h);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130607d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130594g);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.a();
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130595h.exists()) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "缓存文件创建失败！");
                return;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "解压成功:[" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130595h + "]");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz bzVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130591d;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130590c;
            if (mvVar != null) {
                mvVar.a(bzVar.f130610c + "-md5", bzVar.f130609b);
                mvVar.a(bzVar.f130610c + "-version", bzVar.f130612e);
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "保持城市缓存信息:[" + bzVar + "]");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130598k.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130599l);
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130589b != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130589b.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, 100);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130589b.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, false);
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.COMPLETED);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void d(java.lang.String str) {
            if (this.f130607d != null) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "缓存文件下载失败！");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130607d);
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.ERROR);
            }
        }

        public /* synthetic */ b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by byVar, byte b17) {
            this();
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str, byte[] bArr) {
            java.io.File file;
            if (android.text.TextUtils.isEmpty(str) || !str.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130597j) || bArr == null) {
                return;
            }
            if (this.f130606c == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx.RUNNING && (file = this.f130607d) != null) {
                int length = (int) ((file.length() * 100) / com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130591d.f130611d);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130589b != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130589b.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, length);
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "缓存文件下载中:：length: " + this.f130607d.length() + "：" + length + "%");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130607d, bArr);
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.DOWNLOADING);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "下载状态：".concat(java.lang.String.valueOf(lxVar)));
            this.f130606c = lxVar;
        }
    }

    public by(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar, java.lang.String str, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz bzVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv mvVar, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33) {
        this.f130601n = bnVar;
        this.f130590c = mvVar;
        this.f130592e = c4265xa1eefb76;
        this.f130591d = bzVar;
        this.f130588a = interfaceC4272xb18c4f33;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw lwVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw();
        this.f130598k = lwVar;
        this.f130599l = new com.tencent.mapsdk.internal.by.b(this, (byte) 0);
        lwVar.f131913b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ht.d();
        this.f130593f = str;
        this.f130594g = new java.io.File(str, bzVar.f130610c + ".zip");
        this.f130595h = new java.io.File(str, bzVar.a());
        this.f130596i = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(bnVar.mo36630x76847179(), (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).d(), bzVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (r7.f130595h.exists() == false) goto L24;
     */
    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: checkInvalidate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean mo35511xda914863() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.tencent.mapsdk.internal.bz r0 = r7.f130591d     // Catch: java.lang.Throwable -> Lb7
            r1 = 0
            if (r0 == 0) goto Lac
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r2.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r0.f130608a     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = java.io.File.separator     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = r0.f130610c     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            int r3 = r0.f130612e     // Catch: java.lang.Throwable -> Lb7
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r3 = ".zip"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb7
            r7.f130597j = r2     // Catch: java.lang.Throwable -> Lb7
            com.tencent.mapsdk.internal.mv r2 = r7.f130590c     // Catch: java.lang.Throwable -> Lb7
            r3 = 1
            if (r2 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r0.f130610c     // Catch: java.lang.Throwable -> Lb7
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "-md5"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r2.a(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r5.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = r0.f130610c     // Catch: java.lang.Throwable -> Lb7
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r6 = "-version"
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lb7
            r6 = -1
            int r2 = r2.b(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            int r5 = r0.f130612e     // Catch: java.lang.Throwable -> Lb7
            if (r5 != r2) goto L6c
            if (r4 == 0) goto L6e
            java.lang.String r0 = r0.f130609b     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto L6e
        L6c:
            r0 = r3
            goto L6f
        L6e:
            r0 = r1
        L6f:
            java.lang.String r2 = "OM"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "检查是否需要更新:["
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(r2, r4)     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto Lab
            boolean r2 = r7.f130600m     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lab
            java.io.File r2 = r7.f130595h     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lab
            java.io.File r0 = r7.f130594g     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto La9
            r7.a()     // Catch: java.lang.Throwable -> Lb7
            java.io.File r0 = r7.f130595h     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto Lac
        La9:
            r1 = r3
            goto Lac
        Lab:
            r1 = r0
        Lac:
            com.tencent.mapsdk.internal.by$a r0 = r7.f130589b     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto Lb5
            com.tencent.map.sdk.comps.offlinemap.OfflineItem r2 = r7.f130592e     // Catch: java.lang.Throwable -> Lb7
            r0.b(r2, r1)     // Catch: java.lang.Throwable -> Lb7
        Lb5:
            monitor-exit(r7)
            return r1
        Lb7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.mo35511xda914863():boolean");
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: close */
    public final boolean mo35512x5a5ddf8() {
        return b(this.f130601n);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: open */
    public final boolean mo35513x34264a() {
        return a(this.f130601n);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: removeCache */
    public final boolean mo35514xeced795e() {
        boolean z17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130594g) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130595h);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "删除[" + this.f130591d.f130610c + "]离线缓存");
        return z17;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: startDownload */
    public final void mo35515x5cae6f0a() {
        if (this.f130601n == null) {
            com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33 = this.f130588a;
            if (interfaceC4272xb18c4f33 != null) {
                interfaceC4272xb18c4f33.m35528xed0a9ac3(this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.ERROR);
                return;
            }
            return;
        }
        if (this.f130594g.exists()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.by.2
                private java.lang.Boolean a() {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by byVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this;
                    return java.lang.Boolean.valueOf(byVar.a(byVar.f130601n));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by byVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this;
                    return java.lang.Boolean.valueOf(byVar.a(byVar.f130601n));
                }
            }).a((com.tencent.mapsdk.internal.ko.a) new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.by.1
                private void a(java.lang.Boolean bool) {
                    if (!bool.booleanValue()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.mo35515x5cae6f0a();
                    } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.COMPLETED);
                    }
                }

                @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                /* renamed from: callback */
                public final /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.mo35515x5cae6f0a();
                    } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130588a.m35528xed0a9ac3(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.COMPLETED);
                    }
                }
            });
            return;
        }
        if (!mo35511xda914863() || android.text.TextUtils.isEmpty(this.f130597j)) {
            com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f332 = this.f130588a;
            if (interfaceC4272xb18c4f332 != null) {
                interfaceC4272xb18c4f332.m35528xed0a9ac3(this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.ERROR);
                return;
            }
            return;
        }
        if (this.f130588a != null) {
            this.f130598k.a(this.f130599l);
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "请求下载:[" + this.f130597j + "]");
        this.f130598k.a(this.f130597j, this.f130599l);
        com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f333 = this.f130588a;
        if (interfaceC4272xb18c4f333 != null) {
            interfaceC4272xb18c4f333.m35528xed0a9ac3(this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.READY);
        }
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2
    /* renamed from: stopDownload */
    public final void mo35516xf2c12aa() {
        if (android.text.TextUtils.isEmpty(this.f130597j)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "停止下载:[" + this.f130597j + "]");
        this.f130598k.b(this.f130597j);
    }

    private void a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33) {
        this.f130588a = interfaceC4272xb18c4f33;
    }

    public final synchronized boolean b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (this.f130596i.exists() && bnVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bs J2 = bnVar.J();
            J2.c();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130596i, this.f130595h);
            J2.d();
            J2.f();
            com.tencent.mapsdk.internal.by.a aVar = this.f130589b;
            if (aVar != null) {
                aVar.a(this.f130592e, false);
            }
            com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33 = this.f130588a;
            if (interfaceC4272xb18c4f33 != null) {
                interfaceC4272xb18c4f33.m35528xed0a9ac3(this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.CLOSE);
            }
            this.f130600m = false;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "关闭[" + this.f130591d.f130610c + "]离线");
            return true;
        }
        return false;
    }

    private void a(com.tencent.mapsdk.internal.by.a aVar) {
        this.f130589b = aVar;
    }

    public final synchronized boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        if (bnVar == null) {
            return false;
        }
        a();
        if (!this.f130595h.exists()) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bs J2 = bnVar.J();
        J2.c();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f130595h, this.f130596i);
        J2.d();
        J2.f();
        this.f130600m = true;
        com.tencent.mapsdk.internal.by.a aVar = this.f130589b;
        if (aVar != null) {
            aVar.a(this.f130592e, true);
        }
        com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33 = this.f130588a;
        if (interfaceC4272xb18c4f33 != null) {
            interfaceC4272xb18c4f33.m35528xed0a9ac3(this.f130592e, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.EnumC4271xf32cc395.OPEN);
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "开启[" + this.f130591d.f130610c + "]离线");
        return true;
    }

    private void b() {
        this.f130589b = null;
        this.f130588a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f130594g.exists()) {
            try {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "开始缓存文件校验...");
                java.lang.String a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(this.f130594g);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "结束缓存文件校验...");
                if (!this.f130591d.f130609b.equals(a17)) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "缓存文件MD5不一致！");
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130594g);
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130595h);
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(this.f130594g, this.f130595h.getParent(), new java.io.FilenameFilter() { // from class: com.tencent.mapsdk.internal.by.3
                        @Override // java.io.FilenameFilter
                        public final boolean accept(java.io.File file, java.lang.String str) {
                            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by.this.f130595h.getName().equals(str);
                        }
                    });
                }
            } catch (java.io.IOException unused) {
            }
        }
    }
}
