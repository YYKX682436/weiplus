package a5;

/* loaded from: classes13.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1428a = false;

    /* renamed from: b, reason: collision with root package name */
    public java.util.UUID f1429b;

    /* renamed from: c, reason: collision with root package name */
    public j5.w f1430c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f1431d;

    public s0(java.lang.Class cls) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f1431d = hashSet;
        this.f1429b = java.util.UUID.randomUUID();
        this.f1430c = new j5.w(this.f1429b.toString(), cls.getName());
        hashSet.add(cls.getName());
        c();
    }

    public final a5.t0 a() {
        a5.t0 b17 = b();
        a5.f fVar = this.f1430c.f297773j;
        boolean z17 = true;
        if (!(((java.util.HashSet) fVar.f1392h.f1396a).size() > 0) && !fVar.f1388d && !fVar.f1386b && !fVar.f1387c) {
            z17 = false;
        }
        j5.w wVar = this.f1430c;
        if (wVar.f297780q) {
            if (z17) {
                throw new java.lang.IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (wVar.f297770g > 0) {
                throw new java.lang.IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        this.f1429b = java.util.UUID.randomUUID();
        j5.w wVar2 = new j5.w(this.f1430c);
        this.f1430c = wVar2;
        wVar2.f297764a = this.f1429b.toString();
        return b17;
    }

    public abstract a5.t0 b();

    public abstract a5.s0 c();

    public final a5.s0 d(a5.a aVar, long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f1428a = true;
        j5.w wVar = this.f1430c;
        wVar.f297775l = aVar;
        long millis = timeUnit.toMillis(j17);
        wVar.getClass();
        java.lang.String str = j5.w.f297763s;
        if (millis > 18000000) {
            a5.a0.c().f(str, "Backoff delay duration exceeds maximum value", new java.lang.Throwable[0]);
            millis = 18000000;
        }
        if (millis < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            a5.a0.c().f(str, "Backoff delay duration less than minimum value", new java.lang.Throwable[0]);
            millis = 10000;
        }
        wVar.f297776m = millis;
        return c();
    }

    public a5.s0 e(long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.f1430c.f297770g = timeUnit.toMillis(j17);
        if (com.tencent.wcdb.core.Database.DictDefaultMatchValue - java.lang.System.currentTimeMillis() > this.f1430c.f297770g) {
            return c();
        }
        throw new java.lang.IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }
}
