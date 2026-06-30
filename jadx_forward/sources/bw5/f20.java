package bw5;

/* loaded from: classes11.dex */
public enum f20 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    HybridRouterBizTypeDefault(0),
    HybridRouterBizTypeTing(1),
    HybridRouterBizTypeTingMusicChat(2),
    HybridRouterBizTypeTingMusicChatroom(3),
    HybridRouterBizTypeTingQuickPlay(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f108661d;

    f20(int i17) {
        this.f108661d = i17;
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

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f108661d;
    }
}
