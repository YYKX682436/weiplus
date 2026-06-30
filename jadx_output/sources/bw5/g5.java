package bw5;

/* loaded from: classes6.dex */
public enum g5 implements com.tencent.mm.protobuf.h {
    SHOP_CARD(1),
    PRODUCT_CARD(2),
    WAAPP_CARD(3),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_CARD(4),
    /* JADX INFO: Fake field, exist only in values array */
    FREE_POSTER_CARD(5),
    /* JADX INFO: Fake field, exist only in values array */
    BULK_BUY_POSTER_CARD(6),
    BULK_BUY_CARD(7),
    /* JADX INFO: Fake field, exist only in values array */
    GIFT_CARD(8),
    /* JADX INFO: Fake field, exist only in values array */
    FRIEND_RECEIVE(9);


    /* renamed from: d, reason: collision with root package name */
    public final int f27690d;

    g5(int i17) {
        this.f27690d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f27690d;
    }
}
