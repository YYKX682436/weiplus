package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class ng<T extends com.tencent.mapsdk.internal.ni> {

    /* renamed from: a, reason: collision with root package name */
    protected int f50564a;

    /* renamed from: b, reason: collision with root package name */
    protected long f50565b;

    /* renamed from: c, reason: collision with root package name */
    protected com.tencent.mapsdk.internal.nh<T> f50566c;

    /* renamed from: d, reason: collision with root package name */
    public T f50567d;

    public ng(com.tencent.mapsdk.internal.nh<T> nhVar, T t17) {
        this.f50566c = nhVar;
        this.f50567d = t17;
    }

    private T c() {
        return this.f50567d;
    }

    public final void a(T t17) {
        com.tencent.mapsdk.internal.nh<T> nhVar = this.f50566c;
        if (nhVar == null || t17 == null) {
            return;
        }
        this.f50567d = t17;
        nhVar.a(this);
    }

    public final int b() {
        return this.f50564a;
    }

    public final long e_() {
        return this.f50565b;
    }

    public java.lang.String getId() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f50564a);
        return sb6.toString();
    }

    public void remove() {
        com.tencent.mapsdk.internal.nh<T> nhVar = this.f50566c;
        if (nhVar == null) {
            return;
        }
        nhVar.b(this);
    }

    public void a(long j17) {
        this.f50565b = j17;
    }
}
