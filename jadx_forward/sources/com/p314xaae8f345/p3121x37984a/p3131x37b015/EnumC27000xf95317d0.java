package com.p314xaae8f345.p3121x37984a.p3131x37b015;

/* renamed from: com.tencent.wcdb.winq.ColumnType */
/* loaded from: classes12.dex */
public enum EnumC27000xf95317d0 {
    Null(0),
    Integer(1),
    Float(2),
    Text(3),
    BLOB(4);


    /* renamed from: value */
    private final int f58507x6ac9171;

    EnumC27000xf95317d0(int i17) {
        this.f58507x6ac9171 = i17;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27000xf95317d0 m108122xdce0328(int i17) {
        if (i17 == 1) {
            return Integer;
        }
        if (i17 == 2) {
            return Float;
        }
        if (i17 == 3) {
            return Text;
        }
        if (i17 != 4) {
            return Null;
        }
        return BLOB;
    }
}
