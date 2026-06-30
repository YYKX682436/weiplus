package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public enum l2 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    MSG_VOIP_WELCOME(0),
    MSG_POI(1),
    MSG_VOICE_BUTTON(2),
    MSG_PLAYGROUND(3),
    MSG_TEXT_INPUT(4),
    MSG_TTS_TASK(5),
    MST_TERMINAL(6),
    SCENCE_STATE(7),
    MSG_VAD(9),
    MSG_CHAT_INFO(10),
    MSG_VOICE_DATA(12),
    MSG_CAR_SIDE_INFO(13),
    MSG_MINIPROGRAM_USER_CALL_END(14),
    MSG_HOME_PAGE_UP_INFO(15),
    MSG_SIDE_INFO(16),
    MSG_MEMORY_INFO(17),
    MSG_INTERACTIVE_CARD_ACTION(18),
    MSG_TOOL_CALL_RESULT(19),
    MSG_SWITCH_MODEL_AND_ANSWER(22);


    /* renamed from: d, reason: collision with root package name */
    public final int f297903d;

    l2(int i17) {
        this.f297903d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l2 a(int i17) {
        switch (i17) {
            case 0:
                return MSG_VOIP_WELCOME;
            case 1:
                return MSG_POI;
            case 2:
                return MSG_VOICE_BUTTON;
            case 3:
                return MSG_PLAYGROUND;
            case 4:
                return MSG_TEXT_INPUT;
            case 5:
                return MSG_TTS_TASK;
            case 6:
                return MST_TERMINAL;
            case 7:
                return SCENCE_STATE;
            case 8:
            case 11:
            case 20:
            case 21:
            default:
                return null;
            case 9:
                return MSG_VAD;
            case 10:
                return MSG_CHAT_INFO;
            case 12:
                return MSG_VOICE_DATA;
            case 13:
                return MSG_CAR_SIDE_INFO;
            case 14:
                return MSG_MINIPROGRAM_USER_CALL_END;
            case 15:
                return MSG_HOME_PAGE_UP_INFO;
            case 16:
                return MSG_SIDE_INFO;
            case 17:
                return MSG_MEMORY_INFO;
            case 18:
                return MSG_INTERACTIVE_CARD_ACTION;
            case 19:
                return MSG_TOOL_CALL_RESULT;
            case 22:
                return MSG_SWITCH_MODEL_AND_ANSWER;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f297903d;
    }
}
