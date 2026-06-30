package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f206629a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f206630b;

    /* renamed from: c, reason: collision with root package name */
    public final long f206631c;

    /* renamed from: d, reason: collision with root package name */
    public final long f206632d;

    /* renamed from: e, reason: collision with root package name */
    public final long f206633e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f206634f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f206635g;

    public k3(long j17, java.lang.String str, long j18, int i17, long j19, long j27, java.lang.String str2, java.lang.String str3) {
        this.f206629a = j17;
        this.f206630b = str;
        this.f206631c = j18;
        this.f206632d = j19;
        this.f206633e = j27;
        this.f206634f = str2;
        this.f206635g = str3;
    }

    /* renamed from: equals */
    public boolean m58858xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3 k3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k3) obj;
        return this.f206629a == k3Var.f206629a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f206630b, k3Var.f206630b) && this.f206631c == k3Var.f206631c && this.f206632d == k3Var.f206632d && this.f206633e == k3Var.f206633e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f206634f, k3Var.f206634f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f206635g, k3Var.f206635g);
    }

    /* renamed from: hashCode */
    public int m58859x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f206629a) * 31;
        java.lang.String str = this.f206630b;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f206631c)) * 31) + java.lang.Integer.hashCode(1)) * 31) + java.lang.Long.hashCode(this.f206632d)) * 31) + java.lang.Long.hashCode(this.f206633e)) * 31;
        java.lang.String str2 = this.f206634f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f206635g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m58860x9616526c() {
        return "PreMovieAdCommonReportInfo(feedId=" + this.f206629a + ", dupFlag=" + this.f206630b + ", outerDuration=" + this.f206631c + ", playCount=1, playTotalTime=" + this.f206632d + ", videoTotalTime=" + this.f206633e + ", adReportExtraData=" + this.f206634f + ", finderReportBypassData=" + this.f206635g + ')';
    }
}
