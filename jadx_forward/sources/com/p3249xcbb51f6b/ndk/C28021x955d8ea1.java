package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.WxSmCertUtil */
/* loaded from: classes9.dex */
public class C28021x955d8ea1 {

    /* renamed from: instance */
    private static volatile com.p3249xcbb51f6b.ndk.C28021x955d8ea1 f63089x21169495;

    /* renamed from: fitScUtil */
    private com.p3249xcbb51f6b.ndk.C28017xb1a251c3 f63090x3a3031e3;

    private C28021x955d8ea1() {
        this.f63090x3a3031e3 = null;
        this.f63090x3a3031e3 = new com.p3249xcbb51f6b.ndk.C28017xb1a251c3();
    }

    /* renamed from: freeInstance */
    public static void m121903x6389e321() {
        if (f63089x21169495 != null) {
            f63089x21169495.m121905x41012807();
            f63089x21169495 = null;
        }
    }

    /* renamed from: getInstance */
    public static com.p3249xcbb51f6b.ndk.C28021x955d8ea1 m121904x9cf0d20b() {
        if (f63089x21169495 == null) {
            synchronized (com.p3249xcbb51f6b.ndk.C28021x955d8ea1.class) {
                if (f63089x21169495 == null) {
                    f63089x21169495 = new com.p3249xcbb51f6b.ndk.C28021x955d8ea1();
                }
            }
        }
        return f63089x21169495;
    }

    /* renamed from: release */
    private void m121905x41012807() {
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            com.p3249xcbb51f6b.ndk.C28017xb1a251c3 c28017xb1a251c3 = this.f63090x3a3031e3;
            if (c28017xb1a251c3 != null) {
                c28017xb1a251c3.m121855x41012807();
                this.f63090x3a3031e3 = null;
            }
        }
    }

    /* renamed from: certDecrypt */
    public byte[] m121906xcd1676c9(java.lang.String str, byte[] bArr) {
        byte[] m121824xcd1676c9;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121824xcd1676c9 = this.f63090x3a3031e3.m121824xcd1676c9(str, bArr);
        }
        return m121824xcd1676c9;
    }

    /* renamed from: certEncrypt */
    public byte[] m121907x11584fa1(java.lang.String str, byte[] bArr) {
        byte[] m121825x11584fa1;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121825x11584fa1 = this.f63090x3a3031e3.m121825x11584fa1(str, bArr);
        }
        return m121825x11584fa1;
    }

    /* renamed from: certSign */
    public byte[] m121908xd3fc2a01(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[] m121826xd3fc2a01;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121826xd3fc2a01 = this.f63090x3a3031e3.m121826xd3fc2a01(str, bArr, bArr2);
        }
        return m121826xd3fc2a01;
    }

    /* renamed from: certVerify */
    public boolean m121909xca84d3bd(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean m121827xca84d3bd;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121827xca84d3bd = this.f63090x3a3031e3.m121827xca84d3bd(str, bArr, bArr2, bArr3);
        }
        return m121827xca84d3bd;
    }

    /* renamed from: clearAllCert */
    public boolean m121910xc82e6058() {
        return this.f63090x3a3031e3.m121828xc82e6058();
    }

    /* renamed from: clearCert */
    public boolean m121911xb437c611(java.lang.String str) {
        return this.f63090x3a3031e3.m121830xb437c611(str);
    }

    /* renamed from: clearToken */
    public boolean m121912xd3b4fbac(java.lang.String str) {
        return this.f63090x3a3031e3.m121831xd3b4fbac(str);
    }

    /* renamed from: clearTokenSeed */
    public boolean m121913xb45e883d(java.lang.String str) {
        return this.f63090x3a3031e3.m121832xb45e883d(str);
    }

    /* renamed from: getCaCertVersion */
    public int m121914xcddecb20() {
        return this.f63090x3a3031e3.m121838xcddecb20();
    }

    /* renamed from: getCertValidTime */
    public long[] m121915x3786736f(java.lang.String str) {
        long[] m121839x3786736f;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121839x3786736f = this.f63090x3a3031e3.m121839x3786736f(str);
        }
        return m121839x3786736f;
    }

    /* renamed from: getLastError */
    public int m121916x75feee5c() {
        return this.f63090x3a3031e3.m121841x75feee5c();
    }

    /* renamed from: getToken */
    public java.lang.String m121917x75346043(java.lang.String str) {
        java.lang.String m121842x75346043;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121842x75346043 = this.f63090x3a3031e3.m121842x75346043(str);
        }
        return m121842x75346043;
    }

    /* renamed from: getTokenCount */
    public int m121918xf2c0b28c(java.lang.String str) {
        return this.f63090x3a3031e3.m121843xf2c0b28c(str);
    }

    /* renamed from: getTokenHeader */
    public java.lang.String m121919x6d47b0b0(java.lang.String str) {
        java.lang.String m121844x6d47b0b0;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121844x6d47b0b0 = this.f63090x3a3031e3.m121844x6d47b0b0(str);
        }
        return m121844x6d47b0b0;
    }

    /* renamed from: getTokenSeed */
    public byte[] m121920x7dbc954(java.lang.String str) {
        byte[] m121845x7dbc954;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121845x7dbc954 = this.f63090x3a3031e3.m121845x7dbc954(str);
        }
        return m121845x7dbc954;
    }

    /* renamed from: getVersion */
    public java.lang.String m121921x52c258a2() {
        return this.f63090x3a3031e3.m121847x52c258a2();
    }

    /* renamed from: hasCert */
    public boolean m121922x2982b3de(java.lang.String str) {
        return this.f63090x3a3031e3.m121848x2982b3de(str, false);
    }

    /* renamed from: importCert */
    public boolean m121924x7ea51769(java.lang.String str, java.lang.String str2, boolean z17) {
        boolean m121850x7ea51769;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121850x7ea51769 = this.f63090x3a3031e3.m121850x7ea51769(str, str2, z17);
        }
        return m121850x7ea51769;
    }

    /* renamed from: init */
    public boolean m121925x316510(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean m121851x316510;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121851x316510 = this.f63090x3a3031e3.m121851x316510(str, str2, str3, str4);
        }
        return m121851x316510;
    }

    /* renamed from: makeCsr */
    public java.lang.String m121926x31a01534(java.lang.String str, java.lang.String str2) {
        java.lang.String m121853x31a01534;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121853x31a01534 = this.f63090x3a3031e3.m121853x31a01534(str, str2);
        }
        return m121853x31a01534;
    }

    /* renamed from: setToken */
    public boolean m121927x53c27ab7(java.lang.String str, java.lang.String str2) {
        return this.f63090x3a3031e3.m121856x53c27ab7(str, str2);
    }

    /* renamed from: setTokenSeed */
    public boolean m121928x642f89c8(java.lang.String str, byte[] bArr) {
        return this.f63090x3a3031e3.m121857x642f89c8(str, bArr);
    }

    /* renamed from: updateCaCert */
    public boolean m121929xab8655cb(int i17, java.lang.String[] strArr) {
        boolean m121880xab8655cb;
        synchronized (com.p3249xcbb51f6b.ndk.C28017xb1a251c3.f63086x8051aa63) {
            m121880xab8655cb = this.f63090x3a3031e3.m121880xab8655cb(i17, strArr);
        }
        return m121880xab8655cb;
    }

    /* renamed from: hasCert */
    public boolean m121923x2982b3de(java.lang.String str, boolean z17) {
        return this.f63090x3a3031e3.m121848x2982b3de(str, z17);
    }
}
