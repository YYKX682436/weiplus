package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1;

/* renamed from: com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils */
/* loaded from: classes16.dex */
public class C26162x6ccbbe2 {
    private static final java.lang.String TAG = "TPStrategyUtils";

    /* renamed from: enablePlayBySystemPlayer */
    public static boolean m100890x2e2f431e(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        if (c26130x49ae05.m100279x9050950d() == 0) {
            return true;
        }
        return m100893x40a00fb7(c26130x49ae05);
    }

    /* renamed from: enablePlayByThumbPlayer */
    public static boolean m100891x9833969(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        return c26130x49ae05 == null || c26130x49ae05.m100279x9050950d() == 0 || m100892x486cc86c(c26130x49ae05) || m100893x40a00fb7(c26130x49ae05);
    }

    /* renamed from: isSupportFFmpegCodec */
    public static boolean m100892x486cc86c(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26331xd6902921.m101995xd7d711ad(101, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapCodecType.class, c26130x49ae05.m100279x9050950d()), (int) c26130x49ae05.m100283x755bd410(), (int) c26130x49ae05.m100274x1c4fb41d(), c26130x49ae05.m100282x45bbaf24(), c26130x49ae05.m100281x8cbfe3bf());
        } catch (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7 e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return false;
        }
    }

    /* renamed from: isSupportMediaCodec */
    public static boolean m100893x40a00fb7(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26331xd6902921.m101995xd7d711ad(102, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26161xb0ecee32.m100886x2999bb54(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26160x303c1210.MapCodecType.class, c26130x49ae05.m100279x9050950d()), (int) c26130x49ae05.m100283x755bd410(), (int) c26130x49ae05.m100274x1c4fb41d(), c26130x49ae05.m100282x45bbaf24(), c26130x49ae05.m100281x8cbfe3bf());
        } catch (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26317x5f5ce5a7 e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return false;
        }
    }

    /* renamed from: isSystemPlayerEnable */
    public static boolean m100894xd940ca5d() {
        return true;
    }

    /* renamed from: isTVPlatform */
    public static boolean m100895x754755bf() {
        return false;
    }

    /* renamed from: isThumbPlayerEnable */
    public static boolean m100896x30cb20b0() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.m101878x5f41dc85();
    }
}
