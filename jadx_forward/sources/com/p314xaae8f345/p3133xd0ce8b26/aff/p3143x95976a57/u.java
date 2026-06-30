package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes9.dex */
public enum u implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    UNKNOWN(0),
    H264(101),
    H265(102),
    JPEG(103),
    WXAM(104),
    WCG_WXAM(105),
    HTML(106),
    MARKDOWN(107);


    /* renamed from: d, reason: collision with root package name */
    public final int f298404d;

    u(int i17) {
        this.f298404d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u a(int i17) {
        if (i17 == 0) {
            return UNKNOWN;
        }
        switch (i17) {
            case 101:
                return H264;
            case 102:
                return H265;
            case 103:
                return JPEG;
            case 104:
                return WXAM;
            case 105:
                return WCG_WXAM;
            case 106:
                return HTML;
            case 107:
                return MARKDOWN;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f298404d;
    }
}
