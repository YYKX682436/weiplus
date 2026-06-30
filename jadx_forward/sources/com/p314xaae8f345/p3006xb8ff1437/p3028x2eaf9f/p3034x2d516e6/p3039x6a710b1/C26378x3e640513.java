package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester */
/* loaded from: classes15.dex */
public class C26378x3e640513 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53032x59634b6e = "TPCGIRequester";

    /* renamed from: MAX_RETRY_TIMES */
    private static final int f53033xb8d05834 = 3;

    /* renamed from: MSG_CONFIG_URL */
    private static final int f53034xf5e17270 = 2011;

    /* renamed from: MSG_REPORT_URL */
    private static final int f53035x376ffb62 = 2010;

    /* renamed from: MSG_WUJI_CONFIG_URL */
    private static final int f53036xe6f28ad6 = 2013;

    /* renamed from: RETRY_INTERVAL */
    private static final int f53037x1d7a349c = 3000;

    /* renamed from: TIMEOUT */
    private static final int f53038xdc7ad941 = 3000;

    /* renamed from: mCustomExecutor */
    private static volatile java.util.concurrent.ExecutorService f53039xd863f131;

    /* renamed from: mRequester */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513 f53040xa413e18f;

    /* renamed from: mRetryQueue */
    private java.util.concurrent.LinkedBlockingQueue<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26> f53042x979b6796 = new java.util.concurrent.LinkedBlockingQueue<>();

    /* renamed from: mRequestQueue */
    private java.util.concurrent.LinkedBlockingQueue<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26> f53041xe47e90cf = new java.util.concurrent.LinkedBlockingQueue<>();

    /* renamed from: mTimerTask */
    private java.util.TimerTask f53043x7de3d07d = new java.util.TimerTask() { // from class: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            while (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this.f53042x979b6796.peek() != null && java.lang.System.currentTimeMillis() - ((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26) com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this.f53042x979b6796.peek()).m102500xc03ea3e3() > 3000) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513 c26378x3e640513 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this;
                c26378x3e640513.m102440xe5cddc7d((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26) c26378x3e640513.f53042x979b6796.poll());
            }
        }
    };

    private C26378x3e640513() {
        new java.util.Timer(true).scheduleAtFixedRate(this.f53043x7de3d07d, 0L, 1000L);
        m102445xed8d1e6f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addNotifyReqQueue */
    public void m102440xe5cddc7d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26 c26383x52737a26) {
        try {
            this.f53041xe47e90cf.put(c26383x52737a26);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53032x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "RequestQueue add failed:" + th6.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: addRetryRequestItem */
    public void m102441xc6f1293b(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26 c26383x52737a26) {
        try {
            if (c26383x52737a26.m102501xae00f86d() <= 3) {
                this.f53042x979b6796.put(c26383x52737a26);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53032x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "retry queue add failed" + th6.toString());
        }
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513 m102442x9cf0d20b() {
        if (f53040xa413e18f == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.class) {
                if (f53040xa413e18f == null) {
                    f53040xa413e18f = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513();
                }
            }
        }
        return f53040xa413e18f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb A[DONT_GENERATE] */
    /* renamed from: handleRequestItem */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m102443x648052fa(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26 r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.m102443x648052fa(com.tencent.thumbplayer.core.downloadproxy.utils.TPRequestItem):boolean");
    }

    /* renamed from: obtainThreadExcutor */
    private static java.util.concurrent.ExecutorService m102444x429d80c3() {
        if (f53039xd863f131 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.class) {
                if (f53039xd863f131 == null) {
                    f53039xd863f131 = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        return f53039xd863f131;
    }

    /* renamed from: process */
    private void m102445xed8d1e6f() {
        m102444x429d80c3().execute(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.downloadproxy.utils.TPCGIRequester.2
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26 c26383x52737a26 = (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26) com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this.f53041xe47e90cf.take();
                        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this.m102443x648052fa(c26383x52737a26)) {
                            c26383x52737a26.m102504xd52c6253();
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.this.m102441xc6f1293b(c26383x52737a26);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26378x3e640513.f53032x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "request queue take failed: " + th6.toString());
                    }
                }
            }
        });
    }

    /* renamed from: addRequestItem */
    public void m102446x698e32e1(java.lang.String str, int i17) {
        if (str.isEmpty()) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53032x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "request url null");
        } else {
            m102440xe5cddc7d(new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26383x52737a26(str, i17));
        }
    }
}
