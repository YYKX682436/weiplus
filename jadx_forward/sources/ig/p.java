package ig;

/* loaded from: classes16.dex */
public enum p implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    RECOMMEND(1),
    TEMPLATE(2),
    NOT_FOUND(3),
    OTHERS(100);


    /* renamed from: d, reason: collision with root package name */
    public final int f372818d;

    static {
        m135997xcee59d22();
    }

    p(int i17) {
        this.f372818d = i17;
    }

    public static ig.p a(int i17) {
        if (i17 == 1) {
            return RECOMMEND;
        }
        if (i17 == 2) {
            return TEMPLATE;
        }
        if (i17 == 3) {
            return NOT_FOUND;
        }
        if (i17 != 100) {
            return null;
        }
        return OTHERS;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f372818d;
    }
}
