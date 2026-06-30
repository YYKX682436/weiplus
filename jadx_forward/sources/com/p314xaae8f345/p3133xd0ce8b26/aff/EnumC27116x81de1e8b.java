package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.ResourceRequestScene */
/* loaded from: classes6.dex */
public enum EnumC27116x81de1e8b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kNormal(0),
    kBatch(1),
    kPeriod(2);


    /* renamed from: kBatch_VALUE */
    public static final int f59246xa99fc6a1 = 1;

    /* renamed from: kNormal_VALUE */
    public static final int f59248xd64f3c04 = 0;

    /* renamed from: kPeriod_VALUE */
    public static final int f59250xcad0695e = 2;

    /* renamed from: value */
    public final int f59251x6ac9171;

    EnumC27116x81de1e8b(int i17) {
        this.f59251x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b m110574x382ad972(int i17) {
        if (i17 == 0) {
            return kNormal;
        }
        if (i17 == 1) {
            return kBatch;
        }
        if (i17 != 2) {
            return null;
        }
        return kPeriod;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59251x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27116x81de1e8b m110575xdce0328(int i17) {
        return m110574x382ad972(i17);
    }
}
