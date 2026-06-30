package oa2;

/* loaded from: classes2.dex */
public final class w extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f425375g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f425376h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f425377i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f425378m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f425375g = jz5.h.b(new oa2.t(this));
        this.f425376h = jz5.h.b(oa2.s.f425369d);
    }

    public static final void V6(oa2.w wVar, r45.r03 r03Var) {
        r45.rz6 rz6Var;
        wVar.getClass();
        r45.r23 r23Var = (r45.r23) r03Var.m75936x14adae67(23);
        if (r23Var == null || (rz6Var = (r45.rz6) r23Var.m75936x14adae67(1)) == null) {
            return;
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f465118d = rz6Var.f466853d;
        q23Var.f465119e = rz6Var.f466854e;
        q23Var.f465120f = rz6Var.f466855f;
        q23Var.f465127p = r03Var.m75942xfb822ef2(1);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        w40.e.s5((w40.e) c17, wVar.m80379x76847179(), q23Var, 0L, 54, null, null, 0, false, 240, null);
    }

    @Override // x92.r
    public void U6() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.rz6 rz6Var;
        r45.rz6 rz6Var2;
        r45.rz6 rz6Var3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec;
        r45.rz6 rz6Var4;
        r45.rz6 rz6Var5;
        r45.rz6 rz6Var6;
        z5();
        r45.r03 r03Var = (r45.r03) this.f534252d;
        if (r03Var == null) {
            return;
        }
        so2.d5 d5Var = new so2.d5(r03Var);
        android.widget.TextView tmplTopicTitle = W6().f516197n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplTopicTitle, "tmplTopicTitle");
        com.p314xaae8f345.mm.ui.fk.a(tmplTopicTitle);
        android.widget.TextView textView = W6().f516197n;
        jz5.g gVar = this.f425376h;
        le0.x xVar = (le0.x) ((jz5.n) gVar).mo141623x754a37bb();
        android.app.Activity m80379x76847179 = m80379x76847179();
        java.lang.String b17 = d5Var.b();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, b17));
        r45.r23 r23Var = (r45.r23) r03Var.m75936x14adae67(23);
        if ((r23Var == null || (rz6Var6 = (r45.rz6) r23Var.m75936x14adae67(1)) == null || rz6Var6.f466854e != 3) ? false : true) {
            W6().f516193j.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mau));
        } else {
            W6().f516193j.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mav));
        }
        if (d5Var.c() > 0) {
            W6().f516195l.setVisibility(0);
            W6().f516195l.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8i, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(d5Var.c(), false)));
        } else {
            W6().f516195l.setVisibility(8);
        }
        android.widget.TextView tmplTopicAuthor = W6().f516194k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplTopicAuthor, "tmplTopicAuthor");
        com.p314xaae8f345.mm.ui.fk.a(tmplTopicAuthor);
        android.widget.TextView tmplTopicAuthor2 = W6().f516194k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplTopicAuthor2, "tmplTopicAuthor");
        Y6(tmplTopicAuthor2, "template_page_finderuin_nickname", r03Var);
        W6().f516194k.setOnClickListener(new oa2.u(this, r03Var));
        android.widget.TextView tmplPostSameTv = W6().f516193j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplPostSameTv, "tmplPostSameTv");
        com.p314xaae8f345.mm.ui.fk.a(tmplPostSameTv);
        W6().f516192i.setOnClickListener(new oa2.v(this, r03Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateViews] topicId:");
        sb6.append((java.lang.Object) jz5.x.a(r03Var.m75942xfb822ef2(1)));
        sb6.append(" templateId:");
        r45.r23 r23Var2 = (r45.r23) r03Var.m75936x14adae67(23);
        sb6.append((r23Var2 == null || (rz6Var5 = (r45.rz6) r23Var2.m75936x14adae67(1)) == null) ? null : rz6Var5.f466853d);
        sb6.append(" templateType:");
        r45.r23 r23Var3 = (r45.r23) r03Var.m75936x14adae67(23);
        sb6.append((r23Var3 == null || (rz6Var4 = (r45.rz6) r23Var3.m75936x14adae67(1)) == null) ? null : java.lang.Integer.valueOf(rz6Var4.f466854e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateTopicHeaderUIC", sb6.toString());
        android.widget.LinearLayout tmplPostSame = W6().f516192i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplPostSame, "tmplPostSame");
        Y6(tmplPostSame, "template_feed_shoot", r03Var);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        java.lang.String a17 = d5Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f;
        mn2.q3 q3Var = new mn2.q3(a17, y90Var);
        android.widget.ImageView tmplTopicCover = W6().f516196m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplTopicCover, "tmplTopicCover");
        mn2.f1 f1Var = mn2.f1.f411486d;
        e17.c(q3Var, tmplTopicCover, g1Var.h(f1Var));
        r45.r23 r23Var4 = (r45.r23) r03Var.m75936x14adae67(23);
        if (r23Var4 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r23Var4.m75936x14adae67(0)) == null) {
            str = "";
            str2 = "FinderTemplateTopicHeaderUIC";
            str3 = null;
        } else {
            le0.x xVar2 = (le0.x) ((jz5.n) gVar).mo141623x754a37bb();
            android.app.Activity m80379x768471792 = m80379x76847179();
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x768471792, m76184x8010e5e4);
            W6().f516194k.setText(i17);
            r45.xk a18 = ya2.d.a(c19782x23db1cfa, false);
            if (a18 == null || (m76160xd133dfec = ya2.d.e(a18)) == null) {
                m76160xd133dfec = c19782x23db1cfa.m76160xd133dfec();
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            android.widget.ImageView authIcon = W6().f516185b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(authIcon, "authIcon");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = m76160xd133dfec;
            zy2.tb.a(m1Var, authIcon, c19780xceb4c4dc, 0, 4, null);
            W6().f516190g.setVisibility(0);
            vo0.d a19 = g1Var.a();
            str = "";
            str2 = "FinderTemplateTopicHeaderUIC";
            str3 = null;
            mn2.n nVar = new mn2.n(c19782x23db1cfa.m76175x6d346f39(), null, 2, null);
            android.widget.ImageView tmplDesignerAvatar = W6().f516188e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplDesignerAvatar, "tmplDesignerAvatar");
            a19.c(nVar, tmplDesignerAvatar, g1Var.h(mn2.f1.f411490h));
            android.widget.TextView tmplDesignerAuthor = W6().f516187d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplDesignerAuthor, "tmplDesignerAuthor");
            com.p314xaae8f345.mm.ui.fk.a(tmplDesignerAuthor);
            W6().f516187d.setText(i17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.widget.ImageView tmplDesignerAuthIcon = W6().f516186c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplDesignerAuthIcon, "tmplDesignerAuthIcon");
            zy2.tb.a(m1Var, tmplDesignerAuthIcon, c19780xceb4c4dc, 0, 4, null);
            r45.r23 r23Var5 = (r45.r23) r03Var.m75936x14adae67(23);
            int m75939xb282bd08 = r23Var5 != null ? r23Var5.m75939xb282bd08(4) : 0;
            if (m75939xb282bd08 > 0 && c19782x23db1cfa.m76173xc60393cc() > 0) {
                W6().f516191h.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.max, java.lang.Integer.valueOf(m75939xb282bd08), java.lang.Integer.valueOf(c19782x23db1cfa.m76173xc60393cc())));
            } else if (m75939xb282bd08 > 0) {
                W6().f516191h.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.may, java.lang.Integer.valueOf(m75939xb282bd08)));
            } else if (c19782x23db1cfa.m76173xc60393cc() > 0) {
                W6().f516191h.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572928cy5, java.lang.Integer.valueOf(c19782x23db1cfa.m76173xc60393cc())));
            }
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            if (m76197x6c03c64c == null) {
                m76197x6c03c64c = str;
            }
            W6().f516190g.setOnClickListener(new oa2.p(m76197x6c03c64c, this));
            android.widget.TextView tmplDesignerFollow = W6().f516189f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplDesignerFollow, "tmplDesignerFollow");
            com.p314xaae8f345.mm.ui.fk.a(tmplDesignerFollow);
            android.widget.TextView tmplDesignerFollow2 = W6().f516189f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tmplDesignerFollow2, "tmplDesignerFollow");
            Y6(tmplDesignerFollow2, "template_page_follow", r03Var);
            W6().f516189f.setText(ya2.g.h(ya2.h.f542017a, m76197x6c03c64c, null, false, false, 14, null) ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572926cy3) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cxd));
            W6().f516189f.setOnClickListener(new oa2.q(m76197x6c03c64c, this, c19782x23db1cfa));
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.r_4);
        android.widget.ImageView imageView = (android.widget.ImageView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.eon);
        android.widget.TextView textView2 = (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.eoo);
        android.widget.TextView textView3 = (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.eoq);
        mo144222x4ff8c0f0.setOnClickListener(oa2.n.f425359d);
        so2.d5 d5Var2 = new so2.d5(r03Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        le0.x xVar3 = (le0.x) ((jz5.n) gVar).mo141623x754a37bb();
        android.app.Activity m80379x768471793 = m80379x76847179();
        java.lang.String b18 = d5Var2.b();
        ((ke0.e) xVar3).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x768471793, b18));
        if (d5Var2.c() > 0) {
            textView3.setVisibility(0);
            textView3.setText(m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f8i, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(d5Var2.c(), false)));
        } else {
            textView3.setVisibility(8);
        }
        vo0.d e18 = g1Var.e();
        mn2.q3 q3Var2 = new mn2.q3(d5Var2.a(), y90Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e18.c(q3Var2, imageView, g1Var.h(f1Var));
        android.view.View findViewById = mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.atl);
        if (findViewById != null) {
            findViewById.setOnClickListener(new oa2.o(this, r03Var));
        }
        android.widget.TextView textView4 = (android.widget.TextView) mo144222x4ff8c0f0.findViewById(com.p314xaae8f345.mm.R.id.atk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
        com.p314xaae8f345.mm.ui.fk.a(textView4);
        r45.r23 r23Var6 = (r45.r23) r03Var.m75936x14adae67(23);
        textView4.setText(r23Var6 != null && (rz6Var3 = (r45.rz6) r23Var6.m75936x14adae67(1)) != null && rz6Var3.f466854e == 3 ? m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9v) : m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9u));
        r45.r23 r23Var7 = (r45.r23) r03Var.m75936x14adae67(23);
        java.lang.String str4 = (r23Var7 == null || (rz6Var2 = (r45.rz6) r23Var7.m75936x14adae67(1)) == null) ? str3 : rz6Var2.f466853d;
        java.lang.String str5 = str4 == null ? str : str4;
        r45.r23 r23Var8 = (r45.r23) r03Var.m75936x14adae67(23);
        int i18 = (r23Var8 == null || (rz6Var = (r45.rz6) r23Var8.m75936x14adae67(1)) == null) ? 0 : rz6Var.f466854e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[preloadCameraTemplate] templateId:" + str5 + " templateType:" + i18);
        if (i18 == 3) {
            i95.m c17 = i95.n0.c(bg0.v.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((b92.u2) ((bg0.v) c17)).fj(54, str5, false);
        }
    }

    public final vb2.l0 W6() {
        return (vb2.l0) ((jz5.n) this.f425375g).mo141623x754a37bb();
    }

    public final void X6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, boolean z17) {
        int i17;
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        if (z17) {
            int i18 = db2.m0.f309599v;
            i17 = 1;
        } else {
            int i19 = db2.m0.f309599v;
            i17 = 2;
        }
        int i27 = i17;
        so2.z1 z1Var = so2.z1.f492263a;
        java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
        if (m76197x6c03c64c == null) {
            m76197x6c03c64c = "";
        }
        so2.z1.d(z1Var, V6, m76197x6c03c64c, i27, 0L, null, false, null, null, null, 0, null, null, 0, null, null, null, 65504, null);
        W6().f516189f.setText(z17 ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572926cy3) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.cxd));
    }

    public final void Y6(android.view.View view, java.lang.String str, r45.r03 r03Var) {
        hc2.v0.e(view, str, 0, 0, false, false, null, new oa2.r(this, r03Var), 62, null);
    }
}
