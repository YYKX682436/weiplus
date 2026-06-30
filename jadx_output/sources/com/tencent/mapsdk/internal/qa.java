package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qa implements com.tencent.mapsdk.internal.qb.c, com.tencent.mapsdk.internal.qc.a {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f50854c = "AUTH_MARKER";

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.bk f50855a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<android.os.AsyncTask> f50856b;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.tr f50857d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.sp f50858e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.rr f50859f;

    /* renamed from: g, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qh f50860g;

    /* renamed from: h, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qu f50861h;

    /* renamed from: i, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ne f50862i;

    /* renamed from: j, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qf f50863j;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.so f50864k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f50865l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback> f50866m;

    /* renamed from: n, reason: collision with root package name */
    private final java.util.Map<com.tencent.mapsdk.internal.qa.b, java.lang.Boolean> f50867n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.qa.b f50868o;

    /* renamed from: p, reason: collision with root package name */
    private final com.tencent.map.tools.net.NetStatusListener f50869p;

    /* loaded from: classes13.dex */
    public interface a {
        void a(android.graphics.Bitmap bitmap, int i17, int i18);
    }

    /* loaded from: classes13.dex */
    public interface b {
        void a(int i17, java.lang.String str);

        void a(com.tencent.mapsdk.internal.qb.b bVar);
    }

    public qa(com.tencent.mapsdk.internal.bg bgVar) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mapsdk.internal.qa.b bVar = new com.tencent.mapsdk.internal.qa.b() { // from class: com.tencent.mapsdk.internal.qa.1
            @Override // com.tencent.mapsdk.internal.qa.b
            public final void a(com.tencent.mapsdk.internal.qb.b bVar2) {
            }

            @Override // com.tencent.mapsdk.internal.qa.b
            public final void a(int i17, java.lang.String str3) {
                com.tencent.mapsdk.internal.ne neVar;
                com.tencent.mapsdk.internal.hg hgVar;
                com.tencent.mapsdk.internal.tr trVar = com.tencent.mapsdk.internal.qa.this.f50857d;
                if (trVar == null || (neVar = trVar.f52273as) == null || (hgVar = neVar.f49000c) == null) {
                    return;
                }
                com.tencent.mapsdk.internal.gs s17 = hgVar.s();
                java.lang.String str4 = i17 + str3;
                com.tencent.mapsdk.internal.gs.a aVar = s17.f49679a.get(str4);
                if (aVar == null) {
                    aVar = new com.tencent.mapsdk.internal.gs.a();
                    s17.f49679a.put(str4, aVar);
                }
                aVar.f49683b = i17;
                aVar.f49684c = str3;
                aVar.f49682a++;
            }
        };
        this.f50868o = bVar;
        this.f50869p = new com.tencent.map.tools.net.NetStatusListener() { // from class: com.tencent.mapsdk.internal.qa.2
            @Override // com.tencent.map.tools.net.NetStatusListener
            public final void onConnect(int i17, int i18) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50211l, "NetStatusListener onConnect .. type:" + i17 + " signalLevel:" + i18);
                if (com.tencent.mapsdk.internal.qa.this.f50858e.f51516d) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50211l, "NetStatusListener refresh WorldAuth");
                    new com.tencent.mapsdk.internal.qc(com.tencent.mapsdk.internal.qa.this.f50862i.getContext(), com.tencent.mapsdk.internal.qa.this.f50864k, com.tencent.mapsdk.internal.qa.this).execute(new java.lang.Object[0]);
                    com.tencent.map.tools.net.NetManager.getInstance().removeNetStatusListener(this);
                }
            }

            @Override // com.tencent.map.tools.net.NetStatusListener
            public final void onLost(int i17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50211l, "NetStatusListener onLost .. reason:".concat(java.lang.String.valueOf(i17)));
            }
        };
        android.content.Context context = bgVar.f48906c;
        this.f50857d = bgVar.f48905b;
        this.f50858e = bgVar.f48905b.f52195j;
        com.tencent.mapsdk.internal.bk bkVar = bgVar.f48907d;
        this.f50855a = bkVar;
        this.f50859f = bgVar.f48908e;
        this.f50860g = bgVar.f48909f;
        this.f50861h = bgVar.f48910g;
        this.f50862i = bgVar.f48905b.f52273as;
        com.tencent.mapsdk.internal.so soVar = bgVar.f48905b.f52195j.f51514b;
        this.f50864k = soVar;
        this.f50856b = new java.util.concurrent.CopyOnWriteArrayList();
        if (bgVar.f48905b == null || bgVar.f48905b.M() == null) {
            str = "";
            str2 = str;
        } else {
            java.lang.String subKey = bgVar.f48905b.M().getSubKey();
            java.lang.String subId = bgVar.f48905b.M().getSubId();
            this.f50866m = new java.lang.ref.WeakReference<>(bgVar.f48905b.M().getOnAuthCallback());
            str = subKey;
            str2 = subId;
        }
        this.f50863j = new com.tencent.mapsdk.internal.qf(context, bgVar, str);
        this.f50856b.add(new com.tencent.mapsdk.internal.qb(bkVar.f48984i, str, str2, this, this.f50856b));
        this.f50856b.add(new com.tencent.mapsdk.internal.qc(context, soVar, this));
        a(bVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback
    public final void onAuthFail(int i17, java.lang.String str) {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback> weakReference = this.f50866m;
        if (weakReference != null && weakReference.get() != null) {
            this.f50866m.get().onAuthFail(i17, str);
        }
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f50867n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(i17, str);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f50856b.size(); i19++) {
            if (this.f50856b.get(i19) instanceof com.tencent.mapsdk.internal.qb) {
                i18++;
            }
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(b()).e(com.tencent.mapsdk.internal.la.a.f50263d, "retry count: " + i18 + ", code: " + i17 + ", message: " + str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback
    public final void onAuthSuccess() {
        java.lang.ref.WeakReference<com.tencent.tencentmap.mapsdk.maps.TencentMap.OnAuthResultCallback> weakReference = this.f50866m;
        if (weakReference != null && weakReference.get() != null) {
            this.f50866m.get().onAuthSuccess();
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(b()).c(com.tencent.mapsdk.internal.la.a.f50263d, "onAuthSuccess");
    }

    private void a(com.tencent.mapsdk.internal.qa.a aVar, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        this.f50855a.a(aVar, tencentMapOptions);
    }

    private void d() {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.hg hgVar;
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Y, b());
        java.util.Iterator<android.os.AsyncTask> it = this.f50856b.iterator();
        while (it.hasNext()) {
            it.next().execute(new java.lang.Object[0]);
        }
        com.tencent.mapsdk.internal.tr trVar = this.f50857d;
        if (trVar == null || (neVar = trVar.f52273as) == null || (hgVar = neVar.f49000c) == null) {
            return;
        }
        hgVar.s().a();
    }

    public final void b(com.tencent.mapsdk.internal.qa.b bVar) {
        this.f50867n.remove(bVar);
    }

    @Override // com.tencent.mapsdk.internal.qb.c
    public final void c() {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.hg hgVar;
        com.tencent.mapsdk.internal.tr trVar = this.f50857d;
        if (trVar == null || (neVar = trVar.f52273as) == null || (hgVar = neVar.f49000c) == null) {
            return;
        }
        hgVar.s().a();
    }

    public final void a(com.tencent.mapsdk.internal.qa.b bVar) {
        this.f50867n.put(bVar, java.lang.Boolean.TRUE);
    }

    public final int b() {
        com.tencent.mapsdk.internal.ne neVar = this.f50862i;
        if (neVar != null) {
            return neVar.K;
        }
        return -1;
    }

    private void a(com.tencent.mapsdk.internal.qb.b bVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f50867n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f50867n.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(i17, str);
        }
    }

    private void a(org.json.JSONArray jSONArray, com.tencent.mapsdk.internal.fx fxVar) {
        java.util.List<com.tencent.mapsdk.internal.rq> a17;
        boolean z17;
        com.tencent.mapsdk.internal.rr rrVar = this.f50859f;
        if (rrVar == null) {
            return;
        }
        org.json.JSONArray parseToJsonArray = com.tencent.map.tools.json.JsonUtils.parseToJsonArray(rrVar.f51257e.a(com.tencent.mapsdk.internal.er.A));
        if (jSONArray != null && (a17 = com.tencent.mapsdk.internal.rr.a(jSONArray)) != null) {
            synchronized (rrVar.f51256d) {
                rrVar.f51255c.clear();
                rrVar.f51255c.addAll(a17);
            }
            try {
                z17 = !com.tencent.map.tools.json.JsonUtils.jsonArrayEqualsIgnoreOrder(jSONArray, parseToJsonArray);
            } catch (java.lang.Throwable unused) {
                z17 = true;
            }
            if (z17) {
                rrVar.f51257e.a();
                rrVar.f51257e.a(com.tencent.mapsdk.internal.er.A, jSONArray.toString());
            }
        }
        com.tencent.mapsdk.internal.ac acVar = this.f50857d.f52199n;
        if (acVar != null) {
            if (fxVar != null) {
                acVar.f48774b = fxVar;
                com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
                acVar.f48773a.a(com.tencent.mapsdk.internal.er.B, fxVar.f49496c);
                acVar.f48773a.a(com.tencent.mapsdk.internal.er.C, fxVar.f49497d);
                org.json.JSONArray jSONArray2 = fxVar.f49498e;
                if (jSONArray2 != null) {
                    acVar.f48773a.a(com.tencent.mapsdk.internal.er.D, jSONArray2.toString());
                }
                com.tencent.mapsdk.vector.VectorMap vectorMap = acVar.f48776d;
                if (vectorMap != null) {
                    vectorMap.a(acVar.c());
                    if (acVar.c() == 1) {
                        acVar.f48776d.a(acVar.d());
                    }
                }
            } else {
                acVar.f48773a.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.B, com.tencent.mapsdk.internal.er.C, com.tencent.mapsdk.internal.er.D});
            }
            if (acVar.f48774b == null) {
                acVar.f48774b = new com.tencent.mapsdk.internal.fx();
            }
            com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.ac.AnonymousClass2());
        }
        com.tencent.mapsdk.internal.qf qfVar = this.f50863j;
        java.lang.String a18 = this.f50859f.a();
        java.lang.String a19 = qfVar.a();
        if (com.tencent.mapsdk.internal.qf.f50914e.containsKey(a19)) {
            qfVar.a(a19, qfVar.f50919f);
            return;
        }
        qfVar.a(a19, qfVar.f50919f);
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference = qfVar.f50919f;
        if (weakReference != null && weakReference.get() != null && qfVar.f50919f.get().f48905b != null) {
            int i17 = qfVar.f50919f.get().f48905b.f49018f;
            com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).b(com.tencent.mapsdk.internal.la.a.f50264e, "map config check update, styleIds: " + a18 + ", indoorAuth: " + fxVar);
            com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Z, i17);
        }
        com.tencent.mapsdk.internal.ko.b(new com.tencent.mapsdk.internal.qf.a(qfVar, a18, fxVar));
    }

    public final void a() {
        if (this.f50856b != null) {
            for (int i17 = 0; i17 < this.f50856b.size(); i17++) {
                android.os.AsyncTask asyncTask = this.f50856b.get(i17);
                if (asyncTask instanceof com.tencent.mapsdk.internal.qb) {
                    ((com.tencent.mapsdk.internal.qb) asyncTask).f50873b.removeCallbacksAndMessages(null);
                }
                asyncTask.cancel(true);
            }
            this.f50856b.clear();
        }
        b(this.f50868o);
        this.f50856b = null;
        this.f50865l = true;
        if (this.f50857d.M() != null) {
            this.f50857d.M().setOnAuthCallback(null);
        }
        com.tencent.map.tools.net.NetManager.getInstance().removeNetStatusListener(this.f50869p);
    }

    @Override // com.tencent.mapsdk.internal.qc.a
    public final void a(com.tencent.mapsdk.internal.qc.b bVar, com.tencent.mapsdk.internal.so soVar) {
        if (this.f50857d == null || soVar == null) {
            return;
        }
        boolean z17 = bVar == com.tencent.mapsdk.internal.qc.b.SUCCESS_UPGRADED;
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50211l, "onWorldConfigUpdate isUpdated: " + bVar + " config:" + soVar);
        this.f50857d.a(z17, soVar.c());
        if (z17) {
            this.f50858e.a();
        }
        this.f50858e.f51516d = true;
        if (bVar == com.tencent.mapsdk.internal.qc.b.FAIL_NET) {
            com.tencent.map.tools.net.NetManager.getInstance().addNetStatusListener(this.f50869p);
        }
    }

    @Override // com.tencent.mapsdk.internal.qb.c
    public final void a(com.tencent.mapsdk.internal.qb.b bVar, org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray;
        com.tencent.mapsdk.internal.fx fxVar;
        java.util.List<com.tencent.mapsdk.internal.rq> a17;
        boolean z17;
        if (this.f50865l) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(b()).c(com.tencent.mapsdk.internal.la.a.f50263d, "onAuthResult: ".concat(java.lang.String.valueOf(jSONObject)));
        if (com.tencent.mapsdk.internal.hn.f49810i == 0) {
            java.util.Iterator<com.tencent.mapsdk.internal.qa.b> it = this.f50867n.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        }
        if (bVar != null) {
            jSONArray = bVar.f50889b;
            fxVar = bVar.f50888a;
            com.tencent.mapsdk.internal.qg qgVar = bVar.f50891d;
            if (qgVar != null) {
                com.tencent.mapsdk.internal.qh qhVar = this.f50860g;
                if (qgVar != null && qgVar.f50928a) {
                    qhVar.f50934b.clear();
                    qhVar.f50934b.addAll(qgVar.f50929b);
                    qhVar.a();
                }
            }
        } else {
            jSONArray = null;
            fxVar = null;
        }
        com.tencent.mapsdk.internal.rr rrVar = this.f50859f;
        if (rrVar != null) {
            org.json.JSONArray parseToJsonArray = com.tencent.map.tools.json.JsonUtils.parseToJsonArray(rrVar.f51257e.a(com.tencent.mapsdk.internal.er.A));
            if (jSONArray != null && (a17 = com.tencent.mapsdk.internal.rr.a(jSONArray)) != null) {
                synchronized (rrVar.f51256d) {
                    rrVar.f51255c.clear();
                    rrVar.f51255c.addAll(a17);
                }
                try {
                    z17 = !com.tencent.map.tools.json.JsonUtils.jsonArrayEqualsIgnoreOrder(jSONArray, parseToJsonArray);
                } catch (java.lang.Throwable unused) {
                    z17 = true;
                }
                if (z17) {
                    rrVar.f51257e.a();
                    rrVar.f51257e.a(com.tencent.mapsdk.internal.er.A, jSONArray.toString());
                }
            }
            com.tencent.mapsdk.internal.ac acVar = this.f50857d.f52199n;
            if (acVar != null) {
                if (fxVar != null) {
                    acVar.f48774b = fxVar;
                    com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
                    acVar.f48773a.a(com.tencent.mapsdk.internal.er.B, fxVar.f49496c);
                    acVar.f48773a.a(com.tencent.mapsdk.internal.er.C, fxVar.f49497d);
                    org.json.JSONArray jSONArray2 = fxVar.f49498e;
                    if (jSONArray2 != null) {
                        acVar.f48773a.a(com.tencent.mapsdk.internal.er.D, jSONArray2.toString());
                    }
                    com.tencent.mapsdk.vector.VectorMap vectorMap = acVar.f48776d;
                    if (vectorMap != null) {
                        vectorMap.a(acVar.c());
                        if (acVar.c() == 1) {
                            acVar.f48776d.a(acVar.d());
                        }
                    }
                } else {
                    acVar.f48773a.a(new java.lang.String[]{com.tencent.mapsdk.internal.er.B, com.tencent.mapsdk.internal.er.C, com.tencent.mapsdk.internal.er.D});
                }
                if (acVar.f48774b == null) {
                    acVar.f48774b = new com.tencent.mapsdk.internal.fx();
                }
                com.tencent.mapsdk.internal.ko.a(new com.tencent.mapsdk.internal.ac.AnonymousClass2());
            }
            com.tencent.mapsdk.internal.qf qfVar = this.f50863j;
            java.lang.String a18 = this.f50859f.a();
            java.lang.String a19 = qfVar.a();
            if (com.tencent.mapsdk.internal.qf.f50914e.containsKey(a19)) {
                qfVar.a(a19, qfVar.f50919f);
            } else {
                qfVar.a(a19, qfVar.f50919f);
                java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bg> weakReference = qfVar.f50919f;
                if (weakReference != null && weakReference.get() != null && qfVar.f50919f.get().f48905b != null) {
                    int i17 = qfVar.f50919f.get().f48905b.f49018f;
                    com.tencent.mapsdk.core.utils.log.LogUtil.a(i17).b(com.tencent.mapsdk.internal.la.a.f50264e, "map config check update, styleIds: " + a18 + ", indoorAuth: " + fxVar);
                    com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.Z, i17);
                }
                com.tencent.mapsdk.internal.ko.b(new com.tencent.mapsdk.internal.qf.a(qfVar, a18, fxVar));
            }
        }
        com.tencent.mapsdk.internal.ne neVar = this.f50862i;
        if (neVar != null && bVar != null) {
            int i18 = bVar.f50892e;
            if (i18 != com.tencent.mapsdk.internal.sa.f51313d && i18 != com.tencent.mapsdk.internal.sa.f51314e) {
                neVar.i(false);
            } else {
                neVar.i(true);
            }
            com.tencent.mapsdk.internal.qu quVar = this.f50861h;
            boolean z18 = bVar.f50893f;
            if (com.tencent.mapsdk.internal.qu.a()) {
                quVar.f51069b = z18;
                quVar.f51068a.a(com.tencent.mapsdk.internal.er.E, z18);
                quVar.f51070c.i().c(quVar.f51069b);
            } else {
                quVar.f51070c.i().c(false);
            }
            com.tencent.mapsdk.internal.ee eeVar = (com.tencent.mapsdk.internal.ee) this.f50862i.getMapComponent(com.tencent.mapsdk.internal.ee.class);
            if (eeVar != null) {
                eeVar.a(bVar.f50890c);
            }
        }
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.Y, b());
    }
}
