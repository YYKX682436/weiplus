package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum CloudCgiType implements com.tencent.mm.protobuf.h {
    kAuthRequest(1),
    kTransferRequest(2);

    public static final int kAuthRequest_VALUE = 1;
    public static final int kTransferRequest_VALUE = 2;
    public final int value;

    CloudCgiType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.CloudCgiType forNumber(int i17) {
        if (i17 == 1) {
            return kAuthRequest;
        }
        if (i17 != 2) {
            return null;
        }
        return kTransferRequest;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.CloudCgiType valueOf(int i17) {
        return forNumber(i17);
    }
}
