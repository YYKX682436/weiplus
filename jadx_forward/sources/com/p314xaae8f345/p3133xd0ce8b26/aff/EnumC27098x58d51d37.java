package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkDeviceSessionType */
/* loaded from: classes.dex */
public enum EnumC27098x58d51d37 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkDeviceAuth(0),
    kIlinkDeviceGetSession(1);


    /* renamed from: kIlinkDeviceAuth_VALUE */
    public static final int f59116x19044548 = 0;

    /* renamed from: kIlinkDeviceGetSession_VALUE */
    public static final int f59118x8a920980 = 1;

    /* renamed from: value */
    public final int f59119x6ac9171;

    EnumC27098x58d51d37(int i17) {
        this.f59119x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27098x58d51d37 m110267x382ad972(int i17) {
        if (i17 == 0) {
            return kIlinkDeviceAuth;
        }
        if (i17 != 1) {
            return null;
        }
        return kIlinkDeviceGetSession;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f59119x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27098x58d51d37 m110268xdce0328(int i17) {
        return m110267x382ad972(i17);
    }
}
