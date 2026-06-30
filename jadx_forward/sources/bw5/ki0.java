package bw5;

/* loaded from: classes2.dex */
public enum ki0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    PROMOTING_BUSINESS_TYPE_DEFAULT_BUY(0),
    PROMOTING_BUSINESS_TYPE_GIVE_PRESENT(1);


    /* renamed from: d, reason: collision with root package name */
    public final int f110920d;

    ki0(int i17) {
        this.f110920d = i17;
    }

    public static bw5.ki0 a(int i17) {
        if (i17 == 0) {
            return PROMOTING_BUSINESS_TYPE_DEFAULT_BUY;
        }
        if (i17 != 1) {
            return null;
        }
        return PROMOTING_BUSINESS_TYPE_GIVE_PRESENT;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f110920d;
    }
}
