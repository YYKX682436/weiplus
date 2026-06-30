package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadBehavior */
/* loaded from: classes.dex */
public enum EnumC4479x1db1b1a implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    DOWNLOAD_BEHAVIOR_USER_REQUEST(0),
    DOWNLOAD_BEHAVIOR_VIA_SERVER_NO_QUOTA(1),
    DOWNLOAD_BEHAVIOR_VIA_SERVER_QUOTA(2),
    DOWNLOAD_BEHAVIOR_VIA_CLIENT_SYNC(3);


    /* renamed from: DOWNLOAD_BEHAVIOR_USER_REQUEST_VALUE */
    public static final int f18593x6a7d49e3 = 0;

    /* renamed from: DOWNLOAD_BEHAVIOR_VIA_CLIENT_SYNC_VALUE */
    public static final int f18595x89ebf5fa = 3;

    /* renamed from: DOWNLOAD_BEHAVIOR_VIA_SERVER_NO_QUOTA_VALUE */
    public static final int f18597x206d6d81 = 1;

    /* renamed from: DOWNLOAD_BEHAVIOR_VIA_SERVER_QUOTA_VALUE */
    public static final int f18599x3cb94a75 = 2;

    /* renamed from: value */
    public final int f18600x6ac9171;

    EnumC4479x1db1b1a(int i17) {
        this.f18600x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4479x1db1b1a m38609x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18600x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4479x1db1b1a m38610xdce0328(int i17) {
        return m38609x382ad972(i17);
    }
}
