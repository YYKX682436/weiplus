package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes6.dex */
public enum f2 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f126606d;

    static {
        m20655xcee59d22();
    }

    f2(int i17) {
        this.f126606d = i17;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.f2 a(int i17) {
        if (i17 == 1) {
            return SPEED;
        }
        if (i17 == 2) {
            return CODE_SIZE;
        }
        if (i17 != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f126606d;
    }
}
