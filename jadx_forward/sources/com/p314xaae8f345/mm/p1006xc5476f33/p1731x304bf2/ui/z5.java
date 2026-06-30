package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes15.dex */
public class z5 extends android.widget.BaseAdapter {

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f223437m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f223438n;

    /* renamed from: o, reason: collision with root package name */
    public final int f223439o;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f223443s;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223431d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223432e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f223433f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f223434g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f223435h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f223436i = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f223440p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f223441q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f223442r = false;

    public z5(android.content.Context context, java.util.ArrayList arrayList) {
        this.f223437m = context;
        this.f223438n = arrayList;
        this.f223439o = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560735sq);
    }

    public final void a(android.widget.TextView textView, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList = this.f223443s;
        if (arrayList == null) {
            this.f223443s = new java.util.ArrayList();
        } else {
            arrayList.clear();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y5 y5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y5(this, null);
        for (int indexOf = sb6.indexOf("<em>"); indexOf >= 0; indexOf = sb6.indexOf("<em>")) {
            y5Var.f223420a = indexOf;
            sb6.delete(indexOf, indexOf + 4);
            int indexOf2 = sb6.indexOf("</em>");
            if (indexOf2 < 0) {
                break;
            }
            y5Var.f223421b = indexOf2;
            sb6.delete(indexOf2, indexOf2 + 5);
            this.f223443s.add(y5Var);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(sb6.toString());
        java.util.Iterator it = this.f223443s.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y5 y5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y5) it.next();
            if (y5Var2.f223420a < y5Var2.f223421b) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.f223439o), y5Var2.f223420a, y5Var2.f223421b, 33);
            }
        }
        textView.setText(spannableString);
        textView.setVisibility(0);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f223438n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f223438n.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5) getItem(i17)).f223365k;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v5 v5Var;
        android.view.View view2;
        int i18;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5) getItem(i17);
        android.content.Context context = this.f223437m;
        if (view == null) {
            v5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v5(null);
            int i19 = w5Var.f223365k;
            view2 = android.view.View.inflate(context, i19 != 0 ? i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 5 ? i19 != 6 ? 0 : com.p314xaae8f345.mm.R.C30864xbddafb2a.bho : com.p314xaae8f345.mm.R.C30864xbddafb2a.bhn : com.p314xaae8f345.mm.R.C30864xbddafb2a.bhq : com.p314xaae8f345.mm.R.C30864xbddafb2a.bhs : com.p314xaae8f345.mm.R.C30864xbddafb2a.bhl : com.p314xaae8f345.mm.R.C30864xbddafb2a.bhr, null);
            v5Var.f223334a = view2.findViewById(com.p314xaae8f345.mm.R.id.gmf);
            v5Var.f223335b = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.gmi);
            v5Var.f223336c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gmk);
            v5Var.f223337d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gmd);
            v5Var.f223338e = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gmg);
            v5Var.f223339f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.gml);
            v5Var.f223340g = view2.findViewById(com.p314xaae8f345.mm.R.id.gmh);
            v5Var.f223341h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ne_);
            v5Var.f223342i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.cmd);
            view2.setTag(v5Var);
            android.widget.TextView textView2 = v5Var.f223336c;
            if (textView2 != null && (textView = v5Var.f223338e) != null) {
                textView2.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u5(this, textView2, textView));
            }
        } else {
            v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v5) view.getTag();
            view2 = view;
        }
        int i27 = w5Var.f223365k;
        if (i27 == 0) {
            v5Var.f223338e.setText(w5Var.f223356b);
        } else if (i27 == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w5Var.f223358d)) {
                r53.v vVar = new r53.v();
                vVar.f474236a = false;
                vVar.f474237b = false;
                r53.y.a().e(v5Var.f223335b, w5Var.f223358d, vVar.a(), null);
            }
            a(v5Var.f223336c, w5Var.f223356b);
            a(v5Var.f223337d, w5Var.f223359e);
            a(v5Var.f223338e, w5Var.f223357c);
        } else if (i27 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w5Var.f223358d)) {
                v5Var.f223335b.setVisibility(8);
            } else {
                r53.v vVar2 = new r53.v();
                vVar2.f474236a = false;
                vVar2.f474237b = false;
                vVar2.f474239d = true;
                r53.y.a().e(v5Var.f223335b, w5Var.f223358d, vVar2.a(), null);
                v5Var.f223335b.setVisibility(0);
            }
            a(v5Var.f223336c, w5Var.f223356b);
            a(v5Var.f223338e, w5Var.f223357c);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w5Var.f223360f)) {
                v5Var.f223341h.setVisibility(8);
            } else {
                android.widget.TextView textView3 = v5Var.f223341h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = w5Var.f223360f;
                ((ke0.e) xVar).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
                v5Var.f223341h.setVisibility(0);
            }
            long j17 = w5Var.f223361g;
            if (j17 > 0) {
                v5Var.f223342i.setText(r53.e.a(context, j17 * 1000));
                v5Var.f223342i.setVisibility(0);
            } else {
                v5Var.f223342i.setVisibility(8);
            }
        } else if (i27 == 3) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w5Var.f223358d)) {
                r53.v vVar3 = new r53.v();
                vVar3.f474236a = false;
                vVar3.f474237b = false;
                r53.y.a().e(v5Var.f223335b, w5Var.f223358d, vVar3.a(), null);
            }
            a(v5Var.f223336c, w5Var.f223356b);
            a(v5Var.f223337d, w5Var.f223359e);
            a(v5Var.f223338e, w5Var.f223357c);
            android.widget.TextView textView4 = v5Var.f223339f;
            java.util.LinkedList linkedList = w5Var.f223362h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                textView4.setVisibility(8);
            } else {
                int size = linkedList.size();
                int i28 = 0;
                while (true) {
                    i18 = size - 1;
                    if (i28 >= i18) {
                        break;
                    }
                    sb6.append(((java.lang.String) linkedList.get(i28)) + "\n");
                    i28++;
                }
                sb6.append((java.lang.String) linkedList.get(i18));
                textView4.setVisibility(0);
                textView4.setText(sb6.toString());
            }
        } else if (i27 == 5) {
            v5Var.f223335b.setImageResource(com.p314xaae8f345.mm.R.raw.f81005xc7fec133);
            v5Var.f223336c.setText(w5Var.f223356b);
        } else if (i27 == 6) {
            v5Var.f223336c.setText(w5Var.f223356b);
        }
        int i29 = w5Var.f223365k;
        if (i29 != 0) {
            if (i29 == 1 || i29 == 2 || i29 == 3 || i29 == 5) {
                v5Var.f223334a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561445iq);
                v5Var.f223334a.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            }
        } else if (w5Var.f223366l) {
            android.view.View view3 = v5Var.f223340g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = v5Var.f223340g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/game/ui/GameSearchAdapter", "bindItemData", "(Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Item;Lcom/tencent/mm/plugin/game/ui/GameSearchAdapter$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }
}
