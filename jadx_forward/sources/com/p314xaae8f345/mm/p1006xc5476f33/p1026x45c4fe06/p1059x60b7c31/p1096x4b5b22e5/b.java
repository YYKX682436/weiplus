package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

/* loaded from: classes7.dex */
public enum b {
    RELEASE(0),
    DEVELOP(1),
    TRIAL(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f163727d;

    b(int i17) {
        this.f163727d = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b bVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return bVar;
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b bVar2 : m51126xcee59d22()) {
            if (bVar2.name().toLowerCase().equals(str)) {
                return bVar2;
            }
        }
        return bVar;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b b(int i17) {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b bVar : m51126xcee59d22()) {
            if (bVar.f163727d == i17) {
                return bVar;
            }
        }
        return RELEASE;
    }
}
