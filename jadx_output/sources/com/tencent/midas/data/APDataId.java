package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APDataId {
    private static com.tencent.midas.data.APDataId gInstance;
    private static int paydataCount;
    private final java.lang.String TENCENTUNIPAY_DATAID_FLAG = com.tencent.midas.data.APPluginDataInterface.SHARE_PREFERENCE_NAME;
    private final java.lang.String DATA_DISCOUNT_INIT = "initdataCount";
    private final java.lang.String DATA_DISCOUNT_PAY = "dataCount";

    private APDataId() {
    }

    public static int getDataId() {
        int i17 = paydataCount;
        paydataCount = i17 + 1;
        return i17;
    }

    public static void initDataId() {
        paydataCount = 0;
    }
}
