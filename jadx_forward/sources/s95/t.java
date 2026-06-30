package s95;

/* loaded from: classes15.dex */
public enum t implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    NoneAnimation(0),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationStart(1),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationProgress(2),
    /* JADX INFO: Fake field, exist only in values array */
    AnimationFinish(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f486744d;

    static {
        m164161xcee59d22();
    }

    t(int i17) {
        this.f486744d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f486744d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
