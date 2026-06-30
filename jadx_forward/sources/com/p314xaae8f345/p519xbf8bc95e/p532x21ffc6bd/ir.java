package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ir extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im {

    /* renamed from: i, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f131456i = null;

    /* renamed from: j, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f131457j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f131458k;

    public ir(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this.f131457j = null;
        this.f131458k = false;
        if (c4247x704e24df != null) {
            this.f131457j = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
            this.f131458k = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final void a(float f17, android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f131457j;
        if (c4247x704e24df == null || this.f131456i == null) {
            return;
        }
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3() - this.f131456i.m35331xbc3301f3();
        int m35332x962aa94a = this.f131457j.m35332x962aa94a() - this.f131456i.m35332x962aa94a();
        float interpolation = interpolator.getInterpolation(f17);
        int m35331xbc3301f32 = this.f131456i.m35331xbc3301f3() + ((int) (m35331xbc3301f3 * interpolation));
        int m35332x962aa94a2 = this.f131456i.m35332x962aa94a() + ((int) (m35332x962aa94a * interpolation));
        if (1.0f - f17 < 1.0E-4d) {
            m35331xbc3301f32 = this.f131457j.m35331xbc3301f3();
            m35332x962aa94a2 = this.f131457j.m35332x962aa94a();
        }
        com.tencent.mapsdk.internal.im.b bVar = this.f131443h;
        if (bVar != null) {
            bVar.a(m35331xbc3301f32, m35332x962aa94a2);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.im
    public final boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (!super.a((com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null, (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df) null)) {
            return false;
        }
        if (c4247x704e24df != null) {
            this.f131456i = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
        }
        if (this.f131458k || c4247x704e24df2 == null) {
            return true;
        }
        this.f131457j = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df2.m35332x962aa94a());
        return true;
    }
}
