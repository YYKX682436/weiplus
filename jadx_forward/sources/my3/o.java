package my3;

/* loaded from: classes13.dex */
public final class o implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414350d;

    public o(my3.q qVar) {
        this.f414350d = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        my3.q qVar = this.f414350d;
        if (qVar.f414364q > 50) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "start service so much frequently, clear bind info");
            my3.q.wi(qVar, 18);
            qVar.Zi(1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "reset start service count");
        qVar.f414364q = 0;
        return false;
    }
}
