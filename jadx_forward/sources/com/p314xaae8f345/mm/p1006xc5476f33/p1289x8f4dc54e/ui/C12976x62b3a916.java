package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer */
/* loaded from: classes12.dex */
public class C12976x62b3a916 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f175514d;

    /* renamed from: e, reason: collision with root package name */
    public or1.m f175515e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f175516f;

    /* renamed from: g, reason: collision with root package name */
    public or1.r f175517g;

    /* renamed from: h, reason: collision with root package name */
    public or1.p f175518h;

    /* renamed from: i, reason: collision with root package name */
    public lr1.h0 f175519i;

    /* renamed from: m, reason: collision with root package name */
    public or1.q f175520m;

    /* renamed from: n, reason: collision with root package name */
    public int f175521n;

    /* renamed from: o, reason: collision with root package name */
    public long[] f175522o;

    /* renamed from: p, reason: collision with root package name */
    public int f175523p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f175524q;

    /* renamed from: r, reason: collision with root package name */
    public int f175525r;

    public C12976x62b3a916(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175521n = 0;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570970cj1, this);
        this.f175517g = new or1.r(null);
        this.f175518h = new or1.p(null);
        this.f175516f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565751df0);
        this.f175514d = (android.widget.ListView) inflate.findViewById(com.p314xaae8f345.mm.R.id.m1r);
    }

    public void a(java.lang.String str, int i17) {
        if (this.f175515e.isEmpty()) {
            this.f175516f.setVisibility(8);
        }
        if (str == null) {
            return;
        }
        java.lang.String trim = str.trim();
        if ("".equals(trim)) {
            return;
        }
        if ((!trim.equals(this.f175517g.f429090b) || this.f175524q) && !this.f175517g.f429093e) {
            this.f175515e.g();
            this.f175518h.a(0);
            or1.r rVar = this.f175517g;
            rVar.f429094f = false;
            rVar.f429093e = false;
            rVar.f429092d = 0;
            rVar.f429090b = null;
            rVar.f429089a = 1;
            rVar.f429093e = true;
            rVar.f429090b = trim;
            this.f175523p = i17;
            if (this.f175525r != 1) {
                gm0.j1.d().a(1070, this);
                or1.r rVar2 = this.f175517g;
                this.f175519i = new lr1.h0(rVar2.f429090b, rVar2.f429091c, this.f175521n);
                gm0.j1.d().g(this.f175519i);
            } else {
                long[] jArr = this.f175522o;
                if (jArr.length == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "business type size is 0.");
                    return;
                } else {
                    b(trim, i17, jArr[0]);
                    this.f175518h.a(0);
                }
            }
            or1.q qVar = this.f175520m;
            if (qVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36) qVar;
                activityC12985xde48fa36.f175576d = db5.e1.Q(activityC12985xde48fa36.mo55332x76847179(), activityC12985xde48fa36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC12985xde48fa36.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkc), true, true, new or1.k2(activityC12985xde48fa36));
            }
        }
    }

    public final void b(java.lang.String str, int i17, long j17) {
        this.f175517g.f429093e = true;
        gm0.j1.d().a(1071, this);
        or1.m mVar = this.f175515e;
        long[] jArr = this.f175522o;
        or1.k k17 = mVar.k(jArr[jArr.length - 1]);
        r45.qp qpVar = null;
        java.util.List list = k17 != null ? k17.f429054h : null;
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "Get business content by type failed.(keyword : %s, offset : %s, businessType : %s)", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        } else {
            qpVar = (r45.qp) list.get(list.size() - 1);
        }
        gm0.j1.d().g(new lr1.g0(str, j17, i17, this.f175521n, qpVar != null ? qpVar.f465693m : ""));
        this.f175518h.a(1);
    }

    /* renamed from: getAdapter */
    public or1.m m54300xf939df19() {
        return this.f175515e;
    }

    /* renamed from: getIOnSearchStateChangedListener */
    public or1.q m54301x4b73a311() {
        return this.f175520m;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        int i27;
        r45.qp qpVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36;
        android.app.ProgressDialog progressDialog;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "errType (%d) , errCode (%d) , errMsg (errMsg)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        or1.q qVar = this.f175520m;
        if (qVar != null && (progressDialog = (activityC12985xde48fa36 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36) qVar).f175576d) != null) {
            progressDialog.dismiss();
            activityC12985xde48fa36.f175576d = null;
        }
        if (i17 != 0 || i18 != 0) {
            this.f175517g.f429093e = false;
            this.f175524q = true;
            java.lang.String G = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(G)) {
                G = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.m125854x26a183b(getContext(), G, 0).show();
            return;
        }
        this.f175524q = false;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "scene is null.");
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 1070) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchHomePage.");
            gm0.j1.d().q(1070, this);
            r45.yw5 yw5Var = ((lr1.h0) m1Var).f402209h;
            java.util.LinkedList linkedList = yw5Var != null ? yw5Var.f472985e : null;
            this.f175515e.n(this.f175517g.f429090b, linkedList);
            or1.m mVar = this.f175515e;
            long[] jArr = this.f175522o;
            or1.k k17 = mVar.k(jArr[jArr.length - 1]);
            i19 = (k17 == null || k17.f429053g) ? 0 : k17.f429049c;
            i27 = i19 != 0 ? 2 : 3;
            if (linkedList != null && linkedList.size() > 0 && (qpVar = (r45.qp) linkedList.get(linkedList.size() - 1)) != null) {
                this.f175517g.f429092d = qpVar.f465694n + this.f175523p;
            }
        } else {
            if (m1Var.mo808xfb85f7b0() != 1071) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "Error type(%d).", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
                return;
            }
            gm0.j1.d().q(1071, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchDetailPage.");
            r45.kw5 kw5Var = ((lr1.g0) m1Var).f402198f;
            r45.qp qpVar2 = kw5Var != null ? kw5Var.f460537d : null;
            if (qpVar2 == null || qpVar2.f465691h == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "BusinessContent or itemList is null.");
            }
            i19 = qpVar2 == null ? 0 : qpVar2.f465688e;
            i27 = i19 != 0 ? 2 : 3;
            this.f175515e.f(qpVar2, true);
            if (qpVar2 != null) {
                this.f175517g.f429092d = qpVar2.f465694n + this.f175523p;
            }
        }
        if (this.f175515e.isEmpty()) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new or1.o(this));
        } else {
            this.f175517g.f429094f = true;
        }
        this.f175517g.f429089a = i19;
        this.f175518h.a(i27);
        this.f175517g.f429093e = false;
    }

    /* renamed from: setAdapter */
    public void m54302x6cab2c8d(or1.m mVar) {
        this.f175515e = mVar;
        if (mVar == null) {
            this.f175514d.setAdapter((android.widget.ListAdapter) mVar);
            return;
        }
        mVar.getClass();
        android.widget.ListView listView = this.f175514d;
        or1.p pVar = this.f175518h;
        android.content.Context context = getContext();
        pVar.getClass();
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsg, null);
        pVar.f429081a = inflate.findViewById(com.p314xaae8f345.mm.R.id.imc);
        pVar.f429082b = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567213im1);
        pVar.f429083c = inflate.findViewById(com.p314xaae8f345.mm.R.id.imi);
        android.view.View view = pVar.f429081a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = pVar.f429082b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = pVar.f429083c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        listView.addFooterView(inflate, null, false);
        this.f175514d.setAdapter((android.widget.ListAdapter) this.f175515e);
        this.f175514d.setOnScrollListener(new or1.n(this));
        this.f175514d.setOnItemClickListener(this.f175515e);
        if (this.f175517g.f429091c == 0) {
            m54304x752ba357(1);
        }
    }

    /* renamed from: setAddContactScene */
    public void m54303xe272e6cb(int i17) {
        this.f175515e.f429062i = i17;
    }

    /* renamed from: setBusinessTypes */
    public void m54304x752ba357(long... jArr) {
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        this.f175522o = jArr;
        this.f175517g.f429091c = 0L;
        for (long j17 : jArr) {
            this.f175517g.f429091c |= j17;
        }
        or1.m mVar = this.f175515e;
        mVar.getClass();
        if (jArr.length > 0) {
            mVar.f429068r = jArr;
        }
    }

    /* renamed from: setIOnSearchStateChangedListener */
    public void m54305xadb6a185(or1.q qVar) {
        this.f175520m = qVar;
    }

    /* renamed from: setMode */
    public void m54306x764d6925(int i17) {
        this.f175525r = i17;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(onTouchListener);
        this.f175514d.setOnTouchListener(onTouchListener);
    }

    /* renamed from: setReporter */
    public void m54307x5d1e8363(or1.l lVar) {
        or1.m mVar = this.f175515e;
        if (mVar != null) {
            mVar.f429069s = lVar;
        }
    }

    /* renamed from: setScene */
    public void m54308x53aed94a(int i17) {
        this.f175521n = i17;
        this.f175515e.getClass();
    }
}
