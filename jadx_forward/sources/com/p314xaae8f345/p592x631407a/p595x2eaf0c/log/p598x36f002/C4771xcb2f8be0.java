package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002;

/* renamed from: com.tencent.midas.comm.log.util.APLogDataReporter */
/* loaded from: classes13.dex */
public class C4771xcb2f8be0 {

    /* renamed from: MIDAS_LOG_ERROR_APPEND */
    public static final java.lang.String f20361x706207d1 = "sdk.log.error.append";

    /* renamed from: MIDAS_LOG_ERROR_CLOSE */
    public static final java.lang.String f20362x24c2ae41 = "sdk.log.error.close";

    /* renamed from: MIDAS_LOG_ERROR_FLUSH */
    public static final java.lang.String f20363x24ed0b4d = "sdk.log.error.flush";

    /* renamed from: MIDAS_LOG_ERROR_INIT */
    public static final java.lang.String f20364x9746387 = "sdk.log.error.init";

    /* renamed from: MIDAS_LOG_ERROR_MMAP_OPEN */
    public static final java.lang.String f20365xd5bae2a3 = "sdk.log.error.mmap.open";

    /* renamed from: MIDAS_LOG_ERROR_PRINT */
    public static final java.lang.String f20366x257c82f6 = "sdk.log.error.print";

    /* renamed from: MIDAS_LOG_ERROR_PROCESS */
    public static final java.lang.String f20367xb8b6fc78 = "sdk.log.error.process";

    /* renamed from: MIDAS_LOG_ERROR_WRITE */
    public static final java.lang.String f20368x25df2828 = "sdk.log.error.write";

    /* renamed from: MIDAS_LOG_INIT */
    public static final java.lang.String f20369xadf37390 = "sdk.log.init";

    /* renamed from: reporter */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter f20370xe68be4e1;

    /* renamed from: com.tencent.midas.comm.log.util.APLogDataReporter$Holder */
    /* loaded from: classes13.dex */
    public static class Holder {

        /* renamed from: INSTANCE */
        private static final com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0 f20371x4fbc8495 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0();

        private Holder() {
        }
    }

    /* renamed from: com.tencent.midas.comm.log.util.APLogDataReporter$Reporter */
    /* loaded from: classes13.dex */
    public interface Reporter {
        /* renamed from: report */
        void mo41648xc84c5534(java.lang.String str, java.lang.String str2, java.lang.String str3);
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0 m41712x9cf0d20b() {
        return com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Holder.f20371x4fbc8495;
    }

    /* renamed from: getReporter */
    public com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter m41713x62662257() {
        return this.f20370xe68be4e1;
    }

    /* renamed from: report */
    public void m41714xc84c5534(java.lang.String str, java.lang.String str2) {
        m41715xc84c5534(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3, str, str2);
    }

    /* renamed from: reportTimeEx */
    public void m41716x250e66b4(java.lang.String str, long j17) {
        m41714xc84c5534(str, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j17));
    }

    /* renamed from: setReporter */
    public void m41717x5d1e8363(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter reporter) {
        this.f20370xe68be4e1 = reporter;
    }

    private C4771xcb2f8be0() {
    }

    /* renamed from: report */
    public void m41715xc84c5534(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter reporter = this.f20370xe68be4e1;
            if (reporter != null) {
                reporter.mo41648xc84c5534(str, str2, str3);
            }
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }
}
