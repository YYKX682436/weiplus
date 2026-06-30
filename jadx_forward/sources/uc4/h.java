package uc4;

/* loaded from: classes4.dex */
public final class h implements zy2.r9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f507946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f507947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc4.i f507948c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f507949d;

    public h(r45.f96 f96Var, android.content.Intent intent, uc4.i iVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f507946a = f96Var;
        this.f507947b = intent;
        this.f507948c = iVar;
        this.f507949d = c19807x593d1720;
    }

    @Override // zy2.r9
    public void a(zy2.p9 type) {
        java.lang.String format;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        zy2.p9 p9Var = zy2.p9.f559061d;
        r45.f96 f96Var = this.f507946a;
        boolean z17 = type == p9Var ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f96Var.m75945x2fec8307(5)) : type != zy2.p9.f559062e;
        uc4.i iVar = this.f507948c;
        android.content.Intent intent = this.f507947b;
        if (z17) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsPOICommentFeedNewUrlSwitch"), 0) == 0) {
                java.lang.String MM_NEAR_LIFE_URI = o45.yf.f424570a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
                format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.m75945x2fec8307(5)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            } else {
                java.lang.String MM_NEAR_LIFE_URI_DETAIL = o45.yf.f424571b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MM_NEAR_LIFE_URI_DETAIL, "MM_NEAR_LIFE_URI_DETAIL");
                format = java.lang.String.format(MM_NEAR_LIFE_URI_DETAIL, java.util.Arrays.copyOf(new java.lang.Object[]{f96Var.m75945x2fec8307(5), this.f507949d.Id}, 2));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            }
            intent.putExtra("rawUrl", format);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, iVar.b());
        } else {
            intent.putExtra("map_view_type", 7);
            intent.putExtra("kwebmap_slat", f96Var.m75938x746dc8a6(1));
            intent.putExtra("kwebmap_lng", f96Var.m75938x746dc8a6(0));
            intent.putExtra("kPoiName", f96Var.m75945x2fec8307(3));
            intent.putExtra("Kwebmap_locaion", f96Var.m75945x2fec8307(4));
            j45.l.j(iVar.b(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPoiRedirect", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAddressClick$click$1");
    }
}
