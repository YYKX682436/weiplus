package com.p314xaae8f345.p317x3fd90e9c;

/* renamed from: com.tencent.bankcardrecog.BankCardInfo */
/* loaded from: classes9.dex */
public class C2886x59f50e5a {

    /* renamed from: bitmapData */
    public byte[] f9800x980f2579;

    /* renamed from: cardNumLen */
    private int f9803x1e4763df = 0;

    /* renamed from: cardNum */
    private java.lang.String f9802x21041e56 = "";

    /* renamed from: rectY */
    private int[] f9806x675e2f5 = new int[20];

    /* renamed from: rectX */
    private int[] f9805x675e2f4 = new int[20];

    /* renamed from: width */
    public int f9807x6be2dc6 = 0;

    /* renamed from: height */
    public int f9804xb7389127 = 0;

    /* renamed from: bitmapLen */
    public int f9801x156bf666 = 0;

    public C2886x59f50e5a(int i17, int i18) {
        double d17 = i17;
        this.f9800x980f2579 = new byte[(((int) (0.8d * d17)) * ((int) (d17 * 0.52d)) * 3) + 54];
    }

    /* renamed from: getCardNum */
    public java.lang.String m21514x5ed15a20() {
        com.p3249xcbb51f6b.ndk.C28013x36bca45 c28013x36bca45 = new com.p3249xcbb51f6b.ndk.C28013x36bca45();
        return c28013x36bca45.m121800xea62cd8a(this.f9802x21041e56, c28013x36bca45.m121807xce19d7e6());
    }

    /* renamed from: getCardNumLen */
    public int m21515xc881bd5() {
        return this.f9803x1e4763df;
    }

    /* renamed from: getRectX */
    public int[] m21516x7513893e() {
        return this.f9805x675e2f4;
    }

    /* renamed from: getRectY */
    public int[] m21517x7513893f() {
        return this.f9806x675e2f5;
    }

    /* renamed from: setCardNum */
    public void m21518xd242a794(java.lang.String str) {
        this.f9802x21041e56 = str;
    }

    /* renamed from: setCardNumLen */
    public void m21519x3aac69e1(int i17) {
        this.f9803x1e4763df = i17;
    }

    /* renamed from: setRectX */
    public void m21520x53a1a3b2(int[] iArr) {
        this.f9805x675e2f4 = iArr;
    }

    /* renamed from: setRectY */
    public void m21521x53a1a3b3(int[] iArr) {
        this.f9806x675e2f5 = iArr;
    }
}
