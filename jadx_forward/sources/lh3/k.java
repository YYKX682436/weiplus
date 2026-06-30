package lh3;

@j95.b
/* loaded from: classes15.dex */
public class k extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f400213d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static long f400214e = 0;

    public static synchronized java.util.List wi(android.content.Context context) {
        int i17;
        synchronized (lh3.k.class) {
            java.util.List list = f400213d;
            if (((java.util.LinkedList) list).size() > 0 && java.lang.System.currentTimeMillis() - f400214e < 60000) {
                return list;
            }
            f400214e = java.lang.System.currentTimeMillis();
            ((java.util.LinkedList) list).clear();
            try {
                java.util.List<android.telephony.CellInfo> list2 = (java.util.List) yj0.a.j((android.telephony.TelephonyManager) context.getSystemService("phone"), "com/tencent/mm/plugin/misc/impl/NetworkOptReport", "getExtraCellInfoList", "(Landroid/content/Context;)Ljava/util/List;", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                if (list2 != null) {
                    for (android.telephony.CellInfo cellInfo : list2) {
                        lh3.j jVar = new lh3.j();
                        if (cellInfo instanceof android.telephony.CellInfoGsm) {
                            android.telephony.CellSignalStrengthGsm cellSignalStrength = ((android.telephony.CellInfoGsm) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityGsm cellIdentity = ((android.telephony.CellInfoGsm) cellInfo).getCellIdentity();
                            i17 = cellIdentity.getMnc();
                            jVar.f400208c = "" + cellIdentity.getCid();
                            jVar.f400206a = "" + cellIdentity.getMcc();
                            jVar.f400207b = "" + cellIdentity.getMnc();
                            jVar.f400209d = "" + cellIdentity.getLac();
                            jVar.f400211f = cellSignalStrength.getDbm();
                            jVar.f400212g = cellInfo.isRegistered();
                            jVar.f400210e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.f19266xf8084484;
                        } else if (cellInfo instanceof android.telephony.CellInfoCdma) {
                            android.telephony.CellSignalStrengthCdma cellSignalStrength2 = ((android.telephony.CellInfoCdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityCdma cellIdentity2 = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity2.getSystemId();
                            jVar.f400208c = "" + cellIdentity2.getBasestationId();
                            jVar.f400207b = "" + cellIdentity2.getSystemId();
                            jVar.f400209d = "" + cellIdentity2.getNetworkId();
                            jVar.f400211f = cellSignalStrength2.getDbm();
                            jVar.f400212g = cellInfo.isRegistered();
                            jVar.f400210e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.f19265x8fe4272;
                        } else if (cellInfo instanceof android.telephony.CellInfoLte) {
                            android.telephony.CellSignalStrengthLte cellSignalStrength3 = ((android.telephony.CellInfoLte) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityLte cellIdentity3 = ((android.telephony.CellInfoLte) cellInfo).getCellIdentity();
                            i17 = cellIdentity3.getMnc();
                            jVar.f400208c = "" + cellIdentity3.getCi();
                            jVar.f400206a = "" + cellIdentity3.getMcc();
                            jVar.f400207b = "" + cellIdentity3.getMnc();
                            jVar.f400209d = "" + cellIdentity3.getTac();
                            jVar.f400211f = cellSignalStrength3.getDbm();
                            jVar.f400212g = cellInfo.isRegistered();
                            jVar.f400210e = "lte";
                        } else if (cellInfo instanceof android.telephony.CellInfoWcdma) {
                            android.telephony.CellSignalStrengthWcdma cellSignalStrength4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityWcdma cellIdentity4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity4.getMnc();
                            jVar.f400208c = "" + cellIdentity4.getCid();
                            jVar.f400206a = "" + cellIdentity4.getMcc();
                            jVar.f400207b = "" + cellIdentity4.getMnc();
                            jVar.f400209d = "" + cellIdentity4.getLac();
                            jVar.f400211f = cellSignalStrength4.getDbm();
                            jVar.f400212g = cellInfo.isRegistered();
                            jVar.f400210e = "wcdma";
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkOptReport", "Unknown type of cell signal!\n ClassName: " + cellInfo.getClass().getSimpleName() + "\n ToString: " + cellInfo.toString());
                            i17 = 0;
                        }
                        if (jVar.f400207b.length() == 1) {
                            jVar.f400207b = "0" + jVar.f400207b;
                        }
                        if (i17 != Integer.MAX_VALUE) {
                            ((java.util.LinkedList) f400213d).add(jVar);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkOptReport", "loadCellInfo: Unable to obtain cell signal information: ", e17);
            }
            return f400213d;
        }
    }
}
