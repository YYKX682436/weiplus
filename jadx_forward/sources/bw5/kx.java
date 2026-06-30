package bw5;

/* loaded from: classes3.dex */
public enum kx implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    FinderTabTipsDSLRenderReddotPendantPosition_Unknown(0),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftTop(1),
    FinderTabTipsDSLRenderReddotPendantPosition_RightTop(2),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftBottom(3),
    FinderTabTipsDSLRenderReddotPendantPosition_RightBottom(4),
    FinderTabTipsDSLRenderReddotPendantPosition_Center(5),
    FinderTabTipsDSLRenderReddotPendantPosition_RightIcon(6),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftIcon(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f111106d;

    kx(int i17) {
        this.f111106d = i17;
    }

    public static bw5.kx a(int i17) {
        switch (i17) {
            case 0:
                return FinderTabTipsDSLRenderReddotPendantPosition_Unknown;
            case 1:
                return FinderTabTipsDSLRenderReddotPendantPosition_LeftTop;
            case 2:
                return FinderTabTipsDSLRenderReddotPendantPosition_RightTop;
            case 3:
                return FinderTabTipsDSLRenderReddotPendantPosition_LeftBottom;
            case 4:
                return FinderTabTipsDSLRenderReddotPendantPosition_RightBottom;
            case 5:
                return FinderTabTipsDSLRenderReddotPendantPosition_Center;
            case 6:
                return FinderTabTipsDSLRenderReddotPendantPosition_RightIcon;
            case 7:
                return FinderTabTipsDSLRenderReddotPendantPosition_LeftIcon;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f111106d;
    }
}
