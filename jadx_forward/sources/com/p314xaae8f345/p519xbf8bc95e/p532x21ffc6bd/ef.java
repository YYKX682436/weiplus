package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public enum ef {
    None("", 0),
    Gradient("heat", 2),
    Aggregation("honey", 3),
    ArcLine("arcline", 4),
    GLModel("model", 5),
    Trail("trail", 6),
    Scatter("scatter", 7);


    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f130778h;

    /* renamed from: i, reason: collision with root package name */
    private final int f130779i;

    ef(java.lang.String str, int i17) {
        this.f130778h = str;
        this.f130779i = i17;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef a(int i17) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef efVar : m36707xcee59d22()) {
            if (efVar.f130779i == i17) {
                return efVar;
            }
        }
        return None;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef b(java.lang.String str) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef efVar : m36707xcee59d22()) {
            if (efVar.a(str)) {
                return efVar;
            }
        }
        return None;
    }

    private boolean b(int i17) {
        return this.f130779i == i17;
    }

    public final boolean a(java.lang.String str) {
        return this.f130778h.equals(str);
    }

    private java.lang.String a() {
        return this.f130778h;
    }
}
