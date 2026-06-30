package com.tencent.ilink.base;

/* loaded from: classes.dex */
public enum IlinkDomainType implements com.tencent.mm.protobuf.h {
    ILINK_DOMAIN_WEIXIN_COM(0),
    ILINK_DOMAIN_IOT_TENCENT_COM(1),
    ILINK_DOMAIN_WECHATPAY_CN(2);

    public static final int ILINK_DOMAIN_IOT_TENCENT_COM_VALUE = 1;
    public static final int ILINK_DOMAIN_WECHATPAY_CN_VALUE = 2;
    public static final int ILINK_DOMAIN_WEIXIN_COM_VALUE = 0;
    public final int value;

    IlinkDomainType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.base.IlinkDomainType forNumber(int i17) {
        if (i17 == 0) {
            return ILINK_DOMAIN_WEIXIN_COM;
        }
        if (i17 == 1) {
            return ILINK_DOMAIN_IOT_TENCENT_COM;
        }
        if (i17 != 2) {
            return null;
        }
        return ILINK_DOMAIN_WECHATPAY_CN;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.base.IlinkDomainType valueOf(int i17) {
        return forNumber(i17);
    }
}
