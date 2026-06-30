package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class ud extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f229032d;

    /* renamed from: e, reason: collision with root package name */
    public ym5.w1 f229033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b O6() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ued);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f229033e != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b O6 = O6();
            boolean z17 = false;
            if (O6 != null && O6.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b O62 = O6();
                if (O62 != null) {
                    O62.n();
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b O63 = O6();
                if (O63 != null) {
                    O63.i(this.f229033e);
                }
            }
        }
        this.f229033e = null;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a.a(this.f229032d);
        this.f229032d = null;
    }
}
