package kg;

/* loaded from: classes16.dex */
public enum y implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    ContentFlipModeNone(0),
    ContentFlipModeHorizontal(1),
    ContentFlipModeVertical(2),
    ContentFlipModeHorizontalAndVertical(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389194d;

    static {
        m143370xcee59d22();
    }

    y(int i17) {
        this.f389194d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389194d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
