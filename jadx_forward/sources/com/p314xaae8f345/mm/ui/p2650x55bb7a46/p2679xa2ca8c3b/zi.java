package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f287682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f287683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f287685i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287687n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287688o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287689p;

    public zi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, int i19, java.util.Map map, java.lang.String str4, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f287689p = c21908xb66fd105;
        this.f287680d = str;
        this.f287681e = str2;
        this.f287682f = i17;
        this.f287683g = i18;
        this.f287684h = str3;
        this.f287685i = i19;
        this.f287686m = map;
        this.f287687n = str4;
        this.f287688o = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.Map map;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        java.lang.String str = this.f287680d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) tplButton1 click", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(erVar.c().I0());
        sb6.append(":");
        sb6.append(erVar.f285439b);
        sb6.append(":");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287689p;
        sb6.append(c21908xb66fd105.f284708s.x());
        sb6.append(":");
        java.lang.String str2 = this.f287681e;
        sb6.append(str2);
        c12559xbdae8559.f169324g = sb6.toString();
        boolean Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f285439b);
        java.util.Map map2 = this.f287686m;
        if (Bi) {
            c12559xbdae8559.f169323f = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.d0(str2);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398545a = str;
            b1Var.f398549c = this.f287682f;
            b1Var.f398551d = this.f287683g;
            b1Var.f398555f = this.f287684h;
            int i17 = this.f287685i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "weappUseTransparentBackground:%d", java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                b1Var.H = k91.z3.TRANSPARENT;
                k91.y3 y3Var = k91.y3.DISABLED;
                b1Var.S = y3Var;
                b1Var.T = y3Var;
            }
            b1Var.a(c12559xbdae8559);
            final java.lang.String str3 = (java.lang.String) map2.get(".msg.appmsg.mmreader.template_detail.template_ext.native_extra_data");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            if (!android.text.TextUtils.isEmpty(str3)) {
                b1Var.f398561i = new l81.p0() { // from class: com.tencent.mm.ui.chatting.viewitems.zi$$a
                    @Override // l81.p0
                    public final java.lang.String a() {
                        return str3;
                    }
                };
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(c21908xb66fd105.f284708s.g(), b1Var);
            map = map2;
        } else {
            c12559xbdae8559.f169323f = 1043;
            map = map2;
            this.f287689p.i1(erVar.f285439b, this.f287680d, this.f287682f, this.f287683g, this.f287684h, c12559xbdae8559);
        }
        c21908xb66fd105.u0(9, c21908xb66fd105.I, c21908xb66fd105.H);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.String str4 = c21908xb66fd105.H;
        java.lang.String str5 = this.f287687n;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c21908xb66fd105.P);
        java.lang.String str6 = c21908xb66fd105.N;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.Y0(map));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(c21908xb66fd105.W0());
        j31.c cVar = c21908xb66fd105.X;
        java.lang.String str7 = cVar.f378907f;
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(c21908xb66fd105.F1(cVar.f378908g));
        j31.c cVar2 = c21908xb66fd105.X;
        g0Var.d(11608, str4, str5, 1, valueOf, str6, valueOf2, valueOf3, str7, valueOf4, cVar2.f378909h, cVar2.f378913l, java.lang.Integer.valueOf(c21908xb66fd105.b1()));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 7, erVar.c());
        tb5.a.f498558a.b(6, c21908xb66fd105.X, c21908xb66fd105.f284708s.x(), c21908xb66fd105.Y, 1L);
        yb5.d dVar = c21908xb66fd105.f284708s;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287688o;
        tb5.o0.c(dVar, f9Var, map, 3);
        c21908xb66fd105.s1(3, c21908xb66fd105.f284708s.x(), "");
        if (f9Var.B2()) {
            ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_template_bt1");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$50", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
