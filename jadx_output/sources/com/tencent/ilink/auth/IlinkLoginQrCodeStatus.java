package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public enum IlinkLoginQrCodeStatus implements com.tencent.mm.protobuf.h {
    kLoginQrCodeStatus_NoScan(0),
    kLoginQrCodeStatus_Scanned(1),
    kLoginQrCodeStatus_Confirmed(2),
    kLoginQrCodeStatus_Canceled(3),
    kLoginQrCodeStatus_Expired(4);

    public static final int kLoginQrCodeStatus_Canceled_VALUE = 3;
    public static final int kLoginQrCodeStatus_Confirmed_VALUE = 2;
    public static final int kLoginQrCodeStatus_Expired_VALUE = 4;
    public static final int kLoginQrCodeStatus_NoScan_VALUE = 0;
    public static final int kLoginQrCodeStatus_Scanned_VALUE = 1;
    public final int value;

    IlinkLoginQrCodeStatus(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.auth.IlinkLoginQrCodeStatus forNumber(int i17) {
        if (i17 == 0) {
            return kLoginQrCodeStatus_NoScan;
        }
        if (i17 == 1) {
            return kLoginQrCodeStatus_Scanned;
        }
        if (i17 == 2) {
            return kLoginQrCodeStatus_Confirmed;
        }
        if (i17 == 3) {
            return kLoginQrCodeStatus_Canceled;
        }
        if (i17 != 4) {
            return null;
        }
        return kLoginQrCodeStatus_Expired;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.auth.IlinkLoginQrCodeStatus valueOf(int i17) {
        return forNumber(i17);
    }
}
