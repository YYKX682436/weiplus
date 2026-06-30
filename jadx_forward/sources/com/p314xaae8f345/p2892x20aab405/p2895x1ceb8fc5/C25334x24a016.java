package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.NLog */
/* loaded from: classes13.dex */
public class C25334x24a016 {

    /* renamed from: LEVEL_DEBUG */
    private static final int f45604x34b38998 = 1;

    /* renamed from: LEVEL_ERROR */
    private static final int f45605x34c7c54d = 4;

    /* renamed from: LEVEL_INFO */
    private static final int f45606x2afff0a9 = 2;

    /* renamed from: LEVEL_WARNING */
    private static final int f45607xbd18e1a1 = 3;
    private static final java.lang.String TAG = "NLog";

    /* renamed from: mIsLoadSuccess */
    private static volatile boolean f45608x79278946;

    public static void D(java.lang.String str, java.lang.String str2) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            d(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    public static void E(java.lang.String str, java.lang.String str2) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            e(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: GetLogPath */
    public static java.lang.String m93799xc8fb5173() {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return "";
        }
        try {
            return m93803x52297553();
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            return "";
        }
    }

    public static void I(java.lang.String str, java.lang.String str2) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            i(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: Start */
    public static boolean m93800x4c7d442(java.lang.String str, int i17) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return false;
        }
        try {
            return m93807x68ac462(str, i17);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
            return false;
        }
    }

    /* renamed from: Stop */
    public static void m93801x277c22() {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m93808x360802();
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    public static void W(java.lang.String str, java.lang.String str2) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            w(str, str2);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: WriteLogCallback */
    private static void m93802x2d90e66a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 1) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(str, str2);
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(str, str2);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.w(str, str2);
        } else if (i17 != 4) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(str, str2);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(str, str2);
        }
    }

    private static native void d(java.lang.String str, java.lang.String str2);

    private static native void e(java.lang.String str, java.lang.String str2);

    /* renamed from: getLogPath */
    private static native java.lang.String m93803x52297553();

    private static native void i(java.lang.String str, java.lang.String str2);

    /* renamed from: init */
    public static boolean m93804x316510(java.lang.String str, java.lang.String str2, int i17) {
        if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25317xab0afe6f.m93561xe920b17c().mo67217x32c4e6(str)) {
            return false;
        }
        f45608x79278946 = true;
        m93800x4c7d442(str2, i17);
        return true;
    }

    /* renamed from: setLogWriteCallback */
    private static native void m93805x30b84e2(int i17);

    /* renamed from: setWriteCallback */
    public static void m93806xd7e4b002(boolean z17) {
        if (!f45608x79278946) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "Not load NLog lib!!!");
            return;
        }
        try {
            m93805x30b84e2(z17 ? 1 : 0);
        } catch (java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17);
        }
    }

    /* renamed from: start */
    private static native boolean m93807x68ac462(java.lang.String str, int i17);

    /* renamed from: stop */
    private static native void m93808x360802();

    private static native void w(java.lang.String str, java.lang.String str2);

    public static void D(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        d(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void E(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        e(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void I(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        i(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }

    public static void W(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        w(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }
}
