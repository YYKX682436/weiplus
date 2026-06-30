package com.p314xaae8f345.p342x5fa53e3.p343x2ddda8;

/* renamed from: com.tencent.ilink.auth.LiveActionType */
/* loaded from: classes4.dex */
public enum EnumC3007x10e598bc implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ENUM_EYE_BLINK(0),
    ENUM_HEAD_SHAKE(1),
    ENUM_MOUTH_OPEN(2);


    /* renamed from: ENUM_EYE_BLINK_VALUE */
    public static final int f10502x34faf222 = 0;

    /* renamed from: ENUM_HEAD_SHAKE_VALUE */
    public static final int f10504x8165ba57 = 1;

    /* renamed from: ENUM_MOUTH_OPEN_VALUE */
    public static final int f10506xded8532 = 2;

    /* renamed from: value */
    public final int f10507x6ac9171;

    EnumC3007x10e598bc(int i17) {
        this.f10507x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc m22941x382ad972(int i17) {
        if (i17 == 0) {
            return ENUM_EYE_BLINK;
        }
        if (i17 == 1) {
            return ENUM_HEAD_SHAKE;
        }
        if (i17 != 2) {
            return null;
        }
        return ENUM_MOUTH_OPEN;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10507x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p343x2ddda8.EnumC3007x10e598bc m22942xdce0328(int i17) {
        return m22941x382ad972(i17);
    }
}
