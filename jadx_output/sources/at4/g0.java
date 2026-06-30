package at4;

/* loaded from: classes15.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static at4.g0 f13857a;

    /* renamed from: b, reason: collision with root package name */
    public static r45.r1 f13858b;

    /* renamed from: c, reason: collision with root package name */
    public static long f13859c;

    public g0() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_LBS_REPORT_CONFIG_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.GpsReportHelper", "GpsReportHelper " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            new org.json.JSONArray(str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GpsReportHelper", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.GpsReportHelper", "parse lbs config error", e17);
        }
    }

    public static r45.r1 a(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + "=" + ((java.lang.String) entry.getValue()));
        }
        java.lang.String join = android.text.TextUtils.join("&", arrayList);
        byte[] bArr = new byte[16];
        byte[] bytes = com.tencent.mm.wallet_core.model.f1.a().getBytes();
        if (bytes == null || bytes.length <= 0) {
            bytes = ("" + java.lang.System.currentTimeMillis()).getBytes();
        }
        int i17 = 0;
        int i18 = 0;
        do {
            bArr[i18] = bytes[i17];
            i18++;
            i17++;
            if (i17 >= bytes.length) {
                i17 = 0;
            }
        } while (i18 < 16);
        r45.r1 r1Var = new r45.r1();
        byte[] encode = android.util.Base64.encode(bArr, 0);
        if (at4.l0.f13894b == null) {
            at4.l0.f13894b = new at4.l0();
        }
        r1Var.f384415o = at4.l0.f13894b.a(encode);
        r1Var.f384414n = new java.lang.String(android.util.Base64.encode(com.tencent.mm.jniinterface.AesEcb.aesCryptEcb(join.getBytes(), bArr, true, true), 0));
        return r1Var;
    }

    public static synchronized java.util.List b(android.content.Context context) {
        java.util.LinkedList linkedList;
        int i17;
        synchronized (at4.g0.class) {
            linkedList = new java.util.LinkedList();
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            try {
                java.util.List<android.telephony.CellInfo> list = (java.util.List) yj0.a.j(telephonyManager, "com/tencent/mm/plugin/wallet_core/model/GpsReportHelper", "getExtraCellInfoList", "(Landroid/content/Context;)Ljava/util/List;", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                if (list != null) {
                    for (android.telephony.CellInfo cellInfo : list) {
                        at4.f0 f0Var = new at4.f0();
                        telephonyManager.getNetworkType();
                        if (cellInfo instanceof android.telephony.CellInfoGsm) {
                            android.telephony.CellSignalStrengthGsm cellSignalStrength = ((android.telephony.CellInfoGsm) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityGsm cellIdentity = ((android.telephony.CellInfoGsm) cellInfo).getCellIdentity();
                            i17 = cellIdentity.getMnc();
                            f0Var.f13845c = "" + cellIdentity.getCid();
                            f0Var.f13843a = "" + cellIdentity.getMcc();
                            f0Var.f13844b = "" + cellIdentity.getMnc();
                            f0Var.f13846d = "" + cellIdentity.getLac();
                            f0Var.f13848f = "" + cellSignalStrength.getDbm();
                            cellInfo.isRegistered();
                            f0Var.f13851i = "" + cellIdentity.getArfcn();
                        } else if (cellInfo instanceof android.telephony.CellInfoCdma) {
                            android.telephony.CellSignalStrengthCdma cellSignalStrength2 = ((android.telephony.CellInfoCdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityCdma cellIdentity2 = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity2.getSystemId();
                            f0Var.f13845c = "" + cellIdentity2.getBasestationId();
                            f0Var.f13844b = "" + cellIdentity2.getSystemId();
                            f0Var.f13846d = "" + cellIdentity2.getNetworkId();
                            f0Var.f13848f = "" + cellSignalStrength2.getDbm();
                            cellInfo.isRegistered();
                        } else if (cellInfo instanceof android.telephony.CellInfoLte) {
                            android.telephony.CellSignalStrengthLte cellSignalStrength3 = ((android.telephony.CellInfoLte) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityLte cellIdentity3 = ((android.telephony.CellInfoLte) cellInfo).getCellIdentity();
                            i17 = cellIdentity3.getMnc();
                            f0Var.f13845c = "" + cellIdentity3.getCi();
                            f0Var.f13843a = "" + cellIdentity3.getMcc();
                            f0Var.f13844b = "" + cellIdentity3.getMnc();
                            f0Var.f13847e = "" + cellIdentity3.getTac();
                            f0Var.f13848f = "" + cellSignalStrength3.getDbm();
                            cellInfo.isRegistered();
                            f0Var.f13849g = "" + cellIdentity3.getEarfcn();
                        } else if (cellInfo instanceof android.telephony.CellInfoWcdma) {
                            android.telephony.CellSignalStrengthWcdma cellSignalStrength4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityWcdma cellIdentity4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity4.getMnc();
                            f0Var.f13845c = "" + cellIdentity4.getCid();
                            f0Var.f13843a = "" + cellIdentity4.getMcc();
                            f0Var.f13844b = "" + cellIdentity4.getMnc();
                            f0Var.f13846d = "" + cellIdentity4.getLac();
                            f0Var.f13848f = "" + cellSignalStrength4.getDbm();
                            cellInfo.isRegistered();
                            f0Var.f13850h = "" + cellIdentity4.getUarfcn();
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GpsReportHelper", "Unknown type of cell signal!\n ClassName: " + cellInfo.getClass().getSimpleName() + "\n ToString: " + cellInfo.toString());
                            i17 = 0;
                        }
                        if (i17 != Integer.MAX_VALUE) {
                            linkedList.add(f0Var);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GpsReportHelper", "loadCellInfo: Unable to obtain cell signal information: ", e17);
            }
        }
        return linkedList;
    }

    public static r45.r1 c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        if (currentTimeMillis - f13859c > 300) {
            f();
            f13859c = currentTimeMillis;
        }
        return f13858b;
    }

    public static r45.z55 d() {
        if (f13858b == null) {
            return null;
        }
        r45.z55 z55Var = new r45.z55();
        r45.r1 r1Var = f13858b;
        z55Var.f391729e = r1Var.f384408e;
        z55Var.f391728d = r1Var.f384407d;
        z55Var.f391730f = r1Var.f384409f;
        z55Var.f391731g = r1Var.f384410g;
        z55Var.f391732h = r1Var.f384411h;
        z55Var.f391736o = r1Var.f384415o;
        z55Var.f391733i = r1Var.f384412i;
        z55Var.f391734m = r1Var.f384413m;
        z55Var.f391735n = r1Var.f384414n;
        return z55Var;
    }

    public static void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GpsReportHelper", "reflashLocationInfo " + i17);
        f13859c = java.lang.System.currentTimeMillis() / 1000;
        if (h()) {
            return;
        }
        f();
        f13859c = java.lang.System.currentTimeMillis() / 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f() {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at4.g0.f():void");
    }

    public static boolean g() {
        at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
        boolean z17 = (p17.f13981a & 8388608) > 0;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wxpay_cellinfo_report_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isReportCellInfo, ret = %s switchBit %s isSvrOpen:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p17.f13981a), java.lang.Boolean.valueOf(fj6));
        if (fj6) {
            return z17;
        }
        return false;
    }

    public static boolean h() {
        at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
        boolean z17 = (p17.f13981a & 8192) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p17.f13981a));
        return z17;
    }

    public static boolean i() {
        at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
        boolean z17 = (p17.f13981a & 262144) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isReportWifiSSid, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p17.f13981a));
        return z17;
    }

    public static java.lang.String j(java.lang.String str) {
        try {
            return fp.s0.b(str, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GpsReportHelper", e17, "", new java.lang.Object[0]);
            return str;
        }
    }
}
