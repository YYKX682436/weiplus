package vm5;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f519681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vm5.g f519682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f519683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f519684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f519685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f519686f;

    public e(long j17, vm5.g gVar, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, long j18, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572, boolean z17) {
        this.f519681a = j17;
        this.f519682b = gVar;
        this.f519683c = c25736x76b98a57;
        this.f519684d = j18;
        this.f519685e = c25736x76b98a572;
        this.f519686f = z17;
    }

    @Override // com.p314xaae8f345.tav.p2967xc53e9ae1.InterfaceC25835x83ed6fa8
    /* renamed from: onUpdated */
    public final void mo98057x41ace1dc(com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f519681a;
        vm5.g gVar = this.f519682b;
        vm5.c cVar = gVar.f519699j;
        if (cVar != null) {
            java.util.ArrayList arrayList = ((bp4.e0) cVar).f104682a.f104751q.f382566b;
            if (arrayList.size() < 50) {
                arrayList.add(java.lang.Long.valueOf(currentTimeMillis));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.B(1468L, 11L);
            g0Var.C(1468L, 12L, currentTimeMillis);
        }
        xm5.b.c("VideoCompositionPlayer", "on composition update, success:" + z17 + ", position:" + (c25839x8ea38701.mo98035x2c929929().m97232x31040141() / 1000) + ", originPosition:" + this.f519683c + ", isStarted:" + gVar.f519697h + ", cost:" + (android.os.SystemClock.elapsedRealtime() - this.f519684d), new java.lang.Object[0]);
        c25839x8ea38701.m98078xe9aa2080(this.f519685e);
        if (this.f519686f || gVar.f519697h) {
            c25839x8ea38701.mo98034x348b34();
        }
        gVar.f519698i = false;
    }
}
