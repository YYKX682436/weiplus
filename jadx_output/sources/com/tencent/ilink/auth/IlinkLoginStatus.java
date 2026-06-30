package com.tencent.ilink.auth;

/* loaded from: classes6.dex */
public enum IlinkLoginStatus implements com.tencent.mm.protobuf.h {
    kIlinkLoginUnknown(-1),
    kIlinkLoginSuccess(0),
    kIlinkRequireManualLogin(1),
    kIlinkRequireAutoLogin(2);

    public static final int kIlinkLoginSuccess_VALUE = 0;
    public static final int kIlinkLoginUnknown_VALUE = -1;
    public static final int kIlinkRequireAutoLogin_VALUE = 2;
    public static final int kIlinkRequireManualLogin_VALUE = 1;
    public final int value;

    IlinkLoginStatus(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkLoginStatus forNumber(int i17) {
        if (i17 == -1) {
            return kIlinkLoginUnknown;
        }
        if (i17 == 0) {
            return kIlinkLoginSuccess;
        }
        if (i17 == 1) {
            return kIlinkRequireManualLogin;
        }
        if (i17 != 2) {
            return null;
        }
        return kIlinkRequireAutoLogin;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkLoginStatus valueOf(int i17) {
        return forNumber(i17);
    }
}
