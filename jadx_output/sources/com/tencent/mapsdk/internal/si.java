package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class si extends com.tencent.mapsdk.internal.bm implements com.tencent.mapsdk.internal.ee {

    /* renamed from: b, reason: collision with root package name */
    private java.util.Map<java.lang.String, com.tencent.mapsdk.internal.sd> f51360b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.util.concurrent.atomic.AtomicInteger> f51361c;

    /* renamed from: d, reason: collision with root package name */
    private java.io.File f51362d;

    /* renamed from: e, reason: collision with root package name */
    private java.io.File f51363e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f51364f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f51365g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.List<com.tencent.mapsdk.internal.ej> f51366h;

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ek f51367i;

    /* renamed from: j, reason: collision with root package name */
    private com.tencent.mapsdk.internal.si.b f51368j;

    /* renamed from: k, reason: collision with root package name */
    private java.util.Set<java.lang.String> f51369k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f51370l;

    /* renamed from: com.tencent.mapsdk.internal.si$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f51379a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.ef.values().length];
            f51379a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.ef.Gradient.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f51379a[com.tencent.mapsdk.internal.ef.Aggregation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f51379a[com.tencent.mapsdk.internal.ef.ArcLine.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f51379a[com.tencent.mapsdk.internal.ef.GLModel.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public class a extends com.tencent.mapsdk.internal.mc implements com.tencent.mapsdk.internal.lv {

        /* renamed from: a, reason: collision with root package name */
        final java.lang.String f51380a;

        /* renamed from: b, reason: collision with root package name */
        com.tencent.map.tools.Callback<byte[]> f51381b;

        /* renamed from: c, reason: collision with root package name */
        com.tencent.mapsdk.internal.lw f51382c = new com.tencent.mapsdk.internal.lw();

        /* renamed from: e, reason: collision with root package name */
        private final java.lang.String f51384e;

        /* renamed from: f, reason: collision with root package name */
        private java.io.ByteArrayOutputStream f51385f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f51386g;

        public a(java.lang.String str, java.lang.String str2) {
            this.f51384e = str;
            this.f51380a = str2;
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str, com.tencent.mapsdk.internal.lx lxVar) {
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void b(java.lang.String str) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#cancel download {" + this.f51384e + "} [" + str + "]");
            com.tencent.mapsdk.internal.kt.a(this.f51385f);
            com.tencent.mapsdk.internal.sd n17 = com.tencent.mapsdk.internal.si.this.n(this.f51384e);
            if (n17 != null) {
                n17.a(1);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void c(java.lang.String str) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#completed download {" + this.f51384e + "} [" + str + "]");
            this.f51382c.b(this);
            if (this.f51381b != null) {
                byte[] byteArray = this.f51385f.toByteArray();
                byte[] a17 = "gzip".equals(this.f51386g) ? com.tencent.mapsdk.internal.kv.a(new java.io.ByteArrayInputStream(byteArray)) : byteArray;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("数据量大小 {");
                sb6.append(this.f51384e);
                sb6.append("} [");
                sb6.append(byteArray != null ? byteArray.length : 0);
                sb6.append(" : ");
                sb6.append(a17 != null ? a17.length : 0);
                sb6.append("]result:");
                sb6.append(new java.lang.String(a17));
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, sb6.toString());
                this.f51381b.callback(a17);
            }
            com.tencent.mapsdk.internal.kt.a(this.f51385f);
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void d(java.lang.String str) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#fail download {" + this.f51384e + "} [" + str + "]");
            com.tencent.mapsdk.internal.kt.a(this.f51385f);
            com.tencent.mapsdk.internal.sd n17 = com.tencent.mapsdk.internal.si.this.n(this.f51384e);
            if (n17 != null) {
                n17.a(1);
            }
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#start download {" + this.f51384e + "} [" + str + "]");
            this.f51385f = new java.io.ByteArrayOutputStream();
        }

        @Override // com.tencent.mapsdk.internal.lv
        public final void a(java.lang.String str, byte[] bArr) {
            if (bArr != null) {
                try {
                    this.f51385f.write(bArr);
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // com.tencent.mapsdk.internal.mc
        public final void a(com.tencent.map.tools.net.NetRequest.NetRequestBuilder netRequestBuilder) {
            super.a(netRequestBuilder);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#onPreConnect gzip {" + this.f51384e + "}");
            netRequestBuilder.gzip();
        }

        @Override // com.tencent.mapsdk.internal.mc
        public final void a(com.tencent.map.tools.net.NetResponse netResponse) {
            super.a(netResponse);
            this.f51386g = netResponse.contentEncoding;
        }

        private void a(com.tencent.map.tools.Callback<byte[]> callback) {
            this.f51382c.a(this);
            this.f51382c.a(this.f51380a, this);
            this.f51381b = callback;
        }
    }

    /* loaded from: classes13.dex */
    public static class b extends android.os.Handler {

        /* renamed from: a, reason: collision with root package name */
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.si> f51387a;

        public b(com.tencent.mapsdk.internal.si siVar) {
            super(android.os.Looper.getMainLooper());
            this.f51387a = new java.lang.ref.WeakReference<>(siVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            com.tencent.mapsdk.internal.si siVar = this.f51387a.get();
            if (siVar == null || message.what == 0) {
                return;
            }
            java.lang.String str = (java.lang.String) message.obj;
            int i17 = message.arg2;
            if (message.arg1 > 0) {
                if (i17 > 0) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "循环刷新[" + str + "]次数[" + i17 + "]");
                    com.tencent.mapsdk.internal.si.a(siVar, str);
                }
                message.arg2 = i17 + 1;
                sendMessageDelayed(android.os.Message.obtain(message), r6.arg1);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    private java.lang.String h(java.lang.String str) {
        com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a17 = com.tencent.mapsdk.internal.sh.a(str);
        if (a17 == null) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse));
        }
        java.lang.String str2 = a17.commandFunction;
        if (android.text.TextUtils.isEmpty(str2)) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported));
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand functionType: [" + str2 + "]");
        com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a18 = com.tencent.mapsdk.internal.sh.a(str, str2);
        if (getMapContext().f48999b.getMap().getVisualSettings() == null) {
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.internal.bindErrorMsg("visualsettings is null")));
        }
        com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeVisualLayerSettings = getMapContext().f48999b.getMap().getVisualSettings().executeVisualLayerSettings(a18);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand returnJson:" + com.tencent.mapsdk.internal.sh.a(executeVisualLayerSettings));
        return com.tencent.mapsdk.internal.sh.a(executeVisualLayerSettings);
    }

    private void i(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mapsdk.internal.ks.b(this.f51363e);
        com.tencent.mapsdk.internal.ks.a(this.f51363e, str.getBytes());
    }

    private void j(java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#refreshLayerData[" + str + "]");
        com.tencent.mapsdk.internal.sd sdVar = this.f51360b.get(str);
        if (sdVar != null) {
            sdVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.io.File k(java.lang.String str) {
        return new java.io.File(new java.io.File(this.f51362d, com.tencent.map.tools.Util.getMD5String(o(str))), "cache.dat");
    }

    private java.io.File l(java.lang.String str) {
        return new java.io.File(this.f51362d, com.tencent.map.tools.Util.getMD5String(o(str)));
    }

    private com.tencent.mapsdk.internal.ej m(java.lang.String str) {
        final java.lang.String o17 = o(str);
        return (com.tencent.mapsdk.internal.ej) com.tencent.map.tools.Util.singleWhere(new java.util.ArrayList(this.f51366h), new com.tencent.map.tools.Condition<com.tencent.mapsdk.internal.ej>() { // from class: com.tencent.mapsdk.internal.si.3
            private boolean a(com.tencent.mapsdk.internal.ej ejVar) {
                return ejVar != null && ejVar.f49281a.equals(o17);
            }

            @Override // com.tencent.map.tools.Condition
            public final /* synthetic */ boolean condition(com.tencent.mapsdk.internal.ej ejVar) {
                com.tencent.mapsdk.internal.ej ejVar2 = ejVar;
                return ejVar2 != null && ejVar2.f49281a.equals(o17);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.mapsdk.internal.sd n(final java.lang.String str) {
        return (com.tencent.mapsdk.internal.sd) com.tencent.map.tools.Util.singleWhere(this.f51360b.values(), new com.tencent.map.tools.Condition<com.tencent.mapsdk.internal.sd>() { // from class: com.tencent.mapsdk.internal.si.4
            private boolean a(com.tencent.mapsdk.internal.sd sdVar) {
                return sdVar != null && sdVar.getId().equals(str);
            }

            @Override // com.tencent.map.tools.Condition
            public final /* synthetic */ boolean condition(com.tencent.mapsdk.internal.sd sdVar) {
                com.tencent.mapsdk.internal.sd sdVar2 = sdVar;
                return sdVar2 != null && sdVar2.getId().equals(str);
            }
        });
    }

    private static java.lang.String o(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        return str.substring(0, str.lastIndexOf("_") == -1 ? str.length() : str.lastIndexOf("_"));
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final synchronized void a(android.content.Context context) {
        super.a(context);
        this.f51360b = new java.util.concurrent.ConcurrentHashMap();
        this.f51361c = new java.util.concurrent.ConcurrentHashMap();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "VisualLayerManager onCreate...");
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final synchronized void c_() {
        super.c_();
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.sd> map = this.f51360b;
        if (map != null) {
            for (com.tencent.mapsdk.internal.sd sdVar : map.values()) {
                if (!sdVar.isRemoved()) {
                    sdVar.remove();
                }
            }
            this.f51360b.clear();
        }
        this.f51361c.clear();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "VisualLayerManager onDestroy...");
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void d(com.tencent.mapsdk.internal.bn bnVar) {
        org.json.JSONObject json;
        super.d(bnVar);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#restoreLayerJsonToLocal");
        com.tencent.mapsdk.internal.ek ekVar = this.f51367i;
        if (ekVar != null && this.f51365g && (json = ekVar.toJson()) != null) {
            i(json.toString());
        }
        com.tencent.mapsdk.internal.sh.b();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "退出数据图层成功");
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final boolean e(java.lang.String str) {
        com.tencent.mapsdk.internal.sd n17;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#checkLayerStatusById[" + str + "]");
        if (this.f51365g) {
            com.tencent.mapsdk.internal.ej m17 = m(str);
            if (m17 != null && (n17 = n(str)) != null) {
                int i17 = com.tencent.mapsdk.internal.si.AnonymousClass5.f51379a[com.tencent.mapsdk.internal.ef.a(m17.f49282b).ordinal()];
                if (i17 == 1) {
                    n17.f51330b = new com.tencent.mapsdk.internal.sg();
                } else if (i17 == 2) {
                    n17.f51330b = new com.tencent.mapsdk.internal.sb();
                } else if (i17 == 3) {
                    n17.f51330b = new com.tencent.mapsdk.internal.sc();
                } else if (i17 == 4) {
                    n17.f51330b = new com.tencent.mapsdk.internal.sf();
                }
            }
            if (m17 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void f(java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50224y, "添加到等待队列[" + str + "]");
        this.f51369k.add(str);
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void g(java.lang.String str) {
        java.lang.String o17 = o(str);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#stopTimeInterval[" + str + "]");
        if (android.text.TextUtils.isEmpty(o17)) {
            return;
        }
        this.f51368j.removeMessages(o17.hashCode());
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void b(java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#removeLayer[" + str + "]");
        java.util.Map<java.lang.String, com.tencent.mapsdk.internal.sd> map = this.f51360b;
        if (map != null) {
            map.remove(str);
        }
        g(str);
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void c(java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#clearCache[" + str + "]");
        if (str == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.io.File l17 = l(str);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "执行删除文件[" + l17 + "]");
        com.tencent.mapsdk.internal.ks.f(l17);
        a(str, 0, 0);
    }

    private void f() {
        org.json.JSONObject json;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#restoreLayerJsonToLocal");
        com.tencent.mapsdk.internal.ek ekVar = this.f51367i;
        if (ekVar == null || !this.f51365g || (json = ekVar.toJson()) == null) {
            return;
        }
        i(json.toString());
    }

    private boolean b(org.json.JSONObject jSONObject) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#parseLayerInfoJson:".concat(java.lang.String.valueOf(jSONObject)));
        com.tencent.mapsdk.internal.ek ekVar = (com.tencent.mapsdk.internal.ek) com.tencent.map.tools.json.JsonUtils.parseToModel(jSONObject, com.tencent.mapsdk.internal.ek.class, new java.lang.Object[0]);
        if (ekVar != null) {
            this.f51365g = ekVar.a();
            this.f51366h.clear();
            java.util.List<com.tencent.mapsdk.internal.ej> list = ekVar.f49290a;
            if (list != null && !list.isEmpty()) {
                this.f51366h.addAll(list);
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "解析LayerInfo数据成功");
            this.f51367i = ekVar;
            return true;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50224y, "解析LayerInfo数据失败");
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(com.tencent.mapsdk.internal.bn bnVar) {
        super.a(bnVar);
        this.f51370l = false;
        this.f51368j = new com.tencent.mapsdk.internal.si.b(this);
        this.f51366h = new java.util.concurrent.CopyOnWriteArrayList();
        this.f51369k = new java.util.HashSet();
        this.f51364f = bnVar.F().f49009a;
        if (!android.text.TextUtils.isEmpty(bnVar.F().f49011c)) {
            this.f51364f = bnVar.F().f49011c;
        }
        this.f51362d = new java.io.File(bnVar.E().b(), "visual/".concat(java.lang.String.valueOf(bnVar.F().c())));
        this.f51363e = new java.io.File(this.f51362d, "layerInfo.json");
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#datalayer config file [" + this.f51363e + "]");
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#loadLayerJsonFromLocal");
        byte[] c17 = com.tencent.mapsdk.internal.ks.c(this.f51363e);
        if (c17 != null && c17.length > 0) {
            try {
                b(new org.json.JSONObject(new java.lang.String(c17)));
            } catch (org.json.JSONException unused) {
            }
        }
        com.tencent.mapsdk.internal.sh.a();
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final java.lang.String d(java.lang.String str) {
        return l(o(str)).getAbsolutePath();
    }

    private void e() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#loadLayerJsonFromLocal");
        byte[] c17 = com.tencent.mapsdk.internal.ks.c(this.f51363e);
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
    @Override // com.tencent.mapsdk.internal.ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r10, com.tencent.map.tools.Callback<byte[]> r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.si.b(java.lang.String, com.tencent.map.tools.Callback):void");
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final com.tencent.map.sdk.comps.vis.VisualLayer a(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions == null) {
            return null;
        }
        java.lang.String layerId = visualLayerOptions.getLayerId();
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#createLayer layerId [" + layerId + "]");
        java.lang.String o17 = o(layerId);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#createLayer baseLayerId [" + o17 + "]");
        com.tencent.mapsdk.internal.sd sdVar = this.f51360b.get(layerId);
        if (sdVar != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#createLayer layerId [" + layerId + "] already exists");
            sdVar.a(visualLayerOptions);
            return sdVar;
        }
        com.tencent.mapsdk.internal.sd sdVar2 = new com.tencent.mapsdk.internal.sd(visualLayerOptions);
        this.f51360b.put(visualLayerOptions.getLayerId(), sdVar2);
        if (this.f51361c.get(o17) != null) {
            this.f51361c.get(o17).incrementAndGet();
        } else {
            this.f51361c.put(o17, new java.util.concurrent.atomic.AtomicInteger(1));
        }
        sdVar2.a(this);
        return sdVar2;
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final int a(java.lang.String str) {
        if (this.f51361c.get(str) != null) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#getRefCount [" + str + "], refCnt=[" + this.f51361c.get(str).get() + "]");
            return this.f51361c.get(str).get();
        }
        this.f51361c.put(str, new java.util.concurrent.atomic.AtomicInteger(1));
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#getRefCount [" + str + "], refCnt=[" + this.f51361c.get(str).get() + "]");
        return this.f51361c.get(str).get();
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void a(java.lang.String str, int i17, int i18) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#updateLayerVersionInfo[" + str + "], dv=" + i17 + " sv=" + i18);
        com.tencent.mapsdk.internal.ej m17 = m(str);
        if (m17 != null) {
            if (i18 != m17.f49284d) {
                m17.f49285e = null;
            }
            m17.f49284d = i18;
            if (i17 != m17.f49283c) {
                m17.f49285e = null;
            }
            m17.f49283c = i17;
        }
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final boolean a() {
        return this.f51370l;
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void a(org.json.JSONObject jSONObject) {
        boolean z17;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#saveLayerInfosToLocal[" + jSONObject + "]");
        this.f51370l = true;
        if (jSONObject != null) {
            z17 = b(jSONObject);
            if (z17) {
                i(jSONObject.toString());
                if (!this.f51369k.isEmpty()) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "初始化等待队列图层[" + this.f51369k.size() + "]");
                    java.util.Iterator<java.lang.String> it = this.f51369k.iterator();
                    while (it.hasNext()) {
                        com.tencent.mapsdk.internal.sd sdVar = this.f51360b.get(it.next());
                        if (sdVar != null) {
                            sdVar.a(this);
                        }
                    }
                    this.f51369k.clear();
                }
            }
        } else {
            z17 = false;
            this.f51365g = false;
            this.f51366h.clear();
            this.f51367i = null;
        }
        if (z17 && this.f51365g) {
            return;
        }
        com.tencent.map.tools.Util.foreach(this.f51360b.values(), new com.tencent.map.tools.Callback<com.tencent.mapsdk.internal.sd>() { // from class: com.tencent.mapsdk.internal.si.1
            private static void a(com.tencent.mapsdk.internal.sd sdVar2) {
                if (sdVar2 != null) {
                    sdVar2.a(2);
                    sdVar2.a();
                }
            }

            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(com.tencent.mapsdk.internal.sd sdVar2) {
                com.tencent.mapsdk.internal.sd sdVar3 = sdVar2;
                if (sdVar3 != null) {
                    sdVar3.a(2);
                    sdVar3.a();
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void a(final java.lang.String str, final com.tencent.map.tools.Callback<byte[]> callback) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#readLayerDataFromCache[" + str + "]");
        if (callback != null) {
            com.tencent.mapsdk.internal.ko.b(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.si.2
                @Override // java.lang.Runnable
                public final void run() {
                    callback.callback(com.tencent.mapsdk.internal.ks.c(com.tencent.mapsdk.internal.si.this.k(str)));
                }
            });
        }
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void a(java.lang.String str, byte[] bArr) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#saveLayerData[" + str + "]");
        java.io.File k17 = k(str);
        java.io.File e17 = com.tencent.mapsdk.internal.ks.e(k17);
        com.tencent.mapsdk.internal.ks.a(e17, bArr);
        com.tencent.mapsdk.internal.ks.a(e17, k17);
    }

    @Override // com.tencent.mapsdk.internal.ee
    public final void a(java.lang.String str, int i17) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#startTimeInterval[" + str + "], hash = " + str.hashCode() + " timeInterval = " + i17);
        if (i17 <= 0 || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f51368j.removeMessages(str.hashCode());
        android.os.Message.obtain(this.f51368j, str.hashCode(), i17 * 1000, 0, str).sendToTarget();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.tencent.tencentmap.mapsdk.maps.TencentMap] */
    @Override // com.tencent.mapsdk.internal.ee
    public final java.lang.String a(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str) {
        if (visualLayer == null) {
            com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a17 = com.tencent.mapsdk.internal.sh.a(str);
            if (a17 == null) {
                return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse));
            }
            java.lang.String str2 = a17.commandFunction;
            if (android.text.TextUtils.isEmpty(str2)) {
                return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported));
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand functionType: [" + str2 + "]");
            com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a18 = com.tencent.mapsdk.internal.sh.a(str, str2);
            if (getMapContext().f48999b.getMap().getVisualSettings() != null) {
                com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus executeVisualLayerSettings = getMapContext().f48999b.getMap().getVisualSettings().executeVisualLayerSettings(a18);
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "executeCommand returnJson:" + com.tencent.mapsdk.internal.sh.a(executeVisualLayerSettings));
                return com.tencent.mapsdk.internal.sh.a(executeVisualLayerSettings);
            }
            return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.internal.bindErrorMsg("visualsettings is null")));
        }
        if (this.f51360b.containsKey(visualLayer.getId())) {
            return visualLayer.executeCommand(getMapContext().f48999b.getMap(), str);
        }
        return com.tencent.mapsdk.internal.sh.a(new com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.internal.bindErrorMsg("layerId[" + visualLayer.getId() + "] doesn't exists")));
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.si siVar, java.lang.String str) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "#refreshLayerData[" + str + "]");
        com.tencent.mapsdk.internal.sd sdVar = siVar.f51360b.get(str);
        if (sdVar != null) {
            sdVar.b(siVar);
        }
    }
}
