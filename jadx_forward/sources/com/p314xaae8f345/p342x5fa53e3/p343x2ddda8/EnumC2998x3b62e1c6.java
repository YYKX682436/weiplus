package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkLoginQrCodeStatus */
/* loaded from: classes4.dex */
public enum EnumC2998x3b62e1c6 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kLoginQrCodeStatus_NoScan(0),
    kLoginQrCodeStatus_Scanned(1),
    kLoginQrCodeStatus_Confirmed(2),
    kLoginQrCodeStatus_Canceled(3),
    kLoginQrCodeStatus_Expired(4);


    /* renamed from: kLoginQrCodeStatus_Canceled_VALUE */
    public static final int f10394xd995ba8c = 3;

    /* renamed from: kLoginQrCodeStatus_Confirmed_VALUE */
    public static final int f10396xfaa53830 = 2;

    /* renamed from: kLoginQrCodeStatus_Expired_VALUE */
    public static final int f10398xb10f1336 = 4;

    /* renamed from: kLoginQrCodeStatus_NoScan_VALUE */
    public static final int f10400xe6961251 = 0;

    /* renamed from: kLoginQrCodeStatus_Scanned_VALUE */
    public static final int f10402xd59dddc1 = 1;

    /* renamed from: value */
    public final int f10403x6ac9171;

    EnumC2998x3b62e1c6(int i17) {
        this.f10403x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 m22792x382ad972(int i17) {
        if (i17 == 0) {
            return kLoginQrCodeStatus_NoScan;
        }
        if (i17 == 1) {
            return kLoginQrCodeStatus_Scanned;
        }
        if (i17 == 2) {
            return kLoginQrCodeStatus_Confirmed;
        }
        if (i17 == 3) {
            return kLoginQrCodeStatus_Canceled;
        }
        if (i17 != 4) {
            return null;
        }
        return kLoginQrCodeStatus_Expired;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10403x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2998x3b62e1c6 m22793xdce0328(int i17) {
        return m22792x382ad972(i17);
    }
}
