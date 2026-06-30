package dv2;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f325510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f325512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f325513d;

    /* renamed from: e, reason: collision with root package name */
    public final long f325514e;

    public y1(long j17, int i17, int i18, int i19, long j18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j18 = (i27 & 16) != 0 ? c01.id.a() : j18;
        this.f325510a = j17;
        this.f325511b = i17;
        this.f325512c = i18;
        this.f325513d = i19;
        this.f325514e = j18;
    }

    /* renamed from: equals */
    public boolean m126293xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv2.y1)) {
            return false;
        }
        dv2.y1 y1Var = (dv2.y1) obj;
        return this.f325510a == y1Var.f325510a && this.f325511b == y1Var.f325511b && this.f325512c == y1Var.f325512c && this.f325513d == y1Var.f325513d && this.f325514e == y1Var.f325514e;
    }

    /* renamed from: hashCode */
    public int m126294x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f325510a) * 31) + java.lang.Integer.hashCode(this.f325511b)) * 31) + java.lang.Integer.hashCode(this.f325512c)) * 31) + java.lang.Integer.hashCode(this.f325513d)) * 31) + java.lang.Long.hashCode(this.f325514e);
    }

    /* renamed from: toString */
    public java.lang.String m126295x9616526c() {
        return "WatchListItem(feedId=" + this.f325510a + ", progress=" + this.f325511b + ", commentScene=" + this.f325512c + ", scene=" + this.f325513d + ", lastWatchTime=" + this.f325514e + ')';
    }
}
