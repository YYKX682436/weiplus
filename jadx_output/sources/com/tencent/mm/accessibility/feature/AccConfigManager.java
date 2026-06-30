package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccConfigManager;", "", "Lq15/a;", "msg", "", "onReceiveStrikeMsg", "getConfigData", "tryGetExptConfig", "", "TAG", "Ljava/lang/String;", com.tencent.mm.accessibility.feature.AccConfigManager.MMKVName_AccConfig, com.tencent.mm.accessibility.feature.AccConfigManager.MMKVKey_ConfigXml, com.tencent.mm.accessibility.feature.AccConfigManager.MMKVKey_ReceiveTime, "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccConfigManager {
    public static final com.tencent.mm.accessibility.feature.AccConfigManager INSTANCE = new com.tencent.mm.accessibility.feature.AccConfigManager();
    private static final java.lang.String MMKVKey_ConfigXml = "MMKVKey_ConfigXml";
    private static final java.lang.String MMKVKey_ReceiveTime = "MMKVKey_ReceiveTime";
    private static final java.lang.String MMKVName_AccConfig = "MMKVName_AccConfig";
    private static final java.lang.String TAG = "MicroMsg.AccConfigManager";

    private AccConfigManager() {
    }

    public final q15.a getConfigData() {
        if (!com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).f(MMKVKey_ConfigXml)) {
            com.tencent.mars.xlog.Log.e(TAG, "getConfigData err: no sec data");
            return tryGetExptConfig();
        }
        long c17 = c01.id.c();
        java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).getString(MMKVKey_ConfigXml, "");
        long j17 = com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).getLong(MMKVKey_ReceiveTime, 0L);
        if ((string == null || string.length() == 0) || j17 <= 0) {
            com.tencent.mars.xlog.Log.e(TAG, "getConfigData err: data illegal.. configXml:" + string + " receiveTimeMs:" + j17 + ' ');
            return null;
        }
        q15.a aVar = new q15.a();
        aVar.fromXml(string);
        if (c17 - j17 <= aVar.o()) {
            com.tencent.mars.xlog.Log.i(TAG, "getConfigData suc: " + string + " => " + aVar.toXml());
            return aVar;
        }
        com.tencent.mars.xlog.Log.i(TAG, "getConfigData err: data has expired.. accStrikeMsg.expiredDuration:" + aVar.o() + " receiveTimeMs:" + j17 + " curServiceTimeMs:" + c17);
        com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).d();
        return null;
    }

    public final boolean onReceiveStrikeMsg(q15.a msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i(TAG, "onReceiveStrikeMsg err: account not ready");
            return false;
        }
        long c17 = c01.id.c();
        java.lang.String xml = msg.toXml();
        com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).putString(MMKVKey_ConfigXml, xml);
        com.tencent.mm.sdk.platformtools.o4.M(MMKVName_AccConfig).putLong(MMKVKey_ReceiveTime, c17);
        com.tencent.mars.xlog.Log.i(TAG, "onReceiveStrikeMsg suc: time=" + c17 + " xml=" + xml);
        return true;
    }

    public final q15.a tryGetExptConfig() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_acc_strike_xml", "");
        kotlin.jvm.internal.o.d(aj6);
        if (r26.n0.N(aj6) || !r26.i0.y(aj6, "<", false)) {
            com.tencent.mars.xlog.Log.e(TAG, "tryGetExptConfig err: no expt data: ".concat(aj6));
            return null;
        }
        q15.a aVar = new q15.a();
        aVar.fromXml(aj6);
        com.tencent.mars.xlog.Log.i(TAG, "tryGetExptConfig suc:" + aj6 + " => " + aVar.toXml());
        return aVar;
    }
}
