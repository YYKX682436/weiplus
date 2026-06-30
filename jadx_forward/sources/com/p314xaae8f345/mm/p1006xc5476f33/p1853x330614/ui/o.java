package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n f229984f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f229985g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f229986h;

    /* renamed from: i, reason: collision with root package name */
    public final int f229987i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f229982d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public android.util.SparseArray f229983e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f229988m = false;

    public o(android.content.Context context, int i17) {
        this.f229985g = context;
        this.f229987i = i17;
        this.f229986h = android.view.LayoutInflater.from(context);
    }

    public static boolean c(r45.n53 n53Var) {
        r45.l67 l67Var = n53Var.f462616e;
        if (l67Var == null || l67Var.f460720e == null || !f(n53Var)) {
            return false;
        }
        bt4.g b17 = bt4.g.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(n53Var.f462615d.f463529d);
        sb6.append("");
        return b17.c(sb6.toString()) != null;
    }

    public static boolean f(r45.n53 n53Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c17 = bt4.g.b().c(n53Var.f462615d.f463529d + "");
        if (c17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17.f261367g)) {
            if (c17.f261367g.equals(n53Var.f462616e.f460719d + "")) {
                return "0".equals(c17.f261364d);
            }
        }
        int i17 = n53Var.f462616e.f460719d;
        java.lang.String str = n53Var.f462615d.f463530e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27(n53Var.f462615d.f463529d + "");
        c19101x8593f27.f261367g = n53Var.f462616e.f460719d + "";
        bt4.g.b().a(c19101x8593f27);
        return true;
    }

    public final void a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m mVar) {
        if (view == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k) view.getTag();
        r45.n53 n53Var = mVar.f229974a;
        int i17 = mVar.f229975b;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            kVar.f229956f = n53Var.f462615d.f463531f.f467066e;
        } else {
            kVar.f229956f = n53Var.f462615d.f463531f.f467065d;
        }
        hf3.f.a(kVar.f229952b, kVar.f229956f, com.p314xaae8f345.mm.R.raw.f80569x6cf816d3);
        kVar.f229954d.setText(n53Var.f462615d.f463530e);
        d(kVar.f229954d, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229869e);
        java.lang.String str = n53Var.f462621m;
        if (str != null) {
            kVar.f229955e.setText(str);
            kVar.f229955e.setVisibility(0);
            d(kVar.f229955e, com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229869e);
            this.f229988m = true;
        } else {
            kVar.f229955e.setText("");
            kVar.f229955e.setVisibility(8);
        }
        r45.l67 l67Var = n53Var.f462616e;
        if (l67Var == null || l67Var.f460720e == null || !f(n53Var)) {
            kVar.f229953c.setImageBitmap(null);
            kVar.f229953c.setVisibility(8);
        } else {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                kVar.f229957g = n53Var.f462616e.f460720e.f467066e;
            } else {
                kVar.f229957g = n53Var.f462616e.f460720e.f467065d;
            }
            hf3.f.a(kVar.f229953c, kVar.f229957g, 0);
            kVar.f229953c.setVisibility(0);
            ((android.widget.RelativeLayout.LayoutParams) kVar.f229953c.getLayoutParams()).setMargins((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229869e / 2) - 1, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 7), 0, 0);
            int i18 = n53Var.f462615d.f463529d;
        }
        android.view.View view2 = kVar.f229951a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kVar.f229951a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.j(this, i17, n53Var));
    }

    public final void d(android.widget.TextView textView, int i17) {
        textView.setMaxEms(new android.text.StaticLayout(textView.getText(), textView.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f229982d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l lVar;
        android.view.View view2;
        boolean z17;
        android.view.View view3;
        boolean z18;
        android.view.LayoutInflater layoutInflater = this.f229986h;
        ?? r37 = 0;
        if (view == null) {
            lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l(this);
            view2 = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bvt, viewGroup, false);
            lVar.f229963a = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.j9j);
            lVar.f229964b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.j9i);
            lVar.f229965c = view2.findViewById(com.p314xaae8f345.mm.R.id.i2a);
            lVar.f229966d = view2.findViewById(com.p314xaae8f345.mm.R.id.auc);
            lVar.f229967e = view2.findViewById(com.p314xaae8f345.mm.R.id.kd_);
            view2.setTag(lVar);
        } else {
            lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l) view.getTag();
            view2 = view;
        }
        lVar.f229963a.setVisibility(0);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f229982d;
        java.util.List list = (java.util.List) arrayList.get(i17);
        int size = list.size();
        android.content.Context context = this.f229985g;
        boolean z19 = true;
        if (size > 0) {
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) list.get(0)).f229974a.f462622n;
            android.util.SparseArray sparseArray = this.f229983e;
            java.lang.String str = sparseArray == null ? null : (java.lang.String) sparseArray.get(i18);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                z17 = false;
                z18 = false;
            } else {
                if (i17 != 0) {
                    int i19 = i17 - 1;
                    if (((java.util.ArrayList) arrayList.get(i19)).size() <= 0 || i18 == ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) ((java.util.ArrayList) arrayList.get(i19)).get(0)).f229974a.f462622n) {
                        z18 = false;
                        z17 = i17 == arrayList.size() + (-1) || i18 != ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) ((java.util.ArrayList) arrayList.get(i17 + 1)).get(0)).f229974a.f462622n;
                    }
                }
                z18 = true;
                if (i17 == arrayList.size() + (-1)) {
                }
            }
            if (z18) {
                lVar.f229964b.setText(str);
                lVar.f229964b.setVisibility(0);
                android.view.View view4 = lVar.f229965c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.LayoutParams layoutParams = lVar.f229965c.getLayoutParams();
                layoutParams.height = (int) (i65.a.b(context, 8) * com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229872h);
                lVar.f229965c.setLayoutParams(layoutParams);
                lVar.f229964b.setMinHeight((int) (i65.a.b(context, 48) * com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229872h));
                lVar.f229965c.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.a());
            } else {
                lVar.f229964b.setVisibility(8);
                android.view.View view5 = lVar.f229965c;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            lVar.f229964b.setVisibility(8);
            android.view.View view6 = lVar.f229965c;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        android.widget.LinearLayout linearLayout = lVar.f229963a;
        linearLayout.setFocusable(true);
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c / 2;
        linearLayout.setPadding(i27, 0, i27, 0);
        int i28 = 0;
        while (i28 < 4) {
            if (i28 >= linearLayout.getChildCount() || linearLayout.getChildAt(i28) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k(this);
                android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570787bw0, linearLayout, (boolean) r37);
                kVar.f229951a = inflate.findViewById(com.p314xaae8f345.mm.R.id.j9t);
                kVar.f229952b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9q);
                kVar.f229954d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9v);
                kVar.f229955e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j9p);
                kVar.f229953c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k9w);
                inflate.setTag(kVar);
                if (i28 < list.size()) {
                    a(inflate, (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) list.get(i28));
                } else {
                    inflate.setFocusable(true);
                    android.view.View view7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k) inflate.getTag()).f229951a;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setOnClickListener(null);
                    inflate.setEnabled(false);
                    inflate.setClickable(false);
                }
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229869e + com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c, -1, 1.0f);
                inflate.setMinimumHeight(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d);
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c / 2;
                inflate.setPadding(i29, 0, i29, 0);
                linearLayout.addView(inflate, layoutParams2);
                view3 = inflate;
            } else {
                android.view.View childAt = linearLayout.getChildAt(i28);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(childAt, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList6.get(r37)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (i28 < list.size()) {
                    a(childAt, (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.m) list.get(i28));
                } else {
                    linearLayout.getChildAt(i28).setFocusable(z19);
                    linearLayout.getChildAt(i28).setOnClickListener(null);
                    android.view.View view8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k) linearLayout.getChildAt(i28).getTag()).f229951a;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(4);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList7.get(r37)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setEnabled(r37);
                    childAt.setClickable(r37);
                }
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams3.width = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229869e + com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c;
                childAt.setMinimumHeight(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229868d);
                int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.b.f229867c / 2;
                childAt.setPadding(i37, r37, i37, r37);
                childAt.setLayoutParams(layoutParams3);
                view3 = childAt;
            }
            if (!z17) {
                view3.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anj));
                android.view.ViewGroup.LayoutParams layoutParams4 = lVar.f229967e.getLayoutParams();
                layoutParams4.height = i65.a.b(context, 4);
                lVar.f229967e.setLayoutParams(layoutParams4);
                lVar.f229967e.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ani));
            } else if (i28 == 0) {
                view3.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anf));
                android.view.ViewGroup.LayoutParams layoutParams5 = lVar.f229967e.getLayoutParams();
                if (this.f229988m) {
                    layoutParams5.height = i65.a.b(context, 8);
                } else {
                    layoutParams5.height = i65.a.b(context, 16);
                }
                lVar.f229967e.setLayoutParams(layoutParams5);
                lVar.f229967e.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anh));
            } else if (i28 == 1) {
                view3.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anj));
                android.view.ViewGroup.LayoutParams layoutParams6 = lVar.f229967e.getLayoutParams();
                layoutParams6.height = i65.a.b(context, 4);
                lVar.f229967e.setLayoutParams(layoutParams6);
                lVar.f229967e.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ani));
            } else {
                view3.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ang));
                android.view.ViewGroup.LayoutParams layoutParams7 = lVar.f229967e.getLayoutParams();
                if (this.f229988m) {
                    layoutParams7.height = i65.a.b(context, 8);
                } else {
                    layoutParams7.height = i65.a.b(context, 16);
                }
                lVar.f229967e.setLayoutParams(layoutParams7);
                lVar.f229967e.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.anh));
            }
            i28++;
            r37 = 0;
            z19 = true;
        }
        if (i17 == getCount() - 1) {
            lVar.f229966d.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.n2.a());
            android.view.View view9 = lVar.f229966d;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams8 = lVar.f229966d.getLayoutParams();
            layoutParams8.height = i65.a.b(context, 12);
            lVar.f229966d.setLayoutParams(layoutParams8);
        } else {
            android.view.View view10 = lVar.f229966d;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
