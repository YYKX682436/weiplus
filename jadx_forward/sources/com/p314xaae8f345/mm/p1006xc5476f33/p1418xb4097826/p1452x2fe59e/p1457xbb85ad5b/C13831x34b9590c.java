package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1457xbb85ad5b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/jumper/FinderWeAppHalfScreenHTListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.jumper.FinderWeAppHalfScreenHTListener */
/* loaded from: classes8.dex */
public final class C13831x34b9590c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f188669e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f188670f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f188671g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f188672h;

    /* renamed from: i, reason: collision with root package name */
    public final int f188673i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f188674m = "";

    public C13831x34b9590c(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17) {
        this.f188669e = l17;
        this.f188670f = str;
        this.f188671g = str2;
        this.f188672h = num;
        this.f188673i = i17;
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1457xbb85ad5b.C13831x34b9590c c13831x34b9590c, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            map = null;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.Long l17 = c13831x34b9590c.f188669e;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        lVarArr[1] = new jz5.l("trigger_source_type", java.lang.Integer.valueOf(c13831x34b9590c.f188673i));
        lVarArr[2] = new jz5.l("finder_context_id", c13831x34b9590c.f188670f);
        lVarArr[3] = new jz5.l("finder_tab_context_id", c13831x34b9590c.f188671g);
        lVarArr[4] = new jz5.l("comment_scene", c13831x34b9590c.f188672h);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        if (map != null) {
            k17 = kz5.c1.m(k17, map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, k17, 25496);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b
    public void c() {
        e(this, this.f188674m, "view_clk", null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b
    public void d() {
        e(this, this.f188674m, "view_exp", null, 4, null);
    }
}
