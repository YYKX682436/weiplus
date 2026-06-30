package h14;

/* loaded from: classes.dex */
public class t0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        if (map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.UseSm4GcmConfig.switch");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UseSm4GcmConfig", "sm4gcm values:%s", str2);
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str2, 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("SM4GCM_SWITCH", P == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1934L, P == 1 ? 6L : 7L, 1L, false);
        }
    }
}
