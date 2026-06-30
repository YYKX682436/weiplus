package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkPullLogNetType */
/* loaded from: classes.dex */
public enum EnumC27107x36eb2d5b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkLan(0),
    kIlinkAny(1);


    /* renamed from: kIlinkAny_VALUE */
    public static final int f59183xc2f905e6 = 1;

    /* renamed from: kIlinkLan_VALUE */
    public static final int f59185x9595f7d3 = 0;

    /* renamed from: value */
    public final int f59186x6ac9171;

    EnumC27107x36eb2d5b(int i17) {
        this.f59186x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27107x36eb2d5b m110402x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkLan;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkAny;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59186x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27107x36eb2d5b m110403xdce0328(int i17) {
        return m110402x382ad972(i17);
    }
}
