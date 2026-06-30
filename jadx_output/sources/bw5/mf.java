package bw5;

/* loaded from: classes9.dex */
public enum mf implements com.tencent.mm.protobuf.h {
    PRODUCT_CARD_TYPE_UNKNOWN(0),
    PRODUCT_CARD_TYPE_NEW_BUYER(1),
    PRODUCT_CARD_TYPE_BULK_BUY(2),
    PRODUCT_CARD_TYPE_PRODUCT(3),
    PRODUCT_CARD_TYPE_FRIEND_LIKED_BUY(4),
    PRODUCT_CARD_TYPE_RECOMMEND_REASON(5),
    PRODUCT_CARD_TYPE_RECOMMEND_REASON_FLUTTER(6);


    /* renamed from: d, reason: collision with root package name */
    public final int f30226d;

    mf(int i17) {
        this.f30226d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30226d;
    }
}
