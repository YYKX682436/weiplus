package com.p3249xcbb51f6b.p3252x9137034c;

/* renamed from: com.tenpay.bankcard.BankCardReg */
/* loaded from: classes9.dex */
public class C28005x978c2968 {
    private static final java.lang.String TAG = "MyTag";

    /* renamed from: getBankCardSegmentNumber */
    public static java.lang.String m121667xec79ee9a(java.lang.String str, int i17, int[] iArr) {
        com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d(TAG, "getBankCardSegmentNumber");
        com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d(TAG, "cardNum=" + str);
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        java.lang.String m121798xe82f2162 = c28013x36bca45.m121798xe82f2162(str, c28013x36bca45.m121807xce19d7e6());
        com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d(TAG, "cardNum=" + m121798xe82f2162);
        java.lang.String m21522xec79ee9a = com.p314xaae8f345.p317x3fd90e9c.C2887xe5276e3c.m21522xec79ee9a(m121798xe82f2162, i17, iArr);
        com.p3249xcbb51f6b.p3252x9137034c.C28006x77975d46.d(TAG, m21522xec79ee9a);
        return c28013x36bca45.m121800xea62cd8a(m21522xec79ee9a, c28013x36bca45.m121807xce19d7e6());
    }

    /* renamed from: recognizeBankCardGetVersion */
    public static int m121668x93c5525c() {
        return com.p314xaae8f345.p317x3fd90e9c.C2887xe5276e3c.m21523x93c5525c();
    }

    /* renamed from: recognizeBankCardInit */
    public static int m121669x1678b24a(int i17, int i18, boolean z17) {
        return com.p314xaae8f345.p317x3fd90e9c.C2887xe5276e3c.m21524x1678b24a(i17, i18, z17);
    }

    /* renamed from: recognizeBankCardProcess */
    public static int m121670x81010ef5(byte[] bArr, com.p314xaae8f345.p317x3fd90e9c.C2886x59f50e5a c2886x59f50e5a, boolean[] zArr) {
        return com.p314xaae8f345.p317x3fd90e9c.C2887xe5276e3c.m21525x81010ef5(bArr, c2886x59f50e5a, zArr);
    }

    /* renamed from: recognizeBankCardRelease */
    public static int m121671xd475188d() {
        return com.p314xaae8f345.p317x3fd90e9c.C2887xe5276e3c.m21526xd475188d();
    }
}
