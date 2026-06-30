package com.p314xaae8f345.mm.p939x633fb29.p940x30579f;

/* loaded from: classes.dex */
public enum a {
    /* JADX INFO: Fake field, exist only in values array */
    MINI_PROGRAM("miniProgram", 1),
    BIZ("officialAccount", 0),
    OPENSDK("OPENSDK", 2);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151903d;

    /* renamed from: e, reason: collision with root package name */
    public final int f151904e;

    a(java.lang.String str, int i17) {
        this.f151903d = str;
        this.f151904e = i17;
    }

    public static com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        for (com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a aVar : m47896xcee59d22()) {
            if (str.equals(aVar.f151903d)) {
                return aVar;
            }
        }
        return null;
    }
}
