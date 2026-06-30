package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.h f229926f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f229927g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f229928h;

    /* renamed from: i, reason: collision with root package name */
    public final int f229929i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f229924d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public android.util.SparseArray f229925e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f229930m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f229931n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f229932o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f229933p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f229934q = false;

    public i(android.content.Context context, int i17) {
        this.f229927g = context;
        this.f229929i = i17;
        this.f229928h = android.view.LayoutInflater.from(context);
    }

    public static boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = c19100xad1ade2c.f261360o;
        return (c19101x8593f27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261369i) || !g(c19100xad1ade2c) || bt4.g.b().c(c19100xad1ade2c.f261352d) == null) ? false : true;
    }

    public static boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c17 = bt4.g.b().c(c19100xad1ade2c.f261352d);
        if (c17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f261367g) && c17.f261367g.equals(c19100xad1ade2c.f261360o.f261367g)) {
            return "0".equals(c17.f261364d);
        }
        java.lang.String str = c19100xad1ade2c.f261360o.f261367g;
        bt4.g.b().a(c19100xad1ade2c.f261360o);
        return true;
    }

    public final void a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g gVar, int i17, int i18) {
        if (view == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e) view.getTag();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = gVar.f229914a;
        int i19 = gVar.f229915b;
        eVar.f229894f = c19100xad1ade2c.f261356h;
        hf3.f.a(eVar.f229890b, c19100xad1ade2c.f261355g, com.p314xaae8f345.mm.R.raw.f80569x6cf816d3);
        eVar.f229892d.setText(c19100xad1ade2c.f261353e);
        eVar.f229891c.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = c19100xad1ade2c.f261360o;
        if (c19101x8593f27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261369i) || !g(c19100xad1ade2c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f272 = c19100xad1ade2c.f261360o;
            if (c19101x8593f272 == null || c19101x8593f272.f261374q != 1) {
                eVar.f229893e.setText("");
                eVar.f229893e.setVisibility(8);
            } else {
                eVar.f229893e.setText(c19101x8593f272.f261369i);
                eVar.f229893e.setVisibility(0);
            }
            eVar.f229891c.setImageBitmap(null);
            eVar.f229891c.setVisibility(8);
            eVar.f229889a.setTag(com.p314xaae8f345.mm.R.id.nwn, c19100xad1ade2c.f261353e);
        } else {
            if (bt4.g.b().c(c19100xad1ade2c.f261352d) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FunctionListAdapter", "show the news : " + bt4.g.b().c(c19100xad1ade2c.f261352d).f261369i);
                eVar.f229893e.setText(c19100xad1ade2c.f261360o.f261369i);
                eVar.f229893e.setVisibility(0);
            } else {
                eVar.f229893e.setVisibility(8);
            }
            hf3.f.a(eVar.f229891c, eVar.f229894f, 0);
            eVar.f229891c.setVisibility(0);
            eVar.f229889a.setTag(com.p314xaae8f345.mm.R.id.nwn, c19100xad1ade2c.f261353e + this.f229927g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571337c6));
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.d(this, i19, c19100xad1ade2c));
        android.view.View view2 = eVar.f229889a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setEnabled(true);
        view.setClickable(true);
        view.setFocusable(true);
        eVar.f229898j.setVisibility(4);
        if (i17 == 0) {
            eVar.f229896h.setVisibility(0);
        } else if (i17 == 1) {
            eVar.f229896h.setVisibility(0);
        } else if (i17 == 2) {
            eVar.f229896h.setVisibility(4);
        }
        if (i18 == 0) {
            eVar.f229895g.setVisibility(0);
            eVar.f229897i.setVisibility(4);
        } else if (i18 == 1) {
            eVar.f229895g.setVisibility(4);
            eVar.f229897i.setVisibility(0);
        } else {
            eVar.f229895g.setVisibility(0);
            eVar.f229897i.setVisibility(0);
        }
    }

    public final void c(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f fVar, int i18) {
        boolean z17;
        android.view.View.OnClickListener onClickListener;
        android.view.View view;
        boolean z18;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f229924d;
        java.util.List list = (java.util.List) arrayList.get(i17);
        int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) list.get(0)).f229914a.f261361p;
        android.view.View.OnClickListener onClickListener2 = null;
        if (list.size() > 0) {
            int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) list.get(0)).f229914a.f261361p;
            android.util.SparseArray sparseArray = this.f229925e;
            java.lang.String str = sparseArray == null ? null : (java.lang.String) sparseArray.get(i27);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                z17 = false;
                z18 = false;
            } else {
                if (i17 != 0) {
                    int i28 = i17 - 1;
                    if (((java.util.ArrayList) arrayList.get(i28)).size() <= 0 || i27 == ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) ((java.util.ArrayList) arrayList.get(i28)).get(0)).f229914a.f261361p) {
                        z18 = false;
                        z17 = i17 == arrayList.size() - 1 || i27 != ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) ((java.util.ArrayList) arrayList.get(i17 + 1)).get(0)).f229914a.f261361p;
                    }
                }
                z18 = true;
                if (i17 == arrayList.size() - 1) {
                }
            }
            if (z18) {
                fVar.f229903b.setText(str);
                fVar.f229903b.setVisibility(0);
                android.view.View view2 = fVar.f229904c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = fVar.f229905d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fVar.f229903b.setMinHeight(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c);
                fVar.f229905d.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.a());
            } else {
                fVar.f229903b.setVisibility(8);
                android.view.View view4 = fVar.f229904c;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = fVar.f229905d;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            fVar.f229903b.setVisibility(8);
            android.view.View view6 = fVar.f229904c;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = fVar.f229905d;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        android.view.ViewGroup viewGroup = fVar.f229902a;
        viewGroup.setFocusable(true);
        int i29 = 0;
        while (i29 < 3) {
            if (i29 >= viewGroup.getChildCount() || viewGroup.getChildAt(i29) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e(this);
                android.view.View inflate = this.f229928h.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvz, viewGroup, false);
                eVar.f229889a = inflate.findViewById(com.p314xaae8f345.mm.R.id.j9t);
                eVar.f229890b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9q);
                eVar.f229892d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9v);
                eVar.f229893e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9p);
                eVar.f229891c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k9w);
                eVar.f229895g = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1v);
                eVar.f229896h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1t);
                eVar.f229897i = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1f);
                eVar.f229898j = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.d1n);
                inflate.setTag(eVar);
                if (i29 < list.size()) {
                    a(inflate, (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) list.get(i29), i29, i18);
                    onClickListener = null;
                } else {
                    inflate.setFocusable(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e eVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e) inflate.getTag();
                    android.view.View view8 = eVar2.f229889a;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList8.add(4);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    onClickListener = null;
                    inflate.setOnClickListener(null);
                    inflate.setEnabled(false);
                    inflate.setClickable(false);
                    eVar2.f229895g.setVisibility(0);
                    eVar2.f229896h.setVisibility(4);
                    eVar2.f229897i.setVisibility(4);
                    eVar2.f229898j.setVisibility(4);
                }
                viewGroup.addView(inflate, new android.widget.LinearLayout.LayoutParams(-2, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d, 1.0f));
                view = inflate;
            } else {
                view = viewGroup.getChildAt(i29);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (i29 < list.size()) {
                    a(view, (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.g) list.get(i29), i29, i18);
                } else {
                    viewGroup.getChildAt(i29).setFocusable(false);
                    viewGroup.getChildAt(i29).setOnClickListener(onClickListener2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e eVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.e) viewGroup.getChildAt(i29).getTag();
                    android.view.View view9 = eVar3.f229889a;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(4);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view9, arrayList10.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setEnabled(false);
                    view.setClickable(false);
                    eVar3.f229895g.setVisibility(0);
                    eVar3.f229896h.setVisibility(4);
                    eVar3.f229897i.setVisibility(4);
                    eVar3.f229898j.setVisibility(4);
                }
                onClickListener = null;
            }
            android.content.Context context = this.f229927g;
            if (i18 != 0 || !z17) {
                view.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anj));
            } else if (i29 == 0) {
                view.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anf));
            } else if (i29 == 1) {
                view.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anj));
            } else {
                view.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ang));
            }
            i29++;
            onClickListener2 = onClickListener;
        }
    }

    public final boolean f(int i17) {
        if (this.f229931n <= 9) {
            return false;
        }
        int i18 = 0;
        for (int i19 = 0; i19 <= i17; i19++) {
            i18 += ((java.util.ArrayList) ((java.util.ArrayList) this.f229924d).get(i19)).size();
        }
        int i27 = this.f229932o;
        int i28 = i27 <= 3 ? i27 : 3;
        if (i18 < 9) {
            return false;
        }
        boolean z17 = this.f229930m;
        return (z17 && i17 == i28) || (i17 == i27 && !z17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f229924d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f fVar;
        android.view.View view2;
        int i19;
        boolean f17 = f(i17);
        if (this.f229931n > 9) {
            i18 = this.f229932o;
            if (i18 > 3) {
                i18 = 3;
            }
        } else {
            i18 = -1;
        }
        int i27 = f17 ? 1 : (f17 || (i19 = i17 + 1) >= ((java.util.ArrayList) this.f229924d).size()) ? false : f(i19) ? 2 : 0;
        if (view == null) {
            fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f(this);
            view2 = this.f229928h.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvs, viewGroup, false);
            fVar.f229902a = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.j9j);
            fVar.f229903b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j9i);
            fVar.f229904c = view2.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            fVar.f229905d = view2.findViewById(com.p314xaae8f345.mm.R.id.i2a);
            fVar.f229906e = view2.findViewById(com.p314xaae8f345.mm.R.id.jay);
            fVar.f229908g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jaz);
            fVar.f229907f = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.jax);
            fVar.f229909h = view2.findViewById(com.p314xaae8f345.mm.R.id.f567510jr3);
            fVar.f229910i = view2.findViewById(com.p314xaae8f345.mm.R.id.auc);
            fVar.f229906e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.c(this));
            view2.setTag(fVar);
        } else {
            fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f) view.getTag();
            view2 = view;
        }
        if (f17) {
            fVar.f229903b.setVisibility(8);
            android.view.View view3 = fVar.f229904c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = fVar.f229905d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = fVar.f229906e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fVar.f229907f.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
            android.widget.ImageView imageView = fVar.f229907f;
            android.content.Context context = this.f229927g;
            imageView.setColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), android.graphics.PorterDuff.Mode.SRC_ATOP);
            fVar.f229907f.setPivotX(r2.getWidth() / 2);
            fVar.f229907f.setPivotY(r2.getHeight() / 2);
            fVar.f229907f.setRotation(90.0f);
            fVar.f229908g.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574004gr4));
            if (!this.f229933p || this.f229934q) {
                android.view.View view6 = fVar.f229909h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view7 = fVar.f229909h;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f229930m) {
                fVar.f229902a.setVisibility(8);
                fVar.f229908g.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574004gr4));
            } else {
                fVar.f229902a.setVisibility(0);
                c(i17, fVar, i27);
                fVar.f229907f.setImageResource(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1);
                fVar.f229907f.setColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), android.graphics.PorterDuff.Mode.SRC_ATOP);
                fVar.f229907f.setPivotX(r2.getWidth() / 2);
                fVar.f229907f.setPivotY(r2.getHeight() / 2);
                fVar.f229907f.setRotation(270.0f);
                fVar.f229908g.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574002gr2));
            }
        } else if (i18 <= 0 || !this.f229930m || i17 < i18 || i17 > this.f229932o) {
            fVar.f229902a.setVisibility(0);
            c(i17, fVar, i27);
            android.view.View view8 = fVar.f229906e;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = fVar.f229909h;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            fVar.f229902a.setVisibility(8);
            android.view.View view10 = fVar.f229906e;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view11 = fVar.f229909h;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fVar.f229903b.setVisibility(8);
            android.view.View view12 = fVar.f229904c;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = fVar.f229905d;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view13, arrayList11.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 == getCount() - 1) {
            fVar.f229910i.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.a());
            android.view.View view14 = fVar.f229910i;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view14, arrayList12.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view15 = fVar.f229910i;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view15, arrayList13.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
