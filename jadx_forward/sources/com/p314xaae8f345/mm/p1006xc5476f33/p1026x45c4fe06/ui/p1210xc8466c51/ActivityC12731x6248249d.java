package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareLandscapeUI;", "Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareLandscapeUI */
/* loaded from: classes7.dex */
public final class ActivityC12731x6248249d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6
    public int W6(int i17) {
        double d17;
        double d18;
        if (i17 == com.p314xaae8f345.mm.R.C30864xbddafb2a.f569566ey) {
            d17 = getResources().getDisplayMetrics().heightPixels;
            d18 = 0.92d;
        } else {
            if (i17 != com.p314xaae8f345.mm.R.C30864xbddafb2a.f569567ez) {
                return 0;
            }
            d17 = getResources().getDisplayMetrics().heightPixels;
            d18 = 0.82d;
        }
        return (int) (d17 * d18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6
    public double X6() {
        return 0.52d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        setRequestedOrientation(0);
    }
}
