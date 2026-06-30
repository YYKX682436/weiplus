package mm2;

/* loaded from: classes3.dex */
public final class n4 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f410821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f410822e;

    public n4(long j17, mm2.o4 o4Var) {
        this.f410821d = j17;
        this.f410822e = o4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f410821d;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f410822e.f410866y0).k(java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }
}
