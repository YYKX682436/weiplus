package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public abstract class hb implements java.util.concurrent.Callable, wu5.g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7 {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f166180d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f166181e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f166182f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f166183g = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.b7
    public boolean d() {
        return this.f166183g;
    }

    public final java.lang.Object e() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f166180d = java.lang.System.currentTimeMillis();
        try {
            return call();
        } finally {
            this.f166181e = java.lang.System.currentTimeMillis();
            this.f166182f = this.f166181e - this.f166180d;
        }
    }

    public abstract java.lang.String f();

    public void g(boolean z17) {
        this.f166183g = z17;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public final java.lang.String mo1867xb5884f29() {
        return f();
    }

    public final java.util.concurrent.Future h() {
        return ((ku5.t0) ku5.t0.f394148d).c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.gb(this));
    }
}
