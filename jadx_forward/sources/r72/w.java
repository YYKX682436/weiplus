package r72;

/* loaded from: classes15.dex */
public class w extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f474692d;

    public w() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "poiClassifyId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.g(-1, "longitude"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.g(-1, "latitude")});
        this.f474692d = mo75927x8ded05a8;
        super.m126741x8589bfe1("finderTopicLocation");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", valueOf, valueOf});
    }

    /* renamed from: getLatitude */
    public float m162032x2605e9e2() {
        return super.m75938x746dc8a6(this.f474692d + 2);
    }

    /* renamed from: getLongitude */
    public float m162033x79d7af9() {
        return super.m75938x746dc8a6(this.f474692d + 1);
    }

    public java.lang.String j() {
        return super.m75945x2fec8307(this.f474692d + 0);
    }

    public void k(float f17) {
        super.set(this.f474692d + 2, java.lang.Float.valueOf(f17));
    }

    public void l(float f17) {
        super.set(this.f474692d + 1, java.lang.Float.valueOf(f17));
    }

    public void n(java.lang.String str) {
        super.set(this.f474692d + 0, str);
    }
}
