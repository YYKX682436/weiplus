package km2;

/* loaded from: classes3.dex */
public final class m implements so2.j5 {

    /* renamed from: u, reason: collision with root package name */
    public static final km2.l f390661u = new km2.l(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e f390662d;

    /* renamed from: e, reason: collision with root package name */
    public gk2.e f390663e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f390664f;

    /* renamed from: g, reason: collision with root package name */
    public r45.h32 f390665g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jc1 f390666h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f390667i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f390668m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390669n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f390670o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f390671p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f390672q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f390673r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f390674s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f390675t;

    public m(com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e liveConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveConfig, "liveConfig");
        gk2.e eVar = new gk2.e("from LiveData");
        this.f390663e = eVar;
        this.f390664f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e(eVar);
        this.f390662d = liveConfig;
        this.f390675t = f390661u.b(this);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e a() {
        return this.f390664f;
    }

    public final java.lang.String b() {
        return hashCode() + "_config(haveExposed:" + this.f390667i + "): " + this.f390662d.b() + " LiveBuContext: " + ((mm2.c1) this.f390663e.a(mm2.c1.class)).J7();
    }

    public final java.lang.String c() {
        return "nickName:" + this.f390662d.M + ",havePlay:" + this.f390667i + ",liveId:" + this.f390662d.f150070e + ",objectId:" + this.f390662d.f150082s + "!\n";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof km2.m)) {
            return -1;
        }
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e = ((km2.m) obj).f390662d;
        long j17 = c10828x8f239b6e.f150070e;
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e c10828x8f239b6e2 = this.f390662d;
        if (j17 != c10828x8f239b6e2.f150070e && c10828x8f239b6e.f150082s != c10828x8f239b6e2.f150082s) {
            return -1;
        }
        if (!zl2.q4.f555466a.E()) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Loader", "compare feed obj:" + obj + " is same with this:" + this);
        return 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f390662d.f150082s;
    }

    @Override // in5.c
    public int h() {
        return 9;
    }

    /* renamed from: toString */
    public java.lang.String m143674x9616526c() {
        try {
            return b();
        } catch (java.lang.Exception e17) {
            return e17.toString();
        }
    }

    public m(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        gk2.e eVar = new gk2.e("from LiveData");
        this.f390663e = eVar;
        this.f390664f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e(eVar);
        this.f390675t = finderObject;
        this.f390662d = zl2.l.c(zl2.l.f555398a, finderObject, 0, false, 6, null);
    }
}
