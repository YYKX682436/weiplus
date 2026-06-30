package ey2;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f338871a;

    /* renamed from: b, reason: collision with root package name */
    public final float f338872b;

    /* renamed from: c, reason: collision with root package name */
    public final long f338873c;

    public d0(float f17, float f18, long j17) {
        this.f338871a = f17;
        this.f338872b = f18;
        this.f338873c = j17;
    }

    /* renamed from: equals */
    public boolean m128329xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.d0)) {
            return false;
        }
        ey2.d0 d0Var = (ey2.d0) obj;
        return java.lang.Float.compare(this.f338871a, d0Var.f338871a) == 0 && java.lang.Float.compare(this.f338872b, d0Var.f338872b) == 0 && this.f338873c == d0Var.f338873c;
    }

    /* renamed from: hashCode */
    public int m128330x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f338871a) * 31) + java.lang.Float.hashCode(this.f338872b)) * 31) + java.lang.Long.hashCode(this.f338873c);
    }

    /* renamed from: toString */
    public java.lang.String m128331x9616526c() {
        return "LocationInfo(longitude=" + this.f338871a + ", latitude=" + this.f338872b + ", locationTimestamp=" + this.f338873c + ')';
    }

    public /* synthetic */ d0(float f17, float f18, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? 0L : j17);
    }
}
