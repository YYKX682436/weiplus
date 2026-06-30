package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class rv extends java.lang.Thread {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f51270c = "UTF-8";

    /* renamed from: h, reason: collision with root package name */
    private static final java.lang.String f51271h = "rttserverex";

    /* renamed from: i, reason: collision with root package name */
    private static final java.lang.String f51272i = "getRtt";

    /* renamed from: j, reason: collision with root package name */
    private static final java.lang.String f51273j = "info";

    /* renamed from: k, reason: collision with root package name */
    private static final java.lang.String f51274k = "req";

    /* renamed from: l, reason: collision with root package name */
    private static final int f51275l = 30000;

    /* renamed from: b, reason: collision with root package name */
    java.util.List<com.tencent.mapsdk.internal.rt> f51277b;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ne f51278d;

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mapsdk.internal.lu f51279e;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.tencentmap.mapsdk.maps.model.CameraPosition f51282m;

    /* renamed from: f, reason: collision with root package name */
    private boolean f51280f = false;

    /* renamed from: a, reason: collision with root package name */
    boolean f51276a = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f51281g = false;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f51283a;

        /* renamed from: b, reason: collision with root package name */
        public int f51284b;

        private a() {
        }

        public /* synthetic */ a(com.tencent.mapsdk.internal.rv rvVar, byte b17) {
            this();
        }
    }

    public rv(com.tencent.mapsdk.internal.ne neVar, com.tencent.mapsdk.internal.lu luVar) {
        this.f51278d = null;
        this.f51279e = null;
        setName("tms-traffic-refresh");
        this.f51278d = neVar;
        this.f51279e = luVar;
        this.f51277b = new java.util.ArrayList();
    }

    private void b() {
        this.f51276a = true;
        synchronized (this) {
            notifyAll();
        }
    }

    private void c() {
        this.f51276a = false;
        synchronized (this) {
            notifyAll();
        }
    }

    private int d() {
        com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest g17;
        com.tencent.mapsdk.internal.ne neVar = this.f51278d;
        if (neVar == null) {
            return 0;
        }
        try {
            synchronized (neVar.f50506f.f51669m) {
                com.tencent.mapsdk.internal.ad adVar = this.f51278d.f50508h;
                int i17 = adVar.A.f52409b.f52444m;
                android.graphics.Rect q17 = adVar.q();
                double d17 = q17.left / 1000000.0f;
                double d18 = q17.bottom / 1000000.0f;
                com.tencent.mapsdk.internal.rv.a a17 = a(d17, d18);
                com.tencent.mapsdk.internal.rv.a a18 = a(q17.right / 1000000.0f, q17.top / 1000000.0f);
                com.tencent.mapsdk.internal.tk tkVar = this.f51278d.f50506f;
                tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass13(i17, java.lang.Math.min(a17.f51283a, a18.f51283a), java.lang.Math.min(a17.f51284b, a18.f51284b), java.lang.Math.max(a18.f51283a, a17.f51283a), java.lang.Math.max(a18.f51284b, a17.f51284b)));
            }
            byte[] bArr = null;
            if (this.f51278d != null && (g17 = g()) != null) {
                com.tencent.mapsdk.internal.lu luVar = this.f51279e;
                com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t user_login_tVar = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t();
                user_login_tVar.f48710pf = "android_sdk";
                user_login_tVar.is_login = false;
                user_login_tVar.channel = com.tencent.mapsdk.internal.hn.m();
                user_login_tVar.imei = com.tencent.mapsdk.internal.hn.d();
                com.tencent.mapsdk.internal.f fVar = new com.tencent.mapsdk.internal.f();
                fVar.c(f51271h);
                fVar.d(f51272i);
                fVar.a(f51273j, (java.lang.String) user_login_tVar);
                fVar.a(f51274k, (java.lang.String) g17);
                bArr = luVar.a(fVar.f());
            }
            if (bArr != null && bArr.length > 0) {
                com.tencent.mapsdk.internal.tk tkVar2 = this.f51278d.f50506f;
                ((java.lang.Integer) tkVar2.a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass185>) new com.tencent.mapsdk.internal.tk.AnonymousClass185(bArr, bArr.length), (com.tencent.mapsdk.internal.tk.AnonymousClass185) (-1))).intValue();
                com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f51278d.K).c(com.tencent.mapsdk.internal.la.a.f50266g, "refreshTrafficData length > 0");
                return bArr.length;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mapsdk.core.utils.log.LogUtil.c("refreshTrafficData error", th6);
            com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f51278d.K).e(com.tencent.mapsdk.internal.la.a.f50266g, "refreshTrafficData error", th6);
        }
        return 0;
    }

    private void e() {
        com.tencent.mapsdk.internal.ad adVar = this.f51278d.f50508h;
        int i17 = adVar.A.f52409b.f52444m;
        android.graphics.Rect q17 = adVar.q();
        double d17 = q17.left / 1000000.0f;
        double d18 = q17.bottom / 1000000.0f;
        com.tencent.mapsdk.internal.rv.a a17 = a(d17, d18);
        com.tencent.mapsdk.internal.rv.a a18 = a(q17.right / 1000000.0f, q17.top / 1000000.0f);
        com.tencent.mapsdk.internal.tk tkVar = this.f51278d.f50506f;
        tkVar.b(new com.tencent.mapsdk.internal.tk.AnonymousClass13(i17, java.lang.Math.min(a17.f51283a, a18.f51283a), java.lang.Math.min(a17.f51284b, a18.f51284b), java.lang.Math.max(a18.f51283a, a17.f51283a), java.lang.Math.max(a18.f51284b, a17.f51284b)));
    }

    private byte[] f() {
        com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest g17;
        if (this.f51278d == null || (g17 = g()) == null) {
            return null;
        }
        com.tencent.mapsdk.internal.lu luVar = this.f51279e;
        com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t user_login_tVar = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t();
        user_login_tVar.f48710pf = "android_sdk";
        user_login_tVar.is_login = false;
        user_login_tVar.channel = com.tencent.mapsdk.internal.hn.m();
        user_login_tVar.imei = com.tencent.mapsdk.internal.hn.d();
        com.tencent.mapsdk.internal.f fVar = new com.tencent.mapsdk.internal.f();
        fVar.c(f51271h);
        fVar.d(f51272i);
        fVar.a(f51273j, (java.lang.String) user_login_tVar);
        fVar.a(f51274k, (java.lang.String) g17);
        return luVar.a(fVar.f());
    }

    private com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest g() {
        com.tencent.mapsdk.internal.ne neVar = this.f51278d;
        com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest rttRequest = null;
        if (neVar == null) {
            return null;
        }
        com.tencent.mapsdk.internal.tk tkVar = neVar.f50506f;
        com.tencent.mapsdk.internal.ru[] ruVarArr = (com.tencent.mapsdk.internal.ru[]) tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass35(), (com.tencent.mapsdk.internal.tk.AnonymousClass35) null);
        if (ruVarArr != null && ruVarArr.length != 0) {
            rttRequest = new com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest();
            java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
            int i17 = Integer.MIN_VALUE;
            int i18 = Integer.MAX_VALUE;
            int i19 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = Integer.MIN_VALUE;
            for (com.tencent.mapsdk.internal.ru ruVar : ruVarArr) {
                arrayList.add(java.lang.Integer.valueOf(ruVar.f51264d));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f51263c));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f51266f));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f51265e));
                arrayList.add(java.lang.Integer.valueOf(ruVar.f51267g));
                i18 = java.lang.Math.min(i18, ruVar.f51264d);
                i19 = java.lang.Math.min(i19, ruVar.f51263c);
                i17 = java.lang.Math.max(i17, ruVar.f51266f);
                i28 = java.lang.Math.max(i28, ruVar.f51265e);
                i27 = ruVar.f51261a;
            }
            try {
                double d17 = 3.141592653589793d - (((((i19 + i28) / 2) / 256.0d) * 6.283185307179586d) / 1048576.0d);
                this.f51282m = com.tencent.tencentmap.mapsdk.maps.model.CameraPosition.builder().target(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(java.lang.Math.atan((java.lang.Math.exp(d17) - java.lang.Math.exp(-d17)) * 0.5d) * 57.29577951308232d, (((((i18 + i17) / 2) / 256.0d) / 1048576.0d) * 360.0d) - 180.0d)).zoom(i27).build();
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.a(this.f51278d.K).e(com.tencent.mapsdk.internal.la.a.f50266g, "traffic thread calc request camera error", e17);
            }
            java.util.ArrayList<java.lang.Long> arrayList2 = new java.util.ArrayList<>();
            for (com.tencent.mapsdk.internal.ru ruVar2 : ruVarArr) {
                arrayList2.add(java.lang.Long.valueOf(ruVar2.f51269i));
            }
            rttRequest.crcs = arrayList2;
            com.tencent.mapsdk.internal.ru ruVar3 = ruVarArr[0];
            rttRequest.type = ruVar3.f51268h;
            rttRequest.bounds = arrayList;
            rttRequest.zip = (short) 1;
            rttRequest.zoom = (short) ruVar3.f51261a;
        }
        return rttRequest;
    }

    public final void a() {
        this.f51281g = true;
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rv.run():void");
    }

    private void b(com.tencent.mapsdk.internal.rt rtVar) {
        java.util.List<com.tencent.mapsdk.internal.rt> list = this.f51277b;
        if (list == null || rtVar == null) {
            return;
        }
        list.remove(rtVar);
    }

    private void a(com.tencent.mapsdk.internal.rt rtVar) {
        java.util.List<com.tencent.mapsdk.internal.rt> list = this.f51277b;
        if (list == null || rtVar == null) {
            return;
        }
        list.add(rtVar);
    }

    private static byte[] a(com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest rttRequest) {
        com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t user_login_tVar = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t();
        user_login_tVar.f48710pf = "android_sdk";
        user_login_tVar.is_login = false;
        user_login_tVar.channel = com.tencent.mapsdk.internal.hn.m();
        user_login_tVar.imei = com.tencent.mapsdk.internal.hn.d();
        com.tencent.mapsdk.internal.f fVar = new com.tencent.mapsdk.internal.f();
        fVar.c(f51271h);
        fVar.d(f51272i);
        fVar.a(f51273j, (java.lang.String) user_login_tVar);
        fVar.a(f51274k, (java.lang.String) rttRequest);
        return fVar.f();
    }

    private com.tencent.mapsdk.internal.rv.a a(double d17, double d18) {
        double sin = java.lang.Math.sin((d18 * 3.1415926d) / 180.0d);
        double log = ((180.0d - ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 180.0d) / 6.2831852d)) / 360.0d) * 2.68435456E8d;
        com.tencent.mapsdk.internal.rv.a aVar = new com.tencent.mapsdk.internal.rv.a(this, (byte) 0);
        aVar.f51283a = (int) ((((d17 + 180.0d) / 360.0d) * 2.68435456E8d) + 0.5d);
        aVar.f51284b = (int) (log + 0.5d);
        return aVar;
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(int i17, int i18) {
        double d17 = 3.141592653589793d - (((i18 / 256.0d) * 6.283185307179586d) / 1048576.0d);
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(java.lang.Math.atan((java.lang.Math.exp(d17) - java.lang.Math.exp(-d17)) * 0.5d) * 57.29577951308232d, (((i17 / 256.0d) / 1048576.0d) * 360.0d) - 180.0d);
    }
}
