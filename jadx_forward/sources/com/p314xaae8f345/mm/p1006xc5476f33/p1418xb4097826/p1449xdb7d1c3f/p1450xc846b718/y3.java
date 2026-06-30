package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class y3 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f187560d;

    /* renamed from: e, reason: collision with root package name */
    public final long f187561e;

    /* renamed from: f, reason: collision with root package name */
    public long f187562f;

    /* renamed from: g, reason: collision with root package name */
    public long f187563g;

    /* renamed from: h, reason: collision with root package name */
    public long f187564h;

    public y3(java.lang.String uuid, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        this.f187560d = uuid;
        this.f187561e = j17;
        this.f187562f = j18;
        this.f187563g = j19;
        this.f187564h = j27;
    }

    /* renamed from: equals */
    public boolean m55989xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.y3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187560d, y3Var.f187560d) && this.f187561e == y3Var.f187561e && this.f187562f == y3Var.f187562f && this.f187563g == y3Var.f187563g && this.f187564h == y3Var.f187564h;
    }

    /* renamed from: hashCode */
    public int m55990x8cdac1b() {
        return (((((((this.f187560d.hashCode() * 31) + java.lang.Long.hashCode(this.f187561e)) * 31) + java.lang.Long.hashCode(this.f187562f)) * 31) + java.lang.Long.hashCode(this.f187563g)) * 31) + java.lang.Long.hashCode(this.f187564h);
    }

    /* renamed from: toString */
    public java.lang.String m55991x9616526c() {
        return "ExposeTimeInfo(uuid=" + this.f187560d + ", firstExposeTime=" + this.f187561e + ", lastExposeTime=" + this.f187562f + ", lastUnExposeTime=" + this.f187563g + ", accumulateExposureDurationMs=" + this.f187564h + ')';
    }
}
