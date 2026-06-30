package t94;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t94.a f498116a = new t94.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f498117b;

    public final boolean a() {
        f498117b = ih.a.f(e42.d0.clicfg_sns_record_resolution_ratio_9_16, true);
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_USE_NEW_RECORD_INT_SYNC, 0);
        if (r17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag " + f498117b);
            return f498117b;
        }
        if (r17 != 2) {
            if (f498117b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag false");
                f498117b = false;
            }
            return false;
        }
        if (!f498117b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRecordPostNewConfig", "enableRecordWithFixedResolutionFlag true");
            f498117b = true;
        }
        return true;
    }
}
