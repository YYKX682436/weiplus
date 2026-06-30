package zy2;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f558900a;

    /* renamed from: b, reason: collision with root package name */
    public final long f558901b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f558902c;

    /* renamed from: d, reason: collision with root package name */
    public final float f558903d;

    public c5(java.lang.String feedId, long j17, boolean z17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        this.f558900a = feedId;
        this.f558901b = j17;
        this.f558902c = z17;
        this.f558903d = f17;
    }

    /* renamed from: equals */
    public boolean m179939xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.c5)) {
            return false;
        }
        zy2.c5 c5Var = (zy2.c5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558900a, c5Var.f558900a) && this.f558901b == c5Var.f558901b && this.f558902c == c5Var.f558902c && java.lang.Float.compare(this.f558903d, c5Var.f558903d) == 0;
    }

    /* renamed from: hashCode */
    public int m179940x8cdac1b() {
        return (((((this.f558900a.hashCode() * 31) + java.lang.Long.hashCode(this.f558901b)) * 31) + java.lang.Boolean.hashCode(this.f558902c)) * 31) + java.lang.Float.hashCode(this.f558903d);
    }

    /* renamed from: toString */
    public java.lang.String m179941x9616526c() {
        return "FinderNotifyStopPlayParam(feedId=" + this.f558900a + ", playbackTime=" + this.f558901b + ", isPause=" + this.f558902c + ", playbackRate=" + this.f558903d + ')';
    }
}
