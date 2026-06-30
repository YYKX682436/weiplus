package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkLogLevel */
/* loaded from: classes6.dex */
public enum EnumC3057xbf13c783 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkLogLevelVerbose(0),
    kIlinkLogLevelDebug(1),
    kIlinkLogLevelInfo(2),
    kIlinkLogLevelWarn(3),
    kIlinkLogLevelError(4),
    kIlinkLogLevelFatal(5),
    kIlinkLogLevelNone(6);


    /* renamed from: kIlinkLogLevelDebug_VALUE */
    public static final int f11050x881f984d = 1;

    /* renamed from: kIlinkLogLevelError_VALUE */
    public static final int f11052x9fa37842 = 4;

    /* renamed from: kIlinkLogLevelFatal_VALUE */
    public static final int f11054x387aae3e = 5;

    /* renamed from: kIlinkLogLevelInfo_VALUE */
    public static final int f11056xe8d0b998 = 2;

    /* renamed from: kIlinkLogLevelNone_VALUE */
    public static final int f11058x708f74a2 = 6;

    /* renamed from: kIlinkLogLevelVerbose_VALUE */
    public static final int f11060xfd96c23c = 0;

    /* renamed from: kIlinkLogLevelWarn_VALUE */
    public static final int f11062x67032570 = 3;

    /* renamed from: value */
    public final int f11063x6ac9171;

    EnumC3057xbf13c783(int i17) {
        this.f11063x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 m24315x382ad972(int i17) {
        switch (i17) {
            case 0:
                return kIlinkLogLevelVerbose;
            case 1:
                return kIlinkLogLevelDebug;
            case 2:
                return kIlinkLogLevelInfo;
            case 3:
                return kIlinkLogLevelWarn;
            case 4:
                return kIlinkLogLevelError;
            case 5:
                return kIlinkLogLevelFatal;
            case 6:
                return kIlinkLogLevelNone;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11063x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3057xbf13c783 m24316xdce0328(int i17) {
        return m24315x382ad972(i17);
    }
}
