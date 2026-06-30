package av4;

/* loaded from: classes7.dex */
public final class l0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.l0 f14300d = new av4.l0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        d85.f0 f0Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "handleMsg params: " + msg.f340790a);
        java.util.Map map = msg.f340790a;
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "capability", -1);
        int e18 = com.tencent.mm.plugin.websearch.l2.e(map, "authScene", -1);
        if (e17 == 1) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else if (e17 == 6) {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            if (e17 != 11) {
                com.tencent.mars.xlog.Log.e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "capability error: " + e17);
                return true;
            }
            str = "android.permission.CAMERA";
        }
        java.lang.String str2 = str;
        if (e18 == 10) {
            f0Var = d85.f0.f227167r;
        } else {
            if (e18 != 11) {
                com.tencent.mars.xlog.Log.e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "authScene error: " + e18);
                return true;
            }
            f0Var = d85.f0.f227168s;
        }
        android.content.Context context = env.f340860a;
        jz5.f0 f0Var2 = null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).uj(activity, f0Var.f227176d, str2, f0Var.f227177e, new av4.k0(activity, str2, env, msg));
            f0Var2 = jz5.f0.f302826a;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicorMsg.RequestSystemCapabilityAuthorizationJsApi", "env.context as? Activity = null");
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "requestSystemCapabilityAuthorization";
    }
}
