package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f194873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.eg1 f194874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194875f;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, r45.eg1 eg1Var, java.lang.String str) {
        this.f194873d = v3Var;
        this.f194874e = eg1Var;
        this.f194875f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var;
        java.lang.String str2;
        java.lang.Class cls;
        jz5.f0 f0Var;
        android.view.ViewGroup viewGroup;
        r45.nw1 nw1Var;
        jz5.f0 f0Var2;
        java.lang.String str3;
        int i17;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0 j0Var;
        java.util.Map map;
        java.lang.String str4;
        java.lang.String str5;
        android.widget.TextView textView;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.util.List i18;
        r45.e02 e02Var;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String H1 = this.f194873d.H1();
        ya2.b2 b17 = ya2.h.f542017a.b(H1);
        jz5.f0 f0Var3 = null;
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i19 = ya2.d.i(b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var2 = this.f194873d;
            r45.eg1 closePageInfo = this.f194874e;
            java.lang.String str11 = this.f194875f;
            ef2.c cVar = (ef2.c) v3Var2.U0(ef2.c.class);
            jz5.f0 f0Var4 = jz5.f0.f384359a;
            if (cVar != null) {
                km2.b bVar = v3Var2.S;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closePageInfo, "closePageInfo");
                boolean w17 = zl2.r4.f555483a.w1();
                mm2.n0 n0Var = (mm2.n0) cVar.m56788xbba4bfc0(mm2.n0.class);
                boolean z17 = n0Var != null && n0Var.f410806r;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show Card, isAnchor=");
                sb6.append(w17);
                sb6.append(", isCoInvitee=");
                sb6.append(z17);
                sb6.append(", rootLayout=");
                sb6.append(cVar.f333935m != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMilestoneShareController", sb6.toString());
                if (w17 || z17) {
                    android.widget.RelativeLayout relativeLayout = cVar.f333935m;
                    if (relativeLayout != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb49 = cVar.f333936n;
                        if (c14195x2dafdb49 != null) {
                            android.view.ViewParent parent = c14195x2dafdb49.getParent();
                            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                                ((android.view.ViewGroup) parent).removeView(c14195x2dafdb49);
                            }
                            cVar.f333936n = null;
                        }
                        if (cVar.f333936n == null) {
                            if (bVar == null || (nw1Var = bVar.f390603t) == null) {
                                nw1Var = ((mm2.e1) cVar.m56788xbba4bfc0(mm2.e1.class)).f410521r;
                            }
                            int m75939xb282bd08 = nw1Var.m75939xb282bd08(4);
                            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("M月d日HH:mm", java.util.Locale.CHINESE);
                            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+08:00"));
                            cls = mm2.e1.class;
                            v3Var = v3Var2;
                            java.lang.String postSubTitle = simpleDateFormat.format(new java.util.Date(m75939xb282bd08 * 1000)) + ' ' + ((mm2.c1) cVar.m56788xbba4bfc0(mm2.c1.class)).V1;
                            android.content.Context context = relativeLayout.getContext();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb492 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49(context, null);
                            ef2.b bVar2 = new ef2.b(cVar);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postSubTitle, "postSubTitle");
                            c14195x2dafdb492.f193105d = cVar;
                            c14195x2dafdb492.f193106e = i19;
                            c14195x2dafdb492.f193107f = postSubTitle;
                            android.view.View inflate = android.view.View.inflate(c14195x2dafdb492.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570369e84, c14195x2dafdb492);
                            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bwo);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                            c14195x2dafdb492.f193109h = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594) findViewById;
                            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ugp);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                            c14195x2dafdb492.f193110i = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2;
                            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.v4a);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                            c14195x2dafdb492.f193111m = findViewById3;
                            android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.v4b);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
                            c14195x2dafdb492.f193112n = findViewById4;
                            android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.v4c);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                            c14195x2dafdb492.f193113o = findViewById5;
                            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = c14195x2dafdb492.f193110i;
                            if (c1190x18d3c3fe == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("milestonePostViewPager");
                                throw null;
                            }
                            c1190x18d3c3fe.m8323x5dd4731f((int) (40 * c14195x2dafdb492.getResources().getDisplayMetrics().density));
                            c14195x2dafdb492.f193114p = new gf2.a0();
                            java.lang.String m75945x2fec8307 = closePageInfo.m75945x2fec8307(2);
                            if (m75945x2fec8307 != null) {
                                c14195x2dafdb492.f193108g = m75945x2fec8307;
                                f0Var2 = f0Var4;
                            } else {
                                f0Var2 = null;
                            }
                            if (f0Var2 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMilestoneShareView", "empty postViewShareUrl");
                            }
                            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = c14195x2dafdb492.f193110i;
                            if (c1190x18d3c3fe2 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("milestonePostViewPager");
                                throw null;
                            }
                            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(c14195x2dafdb492.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570368e83, (android.view.ViewGroup) c1190x18d3c3fe2, false);
                            android.view.View findViewById6 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.ci6);
                            if (findViewById6 != null) {
                                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                                gradientDrawable.setShape(0);
                                gradientDrawable.setCornerRadius(c14195x2dafdb492.getResources().getDisplayMetrics().density * 20.0f);
                                f0Var = f0Var4;
                                gradientDrawable.setColor(c14195x2dafdb492.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560046v, null));
                                findViewById6.setBackground(gradientDrawable);
                            } else {
                                f0Var = f0Var4;
                            }
                            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.v4_);
                            if (textView2 != null) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\u3000\u3000");
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = c14195x2dafdb492.f193106e;
                                if (c19782x23db1cfa == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contact");
                                    throw null;
                                }
                                sb7.append(c19782x23db1cfa.m76184x8010e5e4());
                                sb7.append(' ');
                                sb7.append(c14195x2dafdb492.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572987no3));
                                textView2.setText(sb7.toString());
                            }
                            android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.v49);
                            if (textView3 != null) {
                                java.lang.String str12 = c14195x2dafdb492.f193107f;
                                if (str12 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewSubTitle");
                                    throw null;
                                }
                                textView3.setText(str12);
                            }
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f568428v46);
                            mn2.g1 g1Var = mn2.g1.f411508a;
                            if (imageView != null) {
                                vo0.d a17 = g1Var.a();
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = c14195x2dafdb492.f193106e;
                                if (c19782x23db1cfa2 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contact");
                                    throw null;
                                }
                                str = H1;
                                str2 = str11;
                                a17.c(new mn2.n(c19782x23db1cfa2.m76175x6d346f39(), null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
                            } else {
                                str = H1;
                                str2 = str11;
                            }
                            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.v47);
                            java.lang.String str13 = c14195x2dafdb492.f193108g;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0 j0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0.f197098a;
                            if (str13 != null) {
                                android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0.c(j0Var2, str13, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h0.f197064e, c14195x2dafdb492.getResources().getDisplayMetrics().density * 56.0f, 0.0f, c14195x2dafdb492.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh, null), 0, 64, null);
                                if (c17 != null && imageView2 != null) {
                                    imageView2.setImageBitmap(c17);
                                }
                            }
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate2.findViewById(com.p314xaae8f345.mm.R.id.v48);
                            if (viewGroup2 != null) {
                                ff2.c cVar2 = ff2.c.f343171a;
                                java.util.LinkedList m75941xfb821914 = closePageInfo.m75941xfb821914(0);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getPage_item_list(...)");
                                str3 = "milestonePostViewPager";
                                i17 = 1;
                                cVar2.b(m75941xfb821914, viewGroup2, true, null);
                            } else {
                                str3 = "milestonePostViewPager";
                                i17 = 1;
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            android.view.View[] viewArr = new android.view.View[i17];
                            int i27 = 0;
                            viewArr[0] = inflate2;
                            c14195x2dafdb492.f193115q = kz5.c0.d(viewArr);
                            java.util.LinkedList m75941xfb8219142 = closePageInfo.m75941xfb821914(0);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getPage_item_list(...)");
                            java.util.Iterator it = m75941xfb8219142.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                java.util.Map map2 = c14195x2dafdb492.f193116r;
                                java.lang.String str14 = "postViewList";
                                if (hasNext) {
                                    r45.fg1 fg1Var = (r45.fg1) it.next();
                                    if (fg1Var.m75939xb282bd08(i27) == 1) {
                                        r45.d02 d02Var = (r45.d02) fg1Var.m75936x14adae67(1);
                                        java.util.LinkedList m75941xfb8219143 = (d02Var == null || (e02Var = (r45.e02) d02Var.m75936x14adae67(0)) == null) ? null : e02Var.m75941xfb821914(0);
                                        if (m75941xfb8219143 != null) {
                                            java.util.Iterator it6 = m75941xfb8219143.iterator();
                                            while (it6.hasNext()) {
                                                r45.c02 c02Var = (r45.c02) it6.next();
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c02Var);
                                                java.util.Iterator it7 = it;
                                                java.util.Iterator it8 = it6;
                                                android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(c14195x2dafdb492.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e86, (android.view.ViewGroup) c1190x18d3c3fe2, false);
                                                android.widget.TextView textView4 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6a);
                                                android.widget.TextView textView5 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6g);
                                                p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = c1190x18d3c3fe2;
                                                android.widget.TextView textView6 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6h);
                                                android.widget.RelativeLayout relativeLayout2 = relativeLayout;
                                                ef2.c cVar3 = cVar;
                                                ef2.b bVar3 = bVar2;
                                                android.view.View view2 = inflate2;
                                                java.lang.String str15 = str14;
                                                if (textView4 != null) {
                                                    arrayList = arrayList3;
                                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = c14195x2dafdb492.f193106e;
                                                    if (c19782x23db1cfa3 == null) {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contact");
                                                        throw null;
                                                    }
                                                    textView4.setText(c19782x23db1cfa3.m76184x8010e5e4());
                                                    map = map2;
                                                    int m75939xb282bd082 = c02Var.m75939xb282bd08(0);
                                                    j0Var = j0Var2;
                                                    textView = textView5;
                                                    java.util.List i28 = m75939xb282bd082 != 1 ? m75939xb282bd082 != 2 ? m75939xb282bd082 != 3 ? m75939xb282bd082 != 6 ? kz5.c0.i("#FEF3B9", "#FEF3B9", "#FEF3B9") : kz5.c0.i("#FEF3B9", "#FEF3B9", "#FEF3B9") : kz5.c0.i("#CEA670", "#F9E5B8", "#CC9C59") : kz5.c0.i("#CFCFCF", "#FBFBFB", "#CFCFCF") : kz5.c0.i("#DE986C", "#EE8989", "#B84836");
                                                    str4 = "#FEF3B9";
                                                    str5 = "#DE986C";
                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(i28, 10));
                                                    java.util.Iterator it9 = i28.iterator();
                                                    while (it9.hasNext()) {
                                                        arrayList4.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it9.next())));
                                                    }
                                                    textView4.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList4), new float[]{0.0f, 0.6f, 1.0f}), textView4));
                                                } else {
                                                    arrayList = arrayList3;
                                                    j0Var = j0Var2;
                                                    map = map2;
                                                    str4 = "#FEF3B9";
                                                    str5 = "#DE986C";
                                                    textView = textView5;
                                                }
                                                if (textView != null) {
                                                    textView.setText(c02Var.m75945x2fec8307(3));
                                                    int m75939xb282bd083 = c02Var.m75939xb282bd08(0);
                                                    java.util.List i29 = m75939xb282bd083 != 1 ? m75939xb282bd083 != 2 ? m75939xb282bd083 != 3 ? m75939xb282bd083 != 6 ? kz5.c0.i("#FDE977", "#FDE977", "#FDE977") : kz5.c0.i("#FDE977", "#FDE977", "#FDE977") : kz5.c0.i("#CEA670", "#F9E5B8", "#CC9C59") : kz5.c0.i("#CACACA", "#FFFFFF", "#C8C8C8") : kz5.c0.i("#E29E73", "#EEB189", "#C77960");
                                                    str6 = "#EEB189";
                                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(i29, 10));
                                                    java.util.Iterator it10 = i29.iterator();
                                                    while (it10.hasNext()) {
                                                        arrayList5.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it10.next())));
                                                    }
                                                    textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList5), new float[]{0.0f, 0.6f, 1.0f}), textView));
                                                } else {
                                                    str6 = "#EEB189";
                                                }
                                                if (textView6 != null) {
                                                    textView6.setText(c02Var.m75945x2fec8307(1));
                                                    int m75939xb282bd084 = c02Var.m75939xb282bd08(0);
                                                    java.util.List i37 = m75939xb282bd084 != 1 ? m75939xb282bd084 != 2 ? m75939xb282bd084 != 3 ? m75939xb282bd084 != 6 ? kz5.c0.i("#FFF09D", "#FFF09D", "#FFF09D") : kz5.c0.i("#FFF09D", "#FFF09D", "#FFF09D") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#B19696", "#FFF2F2", "#966D6D") : kz5.c0.i("#DE7E6C", "#FFC7BA", "#B84836");
                                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(i37, 10));
                                                    java.util.Iterator it11 = i37.iterator();
                                                    while (it11.hasNext()) {
                                                        arrayList6.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it11.next())));
                                                    }
                                                    textView6.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.v1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList6), new float[]{0.0f, 0.6f, 1.0f}), textView6));
                                                }
                                                android.view.View findViewById7 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.ci6);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y1.f197284a;
                                                if (findViewById7 != null) {
                                                    float f17 = c14195x2dafdb492.getResources().getDisplayMetrics().density * 2.0f;
                                                    float f18 = c14195x2dafdb492.getResources().getDisplayMetrics().density * 40.0f;
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 u1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(ff2.a.f343169d);
                                                    int m75939xb282bd085 = c02Var.m75939xb282bd08(0);
                                                    if (m75939xb282bd085 == 1) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#EAAB82", "#A77979", "#A97D7D", "#49352E");
                                                    } else if (m75939xb282bd085 == 2) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#5F5F5F", "#AE9C9C", "#9E8484", "#312A2A");
                                                    } else if (m75939xb282bd085 != 3) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = m75939xb282bd085 != 6 ? kz5.c0.i("#5D4E11", "#9D9143", "#C6BD8E", "#3E3A1A") : kz5.c0.i("#5D4E11", "#9D9143", "#C6BD8E", "#3E3A1A");
                                                    } else {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#615B4F", "#A29982", "#A09780", "#372E23");
                                                    }
                                                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(i18, 10));
                                                    java.util.Iterator it12 = i18.iterator();
                                                    while (it12.hasNext()) {
                                                        arrayList7.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it12.next())));
                                                    }
                                                    android.graphics.drawable.Drawable a18 = y1Var.a(u1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList7), new float[]{0.0f, 0.14f, 0.23f, 1.0f}), f18, f17);
                                                    if (a18 != null) {
                                                        findViewById7.setBackground(a18);
                                                    }
                                                } else {
                                                    str7 = "#FFFFFF";
                                                    str8 = "#CEA670";
                                                    str9 = "#CC9C59";
                                                    str10 = "#F9E5B8";
                                                }
                                                android.widget.ImageView imageView3 = (android.widget.ImageView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v69);
                                                if (imageView3 != null) {
                                                    vo0.d a19 = g1Var.a();
                                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = c14195x2dafdb492.f193106e;
                                                    if (c19782x23db1cfa4 == null) {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contact");
                                                        throw null;
                                                    }
                                                    a19.c(new mn2.n(c19782x23db1cfa4.m76175x6d346f39(), null, 2, null), imageView3, g1Var.h(mn2.f1.f411490h));
                                                }
                                                android.view.View findViewById8 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6_);
                                                if (findViewById8 != null) {
                                                    float f19 = c14195x2dafdb492.getResources().getDisplayMetrics().density * 2.0f;
                                                    float f27 = c14195x2dafdb492.getResources().getDisplayMetrics().density * 25.0f;
                                                    int m75939xb282bd086 = c02Var.m75939xb282bd08(0);
                                                    java.util.List c18 = m75939xb282bd086 != 1 ? m75939xb282bd086 != 2 ? m75939xb282bd086 != 3 ? m75939xb282bd086 != 6 ? kz5.b0.c("#A19881") : kz5.b0.c("#A19881") : kz5.c0.i(str8, str10, str9) : kz5.c0.i("#D1D1D1", str7, "#C9C9C9") : kz5.c0.i(str5, str6, "#AD5344");
                                                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(c18, 10));
                                                    java.util.Iterator it13 = c18.iterator();
                                                    while (it13.hasNext()) {
                                                        arrayList8.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it13.next())));
                                                    }
                                                    android.graphics.drawable.Drawable a27 = y1Var.a(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1(kz5.n0.R0(arrayList8), null), f27, f19);
                                                    if (a27 != null) {
                                                        findViewById8.setBackground(a27);
                                                    }
                                                }
                                                android.widget.ImageView imageView4 = (android.widget.ImageView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6c);
                                                int m75939xb282bd087 = c02Var.m75939xb282bd08(0);
                                                int parseColor = m75939xb282bd087 != 1 ? m75939xb282bd087 != 2 ? m75939xb282bd087 != 3 ? m75939xb282bd087 != 6 ? android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor("#F8E3B7") : android.graphics.Color.parseColor("#D2CDCD") : android.graphics.Color.parseColor("#F6B394");
                                                java.lang.String str16 = c14195x2dafdb492.f193108g;
                                                if (str16 != null) {
                                                    android.graphics.Bitmap c19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0.c(j0Var, str16, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h0.f197063d, c14195x2dafdb492.getResources().getDisplayMetrics().density * 56.0f, 0.0f, parseColor, 0, 64, null);
                                                    if (c19 != null && imageView4 != null) {
                                                        imageView4.setImageBitmap(c19);
                                                    }
                                                }
                                                int m75939xb282bd088 = c02Var.m75939xb282bd08(0);
                                                int parseColor2 = m75939xb282bd088 != 1 ? m75939xb282bd088 != 2 ? m75939xb282bd088 != 3 ? m75939xb282bd088 != 6 ? android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor("#F4DDAF") : android.graphics.Color.parseColor("#FDFDFD") : android.graphics.Color.parseColor("#F6A884");
                                                android.widget.TextView textView7 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6i);
                                                if (textView7 != null) {
                                                    textView7.setText(c02Var.m75945x2fec8307(12));
                                                    textView7.setTextColor(parseColor2);
                                                    textView7.setAlpha(0.5f);
                                                }
                                                android.widget.TextView textView8 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6e);
                                                if (textView8 != null) {
                                                    textView8.setTextColor(parseColor2);
                                                    textView8.setAlpha(0.8f);
                                                }
                                                android.widget.TextView textView9 = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6d);
                                                if (textView9 != null) {
                                                    textView9.setTextColor(parseColor2);
                                                    textView9.setAlpha(0.3f);
                                                }
                                                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) inflate3.findViewById(com.p314xaae8f345.mm.R.id.v6f);
                                                if (c22789xd23e9a9b != null) {
                                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703 = c14195x2dafdb492.f193105d;
                                                    if (abstractC14196xf9d9d703 == null) {
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
                                                        throw null;
                                                    }
                                                    p3325xe03a0797.p3326xc267989b.l.d(abstractC14196xf9d9d703.getStore().getLiveRoomData().f354008i, null, null, new gf2.c(c02Var, c14195x2dafdb492, c22789xd23e9a9b, inflate3, null), 3, null);
                                                }
                                                java.util.ArrayList arrayList9 = c14195x2dafdb492.f193115q;
                                                if (arrayList9 == null) {
                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str15);
                                                    throw null;
                                                }
                                                arrayList9.add(inflate3);
                                                c14195x2dafdb492.e(inflate3);
                                                java.lang.String valueOf = java.lang.String.valueOf(c02Var.m75939xb282bd08(9));
                                                gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) map).get(inflate3);
                                                if (zVar != null) {
                                                    zVar.f352859a = valueOf;
                                                }
                                                java.util.ArrayList arrayList10 = arrayList;
                                                arrayList10.add(valueOf);
                                                arrayList3 = arrayList10;
                                                it = it7;
                                                it6 = it8;
                                                c1190x18d3c3fe2 = c1190x18d3c3fe3;
                                                relativeLayout = relativeLayout2;
                                                cVar = cVar3;
                                                bVar2 = bVar3;
                                                inflate2 = view2;
                                                str14 = str15;
                                                map2 = map;
                                                j0Var2 = j0Var;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    arrayList3 = arrayList3;
                                    it = it;
                                    c1190x18d3c3fe2 = c1190x18d3c3fe2;
                                    relativeLayout = relativeLayout;
                                    cVar = cVar;
                                    bVar2 = bVar2;
                                    inflate2 = inflate2;
                                    j0Var2 = j0Var2;
                                    i27 = 0;
                                } else {
                                    java.util.ArrayList arrayList11 = arrayList3;
                                    ef2.c cVar4 = cVar;
                                    ef2.b bVar4 = bVar2;
                                    android.widget.RelativeLayout relativeLayout3 = relativeLayout;
                                    android.view.View view3 = inflate2;
                                    c14195x2dafdb492.e(view3);
                                    gf2.z zVar2 = (gf2.z) ((java.util.LinkedHashMap) map2).get(view3);
                                    if (zVar2 != null) {
                                        zVar2.f352859a = kz5.n0.g0(arrayList11, "#", null, null, 0, null, null, 62, null);
                                    }
                                    c14195x2dafdb492.f193117s = 0;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f594 = c14195x2dafdb492.f193109h;
                                    if (c14288xbc18f594 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("circleIndicator");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList12 = c14195x2dafdb492.f193115q;
                                    if (arrayList12 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewList");
                                        throw null;
                                    }
                                    int size = arrayList12.size();
                                    if (c14288xbc18f594.f196957d != size) {
                                        c14288xbc18f594.f196957d = size;
                                        c14288xbc18f594.requestLayout();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f5942 = c14195x2dafdb492.f193109h;
                                    if (c14288xbc18f5942 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("circleIndicator");
                                        throw null;
                                    }
                                    c14288xbc18f5942.a(c14195x2dafdb492.f193117s);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14288xbc18f594 c14288xbc18f5943 = c14195x2dafdb492.f193109h;
                                    if (c14288xbc18f5943 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("circleIndicator");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList13 = c14195x2dafdb492.f193115q;
                                    if (arrayList13 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewList");
                                        throw null;
                                    }
                                    c14288xbc18f5943.setVisibility(arrayList13.size() > 1 ? 0 : 4);
                                    gf2.a0 a0Var = c14195x2dafdb492.f193114p;
                                    if (a0Var == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagerAdapter");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList14 = c14195x2dafdb492.f193115q;
                                    if (arrayList14 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postViewList");
                                        throw null;
                                    }
                                    a0Var.f352791d = arrayList14;
                                    a0Var.mo8343xced61ae5();
                                    p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = c14195x2dafdb492.f193110i;
                                    if (c1190x18d3c3fe4 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str3);
                                        throw null;
                                    }
                                    gf2.a0 a0Var2 = c14195x2dafdb492.f193114p;
                                    if (a0Var2 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagerAdapter");
                                        throw null;
                                    }
                                    c1190x18d3c3fe4.m8315x6cab2c8d(a0Var2);
                                    p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe5 = c14195x2dafdb492.f193110i;
                                    if (c1190x18d3c3fe5 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str3);
                                        throw null;
                                    }
                                    c1190x18d3c3fe5.m8289xa5a25773(new gf2.k(c14195x2dafdb492));
                                    android.view.View view4 = c14195x2dafdb492.f193111m;
                                    if (view4 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
                                        throw null;
                                    }
                                    view4.setOnClickListener(new gf2.l(bVar4));
                                    android.view.View view5 = c14195x2dafdb492.f193112n;
                                    if (view5 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveBtn");
                                        throw null;
                                    }
                                    ym5.a1.h(view5, new gf2.m(c14195x2dafdb492));
                                    android.view.View view6 = c14195x2dafdb492.f193112n;
                                    if (view6 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveBtn");
                                        throw null;
                                    }
                                    view6.setOnClickListener(new gf2.o(c14195x2dafdb492));
                                    android.view.View view7 = c14195x2dafdb492.f193113o;
                                    if (view7 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
                                        throw null;
                                    }
                                    ym5.a1.h(view7, new gf2.p(c14195x2dafdb492));
                                    android.view.View view8 = c14195x2dafdb492.f193113o;
                                    if (view8 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareBtn");
                                        throw null;
                                    }
                                    view8.setOnClickListener(new gf2.r(c14195x2dafdb492));
                                    cVar4.f333936n = c14195x2dafdb492;
                                    relativeLayout3.removeAllViews();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1485x1fb0fe64.p1486x373aa5.C14195x2dafdb49 c14195x2dafdb493 = cVar4.f333936n;
                                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                                    layoutParams.addRule(13, -1);
                                    viewGroup = relativeLayout3;
                                    viewGroup.addView(c14195x2dafdb493, layoutParams);
                                }
                            }
                        } else {
                            str = H1;
                            v3Var = v3Var2;
                            str2 = str11;
                            cls = mm2.e1.class;
                            viewGroup = relativeLayout;
                            f0Var = f0Var4;
                        }
                        viewGroup.setVisibility(0);
                        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                        ml2.t1 t1Var = ml2.t1.f409512q2;
                        long m75942xfb822ef2 = ((mm2.e1) v3Var.P0(cls)).f410521r.m75942xfb822ef2(0);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("milestone", str2);
                        r0Var.mk(t1Var, str, m75942xfb822ef2, hashMap);
                        f0Var3 = f0Var;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveAnchorMilestoneShareController", "showCard ignored: neither anchor nor co-live invitee");
                }
            }
            str = H1;
            v3Var = v3Var2;
            str2 = str11;
            cls = mm2.e1.class;
            f0Var = f0Var4;
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.t1 t1Var2 = ml2.t1.f409512q2;
            long m75942xfb822ef22 = ((mm2.e1) v3Var.P0(cls)).f410521r.m75942xfb822ef2(0);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("milestone", str2);
            r0Var2.mk(t1Var2, str, m75942xfb822ef22, hashMap2);
            f0Var3 = f0Var;
        } else {
            str = H1;
        }
        if (f0Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "clickShareMilestone: finder contact is null, username=" + str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
