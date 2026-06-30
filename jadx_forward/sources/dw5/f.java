package dw5;

/* loaded from: classes11.dex */
public enum f implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    Other(0),
    SwitchTab(1),
    AppStateChange(2),
    EnterChatting(3),
    EnterNotifyService(4),
    EnterEcs(5),
    EnterReaderApp(6),
    DoSearch(7),
    ShowAppBrandBox(8),
    ClickFloatBall(9);


    /* renamed from: d, reason: collision with root package name */
    public final int f325889d;

    f(int i17) {
        this.f325889d = i17;
    }

    public static dw5.f a(int i17) {
        switch (i17) {
            case 0:
                return Other;
            case 1:
                return SwitchTab;
            case 2:
                return AppStateChange;
            case 3:
                return EnterChatting;
            case 4:
                return EnterNotifyService;
            case 5:
                return EnterEcs;
            case 6:
                return EnterReaderApp;
            case 7:
                return DoSearch;
            case 8:
                return ShowAppBrandBox;
            case 9:
                return ClickFloatBall;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f325889d;
    }
}
