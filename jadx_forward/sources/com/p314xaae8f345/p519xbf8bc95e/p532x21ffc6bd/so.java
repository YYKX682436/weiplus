package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class so {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw f133033g;

    /* renamed from: h, reason: collision with root package name */
    boolean f133034h;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a f133037k;

    /* renamed from: a, reason: collision with root package name */
    public int f133027a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv.f133079a;

    /* renamed from: b, reason: collision with root package name */
    public int f133028b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public int f133029c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv.f133081c;

    /* renamed from: d, reason: collision with root package name */
    public int f133030d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f133031e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f133032f = 0;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f133038l = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 f133035i = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.DEFAULT;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 f133036j = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.zh;

    /* renamed from: com.tencent.mapsdk.internal.so$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f133039a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 f133040b;

        public AnonymousClass1(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6) {
            this.f133039a = context;
            this.f133040b = enumC26073x5a789ab6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean call() {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "开始初始化配置");
            android.content.Context context = this.f133039a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6 = this.f133040b;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
            java.lang.String a18 = i17 != 1 ? i17 != 2 ? null : a17.a("worldMapConfig_BING") : a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "本地配置数据：".concat(java.lang.String.valueOf(a18)));
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a18)) {
                try {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.this.f133033g = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(new org.json.JSONObject(a18), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw.class, new java.lang.Object[0]);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, e17);
                }
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so soVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.this;
                soVar.a(soVar.f133033g);
            } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kk.a("5.10.0", "4.3.1")) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.this.a(this.f133039a);
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "完成初始化配置");
            return null;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.so$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133044a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.m99821xcee59d22().length];
            f133044a = iArr;
            try {
                iArr[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f133044a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.SPARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private int e() {
        return this.f133030d;
    }

    private boolean f() {
        return this.f133031e;
    }

    private int g() {
        return this.f133032f;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = this.f133033g;
        if (swVar == null || (svVar = swVar.f133090b) == null) {
            return null;
        }
        return svVar.f133086h;
    }

    private boolean i() {
        return this.f133034h;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 j() {
        return this.f133035i;
    }

    private int k() {
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[this.f133035i.ordinal()];
        if (i17 != 1) {
            return i17 != 2 ? 0 : 1;
        }
        return 2;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 l() {
        return this.f133036j;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a m() {
        return this.f133037k;
    }

    public final java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = this.f133033g;
        if (swVar == null) {
            return null;
        }
        if (this.f133037k != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c(this.f133033g.f133090b));
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss ssVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss();
            ssVar.f133063a = new int[]{0, 18};
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st stVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.st();
            stVar.f133069b = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.f133006a;
            stVar.f133075h = true;
            stVar.f133068a = 1;
            stVar.f133070c = this.f133037k.m99822x47f52692();
            stVar.f133073f = this.f133037k.mo36975xfb822e21(true);
            stVar.f133074g = this.f133037k.mo36975xfb822e21(false);
            arrayList2.add(stVar);
            ssVar.f133064b = arrayList2;
            arrayList.add(0, ssVar);
            return arrayList;
        }
        return c(swVar.f133090b);
    }

    public final java.lang.String d() {
        if (this.f133037k != null) {
            return this.f133037k.m99823x77c71f71() + java.io.File.separator + this.f133036j.name();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx b17 = b();
        if (b17 == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17.f133093c);
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append(b17.f133092b);
        sb6.append(str);
        sb6.append(b17.f133094d);
        sb6.append(str);
        sb6.append(this.f133036j.name());
        return sb6.toString();
    }

    private java.io.File b(android.content.Context context) {
        return new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b(), a());
    }

    private com.tencent.mapsdk.internal.qc.b a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "开始更新配置：".concat(java.lang.String.valueOf(str)));
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw.class, new java.lang.Object[0]);
        if (swVar != null && (svVar = swVar.f133090b) != null) {
            if (swVar.f133089a != 0) {
                z17 = this.f133031e;
                this.f133031e = false;
            } else {
                z17 = !this.f133031e;
                this.f133031e = true;
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "权限是否更新：".concat(java.lang.String.valueOf(z17)));
            boolean z18 = svVar.f133085g != this.f133030d;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "协议版本是否更新：".concat(java.lang.String.valueOf(z18)));
            if (!(z18 | z17)) {
                return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr a17 = a(svVar);
            if (a17 != null) {
                int i17 = a17.f133061d;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar = a17.f133062e;
                if (sxVar != null) {
                    int i18 = sxVar.f133094d;
                    int i19 = sxVar.f133092b;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "版本对比: old[" + this.f133029c + "]-new[" + i18 + "]");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "样式对比: old[" + this.f133028b + "]-new[" + i19 + "]");
                    if (i18 != this.f133029c || i19 != this.f133028b || i17 != this.f133027a) {
                        java.io.File file = new java.io.File(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null).b(), a());
                        if (file.exists()) {
                            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                        }
                    }
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su suVar = svVar.f133086h;
            if (suVar != null) {
                java.lang.String str2 = suVar.f133078b;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置边界线: ".concat(java.lang.String.valueOf(str2)));
                a(str2);
                suVar.f133077a = this.f133032f;
            }
            this.f133033g = swVar;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6 = this.f133035i;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
            int i27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
            if (i27 == 1) {
                a18.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g, str);
            } else if (i27 == 2) {
                a18.a("worldMapConfig_BING", str);
            }
            a(this.f133033g);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新完成");
            return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "配置更新数据解析失败，使用上次的配置");
        return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx b() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = this.f133033g;
        if (swVar == null) {
            return null;
        }
        return b(swVar.f133090b);
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr a17;
        if (svVar == null || (a17 = a(svVar)) == null) {
            return null;
        }
        return a17.f133062e;
    }

    private static /* synthetic */ java.lang.String b(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
        if (i17 == 1) {
            return a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g);
        }
        if (i17 != 2) {
            return null;
        }
        return a17.a("worldMapConfig_BING");
    }

    private static java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar) {
        if (svVar != null) {
            return svVar.f133088j;
        }
        return null;
    }

    public final void a(java.lang.String str) {
        byte[] b17;
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "下载新边界数据：".concat(str));
        try {
            com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35998x180373eb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().m36003x30a95a().url(str).m35998x180373eb();
            java.io.InputStream m36024xc7995ab4 = m35998x180373eb.m36024xc7995ab4();
            if (m35998x180373eb.f16986xec0a8ff == 200) {
                java.lang.String str2 = android.text.TextUtils.isEmpty(m35998x180373eb.f16975xf6753cec) ? "gzip" : m35998x180373eb.f16975xf6753cec;
                if (str2 != null && str2.length() > 0 && str2.toLowerCase().contains("gzip")) {
                    b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(m36024xc7995ab4);
                } else {
                    b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.b(m36024xc7995ab4);
                }
                if (b17 == null || b17.length <= 0) {
                    return;
                }
                java.lang.String str3 = new java.lang.String(b17);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a();
                this.f133032f = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.b(str3);
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "新边界数据版本号：" + this.f133032f);
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.a().a(str3);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, th6);
        }
    }

    public final java.lang.String a() {
        boolean z17;
        java.lang.String str;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a abstractC26074xe626c11a = this.f133037k;
        if (abstractC26074xe626c11a != null) {
            z17 = abstractC26074xe626c11a.m99824x476ca46b(this.f133034h);
            str = "rastermap/customoversea/" + this.f133037k.m99822x47f52692();
        } else if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[this.f133035i.ordinal()] != 2) {
            z17 = true;
            str = "rastermap/world";
        } else {
            z17 = false;
            str = "rastermap/bingworld";
        }
        return str + ((this.f133034h && z17) ? "/dark" : "");
    }

    private void a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6, final com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.lang.Boolean> interfaceC4308xf9968465) {
        if (context == null) {
            return;
        }
        this.f133035i = enumC26073x5a789ab6;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass1(context, enumC26073x5a789ab6)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) (interfaceC4308xf9968465 != null ? new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.so.2
            private void a(java.lang.Boolean bool) {
                interfaceC4308xf9968465.mo35806xf5bc2045(bool);
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
            /* renamed from: callback */
            public final /* bridge */ /* synthetic */ void mo35806xf5bc2045(java.lang.Object obj) {
                interfaceC4308xf9968465.mo35806xf5bc2045((java.lang.Boolean) obj);
            }
        } : null));
    }

    private static java.lang.String a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
        if (i17 == 1) {
            return a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g);
        }
        if (i17 != 2) {
            return null;
        }
        return a17.a("worldMapConfig_BING");
    }

    private static void a(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6, java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.so.AnonymousClass3.f133044a[enumC26073x5a789ab6.ordinal()];
        if (i17 == 1) {
            a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g, str);
        } else {
            if (i17 != 2) {
                return;
            }
            a17.a("worldMapConfig_BING", str);
        }
    }

    public final void a(android.content.Context context) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(context);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "兼容老数据");
        int b17 = a17.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130923i, 1000);
        int b18 = a17.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130924j, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv.f133079a);
        int b19 = a17.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130925k, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv.f133081c);
        int b27 = a17.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130927m, 0);
        boolean c17 = a17.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130922h);
        java.lang.String a18 = a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130928n);
        int[] iArr = new int[0];
        try {
            java.lang.String a19 = a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130929o);
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a19)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(a19);
                int length = jSONArray.length();
                iArr = new int[length];
                for (int i17 = 0; i17 < length; i17++) {
                    iArr[i17] = jSONArray.getInt(i17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, e17);
        }
        java.lang.String a27 = a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130930p);
        int b28 = a17.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130926l, 0);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr srVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr();
        srVar.f133061d = 1;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx();
        sxVar.f133095e = a18;
        sxVar.f133096f = iArr;
        sxVar.f133093c = b18;
        sxVar.f133092b = b17;
        sxVar.f133094d = b19;
        srVar.f133062e = sxVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv();
        svVar.f133085g = b27;
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss> list = null;
        try {
            if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(a27)) {
                list = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35880xd8ef724c(new org.json.JSONArray(a27), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ss.class, new java.lang.Object[0]);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, e18);
        }
        svVar.f133088j = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(srVar);
        svVar.f133087i = arrayList;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su suVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su();
        suVar.f133077a = b28;
        svVar.f133086h = suVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw();
        this.f133033g = swVar;
        swVar.f133089a = c17 ? 0 : -1;
        swVar.f133090b = svVar;
        java.lang.String jSONObject = swVar.mo35868xcc31ba03().toString();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "老数据：".concat(java.lang.String.valueOf(jSONObject)));
        a17.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130921g, jSONObject);
        a17.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130923i, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130924j, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130925k, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130927m, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130922h, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130928n, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130929o, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130930p, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.f130926l});
        a(this.f133033g);
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "使用海外暗色模式？".concat(java.lang.String.valueOf(z17)));
        this.f133034h = z17;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a abstractC26074xe626c11a) {
        this.f133037k = abstractC26074xe626c11a;
    }

    private void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        this.f133036j = enumC26040xa3acf778;
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sw swVar) {
        if (swVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar = swVar.f133090b;
        if (svVar != null) {
            this.f133030d = svVar.f133085g;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "更新版本：" + this.f133030d);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.su suVar = svVar.f133086h;
            if (suVar != null) {
                this.f133032f = suVar.f133077a;
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "更新边界版本：" + this.f133029c);
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx b17 = b(svVar);
        if (b17 != null) {
            this.f133028b = b17.f133092b;
            this.f133027a = b17.f133093c;
            this.f133029c = b17.f133094d;
            this.f133038l = b17.f133095e;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "更新图源版本：" + this.f133029c);
        }
        this.f133031e = swVar.f133089a == 0;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sv svVar) {
        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr> list;
        if (svVar == null || (list = svVar.f133087i) == null) {
            return null;
        }
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sr srVar : list) {
            int i17 = srVar.f133061d;
            if (i17 == 2 && this.f133034h) {
                return srVar;
            }
            if (i17 == 1 && !this.f133034h) {
                return srVar;
            }
        }
        return null;
    }
}
