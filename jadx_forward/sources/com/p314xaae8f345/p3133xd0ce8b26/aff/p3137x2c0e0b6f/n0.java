package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes6.dex */
public enum n0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ChatbotRoomScene_None(0),
    ChatbotRoomScene_Asst(1),
    ChatbotRoomScene_Hardware(2),
    ChatbotRoomScene_WeApp(4),
    ChatbotRoomScene_BlueMicroSpeaker(8),
    ChatbotRoomScene_ALL(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f297928d;

    n0(int i17) {
        this.f297928d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0 a(int i17) {
        if (i17 == 0) {
            return ChatbotRoomScene_None;
        }
        if (i17 == 1) {
            return ChatbotRoomScene_Asst;
        }
        if (i17 == 2) {
            return ChatbotRoomScene_Hardware;
        }
        if (i17 == 4) {
            return ChatbotRoomScene_WeApp;
        }
        if (i17 == 8) {
            return ChatbotRoomScene_BlueMicroSpeaker;
        }
        if (i17 != 15) {
            return null;
        }
        return ChatbotRoomScene_ALL;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f297928d;
    }
}
