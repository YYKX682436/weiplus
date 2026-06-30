package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class ng<T extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ni> {

    /* renamed from: a, reason: collision with root package name */
    protected int f132097a;

    /* renamed from: b, reason: collision with root package name */
    protected long f132098b;

    /* renamed from: c, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<T> f132099c;

    /* renamed from: d, reason: collision with root package name */
    public T f132100d;

    public ng(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<T> nhVar, T t17) {
        this.f132099c = nhVar;
        this.f132100d = t17;
    }

    private T c() {
        return this.f132100d;
    }

    public final void a(T t17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<T> nhVar = this.f132099c;
        if (nhVar == null || t17 == null) {
            return;
        }
        this.f132100d = t17;
        nhVar.a(this);
    }

    public final int b() {
        return this.f132097a;
    }

    public final long e_() {
        return this.f132098b;
    }

    /* renamed from: getId */
    public java.lang.String m36848x5db1b11() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f132097a);
        return sb6.toString();
    }

    /* renamed from: remove */
    public void m36849xc84af884() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nh<T> nhVar = this.f132099c;
        if (nhVar == null) {
            return;
        }
        nhVar.b(this);
    }

    public void a(long j17) {
        this.f132098b = j17;
    }
}
