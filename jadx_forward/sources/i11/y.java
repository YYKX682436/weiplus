package i11;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce f368690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f368691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f368692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.u f368693h;

    public y(i11.u uVar, android.content.Context context, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce, int i17, android.os.Looper looper) {
        this.f368693h = uVar;
        this.f368689d = context;
        this.f368690e = interfaceC4219xb9b728ce;
        this.f368691f = i17;
        this.f368692g = looper;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        boolean h17 = j35.u.h(this.f368689d, "android.permission.ACCESS_FINE_LOCATION");
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce = this.f368690e;
        if (h17) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, null)) {
                com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4221x9c23eacb.m34933x204ddf56();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(584L, 0L, 1L, true);
                com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.m34916x9cf0d20b(i11.u.f368683d, new android.util.Pair(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.f16242xc6cd8c52, "")).m34929xd46a31d4(this.f368691f);
                com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m34937xaf65a0fc = com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.m34937xaf65a0fc();
                this.f368693h.getClass();
                java.lang.Boolean bool = i11.u.f368684e;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "CN";
                    }
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!"CN".equalsIgnoreCase(str));
                    i11.u.f368684e = valueOf;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "isOverseasUser: %b", valueOf);
                    booleanValue = i11.u.f368684e.booleanValue();
                }
                if (booleanValue) {
                    m34937xaf65a0fc.m34958x8279821e(1);
                } else {
                    m34937xaf65a0fc.m34958x8279821e(0);
                }
                m34937xaf65a0fc.m34957x98928347(2000L);
                m34937xaf65a0fc.m34955x9f3591a8(wo.w0.c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "requestCode %d", java.lang.Integer.valueOf(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.m34916x9cf0d20b(i11.u.f368683d, new android.util.Pair(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.f16242xc6cd8c52, "")).m34926xcbe028c6(m34937xaf65a0fc, interfaceC4219xb9b728ce, this.f368692g)));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SLocationManager", "no location permission, just return.");
        interfaceC4219xb9b728ce.mo34913xcf0f8560(null, -1, null);
    }
}
