package hn0;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final hn0.v f363973a = new hn0.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f363974b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static long f363975c;

    public final synchronized kn0.e a() {
        return (kn0.e) kz5.n0.k0(f363974b);
    }

    public final kn0.e b(android.os.Bundle bundle) {
        java.lang.String str;
        kn0.e eVar = new kn0.e(0L, 0, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, null, 0, 0.0f, 0.0f, 0, 0, 0L, 0L, -1, 7, null);
        long j17 = bundle != null ? bundle.getLong("NET_STATUS_START_TIME", 0L) : 0L;
        eVar.f391036a = bundle != null ? bundle.getLong("NET_STATUS_LIVE_ID", 0L) : 0L;
        eVar.f391037b = bundle != null ? bundle.getInt("NET_STATUS_ROLE", 0) : 0;
        eVar.f391038c = bundle != null ? bundle.getInt("NET_STATUS_MODE", 0) : 0;
        eVar.f391040e = bundle != null ? bundle.getInt("NET_STATUS_NET_TYPE", 0) : 0;
        eVar.f391039d = bundle != null ? bundle.getLong("NET_STATUS_TIMESTAMP", 0L) : 0L;
        eVar.f391058w = (int) (j17 / 1000);
        eVar.f391056u = java.lang.System.currentTimeMillis() - j17;
        java.lang.String string = bundle != null ? bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46320xa2c7de7f) : null;
        if (string != null) {
            java.lang.String str2 = string;
            eVar.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) kz5.n0.X(r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null)), 0);
            eVar.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) kz5.n0.i0(r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null)), 0);
        }
        eVar.f391041f = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46336xe22331f7) : 0;
        eVar.f391042g = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46332x487412f6) : 0;
        eVar.f391043h = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46330x1cbced5a) : 0;
        eVar.f391044i = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46331x1cbcf0f9) : 0;
        eVar.f391045j = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46325x901c335e) : 0;
        eVar.f391046k = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46312x2cd62fb9) : 0;
        eVar.f391047l = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46322x5607fd5a) : 0;
        eVar.f391048m = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46327xe105b3b3) : 0;
        eVar.f391049n = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46314xbd390ace) : 0;
        eVar.f391050o = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46338x720e4446) : 0;
        eVar.f391051p = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46318x5ee342d1) : 0;
        eVar.f391052q = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46319x52fadc5f) : 0;
        eVar.f391053r = (int) (bundle != null ? bundle.getFloat(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46315xfa37501a) : 0.0f);
        eVar.f391054s = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46321x5b407619) : 0;
        eVar.f391055t = bundle != null ? bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46323x28b0e3f9) : 0;
        if (bundle == null || (str = bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46324xc1721618)) == null) {
            str = "";
        }
        eVar.B = str;
        eVar.f391061z = bundle != null ? bundle.getInt("NET_STATUS_RTT") : 0;
        eVar.F = bundle != null ? bundle.getInt("NET_STATUS_UP_LOSS") : 0;
        eVar.G = bundle != null ? bundle.getInt("NET_STATUS_DOWN_LOSS") : 0;
        eVar.H = bundle != null ? bundle.getLong("NET_STATUS_SEND_BYTES") : 0L;
        eVar.I = bundle != null ? bundle.getLong("NET_STATUS_RECEIVE_BYTES") : 0L;
        return eVar;
    }

    public final long c() {
        return f363975c;
    }
}
