package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class uj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f192346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f192347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f192348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f192349g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f192350h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f192351i;

    public uj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar, boolean z17, in5.s0 s0Var, int i17, yz5.a aVar) {
        this.f192346d = c14989xf862ae88;
        this.f192347e = xjVar;
        this.f192348f = z17;
        this.f192349g = s0Var;
        this.f192350h = i17;
        this.f192351i = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f192347e.f192605a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int i17 = this.f192348f ? 1 : 2;
        long mo2128x1ed62e84 = ((so2.j5) this.f192349g.f374658i).mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feedData = this.f192346d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "card_continue_play_button");
        if (V6 == null || (str = V6.m75945x2fec8307(2)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str);
        if (V6 == null || (str2 = V6.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        lVarArr[2] = new jz5.l("finder_context_id", str2);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : "");
        lVarArr[4] = new jz5.l("feedid", pm0.v.u(feedData.m59127x5db1b11()));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(i17));
        lVarArr[6] = new jz5.l("last_completed_feedid", pm0.v.u(mo2128x1ed62e84));
        lVarArr[7] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(this.f192350h));
        java.lang.String sessionBuffer = feedData.getSessionBuffer();
        lVarArr[8] = new jz5.l("session_buffer", sessionBuffer != null ? sessionBuffer : "");
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
        this.f192351i.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
