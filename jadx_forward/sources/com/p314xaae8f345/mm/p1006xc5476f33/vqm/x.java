package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes6.dex */
public enum x implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VQMProfileInfoNotificationSettingNull(0),
    VQMProfileInfoNotificationSettingNotSupport(10000),
    VQMProfileInfoNotificationSettingDisabled(10001),
    VQMProfileInfoNotificationSettingEnabled(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f259048d;

    x(int i17) {
        this.f259048d = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.vqm.x a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoNotificationSettingNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoNotificationSettingNotSupport;
            case 10001:
                return VQMProfileInfoNotificationSettingDisabled;
            case 10002:
                return VQMProfileInfoNotificationSettingEnabled;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f259048d;
    }
}
