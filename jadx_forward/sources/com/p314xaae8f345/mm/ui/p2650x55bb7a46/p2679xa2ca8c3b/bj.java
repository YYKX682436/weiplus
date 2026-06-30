package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class bj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285021h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f285022i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285024n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285025o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285026p;

    public bj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, java.lang.String str4, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f285026p = c21908xb66fd105;
        this.f285017d = str;
        this.f285018e = str2;
        this.f285019f = i17;
        this.f285020g = i18;
        this.f285021h = str3;
        this.f285022i = i19;
        this.f285023m = str4;
        this.f285024n = map;
        this.f285025o = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.lang.String str = this.f285017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) tplButton2 click", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f285439b);
        sb6.append(":");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285026p;
        sb6.append(c21908xb66fd105.f284708s.x());
        sb6.append(":");
        java.lang.String str2 = this.f285018e;
        sb6.append(str2);
        c12559xbdae8559.f169324g = sb6.toString();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f285439b)) {
            c12559xbdae8559.f169323f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.d0(str2);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = str;
            b1Var.f398549c = this.f285019f;
            b1Var.f398551d = this.f285020g;
            b1Var.f398555f = this.f285021h;
            int i17 = this.f285022i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "weappUseTransparentBackground:%d", java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                b1Var.H = k91.z3.TRANSPARENT;
                k91.y3 y3Var = k91.y3.DISABLED;
                b1Var.S = y3Var;
                b1Var.T = y3Var;
            }
            b1Var.a(c12559xbdae8559);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(c21908xb66fd105.f284708s.g(), b1Var);
        } else {
            c12559xbdae8559.f169323f = 1043;
            this.f285026p.i1(erVar.f285439b, this.f285017d, this.f285019f, this.f285020g, this.f285021h, c12559xbdae8559);
        }
        c21908xb66fd105.u0(9, c21908xb66fd105.I, c21908xb66fd105.H);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str3 = c21908xb66fd105.H;
        java.lang.String str4 = this.f285023m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
        java.lang.String str5 = c21908xb66fd105.N;
        java.util.Map map = this.f285024n;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(map));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
        j31.c cVar = c21908xb66fd105.X;
        java.lang.String str6 = cVar.f378907f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
        j31.c cVar2 = c21908xb66fd105.X;
        g0Var.d(11608, str3, str4, 2, valueOf, str5, valueOf2, valueOf3, str6, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 7, erVar.c());
        tb5.a.f498558a.b(6, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y, 1L);
        yb5.d dVar = c21908xb66fd105.f284708s;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285025o;
        tb5.o0.c(dVar, f9Var, map, 3);
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt2");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$52", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
