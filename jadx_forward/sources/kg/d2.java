package kg;

/* loaded from: classes15.dex */
public enum d2 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    TimingFillModeNone(0),
    TimingFillModeLooping(1),
    TimingFillModeLastFrame(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389070d;

    static {
        m142690xcee59d22();
    }

    d2(int i17) {
        this.f389070d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389070d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
