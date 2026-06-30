package com.tencent.ilink.base;

/* loaded from: classes6.dex */
public enum IlinkLogMode implements com.tencent.mm.protobuf.h {
    kIlinkLogModeSync(0),
    kIlinkLogModeAsync(1);

    public static final int kIlinkLogModeAsync_VALUE = 1;
    public static final int kIlinkLogModeSync_VALUE = 0;
    public final int value;

    IlinkLogMode(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.base.IlinkLogMode forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkLogModeSync;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkLogModeAsync;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.base.IlinkLogMode valueOf(int i17) {
        return forNumber(i17);
    }
}
