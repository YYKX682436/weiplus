package com.tencent.ilink.auth;

/* loaded from: classes.dex */
public enum IlinkSessionKickOutDetailRet implements com.tencent.mm.protobuf.h {
    kIlinkSessionKickOutDetailRet_Default(0),
    kIlinkSessionKickOutDetailRet_DeviceIdUnMatch(1),
    kIlinkSessionKickOutDetailRet_DisableStatus(2),
    kIlinkSessionKickOutDetailRet_DeviceClosed_Comm(3),
    kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate(4),
    kIlinkSessionKickOutDetailRet_3rdApp_Timeout(5);

    public static final int kIlinkSessionKickOutDetailRet_3rdApp_Timeout_VALUE = 5;
    public static final int kIlinkSessionKickOutDetailRet_Default_VALUE = 0;
    public static final int kIlinkSessionKickOutDetailRet_DeviceClosed_Comm_VALUE = 3;
    public static final int kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate_VALUE = 4;
    public static final int kIlinkSessionKickOutDetailRet_DeviceIdUnMatch_VALUE = 1;
    public static final int kIlinkSessionKickOutDetailRet_DisableStatus_VALUE = 2;
    public final int value;

    IlinkSessionKickOutDetailRet(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkSessionKickOutDetailRet forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkSessionKickOutDetailRet_Default;
        }
        if (i17 == 1) {
            return kIlinkSessionKickOutDetailRet_DeviceIdUnMatch;
        }
        if (i17 == 2) {
            return kIlinkSessionKickOutDetailRet_DisableStatus;
        }
        if (i17 == 3) {
            return kIlinkSessionKickOutDetailRet_DeviceClosed_Comm;
        }
        if (i17 == 4) {
            return kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate;
        }
        if (i17 != 5) {
            return null;
        }
        return kIlinkSessionKickOutDetailRet_3rdApp_Timeout;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkSessionKickOutDetailRet valueOf(int i17) {
        return forNumber(i17);
    }
}
