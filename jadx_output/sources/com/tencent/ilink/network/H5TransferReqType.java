package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum H5TransferReqType implements com.tencent.mm.protobuf.h {
    kH5TransferReqType_UnKnown(0),
    kH5TransferReqType_Weixin(1),
    kH5TransferReqType_ILink(2);

    public static final int kH5TransferReqType_ILink_VALUE = 2;
    public static final int kH5TransferReqType_UnKnown_VALUE = 0;
    public static final int kH5TransferReqType_Weixin_VALUE = 1;
    public final int value;

    H5TransferReqType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.H5TransferReqType forNumber(int i17) {
        if (i17 == 0) {
            return kH5TransferReqType_UnKnown;
        }
        if (i17 == 1) {
            return kH5TransferReqType_Weixin;
        }
        if (i17 != 2) {
            return null;
        }
        return kH5TransferReqType_ILink;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.H5TransferReqType valueOf(int i17) {
        return forNumber(i17);
    }
}
