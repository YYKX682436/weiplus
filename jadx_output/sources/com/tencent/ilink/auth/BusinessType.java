package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum BusinessType implements com.tencent.mm.protobuf.h {
    kBusinessTypeUnknown(-1),
    kBusinessTypeWxBase(0),
    kBusinessTypeWxPay(1);

    public static final int kBusinessTypeUnknown_VALUE = -1;
    public static final int kBusinessTypeWxBase_VALUE = 0;
    public static final int kBusinessTypeWxPay_VALUE = 1;
    public final int value;

    BusinessType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.BusinessType forNumber(int i17) {
        if (i17 == -1) {
            return kBusinessTypeUnknown;
        }
        if (i17 == 0) {
            return kBusinessTypeWxBase;
        }
        if (i17 != 1) {
            return null;
        }
        return kBusinessTypeWxPay;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.BusinessType valueOf(int i17) {
        return forNumber(i17);
    }
}
