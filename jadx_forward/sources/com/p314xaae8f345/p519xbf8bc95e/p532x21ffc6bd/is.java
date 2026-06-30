package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class is extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ib {

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f131459g;

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f131460h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f131461i = false;

    private is(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        this.f131459g = null;
        this.f131460h = null;
        if (c4247x704e24df != null) {
            this.f131459g = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a());
        }
        if (c4247x704e24df2 != null) {
            this.f131460h = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(c4247x704e24df2.m35331xbc3301f3(), c4247x704e24df2.m35332x962aa94a());
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ib
    public final void a(float f17) {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f131460h;
        if (c4247x704e24df == null || this.f131459g == null) {
            return;
        }
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3() - this.f131459g.m35331xbc3301f3();
        int m35332x962aa94a = this.f131460h.m35332x962aa94a() - this.f131459g.m35332x962aa94a();
        int m35331xbc3301f32 = this.f131459g.m35331xbc3301f3() + ((int) (m35331xbc3301f3 * f17));
        int m35332x962aa94a2 = this.f131459g.m35332x962aa94a() + ((int) (m35332x962aa94a * f17));
        if (this.f131407f != null) {
            new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(m35331xbc3301f32, m35332x962aa94a2);
        }
    }
}
