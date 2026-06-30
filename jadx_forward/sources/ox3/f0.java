package ox3;

/* loaded from: classes10.dex */
public final class f0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f431274e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f431275f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f431276g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f431277h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.q f431278i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f431279m;

    /* renamed from: n, reason: collision with root package name */
    public final c50.a1 f431280n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f431281o;

    public f0(int i17, yz5.p onClickAuthor, yz5.p onClickUse, yz5.p onClickListen, yz5.q onPlayStateChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickAuthor, "onClickAuthor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickUse, "onClickUse");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListen, "onClickListen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPlayStateChange, "onPlayStateChange");
        this.f431274e = i17;
        this.f431275f = onClickAuthor;
        this.f431276g = onClickUse;
        this.f431277h = onClickListen;
        this.f431278i = onPlayStateChange;
        this.f431279m = new java.util.LinkedHashSet();
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        this.f431280n = new lt2.b();
        this.f431281o = c01.e2.a0();
    }

    @Override // in5.r
    public int e() {
        int i17 = this.f431274e;
        return (i17 == 1 || i17 == 2 || i17 != 3) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.ch_ : com.p314xaae8f345.mm.R.C30864xbddafb2a.cgz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2;
        t45.f fVar;
        vx3.i a17;
        java.lang.CharSequence string;
        java.lang.String str;
        ox3.g item = (ox3.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        item.mo2128x1ed62e84();
        java.util.Objects.toString(list != null ? list.get(0) : null);
        boolean z19 = list == null || list.isEmpty();
        yz5.q qVar = this.f431278i;
        if (z19) {
            t45.n0 n0Var = item.f431282d;
            t45.g gVar = n0Var.f497150f;
            if (gVar != null && (fVar = gVar.f497093d) != null && (a17 = qx3.d.a(fVar.f497082d)) != null) {
                holder.s(com.p314xaae8f345.mm.R.id.m5x, o13.q.e(p13.i.a(a17.f522825i, item.f431285g, false, false)).f432638a);
                android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.m4p);
                if (imageView != null) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.k(a17.f522827k, imageView, a17.e());
                }
                int i19 = gVar.f497107u;
                android.content.Context context = holder.f374654e;
                if (i19 == 1) {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvk, java.lang.Long.valueOf(gVar.f497105s));
                } else if (i19 == 2) {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il((int) gVar.f497101o));
                } else if (i19 != 3) {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il((int) gVar.f497101o));
                } else {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    t45.p0 p0Var = gVar.f497108v;
                    if (p0Var == null || (str = p0Var.f497161d) == null) {
                        str = "";
                    }
                    ((ke0.e) xVar).getClass();
                    string = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
                }
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lo7);
                if (textView != null) {
                    textView.setText(string);
                }
                android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.lo7);
                if (textView2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    textView2.setVisibility(string.length() > 0 ? 0 : 8);
                }
                int i27 = (int) gVar.f497101o;
                android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.m5y);
                if (textView3 != null) {
                    textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvl, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).il(i27)));
                    textView3.setVisibility(i27 > 0 ? 0 : 8);
                }
                holder.s(com.p314xaae8f345.mm.R.id.m4y, a17.f522826j);
                holder.p(com.p314xaae8f345.mm.R.id.m4y).setOnClickListener(new ox3.v(this, holder, item));
                holder.p(com.p314xaae8f345.mm.R.id.m4y).setClickable(true);
                holder.p(com.p314xaae8f345.mm.R.id.opo).setOnClickListener(new ox3.x(this, holder, item));
                if (n0Var.f497155n != null) {
                    holder.w(com.p314xaae8f345.mm.R.id.q1w, 0);
                    holder.p(com.p314xaae8f345.mm.R.id.q1w).setOnClickListener(new ox3.z(this, holder, item));
                } else {
                    holder.w(com.p314xaae8f345.mm.R.id.q1w, 8);
                }
                if (this.f431281o) {
                    holder.w(com.p314xaae8f345.mm.R.id.q1w, 8);
                }
            }
            boolean z27 = item.f431283e;
            vx3.i a18 = qx3.d.a(item.mo2128x1ed62e84());
            if (a18 != null && (c19792x256d2725 = a18.f522820d) != null) {
                c50.a1 a1Var = this.f431280n;
                android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f568228m63);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) p17;
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.m4p);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
                android.widget.ImageView imageView2 = (android.widget.ImageView) p18;
                ((lt2.b) a1Var).getClass();
                long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
                    z18 = true;
                    c15188xd8bd4bd = null;
                } else {
                    r45.mb4 i28 = bu2.z.i(c19788xd7cfd73e);
                    mn2.g4 c17 = ds2.h.f324399a.c(m76784x5db1b11, i28, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, c19792x256d2725.m76805x2dd7a70f()));
                    if (frameLayout.getChildCount() == 0) {
                        android.content.Context context2 = frameLayout.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        c15188xd8bd4bd2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context2);
                        frameLayout.addView(c15188xd8bd4bd2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    } else {
                        android.view.View childAt = frameLayout.getChildAt(0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy");
                        c15188xd8bd4bd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) childAt;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.n(), c15188xd8bd4bd2.mo56696x9040359a())) {
                            c15188xd8bd4bd2.mo58788x65825f6();
                        } else {
                            c15188xd8bd4bd2.mo58801x360802();
                        }
                    }
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.n(), c15188xd8bd4bd2.mo56696x9040359a())) {
                        if (i28.m75938x746dc8a6(4) > 0.0f && i28.m75938x746dc8a6(5) > 0.0f && i28.m75938x746dc8a6(4) / i28.m75938x746dc8a6(5) > 0.75f) {
                            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                            c15188xd8bd4bd2.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
                        } else {
                            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                            c15188xd8bd4bd2.mo56713xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
                        }
                        c15188xd8bd4bd2.mo56708x764cf626(true);
                        c15188xd8bd4bd2.n(c17, false, b17);
                        c15188xd8bd4bd2.F();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoPlayHelper", "onBindViewHolder feedId:" + m76784x5db1b11 + ", mediaId:" + c15188xd8bd4bd2.mo56696x9040359a() + ", isPlay:" + z27);
                    c15188xd8bd4bd2.mo56715xe9d735dd(new lt2.a(imageView2));
                    imageView2.setVisibility(0);
                    if (z27) {
                        z18 = true;
                        c15188xd8bd4bd2.mo56708x764cf626(true);
                        c15188xd8bd4bd2.mo56716x4121a19(true);
                        zy2.g5.u(c15188xd8bd4bd2, null, 1, null);
                    } else {
                        z18 = true;
                    }
                    c15188xd8bd4bd = c15188xd8bd4bd2;
                }
                pm0.v.L("MicroMsg.RingtoneConverter", z18, new ox3.a0(c15188xd8bd4bd, this));
            }
            if (item.f431283e) {
                qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE, item);
            }
        } else {
            java.lang.Object i07 = kz5.n0.i0(list);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i07, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) i07).booleanValue();
            item.f431283e = booleanValue;
            pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.b0(this, holder, booleanValue));
            qVar.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(booleanValue), item);
        }
        n(item, holder);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.c0(this));
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ox3.g gVar = (ox3.g) holder.f374658i;
        int m8183xf806b362 = holder.m8183xf806b362();
        if (gVar.f431283e) {
            gVar.f431283e = false;
            pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.d0(this, holder));
            this.f431278i.mo147xb9724478(java.lang.Integer.valueOf(m8183xf806b362), java.lang.Boolean.FALSE, null);
        }
        n(gVar, holder);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        pm0.v.L("MicroMsg.RingtoneConverter", true, new ox3.e0(this, holder));
    }

    public final void n(ox3.g gVar, in5.s0 s0Var) {
        boolean z17 = gVar.f431283e;
        s0Var.w(com.p314xaae8f345.mm.R.id.m4s, z17 ? 4 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) s0Var.p(com.p314xaae8f345.mm.R.id.m4r);
        c16077xb54fe366.setVisibility(z17 ? 0 : 4);
        if (!z17) {
            c16077xb54fe366.y();
            return;
        }
        c16077xb54fe366.y();
        c16077xb54fe366.m64938x75cc54fa(mx3.f0.f414081a.d(mx3.f0.f414091k));
        c16077xb54fe366.x();
    }
}
