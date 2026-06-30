package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public abstract class n {
    public static java.lang.String a(java.lang.String str) {
        gp.d dVar = new gp.d();
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(5);
            try {
                dVar.release();
            } catch (java.io.IOException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDK.BackwardSupportUtil", "getVideoTakeTime timeString " + extractMetadata);
            return extractMetadata;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDK.BackwardSupportUtil", "getVideoLatLong setDataSource failure: " + e17.getMessage());
            return null;
        }
    }
}
