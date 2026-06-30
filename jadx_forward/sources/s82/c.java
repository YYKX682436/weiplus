package s82;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f486270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f486271b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f486272c;

    /* renamed from: d, reason: collision with root package name */
    public final s82.f f486273d = new s82.f();

    /* renamed from: e, reason: collision with root package name */
    public s82.i f486274e = null;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra raVar) {
        this.f486272c = null;
        this.f486272c = raVar;
        this.f486271b = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561309ex);
        this.f486270a = i65.a.h(raVar.f182917a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561309ex);
    }

    public static boolean h(android.view.View view, int i17) {
        return i(view, i17, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(android.view.View r4, int r5, r45.gp0 r6) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.c.i(android.view.View, int, r45.gp0):boolean");
    }

    public static boolean j(android.view.View view, o72.r2 r2Var) {
        if (r2Var == null) {
            return false;
        }
        return i(view, r2Var.f67657x2262335f, null);
    }

    public android.view.View a(android.view.View view, s82.g gVar, o72.r2 r2Var) {
        if (view == null) {
            throw new java.lang.NullPointerException("base item view is null");
        }
        if (gVar == null) {
            throw new java.lang.NullPointerException("base holder is null");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f565864dx1);
        gVar.f486308b = c22699x3dcdb352;
        if (c22699x3dcdb352 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_type_iv");
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dvd);
        gVar.f486309c = textView;
        if (textView == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_name");
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.t_0);
        gVar.f486310d = textView2;
        if (textView2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_auhtor");
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.t__);
        gVar.f486311e = findViewById;
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_name_divider");
        }
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dx6);
        gVar.f486312f = textView3;
        if (textView3 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_version_info");
        }
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dwo);
        gVar.f486313g = textView4;
        if (textView4 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_time");
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.dv8);
        gVar.f486317k = linearLayout;
        if (linearLayout == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18 c21475x81dbaa18 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18) view.findViewById(com.p314xaae8f345.mm.R.id.dwk);
        gVar.f486318l = c21475x81dbaa18;
        if (c21475x81dbaa18 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.t_2);
        gVar.f486319m = viewGroup;
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_clean_mode_edit_view");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.sst);
        gVar.f486320n = viewGroup2;
        if (viewGroup2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named clean_mode_delete_btn");
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.t_4);
        gVar.f486321o = findViewById2;
        if (findViewById2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_data_size_area");
        }
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.t_a);
        gVar.f486322p = textView5;
        if (textView5 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_size_tv");
        }
        if (this.f486273d.f486301f && o72.x1.g0()) {
            gVar.f486314h = (android.widget.CheckBox) gVar.f486319m.findViewById(com.p314xaae8f345.mm.R.id.t_1);
        } else {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.dtq);
            gVar.f486314h = checkBox;
            if (checkBox == null) {
                throw new java.lang.IllegalArgumentException("base item view do not contain id named checkbox");
            }
        }
        gVar.f486314h.setOnCheckedChangeListener(new s82.d(this));
        gVar.f486307a = r2Var;
        view.setTag(gVar);
        gVar.f486315i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.dwi);
        android.widget.TextView textView6 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dwh);
        gVar.f486316j = textView6;
        textView6.setOnClickListener(new s82.e(this));
        return view;
    }

    public void b(android.view.ViewGroup viewGroup) {
        float f17;
        float f18;
        if (viewGroup == null) {
            return;
        }
        s82.f fVar = this.f486273d;
        if (fVar.f486298c || fVar.f486301f) {
            f17 = viewGroup.getContext().getResources().getDisplayMetrics().density;
            f18 = 92.0f;
        } else {
            f17 = viewGroup.getContext().getResources().getDisplayMetrics().density;
            f18 = 56.0f;
        }
        this.f486270a = (int) ((viewGroup.getWidth() - (f17 * f18)) / 3.0f);
    }

    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        return "";
    }

    public java.lang.Integer d(r45.gp0 gp0Var) {
        return null;
    }

    public abstract android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var);

    public abstract void f(android.view.View view, r45.dq0 dq0Var);

    public void g(s82.g gVar, final o72.r2 r2Var) {
        java.lang.String str;
        s82.f fVar;
        java.util.ArrayList arrayList;
        s82.f fVar2;
        java.lang.String str2;
        s82.g gVar2 = gVar;
        gVar2.f486307a = r2Var;
        android.widget.TextView textView = gVar2.f486313g;
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.a(textView.getContext(), gVar2.f486307a.f67659xa783a79b));
        android.content.Context context = gVar2.f486309c.getContext();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(gVar2.f486307a.f67642xd3939c3a);
        o72.r2 r2Var2 = gVar2.f486307a;
        r45.bq0 bq0Var = r2Var2.f67640x5ab01132;
        if (bq0Var != null) {
            r45.jq0 jq0Var = bq0Var.f452495d;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r2Var2.f67642xd3939c3a)) {
                str = o72.x1.w(jq0Var.f459569f);
                if (str == null || str.isEmpty()) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvr);
                }
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(gVar2.f486307a.f67655x1209e7cb)) {
                str = o72.x1.w(jq0Var.f459571h);
                if (str == null || str.isEmpty()) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvr);
                }
            } else {
                java.lang.String str3 = gVar2.f486307a.f67642xd3939c3a;
                str = (str3 == null || str3.isEmpty() || (str2 = gVar2.f486307a.f67655x1209e7cb) == null || str2.isEmpty()) ? o72.x1.w(jq0Var.f459569f) : c01.z1.r().equals(jq0Var.f459571h) ? o72.x1.w(jq0Var.f459569f) : o72.x1.w(jq0Var.f459571h);
            }
        } else {
            str = "";
        }
        java.lang.String c17 = c(gVar2, gVar2.f486307a);
        int i17 = 0;
        if (c17 == null || c17.isEmpty()) {
            gVar2.f486310d.setVisibility(8);
            android.view.View view = gVar2.f486311e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            gVar2.f486310d.setVisibility(0);
            gVar2.f486310d.setText(c17);
            if (str == null || str.isEmpty()) {
                android.view.View view2 = gVar2.f486311e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view3 = gVar2.f486311e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView2 = gVar2.f486309c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = gVar2.f486309c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        if (gVar2.f486307a.P0()) {
            gVar2.f486315i.setVisibility(0);
        } else {
            gVar2.f486315i.setVisibility(8);
        }
        gVar2.f486314h.setTag(r2Var);
        s82.f fVar3 = this.f486273d;
        if (fVar3.f486298c || fVar3.f486301f) {
            gVar2.f486314h.setVisibility(0);
            if (r2Var.B1) {
                gVar2.f486314h.setChecked(fVar3.f486299d.get(r2Var.D1) != null);
            } else {
                gVar2.f486314h.setChecked(fVar3.f486299d.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f1(java.lang.Long.valueOf(r2Var.f67645x88be67a1))) != null);
            }
        } else {
            gVar2.f486314h.setVisibility(8);
        }
        gVar2.f486316j.setTag(r2Var);
        if (fVar3.f486301f) {
            gVar2.f486318l.setVisibility(8);
            fVar = fVar3;
        } else {
            android.widget.LinearLayout linearLayout = gVar2.f486317k;
            linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = linearLayout.getMeasuredWidth();
            linearLayout.getMeasuredHeight();
            android.content.Context context2 = linearLayout.getContext();
            int b17 = (int) ym5.x.b(context2, measuredWidth);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "renderTag widthDp = " + b17);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.LinkedList linkedList = r2Var.f67653xef67d413.f466630f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "tagIdList = " + linkedList + ", tagList = " + arrayList5);
            if (linkedList.size() > 0) {
                t72.b bVar = t72.b.f497573a;
                p75.i0 i18 = dm.q3.f320917f.i();
                i18.f434190d = dm.q3.f320918g.k(linkedList);
                i18.f434189c = "MicroMsg.SDK.BaseFavTagInfo";
                p75.l0 a17 = i18.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryByIds] sql = " + a17);
                java.util.ArrayList arrayList6 = (java.util.ArrayList) a17.k(t72.b.f497574b, t72.a.class);
                if (arrayList6.isEmpty()) {
                    arrayList5.addAll(r2Var.f67653xef67d413.f466629e);
                } else {
                    for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                        arrayList5.add(((t72.a) arrayList6.get(i19)).f68044x225f1eb0);
                    }
                }
            } else {
                arrayList5.addAll(r2Var.f67653xef67d413.f466629e);
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            int i27 = 0;
            int i28 = 0;
            while (i27 < arrayList5.size()) {
                final java.lang.String str4 = (java.lang.String) arrayList5.get(i27);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    fVar2 = fVar3;
                    arrayList = arrayList5;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "field_tagProto.userDefList [ " + i27 + " ] : " + str4);
                    android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context2);
                    linearLayout2.setOrientation(i17);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    float f17 = (float) 10;
                    arrayList = arrayList5;
                    linearLayout2.setPadding(0, 0, ym5.x.a(context2, f17), 0);
                    linearLayout2.setLayoutParams(layoutParams);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context2);
                    int a18 = ym5.x.a(context2, 16);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(a18, a18);
                    layoutParams2.gravity = 17;
                    c22699x3dcdb352.setLayoutParams(layoutParams2);
                    c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79107x6ae9151d);
                    c22699x3dcdb352.m82040x7541828(i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
                    android.widget.TextView textView3 = new android.widget.TextView(context2);
                    fVar2 = fVar3;
                    android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.leftMargin = ym5.x.a(context2, 5);
                    textView3.setLayoutParams(layoutParams3);
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    textView3.setTextSize(12);
                    textView3.setSingleLine(true);
                    textView3.setTextColor(i65.a.d(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp));
                    textView3.setText(str4);
                    textView3.measure(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth2 = textView3.getMeasuredWidth();
                    linearLayout2.addView(c22699x3dcdb352);
                    linearLayout2.addView(textView3);
                    android.util.Pair pair = new android.util.Pair(linearLayout2, java.lang.Integer.valueOf((int) (21 + ym5.x.b(context2, measuredWidth2) + f17)));
                    arrayList7.add((android.view.View) pair.first);
                    if (this.f486274e != null) {
                        ((android.view.View) pair.first).setOnClickListener(new android.view.View.OnClickListener() { // from class: s82.c$$b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view4) {
                                s82.c cVar = s82.c.this;
                                cVar.getClass();
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.String str5 = str4;
                                arrayList8.add(str5);
                                arrayList8.add(view4);
                                java.lang.Object[] array = arrayList8.toArray();
                                arrayList8.clear();
                                yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                                cVar.f486274e.a(str5);
                                yj0.a.h(cVar, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "tag name = " + str4 + ", set on tag click listener");
                    }
                    i28 += ((java.lang.Integer) pair.second).intValue();
                }
                i27++;
                arrayList5 = arrayList;
                fVar3 = fVar2;
                i17 = 0;
            }
            fVar = fVar3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavBaseListItem", "totalWidthDp = " + i28 + " , tagListFL widthDp = " + b17);
            linearLayout.removeAllViews();
            gVar2 = gVar;
            gVar2.f486318l.removeAllViews();
            for (int i29 = 0; i29 < arrayList7.size(); i29++) {
                final android.view.View view4 = (android.view.View) arrayList7.get(i29);
                int f18 = i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                int i37 = f18 / 2;
                view4.setPadding(0, i37, f18 * 2, i37);
                if (i28 < b17) {
                    gVar2.f486318l.setVisibility(8);
                    linearLayout.addView(view4);
                } else {
                    gVar2.f486318l.setVisibility(0);
                    gVar2.f486318l.addView((android.view.View) arrayList7.get(i29));
                }
                final int f19 = i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                final android.view.View view5 = (android.view.View) view4.getParent();
                view5.post(new java.lang.Runnable() { // from class: s82.c$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        android.view.View view6 = view4;
                        view6.getHitRect(rect);
                        int i38 = rect.top;
                        int i39 = f19;
                        rect.top = i38 - i39;
                        rect.bottom += i39;
                        rect.left -= i39;
                        rect.right += i39;
                        view5.setTouchDelegate(new android.view.TouchDelegate(rect, view6));
                    }
                });
            }
        }
        java.lang.Integer d17 = d(o72.x1.J(r2Var));
        if (d17 != null) {
            gVar2.f486308b.setVisibility(0);
            gVar2.f486308b.s(d17.intValue(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        } else {
            gVar2.f486308b.setVisibility(8);
        }
        s82.f fVar4 = fVar;
        if (fVar4.f486301f && o72.x1.g0()) {
            gVar2.f486319m.setVisibility(0);
            if (fVar4.f486302g) {
                gVar2.f486314h.setVisibility(0);
                gVar2.f486320n.setVisibility(8);
            } else {
                gVar2.f486314h.setVisibility(8);
                gVar2.f486320n.setVisibility(0);
            }
            gVar2.f486320n.setOnClickListener(new android.view.View.OnClickListener() { // from class: s82.c$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    s82.c cVar = s82.c.this;
                    cVar.getClass();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    o72.r2 r2Var3 = r2Var;
                    arrayList8.add(r2Var3);
                    arrayList8.add(view6);
                    java.lang.Object[] array = arrayList8.toArray();
                    arrayList8.clear();
                    yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a4 a4Var = cVar.f486273d.f486303h;
                    if (a4Var != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722) a4Var;
                        db5.e1.A(activityC13563x72179722.mo55332x76847179(), activityC13563x72179722.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_h), "", activityC13563x72179722.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9d), activityC13563x72179722.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y0(activityC13563x72179722, r2Var3), null);
                    }
                    yj0.a.h(cVar, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            gVar2.f486319m.setVisibility(8);
        }
        if (!fVar4.f486301f) {
            android.view.View view6 = gVar2.f486321o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = gVar2.f486321o;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view7, arrayList9.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gVar2.f486322p.setText(o72.x1.V(gVar2.f486307a.f67637x73e2be56));
    }

    public void k(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        int i17 = this.f486270a;
        layoutParams.width = i17;
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
    }
}
