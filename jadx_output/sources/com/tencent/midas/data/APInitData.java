package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APInitData {
    private static com.tencent.midas.data.APInitData gInstance;
    private static int initdataCount;
    private java.lang.String initGUID;
    private long initInterfaceTime;

    private APInitData() {
        initdataCount = 0;
        this.initInterfaceTime = 0L;
        this.initGUID = "";
    }

    public static int getInitdataCount() {
        int i17 = initdataCount;
        initdataCount = i17 + 1;
        return i17;
    }

    public static void init() {
        gInstance = new com.tencent.midas.data.APInitData();
    }

    public static void setInitdataCount(int i17) {
        initdataCount = i17;
    }

    public static com.tencent.midas.data.APInitData singleton() {
        if (gInstance == null) {
            gInstance = new com.tencent.midas.data.APInitData();
        }
        return gInstance;
    }

    public java.lang.String getInitGUID() {
        return this.initGUID;
    }

    public long getInitInterfaceTime() {
        return this.initInterfaceTime;
    }

    public void setInitGUID(java.lang.String str) {
        this.initGUID = str;
    }

    public void setInitInterfaceTime(long j17) {
        this.initInterfaceTime = j17;
    }
}
