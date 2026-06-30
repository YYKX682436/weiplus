package gi1;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f353781a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f353782b = new java.lang.Object();

    public static void a(final java.lang.String str, final int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoiceServiceVoipCallSubIdStatusCache", "putVoipCallSubIdStatus: subId = " + str + ", status = " + i17);
        synchronized (f353782b) {
            f353781a.put(str, java.lang.Integer.valueOf(i17));
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: gi1.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("appbrand_service_voip_call_id_status_mmkv_name", gm0.j1.b().h(), 2).A(str, i17);
            }
        });
    }
}
