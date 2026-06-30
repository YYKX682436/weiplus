package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f206798a;

    /* renamed from: b, reason: collision with root package name */
    public long f206799b;

    /* renamed from: c, reason: collision with root package name */
    public long f206800c;

    public q3(java.lang.String feedId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        this.f206798a = feedId;
        this.f206799b = j17;
        this.f206800c = j18;
    }

    /* renamed from: equals */
    public boolean m58881xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f206798a, q3Var.f206798a) && this.f206799b == q3Var.f206799b && this.f206800c == q3Var.f206800c;
    }

    /* renamed from: hashCode */
    public int m58882x8cdac1b() {
        return (((this.f206798a.hashCode() * 31) + java.lang.Long.hashCode(this.f206799b)) * 31) + java.lang.Long.hashCode(this.f206800c);
    }

    /* renamed from: toString */
    public java.lang.String m58883x9616526c() {
        return "FinderSearchFeedInfo(feedId=" + this.f206798a + ", stayTimeInMs=" + this.f206799b + ", startPlayTime=" + this.f206800c + ')';
    }
}
