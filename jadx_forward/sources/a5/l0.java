package a5;

/* loaded from: classes13.dex */
public final class l0 extends a5.s0 {
    public l0(java.lang.Class cls, long j17, java.util.concurrent.TimeUnit timeUnit) {
        super(cls);
        j5.w wVar = this.f82963c;
        long millis = timeUnit.toMillis(j17);
        wVar.getClass();
        long j18 = 900000;
        java.lang.String str = j5.w.f379296s;
        if (millis < 900000) {
            a5.a0.c().f(str, java.lang.String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new java.lang.Throwable[0]);
            millis = 900000;
        }
        if (millis < 900000) {
            a5.a0.c().f(str, java.lang.String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new java.lang.Throwable[0]);
        } else {
            j18 = millis;
        }
        if (millis < 300000) {
            a5.a0.c().f(str, java.lang.String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new java.lang.Throwable[0]);
            millis = 300000;
        }
        if (millis > j18) {
            a5.a0.c().f(str, java.lang.String.format("Flex duration greater than interval duration; Changed to %s", java.lang.Long.valueOf(j18)), new java.lang.Throwable[0]);
            millis = j18;
        }
        wVar.f379304h = j18;
        wVar.f379305i = millis;
    }

    @Override // a5.s0
    public a5.t0 b() {
        if (this.f82961a && this.f82963c.f379306j.f82920c) {
            throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (this.f82963c.f379313q) {
            throw new java.lang.IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new a5.m0(this);
    }

    @Override // a5.s0
    public a5.s0 c() {
        return this;
    }
}
