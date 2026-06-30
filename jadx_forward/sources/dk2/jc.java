package dk2;

/* loaded from: classes3.dex */
public final class jc implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.jc f315195d = new dk2.jc();

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        dk2.kc.f315229a.a(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveReporter", "cleanClientStatus");
        synchronized (hn0.v.f363973a) {
            hn0.v.f363974b.clear();
        }
        return true;
    }
}
