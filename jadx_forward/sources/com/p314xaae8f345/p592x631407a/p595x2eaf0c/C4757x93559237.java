package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APLogUtil */
/* loaded from: classes13.dex */
public class C4757x93559237 {

    /* renamed from: HAS_INIT_LOG_IN_MAIN_PROCESS */
    private static boolean f20286x3380fbfe;

    /* renamed from: HAS_INIT_LOG_IN_NEW_PROCESS */
    private static boolean f20287x5b646dbb;

    /* renamed from: IS_IN_NEW_PROCESS */
    public static boolean f20288xa7e2822b;

    /* renamed from: flushIfNewProcess */
    public static void m41645xc6f50ad0() {
        if (!f20288xa7e2822b || com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc() == null || com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41604x522675dc().m41621xa7dee48b()) {
            return;
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41603x5d03b04();
    }

    /* renamed from: initAPLogIfNewProcess */
    public static void m41646xb798dbd1(final android.content.Context context, boolean z17, final boolean z18, final java.lang.String str) {
        if (!z17 || f20287x5b646dbb) {
            return;
        }
        f20288xa7e2822b = true;
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APLogUtil.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 c4756x935006e3 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3();
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.m41712x9cf0d20b().m41717x5d1e8363(new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter() { // from class: com.tencent.midas.comm.APLogUtil.1.1
                        @Override // com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter
                        /* renamed from: report */
                        public void mo41648xc84c5534(java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(str2, str3, "", str4);
                        }
                    });
                    c4756x935006e3.m41630xe9f5beed(context);
                    c4756x935006e3.m41635xb7de63a5(z18);
                    c4756x935006e3.m41628xbd62d453(true);
                    c4756x935006e3.m41641x16e404b8("TencentPay");
                    c4756x935006e3.m41634x494a91fc(str);
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41605x316510(c4756x935006e3);
                    boolean unused = com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4757x93559237.f20287x5b646dbb = true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APLogUtil init", th6.toString());
                }
            }
        }).start();
    }

    /* renamed from: initAPLogInPlugin */
    public static void m41647xdcb50d5d(final android.content.Context context, final boolean z17, final java.lang.String str) {
        if (f20286x3380fbfe) {
            return;
        }
        f20286x3380fbfe = true;
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.midas.comm.APLogUtil.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 c4756x935006e3 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3();
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.m41712x9cf0d20b().m41717x5d1e8363(new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter() { // from class: com.tencent.midas.comm.APLogUtil.2.1
                        @Override // com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4771xcb2f8be0.Reporter
                        /* renamed from: report */
                        public void mo41648xc84c5534(java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                            com.p314xaae8f345.p592x631407a.p601x2eefaa.C4786x7c4936b7.m41926x9cf0d20b().m41934x398f2203(str2, str3, "", str4);
                        }
                    });
                    c4756x935006e3.m41630xe9f5beed(context);
                    c4756x935006e3.m41635xb7de63a5(z17);
                    c4756x935006e3.m41628xbd62d453(true);
                    c4756x935006e3.m41641x16e404b8("TencentPay");
                    c4756x935006e3.m41634x494a91fc(str);
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.m41605x316510(c4756x935006e3);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e("APLogUtil init", th6.toString());
                }
            }
        }).start();
    }
}
