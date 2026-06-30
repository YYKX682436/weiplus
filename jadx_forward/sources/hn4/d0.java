package hn4;

/* loaded from: classes15.dex */
public class d0 extends fn4.m implements hn4.a {
    public android.view.View A;
    public android.widget.TextView B;
    public android.view.View C;
    public android.view.View D;
    public android.view.View E;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public android.widget.TextView H;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f364082J;
    public android.widget.ImageView K;
    public final boolean L;

    /* renamed from: h, reason: collision with root package name */
    public fn4.g f364083h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f364084i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f364085m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f364086n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f364087o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f364088p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f364089q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f364090r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f364091s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f364092t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f364093u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f364094v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f364095w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f364096x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f364097y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f364098z;

    public d0(android.view.View view, hn4.b bVar, boolean z17) {
        super(view, bVar);
        this.L = z17;
    }

    @Override // fn4.m
    public fn4.g i() {
        return this.f364083h;
    }

    @Override // fn4.m
    public android.view.View j() {
        return this.f364089q;
    }

    @Override // fn4.m
    public void k(android.view.View view) {
        int id6 = view.getId();
        int id7 = this.f364093u.getId();
        fn4.b bVar = this.f346116d;
        if (id6 == id7) {
            r45.xn6 xn6Var = this.f346117e;
            if (xn6Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471808z)) {
                return;
            }
            java.lang.String str = this.f346117e.f471808z;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(bVar.B(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            if (bVar.I2().f346109e) {
                this.f364083h.getClass();
                bVar.I2().h();
            }
            bVar.o4().d(this.f346117e);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar.r0(), this.f346117e, u(), 1, "");
            return;
        }
        if (view.getId() == this.f364088p.getId()) {
            uu4.a.a(8);
            r(bVar, bVar.B(), this.f364083h, u());
            return;
        }
        if (view.getId() == this.f364087o.getId()) {
            bVar.F2(this.f364087o, u());
            return;
        }
        if (view.getId() != this.F.getId() && view.getId() != this.G.getId()) {
            if (view.getId() == this.f364085m.getId() || view.getId() == this.f364092t.getId() || view.getId() == this.f364094v.getId()) {
                if (fn4.z0.h(this.f346117e, bVar.B())) {
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar.r0(), this.f346117e, u(), 3, "");
                    return;
                }
                return;
            } else {
                if (view.getId() == this.f364089q.getId()) {
                    bVar.U0(this.f346117e, view);
                    if (this.f346117e.R) {
                        this.f364090r.setImageResource(com.p314xaae8f345.mm.R.raw.f81241x228946f);
                        android.widget.TextView textView = this.f364091s;
                        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9b));
                        return;
                    } else {
                        this.f364090r.setImageResource(com.p314xaae8f345.mm.R.raw.f81242x1effd508);
                        android.widget.TextView textView2 = this.f364091s;
                        textView2.setTextColor(textView2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                        return;
                    }
                }
                return;
            }
        }
        boolean z17 = true;
        bVar.s1().f346100a = true;
        bVar.I2().m();
        this.f364083h.j();
        r45.x56 x56Var = (r45.x56) view.getTag();
        r45.un6 a17 = pm4.w.a(bVar.r0());
        a17.f469045r = java.util.UUID.randomUUID().toString();
        a17.f469034d = this.f346117e.f471792h;
        a17.f469038h = x56Var.f471330f;
        a17.f469042o = null;
        a17.f469043p = x56Var;
        a17.f469051x = bVar.mo72295xb9a62e63();
        a17.f469047t = bVar.s1().f346100a;
        java.util.Iterator it = a17.f469044q.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.x50 x50Var = (r45.x50) it.next();
            if ("show_tag_list".equals(x50Var.f471321d)) {
                x50Var.f471323f = x56Var.f471328d;
                break;
            }
        }
        if (!z17) {
            r45.x50 x50Var2 = new r45.x50();
            x50Var2.f471321d = "show_tag_list";
            x50Var2.f471323f = x56Var.f471328d;
            a17.f469044q.add(x50Var2);
        }
        su4.r2.q(bVar.B(), a17, 10001);
        uu4.a.a(28);
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai().a(bVar.r0(), this.f346117e, u(), 4, x56Var.f471329e + ":" + x56Var.f471328d);
    }

    @Override // fn4.m
    public void l(android.view.View view) {
        if ((1 >= com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) && view.getId() == this.f364093u.getId()) {
            this.f346116d.I2().f346112h = true;
        }
        super.l(view);
    }

    @Override // fn4.m, fn4.a
    public void m() {
        super.m();
    }

    @Override // fn4.m
    public void n(android.view.View view) {
        this.f364084i = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.p0y);
        this.f364085m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ne8);
        this.f364092t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nec);
        this.f364093u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f364094v = view.findViewById(com.p314xaae8f345.mm.R.id.ne7);
        this.f364088p = view.findViewById(com.p314xaae8f345.mm.R.id.msx);
        this.f364089q = view.findViewById(com.p314xaae8f345.mm.R.id.poj);
        this.f364090r = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.poi);
        this.f364091s = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.poh);
        this.f364086n = view.findViewById(com.p314xaae8f345.mm.R.id.jqz);
        this.f364087o = view.findViewById(com.p314xaae8f345.mm.R.id.jrb);
        this.A = view.findViewById(com.p314xaae8f345.mm.R.id.avu);
        this.B = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.au7);
        this.C = view.findViewById(com.p314xaae8f345.mm.R.id.nvx);
        this.D = view.findViewById(com.p314xaae8f345.mm.R.id.f568742nw1);
        this.E = view.findViewById(com.p314xaae8f345.mm.R.id.f568746nw5);
        this.F = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nvy);
        this.G = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568743nw2);
        this.H = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nw6);
        this.I = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nvw);
        this.f364082J = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f568741nw0);
        this.K = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f568745nw4);
        this.f364096x = view.findViewById(com.p314xaae8f345.mm.R.id.at7);
        this.f364097y = view.findViewById(com.p314xaae8f345.mm.R.id.gyv);
        this.f364098z = view.findViewById(com.p314xaae8f345.mm.R.id.gby);
        this.f364095w = view.findViewById(com.p314xaae8f345.mm.R.id.gbu);
        if (this.L) {
            android.view.View view2 = this.A;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.A;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "inflateView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fn4.m
    public boolean o() {
        return (this.f364098z.getAlpha() == 0.0f || this.f364097y.getAlpha() == 0.0f) ? false : true;
    }

    @Override // fn4.m
    public void p() {
        fn4.b bVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346117e.f471788d)) {
            this.f364093u.setVisibility(8);
        } else {
            this.f364093u.setText(this.f346117e.f471788d);
            this.f364093u.setVisibility(0);
            this.f364093u.requestLayout();
        }
        android.widget.TextView textView = this.f364093u;
        android.view.View.OnClickListener onClickListener = this.f346118f;
        textView.setOnClickListener(onClickListener);
        this.f364092t.setText(this.f346117e.f471802t);
        if (fn4.z0.f(this.f346117e)) {
            android.view.View view = this.f364094v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f364094v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "updateSourceItems", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f364085m.setOnClickListener(onClickListener);
        this.f364092t.setOnClickListener(onClickListener);
        this.f364094v.setOnClickListener(onClickListener);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f346117e.C)) {
            this.f364085m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            n11.a.b().h(this.f346117e.C, this.f364085m, wm4.u.f528842a);
        }
        fn4.b bVar2 = this.f346116d;
        if (bVar2.H6()) {
            android.view.View view3 = this.f364088p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f364088p.setOnClickListener(onClickListener);
        } else {
            android.view.View view4 = this.f364088p;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (bVar2.H4()) {
            this.f364087o.setTag(this.f346117e);
            this.f364087o.setOnClickListener(onClickListener);
            android.view.View view5 = this.f364087o;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = this.f364086n;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view7 = this.f364087o;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = this.f364086n;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f364087o.setTag(this.f346117e);
        this.f364087o.setOnClickListener(onClickListener);
        this.f364095w.setOnClickListener(onClickListener);
        android.view.View view9 = this.f364096x;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view10 = this.f364097y;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(0);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view11 = this.f364098z;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(0);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(view11, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f364083h == null) {
            this.f364083h = new hn4.z(bVar2.B(), bVar2, this);
            this.f364084i.removeAllViews();
            android.widget.FrameLayout frameLayout = this.f364084i;
            fn4.g gVar = this.f364083h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "lxl getVideoViewLayoutParams: %s, %s", java.lang.Integer.valueOf(bVar2.mo72294x8d5c7601()), java.lang.Integer.valueOf(bVar2.mo72293x463504c()));
            frameLayout.addView(gVar, new android.widget.FrameLayout.LayoutParams(bVar2.mo72294x8d5c7601(), bVar2.mo72293x463504c()));
        }
        this.f364083h.q(this.f346117e, u());
        if (bVar2.Y2() == u()) {
            super.m();
        }
        this.B.setText(this.f346117e.f471797p);
        if (!this.L || this.f346117e.D.size() <= 0) {
            bVar = bVar2;
            android.view.View view12 = this.A;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view13 = this.A;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r45.x56 x56Var = (r45.x56) this.f346117e.D.get(0);
            this.F.setTag(x56Var);
            this.F.setText(x56Var.f471329e);
            this.F.setVisibility(0);
            this.F.setOnClickListener(onClickListener);
            android.view.View view14 = this.C;
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            bVar = bVar2;
            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.I.setVisibility(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x56Var.f471335n)) {
                n11.a.b().h(x56Var.f471335n, this.I, wm4.u.f528843b);
                this.I.setVisibility(0);
            }
            if (this.f346117e.D.size() > 1) {
                r45.x56 x56Var2 = (r45.x56) this.f346117e.D.get(1);
                this.G.setTag(x56Var2);
                this.G.setText(x56Var2.f471329e);
                this.G.setOnClickListener(onClickListener);
                this.G.setVisibility(0);
                android.view.View view15 = this.D;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(0);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f364082J.setVisibility(8);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x56Var2.f471335n)) {
                    n11.a.b().h(x56Var2.f471335n, this.f364082J, wm4.u.f528843b);
                    this.f364082J.setVisibility(0);
                }
            } else {
                android.view.View view16 = this.D;
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                arrayList16.add(8);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.G.setVisibility(8);
            }
            if (this.f346117e.D.size() > 2) {
                r45.x56 x56Var3 = (r45.x56) this.f346117e.D.get(2);
                this.H.setTag(x56Var3);
                this.H.setText(x56Var3.f471329e);
                this.H.setOnClickListener(onClickListener);
                this.H.setVisibility(0);
                android.view.View view17 = this.E;
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                arrayList17.add(0);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.K.setVisibility(8);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x56Var3.f471335n)) {
                    n11.a.b().h(x56Var3.f471335n, this.K, wm4.u.f528843b);
                    this.K.setVisibility(0);
                }
            } else {
                android.view.View view18 = this.E;
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                arrayList18.add(8);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(view18, arrayList18.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.H.setVisibility(8);
            }
        }
        if (bVar.Y2() != u()) {
            w();
        }
        if ((this.f346117e.L & 128) <= 0) {
            android.view.View view19 = this.f364089q;
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(8);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(view19, arrayList19.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
            yj0.a.f(view19, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view20 = this.f364089q;
        java.util.ArrayList arrayList20 = new java.util.ArrayList();
        arrayList20.add(0);
        java.util.Collections.reverse(arrayList20);
        yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
        yj0.a.f(view20, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onBindViewHolder", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f364089q.setOnClickListener(onClickListener);
        if (this.f346117e.R) {
            this.f364090r.setImageResource(com.p314xaae8f345.mm.R.raw.f81241x228946f);
            android.widget.TextView textView2 = this.f364091s;
            textView2.setTextColor(textView2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9b));
        } else {
            this.f364090r.setImageResource(com.p314xaae8f345.mm.R.raw.f81242x1effd508);
            android.widget.TextView textView3 = this.f364091s;
            textView3.setTextColor(textView3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        }
        this.f364091s.setText(wm4.u.p(this.f346117e.X));
    }

    @Override // fn4.m
    public void s(boolean z17) {
        r45.xn6 xn6Var = this.f346117e;
        fn4.b bVar = this.f346116d;
        bVar.a2(xn6Var);
        v();
        bVar.X1(u());
        if (this.f364083h.n(z17, false)) {
            t();
            super.m();
        }
    }

    @Override // fn4.m, fn4.a
    public void t() {
        super.t();
        this.f364098z.animate().cancel();
        this.f364097y.animate().cancel();
        android.view.View view = this.f364098z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f364097y;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "onExitImmersionModel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void v() {
        this.f364098z.animate().cancel();
        this.f364097y.animate().cancel();
        this.f364096x.animate().cancel();
        android.view.View view = this.f364096x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f364098z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f364097y;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "hideMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void w() {
        this.f364098z.animate().cancel();
        this.f364097y.animate().cancel();
        this.f364096x.animate().cancel();
        android.view.View view = this.f364096x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.8f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f364098z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(0.8f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = this.f364097y;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(0.8f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoItemHolder", "showMaskView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
