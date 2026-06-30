package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes6.dex */
public enum i implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VQMProfileInfoAppStateNull(0),
    VQMProfileInfoAppStateActive(10000),
    VQMProfileInfoAppStateInactive(10001),
    VQMProfileInfoAppStateBackground(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f258880d;

    i(int i17) {
        this.f258880d = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.vqm.i a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoAppStateNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoAppStateActive;
            case 10001:
                return VQMProfileInfoAppStateInactive;
            case 10002:
                return VQMProfileInfoAppStateBackground;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f258880d;
    }
}
