package ig;

/* loaded from: classes5.dex */
public enum k implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    IMAGE(1),
    VIDEO(2),
    LIVE_PHOTO(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f372812d;

    static {
        m135704xcee59d22();
    }

    k(int i17) {
        this.f372812d = i17;
    }

    public static ig.k a(int i17) {
        if (i17 == 1) {
            return IMAGE;
        }
        if (i17 == 2) {
            return VIDEO;
        }
        if (i17 != 3) {
            return null;
        }
        return LIVE_PHOTO;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f372812d;
    }
}
