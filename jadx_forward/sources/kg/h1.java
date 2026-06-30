package kg;

/* loaded from: classes15.dex */
public enum h1 implements com.p176xb6135e39.p283xc50a8b8b.p6 {
    StickerDecoderTypePlatform(0),
    StickerDecoderTypeWxAM(1),
    UNRECOGNIZED(-1);


    /* renamed from: d, reason: collision with root package name */
    public final int f389086d;

    static {
        m142817xcee59d22();
    }

    h1(int i17) {
        this.f389086d = i17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public final int mo20656x276ffe3f() {
        if (this != UNRECOGNIZED) {
            return this.f389086d;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
