package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes.dex */
public final class d extends a24.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // a24.l
    public in5.s T6() {
        return new in5.s() { // from class: com.tencent.mm.plugin.setting.ui.setting_new.uic.PrefSettingListUIC$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                boolean z17 = true;
                if (type == 1) {
                    return new t24.r();
                }
                if (type == 2) {
                    return new t24.y();
                }
                if (type == 5) {
                    return new t24.d();
                }
                if (type == 6) {
                    return new t24.a();
                }
                if (type == 7) {
                    return new t24.c();
                }
                int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
                    z17 = false;
                }
                if (z17) {
                    throw new java.lang.IllegalArgumentException("MicroMsg.SettingListUIC buildItemCoverts is error. msg:other type");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingListUIC", "buildItemCoverts is error. msg:other type");
                return new in5.r();
            }
        };
    }

    @Override // a24.l, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.c(this));
    }
}
