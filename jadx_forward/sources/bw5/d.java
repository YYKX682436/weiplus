package bw5;

/* loaded from: classes16.dex */
public enum d implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AICHAT_BIZ_EVENT_UNKNOWN(0),
    AICHAT_BIZ_EVENT_FIRST_SPEAKING(1),
    AICHAT_BIZ_EVENT_LISTENING_STATUS_CHANGED(2),
    AICHAT_BIZ_EVENT_IS_SPEAKING_CHANGED(3),
    AICHAT_BIZ_EVENT_DID_START_RECORDING_CHANGED(4),
    AICHAT_BIZ_EVENT_RECORD_TIME_TOO_SHORT(5),
    AICHAT_BIZ_EVENT_RECORDING_NOT_STARTED(6),
    AICHAT_BIZ_EVENT_DISPLAY_TEXT_UPDATED(7),
    AICHAT_BIZ_EVENT_RESIGN_AUDIO_MODULE(8),
    AICHAT_BIZ_EVENT_TASK_FINISH(9),
    AICHAT_BIZ_EVENT_READY_PLAY_MUSIC(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f107794d;

    d(int i17) {
        this.f107794d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f107794d;
    }
}
