package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum IlinkLogLevel implements com.tencent.mm.protobuf.h {
    kIlinkLogLevelVerbose(0),
    kIlinkLogLevelDebug(1),
    kIlinkLogLevelInfo(2),
    kIlinkLogLevelWarn(3),
    kIlinkLogLevelError(4),
    kIlinkLogLevelFatal(5),
    kIlinkLogLevelNone(6);

    public static final int kIlinkLogLevelDebug_VALUE = 1;
    public static final int kIlinkLogLevelError_VALUE = 4;
    public static final int kIlinkLogLevelFatal_VALUE = 5;
    public static final int kIlinkLogLevelInfo_VALUE = 2;
    public static final int kIlinkLogLevelNone_VALUE = 6;
    public static final int kIlinkLogLevelVerbose_VALUE = 0;
    public static final int kIlinkLogLevelWarn_VALUE = 3;
    public final int value;

    IlinkLogLevel(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkLogLevel forNumber(int i17) {
        switch (i17) {
            case 0:
                return kIlinkLogLevelVerbose;
            case 1:
                return kIlinkLogLevelDebug;
            case 2:
                return kIlinkLogLevelInfo;
            case 3:
                return kIlinkLogLevelWarn;
            case 4:
                return kIlinkLogLevelError;
            case 5:
                return kIlinkLogLevelFatal;
            case 6:
                return kIlinkLogLevelNone;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkLogLevel valueOf(int i17) {
        return forNumber(i17);
    }
}
