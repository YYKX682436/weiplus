package ne4;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne4.g f418083d;

    public e(ne4.g gVar) {
        this.f418083d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        this.f418083d.f418084d.getClass();
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String format = simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ne4.h.f418085e)) {
            o4Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
            ne4.h.f418085e = o4Var.getString("MMKV_KEY_SOTER_REPORT_SRV_DATE", "");
        } else {
            o4Var = null;
        }
        if (format.equals(ne4.h.f418085e)) {
            return;
        }
        if (o4Var == null) {
            o4Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
        }
        o4Var.putString("MMKV_KEY_SOTER_REPORT_SRV_DATE", format);
        java.lang.String str = "isSupport:" + wo.v1.f529361h.f529344b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" forceFingerStatus:");
        wo.z0 z0Var = wo.v1.f529359f;
        sb6.append(z0Var.f529400a);
        java.lang.String str2 = (sb6.toString() + " allowExternal:" + z0Var.f529401b) + " fingerType:" + ((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "8", "1", java.lang.String.valueOf(300), str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginSoter", "reportSrvConfig msg:%s", str2);
    }
}
