package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkContentType */
/* loaded from: classes6.dex */
public enum EnumC27094xdee5af90 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkContentTypeDefault(0),
    kIlinkContentTypeProtobuf(1),
    kIlinkContentTypeJson(2);


    /* renamed from: kIlinkContentTypeDefault_VALUE */
    public static final int f59086xab626398 = 0;

    /* renamed from: kIlinkContentTypeJson_VALUE */
    public static final int f59088xf4dcf395 = 2;

    /* renamed from: kIlinkContentTypeProtobuf_VALUE */
    public static final int f59090x2c752678 = 1;

    /* renamed from: value */
    public final int f59091x6ac9171;

    EnumC27094xdee5af90(int i17) {
        this.f59091x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 m110209x382ad972(int i17) {
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
        return this.f59091x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27094xdee5af90 m110210xdce0328(int i17) {
        return m110209x382ad972(i17);
    }
}
