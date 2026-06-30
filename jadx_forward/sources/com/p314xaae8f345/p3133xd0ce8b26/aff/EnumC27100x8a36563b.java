package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkEBizScene */
/* loaded from: classes6.dex */
public enum EnumC27100x8a36563b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    kC2CScene(0),
    kAppScene(2);


    /* renamed from: kAppScene_VALUE */
    public static final int f59126x52af048 = 2;

    /* renamed from: kC2CScene_VALUE */
    public static final int f59128xaaf0de95 = 0;

    /* renamed from: value */
    public final int f59129x6ac9171;

    EnumC27100x8a36563b(int i17) {
        this.f59129x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27100x8a36563b m110279x382ad972(int i17) {
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
        return this.f59129x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.EnumC27100x8a36563b m110280xdce0328(int i17) {
        return m110279x382ad972(i17);
    }
}
