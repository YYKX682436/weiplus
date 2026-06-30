package com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccConfigManager;", "", "Lq15/a;", "msg", "", "onReceiveStrikeMsg", "getConfigData", "tryGetExptConfig", "", "TAG", "Ljava/lang/String;", com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4933xa12deb2a.MMKVName_AccConfig, com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4933xa12deb2a.MMKVKey_ConfigXml, com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4933xa12deb2a.MMKVKey_ReceiveTime, "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.feature.AccConfigManager */
/* loaded from: classes8.dex */
public final class C4933xa12deb2a {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4933xa12deb2a f21236x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p612xc5a27af6.C4933xa12deb2a();
    private static final java.lang.String MMKVKey_ConfigXml = "MMKVKey_ConfigXml";
    private static final java.lang.String MMKVKey_ReceiveTime = "MMKVKey_ReceiveTime";
    private static final java.lang.String MMKVName_AccConfig = "MMKVName_AccConfig";
    private static final java.lang.String TAG = "MicroMsg.AccConfigManager";

    private C4933xa12deb2a() {
    }

    /* renamed from: getConfigData */
    public final q15.a m42684x1fc92e02() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).f(MMKVKey_ConfigXml)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getConfigData err: no sec data");
            return m42686xde0aa214();
        }
        long c17 = c01.id.c();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).getString(MMKVKey_ConfigXml, "");
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).getLong(MMKVKey_ReceiveTime, 0L);
        if ((string == null || string.length() == 0) || j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getConfigData err: data illegal.. configXml:" + string + " receiveTimeMs:" + j17 + ' ');
            return null;
        }
        q15.a aVar = new q15.a();
        aVar.m126728xdc93280d(string);
        if (c17 - j17 <= aVar.o()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getConfigData suc: " + string + " => " + aVar.m126747x696739c());
            return aVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "getConfigData err: data has expired.. accStrikeMsg.expiredDuration:" + aVar.o() + " receiveTimeMs:" + j17 + " curServiceTimeMs:" + c17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).d();
        return null;
    }

    /* renamed from: onReceiveStrikeMsg */
    public final boolean m42685xa13e4acb(q15.a msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceiveStrikeMsg err: account not ready");
            return false;
        }
        long c17 = c01.id.c();
        java.lang.String m126747x696739c = msg.m126747x696739c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).putString(MMKVKey_ConfigXml, m126747x696739c);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(MMKVName_AccConfig).putLong(MMKVKey_ReceiveTime, c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceiveStrikeMsg suc: time=" + c17 + " xml=" + m126747x696739c);
        return true;
    }

    /* renamed from: tryGetExptConfig */
    public final q15.a m42686xde0aa214() {
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_acc_strike_xml", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aj6);
        if (r26.n0.N(aj6) || !r26.i0.y(aj6, "<", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "tryGetExptConfig err: no expt data: ".concat(aj6));
            return null;
        }
        q15.a aVar = new q15.a();
        aVar.m126728xdc93280d(aj6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tryGetExptConfig suc:" + aj6 + " => " + aVar.m126747x696739c());
        return aVar;
    }
}
