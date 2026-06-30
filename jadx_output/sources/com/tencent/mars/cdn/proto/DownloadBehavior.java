package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum DownloadBehavior implements com.tencent.mm.protobuf.h {
    DOWNLOAD_BEHAVIOR_USER_REQUEST(0),
    DOWNLOAD_BEHAVIOR_VIA_SERVER_NO_QUOTA(1),
    DOWNLOAD_BEHAVIOR_VIA_SERVER_QUOTA(2),
    DOWNLOAD_BEHAVIOR_VIA_CLIENT_SYNC(3);

    public static final int DOWNLOAD_BEHAVIOR_USER_REQUEST_VALUE = 0;
    public static final int DOWNLOAD_BEHAVIOR_VIA_CLIENT_SYNC_VALUE = 3;
    public static final int DOWNLOAD_BEHAVIOR_VIA_SERVER_NO_QUOTA_VALUE = 1;
    public static final int DOWNLOAD_BEHAVIOR_VIA_SERVER_QUOTA_VALUE = 2;
    public final int value;

    DownloadBehavior(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.DownloadBehavior forNumber(int i17) {
        if (i17 == 0) {
            return DOWNLOAD_BEHAVIOR_USER_REQUEST;
        }
        if (i17 == 1) {
            return DOWNLOAD_BEHAVIOR_VIA_SERVER_NO_QUOTA;
        }
        if (i17 == 2) {
            return DOWNLOAD_BEHAVIOR_VIA_SERVER_QUOTA;
        }
        if (i17 != 3) {
            return null;
        }
        return DOWNLOAD_BEHAVIOR_VIA_CLIENT_SYNC;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.DownloadBehavior valueOf(int i17) {
        return forNumber(i17);
    }
}
