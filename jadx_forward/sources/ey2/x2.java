package ey2;

/* loaded from: classes2.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f339101a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f339102b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public int f339103c;

    /* renamed from: d, reason: collision with root package name */
    public int f339104d;

    /* renamed from: e, reason: collision with root package name */
    public long f339105e;

    /* renamed from: f, reason: collision with root package name */
    public ey2.z2 f339106f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f339107g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f339108h;

    /* renamed from: i, reason: collision with root package name */
    public int f339109i;

    /* renamed from: j, reason: collision with root package name */
    public r45.ha2 f339110j;

    public x2(int i17) {
        this.f339101a = i17;
        new java.util.LinkedList();
        this.f339106f = ey2.z2.f339131d;
    }

    /* renamed from: equals */
    public boolean m128394xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ey2.x2) && this.f339101a == ((ey2.x2) obj).f339101a;
    }

    /* renamed from: hashCode */
    public int m128395x8cdac1b() {
        return java.lang.Integer.hashCode(this.f339101a);
    }

    /* renamed from: toString */
    public java.lang.String m128396x9616526c() {
        return "Cache(tabType=" + this.f339101a + ')';
    }
}
