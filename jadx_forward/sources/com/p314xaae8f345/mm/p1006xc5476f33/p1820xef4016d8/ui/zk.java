package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class zk extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.wv3 f229318d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f229319e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f229320f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 f229321g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f229322h;

    /* renamed from: i, reason: collision with root package name */
    public ym5.w1 f229323i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f229323i != null) {
            com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f229321g;
            boolean z17 = false;
            if (c10389xffc30b0 != null && c10389xffc30b0.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b02 = this.f229321g;
                if (c10389xffc30b02 != null) {
                    c10389xffc30b02.n();
                }
                com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b03 = this.f229321g;
                if (c10389xffc30b03 != null) {
                    c10389xffc30b03.i(this.f229323i);
                }
            }
        }
        this.f229321g = null;
        this.f229323i = null;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.f295574a.a(this.f229322h);
        this.f229322h = null;
    }
}
