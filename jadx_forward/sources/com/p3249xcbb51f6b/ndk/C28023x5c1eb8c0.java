package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.WxSmStorage */
/* loaded from: classes9.dex */
public class C28023x5c1eb8c0 {

    /* renamed from: instance */
    private static volatile com.p3249xcbb51f6b.ndk.C28023x5c1eb8c0 f63106x21169495;

    /* renamed from: fitScUtil */
    private com.p3249xcbb51f6b.ndk.C28017xb1a251c3 f63107x3a3031e3;

    private C28023x5c1eb8c0() {
        this.f63107x3a3031e3 = null;
        this.f63107x3a3031e3 = new com.p3249xcbb51f6b.ndk.C28017xb1a251c3();
    }

    /* renamed from: freeInstance */
    public static void m121970x6389e321() {
        if (f63106x21169495 != null) {
            f63106x21169495.m121972x41012807();
            f63106x21169495 = null;
        }
    }

    /* renamed from: getInstance */
    public static com.p3249xcbb51f6b.ndk.C28023x5c1eb8c0 m121971x9cf0d20b() {
        if (f63106x21169495 == null) {
            synchronized (com.p3249xcbb51f6b.ndk.C28023x5c1eb8c0.class) {
                if (f63106x21169495 == null) {
                    f63106x21169495 = new com.p3249xcbb51f6b.ndk.C28023x5c1eb8c0();
                }
            }
        }
        return f63106x21169495;
    }

    /* renamed from: release */
    private void m121972x41012807() {
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = this.f63107x3a3031e3;
            if (c28017xb1a251c3 != null) {
                c28017xb1a251c3.m121855x41012807();
                this.f63107x3a3031e3 = null;
            }
        }
    }

    /* renamed from: clearAllValue */
    public boolean m121973x3ea781bd() {
        return this.f63107x3a3031e3.m121829x3ea781bd();
    }

    /* renamed from: clearValue */
    public boolean m121974xd3cad324(java.lang.String str) {
        return this.f63107x3a3031e3.m121833xd3cad324(str);
    }

    /* renamed from: getLastError */
    public int m121975x75feee5c() {
        return this.f63107x3a3031e3.m121841x75feee5c();
    }

    /* renamed from: getValue */
    public byte[] m121976x754a37bb(java.lang.String str) {
        return this.f63107x3a3031e3.m121846x754a37bb(str);
    }

    /* renamed from: getVersion */
    public java.lang.String m121977x52c258a2() {
        return this.f63107x3a3031e3.m121847x52c258a2();
    }

    /* renamed from: hasValue */
    public boolean m121978x7dd9ef7(java.lang.String str) {
        return this.f63107x3a3031e3.m121849x7dd9ef7(str);
    }

    /* renamed from: init */
    public boolean m121979x316510(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean m121851x316510;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121851x316510 = this.f63107x3a3031e3.m121851x316510(str, str2, str3, str4);
        }
        return m121851x316510;
    }

    /* renamed from: setValue */
    public boolean m121980x53d8522f(java.lang.String str, byte[] bArr) {
        return this.f63107x3a3031e3.m121858x53d8522f(str, bArr);
    }
}
