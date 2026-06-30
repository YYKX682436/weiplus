package s95;

/* loaded from: classes10.dex */
public enum p implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    PbDefault(0),
    /* JADX INFO: Fake field, exist only in values array */
    PbForbidOutside(1),
    PbJumpBack(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f486696d;

    static {
        m164153xcee59d22();
    }

    p(int i17) {
        this.f486696d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f486696d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
