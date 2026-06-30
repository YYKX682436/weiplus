package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceRecognizeType */
/* loaded from: classes6.dex */
public enum EnumC2976x2508ad6b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kFaceRecognizeType_WxPayOnly(1),
    kFaceRecognizeType_Both_WxPayMain(2),
    kFaceRecognizeType_WxBaseOnly(3),
    kFaceRecognizeType_Both_WxBaseMain(4);


    /* renamed from: kFaceRecognizeType_Both_WxBaseMain_VALUE */
    public static final int f10244xf021189c = 4;

    /* renamed from: kFaceRecognizeType_Both_WxPayMain_VALUE */
    public static final int f10246x6c234673 = 2;

    /* renamed from: kFaceRecognizeType_WxBaseOnly_VALUE */
    public static final int f10248x5e82fc0f = 3;

    /* renamed from: kFaceRecognizeType_WxPayOnly_VALUE */
    public static final int f10250xa8321a66 = 1;

    /* renamed from: value */
    public final int f10251x6ac9171;

    EnumC2976x2508ad6b(int i17) {
        this.f10251x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b m22453x382ad972(int i17) {
        if (i17 == 1) {
            return kFaceRecognizeType_WxPayOnly;
        }
        if (i17 == 2) {
            return kFaceRecognizeType_Both_WxPayMain;
        }
        if (i17 == 3) {
            return kFaceRecognizeType_WxBaseOnly;
        }
        if (i17 != 4) {
            return null;
        }
        return kFaceRecognizeType_Both_WxBaseMain;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10251x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2976x2508ad6b m22454xdce0328(int i17) {
        return m22453x382ad972(i17);
    }
}
