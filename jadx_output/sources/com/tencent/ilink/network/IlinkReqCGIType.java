package com.tencent.ilink.network;

/* loaded from: classes6.dex */
public enum IlinkReqCGIType implements com.tencent.mm.protobuf.h {
    kIlinkCGITypeDirect(0),
    kIlinkCGITypeH5Transfer(1);

    public static final int kIlinkCGITypeDirect_VALUE = 0;
    public static final int kIlinkCGITypeH5Transfer_VALUE = 1;
    public final int value;

    IlinkReqCGIType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkReqCGIType forNumber(int i17) {
        if (i17 == 0) {
            return kIlinkCGITypeDirect;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkCGITypeH5Transfer;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkReqCGIType valueOf(int i17) {
        return forNumber(i17);
    }
}
