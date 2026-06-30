package vw;

@j95.b
/* loaded from: classes6.dex */
public final class r extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static volatile vw.r f522255e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f522256d = new java.util.concurrent.ConcurrentHashMap();

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrsLivePlayHelperService", "BrsLivePlayHelperService initialized");
        synchronized (vw.r.class) {
            if (f522255e == null) {
                f522255e = this;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BrsLivePlayHelperService", "Initializing on main process");
        }
    }
}
