package kg;

/* loaded from: classes16.dex */
public enum c2 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    TimeTypeNumeric(0),
    TimeTypeInvalid(1),
    TimeTypePositiveInfinity(2),
    TimeTypeNegativeInfinity(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389062d;

    static {
        m142652xcee59d22();
    }

    c2(int i17) {
        this.f389062d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389062d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
