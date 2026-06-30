package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class ca extends com.tencent.mapsdk.internal.bm implements com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent, com.tencent.mapsdk.internal.by.a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f49085b = "key_offline_map_opened_cities";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f49086c = "key_offline_map_config_version";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f49087d = "key_offline_map_config_md5";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f49088e = "key_offline_map_config_url";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f49089f = "sdk_offline_city_ver.json";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f49090g = "offline_city_list.json";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f49091h = "key_offline_map_items_state";

    /* renamed from: i, reason: collision with root package name */
    private com.tencent.mapsdk.internal.mv f49092i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f49093j;

    /* renamed from: n, reason: collision with root package name */
    private java.io.File f49097n;

    /* renamed from: o, reason: collision with root package name */
    private java.io.File f49098o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f49099p;

    /* renamed from: q, reason: collision with root package name */
    private com.tencent.mapsdk.internal.cb f49100q;

    /* renamed from: s, reason: collision with root package name */
    private volatile com.tencent.map.tools.Callback<java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem>> f49102s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener> f49103t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f49104u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f49105v;

    /* renamed from: k, reason: collision with root package name */
    private java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> f49094k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> f49095l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.ca.a> f49096m = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Map<com.tencent.mapsdk.internal.bz, com.tencent.mapsdk.internal.by> f49101r = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public static class a extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f49108a;

        /* renamed from: b, reason: collision with root package name */
        int f49109b;

        /* renamed from: c, reason: collision with root package name */
        boolean f49110c;

        private a() {
        }
    }

    public static /* synthetic */ com.tencent.map.tools.Callback b(com.tencent.mapsdk.internal.ca caVar) {
        caVar.f49102s = null;
        return null;
    }

    public static /* synthetic */ boolean c(com.tencent.mapsdk.internal.ca caVar) {
        caVar.f49104u = false;
        return false;
    }

    private void h() {
        com.tencent.mapsdk.internal.cb cbVar = this.f49100q;
        if (cbVar == null || cbVar.f49115e == null || this.f49094k.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "添加item的数据状态");
        java.util.Set<java.lang.String> keySet = this.f49096m.keySet();
        for (com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem : this.f49094k) {
            java.util.Iterator<com.tencent.mapsdk.internal.bz> it = this.f49100q.f49115e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (offlineItem.getPinyin().equals(it.next().f49077c)) {
                        offlineItem.setSize(r5.f49078d);
                        java.util.Iterator<java.lang.String> it6 = keySet.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (offlineItem.getPinyin().equals(it6.next())) {
                                    com.tencent.mapsdk.internal.by a17 = a(offlineItem, (com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener) null);
                                    if (a17 != null) {
                                        offlineItem.setUpgrade(a17.checkInvalidate());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "添加item的数据状态完成！！");
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void c_() {
        super.c_();
        for (java.util.Map.Entry<com.tencent.mapsdk.internal.bz, com.tencent.mapsdk.internal.by> entry : this.f49101r.entrySet()) {
            com.tencent.mapsdk.internal.by value = entry.getValue();
            if (value != null) {
                value.f49056b = null;
                value.f49055a = null;
            }
            entry.setValue(null);
        }
        this.f49101r.clear();
        this.f49102s = null;
        this.f49103t = null;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public com.tencent.map.sdk.comps.offlinemap.OfflineItemController getOfflineItemController(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener) {
        if (this.f49093j) {
            return a(offlineItem, offlineStatusChangedListener);
        }
        return null;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public synchronized java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> getOfflineItemList() {
        for (com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem : this.f49094k) {
            com.tencent.mapsdk.internal.ca.a aVar = this.f49096m.get(offlineItem.getPinyin());
            if (aVar != null) {
                offlineItem.setPercentage(aVar.f49109b);
                offlineItem.setUpgrade(aVar.f49110c);
            }
        }
        return this.f49095l;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public boolean isOfflineMapEnable() {
        return this.f49093j;
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public void syncLatestData(com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener offlineMapSyncedListener) {
        this.f49103t = new java.lang.ref.WeakReference<>(offlineMapSyncedListener);
        if (this.f49104u) {
            return;
        }
        e(getMapContext());
    }

    private void e(com.tencent.mapsdk.internal.bn bnVar) {
        java.lang.String b17 = this.f49092i.b(f49085b, "");
        if (this.f49093j || !android.text.TextUtils.isEmpty(b17)) {
            com.tencent.mapsdk.internal.hg hgVar = bnVar.f49000c;
            if (hgVar != null) {
                hgVar.p().a();
            }
            if (this.f49104u) {
                return;
            }
            this.f49104u = true;
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.ca.2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.tencent.mapsdk.internal.ca.this.f49105v = false;
                    if (!com.tencent.mapsdk.internal.ca.this.f49093j) {
                        com.tencent.mapsdk.internal.ca caVar = com.tencent.mapsdk.internal.ca.this;
                        com.tencent.mapsdk.internal.ca.a(caVar, caVar.getMapContext());
                        return null;
                    }
                    com.tencent.mapsdk.internal.ca caVar2 = com.tencent.mapsdk.internal.ca.this;
                    caVar2.f49105v = caVar2.f();
                    com.tencent.mapsdk.internal.ca caVar3 = com.tencent.mapsdk.internal.ca.this;
                    caVar3.f49105v = com.tencent.mapsdk.internal.ca.h(caVar3);
                    return null;
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.ko.a<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.ca.1
                @Override // com.tencent.mapsdk.internal.ko.a, com.tencent.map.tools.Callback
                public final void callback(java.lang.Object obj) {
                    com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener offlineMapSyncedListener;
                    if (com.tencent.mapsdk.internal.ca.this.f49102s != null) {
                        com.tencent.mapsdk.internal.ca.this.f49102s.callback(com.tencent.mapsdk.internal.ca.this.getOfflineItemList());
                        com.tencent.mapsdk.internal.ca.b(com.tencent.mapsdk.internal.ca.this);
                    }
                    com.tencent.mapsdk.internal.ca.c(com.tencent.mapsdk.internal.ca.this);
                    if (com.tencent.mapsdk.internal.ca.this.f49103t == null || (offlineMapSyncedListener = (com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener) com.tencent.mapsdk.internal.ca.this.f49103t.get()) == null) {
                        return;
                    }
                    offlineMapSyncedListener.onSynced(com.tencent.mapsdk.internal.ca.this.f49105v);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        com.tencent.mapsdk.internal.bn mapContext = getMapContext();
        if (mapContext == null) {
            return false;
        }
        int b17 = this.f49092i.b(f49086c);
        java.lang.String a17 = this.f49092i.a(f49087d);
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "检查离线配置更新, 当前v:" + b17 + "|md5:" + a17 + "obj:" + this);
        com.tencent.mapsdk.internal.ds dsVar = (com.tencent.mapsdk.internal.ds) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.ds.class);
        java.util.ArrayList<com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq> arrayList = new java.util.ArrayList<>();
        com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq fileUpdateReq = new com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq(f49089f, b17, a17);
        arrayList.add(fileUpdateReq);
        com.tencent.mapsdk.internal.eb.a<com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp> checkUpdate = ((com.tencent.mapsdk.internal.dd) dsVar.i()).checkUpdate(com.tencent.mapsdk.internal.hn.i(), com.tencent.mapsdk.internal.hn.d(), com.tencent.mapsdk.internal.hn.m(), com.tencent.mapsdk.internal.hn.g(), mapContext.F().b(), arrayList, mapContext.F().b(), mapContext.I(), "", mapContext.H(), "");
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线配置请求更新结束：" + checkUpdate.toHumanString());
        if (checkUpdate.available()) {
            com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateRsp fileUpdateRsp = checkUpdate.f49233a.vItems.get(0);
            java.lang.String a18 = this.f49097n.exists() ? com.tencent.mapsdk.internal.lh.a(this.f49097n) : null;
            if (this.f49097n.exists() && (fileUpdateRsp == null || !f49089f.equals(fileUpdateRsp.sName) || fileUpdateRsp.iVersion == fileUpdateReq.iVersion || android.text.TextUtils.isEmpty(fileUpdateRsp.sUpdateUrl) || fileUpdateRsp.iFileSize == 0 || fileUpdateRsp.iFileUpdated == 0 || android.text.TextUtils.isEmpty(fileUpdateRsp.sMd5) || fileUpdateRsp.sMd5.equals(a18))) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "跳过更新");
            } else {
                java.lang.String str = fileUpdateRsp.sUpdateUrl;
                java.lang.String str2 = fileUpdateRsp.sMd5;
                int i17 = fileUpdateRsp.iVersion;
                if (fileUpdateRsp.iFileUpdated == 0 && !this.f49097n.exists()) {
                    str = this.f49092i.b(f49088e, "");
                    str2 = this.f49092i.b(f49087d, "");
                    i17 = this.f49092i.b(f49086c, 0);
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "离线配置文件的请求链接为空！");
                    return false;
                }
                if (com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).downloadTo(this.f49097n).available()) {
                    if (com.tencent.mapsdk.internal.lh.a(this.f49097n).equals(str2)) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线配置文件下载成功");
                        this.f49092i.a(f49086c, i17);
                        this.f49092i.a(f49087d, str2);
                        this.f49092i.a(f49088e, str);
                    } else {
                        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线配置文件MD5校验失败");
                        com.tencent.mapsdk.internal.ks.b(this.f49097n);
                    }
                }
            }
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线地图配置请求错误：" + checkUpdate.toHumanString());
        }
        if (this.f49097n.exists()) {
            try {
                java.lang.Object nextValue = new org.json.JSONTokener(new java.lang.String(com.tencent.mapsdk.internal.ks.c(this.f49097n))).nextValue();
                if (nextValue instanceof org.json.JSONObject) {
                    this.f49100q = (com.tencent.mapsdk.internal.cb) com.tencent.map.tools.json.JsonUtils.parseToModel((org.json.JSONObject) nextValue, com.tencent.mapsdk.internal.cb.class, new java.lang.Object[0]);
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "创建离线配置文件对象数据：" + this.f49100q);
                }
            } catch (org.json.JSONException unused) {
            }
        } else {
            com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "离线配置文件不存在！");
        }
        if (this.f49100q == null) {
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "获得离线配置成功！");
        return true;
    }

    private boolean g() {
        if (!this.f49098o.exists()) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "请求离线城市列表...");
            com.tencent.mapsdk.internal.ea.a downloadOfflineMapCityList = ((com.tencent.mapsdk.internal.dd) ((com.tencent.mapsdk.internal.ds) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.ds.class)).i()).downloadOfflineMapCityList(this.f49099p);
            downloadOfflineMapCityList.charset = com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding;
            if (downloadOfflineMapCityList.available()) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表下载成功");
                com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    a(aVar.f49235a);
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表解析成功");
                }
            }
        } else {
            a(new java.lang.String(com.tencent.mapsdk.internal.ks.c(this.f49098o)));
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表使用缓存");
        }
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list = this.f49094k;
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "获得离线城市列表成功！");
        return true;
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void b(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, boolean z17) {
        if (offlineItem == null) {
            return;
        }
        java.lang.String pinyin = offlineItem.getPinyin();
        com.tencent.mapsdk.internal.ca.a aVar = this.f49096m.get(pinyin);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.ca.a();
            this.f49096m.put(pinyin, aVar);
        }
        aVar.f49108a = pinyin;
        aVar.f49110c = z17;
        offlineItem.setUpgrade(z17);
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void d(com.tencent.mapsdk.internal.bn bnVar) {
        super.d(bnVar);
        if (this.f49104u) {
            this.f49102s = null;
            this.f49104u = false;
        }
        if (this.f49096m.isEmpty()) {
            return;
        }
        java.lang.String collectionToJson = com.tencent.map.tools.json.JsonUtils.collectionToJson(this.f49096m.values());
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "保存持久化状态, json：".concat(java.lang.String.valueOf(collectionToJson)));
        this.f49092i.a(f49091h, collectionToJson);
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(android.content.Context context) {
        super.a(context);
        com.tencent.mapsdk.internal.mz a17 = com.tencent.mapsdk.internal.mz.a(context, (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
        com.tencent.mapsdk.internal.kt.a(a17.f50474e);
        this.f49099p = a17.f50474e;
        this.f49097n = new java.io.File(this.f49099p, f49089f);
        this.f49098o = new java.io.File(this.f49099p, f49090g);
    }

    @Override // com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent
    public void getOfflineItemList(com.tencent.map.tools.Callback<java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem>> callback) {
        this.f49102s = callback;
        if (this.f49104u) {
            return;
        }
        e(getMapContext());
    }

    private java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> e() {
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = this.f49092i.b(f49085b, "").split(",");
        if (split.length != 0 && (list = this.f49094k) != null) {
            for (com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem : list) {
                if (java.util.Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        return arrayList;
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(com.tencent.mapsdk.internal.bn bnVar) {
        super.a(bnVar);
        this.f49093j = bnVar.f48998a.isOfflineMapEnable();
        com.tencent.mapsdk.internal.mv a17 = com.tencent.mapsdk.internal.mx.a(c(), bnVar.F().f49011c);
        this.f49092i = a17;
        java.lang.String b17 = a17.b(f49091h, "");
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "获取持久化状态, json：".concat(java.lang.String.valueOf(b17)));
        if (!android.text.TextUtils.isEmpty(b17)) {
            try {
                for (com.tencent.mapsdk.internal.ca.a aVar : com.tencent.map.tools.json.JsonUtils.parseToList(new org.json.JSONArray(b17), com.tencent.mapsdk.internal.ca.a.class, new java.lang.Object[0])) {
                    this.f49096m.put(aVar.f49108a, aVar);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        e(bnVar);
    }

    public static /* synthetic */ boolean h(com.tencent.mapsdk.internal.ca caVar) {
        if (!caVar.f49098o.exists()) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "请求离线城市列表...");
            com.tencent.mapsdk.internal.ea.a downloadOfflineMapCityList = ((com.tencent.mapsdk.internal.dd) ((com.tencent.mapsdk.internal.ds) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.ds.class)).i()).downloadOfflineMapCityList(caVar.f49099p);
            downloadOfflineMapCityList.charset = com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding;
            if (downloadOfflineMapCityList.available()) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表下载成功");
                com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(downloadOfflineMapCityList);
                if (aVar.available()) {
                    caVar.a(aVar.f49235a);
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表解析成功");
                }
            }
        } else {
            caVar.a(new java.lang.String(com.tencent.mapsdk.internal.ks.c(caVar.f49098o)));
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "离线城市列表使用缓存");
        }
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list = caVar.f49094k;
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "获得离线城市列表成功！");
        return true;
    }

    private synchronized void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.Object nextValue = new org.json.JSONTokener(str).nextValue();
        if (nextValue instanceof org.json.JSONArray) {
            java.util.List<com.tencent.mapsdk.internal.bx> parseToList = com.tencent.map.tools.json.JsonUtils.parseToList((org.json.JSONArray) nextValue, com.tencent.mapsdk.internal.bx.class, new java.lang.Object[0]);
            if (!parseToList.isEmpty()) {
                this.f49094k = new java.util.ArrayList();
                this.f49095l = new java.util.ArrayList();
                for (com.tencent.mapsdk.internal.bx bxVar : parseToList) {
                    if (bxVar.f49053b.startsWith(com.tencent.mapsdk.internal.sm.f51473a)) {
                        com.tencent.map.sdk.comps.offlinemap.OfflineNation offlineNation = new com.tencent.map.sdk.comps.offlinemap.OfflineNation();
                        offlineNation.setName(bxVar.f49052a);
                        offlineNation.setPinyin(bxVar.f49053b);
                        this.f49095l.add(offlineNation);
                        this.f49094k.add(offlineNation);
                    } else {
                        java.util.List<com.tencent.mapsdk.internal.bx> list = bxVar.f49054c;
                        if (list != null && !list.isEmpty()) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            com.tencent.map.sdk.comps.offlinemap.OfflineProvince offlineProvince = new com.tencent.map.sdk.comps.offlinemap.OfflineProvince();
                            offlineProvince.setName(bxVar.f49052a);
                            offlineProvince.setPinyin(bxVar.f49053b);
                            offlineProvince.setCities(arrayList);
                            this.f49095l.add(offlineProvince);
                            java.util.Iterator<com.tencent.mapsdk.internal.bx> it = bxVar.f49054c.iterator();
                            while (it.hasNext()) {
                                com.tencent.map.sdk.comps.offlinemap.OfflineCity a17 = it.next().a(offlineProvince);
                                this.f49094k.add(a17);
                                arrayList.add(a17);
                            }
                        } else {
                            com.tencent.map.sdk.comps.offlinemap.OfflineCity a18 = bxVar.a((com.tencent.map.sdk.comps.offlinemap.OfflineProvince) null);
                            this.f49095l.add(a18);
                            this.f49094k.add(a18);
                        }
                    }
                }
                h();
            }
        }
    }

    private com.tencent.mapsdk.internal.by a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener) {
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list;
        boolean z17;
        com.tencent.mapsdk.internal.bn mapContext = getMapContext();
        if (offlineItem != null && (list = this.f49094k) != null && this.f49100q != null && mapContext != null) {
            java.util.Iterator<com.tencent.map.sdk.comps.offlinemap.OfflineItem> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (it.next() == offlineItem) {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                com.tencent.mapsdk.internal.bz a17 = this.f49100q.a(offlineItem);
                if (a17 != null) {
                    com.tencent.mapsdk.internal.by byVar = this.f49101r.get(a17);
                    if (byVar == null) {
                        com.tencent.mapsdk.internal.by byVar2 = new com.tencent.mapsdk.internal.by(mapContext, this.f49099p, offlineItem, a17, this.f49092i, offlineStatusChangedListener);
                        this.f49101r.put(a17, byVar2);
                        byVar = byVar2;
                    }
                    byVar.f49055a = offlineStatusChangedListener;
                    byVar.f49056b = this;
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "获得离线城市[" + offlineItem.getName() + "]的配置成功！");
                    return byVar;
                }
            } else {
                com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "无效城市：".concat(java.lang.String.valueOf(offlineItem)));
            }
            return null;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.d(com.tencent.mapsdk.internal.kx.f50221v, "无效配置 config:" + this.f49100q + "|item:" + offlineItem);
        return null;
    }

    private void f(com.tencent.mapsdk.internal.bn bnVar) {
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = this.f49092i.b(f49085b, "").split(",");
        if (split.length != 0 && (list = this.f49094k) != null) {
            for (com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem : list) {
                if (java.util.Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.by a17 = a((com.tencent.map.sdk.comps.offlinemap.OfflineItem) it.next(), (com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener) null);
            if (a17 != null) {
                a17.b(bnVar);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, boolean z17) {
        java.lang.String b17 = this.f49092i.b(f49085b, "");
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "当前开启城市IDS：".concat(java.lang.String.valueOf(b17)));
        java.lang.String[] split = b17.split(",");
        int binarySearch = java.util.Arrays.binarySearch(split, offlineItem.getPinyin());
        if (z17) {
            if (binarySearch < 0) {
                java.lang.String str = b17 + offlineItem.getPinyin() + ",";
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "新增开启城市IDS：".concat(java.lang.String.valueOf(str)));
                this.f49092i.a(f49085b, str);
                return;
            }
            return;
        }
        if (binarySearch >= 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str2 : split) {
                if (!str2.equals(offlineItem.getPinyin())) {
                    sb6.append(str2);
                    sb6.append(",");
                }
            }
            java.lang.String sb7 = sb6.toString();
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50221v, "剩余开启城市IDS：".concat(java.lang.String.valueOf(sb7)));
            this.f49092i.a(f49085b, sb7);
        }
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, int i17) {
        if (offlineItem == null) {
            return;
        }
        java.lang.String pinyin = offlineItem.getPinyin();
        com.tencent.mapsdk.internal.ca.a aVar = this.f49096m.get(pinyin);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.ca.a();
            this.f49096m.put(pinyin, aVar);
        }
        aVar.f49108a = pinyin;
        aVar.f49109b = i17;
        offlineItem.setPercentage(i17);
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.ca caVar, com.tencent.mapsdk.internal.bn bnVar) {
        java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = caVar.f49092i.b(f49085b, "").split(",");
        if (split.length != 0 && (list = caVar.f49094k) != null) {
            for (com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem : list) {
                if (java.util.Arrays.binarySearch(split, offlineItem.getPinyin()) >= 0) {
                    arrayList.add(offlineItem);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.by a17 = caVar.a((com.tencent.map.sdk.comps.offlinemap.OfflineItem) it.next(), (com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener) null);
            if (a17 != null) {
                a17.b(bnVar);
            }
        }
    }
}
