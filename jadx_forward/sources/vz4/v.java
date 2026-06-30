package vz4;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.w f523283d;

    public v(vz4.w wVar) {
        this.f523283d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz4.w wVar = this.f523283d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "load url from net");
            vz4.x xVar = wVar.f523284d;
            vz4.x xVar2 = wVar.f523284d;
            if (!xVar.f523289d) {
                xVar.f523302q = null;
            }
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xVar.f523302q);
            xVar2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "reloadPage");
            if (xVar2.f523289d) {
                xVar2.f523289d = false;
                ((java.util.HashMap) vz4.s.f523277a).remove(xVar2.f523288c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d dVar = xVar2.f523297l;
            if (dVar != null) {
                dVar.c();
            }
            xVar2.getClass();
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
            int i17 = sharedPreferences != null ? sharedPreferences.getInt("white_screen_times", 0) : 0;
            if (i17 <= 1) {
                int i18 = i17 + 1;
                xVar2.getClass();
                android.content.SharedPreferences sharedPreferences2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putInt("white_screen_times", i18).commit();
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = xVar2.f523291f;
            if (c19543x781c5eda != null) {
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("whiteScreen", xVar2.f523286a, c19543x781c5eda.f269907d, c19543x781c5eda.f269909f, 1L, 0L, null);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("whiteScreen", xVar2.f523286a, c19543x781c5eda.f269907d, c19543x781c5eda.f269909f, -1L, 0L, null);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(859L, 13L, 1L, false);
            java.lang.String str = xVar2.f523286a;
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
            java.lang.String a17 = kh0.i.a(str);
            ((java.util.HashMap) vz4.s.f523277a).remove(a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.i.c().e(a17, 1, 2);
            xVar2.getClass();
            android.content.SharedPreferences sharedPreferences3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgPlugin", "disableWePkg");
                sharedPreferences3.edit().putBoolean("disable_we_pkg", true).commit();
            }
            xVar2.a();
        } catch (java.lang.Exception unused) {
        }
    }
}
