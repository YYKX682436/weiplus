package com.tencent.ilink.network;

/* loaded from: classes.dex */
public enum IlinkDeviceSessionType implements com.tencent.mm.protobuf.h {
    kIlinkDeviceAuth(0),
    kIlinkDeviceGetSession(1);

    public static final int kIlinkDeviceAuth_VALUE = 0;
    public static final int kIlinkDeviceGetSession_VALUE = 1;
    public final int value;

    IlinkDeviceSessionType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkDeviceSessionType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkDeviceAuth;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkDeviceGetSession;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkDeviceSessionType valueOf(int i17) {
        return forNumber(i17);
    }
}
