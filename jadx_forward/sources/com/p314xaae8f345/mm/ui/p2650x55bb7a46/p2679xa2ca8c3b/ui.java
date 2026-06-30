package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ui implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as f287226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f287227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287228g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287230i;

    public ui(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar, boolean z17, java.util.Map map, java.lang.String str) {
        this.f287230i = c21908xb66fd105;
        this.f287225d = f9Var;
        this.f287226e = asVar;
        this.f287227f = z17;
        this.f287228g = map;
        this.f287229h = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        c01.d9.e().q(1176, this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar = this.f287226e;
        java.lang.Object tag = asVar.S.getTag(com.p314xaae8f345.mm.R.id.k7s);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287225d;
        if (f9Var != tag) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "item msg(%s) has changed.", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return;
        }
        java.lang.String str2 = this.f287229h;
        boolean z17 = this.f287227f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287230i;
        if (i17 == 0 && i18 == 0) {
            e31.k kVar = c21908xb66fd105.M;
            if (kVar != null) {
                kVar.f(str2, !z17);
                return;
            }
            return;
        }
        c21908xb66fd105.v1(asVar, z17 ? 8 : 0, this.f287228g);
        db5.t7.m123882x26a183b(c21908xb66fd105.f284708s.g(), com.p314xaae8f345.mm.R.C30867xcad56011.f574185hd0, 0).show();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
        am.g00 g00Var = c6210x3f282433.f136460g;
        g00Var.f88257a = str2;
        g00Var.f88258b = z17 ? 2 : 1;
        g00Var.f88259c = 1;
        c6210x3f282433.e();
        yb5.d dVar = c21908xb66fd105.f284708s;
        if (dVar != null) {
            dVar.J();
        }
    }
}
