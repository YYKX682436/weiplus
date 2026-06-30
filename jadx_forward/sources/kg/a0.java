package kg;

/* loaded from: classes16.dex */
public enum a0 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    ContentScaleModeCenter(0),
    ContentScaleModeFill(1),
    ContentScaleModeAspectFit(2),
    ContentScaleModeAspectFill(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389044d;

    static {
        m142571xcee59d22();
    }

    a0(int i17) {
        this.f389044d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389044d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
