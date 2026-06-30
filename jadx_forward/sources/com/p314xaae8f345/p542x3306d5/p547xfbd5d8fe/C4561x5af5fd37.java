package com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe;

/* renamed from: com.tencent.mars.magicbox.IPxxLogic */
/* loaded from: classes12.dex */
public class C4561x5af5fd37 {

    /* renamed from: callBack */
    protected static com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack f19375xf5ad9465;

    /* renamed from: com.tencent.mars.magicbox.IPxxLogic$ICallBack */
    /* loaded from: classes12.dex */
    public interface ICallBack {
        /* renamed from: getCrashFilePath */
        java.lang.String mo40170xa29a9cd2(int i17);

        /* renamed from: getUploadLogExtrasInfo */
        java.lang.String mo40171x24eca05e(java.lang.String str);

        /* renamed from: recoverLinkAddrs */
        void mo40172xd1def1c4();

        /* renamed from: reportKv */
        void mo40173xe68be1bf(int i17, java.lang.String str);

        /* renamed from: setNewDnsDebugHostInfo */
        void mo40174xb24c113e(java.lang.String str, int i17);

        /* renamed from: uploadLogFail */
        void mo40175x5561a341(int i17);

        /* renamed from: uploadLogResponse */
        void mo40176x7d1016e4(int i17, long j17, long j18);

        /* renamed from: uploadLogSuccess */
        void mo40177xbeafdd00(int i17);
    }

    /* renamed from: cancelUpload */
    public static native boolean m40153x96c0e51b(int i17);

    /* renamed from: checkAndReportUploadTask */
    public static native void m40154xc9ceb549();

    /* renamed from: getCrashFilePath */
    public static java.lang.String m40155xa29a9cd2(int i17) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.mo40170xa29a9cd2(i17);
    }

    /* renamed from: getUploadLogExtrasInfo */
    public static java.lang.String m40156x24eca05e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.mo40171x24eca05e(str);
    }

    /* renamed from: onIPxx */
    public static native void m40157xc39a70c6(java.lang.String str, int i17);

    /* renamed from: recoverLinkAddrs */
    public static void m40158xd1def1c4() {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40172xd1def1c4();
    }

    /* renamed from: reportKv */
    public static void m40159xe68be1bf(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40173xe68be1bf(i17, str);
    }

    /* renamed from: setCallBack */
    public static void m40160x6c4032e7(com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack) {
        f19375xf5ad9465 = iCallBack;
    }

    /* renamed from: setCgi */
    public static native void m40161xca0258c3(java.lang.String str);

    /* renamed from: setHost */
    public static native void m40162x764b252a(java.lang.String str);

    /* renamed from: setNewDnsDebugHostInfo */
    public static void m40163xb24c113e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40174xb24c113e(str, i17);
    }

    /* renamed from: setSumFormat */
    public static native void m40164x7434afe0(java.lang.String str);

    /* renamed from: uploadFile */
    public static native int m40165xf17c8f1d(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, java.lang.String str3);

    /* renamed from: uploadLog */
    public static native int m40166x49dad183(int i17, int[] iArr, boolean z17, long j17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3, java.lang.String str4);

    /* renamed from: uploadLogFail */
    public static void m40167x5561a341(int i17) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40175x5561a341(i17);
    }

    /* renamed from: uploadLogResponse */
    public static void m40168x7d1016e4(int i17, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40176x7d1016e4(i17, j17, j18);
    }

    /* renamed from: uploadLogSuccess */
    public static void m40169xbeafdd00(int i17) {
        com.p314xaae8f345.p542x3306d5.p547xfbd5d8fe.C4561x5af5fd37.ICallBack iCallBack = f19375xf5ad9465;
        if (iCallBack == null) {
            return;
        }
        iCallBack.mo40177xbeafdd00(i17);
    }
}
