package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadMode */
/* loaded from: classes6.dex */
public enum EnumC4481x4be3466b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    DOWNLOAD_MODE_STORAGE(0),
    DOWNLOAD_MODE_PLAYBACK(1),
    DOWNLOAD_MODE_PRELOAD(2),
    DOWNLOAD_MODE_OFFLINE(3);


    /* renamed from: DOWNLOAD_MODE_OFFLINE_VALUE */
    public static final int f18609xd7825350 = 3;

    /* renamed from: DOWNLOAD_MODE_PLAYBACK_VALUE */
    public static final int f18611xe4209612 = 1;

    /* renamed from: DOWNLOAD_MODE_PRELOAD_VALUE */
    public static final int f18613x8bb97ef6 = 2;

    /* renamed from: DOWNLOAD_MODE_STORAGE_VALUE */
    public static final int f18615x79bcb5e8 = 0;

    /* renamed from: value */
    public final int f18616x6ac9171;

    EnumC4481x4be3466b(int i17) {
        this.f18616x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b m38635x382ad972(int i17) {
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18616x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b m38636xdce0328(int i17) {
        return m38635x382ad972(i17);
    }
}
