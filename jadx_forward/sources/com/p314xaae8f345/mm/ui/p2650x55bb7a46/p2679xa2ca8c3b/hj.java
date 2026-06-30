package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class hj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f285653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f285654i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285655m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f285656n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f285657o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285658p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f285659q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f285661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285662t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285663u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f285664v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285665w;

    public hj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, int i27, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i28, java.lang.String str5, int i29, java.lang.String str6, java.lang.String str7, int i37) {
        this.f285665w = c21908xb66fd105;
        this.f285649d = str;
        this.f285650e = str2;
        this.f285651f = map;
        this.f285652g = str3;
        this.f285653h = i17;
        this.f285654i = i18;
        this.f285655m = str4;
        this.f285656n = i19;
        this.f285657o = i27;
        this.f285658p = f9Var;
        this.f285659q = i28;
        this.f285660r = str5;
        this.f285661s = i29;
        this.f285662t = str6;
        this.f285663u = str7;
        this.f285664v = i37;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.lang.String str = this.f285649d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) clickArea click", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f285439b);
        sb6.append(":");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285665w;
        sb6.append(c21908xb66fd105.f284708s.x());
        sb6.append(":");
        java.lang.String str2 = this.f285650e;
        sb6.append(str2);
        c12559xbdae8559.f169324g = sb6.toString();
        java.lang.String str3 = this.f285652g + ".ecs_jump_info";
        java.util.Map map = this.f285651f;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str4 == null) {
            str4 = "";
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f285439b)) {
                c12559xbdae8559.f169323f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.d0(str2);
                l81.b1 b1Var = new l81.b1();
                b1Var.f398545a = str;
                b1Var.f398549c = this.f285653h;
                b1Var.f398551d = this.f285654i;
                b1Var.f398555f = this.f285655m;
                int i17 = this.f285656n;
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
                this.f285665w.i1(erVar.f285439b, this.f285649d, this.f285653h, this.f285654i, this.f285655m, c12559xbdae8559);
            }
        } else {
            c21908xb66fd105.b(str4, "ecs_jump_info_template_msg");
        }
        int i18 = this.f285657o;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f285658p;
        if (i18 == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ar.f284938a.a(f9Var, java.lang.Integer.valueOf(this.f285659q));
        }
        tb5.a.f498558a.b(6, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y, 1L);
        c21908xb66fd105.u0(9, c21908xb66fd105.I, c21908xb66fd105.H);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str5 = c21908xb66fd105.H;
        java.lang.String str6 = this.f285660r;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f285661s);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c21908xb66fd105.P);
        java.lang.String str7 = c21908xb66fd105.N;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(map));
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
        j31.c cVar = c21908xb66fd105.X;
        java.lang.String str8 = cVar.f378907f;
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
        j31.c cVar2 = c21908xb66fd105.X;
        g0Var.d(11608, str5, str6, valueOf, valueOf2, str7, valueOf3, valueOf4, str8, valueOf5, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        this.f285665w.p1(5, this.f285651f, this.f285662t, "", this.f285663u);
        c21908xb66fd105.s1(3, c21908xb66fd105.f284708s.x(), str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.e0(c21908xb66fd105, erVar, map);
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt" + (this.f285664v + 1));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$56", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
