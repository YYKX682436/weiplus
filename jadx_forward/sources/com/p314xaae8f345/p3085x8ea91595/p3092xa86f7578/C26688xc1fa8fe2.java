package com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578;

/* renamed from: com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager */
/* loaded from: classes13.dex */
public class C26688xc1fa8fe2 extends com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468 {
    protected static final java.lang.String TAG = "UpdateInfoReportManager";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2 f56242x46143c22;

    /* renamed from: com.tencent.tmassistantsdk.logreport.UpdateInfoReportManager$UpdateLogConst */
    /* loaded from: classes6.dex */
    public class UpdateLogConst {

        /* renamed from: ACTION_CHECKYYB_INSTALLED */
        public static final int f56243xead8313e = 100;

        /* renamed from: ACTION_DOWNLOAD_SUCCESS */
        public static final int f56244x85f30615 = 102;

        /* renamed from: ACTION_INSTALL_SUCCESS */
        public static final int f56245xf8bf1516 = 103;

        /* renamed from: ACTION_POP_INSTALL_DIALOG */
        public static final int f56246x93106903 = 104;

        /* renamed from: ACTION_START_DOWNLOAD */
        public static final int f56247x277e510e = 101;

        /* renamed from: UPDATE_TYPE_NORMAL */
        public static final byte f56248xbeae1716 = 1;

        /* renamed from: UPDATE_TYPE_SAVE_NETWORK_TRAFFIC */
        public static final byte f56249xb73c29d9 = 2;

        /* renamed from: UPDATE_TYPE_UNKNOWN */
        public static final byte f56250x874997db = 0;

        /* renamed from: YYB_IGNORE */
        public static final int f56251x636f6b8f = 0;

        /* renamed from: YYB_INSTALLED */
        public static final int f56252x4a5a187d = 1;

        /* renamed from: YYB_NOT_INSTALL */
        public static final int f56253xaeed3852 = 2;

        public UpdateLogConst() {
        }
    }

    private C26688xc1fa8fe2() {
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2 m104994x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2 c26688xc1fa8fe2;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2.class) {
            if (f56242x46143c22 == null) {
                f56242x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.C26688xc1fa8fe2();
            }
            c26688xc1fa8fe2 = f56242x46143c22;
        }
        return c26688xc1fa8fe2;
    }

    /* renamed from: createUpdateInfoLog */
    public com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26759x4a692a8d m104995x7b7a0311(java.lang.String str, long j17) {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "createUpdateInfoLog");
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26759x4a692a8d c26759x4a692a8d = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26759x4a692a8d();
        c26759x4a692a8d.f56733x362a8ff1 = str;
        c26759x4a692a8d.f56731x58b82fc = j17;
        return c26759x4a692a8d;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getLogTable */
    public com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.AbstractC26767x1daf70fb mo104972xf33d5060() {
        return com.p314xaae8f345.p3085x8ea91595.p3101x8fb0427b.p3104x6903bce.C26774x7029b141.m105457x9cf0d20b();
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3092xa86f7578.AbstractC26681xea999468
    /* renamed from: getReportType */
    public byte mo104973x615f5684() {
        return (byte) 2;
    }
}
