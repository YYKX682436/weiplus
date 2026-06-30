package fc2;

/* loaded from: classes2.dex */
public final class s extends fc2.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f342513d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f342514e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f342516g;

    /* renamed from: f, reason: collision with root package name */
    public long f342515f = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f342517h = -1;

    public s(int i17) {
        this.f342513d = i17;
    }

    /* renamed from: equals */
    public boolean m129335xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc2.s) && this.f342513d == ((fc2.s) obj).f342513d;
    }

    /* renamed from: hashCode */
    public int m129336x8cdac1b() {
        return java.lang.Integer.hashCode(this.f342513d);
    }

    /* renamed from: toString */
    public java.lang.String m129337x9616526c() {
        return "HorizontalVideoEvent(actionType=" + this.f342513d + ')';
    }
}
