package gu1;

/* loaded from: classes15.dex */
public class u implements tt1.k {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f357462a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f357463b;

    /* renamed from: c, reason: collision with root package name */
    public long f357464c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f357465d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f357466e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357467f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f357468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f357469h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f357470i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f357471j;

    public u(android.content.Context context, android.widget.BaseAdapter baseAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f357468g = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f357469h = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f357470i = arrayList3;
        this.f357471j = new java.util.LinkedList();
        this.f357462a = context;
        this.f357463b = baseAdapter;
        this.f357466e = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561431ib);
        this.f357467f = this.f357462a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
        arrayList.clear();
        arrayList2.clear();
        arrayList3.clear();
    }

    @Override // tt1.k
    public android.view.View a(int i17, android.view.View view, android.view.ViewGroup viewGroup, tt1.j jVar) {
        gu1.t tVar;
        android.view.View view2;
        android.widget.RelativeLayout relativeLayout;
        java.util.LinkedList linkedList;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (view == null) {
            view2 = android.view.View.inflate(this.f357462a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569890r3, null);
            tVar = new gu1.t(this);
            tVar.f357450a = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.bc9);
            tVar.f357451b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565108ba4);
            tVar.f357452c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ba_);
            tVar.f357453d = (android.widget.RelativeLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.b99);
            tVar.f357454e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.b_w);
            tVar.f357455f = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b8b);
            tVar.f357456g = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565110bb0);
            tVar.f357460k = view2.findViewById(com.p314xaae8f345.mm.R.id.bad);
            tVar.f357457h = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.nrk);
            tVar.f357458i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b7s);
            tVar.f357459j = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565111bb1);
            tVar.f357461l = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b9c);
            tVar.f357457h.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
            view2.setTag(tVar);
        } else {
            tVar = (gu1.t) view.getTag();
            view2 = view;
        }
        tt1.j jVar2 = (tt1.j) this.f357463b.getItem(i17);
        int J2 = jVar2.J();
        if (eu1.f.a(jVar2.J()) && (i17 != 0 ? J2 != ((tt1.j) this.f357463b.getItem(i17 + (-1))).J() : !android.text.TextUtils.isEmpty(jVar2.C(J2)))) {
            tVar.f357451b.setVisibility(0);
            tVar.f357451b.setText(jVar2.C(J2));
            if (android.text.TextUtils.isEmpty(jVar2.x(J2))) {
                tVar.f357452c.setVisibility(8);
            } else {
                tVar.f357452c.setVisibility(0);
                tVar.f357452c.setText(jVar2.x(J2));
            }
        } else {
            tVar.f357451b.setVisibility(8);
            tVar.f357452c.setVisibility(8);
            tVar.f357451b.setText("");
        }
        if (jVar.c()) {
            tVar.f357454e.setVisibility(0);
            tVar.f357455f.setVisibility(0);
            tVar.f357450a.setVisibility(0);
            tVar.f357456g.setVisibility(0);
            tVar.f357461l.setVisibility(0);
            android.view.View view3 = tVar.f357460k;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f357457h.setVisibility(0);
            tVar.f357458i.setVisibility(0);
            tVar.f357459j.setVisibility(8);
            tVar.f357455f.setText(jVar.s0().f470085m);
            if (!jVar.X()) {
                tVar.f357456g.setText(jVar.s0().f470086n);
            } else if (jVar.s0().f470093s != null && jVar.s0().f470093s.size() == 1) {
                tVar.f357456g.setText(((r45.w50) jVar.s0().f470093s.get(0)).f470411d);
            } else if (jVar.s0().f470093s != null && jVar.s0().f470093s.size() == 2) {
                tVar.f357456g.setText(((r45.w50) jVar.s0().f470093s.get(0)).f470411d + "-" + ((r45.w50) jVar.s0().f470093s.get(1)).f470411d);
            }
            lu1.g0.b(tVar.f357454e, jVar.s0().f470079e, this.f357462a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561718qr), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
            tVar.f357455f.setTextColor(this.f357462a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560314h1));
            java.lang.String f17 = jVar.f();
            java.util.Map map = (java.util.Map) xt1.t0.Di().a("key_share_card_annoucement_map");
            java.lang.String str = map == null ? "" : (java.lang.String) map.get(f17);
            if (android.text.TextUtils.isEmpty(str)) {
                tVar.f357458i.setText("");
            } else {
                tVar.f357458i.setText(str);
            }
            java.lang.String f18 = jVar.f();
            java.util.Map map2 = (java.util.Map) xt1.t0.Di().a("key_share_card_username_map");
            java.lang.String str2 = map2 == null ? "" : (java.lang.String) map2.get(f18);
            boolean a17 = eu1.f.a(jVar.J());
            if (!android.text.TextUtils.isEmpty(str2) && a17) {
                android.widget.TextView textView = tVar.f357457h;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = this.f357462a;
                textView.setText(((ke0.e) xVar).bj(context, str2, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9)));
            } else if (android.text.TextUtils.isEmpty(jVar.a())) {
                tVar.f357457h.setText("");
            } else {
                java.lang.String p17 = lu1.a0.p(jVar.a());
                if (android.text.TextUtils.isEmpty(p17)) {
                    tVar.f357457h.setText("");
                } else {
                    java.lang.String string = this.f357462a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572339av4, p17);
                    android.widget.TextView textView2 = tVar.f357457h;
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context2 = this.f357462a;
                    textView2.setText(((ke0.e) xVar2).bj(context2, string, context2.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9)));
                }
            }
            int d17 = eu1.f.d(jVar.f());
            if (d17 <= 1 || !a17) {
                tVar.f357461l.setVisibility(8);
            } else {
                tVar.f357461l.setText("X" + d17);
                tVar.f357461l.setVisibility(0);
            }
            if ((jVar.s0().N == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(jVar.s0().N.f459672e)) && !eu1.f.m(jVar.f())) {
                tVar.f357450a.setVisibility(8);
            } else {
                tVar.f357450a.setVisibility(0);
                int i18 = 0;
                while (true) {
                    int childCount = tVar.f357450a.getChildCount();
                    linkedList = this.f357471j;
                    if (i18 >= childCount) {
                        break;
                    }
                    linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) tVar.f357450a.getChildAt(i18));
                    i18++;
                }
                tVar.f357450a.removeAllViews();
                boolean m17 = eu1.f.m(jVar.f());
                int i19 = this.f357466e;
                int i27 = this.f357467f;
                if (m17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = linkedList.size() == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(this.f357462a) : (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) linkedList.removeFirst();
                    c13079x2ba3d9dc.setPadding(i27, i19, i27, i19);
                    c13079x2ba3d9dc.setTextColor(this.f357462a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
                    c13079x2ba3d9dc.setText(this.f357462a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ave));
                    c13079x2ba3d9dc.setTextSize(12.0f);
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = this.f357462a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                    tVar.f357450a.addView(c13079x2ba3d9dc, layoutParams);
                }
                if (jVar.s0().N != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(jVar.s0().N.f459672e)) {
                    java.util.Iterator it = jVar.s0().N.f459672e.iterator();
                    while (it.hasNext()) {
                        r45.bk6 bk6Var = (r45.bk6) it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc2 = linkedList.size() == 0 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(this.f357462a) : (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc) linkedList.removeFirst();
                        c13079x2ba3d9dc2.setPadding(i27, i19, i27, i19);
                        c13079x2ba3d9dc2.setTextColor(lu1.a0.d(bk6Var.f452361e));
                        c13079x2ba3d9dc2.setText(bk6Var.f452360d);
                        c13079x2ba3d9dc2.setTextSize(12.0f);
                        tVar.f357450a.addView(c13079x2ba3d9dc2);
                    }
                }
            }
        } else {
            tVar.f357454e.setVisibility(8);
            tVar.f357455f.setVisibility(8);
            tVar.f357450a.setVisibility(8);
            tVar.f357456g.setVisibility(8);
            tVar.f357461l.setVisibility(8);
            android.view.View view4 = tVar.f357460k;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy", "updateView", "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tVar.f357457h.setVisibility(8);
            tVar.f357458i.setVisibility(8);
            tVar.f357459j.setVisibility(0);
            tVar.f357459j.setText(this.f357462a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.auh));
        }
        if (i17 != this.f357463b.getCount() - 1 || (relativeLayout = tVar.f357453d) == null) {
            android.widget.RelativeLayout relativeLayout2 = tVar.f357453d;
            if (relativeLayout2 != null) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
                if (layoutParams2.bottomMargin != 0) {
                    layoutParams2.bottomMargin = 0;
                    tVar.f357453d.setLayoutParams(layoutParams2);
                }
            }
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams3.bottomMargin != this.f357462a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq)) {
                layoutParams3.bottomMargin = this.f357462a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561410hq);
                tVar.f357453d.setLayoutParams(layoutParams3);
            }
        }
        this.f357464c += java.lang.System.currentTimeMillis() - currentTimeMillis;
        this.f357465d++;
        java.util.ArrayList arrayList3 = this.f357469h;
        if (!arrayList3.contains(jVar.g())) {
            arrayList3.add(jVar.g());
            this.f357470i.add(jVar.f());
            this.f357468g.add(java.lang.Integer.valueOf(i17));
        }
        return view2;
    }

    @Override // tt1.k
    /* renamed from: release */
    public void mo54459x41012807() {
        this.f357462a = null;
        this.f357463b = null;
        if (this.f357465d > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c344.m40330x4c144dd(281);
            c4582x424c344.m40331x936762bd(5);
            c4582x424c344.m40332x57b2b64f(1L);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c3442.m40330x4c144dd(281);
            c4582x424c3442.m40331x936762bd(6);
            c4582x424c3442.m40332x57b2b64f((int) (this.f357464c / this.f357465d));
            arrayList.add(c4582x424c344);
            arrayList.add(c4582x424c3442);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        }
        java.util.ArrayList arrayList2 = this.f357468g;
        int size = arrayList2.size();
        java.util.ArrayList arrayList3 = this.f357469h;
        int size2 = arrayList3.size();
        java.util.ArrayList arrayList4 = this.f357470i;
        if (size == size2 && arrayList3.size() == arrayList4.size() && arrayList2.size() > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13220, arrayList4.get(i17), arrayList3.get(i17), arrayList2.get(i17), java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        arrayList2.clear();
        arrayList3.clear();
        arrayList4.clear();
        java.util.LinkedList linkedList = this.f357471j;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}
