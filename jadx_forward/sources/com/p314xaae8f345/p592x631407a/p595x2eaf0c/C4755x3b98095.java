package com.p314xaae8f345.p592x631407a.p595x2eaf0c;

/* renamed from: com.tencent.midas.comm.APLog */
/* loaded from: classes13.dex */
public class C4755x3b98095 {

    /* renamed from: logger */
    private static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f f20267xbe97f590;

    /* renamed from: logInfo */
    private static com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 f20266x14593a12 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3();

    /* renamed from: shouldWriteLog */
    private static boolean f20269x4deae9b8 = false;

    /* renamed from: shouldPrintLog */
    private static boolean f20268x7674f42a = true;

    /* renamed from: hasLogCallback */
    private static boolean f20265x5768f4af = false;

    private C4755x3b98095() {
    }

    /* renamed from: closeLog */
    public static void m41601x4122ea2c() {
        m41603x5d03b04();
    }

    /* renamed from: composeLogMsg */
    private static java.lang.String m41602x32d8fdcf(java.lang.String str, java.lang.String str2) {
        return str + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + java.lang.Thread.currentThread().getName() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + str2 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(2, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(2, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(5, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(5, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    /* renamed from: flush */
    public static void m41603x5d03b04() {
        try {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f c4766x701bca9f = f20267xbe97f590;
            if (c4766x701bca9f != null) {
                c4766x701bca9f.m41692x5d03b04();
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    /* renamed from: getLogInfo */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 m41604x522675dc() {
        return f20266x14593a12;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(3, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(3, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    /* renamed from: init */
    public static void m41605x316510(com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4756x935006e3 c4756x935006e3) {
        if (c4756x935006e3 == null) {
            return;
        }
        try {
            f20266x14593a12 = c4756x935006e3;
            if (android.text.TextUtils.isEmpty(c4756x935006e3.m41615xcef762f0())) {
                f20265x5768f4af = false;
                com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.m41673x41012807();
            } else if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.m41672x316510(c4756x935006e3.m41615xcef762f0())) {
                f20265x5768f4af = true;
                return;
            }
            f20266x14593a12.m41620x316510();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.m41670xaf65a0fc();
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41734x48f71c37(f20266x14593a12.m41614x76847179());
            f20268x7674f42a = f20266x14593a12.m41643x7674f42a();
            if (com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.m41732x331b7d9(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.C4762x960c2fff.f20313x638764b8)) {
                f20269x4deae9b8 = f20266x14593a12.m41627x62a87a2f();
                if (f20267xbe97f590 == null) {
                    f20267xbe97f590 = com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.m41690x34264a();
                }
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public static void s(boolean z17, java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(6, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a && !z17) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(6, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(1, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(1, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        java.lang.String m41602x32d8fdcf = m41602x32d8fdcf(str, str2);
        if (f20265x5768f4af) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4764x69105044.log(4, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
            return;
        }
        if (f20268x7674f42a) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f.log(4, f20266x14593a12.m41617x23aed0ac(), m41602x32d8fdcf);
        }
        m41607x91f0d2e5(m41602x32d8fdcf);
    }

    /* renamed from: write */
    private static void m41606x6c257df(java.lang.String str) {
        try {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p596x21ffc6bd.C4766x701bca9f c4766x701bca9f = f20267xbe97f590;
            if (c4766x701bca9f != null) {
                c4766x701bca9f.m41693x6c257df(str);
            }
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    /* renamed from: writeLog */
    private static void m41607x91f0d2e5(java.lang.String str) {
        if (f20269x4deae9b8) {
            m41606x6c257df(str);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(str, java.lang.String.format(str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        i(str, java.lang.String.format(str2, objArr));
    }

    public static void s(boolean z17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        s(z17, str, java.lang.String.format(str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        v(str, java.lang.String.format(str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        w(str, java.lang.String.format(str2, objArr));
    }

    public static void s(java.lang.String str, java.lang.String str2) {
        m41607x91f0d2e5(m41602x32d8fdcf(str, str2));
    }

    public static void s(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        s(str, java.lang.String.format(str2, objArr));
    }
}
