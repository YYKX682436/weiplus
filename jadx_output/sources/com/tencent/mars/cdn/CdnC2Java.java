package com.tencent.mars.cdn;

/* loaded from: classes12.dex */
public class CdnC2Java {
    private static final java.lang.String TAG = "mars.CdnC2Java";
    public static com.tencent.mars.cdn.CdnC2Java.CallBack mCallBack;

    /* loaded from: classes12.dex */
    public interface CallBack {
        java.lang.String calcVideoRangeTs(java.lang.String str, double d17, long j17);

        java.lang.String exportFileToExternalPath(java.lang.String str);

        java.lang.String getSystemProperty(java.lang.String str);

        int getUSBState();

        int isFileReady(java.lang.String str);

        long queryFreeSpace(java.lang.String str);
    }

    public static java.lang.String calcVideoRangeTs(java.lang.String str, double d17, long j17) {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        return callBack != null ? callBack.calcVideoRangeTs(str, d17, j17) : "";
    }

    public static java.lang.String exportFileToExternalPath(java.lang.String str) {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        return callBack != null ? callBack.exportFileToExternalPath(str) : str;
    }

    public static java.lang.String getSystemProperty(java.lang.String str) {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        return callBack != null ? callBack.getSystemProperty(str) : "";
    }

    public static int getUSBState() {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        if (callBack != null) {
            return callBack.getUSBState();
        }
        return 0;
    }

    public static int isFileReady(java.lang.String str) {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        if (callBack != null) {
            return callBack.isFileReady(str);
        }
        return 0;
    }

    public static long queryFreeSpace(java.lang.String str) {
        com.tencent.mars.cdn.CdnC2Java.CallBack callBack = mCallBack;
        if (callBack != null) {
            return callBack.queryFreeSpace(str);
        }
        return 0L;
    }

    public static void setCallback(com.tencent.mars.cdn.CdnC2Java.CallBack callBack) {
        mCallBack = callBack;
    }
}
