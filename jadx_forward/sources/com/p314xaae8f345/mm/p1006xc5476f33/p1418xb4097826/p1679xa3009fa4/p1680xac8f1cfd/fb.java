package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    public final long f215919a;

    /* renamed from: b, reason: collision with root package name */
    public final int f215920b;

    /* renamed from: c, reason: collision with root package name */
    public final long f215921c;

    public fb(long j17, int i17, long j18) {
        this.f215919a = j17;
        this.f215920b = i17;
        this.f215921c = j18;
    }

    /* renamed from: equals */
    public boolean m63109xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fb fbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fb) obj;
        return this.f215919a == fbVar.f215919a && this.f215920b == fbVar.f215920b && this.f215921c == fbVar.f215921c;
    }

    /* renamed from: hashCode */
    public int m63110x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f215919a) * 31) + java.lang.Integer.hashCode(this.f215920b)) * 31) + java.lang.Long.hashCode(this.f215921c);
    }

    /* renamed from: toString */
    public java.lang.String m63111x9616526c() {
        return "ActionRecord(feedId=" + this.f215919a + ", eventType=" + this.f215920b + ", timestampMs=" + this.f215921c + ')';
    }
}
