package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes6.dex */
public enum x1 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f127204d;

    static {
        m20948xcee59d22();
    }

    x1(int i17) {
        this.f127204d = i17;
    }

    public static com.p176xb6135e39.p283xc50a8b8b.x1 a(int i17) {
        if (i17 == 0) {
            return STRING;
        }
        if (i17 == 1) {
            return CORD;
        }
        if (i17 != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        return this.f127204d;
    }
}
