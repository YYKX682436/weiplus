package s95;

/* loaded from: classes10.dex */
public enum u implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    UnknownType(0),
    Video(1),
    Audio(2),
    Image(3),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f486755d;

    static {
        m164165xcee59d22();
    }

    u(int i17) {
        this.f486755d = i17;
    }

    public static s95.u a(int i17) {
        if (i17 == 0) {
            return UnknownType;
        }
        if (i17 == 1) {
            return Video;
        }
        if (i17 == 2) {
            return Audio;
        }
        if (i17 != 3) {
            return null;
        }
        return Image;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f486755d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
