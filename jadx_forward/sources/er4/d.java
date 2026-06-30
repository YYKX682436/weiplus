package er4;

/* loaded from: classes14.dex */
public enum d implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    SPEAKER(1),
    EARPIECE(2),
    HEADSET(3),
    BLUETOOTH(4),
    DEFAULT(1000);


    /* renamed from: d, reason: collision with root package name */
    public final int f337604d;

    d(int i17) {
        this.f337604d = i17;
    }

    public static er4.d a(int i17) {
        if (i17 == 1) {
            return SPEAKER;
        }
        if (i17 == 2) {
            return EARPIECE;
        }
        if (i17 == 3) {
            return HEADSET;
        }
        if (i17 == 4) {
            return BLUETOOTH;
        }
        if (i17 != 1000) {
            return null;
        }
        return DEFAULT;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f337604d;
    }
}
