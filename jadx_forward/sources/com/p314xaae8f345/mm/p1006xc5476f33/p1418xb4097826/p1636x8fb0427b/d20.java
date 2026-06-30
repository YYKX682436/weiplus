package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes5.dex */
public final class d20 extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f208154u;

    public d20() {
        super(259200, "视频url过期时长（秒）", null, null, 12, null);
        this.f208154u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (this.f208154u == -1) {
            this.f208154u = ((java.lang.Number) super.r()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFakeConfig", "KEEP_URL_VALID_TIME=" + this.f208154u);
        }
        return java.lang.Integer.valueOf(this.f208154u);
    }
}
