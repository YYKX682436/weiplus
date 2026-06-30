package com.tencent.mm.plugin.appbrand.ui.record;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareLandscapeUI;", "Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WAGameRecordShareLandscapeUI extends com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI {
    @Override // com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI
    public int W6(int i17) {
        double d17;
        double d18;
        if (i17 == com.tencent.mm.R.layout.f488033ey) {
            d17 = getResources().getDisplayMetrics().heightPixels;
            d18 = 0.92d;
        } else {
            if (i17 != com.tencent.mm.R.layout.f488034ez) {
                return 0;
            }
            d17 = getResources().getDisplayMetrics().heightPixels;
            d18 = 0.82d;
        }
        return (int) (d17 * d18);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI
    public double X6() {
        return 0.52d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        setRequestedOrientation(0);
    }
}
