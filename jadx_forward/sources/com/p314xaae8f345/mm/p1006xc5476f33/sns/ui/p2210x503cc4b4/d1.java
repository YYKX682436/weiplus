package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class d1 implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ed4 f251302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f251303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f251304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.e1 f251305d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.e1 e1Var, r45.ed4 ed4Var, android.content.Intent intent, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f251305d = e1Var;
        this.f251302a = ed4Var;
        this.f251303b = intent;
        this.f251304c = c19807x593d1720;
    }

    @Override // zy2.r9
    public void a(zy2.p9 p9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7$1");
        zy2.p9 p9Var2 = zy2.p9.f559061d;
        r45.ed4 ed4Var = this.f251302a;
        boolean z17 = true;
        if (p9Var == p9Var2) {
            z17 = true ^ com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ed4Var.f454849i);
        } else if (p9Var == zy2.p9.f559062e) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.e1 e1Var = this.f251305d;
        android.content.Intent intent = this.f251303b;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = e1Var.f251308d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            int i17 = iVar.U;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            intent.putExtra("rawUrl", i17 == 0 ? java.lang.String.format(o45.yf.f424570a, ed4Var.f454849i) : java.lang.String.format(o45.yf.f424571b, ed4Var.f454849i, this.f251304c.Id));
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(e1Var.f251308d));
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", ed4Var.f454845e);
            intent.putExtra("kwebmap_lng", ed4Var.f454844d);
            intent.putExtra("kPoiName", ed4Var.f454847g);
            intent.putExtra("Kwebmap_locaion", ed4Var.f454848h);
            j45.l.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(e1Var.f251308d), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$7$1");
    }
}
