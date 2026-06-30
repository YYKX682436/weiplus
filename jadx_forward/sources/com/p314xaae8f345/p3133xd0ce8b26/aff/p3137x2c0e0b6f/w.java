package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes14.dex */
public enum w implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ChatBotOpenScene_Unknown(0),
    ChatBotOpenScene_MainFrame(1),
    ChatBotOpenScene_MsgPage(2),
    ChatBotOpenScene_DiscoverList(3),
    ChatBotOpenScene_News(4),
    ChatBotOpenScene_ForwardActionSheet(5),
    ChatBotOpenScene_Asst(6),
    ChatBotOpenScene_Hardware(7),
    ChatBotOpenScene_AskAsst(8),
    ChatBotOpenScene_BizProfile(11),
    ChatBotOpenScene_BlueMicrophone(12),
    ChatBotOpenScene_MiniProgram(14),
    ChatBotOpenScene_PhoneApi(15),
    ChatBotOpenScene_PinkMicrophone(16),
    ChatBotOpenScene_AIVoIPDemo(17),
    ChatBotOpenScene_ECSStore(18),
    ChatBotOpenScene_BizProfileChatRoom(20),
    ChatBotOpenScene_Note(22);


    /* renamed from: d, reason: collision with root package name */
    public final int f298050d;

    w(int i17) {
        this.f298050d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w a(int i17) {
        switch (i17) {
            case 0:
                return ChatBotOpenScene_Unknown;
            case 1:
                return ChatBotOpenScene_MainFrame;
            case 2:
                return ChatBotOpenScene_MsgPage;
            case 3:
                return ChatBotOpenScene_DiscoverList;
            case 4:
                return ChatBotOpenScene_News;
            case 5:
                return ChatBotOpenScene_ForwardActionSheet;
            case 6:
                return ChatBotOpenScene_Asst;
            case 7:
                return ChatBotOpenScene_Hardware;
            case 8:
                return ChatBotOpenScene_AskAsst;
            case 9:
            case 10:
            case 13:
            case 19:
            case 21:
            default:
                return null;
            case 11:
                return ChatBotOpenScene_BizProfile;
            case 12:
                return ChatBotOpenScene_BlueMicrophone;
            case 14:
                return ChatBotOpenScene_MiniProgram;
            case 15:
                return ChatBotOpenScene_PhoneApi;
            case 16:
                return ChatBotOpenScene_PinkMicrophone;
            case 17:
                return ChatBotOpenScene_AIVoIPDemo;
            case 18:
                return ChatBotOpenScene_ECSStore;
            case 20:
                return ChatBotOpenScene_BizProfileChatRoom;
            case 22:
                return ChatBotOpenScene_Note;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f298050d;
    }
}
