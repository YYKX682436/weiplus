package ib2;

/* loaded from: classes2.dex */
public final class w extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public java.lang.String A;
    public int B;
    public long C;
    public final android.view.ViewOutlineProvider D;
    public final o25.y1 E;
    public final ib2.u F;

    /* renamed from: d, reason: collision with root package name */
    public r45.vx0 f371689d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f371690e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f371691f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f371692g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f371693h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f371694i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f371695m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f371696n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f371697o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f371698p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f371699q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f371700r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f371701s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f371702t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f371703u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f371704v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f371705w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f371706x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f371707y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f371708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.D = new ib2.b();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.E = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        this.F = new ib2.u(this, m158354x19263085());
    }

    public static final r45.ev2 O6(ib2.w wVar) {
        r45.vx0 vx0Var = wVar.f371689d;
        if (vx0Var == null) {
            return null;
        }
        int i17 = 0;
        int intExtra = wVar.m158359x1e885992().getIntExtra("collection_ref_comment_scene", 0);
        r45.ev2 ev2Var = new r45.ev2();
        ev2Var.set(0, java.lang.Long.valueOf(vx0Var.m75942xfb822ef2(0)));
        ev2Var.set(1, vx0Var.m75945x2fec8307(1));
        ev2Var.set(2, vx0Var.m75945x2fec8307(2));
        ev2Var.set(3, vx0Var.m75945x2fec8307(3));
        ev2Var.set(4, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(4)));
        ev2Var.set(5, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(21)));
        java.lang.String str = wVar.f371705w;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorUsername");
            throw null;
        }
        ev2Var.set(8, str);
        java.lang.String str2 = wVar.f371707y;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickname");
            throw null;
        }
        ev2Var.set(9, str2);
        java.lang.String str3 = wVar.f371708z;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarUrl");
            throw null;
        }
        ev2Var.set(10, str3);
        java.lang.String str4 = wVar.A;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authIconUrl");
            throw null;
        }
        ev2Var.set(11, str4);
        ev2Var.set(12, java.lang.Integer.valueOf(wVar.B));
        if (intExtra >= 0) {
            i17 = intExtra;
        } else {
            android.app.Activity m80379x76847179 = wVar.m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m80379x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m80379x76847179 : null;
            if (abstractActivityC15087xee12defa != null) {
                i17 = abstractActivityC15087xee12defa.getD();
            }
        }
        ev2Var.set(13, java.lang.Integer.valueOf(i17));
        return ev2Var;
    }

    public static /* synthetic */ java.util.Map Q6(ib2.w wVar, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = null;
        }
        return wVar.P6(str);
    }

    public final java.util.Map P6(java.lang.String str) {
        int intExtra = m158359x1e885992().getIntExtra("collection_ref_comment_scene", 0);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar == null) {
            return null;
        }
        r45.qt2 V6 = nyVar.V6();
        lz5.m mVar = new lz5.m();
        mVar.put("finder_tab_context_id", V6.m75945x2fec8307(2));
        mVar.put("finder_context_id", V6.m75945x2fec8307(1));
        mVar.put("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        r45.vx0 vx0Var = this.f371689d;
        mVar.put("collection_id", pm0.v.u(vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L));
        r45.vx0 vx0Var2 = this.f371689d;
        mVar.put("collection_feed_num", vx0Var2 != null ? java.lang.Integer.valueOf(vx0Var2.m75939xb282bd08(4)) : null);
        java.lang.String str2 = this.f371705w;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorUsername");
            throw null;
        }
        mVar.put("author_finder_username", str2);
        mVar.put("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(this.f371689d) ? 1 : 0));
        mVar.put("stay_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.C));
        mVar.put("ref_commentscene", java.lang.Integer.valueOf(intExtra));
        if (str != null) {
            mVar.put("avatar_finder_username", str);
        }
        return kz5.b1.b(mVar);
    }

    public final void R6() {
        r45.vx0 vx0Var = this.f371689d;
        if (vx0Var != null) {
            android.widget.ImageView imageView = this.f371690e;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverIv");
                throw null;
            }
            imageView.setOutlineProvider(this.D);
            android.widget.ImageView imageView2 = this.f371690e;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverIv");
                throw null;
            }
            imageView2.setClipToOutline(true);
            java.lang.String m75945x2fec8307 = vx0Var.m75945x2fec8307(3);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                android.widget.ImageView imageView3 = this.f371690e;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverIv");
                    throw null;
                }
                imageView3.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28);
            } else {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                mn2.q3 q3Var = new mn2.q3(vx0Var.m75945x2fec8307(3), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
                android.widget.ImageView imageView4 = this.f371690e;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverIv");
                    throw null;
                }
                e17.c(q3Var, imageView4, g1Var.h(mn2.f1.f411496q));
            }
            android.widget.TextView textView = this.f371694i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("collectionBarTitle");
                throw null;
            }
            textView.setText(vx0Var.m75945x2fec8307(1));
            android.widget.TextView textView2 = this.f371691f;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
            textView2.setText(vx0Var.m75945x2fec8307(1));
            long f17 = c01.id.f(vx0Var.m75939xb282bd08(7));
            java.lang.String m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.m(m80379x76847179(), vx0Var.m75939xb282bd08(7) * 1000, java.lang.Boolean.TRUE);
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ets);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            if (f17 < 31536000) {
                m17 = m17 + string;
            }
            java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.etl, java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(4)));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.etm, m17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
            if (m17.length() > 0) {
                java.lang.String str = string2 + ' ' + string3;
                int dimension = com.p314xaae8f345.mm.ui.bl.b(m80379x76847179()).x - ((int) m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aml));
                int length = str.length();
                android.widget.TextView textView3 = this.f371692g;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                    throw null;
                }
                android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(str, 0, length, textView3.getPaint(), dimension).setIncludePad(false).build();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
                if (build.getLineCount() <= 1) {
                    android.widget.TextView textView4 = this.f371692g;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                        throw null;
                    }
                    textView4.setText(str);
                } else {
                    android.widget.TextView textView5 = this.f371692g;
                    if (textView5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                        throw null;
                    }
                    java.lang.String k17 = hc2.f1.k(textView5, m80379x76847179(), dimension, string2, 1);
                    android.widget.TextView textView6 = this.f371692g;
                    if (textView6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                        throw null;
                    }
                    java.lang.String str2 = k17 + '\n' + hc2.f1.k(textView6, m80379x76847179(), dimension, m17, 1);
                    android.widget.TextView textView7 = this.f371692g;
                    if (textView7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                        throw null;
                    }
                    textView7.setText(str2);
                }
            } else {
                android.widget.TextView textView8 = this.f371692g;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedCountTv");
                    throw null;
                }
                textView8.setText(string2);
            }
            if (vx0Var.m75939xb282bd08(21) == 23 || vx0Var.m75939xb282bd08(21) == 24) {
                android.view.View view = this.f371702t;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smartDescContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View view2 = this.f371702t;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smartDescContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        java.lang.String stringExtra3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        this.C = java.lang.System.currentTimeMillis();
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.vx0().mo11468x92b714fd(m80379x76847179().getIntent().getByteArrayExtra("collection_info"));
            this.f371689d = mo11468x92b714fd instanceof r45.vx0 ? (r45.vx0) mo11468x92b714fd : null;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCollectionHeaderUIC", "parse error with exception:" + e17);
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.vx0 vx0Var = this.f371689d;
        objArr[0] = pm0.v.u(vx0Var != null ? vx0Var.m75942xfb822ef2(0) : 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionHeaderUIC", "collectionTopicId %s", objArr);
        java.lang.String stringExtra4 = m80379x76847179().getIntent().getStringExtra("collection_author_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f371705w = stringExtra4;
        ya2.g gVar = ya2.h.f542017a;
        ya2.b2 b17 = gVar.b(stringExtra4);
        if (b17 != null) {
            stringExtra = b17.w0();
        } else {
            stringExtra = m158359x1e885992().getStringExtra("collection_nickname");
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        this.f371707y = stringExtra;
        if (b17 != null) {
            stringExtra2 = b17.m176700xe5e0d2a0();
        } else {
            stringExtra2 = m158359x1e885992().getStringExtra("collection_avatar_url");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        this.f371708z = stringExtra2;
        if (b17 == null || (c19780xceb4c4dc2 = b17.f69300x731cac1b) == null || (stringExtra3 = c19780xceb4c4dc2.m76028x11716638()) == null) {
            stringExtra3 = m158359x1e885992().getStringExtra("collection_authicon_url");
        }
        this.A = stringExtra3 != null ? stringExtra3 : "";
        this.B = (b17 == null || (c19780xceb4c4dc = b17.f69300x731cac1b) == null) ? m158359x1e885992().getIntExtra("collection_authicon_type", 0) : c19780xceb4c4dc.m76027x1cbb0791();
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f564080hd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f371694i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565362sw4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f371693h = findViewById2;
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f564769a25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f371695m = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById3;
        android.view.View findViewById4 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.svn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f371696n = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565361sw3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f371697o = findViewById5;
        android.view.View findViewById6 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.svv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f371698p = findViewById6;
        android.view.View findViewById7 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.svf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f371699q = findViewById7;
        android.view.View findViewById8 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f371700r = findViewById8;
        android.view.View findViewById9 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f371701s = findViewById9;
        android.view.View view = this.f371699q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        view.setOnClickListener(new ib2.e(this));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            hc2.i.e(abstractActivityC21394xb3d2c0cf, false);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        android.view.View view2 = this.f371697o;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
            throw null;
        }
        android.widget.FrameLayout frameLayout = this.f371696n;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerBgLayout");
            throw null;
        }
        hc2.i.a(abstractActivityC21394xb3d2c0cf2, view2, frameLayout);
        android.view.View findViewById10 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f371690e = (android.widget.ImageView) findViewById10;
        android.view.View findViewById11 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565360sw2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f371691f = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f371703u = findViewById12;
        android.view.View findViewById13 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.sve);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.f371704v = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f371692g = (android.widget.TextView) findViewById14;
        android.view.View findViewById15 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565359sw1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f371702t = findViewById15;
        android.view.View findViewById16 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.svc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById16, "findViewById(...)");
        this.f371706x = (android.widget.ImageView) findViewById16;
        android.view.View view3 = this.f371697o;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout frameLayout2 = this.f371696n;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerBgLayout");
            throw null;
        }
        frameLayout2.setVisibility(0);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.f371695m;
        if (c2678xa407981c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
            throw null;
        }
        ib2.a aVar = new ib2.a(this);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c2 = this.f371695m;
        if (c2678xa407981c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
            throw null;
        }
        aVar.a(c2678xa407981c2, 0);
        c2678xa407981c.a(aVar);
        if (this.f371689d != null) {
            R6();
        }
        android.view.View view4 = this.f371698p;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
        view4.setOnClickListener(new ib2.f(this));
        d92.f fVar = d92.f.f309003a;
        android.view.View view5 = this.f371700r;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
            throw null;
        }
        d92.f.j(fVar, view5, true, false, 2, null);
        android.view.View view6 = this.f371700r;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
            throw null;
        }
        view6.setOnClickListener(new ib2.g(this));
        android.view.View view7 = this.f371701s;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("favBtn");
            throw null;
        }
        d92.f.j(fVar, view7, true, false, 2, null);
        android.view.View view8 = this.f371701s;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("favBtn");
            throw null;
        }
        view8.setOnClickListener(new ib2.h(this));
        android.view.View view9 = this.f371698p;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreBtn");
            throw null;
        }
        hc2.v0.e(view9, "collection_list_menu_button", 0, 0, false, false, null, new ib2.i(this), 62, null);
        android.view.View view10 = this.f371700r;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
            throw null;
        }
        hc2.v0.e(view10, "collection_list_share", 0, 0, false, false, null, new ib2.j(this), 62, null);
        android.view.View view11 = this.f371701s;
        if (view11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("favBtn");
            throw null;
        }
        hc2.v0.e(view11, "collection_list_fav", 0, 0, false, false, null, new ib2.k(this), 62, null);
        android.view.View view12 = this.f371702t;
        if (view12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smartDescContainer");
            throw null;
        }
        view12.setOnClickListener(new ib2.c(this));
        java.lang.String str = this.f371705w;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorUsername");
            throw null;
        }
        if (str.length() > 0) {
            android.view.View view13 = this.f371703u;
            if (view13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view13, arrayList2.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String str2 = this.f371705w;
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorUsername");
                throw null;
            }
            ya2.b2 b18 = gVar.b(str2);
            java.lang.String str3 = this.f371707y;
            if (str3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickname");
                throw null;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(str3);
            java.lang.String str4 = this.f371707y;
            if (str4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickname");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl ylVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(str4, m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77841x66d62781), false, false, new ib2.d(this), 16, null);
            java.lang.String str5 = this.f371707y;
            if (str5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickname");
                throw null;
            }
            spannableString.setSpan(ylVar, 0, str5.length(), 17);
            android.widget.TextView textView = this.f371704v;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorTv");
                throw null;
            }
            textView.setText(spannableString);
            android.widget.TextView textView2 = this.f371704v;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorTv");
                throw null;
            }
            textView2.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c8(spannableString, textView2));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            android.widget.ImageView imageView = this.f371706x;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authIcon");
                throw null;
            }
            zy2.tb.a(m1Var, imageView, b18 != null ? b18.f69300x731cac1b : null, 0, 4, null);
        } else {
            android.view.View view14 = this.f371703u;
            if (view14 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorContainer");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view14, arrayList3.toArray(), "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.E.getClass();
        this.F.q();
        cy1.a aVar2 = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158354x19263085(), iy1.c.FinderCollectionUI);
        aVar2.Rj(m158354x19263085(), iy1.a.Finder);
        aVar2.Tj(m158354x19263085(), 44, 1, false);
        aVar2.gk(m158354x19263085(), P6(null));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.F.getClass();
        this.E.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.D = new ib2.b();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.E = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        this.F = new ib2.u(this, m158354x19263085());
    }
}
