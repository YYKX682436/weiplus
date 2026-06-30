package ig;

/* loaded from: classes16.dex */
public enum c0 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    UNKNOWN(0),
    FIXED(1),
    RECOMMEND_V2(2),
    RECOMMEND_V3(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f372807d;

    static {
        m135289xcee59d22();
    }

    c0(int i17) {
        this.f372807d = i17;
    }

    public static ig.c0 a(int i17) {
        if (i17 == 0) {
            return UNKNOWN;
        }
        if (i17 == 1) {
            return FIXED;
        }
        if (i17 == 2) {
            return RECOMMEND_V2;
        }
        if (i17 != 3) {
            return null;
        }
        return RECOMMEND_V3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f372807d;
    }
}
