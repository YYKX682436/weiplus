package tc4;

/* loaded from: classes4.dex */
public final class j3 extends tc4.k2 {
    public static final /* synthetic */ int F1 = 0;
    public android.widget.TextView A1;
    public android.widget.TextView B1;
    public final int C1;
    public boolean D1;
    public java.lang.String E1;

    /* renamed from: x1, reason: collision with root package name */
    public android.view.ViewGroup f498916x1;

    /* renamed from: y1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 f498917y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.ImageView f498918z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.C1 = 2;
        this.E1 = "";
    }

    @Override // tc4.d2
    public java.lang.Object E(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new tc4.i3(this, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return g17;
    }

    @Override // tc4.d2
    /* renamed from: getTagImgView */
    public com.p314xaae8f345.mm.p872xbfc2bd01.ui.C10912x86c557b2 mo166177x6e8a5c04() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446 = this.f498917y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagImgView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return c18146x7d99d446;
    }

    @Override // tc4.x1
    /* renamed from: getViewType */
    public int mo166166xc321a0f5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return 1;
    }

    @Override // uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        uc4.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17;
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.y0) {
                break;
            }
        }
        if (gVar == null) {
            java.util.ArrayList<uc4.g> m167831x70c5fbc5 = m167831x70c5fbc5();
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            uc4.y0 y0Var = new uc4.y0(context);
            uc4.g.l(y0Var, this.f498916x1, false, true, false, 10, null);
            m167831x70c5fbc5.add(y0Var);
        }
        this.E1 = bVar.n().a1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSth", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        xc4.p n18 = m166188xfb7e5820 != null ? m166188xfb7e5820.n() : null;
        zc4.b m166188xfb7e58202 = m166188xfb7e5820();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = (m166188xfb7e58202 == null || (n17 = m166188xfb7e58202.n()) == null) ? null : n17.h1();
        if ((h17 == null || (a90Var = h17.f39014x86965dde) == null || (linkedList = a90Var.f451373h) == null || !(linkedList.isEmpty() ^ true)) ? false : true) {
            r45.a90 a90Var2 = h17.f39014x86965dde;
            if (a90Var2 != null && a90Var2.f451370e == 30) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class);
                r45.y87 y87Var = h17.f39044xb84ea7e1;
                k91.v5 Bi = ((k91.g4) f6Var).Bi(y87Var != null ? y87Var.f472397d : null);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.lang.String str2 = Bi != null ? Bi.f68904x28d45f97 : null;
                if (str2 == null) {
                    str2 = "";
                }
                cy1.a aVar = (cy1.a) rVar;
                aVar.pk(this.f498916x1, "sns_app_brand_card");
                android.view.ViewGroup viewGroup = this.f498916x1;
                jz5.l[] lVarArr = new jz5.l[6];
                lVarArr[0] = new jz5.l("card_id", h17.Id);
                lVarArr[1] = new jz5.l("card_type", "3");
                lVarArr[2] = new jz5.l("appid", str2);
                r45.y87 y87Var2 = h17.f39044xb84ea7e1;
                lVarArr[3] = new jz5.l("pagepath", y87Var2 != null ? y87Var2.f472398e : null);
                lVarArr[4] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "3");
                if (n18 != null && (c17 = n18.c1()) != null) {
                    str = c17.f68896xdde069b;
                }
                lVarArr[5] = new jz5.l("share_username", str);
                java.util.Map k17 = kz5.c1.k(lVarArr);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : k17.entrySet()) {
                    if (((java.lang.String) entry.getValue()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                aVar.gk(viewGroup, linkedHashMap);
                aVar.Tj(this.f498916x1, 40, 12, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSth", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        java.lang.Object h18 = super.h(s0Var, bVar, i17, z17, interfaceC29045xdcb5ca57);
        if (h18 == pz5.a.f440719d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
            zy1.e.f558858a.e(12076, "BrowseOtherFeedCount", this.E1);
            return h18;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        pc4.d dVar = pc4.d.f434943a;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(dVar.x() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ep_ : com.p314xaae8f345.mm.R.C30864xbddafb2a.csy, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f498916x1 = viewGroup;
        this.f498917y1 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.h9t);
        this.f498918z1 = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nh7);
        this.A1 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.m4o);
        this.B1 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.odj);
        android.view.ViewGroup viewGroup2 = this.f498916x1;
        if (viewGroup2 != null) {
            viewGroup2.setTag(com.p314xaae8f345.mm.R.id.h9t, this.f498917y1);
        }
        android.view.ViewGroup viewGroup3 = this.f498916x1;
        if (viewGroup3 != null) {
            viewGroup3.setTag(com.p314xaae8f345.mm.R.id.nh7, this.f498918z1);
        }
        android.view.ViewGroup viewGroup4 = this.f498916x1;
        if (viewGroup4 != null) {
            viewGroup4.setTag(com.p314xaae8f345.mm.R.id.m4o, this.A1);
        }
        android.view.ViewGroup viewGroup5 = this.f498916x1;
        if (viewGroup5 != null) {
            viewGroup5.setTag(com.p314xaae8f345.mm.R.id.odj, this.B1);
        }
        android.widget.TextView textView = this.B1;
        if (textView != null) {
            textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        ca4.z0.A0(this.f498917y1, getContext());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(0, -2);
        layoutParams.f92441s = 0;
        if (dVar.x()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18146x7d99d446 c18146x7d99d446 = this.f498917y1;
            if (c18146x7d99d446 != null) {
                c18146x7d99d446.setImportantForAccessibility(2);
            }
            ca4.z0.B0(this.B1, 1.4f);
        }
        android.view.ViewGroup viewGroup6 = this.f498916x1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup6);
        jz5.l lVar = new jz5.l(viewGroup6, layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    /* renamed from: name */
    public java.lang.String mo70844x337a8b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.improve.item.OtherImproveTimelineItem");
        return "OtherImproveTimelineItem";
    }
}
