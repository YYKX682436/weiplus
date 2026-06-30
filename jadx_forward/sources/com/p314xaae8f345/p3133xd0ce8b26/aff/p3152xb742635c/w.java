package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes9.dex */
public enum w implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kStreamNetworkTypeUnknown(0),
    kStreamNetworkTypeCellular(1),
    kStreamNetworkTypeWiFi(2),
    kStreamNetworkTypeEthernet(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f298863d;

    w(int i17) {
        this.f298863d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.w a(int i17) {
        if (i17 == 0) {
            return kStreamNetworkTypeUnknown;
        }
        if (i17 == 1) {
            return kStreamNetworkTypeCellular;
        }
        if (i17 == 2) {
            return kStreamNetworkTypeWiFi;
        }
        if (i17 != 3) {
            return null;
        }
        return kStreamNetworkTypeEthernet;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f298863d;
    }
}
