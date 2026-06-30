package my3;

/* loaded from: classes13.dex */
public final class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414331d;

    public e(my3.q qVar) {
        this.f414331d = qVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        my3.q qVar = this.f414331d;
        if (!qVar.f414363p) {
            int i17 = qVar.f414358h;
            if (i17 >= 10) {
                qVar.f414358h = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "try bind service more than 10 times, abandon and clear bind info");
                my3.q.wi(qVar, 17);
                qVar.Zi(2);
            } else {
                qVar.f414358h = i17 + 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosServiceImpl", "bind service expire, try start service again, retry times = " + qVar.f414358h);
                my3.q.wi(qVar, 16);
                my3.q.Di(qVar, null);
            }
        }
        return false;
    }
}
