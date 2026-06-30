package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes5.dex */
public enum x implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kIlinkStreamStateOK(0),
    kIlinkStreamStateNotExist(1),
    kIlinkStreamStateEnding(2),
    kIlinkStreamStateFragmentTooLarge(3),
    kIlinkStreamStateError(100),
    kIlinkStreamStateCancel(101),
    kIlinkStreamStateDataSyncError(102),
    kIlinkStreamStateDataLostError(103),
    kIlinkStreamStateAccountChanged(104),
    kIlinkStreamStateServerAbort(400);


    /* renamed from: d, reason: collision with root package name */
    public final int f298875d;

    x(int i17) {
        this.f298875d = i17;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f298875d;
    }
}
