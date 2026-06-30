package com.p314xaae8f345.p342x5fa53e3.p344x2e06d1;

/* renamed from: com.tencent.ilink.base.IlinkLogMode */
/* loaded from: classes6.dex */
public enum EnumC3016xcc5c11c4 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkLogModeSync(0),
    kIlinkLogModeAsync(1);


    /* renamed from: kIlinkLogModeAsync_VALUE */
    public static final int f10611x84f17c9f = 1;

    /* renamed from: kIlinkLogModeSync_VALUE */
    public static final int f10613x41f80dbc = 0;

    /* renamed from: value */
    public final int f10614x6ac9171;

    EnumC3016xcc5c11c4(int i17) {
        this.f10614x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 m23099x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkLogModeSync;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkLogModeAsync;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10614x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p344x2e06d1.EnumC3016xcc5c11c4 m23100xdce0328(int i17) {
        return m23099x382ad972(i17);
    }
}
