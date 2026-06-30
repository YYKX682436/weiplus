package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.PlaybackStatus */
/* loaded from: classes.dex */
public enum EnumC4514xd8b1e0d implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    PLAYBACK_STATUS_BUFFERING_BEGIN(0),
    PLAYBACK_STATUS_BUFFERING_END(1),
    PLAYBACK_STATUS_PLAYING(2),
    PLAYBACK_STATUS_PAUSED(3),
    PLAYBACK_STATUS_MAX(4);


    /* renamed from: PLAYBACK_STATUS_BUFFERING_BEGIN_VALUE */
    public static final int f18963xbe908bf5 = 0;

    /* renamed from: PLAYBACK_STATUS_BUFFERING_END_VALUE */
    public static final int f18965x20e5927 = 1;

    /* renamed from: PLAYBACK_STATUS_MAX_VALUE */
    public static final int f18967xa861502d = 4;

    /* renamed from: PLAYBACK_STATUS_PAUSED_VALUE */
    public static final int f18969xb4acc609 = 3;

    /* renamed from: PLAYBACK_STATUS_PLAYING_VALUE */
    public static final int f18971xc82f1ff7 = 2;

    /* renamed from: value */
    public final int f18972x6ac9171;

    EnumC4514xd8b1e0d(int i17) {
        this.f18972x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4514xd8b1e0d m39338x382ad972(int i17) {
        if (i17 == 0) {
            return PLAYBACK_STATUS_BUFFERING_BEGIN;
        }
        if (i17 == 1) {
            return PLAYBACK_STATUS_BUFFERING_END;
        }
        if (i17 == 2) {
            return PLAYBACK_STATUS_PLAYING;
        }
        if (i17 == 3) {
            return PLAYBACK_STATUS_PAUSED;
        }
        if (i17 != 4) {
            return null;
        }
        return PLAYBACK_STATUS_MAX;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f18972x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4514xd8b1e0d m39339xdce0328(int i17) {
        return m39338x382ad972(i17);
    }
}
