package k91;

/* loaded from: classes7.dex */
public abstract class h5 {
    public static boolean a(k91.v5 v5Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v5Var.f68904x28d45f97)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid appID in contact(%s)", v5Var.f68924xdec927b);
            return true;
        }
        if (v5Var.w0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrSyncUtils", "NULL versionInfo(%s) in contact(%s)", v5Var.f68926x94cd21e1, v5Var.f68924xdec927b);
            return true;
        }
        if (v5Var.u0() == null || android.text.TextUtils.isEmpty(v5Var.u0().f387161c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid appInfo(%s) in contact(%s)", v5Var.f68905x453b082a, v5Var.f68924xdec927b);
            return true;
        }
        if (v5Var.w0().f158979f != 0 || v5Var.w0().f158977d > 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrSyncUtils", "invalid versionInfo(%s) in contact(%s)", v5Var.f68926x94cd21e1, v5Var.f68924xdec927b);
        return true;
    }

    public static boolean b(k91.v5 v5Var) {
        try {
            long a17 = t81.l.f497898a.a(v5Var.f68924xdec927b);
            if (a17 <= 0 || a17 < v5Var.f68922x6a92a081) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrSyncUtils", "isContactMarkedAsInvalid (%s) returns true, treated as invalid until %d, attrs lastSyncTimestamp %d", v5Var.f68924xdec927b, java.lang.Long.valueOf(a17), java.lang.Long.valueOf(v5Var.f68922x6a92a081));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxaAttrSyncUtils", e17, "caught crash", new java.lang.Object[0]);
            return false;
        }
    }
}
