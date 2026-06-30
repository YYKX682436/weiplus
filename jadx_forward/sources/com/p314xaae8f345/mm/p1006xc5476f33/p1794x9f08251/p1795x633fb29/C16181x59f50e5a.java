package com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29;

/* renamed from: com.tencent.mm.plugin.licence.model.BankCardInfo */
/* loaded from: classes9.dex */
public class C16181x59f50e5a {
    private static final java.lang.String TAG = "BankCardInfo";

    /* renamed from: bitmapData */
    public byte[] f37106x980f2579;

    /* renamed from: cardNumLen */
    private int f37109x1e4763df = 0;

    /* renamed from: cardNum */
    private java.lang.String f37108x21041e56 = "";

    /* renamed from: rectY */
    private int[] f37112x675e2f5 = new int[20];

    /* renamed from: rectX */
    private int[] f37111x675e2f4 = new int[20];

    /* renamed from: width */
    public int f37113x6be2dc6 = 0;

    /* renamed from: height */
    public int f37110xb7389127 = 0;

    /* renamed from: bitmapLen */
    public int f37107x156bf666 = 0;

    public C16181x59f50e5a(int i17, int i18) {
        double d17 = i17;
        this.f37106x980f2579 = new byte[(((int) (0.8d * d17)) * ((int) (d17 * 0.52d)) * 3) + 54];
    }

    /* renamed from: getCardNum */
    public java.lang.String m65211x5ed15a20() {
        return this.f37108x21041e56;
    }

    /* renamed from: getCardNumLen */
    public int m65212xc881bd5() {
        return this.f37109x1e4763df;
    }

    /* renamed from: getRectX */
    public int[] m65213x7513893e() {
        return this.f37111x675e2f4;
    }

    /* renamed from: getRectY */
    public int[] m65214x7513893f() {
        return this.f37112x675e2f5;
    }

    /* renamed from: setCardNum */
    public void m65215xd242a794(java.lang.String str) {
        this.f37108x21041e56 = str;
    }

    /* renamed from: setCardNumLen */
    public void m65216x3aac69e1(int i17) {
        this.f37109x1e4763df = i17;
    }

    /* renamed from: setRectX */
    public void m65217x53a1a3b2(int[] iArr) {
        this.f37111x675e2f4 = iArr;
    }

    /* renamed from: setRectY */
    public void m65218x53a1a3b3(int[] iArr) {
        this.f37112x675e2f5 = iArr;
    }
}
