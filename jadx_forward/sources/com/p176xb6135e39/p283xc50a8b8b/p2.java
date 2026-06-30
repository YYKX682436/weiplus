package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes6.dex */
public enum p2 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f126913d;

    static {
        m20859xcee59d22();
    }

    p2(int i17) {
        this.f126913d = i17;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.p2 a(int i17) {
        if (i17 == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i17 == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i17 != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f126913d;
    }
}
