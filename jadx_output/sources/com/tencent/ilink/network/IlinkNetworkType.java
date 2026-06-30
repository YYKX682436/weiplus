package com.tencent.ilink.network;

/* loaded from: classes15.dex */
public enum IlinkNetworkType implements com.tencent.mm.protobuf.h {
    kIlinkNetworkTypeDefault(0),
    kIlinkNetworkTypeMobile(1);

    public static final int kIlinkNetworkTypeDefault_VALUE = 0;
    public static final int kIlinkNetworkTypeMobile_VALUE = 1;
    public final int value;

    IlinkNetworkType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkNetworkType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkNetworkTypeDefault;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkNetworkTypeMobile;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkNetworkType valueOf(int i17) {
        return forNumber(i17);
    }
}
