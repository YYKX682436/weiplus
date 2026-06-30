package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd;

/* renamed from: com.tencent.midas.comm.log.internal.APLogger */
/* loaded from: classes13.dex */
public class C4766x701bca9f {

    /* renamed from: LOG_LEVEL_DEBUG */
    public static final int f20344x968b78fd = 2;

    /* renamed from: LOG_LEVEL_ERROR */
    public static final int f20345x969fb4b2 = 5;

    /* renamed from: LOG_LEVEL_INFO */
    public static final int f20346x366a00a4 = 3;

    /* renamed from: LOG_LEVEL_SILENT */
    public static final int f20347x54b906cb = 6;

    /* renamed from: LOG_LEVEL_VERBOSE */
    public static final int f20348xda9a55ac = 1;

    /* renamed from: LOG_LEVEL_WARN */
    public static final int f20349x36702e7c = 4;

    /* renamed from: appender */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc f20350x45ed7d47 = null;

    private C4766x701bca9f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0007 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000f, B:10:0x0013), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void log(int r2, java.lang.String r3, java.lang.String r4) {
        /*
            r3 = 0
        L1:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            if (r3 >= r0) goto L33
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            int r1 = r3 + 3600
            if (r0 > r1) goto L13
            r4.substring(r3)     // Catch: java.lang.Throwable -> L1b
            goto L16
        L13:
            r4.substring(r3, r1)     // Catch: java.lang.Throwable -> L1b
        L16:
            switch(r2) {
                case 1: goto L19;
                case 2: goto L19;
                case 3: goto L19;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L19;
                default: goto L19;
            }
        L19:
            r3 = r1
            goto L1
        L1b:
            r2 = move-exception
            java.util.Locale r3 = java.util.Locale.CHINA
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            java.lang.String r4 = "print log error: <%s>%s"
            java.lang.String.format(r3, r4, r2)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(int, java.lang.String, java.lang.String):void");
    }

    /* renamed from: open */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f m41690x34264a() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f c4766x701bca9f = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f();
        c4766x701bca9f.m41691xda3e1db1();
        return c4766x701bca9f;
    }

    /* renamed from: openAppender */
    private void m41691xda3e1db1() {
        this.f20350x45ed7d47 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc.m41681x34264a();
    }

    /* renamed from: flush */
    public void m41692x5d03b04() {
        try {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4765x7d5fcfc c4765x7d5fcfc = this.f20350x45ed7d47;
            if (c4765x7d5fcfc != null) {
                c4765x7d5fcfc.m41688x1734d76c();
            }
        } catch (java.lang.Throwable th6) {
            java.lang.String.format(java.util.Locale.CHINA, "flush log error: %s\n, stackTrace: %s", th6.toString(), th6.getStackTrace()[3]);
        }
    }

    /* renamed from: write */
    public void m41693x6c257df(java.lang.String str) {
        this.f20350x45ed7d47.m41687xabe4cf1a(str);
    }
}
