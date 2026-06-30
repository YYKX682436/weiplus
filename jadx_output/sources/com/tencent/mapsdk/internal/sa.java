package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sa implements com.tencent.mapsdk.internal.oz {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f51310a = "d8ab2f7b7a7536a71894084e1c812fd0";

    /* renamed from: b, reason: collision with root package name */
    public static final javax.crypto.spec.IvParameterSpec f51311b = new javax.crypto.spec.IvParameterSpec("c0ab1f54he78k36d".getBytes());

    /* renamed from: c, reason: collision with root package name */
    public static int f51312c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f51313d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static int f51314e = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final int f51315m = 130817;

    /* renamed from: n, reason: collision with root package name */
    private static final int f51316n = 130818;

    /* renamed from: o, reason: collision with root package name */
    private static final int f51317o = 130819;

    /* renamed from: q, reason: collision with root package name */
    private static final int f51318q = 5000;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f51319f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f51320g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f51321h;

    /* renamed from: j, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.ne f51323j;

    /* renamed from: k, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.rz f51324k;

    /* renamed from: l, reason: collision with root package name */
    private final java.lang.String f51325l;

    /* renamed from: p, reason: collision with root package name */
    private final android.util.SparseArray<com.tencent.mapsdk.internal.rx> f51326p = new android.util.SparseArray<>(32);

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f51322i = new android.os.Handler(com.tencent.mapsdk.internal.ko.a("gesture")) { // from class: com.tencent.mapsdk.internal.sa.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case com.tencent.mapsdk.internal.sa.f51315m /* 130817 */:
                    com.tencent.mapsdk.internal.sa.a(com.tencent.mapsdk.internal.sa.this);
                    return;
                case com.tencent.mapsdk.internal.sa.f51316n /* 130818 */:
                    com.tencent.mapsdk.internal.sa.this.a();
                    return;
                case com.tencent.mapsdk.internal.sa.f51317o /* 130819 */:
                    com.tencent.mapsdk.internal.sa.b(com.tencent.mapsdk.internal.sa.this);
                    return;
                default:
                    return;
            }
        }
    };

    public sa(com.tencent.mapsdk.internal.ne neVar) {
        this.f51323j = neVar;
        neVar.a(this);
        this.f51324k = new com.tencent.mapsdk.internal.rz(neVar.f50510j);
        com.tencent.mapsdk.internal.mz a17 = com.tencent.mapsdk.internal.mz.a(neVar.getContext(), (com.tencent.tencentmap.mapsdk.maps.TencentMapOptions) null);
        com.tencent.mapsdk.internal.kt.a(a17.f50473d);
        this.f51325l = a17.f50473d;
    }

    private void a(boolean z17) {
        this.f51319f = z17;
        if (z17) {
            this.f51322i.sendEmptyMessage(f51315m);
        } else {
            this.f51322i.sendEmptyMessage(f51317o);
        }
    }

    private void b() {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "performInit");
        this.f51321h = false;
        this.f51320g = false;
        a();
    }

    private boolean c() {
        return this.f51320g;
    }

    private boolean d() {
        return !this.f51321h && this.f51319f;
    }

    private void e() {
        this.f51320g = false;
        this.f51322i.sendEmptyMessage(f51316n);
    }

    private void f() {
        this.f51320g = true;
    }

    private void g() {
        this.f51321h = true;
        this.f51319f = false;
        this.f51322i.sendEmptyMessage(f51317o);
    }

    private void h() {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "performDestroy");
        this.f51324k.a();
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void j() {
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void k() {
        this.f51322i.sendEmptyMessage(f51316n);
    }

    private static com.tencent.mapsdk.internal.rx a(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        byte[] bArr;
        java.lang.String encode = java.net.URLEncoder.encode(com.tencent.map.tools.EncryptAesUtils.encryptAes256Base64("lblat=" + latLng.latitude + "&lblon=" + latLng.longitude + "&rtlat=" + latLng2.latitude + "&rtlon=" + latLng2.longitude + "&zoom=" + i17 + "&suid=" + com.tencent.mapsdk.internal.hn.d() + "&version=" + com.tencent.mapsdk.internal.hn.n() + "&nt=" + com.tencent.mapsdk.internal.hn.g() + "&location=" + latLng3.latitude + "," + latLng3.longitude, f51310a, f51311b));
        com.tencent.mapsdk.internal.dy dyVar = (com.tencent.mapsdk.internal.dy) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dy.class);
        com.tencent.map.tools.net.NetResponse mapTrafficEvent = dyVar != null ? ((com.tencent.mapsdk.internal.dj) dyVar.i()).mapTrafficEvent(encode) : null;
        if (mapTrafficEvent != null && (bArr = mapTrafficEvent.data) != null) {
            com.tencent.mapsdk.internal.m mVar = new com.tencent.mapsdk.internal.m(bArr);
            mVar.a(com.tencent.mapsdk.internal.rv.f51270c);
            com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response response = new com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response();
            try {
                response.readFrom(mVar);
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.kx.f50213n, "traffic event read field exception:" + e17.fillInStackTrace());
            }
            if (response.error != 0 || response.detail == null) {
                return null;
            }
            com.tencent.mapsdk.internal.rx rxVar = new com.tencent.mapsdk.internal.rx(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder().include(latLng).include(latLng2).build(), response.detail);
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50213n, "traffic event data detail:".concat(java.lang.String.valueOf(rxVar)));
            return rxVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rsp = ");
        sb6.append(mapTrafficEvent != null ? java.lang.Integer.valueOf(mapTrafficEvent.statusCode) : "null");
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, sb6.toString());
        return null;
    }

    private com.tencent.mapsdk.internal.rx b(int i17) {
        com.tencent.mapsdk.internal.ne neVar = this.f51323j;
        if (neVar == null) {
            return null;
        }
        if (neVar.O() != null && this.f51323j.O().f49001d) {
            return null;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "traffic event tobe fetch data from net!");
        com.tencent.mapsdk.internal.ne neVar2 = this.f51323j;
        android.graphics.Rect rect = neVar2.f50515o;
        return a(i17, neVar2.f50513m.a(new android.graphics.PointF(rect.width() * (-2), rect.height() * 3)), this.f51323j.f50513m.a(new android.graphics.PointF(rect.width() * 3, rect.height() * (-2))), com.tencent.mapsdk.internal.kr.a(this.f51323j.f50520t.f52420m));
    }

    private void a(com.tencent.mapsdk.internal.rx rxVar, com.tencent.mapsdk.internal.rx rxVar2) {
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list;
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list2;
        boolean z17;
        if (rxVar2 == null || (list = rxVar2.f51301c) == null) {
            return;
        }
        if (list.isEmpty()) {
            this.f51324k.a();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (rxVar == null || (list2 = rxVar.f51301c) == null || list2.isEmpty()) {
            return;
        }
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list3 = rxVar.f51301c;
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list4 = rxVar2.f51301c;
        for (com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail detail : list3) {
            java.util.Iterator<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> it = list4.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().basic.eventid.equals(detail.basic.eventid)) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                linkedList.add(detail);
            }
        }
        this.f51324k.b(linkedList);
    }

    public static /* synthetic */ void b(com.tencent.mapsdk.internal.sa saVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "performDestroy");
        saVar.f51324k.a();
    }

    private void a(com.tencent.mapsdk.internal.rx rxVar) {
        java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list;
        int i17;
        byte[] c17;
        byte[] bArr;
        com.tencent.mapsdk.internal.hg hgVar;
        if (rxVar == null || (list = rxVar.f51301c) == null || list.isEmpty()) {
            return;
        }
        com.tencent.mapsdk.internal.ne neVar = this.f51323j;
        if (neVar != null && (hgVar = neVar.f49000c) != null) {
            hgVar.f().f49739a++;
        }
        java.util.Iterator<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> it = rxVar.f51301c.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                if (com.tencent.mapsdk.internal.hl.f49771b.a(substring) == null) {
                    java.io.File file = new java.io.File(this.f51325l, substring);
                    if (!file.exists()) {
                        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
                        if (doGet != null && (bArr = doGet.data) != null) {
                            com.tencent.mapsdk.internal.ks.a(file, bArr);
                            c17 = doGet.data;
                        }
                    } else {
                        c17 = com.tencent.mapsdk.internal.ks.c(file);
                    }
                    if (c17 != null && c17.length > 0) {
                        com.tencent.mapsdk.internal.hl.f49771b.a(substring, android.graphics.BitmapFactory.decodeByteArray(c17, 0, c17.length));
                    }
                }
            }
        }
        this.f51324k.a(rxVar.f51301c);
    }

    private void a(java.util.List<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> list) {
        int i17;
        byte[] c17;
        byte[] bArr;
        java.util.Iterator<com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = it.next().basic.icon_normal;
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1 && (i17 = lastIndexOf + 1) <= str.length()) {
                java.lang.String substring = str.substring(i17);
                if (com.tencent.mapsdk.internal.hl.f49771b.a(substring) == null) {
                    java.io.File file = new java.io.File(this.f51325l, substring);
                    if (!file.exists()) {
                        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
                        if (doGet != null && (bArr = doGet.data) != null) {
                            com.tencent.mapsdk.internal.ks.a(file, bArr);
                            c17 = doGet.data;
                        }
                    } else {
                        c17 = com.tencent.mapsdk.internal.ks.c(file);
                    }
                    if (c17 != null && c17.length > 0) {
                        com.tencent.mapsdk.internal.hl.f49771b.a(substring, android.graphics.BitmapFactory.decodeByteArray(c17, 0, c17.length));
                    }
                }
            }
        }
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.TrafficEvent a(int i17) {
        com.tencent.mapsdk.internal.rz rzVar = this.f51324k;
        if (rzVar == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> it = rzVar.f51306a.keySet().iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.rz.a aVar = this.f51324k.f51306a.get(it.next());
            if (aVar != null && aVar.f51308a.a() == i17) {
                return new com.tencent.mapsdk.internal.ry(aVar.f51309b);
            }
        }
        return null;
    }

    public final void a() {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "performRefresh");
        if (d()) {
            if (!this.f51320g) {
                com.tencent.mapsdk.internal.ne neVar = this.f51323j;
                int a17 = (int) neVar.f50520t.a();
                com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a18 = neVar.f50513m.a();
                com.tencent.mapsdk.internal.rx rxVar = this.f51326p.get(a17);
                com.tencent.mapsdk.internal.rx b17 = (rxVar != null && rxVar.f51301c != null && android.os.SystemClock.elapsedRealtime() - rxVar.f51299a <= 5000 && rxVar.f51300b.contains(a18[0]) && rxVar.f51300b.contains(a18[1]) && rxVar.f51300b.contains(a18[2]) && rxVar.f51300b.contains(a18[3])) ? null : b(a17);
                if (b17 == null || b17.f51301c == null) {
                    b17 = rxVar;
                }
                this.f51326p.put(a17, b17);
                a(rxVar, b17);
                a(b17);
                this.f51322i.removeMessages(f51316n);
                this.f51322i.sendEmptyMessageDelayed(f51316n, 5000L);
                return;
            }
            com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "traffic event tobe paused!");
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "traffic event tobe destroyed!");
        this.f51326p.clear();
    }

    public static /* synthetic */ void a(com.tencent.mapsdk.internal.sa saVar) {
        com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50213n, "performInit");
        saVar.f51321h = false;
        saVar.f51320g = false;
        saVar.a();
    }
}
