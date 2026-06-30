package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaLocationManagerImpl implements com.tencent.kinda.gen.KindaLocationManager {
    private static final java.lang.String TAG = "KindaLocationManagerImpl";

    @Override // com.tencent.kinda.gen.KindaLocationManager
    public java.lang.String getCellInfo() {
        r45.r1 c17 = at4.g0.c();
        java.lang.String str = c17 != null ? c17.f384416p : "";
        com.tencent.mars.xlog.Log.i(TAG, "getCellInfo return: " + str);
        return str;
    }

    @Override // com.tencent.kinda.gen.KindaLocationManager
    public java.lang.String getEncryptInfo(boolean z17, boolean z18) {
        r45.r1 c17 = at4.g0.c();
        java.lang.String str = c17 != null ? c17.f384414n : "";
        com.tencent.mars.xlog.Log.i(TAG, "getEncryptInfo return: " + str);
        return str;
    }

    @Override // com.tencent.kinda.gen.KindaLocationManager
    public java.lang.String getEncryptKey() {
        r45.r1 c17 = at4.g0.c();
        java.lang.String str = c17 != null ? c17.f384415o : "";
        com.tencent.mars.xlog.Log.i(TAG, "getEncryptKey return: " + str);
        return str;
    }
}
