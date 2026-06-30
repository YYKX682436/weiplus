package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkContentType */
/* loaded from: classes6.dex */
public enum EnumC3048xdee5af90 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkContentTypeDefault(0),
    kIlinkContentTypeProtobuf(1),
    kIlinkContentTypeJson(2);


    /* renamed from: kIlinkContentTypeDefault_VALUE */
    public static final int f10991xab626398 = 0;

    /* renamed from: kIlinkContentTypeJson_VALUE */
    public static final int f10993xf4dcf395 = 2;

    /* renamed from: kIlinkContentTypeProtobuf_VALUE */
    public static final int f10995x2c752678 = 1;

    /* renamed from: value */
    public final int f10996x6ac9171;

    EnumC3048xdee5af90(int i17) {
        this.f10996x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 m24194x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkContentTypeDefault;
        }
        if (i17 == 1) {
            return kIlinkContentTypeProtobuf;
        }
        if (i17 != 2) {
            return null;
        }
        return kIlinkContentTypeJson;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f10996x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3048xdee5af90 m24195xdce0328(int i17) {
        return m24194x382ad972(i17);
    }
}
