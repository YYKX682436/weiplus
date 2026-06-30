package r45;

/* loaded from: classes2.dex */
public enum ox2 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    FinderStreamShowReddotType_LbsSameCity(4),
    FinderStreamShowReddotType_None(0),
    FinderStreamShowReddotType_Friend(1),
    FinderStreamShowReddotType_Follow(2),
    FinderStreamShowReddotType_PersonalCenter(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f464137d;

    ox2(int i17) {
        this.f464137d = i17;
    }

    public static r45.ox2 a(int i17) {
        if (i17 == 0) {
            return FinderStreamShowReddotType_None;
        }
        if (i17 == 1) {
            return FinderStreamShowReddotType_Friend;
        }
        if (i17 == 2) {
            return FinderStreamShowReddotType_Follow;
        }
        if (i17 == 3) {
            return FinderStreamShowReddotType_PersonalCenter;
        }
        if (i17 != 4) {
            return null;
        }
        return FinderStreamShowReddotType_LbsSameCity;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f464137d;
    }
}
