package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f200893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200894e;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, android.content.Context context) {
        this.f200893d = d6Var;
        this.f200894e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.en6 en6Var;
        r45.en6 en6Var2;
        r45.en6 en6Var3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f200893d;
        r45.yq1 yq1Var = d6Var.f199601j;
        java.lang.String m75945x2fec8307 = (yq1Var == null || (en6Var3 = (r45.en6) yq1Var.m75936x14adae67(1)) == null) ? null : en6Var3.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            l81.b1 b1Var = new l81.b1();
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = this.f200894e;
            r45.yq1 yq1Var2 = d6Var.f199601j;
            if (yq1Var2 == null || (en6Var = (r45.en6) yq1Var2.m75936x14adae67(1)) == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) en6Var.m75936x14adae67(2)) == null) {
                c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
            }
            c61.yb.nd(ybVar, context, c19786x6a1e2862, b1Var, 0, null, 24, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            r45.yq1 yq1Var3 = d6Var.f199601j;
            intent.putExtra("rawUrl", (yq1Var3 == null || (en6Var2 = (r45.en6) yq1Var3.m75936x14adae67(1)) == null) ? null : en6Var2.m75945x2fec8307(0));
            j45.l.j(this.f200894e, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        if (d6Var.g()) {
            r45.xq1 xq1Var = ((mm2.c1) d6Var.f199594c.S0().a(mm2.c1.class)).C2;
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.A1;
            cl0.g gVar = new cl0.g();
            gVar.o("result", 3);
            gVar.h("appid", xq1Var != null ? xq1Var.m75945x2fec8307(2) : null);
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.a83 a83Var = ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410361j6;
            gVar.o("game_type", r4Var.j3(a83Var != null ? a83Var.m75939xb282bd08(2) : 0));
            zy2.zb.y6(zbVar, z4Var, gVar.toString(), null, 4, null);
        } else {
            r45.n73 n73Var = (r45.n73) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) d6Var.f199594c.P0(mm2.g1.class)).f410604i).mo144003x754a37bb();
            r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.m75936x14adae67(1) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("result", 3);
            gVar2.h("appid", z53Var != null ? z53Var.m75945x2fec8307(0) : null);
            gVar2.o("game_type", 2 - (z53Var != null ? z53Var.m75939xb282bd08(13) : 0));
            x2Var.c(22, gVar2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorGameTogetherWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
