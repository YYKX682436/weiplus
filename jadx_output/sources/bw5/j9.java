package bw5;

/* loaded from: classes6.dex */
public enum j9 implements com.tencent.mm.protobuf.h {
    SECTION_TEST(0),
    SECTION_ORDER(1),
    SECTION_RECOMMEND_MAIN(2),
    SECTION_RECOMMEND_LIVE(3),
    SECTION_RECOMMEND_SHOPPING(4),
    SECTION_RECOMMEND_GIFT(5),
    SECTION_RECOMMEND_DYNAMIC(6),
    SECTION_RECOMMEND_FOLLOW_LIVE(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f28877d;

    j9(int i17) {
        this.f28877d = i17;
    }

    public static bw5.j9 a(int i17) {
        switch (i17) {
            case 0:
                return SECTION_TEST;
            case 1:
                return SECTION_ORDER;
            case 2:
                return SECTION_RECOMMEND_MAIN;
            case 3:
                return SECTION_RECOMMEND_LIVE;
            case 4:
                return SECTION_RECOMMEND_SHOPPING;
            case 5:
                return SECTION_RECOMMEND_GIFT;
            case 6:
                return SECTION_RECOMMEND_DYNAMIC;
            case 7:
                return SECTION_RECOMMEND_FOLLOW_LIVE;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f28877d;
    }
}
