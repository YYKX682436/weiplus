package bw5;

/* loaded from: classes2.dex */
public enum f10 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    Unknown(0),
    On(1),
    Off(2),
    Deleted(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f108647d;

    f10(int i17) {
        this.f108647d = i17;
    }

    public static bw5.f10 a(int i17) {
        if (i17 == 0) {
            return Unknown;
        }
        if (i17 == 1) {
            return On;
        }
        if (i17 == 2) {
            return Off;
        }
        if (i17 != 3) {
            return null;
        }
        return Deleted;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f108647d;
    }
}
