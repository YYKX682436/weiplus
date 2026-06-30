package za1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final za1.b f552411a = new za1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final long f552412b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f552413c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("jsapi_ipc_big_data_transfer");

    public final byte[] a(java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f552413c;
        byte[] j17 = o4Var.j(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
        if (z17) {
            o4Var.remove(key);
        }
        return j17;
    }

    public final jz5.l b(byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.length < 102400) {
            return new jz5.l(java.lang.Boolean.FALSE, "");
        }
        java.lang.String str = android.os.SystemClock.elapsedRealtimeNanos() + "";
        f552413c.H(str, data);
        return new jz5.l(java.lang.Boolean.TRUE, str);
    }
}
