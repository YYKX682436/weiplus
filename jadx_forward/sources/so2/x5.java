package so2;

/* loaded from: classes2.dex */
public final class x5 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f492232d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f492233e;

    /* renamed from: f, reason: collision with root package name */
    public final long f492234f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ni4 f492235g;

    public x5(long j17, boolean z17, long j18, r45.ni4 ni4Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        j18 = (i17 & 4) != 0 ? c01.id.c() : j18;
        ni4Var = (i17 & 8) != 0 ? null : ni4Var;
        this.f492232d = j17;
        this.f492233e = z17;
        this.f492234f = j18;
        this.f492235g = ni4Var;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        so2.x5 other = (so2.x5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return (int) (other.f492234f - this.f492234f);
    }

    /* renamed from: equals */
    public boolean m164960xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.x5)) {
            return false;
        }
        so2.x5 x5Var = (so2.x5) obj;
        return this.f492232d == x5Var.f492232d && this.f492233e == x5Var.f492233e && this.f492234f == x5Var.f492234f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492235g, x5Var.f492235g);
    }

    /* renamed from: hashCode */
    public int m164961x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f492232d) * 31) + java.lang.Boolean.hashCode(this.f492233e)) * 31) + java.lang.Long.hashCode(this.f492234f)) * 31;
        r45.ni4 ni4Var = this.f492235g;
        return hashCode + (ni4Var == null ? 0 : ni4Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m164962x9616526c() {
        return "StreamMarkReadStat(feedId=" + this.f492232d + ", isRead=" + this.f492233e + ", timestamp=" + this.f492234f + ", stat=" + this.f492235g + ')';
    }
}
