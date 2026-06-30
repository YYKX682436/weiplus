package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.IlinkSessionKickOutDetailRet */
/* loaded from: classes.dex */
public enum EnumC3004xed73dbbb implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkSessionKickOutDetailRet_Default(0),
    kIlinkSessionKickOutDetailRet_DeviceIdUnMatch(1),
    kIlinkSessionKickOutDetailRet_DisableStatus(2),
    kIlinkSessionKickOutDetailRet_DeviceClosed_Comm(3),
    kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate(4),
    kIlinkSessionKickOutDetailRet_3rdApp_Timeout(5);


    /* renamed from: kIlinkSessionKickOutDetailRet_3rdApp_Timeout_VALUE */
    public static final int f10468xc5da5d09 = 5;

    /* renamed from: kIlinkSessionKickOutDetailRet_Default_VALUE */
    public static final int f10470x5f6ce2da = 0;

    /* renamed from: kIlinkSessionKickOutDetailRet_DeviceClosed_Comm_VALUE */
    public static final int f10472x4f75a7c2 = 3;

    /* renamed from: kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate_VALUE */
    public static final int f10474x1d7a85d9 = 4;

    /* renamed from: kIlinkSessionKickOutDetailRet_DeviceIdUnMatch_VALUE */
    public static final int f10476x56a2d574 = 1;

    /* renamed from: kIlinkSessionKickOutDetailRet_DisableStatus_VALUE */
    public static final int f10478xdf8f4d93 = 2;

    /* renamed from: value */
    public final int f10479x6ac9171;

    EnumC3004xed73dbbb(int i17) {
        this.f10479x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3004xed73dbbb m22868x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10479x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3004xed73dbbb m22869xdce0328(int i17) {
        return m22868x382ad972(i17);
    }
}
