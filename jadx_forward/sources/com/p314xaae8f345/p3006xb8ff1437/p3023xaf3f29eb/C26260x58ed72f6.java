package com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.common.TPPlayerInfoGetterImpl */
/* loaded from: classes16.dex */
public class C26260x58ed72f6 implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf {
    private static final java.lang.String TAG = "TPPlayerInfoGetterImpl";

    /* renamed from: mPlayerBase */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 f51395x5915b59f;

    public C26260x58ed72f6(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7) {
        this.f51395x5915b59f = interfaceC26139x4d493b7;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf
    /* renamed from: getDynamicStatisticParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo101567x55ab8bad(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f51395x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "playerBase is null, return default dynamic statistic params");
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653 mo100401x55ab8bad = interfaceC26139x4d493b7.mo100401x55ab8bad(z17);
        if (mo100401x55ab8bad != null) {
            return mo100401x55ab8bad;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "cannot get params from core, return default dynamic statistic params");
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26404xfb288653();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.api.InterfaceC26550x996747bf
    /* renamed from: getGeneralPlayFlowParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo101568xc0f8b3fa() {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.InterfaceC26139x4d493b7 interfaceC26139x4d493b7 = this.f51395x5915b59f;
        if (interfaceC26139x4d493b7 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "playerBase is null, return default general play flow params");
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94 mo100402xc0f8b3fa = interfaceC26139x4d493b7.mo100402xc0f8b3fa();
        if (mo100402xc0f8b3fa != null) {
            return mo100402xc0f8b3fa;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "cannot get params from core, return default general play flow params");
        return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94();
    }
}
