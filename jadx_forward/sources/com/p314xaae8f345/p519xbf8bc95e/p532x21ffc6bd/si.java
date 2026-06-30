package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class si extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee {

    /* renamed from: b, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd> f132893b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> f132894c;

    /* renamed from: d, reason: collision with root package name */
    private java.io.File f132895d;

    /* renamed from: e, reason: collision with root package name */
    private java.io.File f132896e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f132897f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f132898g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej> f132899h;

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek f132900i;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.mapsdk.internal.si.b f132901j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.Set<java.lang.String> f132902k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f132903l;

    /* renamed from: com.tencent.mapsdk.internal.si$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f132912a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.m36707xcee59d22().length];
            f132912a = iArr;
            try {
                iArr[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.Gradient.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f132912a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.Aggregation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f132912a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.ArcLine.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f132912a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.GLModel.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mc implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv {

        /* renamed from: a, reason: collision with root package name */
        final java.lang.String f132913a;

        /* renamed from: b, reason: collision with root package name */
        com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]> f132914b;

        /* renamed from: c, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw f132915c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lw();

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.String f132917e;

        /* renamed from: f, reason: collision with root package name */
        private java.io.ByteArrayOutputStream f132918f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f132919g;

        public a(java.lang.String str, java.lang.String str2) {
            this.f132917e = str;
            this.f132913a = str2;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lx lxVar) {
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void b(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#cancel download {" + this.f132917e + "} [" + str + "]");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132918f);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd n17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.this.n(this.f132917e);
            if (n17 != null) {
                n17.a(1);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void c(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#completed download {" + this.f132917e + "} [" + str + "]");
            this.f132915c.b(this);
            if (this.f132914b != null) {
                byte[] byteArray = this.f132918f.toByteArray();
                byte[] a17 = "gzip".equals(this.f132919g) ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(new java.io.ByteArrayInputStream(byteArray)) : byteArray;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("数据量大小 {");
                sb6.append(this.f132917e);
                sb6.append("} [");
                sb6.append(byteArray != null ? byteArray.length : 0);
                sb6.append(" : ");
                sb6.append(a17 != null ? a17.length : 0);
                sb6.append("]result:");
                sb6.append(new java.lang.String(a17));
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, sb6.toString());
                this.f132914b.mo35806xf5bc2045(a17);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132918f);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void d(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#fail download {" + this.f132917e + "} [" + str + "]");
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f132918f);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd n17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.this.n(this.f132917e);
            if (n17 != null) {
                n17.a(1);
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#start download {" + this.f132917e + "} [" + str + "]");
            this.f132918f = new java.io.ByteArrayOutputStream();
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lv
        public final void a(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f132918f.write(bArr);
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mc
        public final void a(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252.NetRequestBuilder netRequestBuilder) {
            super.a(netRequestBuilder);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#onPreConnect gzip {" + this.f132917e + "}");
            netRequestBuilder.m36003x30a95a();
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mc
        public final void a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
            super.a(c4330xdd3bdcde);
            this.f132919g = c4330xdd3bdcde.f16975xf6753cec;
        }

        private void a(com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]> interfaceC4308xf9968465) {
            this.f132915c.a(this);
            this.f132915c.a(this.f132913a, this);
            this.f132914b = interfaceC4308xf9968465;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si> f132920a;

        public b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si siVar) {
            super(android.os.Looper.getMainLooper());
            this.f132920a = new java.lang.ref.WeakReference<>(siVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si siVar = this.f132920a.get();
            if (siVar == null || message.what == 0) {
                return;
            }
            java.lang.String str = (java.lang.String) message.obj;
            int i17 = message.arg2;
            if (message.arg1 > 0) {
                if (i17 > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "循环刷新[" + str + "]次数[" + i17 + "]");
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.a(siVar, str);
                }
                message.arg2 = i17 + 1;
                sendMessageDelayed(android.os.Message.obtain(message), r6.arg1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    private java.lang.String h(java.lang.String str) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str);
        if (a17 == null) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse));
        }
        java.lang.String str2 = a17.f16376x268d3c43;
        if (android.text.TextUtils.isEmpty(str2)) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported));
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand functionType: [" + str2 + "]");
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str, str2);
        if (mo36621x2de760a9().f130532b.mo36068xb5885626().mo37468xd5f33479() == null) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.internal.m35429x3d29bbb6("visualsettings is null")));
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo37080x9d52ef7f = mo36621x2de760a9().f130532b.mo36068xb5885626().mo37468xd5f33479().mo37080x9d52ef7f(a18);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand returnJson:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo37080x9d52ef7f));
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo37080x9d52ef7f);
    }

    private void i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f132896e);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(this.f132896e, str.getBytes());
    }

    private void j(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#refreshLayerData[" + str + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar = this.f132893b.get(str);
        if (sdVar != null) {
            sdVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File k(java.lang.String str) {
        return new java.io.File(new java.io.File(this.f132895d, com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(o(str))), "cache.dat");
    }

    private java.io.File l(java.lang.String str) {
        return new java.io.File(this.f132895d, com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(o(str)));
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej m(java.lang.String str) {
        final java.lang.String o17 = o(str);
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35854x9851b57f(new java.util.ArrayList(this.f132899h), new com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej>() { // from class: com.tencent.mapsdk.internal.si.3
            private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej ejVar) {
                return ejVar != null && ejVar.f130814a.equals(o17);
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb
            /* renamed from: condition */
            public final /* synthetic */ boolean mo35808xcca96d1b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej ejVar) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej ejVar2 = ejVar;
                return ejVar2 != null && ejVar2.f130814a.equals(o17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd n(final java.lang.String str) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd) com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35854x9851b57f(this.f132893b.values(), new com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd>() { // from class: com.tencent.mapsdk.internal.si.4
            private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar) {
                return sdVar != null && sdVar.mo36409x5db1b11().equals(str);
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb
            /* renamed from: condition */
            public final /* synthetic */ boolean mo35808xcca96d1b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar2 = sdVar;
                return sdVar2 != null && sdVar2.mo36409x5db1b11().equals(str);
            }
        });
    }

    private static java.lang.String o(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(0, str.lastIndexOf("_") == -1 ? str.length() : str.lastIndexOf("_"));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final synchronized void a(android.content.Context context) {
        super.a(context);
        this.f132893b = new java.util.concurrent.ConcurrentHashMap();
        this.f132894c = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "VisualLayerManager onCreate...");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final synchronized void c_() {
        super.c_();
        java.util.Map<java.lang.String, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd> map = this.f132893b;
        if (map != null) {
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar : map.values()) {
                if (!sdVar.mo36411x1e855fd6()) {
                    sdVar.mo36414xc84af884();
                }
            }
            this.f132893b.clear();
        }
        this.f132894c.clear();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "VisualLayerManager onDestroy...");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        org.json.JSONObject mo35868xcc31ba03;
        super.d(bnVar);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#restoreLayerJsonToLocal");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek ekVar = this.f132900i;
        if (ekVar != null && this.f132898g && (mo35868xcc31ba03 = ekVar.mo35868xcc31ba03()) != null) {
            i(mo35868xcc31ba03.toString());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.b();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "退出数据图层成功");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final boolean e(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd n17;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#checkLayerStatusById[" + str + "]");
        if (this.f132898g) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej m17 = m(str);
            if (m17 != null && (n17 = n(str)) != null) {
                int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.AnonymousClass5.f132912a[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.a(m17.f130815b).ordinal()];
                if (i17 == 1) {
                    n17.f132863b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sg();
                } else if (i17 == 2) {
                    n17.f132863b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sb();
                } else if (i17 == 3) {
                    n17.f132863b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sc();
                } else if (i17 == 4) {
                    n17.f132863b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sf();
                }
            }
            if (m17 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void f(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "添加到等待队列[" + str + "]");
        this.f132902k.add(str);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void g(java.lang.String str) {
        java.lang.String o17 = o(str);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#stopTimeInterval[" + str + "]");
        if (android.text.TextUtils.isEmpty(o17)) {
            return;
        }
        this.f132901j.removeMessages(o17.hashCode());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void b(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#removeLayer[" + str + "]");
        java.util.Map<java.lang.String, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd> map = this.f132893b;
        if (map != null) {
            map.remove(str);
        }
        g(str);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void c(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#clearCache[" + str + "]");
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.io.File l17 = l(str);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "执行删除文件[" + l17 + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(l17);
        a(str, 0, 0);
    }

    private void f() {
        org.json.JSONObject mo35868xcc31ba03;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#restoreLayerJsonToLocal");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek ekVar = this.f132900i;
        if (ekVar == null || !this.f132898g || (mo35868xcc31ba03 = ekVar.mo35868xcc31ba03()) == null) {
            return;
        }
        i(mo35868xcc31ba03.toString());
    }

    private boolean b(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#parseLayerInfoJson:".concat(java.lang.String.valueOf(jSONObject)));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek ekVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONObject, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ek.class, new java.lang.Object[0]);
        if (ekVar != null) {
            this.f132898g = ekVar.a();
            this.f132899h.clear();
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej> list = ekVar.f130823a;
            if (list != null && !list.isEmpty()) {
                this.f132899h.addAll(list);
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "解析LayerInfo数据成功");
            this.f132900i = ekVar;
            return true;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "解析LayerInfo数据失败");
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.a(bnVar);
        this.f132903l = false;
        this.f132901j = new com.tencent.mapsdk.internal.si.b(this);
        this.f132899h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f132902k = new java.util.HashSet();
        this.f132897f = bnVar.F().f130542a;
        if (!android.text.TextUtils.isEmpty(bnVar.F().f130544c)) {
            this.f132897f = bnVar.F().f130544c;
        }
        this.f132895d = new java.io.File(bnVar.E().b(), "visual/".concat(java.lang.String.valueOf(bnVar.F().c())));
        this.f132896e = new java.io.File(this.f132895d, "layerInfo.json");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#datalayer config file [" + this.f132896e + "]");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#loadLayerJsonFromLocal");
        byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f132896e);
        if (c17 != null && c17.length > 0) {
            try {
                b(new org.json.JSONObject(new java.lang.String(c17)));
            } catch (org.json.JSONException unused) {
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final java.lang.String d(java.lang.String str) {
        return l(o(str)).getAbsolutePath();
    }

    private void e() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#loadLayerJsonFromLocal");
        byte[] c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f132896e);
        if (c17 == null || c17.length <= 0) {
            return;
        }
        try {
            b(new org.json.JSONObject(new java.lang.String(c17)));
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r10, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]> r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.b(java.lang.String, com.tencent.map.tools.Callback):void");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d) {
        if (c4274xbcec938d == null) {
            return null;
        }
        java.lang.String m35541x3b4d0a16 = c4274xbcec938d.m35541x3b4d0a16();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#createLayer layerId [" + m35541x3b4d0a16 + "]");
        java.lang.String o17 = o(m35541x3b4d0a16);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#createLayer baseLayerId [" + o17 + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar = this.f132893b.get(m35541x3b4d0a16);
        if (sdVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#createLayer layerId [" + m35541x3b4d0a16 + "] already exists");
            sdVar.a(c4274xbcec938d);
            return sdVar;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd(c4274xbcec938d);
        this.f132893b.put(c4274xbcec938d.m35541x3b4d0a16(), sdVar2);
        if (this.f132894c.get(o17) != null) {
            this.f132894c.get(o17).incrementAndGet();
        } else {
            this.f132894c.put(o17, new java.util.concurrent.atomic.AtomicInteger(1));
        }
        sdVar2.a(this);
        return sdVar2;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final int a(java.lang.String str) {
        if (this.f132894c.get(str) != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#getRefCount [" + str + "], refCnt=[" + this.f132894c.get(str).get() + "]");
            return this.f132894c.get(str).get();
        }
        this.f132894c.put(str, new java.util.concurrent.atomic.AtomicInteger(1));
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#getRefCount [" + str + "], refCnt=[" + this.f132894c.get(str).get() + "]");
        return this.f132894c.get(str).get();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#updateLayerVersionInfo[" + str + "], dv=" + i17 + " sv=" + i18);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej m17 = m(str);
        if (m17 != null) {
            if (i18 != m17.f130817d) {
                m17.f130818e = null;
            }
            m17.f130817d = i18;
            if (i17 != m17.f130816c) {
                m17.f130818e = null;
            }
            m17.f130816c = i17;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final boolean a() {
        return this.f132903l;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void a(org.json.JSONObject jSONObject) {
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#saveLayerInfosToLocal[" + jSONObject + "]");
        this.f132903l = true;
        if (jSONObject != null) {
            z17 = b(jSONObject);
            if (z17) {
                i(jSONObject.toString());
                if (!this.f132902k.isEmpty()) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "初始化等待队列图层[" + this.f132902k.size() + "]");
                    java.util.Iterator<java.lang.String> it = this.f132902k.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar = this.f132893b.get(it.next());
                        if (sdVar != null) {
                            sdVar.a(this);
                        }
                    }
                    this.f132902k.clear();
                }
            }
        } else {
            z17 = false;
            this.f132898g = false;
            this.f132899h.clear();
            this.f132900i = null;
        }
        if (z17 && this.f132898g) {
            return;
        }
        com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35824xd79b624a(this.f132893b.values(), new com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd>() { // from class: com.tencent.mapsdk.internal.si.1
            private static void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar2) {
                if (sdVar2 != null) {
                    sdVar2.a(2);
                    sdVar2.a();
                }
            }

            @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* synthetic */ void mo35806xf5bc2045(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar2) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar3 = sdVar2;
                if (sdVar3 != null) {
                    sdVar3.a(2);
                    sdVar3.a();
                }
            }
        });
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void a(final java.lang.String str, final com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<byte[]> interfaceC4308xf9968465) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#readLayerDataFromCache[" + str + "]");
        if (interfaceC4308xf9968465 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.b(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.si.2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC4308xf9968465.mo35806xf5bc2045(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si.this.k(str)));
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void a(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#saveLayerData[" + str + "]");
        java.io.File k17 = k(str);
        java.io.File e17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.e(k17);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(e17, bArr);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(e17, k17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final void a(java.lang.String str, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#startTimeInterval[" + str + "], hash = " + str.hashCode() + " timeInterval = " + i17);
        if (i17 <= 0 || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f132901j.removeMessages(str.hashCode());
        android.os.Message.obtain(this.f132901j, str.hashCode(), i17 * 1000, 0, str).sendToTarget();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ee
    public final java.lang.String a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str) {
        if (interfaceC4273x137f8dd1 == null) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str);
            if (a17 == null) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.jsonparse));
            }
            java.lang.String str2 = a17.f16376x268d3c43;
            if (android.text.TextUtils.isEmpty(str2)) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.unsupported));
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand functionType: [" + str2 + "]");
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(str, str2);
            if (mo36621x2de760a9().f130532b.mo36068xb5885626().mo37468xd5f33479() != null) {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus mo37080x9d52ef7f = mo36621x2de760a9().f130532b.mo36068xb5885626().mo37468xd5f33479().mo37080x9d52ef7f(a18);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "executeCommand returnJson:" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo37080x9d52ef7f));
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(mo37080x9d52ef7f);
            }
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.internal.m35429x3d29bbb6("visualsettings is null")));
        }
        if (this.f132893b.containsKey(interfaceC4273x137f8dd1.mo36409x5db1b11())) {
            return interfaceC4273x137f8dd1.mo35533xf3bb2216(mo36621x2de760a9().f130532b.mo36068xb5885626(), str);
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sh.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ErrorReturnInfo.ErrorMsg.internal.m35429x3d29bbb6("layerId[" + interfaceC4273x137f8dd1.mo36409x5db1b11() + "] doesn't exists")));
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.si siVar, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "#refreshLayerData[" + str + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sd sdVar = siVar.f132893b.get(str);
        if (sdVar != null) {
            sdVar.b(siVar);
        }
    }
}
