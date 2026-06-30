package bw5;

/* loaded from: classes11.dex */
public enum eq0 implements com.tencent.mm.protobuf.h {
    Basic(0),
    Ting(1),
    AudioRadio(2),
    TingChatRoom(3),
    BizAudio(4),
    TingChatRoomHost(5),
    FinderAudio(6),
    QuickPlay(7),
    TingMusic(8),
    StandAlone(9);


    /* renamed from: d, reason: collision with root package name */
    public final int f27025d;

    eq0(int i17) {
        this.f27025d = i17;
    }

    public static bw5.eq0 a(int i17) {
        switch (i17) {
            case 0:
                return Basic;
            case 1:
                return Ting;
            case 2:
                return AudioRadio;
            case 3:
                return TingChatRoom;
            case 4:
                return BizAudio;
            case 5:
                return TingChatRoomHost;
            case 6:
                return FinderAudio;
            case 7:
                return QuickPlay;
            case 8:
                return TingMusic;
            case 9:
                return StandAlone;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27025d;
    }
}
