package com.tencent.mm.plugin.finder.feed.jumper;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/jumper/FinderWeAppHalfScreenHTListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenHeaderTipsListener;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderWeAppHalfScreenHTListener extends com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f107136e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f107137f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f107138g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f107139h;

    /* renamed from: i, reason: collision with root package name */
    public final int f107140i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f107141m = "";

    public FinderWeAppHalfScreenHTListener(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17) {
        this.f107136e = l17;
        this.f107137f = str;
        this.f107138g = str2;
        this.f107139h = num;
        this.f107140i = i17;
    }

    public static void e(com.tencent.mm.plugin.finder.feed.jumper.FinderWeAppHalfScreenHTListener finderWeAppHalfScreenHTListener, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            map = null;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        java.lang.Long l17 = finderWeAppHalfScreenHTListener.f107136e;
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(l17 != null ? l17.longValue() : 0L));
        lVarArr[1] = new jz5.l("trigger_source_type", java.lang.Integer.valueOf(finderWeAppHalfScreenHTListener.f107140i));
        lVarArr[2] = new jz5.l("finder_context_id", finderWeAppHalfScreenHTListener.f107137f);
        lVarArr[3] = new jz5.l("finder_tab_context_id", finderWeAppHalfScreenHTListener.f107138g);
        lVarArr[4] = new jz5.l("comment_scene", finderWeAppHalfScreenHTListener.f107139h);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        if (map != null) {
            k17 = kz5.c1.m(k17, map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, k17, 25496);
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener
    public void c() {
        e(this, this.f107141m, "view_clk", null, 4, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener
    public void d() {
        e(this, this.f107141m, "view_exp", null, 4, null);
    }
}
