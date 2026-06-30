package bw5;

/* loaded from: classes16.dex */
public enum xk implements com.tencent.mm.protobuf.h {
    Unknown(0),
    Reward(1),
    GlobalReward(2),
    GameRank(3),
    Intimacy(4),
    Role(5),
    GameEsport(6),
    Concert(7),
    Invisiable(8),
    Member(9),
    Mysterious(10),
    GloryList(11),
    SuperFans(12),
    PayCnt(13),
    OrdinaryBuyer(14),
    Follower(15),
    FrequentWatch(16),
    SeniorBuyer(17),
    Anonymity(18),
    Location(19),
    ShopMember(20);


    /* renamed from: d, reason: collision with root package name */
    public final int f35177d;

    xk(int i17) {
        this.f35177d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f35177d;
    }
}
