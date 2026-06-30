package bw5;

/* loaded from: classes9.dex */
public enum j8 implements com.tencent.mm.protobuf.h {
    EcsOpenEventType_exitWithResult(2),
    EcsOpenEventType_receiveGiftPageExit(3),
    EcsOpenEventType_mpActivityPageExit(4),
    EcsOpenEventType_previewGiftCoverPageExit(5),
    EcsOpenEventType_wxaDidExit(6),
    EcsOpenEventType_wxaNavBackToNative(7),
    EcsOpenEventType_wxaDidShow(8),
    EcsOpenEventType_changeSkuFlutterWebPageExit(9),
    EcsOpenEventType_wxaTapActionSheetBackground(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f28863d;

    j8(int i17) {
        this.f28863d = i17;
    }

    public static bw5.j8 a(int i17) {
        switch (i17) {
            case 2:
                return EcsOpenEventType_exitWithResult;
            case 3:
                return EcsOpenEventType_receiveGiftPageExit;
            case 4:
                return EcsOpenEventType_mpActivityPageExit;
            case 5:
                return EcsOpenEventType_previewGiftCoverPageExit;
            case 6:
                return EcsOpenEventType_wxaDidExit;
            case 7:
                return EcsOpenEventType_wxaNavBackToNative;
            case 8:
                return EcsOpenEventType_wxaDidShow;
            case 9:
                return EcsOpenEventType_changeSkuFlutterWebPageExit;
            case 10:
                return EcsOpenEventType_wxaTapActionSheetBackground;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28863d;
    }
}
