package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f234541a;

    /* renamed from: b, reason: collision with root package name */
    public long f234542b;

    /* renamed from: c, reason: collision with root package name */
    public double f234543c;

    /* renamed from: d, reason: collision with root package name */
    public long f234544d;

    public final void a(yz5.a getter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        long longValue = ((java.lang.Number) getter.mo152xb9724478()).longValue();
        long j17 = this.f234541a + longValue;
        this.f234541a = j17;
        long j18 = this.f234542b + 1;
        this.f234542b = j18;
        this.f234543c = j17 / j18;
        this.f234544d = java.lang.Math.max(this.f234544d, longValue);
    }
}
