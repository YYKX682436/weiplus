package bw5;

/* loaded from: classes8.dex */
public enum n9 implements com.tencent.mm.protobuf.h {
    RECEIVE_REDDOT(1),
    EXPOSE_WITH_REDDOT(2),
    EXPOSE_WITHOUT_REDDOT(3),
    FOREGROUND(4),
    NOTIFY(5),
    REVOKE_REDDOT(6),
    SHOP_ENTRANCE_CLICK(7);


    /* renamed from: d, reason: collision with root package name */
    public final int f30566d;

    n9(int i17) {
        this.f30566d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f30566d;
    }
}
