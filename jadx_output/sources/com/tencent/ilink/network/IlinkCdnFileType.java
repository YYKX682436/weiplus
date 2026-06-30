package com.tencent.ilink.network;

/* loaded from: classes.dex */
public enum IlinkCdnFileType implements com.tencent.mm.protobuf.h {
    kMediaTypeFile(5),
    kMediaTypeAppImageStorage(20304);

    public static final int kMediaTypeAppImageStorage_VALUE = 20304;
    public static final int kMediaTypeFile_VALUE = 5;
    public final int value;

    IlinkCdnFileType(int i17) {
        this.value = i17;
    }

    public static com.tencent.ilink.network.IlinkCdnFileType forNumber(int i17) {
        if (i17 == 5) {
            return kMediaTypeFile;
        }
        if (i17 != 20304) {
            return null;
        }
        return kMediaTypeAppImageStorage;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.ilink.network.IlinkCdnFileType valueOf(int i17) {
        return forNumber(i17);
    }
}
