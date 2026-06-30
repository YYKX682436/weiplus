package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ut {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14299x907da1b7 f201532a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 f201533b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f201534c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f201535d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f201536e;

    public ut(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14299x907da1b7 root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f201532a = root;
        this.f201533b = plugin;
        this.f201534c = "FinderLiveRecommendVideoWidget";
        this.f201535d = kz5.p0.f395529d;
    }

    public static final void b(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ut utVar, mn2.h3 h3Var) {
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(h3Var, g1Var.h(mn2.f1.f411486d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.st stVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.st(utVar);
        b17.getClass();
        b17.f529406d = stVar;
        b17.c(imageView);
    }

    public final boolean a(java.util.List videoList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoList, "videoList");
        boolean isEmpty = videoList.isEmpty();
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14299x907da1b7 c14299x907da1b7 = this.f201532a;
        int i18 = 1;
        if (isEmpty || c14299x907da1b7.getVisibility() == 0) {
            return c14299x907da1b7.getVisibility() == 0;
        }
        this.f201535d = videoList;
        this.f201536e = gVar;
        if (videoList.isEmpty() || c14299x907da1b7.getVisibility() == 0) {
            return true;
        }
        c14299x907da1b7.m57237x80215667().setText(c14299x907da1b7.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3a));
        c14299x907da1b7.m57236x29432465().setText(c14299x907da1b7.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ehi));
        c14299x907da1b7.m57235xf2fcb718().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tt(this));
        c(0);
        java.util.List list = this.f201535d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f201536e;
        android.content.Context context = c14299x907da1b7.getContext();
        int i19 = 0;
        for (java.lang.Object obj : list) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
            if (i19 < 3 && !c14994x9b99c079.m59264x7efe73ec().isEmpty()) {
                android.view.ViewGroup m57233xf03215b8 = i19 != 0 ? i19 != i18 ? c14299x907da1b7.m57233xf03215b8() : c14299x907da1b7.m57234x5ed170e6() : c14299x907da1b7.m57232x5ed15d00();
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(c14994x9b99c079.m59264x7efe73ec());
                if (mb4Var == null) {
                    return true;
                }
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ala, (android.view.ViewGroup) null);
                inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu), (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561201c5)));
                m57233xf03215b8.removeAllViews();
                m57233xf03215b8.addView(inflate);
                m57233xf03215b8.setVisibility(i17);
                m57233xf03215b8.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qt(this, list, i19, gVar2, m57233xf03215b8, c14994x9b99c079));
                android.view.View findViewById = m57233xf03215b8.findViewById(com.p314xaae8f345.mm.R.id.cl6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
                android.view.View findViewById2 = m57233xf03215b8.findViewById(com.p314xaae8f345.mm.R.id.i1g);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                ((android.widget.TextView) findViewById2).setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(1, c14994x9b99c079.m59254xf4204902()));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(16))) {
                    b(imageView, this, new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null));
                } else {
                    b(imageView, this, new mn2.r3(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null));
                }
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                java.lang.String u17 = pm0.v.u(c14994x9b99c079.getFeedObject().m76784x5db1b11());
                r0Var.getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("page_id", "1002");
                hashMap.put("feed_id", u17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb.I8((zy2.zb) c17, ml2.u1.D1, hashMap, null, null, null, null, false, 124, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23057, page_id = " + ((java.lang.String) hashMap.get("page_id")) + ", feed_id = " + ((java.lang.String) hashMap.get("feed_id")));
            }
            i19 = i27;
            i17 = 0;
            i18 = 1;
        }
        return true;
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14299x907da1b7 c14299x907da1b7 = this.f201532a;
        c14299x907da1b7.setVisibility(i17);
        android.content.Context context = c14299x907da1b7.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            c14299x907da1b7.setVisibility(8);
        }
    }
}
