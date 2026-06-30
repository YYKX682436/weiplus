package hy4;

/* loaded from: classes8.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f367716a = new java.util.LinkedHashMap();

    public static final void a(java.lang.String str, java.lang.String str2) {
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                if (hy4.i.l(str)) {
                    f367716a.remove(str2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewRestorePageHelper", "remove start get service");
                    xs.k1 k1Var = (xs.k1) i95.n0.c(xs.k1.class);
                    if (k1Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewRestorePageHelper", "ISecRecoveryDataService is null, skip");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewRestorePageHelper", "remove start unregister, url: " + str + ", key: " + str2);
                    ((q04.y) k1Var).Bi(str2, 1);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewRestorePageHelper", "url is nullOrEmpty");
    }
}
