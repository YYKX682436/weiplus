package com.tencent.mars.magicbox;

/* loaded from: classes12.dex */
public class IPxxLogic {
    protected static com.tencent.mars.magicbox.IPxxLogic.ICallBack callBack;

    /* loaded from: classes12.dex */
    public interface ICallBack {
        java.lang.String getCrashFilePath(int i17);

        java.lang.String getUploadLogExtrasInfo(java.lang.String str);

        void recoverLinkAddrs();

        void reportKv(int i17, java.lang.String str);

        void setNewDnsDebugHostInfo(java.lang.String str, int i17);

        void uploadLogFail(int i17);

        void uploadLogResponse(int i17, long j17, long j18);

        void uploadLogSuccess(int i17);
    }

    public static native boolean cancelUpload(int i17);

    public static native void checkAndReportUploadTask();

    public static java.lang.String getCrashFilePath(int i17) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getCrashFilePath(i17);
    }

    public static java.lang.String getUploadLogExtrasInfo(java.lang.String str) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getUploadLogExtrasInfo(str);
    }

    public static native void onIPxx(java.lang.String str, int i17);

    public static void recoverLinkAddrs() {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.recoverLinkAddrs();
    }

    public static void reportKv(int i17, java.lang.String str) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.reportKv(i17, str);
    }

    public static void setCallBack(com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setCgi(java.lang.String str);

    public static native void setHost(java.lang.String str);

    public static void setNewDnsDebugHostInfo(java.lang.String str, int i17) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.setNewDnsDebugHostInfo(str, i17);
    }

    public static native void setSumFormat(java.lang.String str);

    public static native int uploadFile(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, java.lang.String str3);

    public static native int uploadLog(int i17, int[] iArr, boolean z17, long j17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3, java.lang.String str4);

    public static void uploadLogFail(int i17) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.uploadLogFail(i17);
    }

    public static void uploadLogResponse(int i17, long j17, long j18) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.uploadLogResponse(i17, j17, j18);
    }

    public static void uploadLogSuccess(int i17) {
        com.tencent.mars.magicbox.IPxxLogic.ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return;
        }
        iCallBack.uploadLogSuccess(i17);
    }
}
