package bw5;

/* loaded from: classes11.dex */
public enum jn0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    STATUS_UNKNOWN(0),
    STATUS_ME_PROFILE(1),
    STATUS_ME_PROFILE_PULL_DOWN(2),
    STATUS_SQUARE_CARD(3),
    STATUS_HISTORY_CARD(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f110589d;

    jn0(int i17) {
        this.f110589d = i17;
    }

    public static bw5.jn0 a(int i17) {
        if (i17 == 0) {
            return STATUS_UNKNOWN;
        }
        if (i17 == 1) {
            return STATUS_ME_PROFILE;
        }
        if (i17 == 2) {
            return STATUS_ME_PROFILE_PULL_DOWN;
        }
        if (i17 == 3) {
            return STATUS_SQUARE_CARD;
        }
        if (i17 != 4) {
            return null;
        }
        return STATUS_HISTORY_CARD;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f110589d;
    }
}
