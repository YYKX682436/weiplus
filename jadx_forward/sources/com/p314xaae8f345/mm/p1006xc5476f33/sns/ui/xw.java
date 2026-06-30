package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xw implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f253120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f253121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f253123d;

    public xw(r45.f96 f96Var, android.content.Intent intent, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f253120a = f96Var;
        this.f253121b = intent;
        this.f253122c = context;
        this.f253123d = c19807x593d1720;
    }

    @Override // zy2.r9
    public void a(zy2.p9 p9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
        zy2.p9 p9Var2 = zy2.p9.f559061d;
        r45.f96 f96Var = this.f253120a;
        boolean z17 = p9Var == p9Var2 ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f96Var.m75945x2fec8307(5)) : p9Var != zy2.p9.f559062e;
        android.content.Context context = this.f253122c;
        android.content.Intent intent = this.f253121b;
        if (z17) {
            intent.putExtra("rawUrl", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPOICommentFeedNewUrlSwitch"), 0) == 0 ? java.lang.String.format(o45.yf.f424570a, f96Var.m75945x2fec8307(5)) : java.lang.String.format(o45.yf.f424571b, f96Var.m75945x2fec8307(5), this.f253123d.Id));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, context);
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", f96Var.m75938x746dc8a6(1));
            intent.putExtra("kwebmap_lng", f96Var.m75938x746dc8a6(0));
            intent.putExtra("kPoiName", f96Var.m75945x2fec8307(3));
            intent.putExtra("Kwebmap_locaion", f96Var.m75945x2fec8307(4));
            j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$1");
    }
}
