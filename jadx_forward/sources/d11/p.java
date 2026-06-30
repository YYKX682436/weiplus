package d11;

@j95.b
/* loaded from: classes11.dex */
public class p extends i95.w {
    public static synchronized d11.p Ai() {
        d11.p pVar;
        synchronized (d11.p.class) {
            pVar = (d11.p) i95.n0.c(d11.p.class);
        }
        return pVar;
    }

    public final boolean wi(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreAutoDownload", "this message is null.");
            return false;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
            return true;
        }
        java.lang.String str = w17.f118692r;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
            return true;
        }
        if (d11.b.a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : " + str);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: " + str);
        return true;
    }
}
