package vp3;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f520492l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f520493m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f520494n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f520495o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f520496p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f520497q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f520498r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f520499s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f520500t;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar) {
        super(dVar);
        this.f520492l = dVar.b() + ".$hook";
        this.f520493m = dVar.b() + ".$ignore";
        this.f520494n = dVar.b() + ".$stack";
        this.f520495o = dVar.b() + ".$min";
        this.f520496p = dVar.b() + ".$max";
        this.f520497q = dVar.b() + ".$sampling";
        this.f520498r = dVar.b() + ".$extreme";
        this.f520499s = dVar.b() + ".$mmap";
        this.f520500t = dVar.b() + ".$stacklog";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f
    public void a(java.util.Map map) {
        boolean z17;
        super.a(map);
        java.lang.String str = this.f520492l;
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryHookConfigStg", "ERROR(MemoryHook): hook regex is blank");
            return;
        }
        java.lang.String str3 = this.f520493m;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        java.lang.String str5 = this.f520494n;
        boolean equals = "1".equals(map.get(str5));
        java.lang.String str6 = this.f520495o;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str6), 0);
        java.lang.String str7 = this.f520496p;
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str7), 0);
        java.lang.String str8 = this.f520497q;
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F((java.lang.String) map.get(str8), 1.0d);
        java.lang.String str9 = this.f520498r;
        boolean equals2 = "1".equals(map.get(str9));
        java.lang.String str10 = this.f520499s;
        boolean equals3 = "1".equals(map.get(str10));
        java.lang.String str11 = this.f520500t;
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str11), 31457280);
        if (equals2) {
            z17 = equals3;
        } else if (str4 == null) {
            z17 = equals3;
            str4 = ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
        } else {
            if (android.text.TextUtils.isEmpty(str4)) {
                z17 = equals3;
            } else {
                z17 = equals3;
                if (!str4.endsWith(";")) {
                    str4 = str4.concat(";");
                }
            }
            str4 = str4 + ".*libutils\\.so$;.*libcutils\\.so$;.*libskia\\.so$;.*libbinder.*\\.so$;.*libhwbinder\\.so$;.*libicuuc\\.so$;.*libicui18n\\.so$;.*libart.*\\.so$;.*libandroidfw\\.so$;.*libandroid_runtime\\.so$;.*libjavacore\\.so$;.*libopenjdk.*\\.so$;.*libmemfence\\.so$";
        }
        if (P3 > 524288000) {
            P3 = 524288000;
        }
        if (P3 < 0) {
            P3 = 0;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f234454a;
        o4Var.D(str, str2);
        o4Var.D(str3, str4);
        o4Var.G(str5, equals);
        o4Var.A(str6, P);
        o4Var.A(str7, P2);
        o4Var.y(str8, F);
        o4Var.G(str9, equals2);
        o4Var.G(str10, z17);
        o4Var.A(str11, P3);
    }

    public double f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f234454a;
        boolean U = o4Var.U();
        java.lang.String str = this.f520497q;
        if (!U) {
            return o4Var.f274431d.m84057x6ed94f5f(str, 1.0d);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f274434g;
        readLock.lock();
        o4Var.c(o4Var.f274432e);
        double m84057x6ed94f5f = o4Var.f274431d.m84057x6ed94f5f(str, 1.0d);
        readLock.unlock();
        return m84057x6ed94f5f;
    }
}
