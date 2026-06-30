package xc2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f534832a;

    /* renamed from: b, reason: collision with root package name */
    public final long f534833b;

    /* renamed from: c, reason: collision with root package name */
    public final int f534834c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f534835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f534836e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f534837f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f534838g;

    public t(int i17, long j17, int i18, java.util.List list, boolean z17, java.lang.String bypassData, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 16) != 0 ? false : z17;
        bypassData = (i19 & 32) != 0 ? "" : bypassData;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        this.f534832a = i17;
        this.f534833b = j17;
        this.f534834c = i18;
        this.f534835d = list;
        this.f534836e = z17;
        this.f534837f = bypassData;
        this.f534838g = new java.util.LinkedHashSet();
    }

    /* renamed from: equals */
    public boolean m175333xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof xc2.t) && ((xc2.t) obj).f534834c == this.f534834c;
    }

    /* renamed from: hashCode */
    public int m175334x8cdac1b() {
        return this.f534834c;
    }

    /* renamed from: toString */
    public java.lang.String m175335x9616526c() {
        return "FinderFeedAllJumpInfo(commentScene=" + this.f534832a + ", feedId=" + this.f534833b + ", position=" + this.f534834c + ", list=" + this.f534835d + ", isFromFeed=" + this.f534836e + ", bypassData=" + this.f534837f + ')';
    }
}
