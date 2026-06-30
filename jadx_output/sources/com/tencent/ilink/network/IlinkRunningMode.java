package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum IlinkRunningMode implements com.tencent.mm.protobuf.h {
    kIlinkDeviceMode(0),
    kIlinkAppMode(1);

    public static final int kIlinkAppMode_VALUE = 1;
    public static final int kIlinkDeviceMode_VALUE = 0;
    public final int value;

    IlinkRunningMode(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkRunningMode forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkDeviceMode;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkAppMode;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkRunningMode valueOf(int i17) {
        return forNumber(i17);
    }
}
