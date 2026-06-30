package com.tencent.mars.cdn.proto;

/* loaded from: classes6.dex */
public enum DownloadMode implements com.tencent.mm.protobuf.h {
    DOWNLOAD_MODE_STORAGE(0),
    DOWNLOAD_MODE_PLAYBACK(1),
    DOWNLOAD_MODE_PRELOAD(2),
    DOWNLOAD_MODE_OFFLINE(3);

    public static final int DOWNLOAD_MODE_OFFLINE_VALUE = 3;
    public static final int DOWNLOAD_MODE_PLAYBACK_VALUE = 1;
    public static final int DOWNLOAD_MODE_PRELOAD_VALUE = 2;
    public static final int DOWNLOAD_MODE_STORAGE_VALUE = 0;
    public final int value;

    DownloadMode(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.DownloadMode forNumber(int i17) {
        if (i17 == 0) {
            return DOWNLOAD_MODE_STORAGE;
        }
        if (i17 == 1) {
            return DOWNLOAD_MODE_PLAYBACK;
        }
        if (i17 == 2) {
            return DOWNLOAD_MODE_PRELOAD;
        }
        if (i17 != 3) {
            return null;
        }
        return DOWNLOAD_MODE_OFFLINE;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.DownloadMode valueOf(int i17) {
        return forNumber(i17);
    }
}
