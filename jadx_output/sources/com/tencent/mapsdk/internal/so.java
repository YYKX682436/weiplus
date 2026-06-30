package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class so {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.internal.sw f51500g;

    /* renamed from: h, reason: collision with root package name */
    boolean f51501h;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider f51504k;

    /* renamed from: a, reason: collision with root package name */
    public int f51494a = com.tencent.mapsdk.internal.sv.f51546a;

    /* renamed from: b, reason: collision with root package name */
    public int f51495b = 1000;

    /* renamed from: c, reason: collision with root package name */
    public int f51496c = com.tencent.mapsdk.internal.sv.f51548c;

    /* renamed from: d, reason: collision with root package name */
    public int f51497d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f51498e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f51499f = 0;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.String f51505l = null;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource f51502i = com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.model.Language f51503j = com.tencent.tencentmap.mapsdk.maps.model.Language.zh;

    /* renamed from: com.tencent.mapsdk.internal.so$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.tencent.mapsdk.internal.ko.g<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f51506a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource f51507b;

        public AnonymousClass1(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource) {
            this.f51506a = context;
            this.f51507b = overSeaSource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean call() {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "开始初始化配置");
            android.content.Context context = this.f51506a;
            com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = this.f51507b;
            com.tencent.mapsdk.internal.my a17 = com.tencent.mapsdk.internal.my.a(context);
            int i17 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
            java.lang.String a18 = i17 != 1 ? i17 != 2 ? null : a17.a("worldMapConfig_BING") : a17.a(com.tencent.mapsdk.internal.er.f49388g);
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "本地配置数据：".concat(java.lang.String.valueOf(a18)));
            if (!com.tencent.mapsdk.internal.hr.a(a18)) {
                try {
                    com.tencent.mapsdk.internal.so.this.f51500g = (com.tencent.mapsdk.internal.sw) com.tencent.map.tools.json.JsonUtils.parseToModel(new org.json.JSONObject(a18), com.tencent.mapsdk.internal.sw.class, new java.lang.Object[0]);
                } catch (org.json.JSONException e17) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, e17);
                }
                com.tencent.mapsdk.internal.so soVar = com.tencent.mapsdk.internal.so.this;
                soVar.a(soVar.f51500g);
            } else if (com.tencent.mapsdk.internal.kk.a("5.10.0", "4.3.1")) {
                com.tencent.mapsdk.internal.so.this.a(this.f51506a);
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "完成初始化配置");
            return null;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.so$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51511a;

        static {
            int[] iArr = new int[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.values().length];
            f51511a = iArr;
            try {
                iArr[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51511a[com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource.SPARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private int e() {
        return this.f51497d;
    }

    private boolean f() {
        return this.f51498e;
    }

    private int g() {
        return this.f51499f;
    }

    private com.tencent.mapsdk.internal.su h() {
        com.tencent.mapsdk.internal.sv svVar;
        com.tencent.mapsdk.internal.sw swVar = this.f51500g;
        if (swVar == null || (svVar = swVar.f51557b) == null) {
            return null;
        }
        return svVar.f51553h;
    }

    private boolean i() {
        return this.f51501h;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource j() {
        return this.f51502i;
    }

    private int k() {
        int i17 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[this.f51502i.ordinal()];
        if (i17 != 1) {
            return i17 != 2 ? 0 : 1;
        }
        return 2;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Language l() {
        return this.f51503j;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider m() {
        return this.f51504k;
    }

    public final java.util.List<com.tencent.mapsdk.internal.ss> c() {
        com.tencent.mapsdk.internal.sw swVar = this.f51500g;
        if (swVar == null) {
            return null;
        }
        if (this.f51504k != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(c(this.f51500g.f51557b));
            com.tencent.mapsdk.internal.ss ssVar = new com.tencent.mapsdk.internal.ss();
            ssVar.f51530a = new int[]{0, 18};
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            com.tencent.mapsdk.internal.st stVar = new com.tencent.mapsdk.internal.st();
            stVar.f51536b = com.tencent.mapsdk.internal.sm.f51473a;
            stVar.f51542h = true;
            stVar.f51535a = 1;
            stVar.f51537c = this.f51504k.getProviderName();
            stVar.f51540f = this.f51504k.getLogo(true);
            stVar.f51541g = this.f51504k.getLogo(false);
            arrayList2.add(stVar);
            ssVar.f51531b = arrayList2;
            arrayList.add(0, ssVar);
            return arrayList;
        }
        return c(swVar.f51557b);
    }

    public final java.lang.String d() {
        if (this.f51504k != null) {
            return this.f51504k.getProviderVersion() + java.io.File.separator + this.f51503j.name();
        }
        com.tencent.mapsdk.internal.sx b17 = b();
        if (b17 == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17.f51560c);
        java.lang.String str = java.io.File.separator;
        sb6.append(str);
        sb6.append(b17.f51559b);
        sb6.append(str);
        sb6.append(b17.f51561d);
        sb6.append(str);
        sb6.append(this.f51503j.name());
        return sb6.toString();
    }

    private java.io.File b(android.content.Context context) {
        return new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b(), a());
    }

    private com.tencent.mapsdk.internal.qc.b a(android.content.Context context, java.lang.String str) {
        com.tencent.mapsdk.internal.sv svVar;
        boolean z17;
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "开始更新配置：".concat(java.lang.String.valueOf(str)));
        com.tencent.mapsdk.internal.sw swVar = (com.tencent.mapsdk.internal.sw) com.tencent.map.tools.json.JsonUtils.parseToModel(str, com.tencent.mapsdk.internal.sw.class, new java.lang.Object[0]);
        if (swVar != null && (svVar = swVar.f51557b) != null) {
            if (swVar.f51556a != 0) {
                z17 = this.f51498e;
                this.f51498e = false;
            } else {
                z17 = !this.f51498e;
                this.f51498e = true;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "权限是否更新：".concat(java.lang.String.valueOf(z17)));
            boolean z18 = svVar.f51552g != this.f51497d;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "协议版本是否更新：".concat(java.lang.String.valueOf(z18)));
            if (!(z18 | z17)) {
                return com.tencent.mapsdk.internal.qc.b.SUCCESS_NO_UPDATE;
            }
            com.tencent.mapsdk.internal.sr a17 = a(svVar);
            if (a17 != null) {
                int i17 = a17.f51528d;
                com.tencent.mapsdk.internal.sx sxVar = a17.f51529e;
                if (sxVar != null) {
                    int i18 = sxVar.f51561d;
                    int i19 = sxVar.f51559b;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "版本对比: old[" + this.f51496c + "]-new[" + i18 + "]");
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "样式对比: old[" + this.f51495b + "]-new[" + i19 + "]");
                    if (i18 != this.f51496c || i19 != this.f51495b || i17 != this.f51494a) {
                        java.io.File file = new java.io.File(com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null).b(), a());
                        if (file.exists()) {
                            com.tencent.mapsdk.internal.ks.b(file);
                            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "删除海外图缓存目录: ".concat(java.lang.String.valueOf(file)));
                        }
                    }
                }
            }
            com.tencent.mapsdk.internal.su suVar = svVar.f51553h;
            if (suVar != null) {
                java.lang.String str2 = suVar.f51545b;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置边界线: ".concat(java.lang.String.valueOf(str2)));
                a(str2);
                suVar.f51544a = this.f51499f;
            }
            this.f51500g = swVar;
            com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource = this.f51502i;
            com.tencent.mapsdk.internal.my a18 = com.tencent.mapsdk.internal.my.a(context);
            int i27 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
            if (i27 == 1) {
                a18.a(com.tencent.mapsdk.internal.er.f49388g, str);
            } else if (i27 == 2) {
                a18.a("worldMapConfig_BING", str);
            }
            a(this.f51500g);
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新完成");
            return com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "配置更新数据解析失败，使用上次的配置");
        return com.tencent.mapsdk.internal.qc.b.FAIL_DATA_EMPTY;
    }

    public final com.tencent.mapsdk.internal.sx b() {
        com.tencent.mapsdk.internal.sw swVar = this.f51500g;
        if (swVar == null) {
            return null;
        }
        return b(swVar.f51557b);
    }

    private com.tencent.mapsdk.internal.sx b(com.tencent.mapsdk.internal.sv svVar) {
        com.tencent.mapsdk.internal.sr a17;
        if (svVar == null || (a17 = a(svVar)) == null) {
            return null;
        }
        return a17.f51529e;
    }

    private static /* synthetic */ java.lang.String b(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource) {
        com.tencent.mapsdk.internal.my a17 = com.tencent.mapsdk.internal.my.a(context);
        int i17 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
        if (i17 == 1) {
            return a17.a(com.tencent.mapsdk.internal.er.f49388g);
        }
        if (i17 != 2) {
            return null;
        }
        return a17.a("worldMapConfig_BING");
    }

    private static java.util.List<com.tencent.mapsdk.internal.ss> c(com.tencent.mapsdk.internal.sv svVar) {
        if (svVar != null) {
            return svVar.f51555j;
        }
        return null;
    }

    public final void a(java.lang.String str) {
        byte[] b17;
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "下载新边界数据：".concat(str));
        try {
            com.tencent.map.tools.net.NetResponse doStream = com.tencent.map.tools.net.NetManager.getInstance().builder().gzip().url(str).doStream();
            java.io.InputStream inputStream = doStream.getInputStream();
            if (doStream.statusCode == 200) {
                java.lang.String str2 = android.text.TextUtils.isEmpty(doStream.contentEncoding) ? "gzip" : doStream.contentEncoding;
                if (str2 != null && str2.length() > 0 && str2.toLowerCase().contains("gzip")) {
                    b17 = com.tencent.mapsdk.internal.kv.a(inputStream);
                } else {
                    b17 = com.tencent.mapsdk.internal.kt.b(inputStream);
                }
                if (b17 == null || b17.length <= 0) {
                    return;
                }
                java.lang.String str3 = new java.lang.String(b17);
                com.tencent.mapsdk.internal.sm.a();
                this.f51499f = com.tencent.mapsdk.internal.sm.b(str3);
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "新边界数据版本号：" + this.f51499f);
                com.tencent.mapsdk.internal.sm.a().a(str3);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, th6);
        }
    }

    public final java.lang.String a() {
        boolean z17;
        java.lang.String str;
        com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider = this.f51504k;
        if (overSeaTileProvider != null) {
            z17 = overSeaTileProvider.onDayNightChange(this.f51501h);
            str = "rastermap/customoversea/" + this.f51504k.getProviderName();
        } else if (com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[this.f51502i.ordinal()] != 2) {
            z17 = true;
            str = "rastermap/world";
        } else {
            z17 = false;
            str = "rastermap/bingworld";
        }
        return str + ((this.f51501h && z17) ? "/dark" : "");
    }

    private void a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource, final com.tencent.map.tools.Callback<java.lang.Boolean> callback) {
        if (context == null) {
            return;
        }
        this.f51502i = overSeaSource;
        com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.so.AnonymousClass1(context, overSeaSource)).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) (callback != null ? new com.tencent.mapsdk.internal.ko.a<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.so.2
            private void a(java.lang.Boolean bool) {
                callback.callback(bool);
            }

            @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
            public final /* bridge */ /* synthetic */ void callback(java.lang.Object obj) {
                callback.callback((java.lang.Boolean) obj);
            }
        } : null));
    }

    private static java.lang.String a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource) {
        com.tencent.mapsdk.internal.my a17 = com.tencent.mapsdk.internal.my.a(context);
        int i17 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
        if (i17 == 1) {
            return a17.a(com.tencent.mapsdk.internal.er.f49388g);
        }
        if (i17 != 2) {
            return null;
        }
        return a17.a("worldMapConfig_BING");
    }

    private static void a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource overSeaSource, java.lang.String str) {
        com.tencent.mapsdk.internal.my a17 = com.tencent.mapsdk.internal.my.a(context);
        int i17 = com.tencent.mapsdk.internal.so.AnonymousClass3.f51511a[overSeaSource.ordinal()];
        if (i17 == 1) {
            a17.a(com.tencent.mapsdk.internal.er.f49388g, str);
        } else {
            if (i17 != 2) {
                return;
            }
            a17.a("worldMapConfig_BING", str);
        }
    }

    public final void a(android.content.Context context) {
        com.tencent.mapsdk.internal.my a17 = com.tencent.mapsdk.internal.my.a(context);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "兼容老数据");
        int b17 = a17.b(com.tencent.mapsdk.internal.er.f49390i, 1000);
        int b18 = a17.b(com.tencent.mapsdk.internal.er.f49391j, com.tencent.mapsdk.internal.sv.f51546a);
        int b19 = a17.b(com.tencent.mapsdk.internal.er.f49392k, com.tencent.mapsdk.internal.sv.f51548c);
        int b27 = a17.b(com.tencent.mapsdk.internal.er.f49394m, 0);
        boolean c17 = a17.c(com.tencent.mapsdk.internal.er.f49389h);
        java.lang.String a18 = a17.a(com.tencent.mapsdk.internal.er.f49395n);
        int[] iArr = new int[0];
        try {
            java.lang.String a19 = a17.a(com.tencent.mapsdk.internal.er.f49396o);
            if (!com.tencent.mapsdk.internal.hr.a(a19)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(a19);
                int length = jSONArray.length();
                iArr = new int[length];
                for (int i17 = 0; i17 < length; i17++) {
                    iArr[i17] = jSONArray.getInt(i17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, e17);
        }
        java.lang.String a27 = a17.a(com.tencent.mapsdk.internal.er.f49397p);
        int b28 = a17.b(com.tencent.mapsdk.internal.er.f49393l, 0);
        com.tencent.mapsdk.internal.sr srVar = new com.tencent.mapsdk.internal.sr();
        srVar.f51528d = 1;
        com.tencent.mapsdk.internal.sx sxVar = new com.tencent.mapsdk.internal.sx();
        sxVar.f51562e = a18;
        sxVar.f51563f = iArr;
        sxVar.f51560c = b18;
        sxVar.f51559b = b17;
        sxVar.f51561d = b19;
        srVar.f51529e = sxVar;
        com.tencent.mapsdk.internal.sv svVar = new com.tencent.mapsdk.internal.sv();
        svVar.f51552g = b27;
        java.util.List<com.tencent.mapsdk.internal.ss> list = null;
        try {
            if (!com.tencent.mapsdk.internal.hr.a(a27)) {
                list = com.tencent.map.tools.json.JsonUtils.parseToList(new org.json.JSONArray(a27), com.tencent.mapsdk.internal.ss.class, new java.lang.Object[0]);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, e18);
        }
        svVar.f51555j = list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(srVar);
        svVar.f51554i = arrayList;
        com.tencent.mapsdk.internal.su suVar = new com.tencent.mapsdk.internal.su();
        suVar.f51544a = b28;
        svVar.f51553h = suVar;
        com.tencent.mapsdk.internal.sw swVar = new com.tencent.mapsdk.internal.sw();
        this.f51500g = swVar;
        swVar.f51556a = c17 ? 0 : -1;
        swVar.f51557b = svVar;
        java.lang.String jSONObject = swVar.toJson().toString();
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "老数据：".concat(java.lang.String.valueOf(jSONObject)));
        a17.a(com.tencent.mapsdk.internal.er.f49388g, jSONObject);
        a17.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.f49390i, com.tencent.mapsdk.internal.er.f49391j, com.tencent.mapsdk.internal.er.f49392k, com.tencent.mapsdk.internal.er.f49394m, com.tencent.mapsdk.internal.er.f49389h, com.tencent.mapsdk.internal.er.f49395n, com.tencent.mapsdk.internal.er.f49396o, com.tencent.mapsdk.internal.er.f49397p, com.tencent.mapsdk.internal.er.f49393l});
        a(this.f51500g);
    }

    public final void a(boolean z17) {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "使用海外暗色模式？".concat(java.lang.String.valueOf(z17)));
        this.f51501h = z17;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider) {
        this.f51504k = overSeaTileProvider;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        this.f51503j = language;
    }

    public final void a(com.tencent.mapsdk.internal.sw swVar) {
        if (swVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.sv svVar = swVar.f51557b;
        if (svVar != null) {
            this.f51497d = svVar.f51552g;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "更新版本：" + this.f51497d);
            com.tencent.mapsdk.internal.su suVar = svVar.f51553h;
            if (suVar != null) {
                this.f51499f = suVar.f51544a;
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "更新边界版本：" + this.f51496c);
            }
        }
        com.tencent.mapsdk.internal.sx b17 = b(svVar);
        if (b17 != null) {
            this.f51495b = b17.f51559b;
            this.f51494a = b17.f51560c;
            this.f51496c = b17.f51561d;
            this.f51505l = b17.f51562e;
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50208i, "更新图源版本：" + this.f51496c);
        }
        this.f51498e = swVar.f51556a == 0;
    }

    public final com.tencent.mapsdk.internal.sr a(com.tencent.mapsdk.internal.sv svVar) {
        java.util.List<com.tencent.mapsdk.internal.sr> list;
        if (svVar == null || (list = svVar.f51554i) == null) {
            return null;
        }
        for (com.tencent.mapsdk.internal.sr srVar : list) {
            int i17 = srVar.f51528d;
            if (i17 == 2 && this.f51501h) {
                return srVar;
            }
            if (i17 == 1 && !this.f51501h) {
                return srVar;
            }
        }
        return null;
    }
}
