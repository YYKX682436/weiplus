package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public enum s1 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    LABEL_OPTIONAL(1),
    LABEL_REQUIRED(2),
    LABEL_REPEATED(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f127018d;

    static {
        m20896xcee59d22();
    }

    s1(int i17) {
        this.f127018d = i17;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.s1 a(int i17) {
        if (i17 == 1) {
            return LABEL_OPTIONAL;
        }
        if (i17 == 2) {
            return LABEL_REQUIRED;
        }
        if (i17 != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f127018d;
    }
}
