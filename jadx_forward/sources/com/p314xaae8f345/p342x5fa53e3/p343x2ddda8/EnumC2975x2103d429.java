package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceRecognizeResType */
/* loaded from: classes6.dex */
public enum EnumC2975x2103d429 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kFaceRecognizeTypeRes_Non(0),
    kFaceRecognizeTypeRes_WxPay(1),
    kFaceRecognizeTypeRes_WxBase(2),
    kFaceRecognizeTypeRes_WxPayBaseAll(3);


    /* renamed from: kFaceRecognizeTypeRes_Non_VALUE */
    public static final int f10234xe0a3bfe0 = 0;

    /* renamed from: kFaceRecognizeTypeRes_WxBase_VALUE */
    public static final int f10236x92442603 = 2;

    /* renamed from: kFaceRecognizeTypeRes_WxPayBaseAll_VALUE */
    public static final int f10239x93f9093a = 3;

    /* renamed from: kFaceRecognizeTypeRes_WxPay_VALUE */
    public static final int f10240xf83f575a = 1;

    /* renamed from: value */
    public final int f10241x6ac9171;

    EnumC2975x2103d429(int i17) {
        this.f10241x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 m22447x382ad972(int i17) {
        if (i17 == 0) {
            return kFaceRecognizeTypeRes_Non;
        }
        if (i17 == 1) {
            return kFaceRecognizeTypeRes_WxPay;
        }
        if (i17 == 2) {
            return kFaceRecognizeTypeRes_WxBase;
        }
        if (i17 != 3) {
            return null;
        }
        return kFaceRecognizeTypeRes_WxPayBaseAll;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10241x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2975x2103d429 m22448xdce0328(int i17) {
        return m22447x382ad972(i17);
    }
}
