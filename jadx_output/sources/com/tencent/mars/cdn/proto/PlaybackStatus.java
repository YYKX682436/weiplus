package com.tencent.mars.cdn.proto;

/* loaded from: classes.dex */
public enum PlaybackStatus implements com.tencent.mm.protobuf.h {
    PLAYBACK_STATUS_BUFFERING_BEGIN(0),
    PLAYBACK_STATUS_BUFFERING_END(1),
    PLAYBACK_STATUS_PLAYING(2),
    PLAYBACK_STATUS_PAUSED(3),
    PLAYBACK_STATUS_MAX(4);

    public static final int PLAYBACK_STATUS_BUFFERING_BEGIN_VALUE = 0;
    public static final int PLAYBACK_STATUS_BUFFERING_END_VALUE = 1;
    public static final int PLAYBACK_STATUS_MAX_VALUE = 4;
    public static final int PLAYBACK_STATUS_PAUSED_VALUE = 3;
    public static final int PLAYBACK_STATUS_PLAYING_VALUE = 2;
    public final int value;

    PlaybackStatus(int i17) {
        this.value = i17;
    }

    public static com.tencent.mars.cdn.proto.PlaybackStatus forNumber(int i17) {
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.value;
    }

    public static com.tencent.mars.cdn.proto.PlaybackStatus valueOf(int i17) {
        return forNumber(i17);
    }
}
