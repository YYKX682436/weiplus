package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.ResourceRequestScene */
/* loaded from: classes6.dex */
public enum EnumC3072x81de1e8b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kNormal(0),
    kBatch(1),
    kPeriod(2),
    kSpecified(3);


    /* renamed from: kBatch_VALUE */
    public static final int f11172xa99fc6a1 = 1;

    /* renamed from: kNormal_VALUE */
    public static final int f11174xd64f3c04 = 0;

    /* renamed from: kPeriod_VALUE */
    public static final int f11176xcad0695e = 2;

    /* renamed from: kSpecified_VALUE */
    public static final int f11178xd266aa17 = 3;

    /* renamed from: value */
    public final int f11179x6ac9171;

    EnumC3072x81de1e8b(int i17) {
        this.f11179x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b m24616x382ad972(int i17) {
        if (i17 == 0) {
            return kNormal;
        }
        if (i17 == 1) {
            return kBatch;
        }
        if (i17 == 2) {
            return kPeriod;
        }
        if (i17 != 3) {
            return null;
        }
        return kSpecified;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11179x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3072x81de1e8b m24617xdce0328(int i17) {
        return m24616x382ad972(i17);
    }
}
