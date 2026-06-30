package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p959x883644fd.o f153074a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f153075b;

    public p(java.lang.String str) {
        this.f153075b = str;
    }

    public com.p314xaae8f345.mm.p959x883644fd.o a() {
        com.p314xaae8f345.mm.p959x883644fd.o oVar;
        com.p314xaae8f345.mm.p959x883644fd.o oVar2 = this.f153074a;
        if (oVar2 != null) {
            return oVar2;
        }
        java.lang.String str = this.f153075b + "mobileinfo.ini";
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        com.p314xaae8f345.mm.p959x883644fd.o oVar3 = null;
        if (r6Var.m()) {
            l75.a aVar = new l75.a(str);
            oVar = new com.p314xaae8f345.mm.p959x883644fd.o();
            oVar.f153069a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(aVar.a("ispCode"));
            oVar.f153070b = aVar.c("ispName");
            oVar.f153071c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(aVar.a("subType"));
            oVar.f153072d = aVar.c(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96);
            long B = r6Var.B();
            if (10011 == x51.o1.f533597q && x51.o1.f533598r > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                int i17 = x51.o1.f533598r;
                B = currentTimeMillis - i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(B));
                x51.o1.f533598r = 0;
            }
            if (B > 0 && java.lang.System.currentTimeMillis() - B > 259200000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig  diff:%d file:%s cache expired remove!", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - B), str);
                oVar.f153073e = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b", java.lang.Integer.valueOf(oVar.f153071c), java.lang.Integer.valueOf(oVar.f153069a), oVar.f153070b, oVar.f153072d, java.lang.Boolean.valueOf(oVar.f153073e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig file not exist :%s", str);
            oVar = null;
        }
        this.f153074a = oVar;
        if (oVar != null && !oVar.f153073e) {
            return oVar;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem MMApplicationContext is null");
        } else {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem ConnectivityManager is null");
            } else {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem getActiveNetworkInfo is null");
                } else if (activeNetworkInfo.getType() == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem net type is wifi");
                } else {
                    oVar3 = new com.p314xaae8f345.mm.p959x883644fd.o();
                    oVar3.f153071c = activeNetworkInfo.getSubtype();
                    oVar3.f153069a = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(context);
                    oVar3.f153070b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40066x826a0bfb(context);
                    oVar3.f153072d = activeNetworkInfo.getExtraInfo();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s", java.lang.Integer.valueOf(oVar3.f153071c), java.lang.Integer.valueOf(oVar3.f153069a), oVar3.f153070b, oVar3.f153072d);
                }
            }
        }
        if (oVar3 == null) {
            return this.f153074a;
        }
        this.f153074a = oVar3;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig path is null");
        } else {
            l75.a aVar2 = new l75.a(str);
            aVar2.d("ispCode", java.lang.String.valueOf(oVar3.f153069a));
            aVar2.d("ispName", oVar3.f153070b);
            aVar2.d("subType", java.lang.String.valueOf(oVar3.f153071c));
            aVar2.d(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, oVar3.f153072d);
        }
        return this.f153074a;
    }
}
