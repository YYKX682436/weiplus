package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes6.dex */
public enum q implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    VQMProfileInfoMatrixBatteryStateNull(0),
    VQMProfileInfoMatrixBatteryStateUnplugged(10001),
    VQMProfileInfoMatrixBatteryStateCharging(10002),
    VQMProfileInfoMatrixBatteryStateFull(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6);


    /* renamed from: d, reason: collision with root package name */
    public final int f258982d;

    q(int i17) {
        this.f258982d = i17;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.vqm.q a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoMatrixBatteryStateNull;
        }
        switch (i17) {
            case 10001:
                return VQMProfileInfoMatrixBatteryStateUnplugged;
            case 10002:
                return VQMProfileInfoMatrixBatteryStateCharging;
            case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                return VQMProfileInfoMatrixBatteryStateFull;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f258982d;
    }
}
