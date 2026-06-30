package com.p314xaae8f345.p592x631407a.p601x2eefaa;

/* renamed from: com.tencent.midas.data.APDataId */
/* loaded from: classes13.dex */
public class C4780x61b58b74 {

    /* renamed from: gInstance */
    private static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4780x61b58b74 f20525xcc79a21c;

    /* renamed from: paydataCount */
    private static int f20526x27e137dd;

    /* renamed from: TENCENTUNIPAY_DATAID_FLAG */
    private final java.lang.String f20529x190a0904 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.f20554x1a22ef;

    /* renamed from: DATA_DISCOUNT_INIT */
    private final java.lang.String f20527xb52d979 = "initdataCount";

    /* renamed from: DATA_DISCOUNT_PAY */
    private final java.lang.String f20528xb60b06ff = "dataCount";

    private C4780x61b58b74() {
    }

    /* renamed from: getDataId */
    public static int m41815x1548d95b() {
        int i17 = f20526x27e137dd;
        f20526x27e137dd = i17 + 1;
        return i17;
    }

    /* renamed from: initDataId */
    public static void m41816xf4cbfb95() {
        f20526x27e137dd = 0;
    }
}
