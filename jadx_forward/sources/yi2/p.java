package yi2;

/* loaded from: classes10.dex */
public abstract class p implements yi2.o0 {
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f544094a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.e f544095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f544096c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f544097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f544098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f544099f;

    /* renamed from: g, reason: collision with root package name */
    public int f544100g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f544101h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f544102i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f544103j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f544104k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f544105l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f544106m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f544107n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f544108o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f544109p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f544110q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f544111r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f544112s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f544113t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f544114u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f544115v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f544116w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f544117x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f544118y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f544119z;

    public p(android.view.View root, xi2.e server) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f544094a = root;
        this.f544095b = server;
        this.f544096c = n();
        this.f544097d = "finder_live_pk_fire_ball.pag";
        this.f544098e = (int) root.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        this.f544099f = i65.a.a(root.getContext(), 64.0f);
        this.f544102i = p3325xe03a0797.p3326xc267989b.z0.b();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.ep_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f544103j = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.epd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f544104k = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.epc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f544105l = findViewById3;
        this.f544106m = "red";
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.epc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f544107n = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.epb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById5;
        this.f544108o = c22789xd23e9a9b;
        android.view.View findViewById6 = root.findViewById(com.p314xaae8f345.mm.R.id.epe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f544109p = findViewById6;
        android.view.View findViewById7 = root.findViewById(com.p314xaae8f345.mm.R.id.q9p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f544110q = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = root.findViewById(com.p314xaae8f345.mm.R.id.qva);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f544111r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById8;
        android.view.View findViewById9 = root.findViewById(com.p314xaae8f345.mm.R.id.epg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f544112s = textView;
        android.view.View findViewById10 = root.findViewById(com.p314xaae8f345.mm.R.id.epf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f544113t = findViewById10;
        android.view.View findViewById11 = root.findViewById(com.p314xaae8f345.mm.R.id.f566101ep2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f544114u = findViewById11;
        android.view.View findViewById12 = root.findViewById(com.p314xaae8f345.mm.R.id.ep8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById12;
        this.f544115v = textView2;
        android.view.View findViewById13 = root.findViewById(com.p314xaae8f345.mm.R.id.f566104ep5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById13;
        this.f544116w = textView3;
        android.view.View findViewById14 = root.findViewById(com.p314xaae8f345.mm.R.id.f566102ep3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.f544117x = findViewById14;
        android.view.View findViewById15 = root.findViewById(com.p314xaae8f345.mm.R.id.ep6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById15, "findViewById(...)");
        this.f544118y = findViewById15;
        this.f544119z = root.findViewById(com.p314xaae8f345.mm.R.id.f568712qq0);
        p();
        this.A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new yi2.i(this), true);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544833J));
        android.content.res.AssetManager assets = root.getContext().getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        c22789xd23e9a9b.k(assets, "finder_live_pk_fire_ball.pag");
        c22789xd23e9a9b.m82583xcde73672(0);
        c22789xd23e9a9b.g();
        c22789xd23e9a9b.setScaleY(1.5f);
        c22789xd23e9a9b.setScaleX(1.5f);
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        float d17 = fVar.d(context, 11.0f, false);
        textView2.setTextSize(1, d17);
        textView3.setTextSize(1, d17);
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        textView.setTextSize(1, fVar.d(context2, 12.6f, false));
    }

    @Override // yi2.o0
    public void b() {
        h();
        s(m(), l(), true);
        android.view.View view = this.f544109p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544113t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f544114u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        xi2.e eVar = this.f544095b;
        sb6.append(((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).Z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, sb6.toString());
        this.f544112s.setText(no0.m.f420263a.b(0, ":"));
        this.A.d();
        if (((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).Z != null) {
            android.view.View view = this.f544109p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "battleEnd", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z17) {
                return;
            }
            h();
        }
    }

    @Override // yi2.o0
    public void d() {
        java.lang.String str;
        java.lang.Long m17 = m();
        java.lang.Long l17 = l();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "updateBattleInfo: selfBattleWeCoinHot:" + m17 + " otherBattleWecoinHot:" + l17);
        java.lang.String valueOf = java.lang.String.valueOf(m17 != null ? m17.longValue() : 0L);
        android.widget.TextView textView = this.f544115v;
        textView.setText(valueOf);
        java.lang.String valueOf2 = java.lang.String.valueOf(l17 != null ? l17.longValue() : 0L);
        android.widget.TextView textView2 = this.f544116w;
        textView2.setText(valueOf2);
        android.view.View view = this.f544094a;
        this.f544118y.setContentDescription(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cm8, textView.getText()));
        android.content.res.Resources resources = view.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[2];
        km2.q l76 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).l7();
        if (l76 == null || (str = l76.f390706d) == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = textView2.getText();
        this.f544117x.setContentDescription(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cm9, objArr));
        s(m17, l17, false);
    }

    @Override // yi2.o0
    public void e() {
    }

    @Override // yi2.o0
    public android.view.View f() {
        return this.f544094a;
    }

    public final void g(boolean z17) {
        r45.wk6 wk6Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj;
        this.f544106m = "red";
        this.f544104k.setBackgroundDrawable(k(z17));
        this.f544105l.setBackgroundDrawable(j(z17));
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (u4Var.f315693g != 2) {
                q(new yi2.g(this));
                return;
            }
            if (u4Var.f()) {
                r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f315696j, 0);
                java.lang.Object obj2 = null;
                if (r22Var == null || (m75941xfb8219142 = r22Var.m75941xfb821914(0)) == null) {
                    wk6Var = null;
                } else {
                    synchronized (m75941xfb8219142) {
                        java.util.Iterator it = m75941xfb8219142.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(0), ((mm2.c1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.c1.class)).f410385o)) {
                                    break;
                                }
                            }
                        }
                    }
                    wk6Var = (r45.wk6) obj;
                }
                if (wk6Var != null) {
                    this.f544104k.setBackgroundDrawable(k(z17));
                    this.f544105l.setBackgroundDrawable(j(z17));
                }
                r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f315696j, 1);
                if (r22Var2 != null && (m75941xfb821914 = r22Var2.m75941xfb821914(0)) != null) {
                    synchronized (m75941xfb821914) {
                        java.util.Iterator it6 = m75941xfb821914.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) next).m75945x2fec8307(0), ((mm2.c1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.c1.class)).f410385o)) {
                                obj2 = next;
                                break;
                            }
                        }
                    }
                    obj2 = (r45.wk6) obj2;
                }
                if (obj2 != null) {
                    this.f544106m = "blue";
                    this.f544104k.setBackgroundDrawable(j(z17));
                    this.f544105l.setBackgroundDrawable(k(z17));
                }
            }
        }
        q(new yi2.h(this));
    }

    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            ce2.i e17 = dk2.u7.f315714a.e(u4Var.f315695i);
            int i17 = u4Var.f315694h;
            android.widget.ImageView imageView = this.f544110q;
            android.view.View view = this.f544109p;
            if (i17 != 1) {
                imageView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = i65.a.b(view.getContext(), u4Var.f315700n <= 3600 ? 96 : 108);
                    return;
                }
                return;
            }
            if (((mm2.o4) p8Var.a().a(mm2.o4.class)).f410857s.size() != 1) {
                imageView.setVisibility(8);
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = i65.a.b(view.getContext(), u4Var.f315700n <= 3600 ? 96 : 108);
                    return;
                }
                return;
            }
            imageView.setVisibility(0);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            java.lang.String str = e17 != null ? e17.f67819x7194d06c : null;
            if (str == null) {
                str = "";
            }
            ((wo0.b) d1Var.a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i65.a.b(view.getContext(), 114);
            }
        }
    }

    public final android.graphics.drawable.Drawable j(boolean z17) {
        android.view.View view = this.f544094a;
        if (z17) {
            android.graphics.drawable.Drawable drawable = view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cod);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable2);
        return drawable2;
    }

    public final android.graphics.drawable.Drawable k(boolean z17) {
        android.view.View view = this.f544094a;
        if (z17) {
            android.graphics.drawable.Drawable drawable = view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.coe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable2);
        return drawable2;
    }

    public java.lang.Long l() {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        if (u4Var.f315693g != 2) {
            dk2.u4 u4Var2 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).Z;
            if (u4Var2 == null) {
                return null;
            }
            km2.q l76 = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).l7();
            km2.k c17 = u4Var2.c(l76 != null ? l76.f390705c : null);
            if (c17 != null) {
                return java.lang.Long.valueOf(u4Var.f315694h == 1 ? c17.f390655i : c17.f390649c);
            }
            return null;
        }
        for (r45.r22 r22Var : u4Var.f315696j) {
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            synchronized (m75941xfb821914) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(1), ((mm2.e1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.e1.class)).f410520q.f461834n)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return u4Var.f315694h == 1 ? java.lang.Long.valueOf(r22Var.m75942xfb822ef2(3)) : java.lang.Long.valueOf(r22Var.m75942xfb822ef2(1));
            }
        }
        return null;
    }

    public java.lang.Long m() {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        if (u4Var.f315693g != 2) {
            km2.k e17 = u4Var.e(((mm2.c1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.c1.class)).f410385o);
            if (e17 != null) {
                return java.lang.Long.valueOf(u4Var.f315694h == 1 ? e17.f390655i : e17.f390649c);
            }
            return null;
        }
        for (r45.r22 r22Var : u4Var.f315696j) {
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            synchronized (m75941xfb821914) {
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(1), ((mm2.e1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.e1.class)).f410520q.f461834n)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                return u4Var.f315694h == 1 ? java.lang.Long.valueOf(r22Var.m75942xfb822ef2(3)) : java.lang.Long.valueOf(r22Var.m75942xfb822ef2(1));
            }
        }
        return null;
    }

    public abstract java.lang.String n();

    public boolean o() {
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544095b).a().a(mm2.o4.class)).Z;
        boolean z17 = false;
        if (u4Var != null && u4Var.f315691e == 2) {
            z17 = true;
        }
        return !z17;
    }

    public final void p() {
        android.view.ViewGroup.LayoutParams layoutParams = this.f544108o.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.View view = this.f544094a;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(((com.p314xaae8f345.mm.ui.bl.b(view.getContext()).x / 2) - this.f544100g) - com.p314xaae8f345.mm.ui.zk.a(view.getContext(), 8));
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f544107n.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart((com.p314xaae8f345.mm.ui.bl.b(view.getContext()).x / 2) - this.f544100g);
    }

    public final void q(yz5.l lVar) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544106m, "red");
        android.view.View view = this.f544105l;
        android.view.View view2 = this.f544104k;
        if (b17) {
            view2.setOnClickListener(new yi2.j(lVar));
            view.setOnClickListener(new yi2.k(lVar));
        } else {
            view2.setOnClickListener(new yi2.l(lVar));
            view.setOnClickListener(new yi2.m(lVar));
        }
    }

    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "showCounting");
        android.view.View view = this.f544114u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544113t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "showCounting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    /* renamed from: reset */
    public void mo177185x6761d4f() {
        mo177186xcd1079b0(8);
        p();
        this.A.d();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f544101h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f544101h = null;
    }

    public final void s(java.lang.Long l17, java.lang.Long l18, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateBattleBar: selfWecoinHot:");
        sb6.append(l17);
        sb6.append(" otherWecoinHot:");
        sb6.append(l18);
        sb6.append(" needInit:");
        sb6.append(z17);
        sb6.append(" visibility: ");
        android.view.View view = this.f544103j;
        sb6.append(view.getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, sb6.toString());
        if (view.getVisibility() != 0) {
            return;
        }
        view.post(new yi2.o(this, l17, l18, z17));
    }

    @Override // yi2.o0
    /* renamed from: setVisible */
    public void mo177186xcd1079b0(int i17) {
        android.view.View view = this.f544094a;
        if (view.getContext() instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
                i17 = 8;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544096c, "battle setVisible: " + i17);
        android.view.View view2 = this.f544094a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveBattleCustomBarWidget", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
