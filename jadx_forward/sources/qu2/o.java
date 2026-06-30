package qu2;

/* loaded from: classes12.dex */
public final class o implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448335a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448336b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448337c;

    /* renamed from: d, reason: collision with root package name */
    public nh.c f448338d;

    /* renamed from: e, reason: collision with root package name */
    public float f448339e;

    public o(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448335a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopAndReport, profiler");
        nh.c cVar = this.f448338d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        if (this.f448336b && !this.f448337c) {
            this.f448336b = false;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new qu2.n(this, map, null), 2, null);
        }
    }

    public final float c() {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
                return r0.getIntExtra(ya.b.f77487x44fa364, -1) / r0.getIntExtra("scale", -1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("PowerConsumptionEasyCollector", "err:%s", e17.getMessage());
        }
        return 0.0f;
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel, profiler");
        nh.c cVar = this.f448338d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        this.f448337c = true;
        this.f448336b = false;
        nh.c cVar2 = this.f448338d;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start, profiler");
        nh.c cVar = this.f448338d;
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PowerConsumptionEasyCollector", sb6.toString());
        if (this.f448336b) {
            return;
        }
        this.f448336b = true;
        nh.c cVar2 = new nh.c("Live");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("new, profiler");
        nh.c cVar3 = this.f448338d;
        sb7.append(cVar3 != null ? java.lang.Integer.valueOf(cVar3.f418602b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PowerConsumptionEasyCollector", sb7.toString());
        cVar2.d();
        this.f448338d = cVar2;
        this.f448337c = false;
        this.f448339e = c();
    }
}
