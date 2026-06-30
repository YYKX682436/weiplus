package bw5;

/* loaded from: classes11.dex */
public enum f20 implements com.tencent.mm.protobuf.h {
    HybridRouterBizTypeDefault(0),
    HybridRouterBizTypeTing(1),
    HybridRouterBizTypeTingMusicChat(2),
    HybridRouterBizTypeTingMusicChatroom(3),
    HybridRouterBizTypeTingQuickPlay(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f27128d;

    f20(int i17) {
        this.f27128d = i17;
    }

    public static bw5.f20 a(int i17) {
        if (i17 == 0) {
            return HybridRouterBizTypeDefault;
        }
        if (i17 == 1) {
            return HybridRouterBizTypeTing;
        }
        if (i17 == 2) {
            return HybridRouterBizTypeTingMusicChat;
        }
        if (i17 == 3) {
            return HybridRouterBizTypeTingMusicChatroom;
        }
        if (i17 != 4) {
            return null;
        }
        return HybridRouterBizTypeTingQuickPlay;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27128d;
    }
}
