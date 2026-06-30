package a5;

/* loaded from: classes13.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f82961a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.util.UUID f82962b;

    /* renamed from: c, reason: collision with root package name */
    public j5.w f82963c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f82964d;

    public s0(java.lang.Class cls) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f82964d = hashSet;
        this.f82962b = java.util.UUID.randomUUID();
        this.f82963c = new j5.w(this.f82962b.toString(), cls.getName());
        hashSet.add(cls.getName());
        c();
    }

    public final a5.t0 a() {
        a5.t0 b17 = b();
        a5.f fVar = this.f82963c.f379306j;
        boolean z17 = true;
        if (!(((java.util.HashSet) fVar.f82925h.f82929a).size() > 0) && !fVar.f82921d && !fVar.f82919b && !fVar.f82920c) {
            z17 = false;
        }
        j5.w wVar = this.f82963c;
        if (wVar.f379313q) {
            if (z17) {
                throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (wVar.f379303g > 0) {
                throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f82962b = java.util.UUID.randomUUID();
        j5.w wVar2 = new j5.w(this.f82963c);
        this.f82963c = wVar2;
        wVar2.f379297a = this.f82962b.toString();
        return b17;
    }

    public abstract a5.t0 b();

    public abstract a5.s0 c();

    public final a5.s0 d(a5.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f82961a = true;
        j5.w wVar = this.f82963c;
        wVar.f379308l = aVar;
        long millis = timeUnit.toMillis(j17);
        wVar.getClass();
        java.lang.String str = j5.w.f379296s;
        if (millis > 18000000) {
            a5.a0.c().f(str, "Backoff delay duration exceeds maximum value", new java.lang.Throwable[0]);
            millis = 18000000;
        }
        if (millis < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            a5.a0.c().f(str, "Backoff delay duration less than minimum value", new java.lang.Throwable[0]);
            millis = 10000;
        }
        wVar.f379309m = millis;
        return c();
    }

    public a5.s0 e(long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f82963c.f379303g = timeUnit.toMillis(j17);
        if (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 - java.lang.System.currentTimeMillis() > this.f82963c.f379303g) {
            return c();
        }
        throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
}
