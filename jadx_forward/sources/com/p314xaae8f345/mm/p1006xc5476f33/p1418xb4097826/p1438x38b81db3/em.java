package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public abstract class em extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f184802e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm f184803f;

    public em(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f184802e = i17;
        this.f184803f = data;
    }

    @Override // in5.r
    public int e() {
        return this.f184802e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.text.SpannableString spannableString;
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5 c14139x4d2f44c5;
        cd2.b item = (cd2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z18 = list == null || list.isEmpty();
        cd2.c cVar2 = item.f122188d;
        if (!z18) {
            for (java.lang.Object obj : list) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 1)) {
                    n(holder, item);
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5 c14139x4d2f44c52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5) holder.p(com.p314xaae8f345.mm.R.id.f567430rx5);
                    if (c14139x4d2f44c52 != null) {
                        c14139x4d2f44c52.b(o(cVar2, java.lang.Boolean.TRUE));
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 3) && (c14139x4d2f44c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5) holder.p(com.p314xaae8f345.mm.R.id.f567430rx5)) != null) {
                    c14139x4d2f44c5.b(o(cVar2, java.lang.Boolean.FALSE));
                }
            }
            return;
        }
        jz5.f0 f0Var = null;
        if (!cVar2.t() && (imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_c)) != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b17 = cVar2.b();
            zy2.tb.a(m1Var, imageView, b17 != null ? b17.m76160xd133dfec() : null, 0, 4, null);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ag6);
        if (textView != null) {
            textView.setVisibility(item.f122189e ? 0 : 8);
        }
        android.content.Context context = holder.f374654e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        if (p17 != null) {
            p17.getLayoutParams().width = dimensionPixelSize;
            p17.getLayoutParams().height = dimensionPixelSize;
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f567079i22);
        if (imageView2 != null && (imageView2.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr), 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ag6);
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.am amVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.am) this;
        cd2.c cVar3 = ((cd2.d) item).f122188d;
        mn2.n nVar = new mn2.n(cVar3.h(), null, 2, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveMention username ");
        java.lang.String q17 = cVar3.q();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (q17 == null) {
            q17 = "";
        }
        sb6.append(q17);
        sb6.append(", nickename ");
        java.lang.String k17 = cVar3.k();
        if (k17 == null) {
            k17 = "";
        }
        sb6.append(k17);
        sb6.append(", url ");
        java.lang.String h17 = cVar3.h();
        sb6.append(h17 != null ? h17 : "");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = amVar.f184426g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderLiveMention flag " + cVar3.f() + " content " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(cVar3.c()) + " id " + cVar3.i() + " time " + cVar3.d());
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (imageView3 != null) {
            boolean z27 = ((2 & cVar3.f()) == 0 && (cVar3.f() & 1) == 0) ? false : true;
            pf5.u uVar = pf5.u.f435469a;
            (z27 ? new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).K).mo141623x754a37bb()) : new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).L).mo141623x754a37bb())).c(nVar, imageView3, g1Var.h(z27 ? mn2.f1.f411490h : mn2.f1.f411494o));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14138xeea20ec7 c14138xeea20ec7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14138xeea20ec7) holder.p(com.p314xaae8f345.mm.R.id.f567524jt2);
        if (c14138xeea20ec7 != null) {
            java.lang.String c17 = cVar3.c();
            if (c17 != null) {
                i95.m c18 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                spannableString = zy2.s6.l6((zy2.s6) c18, c17, (int) c14138xeea20ec7.getTextSize(), false, null, 0, false, null, 124, null);
            } else {
                spannableString = null;
            }
            c14138xeea20ec7.setText(spannableString);
        }
        android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.o78);
        if (imageView4 != null) {
            java.lang.String r17 = cVar3.r();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17)) {
                r17 = null;
            }
            if (r17 != null) {
                imageView4.setVisibility(0);
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.o48);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
                android.widget.TextView textView3 = (android.widget.TextView) p18;
                textView3.setVisibility(8);
                java.lang.String r18 = cVar3.r();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r18)) {
                    imageView4.setVisibility(8);
                    if (cVar3.j() == 1) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context2 = textView3.getContext();
                        java.lang.String e17 = cVar3.e();
                        ((ke0.e) xVar).getClass();
                        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, e17));
                        textView3.setVisibility(0);
                    }
                } else {
                    g1Var.e().c(new mn2.q3(r18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView4, g1Var.h(mn2.f1.f411496q));
                    imageView4.setVisibility(0);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                imageView4.setVisibility(4);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgConvert", "onBindViewHolder: " + getClass().getCanonicalName());
        android.widget.ImageView imageView5 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
        if (imageView5 != null) {
            imageView5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cm(item, imageView5));
        }
        n(holder, item);
        super.h(holder, item, i17, i18, z17, list);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final boolean n(in5.s0 s0Var, cd2.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5 c14139x4d2f44c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1466xd1075a44.C14139x4d2f44c5) s0Var.p(com.p314xaae8f345.mm.R.id.f567430rx5);
        boolean z17 = false;
        if (c14139x4d2f44c5 == null) {
            return false;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        cd2.c cVar = bVar.f122188d;
        java.lang.String q17 = cVar.q();
        java.lang.String k17 = cVar.k();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            k17 = c61.yb.md((c61.yb) c17, q17 == null ? "" : q17, k17 == null ? "" : k17, false, 4, null);
        } else if (k17 == null) {
            k17 = "";
        }
        ((ke0.e) xVar).getClass();
        android.content.Context context = s0Var.f374654e;
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, k17);
        cd2.c cVar2 = bVar.f122188d;
        java.lang.String n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.n(context, cVar2.d() * 1000);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "formatTimeInForMsg(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa b17 = cVar2.b();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = b17 != null ? b17.m76160xd133dfec() : null;
        if (!cVar2.t() && !cVar2.s()) {
            r45.ub1 g17 = cVar2.g();
            if (g17 != null && g17.m75939xb282bd08(0) == 1) {
                z17 = true;
            }
        }
        c14139x4d2f44c5.a(new jd2.e(i17, n17, m76160xd133dfec, z17, o(cVar2, null), cVar2.p()));
        c14139x4d2f44c5.m56670xc6cf6336(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dm(this, s0Var, bVar));
        return true;
    }

    public final boolean o(cd2.c cVar, java.lang.Boolean bool) {
        int i17 = this.f184803f.f184517a;
        if ((i17 == 2 || i17 == 1) && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U1().r()).intValue() != 0) {
            return (cVar.t() || !cVar.s() || (bool != null ? bool.booleanValue() : ya2.g.h(ya2.h.f542017a, cVar.q(), null, false, false, 14, null))) ? false : true;
        }
        return false;
    }
}
