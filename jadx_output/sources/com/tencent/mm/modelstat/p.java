package com.tencent.mm.modelstat;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.modelstat.o f71541a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f71542b;

    public p(java.lang.String str) {
        this.f71542b = str;
    }

    public com.tencent.mm.modelstat.o a() {
        com.tencent.mm.modelstat.o oVar;
        com.tencent.mm.modelstat.o oVar2 = this.f71541a;
        if (oVar2 != null) {
            return oVar2;
        }
        java.lang.String str = this.f71542b + "mobileinfo.ini";
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        com.tencent.mm.modelstat.o oVar3 = null;
        if (r6Var.m()) {
            l75.a aVar = new l75.a(str);
            oVar = new com.tencent.mm.modelstat.o();
            oVar.f71536a = com.tencent.mm.sdk.platformtools.t8.q1(aVar.a("ispCode"));
            oVar.f71537b = aVar.c("ispName");
            oVar.f71538c = com.tencent.mm.sdk.platformtools.t8.q1(aVar.a("subType"));
            oVar.f71539d = aVar.c(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
            long B = r6Var.B();
            if (10011 == x51.o1.f452064q && x51.o1.f452065r > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i17 = x51.o1.f452065r;
                B = currentTimeMillis - i17;
                com.tencent.mars.xlog.Log.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(B));
                x51.o1.f452065r = 0;
            }
            if (B > 0 && java.lang.System.currentTimeMillis() - B > 259200000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig  diff:%d file:%s cache expired remove!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - B), str);
                oVar.f71540e = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b", java.lang.Integer.valueOf(oVar.f71538c), java.lang.Integer.valueOf(oVar.f71536a), oVar.f71537b, oVar.f71539d, java.lang.Boolean.valueOf(oVar.f71540e));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig file not exist :%s", str);
            oVar = null;
        }
        this.f71541a = oVar;
        if (oVar != null && !oVar.f71540e) {
            return oVar;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem MMApplicationContext is null");
        } else {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem ConnectivityManager is null");
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem getActiveNetworkInfo is null");
                } else if (activeNetworkInfo.getType() == 1) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem net type is wifi");
                } else {
                    oVar3 = new com.tencent.mm.modelstat.o();
                    oVar3.f71538c = activeNetworkInfo.getSubtype();
                    oVar3.f71536a = com.tencent.mars.comm.NetStatusUtil.getISPCode(context);
                    oVar3.f71537b = com.tencent.mars.comm.NetStatusUtil.getISPName(context);
                    oVar3.f71539d = activeNetworkInfo.getExtraInfo();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s", java.lang.Integer.valueOf(oVar3.f71538c), java.lang.Integer.valueOf(oVar3.f71536a), oVar3.f71537b, oVar3.f71539d);
                }
            }
        }
        if (oVar3 == null) {
            return this.f71541a;
        }
        this.f71541a = oVar3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig path is null");
        } else {
            l75.a aVar2 = new l75.a(str);
            aVar2.d("ispCode", java.lang.String.valueOf(oVar3.f71536a));
            aVar2.d("ispName", oVar3.f71537b);
            aVar2.d("subType", java.lang.String.valueOf(oVar3.f71538c));
            aVar2.d(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, oVar3.f71539d);
        }
        return this.f71541a;
    }
}
