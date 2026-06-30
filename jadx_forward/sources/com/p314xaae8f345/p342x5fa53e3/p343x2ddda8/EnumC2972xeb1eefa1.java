package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.FaceDataType */
/* loaded from: classes6.dex */
public enum EnumC2972xeb1eefa1 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kFaceDataType_3D(1),
    kFaceDataType_2D_Video(2);


    /* renamed from: kFaceDataType_2D_Video_VALUE */
    public static final int f10203xc727e713 = 2;

    /* renamed from: kFaceDataType_3D_VALUE */
    public static final int f10205x8eb2f156 = 1;

    /* renamed from: value */
    public final int f10206x6ac9171;

    EnumC2972xeb1eefa1(int i17) {
        this.f10206x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 m22414x382ad972(int i17) {
        if (i17 == 1) {
            return kFaceDataType_3D;
        }
        if (i17 != 2) {
            return null;
        }
        return kFaceDataType_2D_Video;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10206x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC2972xeb1eefa1 m22415xdce0328(int i17) {
        return m22414x382ad972(i17);
    }
}
