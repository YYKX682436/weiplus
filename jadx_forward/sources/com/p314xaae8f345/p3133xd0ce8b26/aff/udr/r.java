package com.p314xaae8f345.p3133xd0ce8b26.aff.udr;

/* loaded from: classes6.dex */
public enum r implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    TYPE_CHECK(1),
    TYPE_BATCH(2),
    TYPE_PERIOD(3),
    TYPE_SPECIFIED(7),
    TYPE_BUGFIX(8),
    TYPE_HTTP(10);


    /* renamed from: d, reason: collision with root package name */
    public final int f299091d;

    r(int i17) {
        this.f299091d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r a(int i17) {
        if (i17 == 1) {
            return TYPE_CHECK;
        }
        if (i17 == 2) {
            return TYPE_BATCH;
        }
        if (i17 == 3) {
            return TYPE_PERIOD;
        }
        if (i17 == 7) {
            return TYPE_SPECIFIED;
        }
        if (i17 == 8) {
            return TYPE_BUGFIX;
        }
        if (i17 != 10) {
            return null;
        }
        return TYPE_HTTP;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f299091d;
    }
}
