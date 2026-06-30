package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class ca extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm implements com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64, com.tencent.mapsdk.internal.by.a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f130618b = "key_offline_map_opened_cities";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f130619c = "key_offline_map_config_version";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f130620d = "key_offline_map_config_md5";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f130621e = "key_offline_map_config_url";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f130622f = "sdk_offline_city_ver.json";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f130623g = "offline_city_list.json";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f130624h = "key_offline_map_items_state";

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f130625i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f130626j;

    /* renamed from: n, reason: collision with root package name */
    private java.io.File f130630n;

    /* renamed from: o, reason: collision with root package name */
    private java.io.File f130631o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f130632p;

    /* renamed from: q, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cb f130633q;

    /* renamed from: s, reason: collision with root package name */
    private volatile com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76>> f130635s;

    /* renamed from: t, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4268xb0f75447> f130636t;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f130637u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f130638v;

    /* renamed from: k, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> f130627k = new java.util.ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> f130628l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.tencent.mapsdk.internal.ca.a> f130629m = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final java.util.Map<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by> f130634r = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f130641a;

        /* renamed from: b, reason: collision with root package name */
        int f130642b;

        /* renamed from: c, reason: collision with root package name */
        boolean f130643c;

        private a() {
        }
    }

    public static /* synthetic */ com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465 b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar) {
        caVar.f130635s = null;
        return null;
    }

    public static /* synthetic */ boolean c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar) {
        caVar.f130637u = false;
        return false;
    }

    private void h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cb cbVar = this.f130633q;
        if (cbVar == null || cbVar.f130648e == null || this.f130627k.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "添加item的数据状态");
        java.util.Set<java.lang.String> keySet = this.f130629m.keySet();
        for (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 : this.f130627k) {
            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz> it = this.f130633q.f130648e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (c4265xa1eefb76.m35501x2a31609f().equals(it.next().f130610c)) {
                        c4265xa1eefb76.m35508x76500f83(r5.f130611d);
                        java.util.Iterator<java.lang.String> it6 = keySet.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                if (c4265xa1eefb76.m35501x2a31609f().equals(it6.next())) {
                                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by a17 = a(c4265xa1eefb76, (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33) null);
                                    if (a17 != null) {
                                        c4265xa1eefb76.m35509xa377235a(a17.mo35511xda914863());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "添加item的数据状态完成！！");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void c_() {
        super.c_();
        for (java.util.Map.Entry<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by> entry : this.f130634r.entrySet()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by value = entry.getValue();
            if (value != null) {
                value.f130589b = null;
                value.f130588a = null;
            }
            entry.setValue(null);
        }
        this.f130634r.clear();
        this.f130635s = null;
        this.f130636t = null;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64
    /* renamed from: getOfflineItemController */
    public com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4266x9ebdfb2 mo35517xa8b6621c(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33) {
        if (this.f130626j) {
            return a(c4265xa1eefb76, interfaceC4272xb18c4f33);
        }
        return null;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64
    /* renamed from: getOfflineItemList */
    public synchronized java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> mo35518xf26b8f1e() {
        for (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 : this.f130627k) {
            com.tencent.mapsdk.internal.ca.a aVar = this.f130629m.get(c4265xa1eefb76.m35501x2a31609f());
            if (aVar != null) {
                c4265xa1eefb76.m35506xe572f89c(aVar.f130642b);
                c4265xa1eefb76.m35509xa377235a(aVar.f130643c);
            }
        }
        return this.f130628l;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64
    /* renamed from: isOfflineMapEnable */
    public boolean mo35520xfbf000a6() {
        return this.f130626j;
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64
    /* renamed from: syncLatestData */
    public void mo35521x84af88cc(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4268xb0f75447 interfaceC4268xb0f75447) {
        this.f130636t = new java.lang.ref.WeakReference<>(interfaceC4268xb0f75447);
        if (this.f130637u) {
            return;
        }
        e(mo36621x2de760a9());
    }

    private void e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        java.lang.String b17 = this.f130625i.b(f130618b, "");
        if (this.f130626j || !android.text.TextUtils.isEmpty(b17)) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = bnVar.f130533c;
            if (hgVar != null) {
                hgVar.p().a();
            }
            if (this.f130637u) {
                return;
            }
            this.f130637u = true;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.ca.2
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130638v = false;
                    if (!com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130626j) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this;
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.a(caVar, caVar.mo36621x2de760a9());
                        return null;
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this;
                    caVar2.f130638v = caVar2.f();
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this;
                    caVar3.f130638v = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.h(caVar3);
                    return null;
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) null, (com.tencent.mapsdk.internal.ko.a<com.tencent.mapsdk.internal.ko.b.a>) new com.tencent.mapsdk.internal.ko.a<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.ca.1
                @Override // com.tencent.mapsdk.internal.ko.a, com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465
                /* renamed from: callback */
                public final void mo35806xf5bc2045(java.lang.Object obj) {
                    com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4268xb0f75447 interfaceC4268xb0f75447;
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130635s != null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130635s.mo35806xf5bc2045(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.mo35518xf26b8f1e());
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this);
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130636t == null || (interfaceC4268xb0f75447 = (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4268xb0f75447) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130636t.get()) == null) {
                        return;
                    }
                    interfaceC4268xb0f75447.m35522x5a0ec339(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca.this.f130638v);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
        if (mo36621x2de760a9 == null) {
            return false;
        }
        int b17 = this.f130625i.b(f130619c);
        java.lang.String a17 = this.f130625i.a(f130620d);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "检查离线配置更新, 当前v:" + b17 + "|md5:" + a17 + "obj:" + this);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds dsVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds.class);
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9> arrayList = new java.util.ArrayList<>();
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9 c4366x94692cd9 = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9(f130622f, b17, a17);
        arrayList.add(c4366x94692cd9);
        com.tencent.mapsdk.internal.eb.a<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4368xd398663a> m36691x30fb23f1 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dd) dsVar.i()).m36691x30fb23f1(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.i(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.d(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.m(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.g(), mo36621x2de760a9.F().b(), arrayList, mo36621x2de760a9.F().b(), mo36621x2de760a9.I(), "", mo36621x2de760a9.H(), "");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线配置请求更新结束：" + m36691x30fb23f1.m36027xbbe5a623());
        if (m36691x30fb23f1.mo36017xd4418ac9()) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a c4367x94692e8a = m36691x30fb23f1.f130766a.f17248xcd96d0ea.get(0);
            java.lang.String a18 = this.f130630n.exists() ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(this.f130630n) : null;
            if (this.f130630n.exists() && (c4367x94692e8a == null || !f130622f.equals(c4367x94692e8a.f17245x6797d9e) || c4367x94692e8a.f17243x13891c2f == c4366x94692cd9.f17237x13891c2f || android.text.TextUtils.isEmpty(c4367x94692e8a.f17246xc04164b3) || c4367x94692e8a.f17240xa8141726 == 0 || c4367x94692e8a.f17241xee7a1b76 == 0 || android.text.TextUtils.isEmpty(c4367x94692e8a.f17244x35740b) || c4367x94692e8a.f17244x35740b.equals(a18))) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "跳过更新");
            } else {
                java.lang.String str = c4367x94692e8a.f17246xc04164b3;
                java.lang.String str2 = c4367x94692e8a.f17244x35740b;
                int i17 = c4367x94692e8a.f17243x13891c2f;
                if (c4367x94692e8a.f17241xee7a1b76 == 0 && !this.f130630n.exists()) {
                    str = this.f130625i.b(f130621e, "");
                    str2 = this.f130625i.b(f130620d, "");
                    i17 = this.f130625i.b(f130619c, 0);
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线配置文件的请求链接为空！");
                    return false;
                }
                if (com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35999x798ad123(this.f130630n).mo36017xd4418ac9()) {
                    if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(this.f130630n).equals(str2)) {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线配置文件下载成功");
                        this.f130625i.a(f130619c, i17);
                        this.f130625i.a(f130620d, str2);
                        this.f130625i.a(f130621e, str);
                    } else {
                        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线配置文件MD5校验失败");
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(this.f130630n);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线地图配置请求错误：" + m36691x30fb23f1.m36027xbbe5a623());
        }
        if (this.f130630n.exists()) {
            try {
                java.lang.Object nextValue = new org.json.JSONTokener(new java.lang.String(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f130630n))).nextValue();
                if (nextValue instanceof org.json.JSONObject) {
                    this.f130633q = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cb) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b((org.json.JSONObject) nextValue, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cb.class, new java.lang.Object[0]);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "创建离线配置文件对象数据：" + this.f130633q);
                }
            } catch (org.json.JSONException unused) {
            }
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线配置文件不存在！");
        }
        if (this.f130633q == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "获得离线配置成功！");
        return true;
    }

    private boolean g() {
        if (!this.f130631o.exists()) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "请求离线城市列表...");
            com.tencent.mapsdk.internal.ea.a m36692x5e48eea = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dd) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds.class)).i()).m36692x5e48eea(this.f130632p);
            m36692x5e48eea.f16974x2c0d614c = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6;
            if (m36692x5e48eea.mo36017xd4418ac9()) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表下载成功");
                com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(m36692x5e48eea);
                if (aVar.mo36017xd4418ac9()) {
                    a(aVar.f130768a);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表解析成功");
                }
            }
        } else {
            a(new java.lang.String(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(this.f130631o)));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表使用缓存");
        }
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list = this.f130627k;
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "获得离线城市列表成功！");
        return true;
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void b(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, boolean z17) {
        if (c4265xa1eefb76 == null) {
            return;
        }
        java.lang.String m35501x2a31609f = c4265xa1eefb76.m35501x2a31609f();
        com.tencent.mapsdk.internal.ca.a aVar = this.f130629m.get(m35501x2a31609f);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.ca.a();
            this.f130629m.put(m35501x2a31609f, aVar);
        }
        aVar.f130641a = m35501x2a31609f;
        aVar.f130643c = z17;
        c4265xa1eefb76.m35509xa377235a(z17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.d(bnVar);
        if (this.f130637u) {
            this.f130635s = null;
            this.f130637u = false;
        }
        if (this.f130629m.isEmpty()) {
            return;
        }
        java.lang.String m35870x946a6641 = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35870x946a6641(this.f130629m.values());
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "保存持久化状态, json：".concat(java.lang.String.valueOf(m35870x946a6641)));
        this.f130625i.a(f130624h, m35870x946a6641);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(android.content.Context context) {
        super.a(context);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mz.a(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25966x7e4576a7) null);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(a17.f132007e);
        this.f130632p = a17.f132007e;
        this.f130630n = new java.io.File(this.f130632p, f130622f);
        this.f130631o = new java.io.File(this.f130632p, f130623g);
    }

    @Override // com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4267xd8224c64
    /* renamed from: getOfflineItemList */
    public void mo35519xf26b8f1e(com.p314xaae8f345.map.p511x696c9db.InterfaceC4308xf9968465<java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76>> interfaceC4308xf9968465) {
        this.f130635s = interfaceC4308xf9968465;
        if (this.f130637u) {
            return;
        }
        e(mo36621x2de760a9());
    }

    private java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> e() {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = this.f130625i.b(f130618b, "").split(",");
        if (split.length != 0 && (list = this.f130627k) != null) {
            for (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 : list) {
                if (java.util.Arrays.binarySearch(split, c4265xa1eefb76.m35501x2a31609f()) >= 0) {
                    arrayList.add(c4265xa1eefb76);
                }
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bm
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        super.a(bnVar);
        this.f130626j = bnVar.f130531a.m99227xfbf000a6();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(c(), bnVar.F().f130544c);
        this.f130625i = a17;
        java.lang.String b17 = a17.b(f130624h, "");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "获取持久化状态, json：".concat(java.lang.String.valueOf(b17)));
        if (!android.text.TextUtils.isEmpty(b17)) {
            try {
                for (com.tencent.mapsdk.internal.ca.a aVar : com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35880xd8ef724c(new org.json.JSONArray(b17), com.tencent.mapsdk.internal.ca.a.class, new java.lang.Object[0])) {
                    this.f130629m.put(aVar.f130641a, aVar);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        e(bnVar);
    }

    public static /* synthetic */ boolean h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar) {
        if (!caVar.f130631o.exists()) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "请求离线城市列表...");
            com.tencent.mapsdk.internal.ea.a m36692x5e48eea = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dd) ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.cp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ds.class)).i()).m36692x5e48eea(caVar.f130632p);
            m36692x5e48eea.f16974x2c0d614c = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6;
            if (m36692x5e48eea.mo36017xd4418ac9()) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表下载成功");
                com.tencent.mapsdk.internal.ec.a aVar = new com.tencent.mapsdk.internal.ec.a(m36692x5e48eea);
                if (aVar.mo36017xd4418ac9()) {
                    caVar.a(aVar.f130768a);
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表解析成功");
                }
            }
        } else {
            caVar.a(new java.lang.String(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.c(caVar.f130631o)));
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "离线城市列表使用缓存");
        }
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list = caVar.f130627k;
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "获得离线城市列表成功！");
        return true;
    }

    private synchronized void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.Object nextValue = new org.json.JSONTokener(str).nextValue();
        if (nextValue instanceof org.json.JSONArray) {
            java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bx> m35880xd8ef724c = com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35880xd8ef724c((org.json.JSONArray) nextValue, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bx.class, new java.lang.Object[0]);
            if (!m35880xd8ef724c.isEmpty()) {
                this.f130627k = new java.util.ArrayList();
                this.f130628l = new java.util.ArrayList();
                for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bx bxVar : m35880xd8ef724c) {
                    if (bxVar.f130586b.startsWith(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sm.f133006a)) {
                        com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4269xe9a142ea c4269xe9a142ea = new com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4269xe9a142ea();
                        c4269xe9a142ea.m35505x764daa0d(bxVar.f130585a);
                        c4269xe9a142ea.m35507x1d6694ab(bxVar.f130586b);
                        this.f130628l.add(c4269xe9a142ea);
                        this.f130627k.add(c4269xe9a142ea);
                    } else {
                        java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bx> list = bxVar.f130587c;
                        if (list != null && !list.isEmpty()) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4270x5194c213 c4270x5194c213 = new com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4270x5194c213();
                            c4270x5194c213.m35505x764daa0d(bxVar.f130585a);
                            c4270x5194c213.m35507x1d6694ab(bxVar.f130586b);
                            c4270x5194c213.m35524x73a124b(arrayList);
                            this.f130628l.add(c4270x5194c213);
                            java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bx> it = bxVar.f130587c.iterator();
                            while (it.hasNext()) {
                                com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4264xa1ec19ce a17 = it.next().a(c4270x5194c213);
                                this.f130627k.add(a17);
                                arrayList.add(a17);
                            }
                        } else {
                            com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4264xa1ec19ce a18 = bxVar.a((com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4270x5194c213) null);
                            this.f130628l.add(a18);
                            this.f130627k.add(a18);
                        }
                    }
                }
                h();
            }
        }
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33 interfaceC4272xb18c4f33) {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list;
        boolean z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn mo36621x2de760a9 = mo36621x2de760a9();
        if (c4265xa1eefb76 != null && (list = this.f130627k) != null && this.f130633q != null && mo36621x2de760a9 != null) {
            java.util.Iterator<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (it.next() == c4265xa1eefb76) {
                    z17 = true;
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bz a17 = this.f130633q.a(c4265xa1eefb76);
                if (a17 != null) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by byVar = this.f130634r.get(a17);
                    if (byVar == null) {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by byVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by(mo36621x2de760a9, this.f130632p, c4265xa1eefb76, a17, this.f130625i, interfaceC4272xb18c4f33);
                        this.f130634r.put(a17, byVar2);
                        byVar = byVar2;
                    }
                    byVar.f130588a = interfaceC4272xb18c4f33;
                    byVar.f130589b = this;
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "获得离线城市[" + c4265xa1eefb76.m35499xfb82e301() + "]的配置成功！");
                    return byVar;
                }
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "无效城市：".concat(java.lang.String.valueOf(c4265xa1eefb76)));
            }
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "无效配置 config:" + this.f130633q + "|item:" + c4265xa1eefb76);
        return null;
    }

    private void f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = this.f130625i.b(f130618b, "").split(",");
        if (split.length != 0 && (list = this.f130627k) != null) {
            for (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 : list) {
                if (java.util.Arrays.binarySearch(split, c4265xa1eefb76.m35501x2a31609f()) >= 0) {
                    arrayList.add(c4265xa1eefb76);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by a17 = a((com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76) it.next(), (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33) null);
            if (a17 != null) {
                a17.b(bnVar);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, boolean z17) {
        java.lang.String b17 = this.f130625i.b(f130618b, "");
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "当前开启城市IDS：".concat(java.lang.String.valueOf(b17)));
        java.lang.String[] split = b17.split(",");
        int binarySearch = java.util.Arrays.binarySearch(split, c4265xa1eefb76.m35501x2a31609f());
        if (z17) {
            if (binarySearch < 0) {
                java.lang.String str = b17 + c4265xa1eefb76.m35501x2a31609f() + ",";
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "新增开启城市IDS：".concat(java.lang.String.valueOf(str)));
                this.f130625i.a(f130618b, str);
                return;
            }
            return;
        }
        if (binarySearch >= 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str2 : split) {
                if (!str2.equals(c4265xa1eefb76.m35501x2a31609f())) {
                    sb6.append(str2);
                    sb6.append(",");
                }
            }
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131754v, "剩余开启城市IDS：".concat(java.lang.String.valueOf(sb7)));
            this.f130625i.a(f130618b, sb7);
        }
    }

    @Override // com.tencent.mapsdk.internal.by.a
    public final void a(com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76, int i17) {
        if (c4265xa1eefb76 == null) {
            return;
        }
        java.lang.String m35501x2a31609f = c4265xa1eefb76.m35501x2a31609f();
        com.tencent.mapsdk.internal.ca.a aVar = this.f130629m.get(m35501x2a31609f);
        if (aVar == null) {
            aVar = new com.tencent.mapsdk.internal.ca.a();
            this.f130629m.put(m35501x2a31609f, aVar);
        }
        aVar.f130641a = m35501x2a31609f;
        aVar.f130642b = i17;
        c4265xa1eefb76.m35506xe572f89c(i17);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ca caVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bn bnVar) {
        java.util.List<com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76> list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = caVar.f130625i.b(f130618b, "").split(",");
        if (split.length != 0 && (list = caVar.f130627k) != null) {
            for (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76 c4265xa1eefb76 : list) {
                if (java.util.Arrays.binarySearch(split, c4265xa1eefb76.m35501x2a31609f()) >= 0) {
                    arrayList.add(c4265xa1eefb76);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.by a17 = caVar.a((com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.C4265xa1eefb76) it.next(), (com.p314xaae8f345.map.sdk.p497x5a73344.p500x6d5fa899.InterfaceC4272xb18c4f33) null);
            if (a17 != null) {
                a17.b(bnVar);
            }
        }
    }
}
