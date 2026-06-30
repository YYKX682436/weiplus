package bw5;

/* loaded from: classes6.dex */
public enum f30 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    PREVIEW_NONE(0),
    PREVIEW_PASSWORD(1),
    PREVIEW_FILES(2),
    PREVIEW_SIZE(3),
    PREVIEW_DEPTH(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f108674d;

    f30(int i17) {
        this.f108674d = i17;
    }

    public static bw5.f30 a(int i17) {
        if (i17 == 0) {
            return PREVIEW_NONE;
        }
        if (i17 == 1) {
            return PREVIEW_PASSWORD;
        }
        if (i17 == 2) {
            return PREVIEW_FILES;
        }
        if (i17 == 3) {
            return PREVIEW_SIZE;
        }
        if (i17 != 4) {
            return null;
        }
        return PREVIEW_DEPTH;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f108674d;
    }
}
