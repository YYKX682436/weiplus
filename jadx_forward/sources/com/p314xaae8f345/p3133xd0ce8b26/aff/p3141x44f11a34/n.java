package com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34;

/* loaded from: classes6.dex */
public enum n implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    ExtDeviceSync_Unknow(-1),
    ExtDeviceSync_Idle(0),
    ExtDeviceSync_Syncing(1),
    ExtDeviceSync_Success(2),
    ExtDeviceSync_Failed(3),
    ExtDeviceSync_OverTime(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f298243d;

    n(int i17) {
        this.f298243d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.n a(int i17) {
        if (i17 == -1) {
            return ExtDeviceSync_Unknow;
        }
        if (i17 == 0) {
            return ExtDeviceSync_Idle;
        }
        if (i17 == 1) {
            return ExtDeviceSync_Syncing;
        }
        if (i17 == 2) {
            return ExtDeviceSync_Success;
        }
        if (i17 == 3) {
            return ExtDeviceSync_Failed;
        }
        if (i17 != 4) {
            return null;
        }
        return ExtDeviceSync_OverTime;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f298243d;
    }
}
