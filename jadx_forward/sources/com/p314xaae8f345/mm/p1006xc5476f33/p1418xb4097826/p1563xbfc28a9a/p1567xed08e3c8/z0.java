package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class z0 extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f202838e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f202839f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f202840g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f202841h;

    /* renamed from: i, reason: collision with root package name */
    public int f202842i;

    /* renamed from: m, reason: collision with root package name */
    public int f202843m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f202844n;

    /* renamed from: o, reason: collision with root package name */
    public long f202845o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f202846p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f202847q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f202848r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f202849s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f202850t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f202838e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.x0(this));
        this.f202839f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.y0(this));
        this.f202840g = "";
        this.f202841h = "";
        this.f202846p = "";
        this.f202850t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.v0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b2w;
    }

    @Override // eo2.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.os.Bundle m7436x8619eaa0;
        android.os.Bundle m7436x8619eaa02;
        android.os.Bundle m7436x8619eaa03;
        android.os.Bundle m7436x8619eaa04;
        android.os.Bundle m7436x8619eaa05;
        android.os.Bundle m7436x8619eaa06;
        android.os.Bundle m7436x8619eaa07;
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        java.lang.String string = (m158358x197d1fc6 == null || (m7436x8619eaa07 = m158358x197d1fc6.m7436x8619eaa0()) == null) ? null : m7436x8619eaa07.getString("key_author_finder_name");
        if (string == null) {
            string = "";
        }
        this.f202840g = string;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        java.lang.String string2 = (m158358x197d1fc62 == null || (m7436x8619eaa06 = m158358x197d1fc62.m7436x8619eaa0()) == null) ? null : m7436x8619eaa06.getString("key_finder_member_ticket");
        if (string2 == null) {
            string2 = "";
        }
        this.f202841h = string2;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        this.f202842i = (m158358x197d1fc63 == null || (m7436x8619eaa05 = m158358x197d1fc63.m7436x8619eaa0()) == null) ? 0 : m7436x8619eaa05.getInt("key_finder_feed_count");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        this.f202843m = (m158358x197d1fc64 == null || (m7436x8619eaa04 = m158358x197d1fc64.m7436x8619eaa0()) == null) ? 0 : m7436x8619eaa04.getInt("key_finder_member_feed_type");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = m158358x197d1fc6();
        this.f202845o = (m158358x197d1fc65 == null || (m7436x8619eaa03 = m158358x197d1fc65.m7436x8619eaa0()) == null) ? 0L : m7436x8619eaa03.getLong("key_member_topic_id");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc66 = m158358x197d1fc6();
        java.lang.String string3 = (m158358x197d1fc66 == null || (m7436x8619eaa02 = m158358x197d1fc66.m7436x8619eaa0()) == null) ? null : m7436x8619eaa02.getString("key_member_collection_name");
        this.f202846p = string3 != null ? string3 : "";
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc67 = m158358x197d1fc6();
        byte[] byteArray = (m158358x197d1fc67 == null || (m7436x8619eaa0 = m158358x197d1fc67.m7436x8619eaa0()) == null) ? null : m7436x8619eaa0.getByteArray("key_member_last_buffer");
        if (byteArray != null) {
            this.f202844n = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArray, 0, byteArray.length);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.C14469x166b17d1) ((jz5.n) this.f202850t).mo141623x754a37bb()).m56377x73095078(this.f202844n);
        jz5.g gVar = this.f202839f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.j0) ((jz5.n) gVar).mo141623x754a37bb();
        jz5.g gVar2 = this.f202838e;
        j0Var.T((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.i0) ((jz5.n) gVar2).mo141623x754a37bb());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.i0) ((jz5.n) gVar2).mo141623x754a37bb()).m((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.j0) ((jz5.n) gVar).mo141623x754a37bb());
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f202848r = (android.widget.TextView) mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567417qg3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.f202849s = (android.widget.TextView) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        this.f202847q = mo144222x4ff8c0f03;
        android.widget.TextView textView = this.f202848r;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCount");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        int i17 = this.f202843m;
        if (i17 == 6) {
            android.widget.TextView textView2 = this.f202848r;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCount");
                throw null;
            }
            textView2.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrc));
        } else if (i17 != 7) {
            android.widget.TextView textView3 = this.f202848r;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCount");
                throw null;
            }
            textView3.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.en7, java.lang.Integer.valueOf(this.f202842i)));
        } else {
            android.widget.TextView textView4 = this.f202848r;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaCount");
                throw null;
            }
            textView4.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrd));
            if (this.f202846p.length() > 0) {
                android.widget.TextView textView5 = this.f202849s;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionNameTv");
                    throw null;
                }
                textView5.setVisibility(0);
                android.widget.TextView textView6 = this.f202849s;
                if (textView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionNameTv");
                    throw null;
                }
                textView6.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lre, this.f202846p));
            }
        }
        android.view.View view = this.f202847q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.w0(this));
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc68 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = m158358x197d1fc68 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc68).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f202847q;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "become_member");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f202847q;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f202847q;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("payBtn");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[6];
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_zone_inlet_source", bVar != null ? java.lang.Integer.valueOf(bVar.f337091d) : null);
        lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr[2] = new jz5.l("finder_username", this.f202840g);
        lVarArr[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        lVarArr[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        if (this.f202843m == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158358x197d1fc6(), iy1.c.FinderPreviewFeedListVideoUI);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158358x197d1fc6(), iy1.c.FinderPreviewFeedListLiveUI);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(m158358x197d1fc6(), 12, 27010);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc69 = m158358x197d1fc6();
        jz5.l[] lVarArr2 = new jz5.l[6];
        lVarArr2[0] = new jz5.l("finder_username", this.f202840g);
        lVarArr2[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr2[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        android.app.Activity context2 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar2 = (eo2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(eo2.b.class);
        lVarArr2[3] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar2 != null ? bVar2.f337091d : 0));
        lVarArr2[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr2[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        ((cy1.a) rVar4).gk(m158358x197d1fc69, kz5.c1.k(lVarArr2));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.i0) ((jz5.n) this.f202838e).mo141623x754a37bb()).mo979x3f5eee52();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f202838e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.x0(this));
        this.f202839f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.y0(this));
        this.f202840g = "";
        this.f202841h = "";
        this.f202846p = "";
        this.f202850t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.v0(this));
    }
}
