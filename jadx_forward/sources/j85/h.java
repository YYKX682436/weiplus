package j85;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a */
    public static final j85.h f379791a = new j85.h();

    public static /* synthetic */ void b(j85.h hVar, long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        java.lang.Long l19 = (i17 & 2) != 0 ? -1L : l17;
        java.lang.Long l27 = (i17 & 4) != 0 ? -1L : l18;
        if ((i17 & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        hVar.a(j17, l19, l27, bool);
    }

    public final void a(long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6951xed44ba41 c6951xed44ba41 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6951xed44ba41();
        c6951xed44ba41.f142556d = j17;
        if (l17 != null) {
            long longValue = l17.longValue();
            if (longValue != -1) {
                c6951xed44ba41.f142557e = longValue;
            }
        }
        if (l18 != null) {
            long longValue2 = l18.longValue();
            if (longValue2 != -1) {
                c6951xed44ba41.f142558f = longValue2;
            }
        }
        c6951xed44ba41.f142559g = c6951xed44ba41.b("DeviceID", wo.w0.c(), true);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            c6951xed44ba41.f142560h = c6951xed44ba41.b("CurrentPrivacyFullStatus", ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ui(), true);
        }
        c6951xed44ba41.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.SettingPermissionReporter", "[reportDialogAction] action = " + j17 + ", bizType = " + l18 + "， privacyType = " + l17);
    }
}
