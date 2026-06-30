package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CdnC2Java */
/* loaded from: classes12.dex */
public class C4444x9204715e {
    private static final java.lang.String TAG = "mars.CdnC2Java";

    /* renamed from: mCallBack */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack f17603x1aab3bf2;

    /* renamed from: com.tencent.mars.cdn.CdnC2Java$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: calcVideoRangeTs */
        java.lang.String mo37632x9197296(java.lang.String str, double d17, long j17);

        /* renamed from: exportFileToExternalPath */
        java.lang.String mo37633x8d65241b(java.lang.String str);

        /* renamed from: getSystemProperty */
        java.lang.String mo37634x585ae21a(java.lang.String str);

        /* renamed from: getUSBState */
        int mo37635x91d0a2e3();

        /* renamed from: isFileReady */
        int mo37636xf70a437d(java.lang.String str);

        /* renamed from: queryFreeSpace */
        long mo37637xdf5d7612(java.lang.String str);
    }

    /* renamed from: calcVideoRangeTs */
    public static java.lang.String m37625x9197296(java.lang.String str, double d17, long j17) {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        return callBack != null ? callBack.mo37632x9197296(str, d17, j17) : "";
    }

    /* renamed from: exportFileToExternalPath */
    public static java.lang.String m37626x8d65241b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        return callBack != null ? callBack.mo37633x8d65241b(str) : str;
    }

    /* renamed from: getSystemProperty */
    public static java.lang.String m37627x585ae21a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        return callBack != null ? callBack.mo37634x585ae21a(str) : "";
    }

    /* renamed from: getUSBState */
    public static int m37628x91d0a2e3() {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        if (callBack != null) {
            return callBack.mo37635x91d0a2e3();
        }
        return 0;
    }

    /* renamed from: isFileReady */
    public static int m37629xf70a437d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        if (callBack != null) {
            return callBack.mo37636xf70a437d(str);
        }
        return 0;
    }

    /* renamed from: queryFreeSpace */
    public static long m37630xdf5d7612(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack = f17603x1aab3bf2;
        if (callBack != null) {
            return callBack.mo37637xdf5d7612(str);
        }
        return 0L;
    }

    /* renamed from: setCallback */
    public static void m37631x6c4ebec7(com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.CallBack callBack) {
        f17603x1aab3bf2 = callBack;
    }
}
