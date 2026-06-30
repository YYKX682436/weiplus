package so2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f491795a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f491796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f491797c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f491798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f491799e;

    public b(long j17, boolean z17, boolean z18, java.lang.Long l17, java.lang.Long l18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        l17 = (i17 & 8) != 0 ? null : l17;
        l18 = (i17 & 16) != 0 ? null : l18;
        this.f491795a = j17;
        this.f491796b = z17;
        this.f491797c = z18;
        this.f491798d = l17;
        this.f491799e = l18;
    }

    /* renamed from: equals */
    public boolean m164850xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.b)) {
            return false;
        }
        so2.b bVar = (so2.b) obj;
        return this.f491795a == bVar.f491795a && this.f491796b == bVar.f491796b && this.f491797c == bVar.f491797c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491798d, bVar.f491798d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491799e, bVar.f491799e);
    }

    /* renamed from: hashCode */
    public int m164851x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f491795a) * 31) + java.lang.Boolean.hashCode(this.f491796b)) * 31) + java.lang.Boolean.hashCode(this.f491797c)) * 31;
        java.lang.Long l17 = this.f491798d;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f491799e;
        return hashCode2 + (l18 != null ? l18.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164852x9616526c() {
        return "AdCardState(adFeedId=" + this.f491795a + ", isClosed=" + this.f491796b + ", isHide=" + this.f491797c + ", startPlayOffsetMs=" + this.f491798d + ", countDownLastTimeMs=" + this.f491799e + ')';
    }
}
