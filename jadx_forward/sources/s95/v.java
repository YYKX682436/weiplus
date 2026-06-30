package s95;

/* loaded from: classes10.dex */
public enum v implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    Custom(0),
    CenterCrop(1),
    CenterInside(2),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f486768d;

    static {
        m164169xcee59d22();
    }

    v(int i17) {
        this.f486768d = i17;
    }

    public static s95.v a(int i17) {
        if (i17 == 0) {
            return Custom;
        }
        if (i17 == 1) {
            return CenterCrop;
        }
        if (i17 != 2) {
            return null;
        }
        return CenterInside;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f486768d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
