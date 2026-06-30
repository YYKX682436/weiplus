package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373;

/* renamed from: com.tencent.thumbplayer.adapter.strategy.TPExtStrategy */
/* loaded from: classes16.dex */
public class C26156xebff5898 extends com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.AbstractC26154xb6943200 {
    private static final java.lang.String TAG = "TPThumbPlayer[TPExtStrategy.java]";

    /* renamed from: mCurId */
    private int f50264xbde7470e;

    /* renamed from: mPlayerList */
    private int[] f50265x591a5f6c;

    public C26156xebff5898(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31 c26158xb3cf3e31) {
        super(c26158xb3cf3e31);
        this.f50264xbde7470e = 0;
        int[] m100817x6b291f15 = c26158xb3cf3e31.m100817x6b291f15();
        this.f50265x591a5f6c = m100817x6b291f15;
        if (m100817x6b291f15 == null || m100817x6b291f15.length == 0) {
            this.f50265x591a5f6c = new int[1];
        }
    }

    /* renamed from: isUseSoftDec */
    private boolean m100811xa77288bb(java.lang.String str) {
        return android.text.TextUtils.equals(str, "hd") || android.text.TextUtils.equals(str, "sd") || android.text.TextUtils.equals(str, "msd");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.AbstractC26154xb6943200, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForDec */
    public int[] mo100805xdc3a4bcc() {
        int[] iArr = {-1};
        int i17 = this.f50264xbde7470e;
        int[] iArr2 = this.f50265x591a5f6c;
        if (i17 >= iArr2.length) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "strategyForDec error, decType:" + iArr[0]);
            return iArr;
        }
        int i18 = iArr2[i17];
        if (i18 == 1 || i18 == 2) {
            iArr[0] = 102;
        } else if (i18 == 3) {
            iArr[0] = 101;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "strategyForDec, decType:" + iArr[0]);
        return iArr;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.AbstractC26154xb6943200, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForOpen */
    public int mo100806xab1457c0(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        int[] iArr = this.f50265x591a5f6c;
        int length = iArr.length;
        int i17 = this.f50264xbde7470e;
        int i18 = length > i17 ? iArr[i17] : 0;
        int i19 = (!(i18 == 2 || i18 == 3) || m100810x30cb20b0(c26130x49ae05)) ? i18 : 0;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "strategyForOpen, playerType:" + i19);
        return i19;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.AbstractC26154xb6943200, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForRetry */
    public int mo100807xb79c1ff2(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26159xc61ed8a0 c26159xc61ed8a0) {
        int i17;
        if (c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 0) {
            return mo100806xab1457c0(c26130x49ae05);
        }
        int[] iArr = this.f50265x591a5f6c;
        int length = iArr.length - 1;
        int i18 = this.f50264xbde7470e;
        if (length > i18) {
            int i19 = i18 + 1;
            this.f50264xbde7470e = i19;
            i17 = iArr[i19];
        } else {
            i17 = 0;
        }
        int i27 = (!(i17 == 2 || i17 == 3) || m100810x30cb20b0(c26130x49ae05)) ? i17 : 0;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "strategyForRetry, playerType:" + i27);
        return i27;
    }
}
