package qh;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f444841a;

    /* renamed from: b, reason: collision with root package name */
    public int f444842b;

    /* renamed from: c, reason: collision with root package name */
    public int f444843c;

    /* renamed from: d, reason: collision with root package name */
    public int f444844d;

    /* renamed from: e, reason: collision with root package name */
    public int f444845e;

    /* renamed from: f, reason: collision with root package name */
    public int f444846f;

    /* renamed from: g, reason: collision with root package name */
    public int f444847g;

    /* renamed from: h, reason: collision with root package name */
    public int f444848h;

    /* renamed from: j, reason: collision with root package name */
    public int f444850j;

    /* renamed from: l, reason: collision with root package name */
    public int f444852l;

    /* renamed from: n, reason: collision with root package name */
    public long f444854n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicBoolean f444855o;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f444849i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f444851k = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f444853m = false;

    public static qh.b a() {
        ph.u uVar;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null) {
            return b(1L);
        }
        qh.a aVar = new qh.a(uVar.f435829h);
        aVar.f444853m = true;
        return aVar;
    }

    public static qh.b b(long j17) {
        if (j17 <= 0) {
            j17 = 0;
        }
        qh.b bVar = new qh.b();
        bVar.f444854n = j17;
        rh.w wVar = (rh.w) ph.a.a(rh.w.class);
        if (wVar != null) {
            rh.v k17 = wVar.k(j17);
            if (k17.f476898c) {
                bVar.f444841a = ((java.lang.Long) k17.f477052e.f477085a).intValue();
                bVar.f444842b = ((java.lang.Long) k17.f477053f.f477085a).intValue();
                bVar.f444843c = ((java.lang.Long) k17.f477054g.f477085a).intValue();
                bVar.f444844d = ((java.lang.Long) k17.f477055h.f477085a).intValue();
                wh.i2 l17 = wVar.l(j17);
                wh.h2 b17 = l17.b();
                if (b17 != null) {
                    bVar.f444849i = b17.f527329a;
                    bVar.f444850j = b17.f527330b;
                    wh.h2 c17 = l17.c();
                    if (c17 != null) {
                        bVar.f444851k = c17.f527329a;
                        bVar.f444852l = c17.f527330b;
                    }
                    rh.d2 d2Var = (rh.d2) ph.a.a(rh.d2.class);
                    if (d2Var != null) {
                        rh.a2 m17 = d2Var.m(j17);
                        if (m17.f476898c) {
                            bVar.f444845e = ((java.lang.Long) m17.f476833e.f477085a).intValue();
                            bVar.f444846f = ((java.lang.Long) m17.f476834f.f477085a).intValue();
                            bVar.f444847g = ((java.lang.Long) m17.f476835g.f477085a).intValue();
                            bVar.f444848h = ((java.lang.Long) m17.f476836h.f477085a).intValue();
                            bVar.f444853m = true;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int c() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f444855o;
        if ((atomicBoolean != null && atomicBoolean.get()) || this.f444841a >= 50) {
            return 1;
        }
        if (this.f444843c >= 50) {
            return 3;
        }
        return this.f444844d >= 50 ? 4 : 2;
    }

    public int d() {
        if (this.f444845e >= 50) {
            return 1;
        }
        if (this.f444847g >= 50) {
            return 3;
        }
        return this.f444848h >= 50 ? 4 : 2;
    }

    public long e() {
        return java.lang.Math.max(1L, this.f444854n / 60000);
    }

    public boolean f() {
        return c() == 3;
    }

    public boolean g() {
        return d() == 1;
    }

    public boolean h() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f444855o;
        return atomicBoolean != null ? atomicBoolean.get() : c() == 1;
    }

    /* renamed from: toString */
    public java.lang.String m160115x9616526c() {
        return "AppStats{appFgRatio=" + this.f444841a + ", appBgRatio=" + this.f444842b + ", appFgSrvRatio=" + this.f444843c + ", appFloatRatio=" + this.f444844d + ", devChargingRatio=" + this.f444845e + ", devUnChargingRatio=" + this.f444846f + ", devSceneOffRatio=" + this.f444847g + ", devLowEnergyRatio=" + this.f444848h + ", sceneTop1='" + this.f444849i + "', sceneTop1Ratio=" + this.f444850j + ", sceneTop2='" + this.f444851k + "', sceneTop2Ratio=" + this.f444852l + ", isValid=" + this.f444853m + ", duringMillis=" + this.f444854n + ", foregroundOverride=" + this.f444855o + '}';
    }
}
