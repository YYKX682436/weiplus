package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkEBizScene */
/* loaded from: classes6.dex */
public enum EnumC3054x8a36563b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kC2CScene(0),
    kAppScene(2);


    /* renamed from: kAppScene_VALUE */
    public static final int f11031x52af048 = 2;

    /* renamed from: kC2CScene_VALUE */
    public static final int f11033xaaf0de95 = 0;

    /* renamed from: value */
    public final int f11034x6ac9171;

    EnumC3054x8a36563b(int i17) {
        this.f11034x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b m24264x382ad972(int i17) {
        if (i17 == 0) {
            return kC2CScene;
        }
        if (i17 != 2) {
            return null;
        }
        return kAppScene;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f11034x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3054x8a36563b m24265xdce0328(int i17) {
        return m24264x382ad972(i17);
    }
}
