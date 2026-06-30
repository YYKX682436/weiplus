package i04;

/* loaded from: classes8.dex */
public final class g implements j04.f {

    /* renamed from: a, reason: collision with root package name */
    public long f368076a = java.lang.System.currentTimeMillis();

    @Override // j04.f
    public void a(java.lang.String sessionId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        long j19 = j18 - this.f368076a;
        this.f368076a = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "sessionID: %s, interval:%d date:%s, distanceTime:%d", sessionId, java.lang.Long.valueOf(j19 / 3600000), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18 - j17));
    }
}
