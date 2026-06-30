package bw5;

/* loaded from: classes3.dex */
public enum kx implements com.tencent.mm.protobuf.h {
    FinderTabTipsDSLRenderReddotPendantPosition_Unknown(0),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftTop(1),
    FinderTabTipsDSLRenderReddotPendantPosition_RightTop(2),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftBottom(3),
    FinderTabTipsDSLRenderReddotPendantPosition_RightBottom(4),
    FinderTabTipsDSLRenderReddotPendantPosition_Center(5),
    FinderTabTipsDSLRenderReddotPendantPosition_RightIcon(6),
    FinderTabTipsDSLRenderReddotPendantPosition_LeftIcon(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f29573d;

    kx(int i17) {
        this.f29573d = i17;
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

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29573d;
    }
}
