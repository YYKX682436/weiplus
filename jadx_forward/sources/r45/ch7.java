package r45;

/* loaded from: classes2.dex */
public enum ch7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    English(1),
    origin(2),
    Chinese(0);


    /* renamed from: d, reason: collision with root package name */
    public final int f453094d;

    ch7(int i17) {
        this.f453094d = i17;
    }

    public static r45.ch7 a(int i17) {
        if (i17 == 0) {
            return Chinese;
        }
        if (i17 == 1) {
            return English;
        }
        if (i17 != 2) {
            return null;
        }
        return origin;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f453094d;
    }
}
