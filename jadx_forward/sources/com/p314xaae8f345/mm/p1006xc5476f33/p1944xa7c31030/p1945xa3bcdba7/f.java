package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f234454a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f234455b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f234456c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234457d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f234458e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f234459f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f234460g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f234461h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f234462i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f234463j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f234464k;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar) {
        this.f234464k = dVar.j();
        this.f234455b = dVar.b() + ".$source";
        this.f234456c = dVar.b() + ".$enable";
        this.f234457d = dVar.b() + ".$duration";
        this.f234458e = dVar.b() + ".begin";
        this.f234459f = dVar.b() + ".$multiprocess";
        this.f234460g = dVar.b() + ".$process";
        this.f234461h = dVar.b() + ".clientversion";
        this.f234462i = dVar.b() + ".crash";
        this.f234463j = dVar.b() + ".$dumpcycle";
    }

    public void a(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234446e, "convert and save config");
        java.lang.String str = this.f234456c;
        boolean equals = "1".equals(map.get(str));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f234454a;
        o4Var.G(str, equals);
        java.lang.String str2 = this.f234457d;
        o4Var.A(str2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str2), 0));
        o4Var.B(this.f234458e, java.lang.System.currentTimeMillis());
        java.lang.String str3 = this.f234459f;
        o4Var.G(str3, "1".equals(map.get(str3)));
        java.lang.String str4 = this.f234460g;
        o4Var.D(str4, (java.lang.String) map.get(str4));
        o4Var.A(this.f234461h, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h);
    }

    public boolean b() {
        boolean i17 = this.f234454a.i(this.f234459f, false);
        java.lang.String d17 = d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234446e, "[%s] filterProcess: target process is %s, current process is %s", this.f234464k, d17, bm5.f1.a());
        if (d17.contains(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18) || (android.text.TextUtils.isEmpty(d17) && i17)) {
            return true;
        }
        if ((d17.contains("mm") || android.text.TextUtils.isEmpty(d17)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return true;
        }
        if (d17.contains("appbrand") && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            return true;
        }
        return d17.contains("tools") && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s();
    }

    public long c() {
        return java.util.concurrent.TimeUnit.MINUTES.toMillis(this.f234454a.q(this.f234463j, 30L));
    }

    public java.lang.String d() {
        return this.f234454a.u(this.f234460g, "");
    }

    public boolean e() {
        return this.f234454a.i(this.f234456c, false);
    }
}
