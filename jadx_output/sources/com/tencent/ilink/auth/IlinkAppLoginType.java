package com.tencent.ilink.auth;

/* loaded from: classes.dex */
public enum IlinkAppLoginType implements com.tencent.mm.protobuf.h {
    kILinkAppLoginType_WxPay(1),
    kILinkAppLoginType_WxBase(2),
    kILinkAppLoginType_WxOAuth(4);

    public static final int kILinkAppLoginType_WxBase_VALUE = 2;
    public static final int kILinkAppLoginType_WxOAuth_VALUE = 4;
    public static final int kILinkAppLoginType_WxPay_VALUE = 1;
    public final int value;

    IlinkAppLoginType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkAppLoginType forNumber(int i17) {
        if (i17 == 1) {
            return kILinkAppLoginType_WxPay;
        }
        if (i17 == 2) {
            return kILinkAppLoginType_WxBase;
        }
        if (i17 != 4) {
            return null;
        }
        return kILinkAppLoginType_WxOAuth;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkAppLoginType valueOf(int i17) {
        return forNumber(i17);
    }
}
