package kg;

/* loaded from: classes16.dex */
public enum z implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    ContentRotationModeNone(0),
    ContentRotationModeCCW90(1),
    ContentRotationMode180(2),
    ContentRotationModeCW90(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389201d;

    static {
        m143373xcee59d22();
    }

    z(int i17) {
        this.f389201d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389201d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
