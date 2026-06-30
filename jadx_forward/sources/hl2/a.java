package hl2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final hl2.a f363632a = new hl2.a();

    /* renamed from: b, reason: collision with root package name */
    public static long f363633b;

    public final boolean a() {
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85260d8).mo141623x754a37bb()).r()).intValue();
        if (intValue != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCreateLivePrepareSwitch", "isEnableNetworkIdentityAuth configValue=" + intValue);
            return intValue == 1;
        }
        long j17 = f363633b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG enableNetworkIdentityAuth: ");
        long j18 = j17 & 32;
        sb6.append(j18 != 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCreateLivePrepareSwitch", sb6.toString());
        return j18 != 0;
    }
}
