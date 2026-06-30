package com.tencent.mm.plugin.brandservice.ui;

/* loaded from: classes12.dex */
public class BizSearchResultItemContainer extends android.widget.LinearLayout implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f93981d;

    /* renamed from: e, reason: collision with root package name */
    public or1.m f93982e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f93983f;

    /* renamed from: g, reason: collision with root package name */
    public or1.r f93984g;

    /* renamed from: h, reason: collision with root package name */
    public or1.p f93985h;

    /* renamed from: i, reason: collision with root package name */
    public lr1.h0 f93986i;

    /* renamed from: m, reason: collision with root package name */
    public or1.q f93987m;

    /* renamed from: n, reason: collision with root package name */
    public int f93988n;

    /* renamed from: o, reason: collision with root package name */
    public long[] f93989o;

    /* renamed from: p, reason: collision with root package name */
    public int f93990p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93991q;

    /* renamed from: r, reason: collision with root package name */
    public int f93992r;

    public BizSearchResultItemContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f93988n = 0;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489437cj1, this);
        this.f93984g = new or1.r(null);
        this.f93985h = new or1.p(null);
        this.f93983f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484218df0);
        this.f93981d = (android.widget.ListView) inflate.findViewById(com.tencent.mm.R.id.m1r);
    }

    public void a(java.lang.String str, int i17) {
        if (this.f93982e.isEmpty()) {
            this.f93983f.setVisibility(8);
        }
        if (str == null) {
            return;
        }
        java.lang.String trim = str.trim();
        if ("".equals(trim)) {
            return;
        }
        if ((!trim.equals(this.f93984g.f347557b) || this.f93991q) && !this.f93984g.f347560e) {
            this.f93982e.g();
            this.f93985h.a(0);
            or1.r rVar = this.f93984g;
            rVar.f347561f = false;
            rVar.f347560e = false;
            rVar.f347559d = 0;
            rVar.f347557b = null;
            rVar.f347556a = 1;
            rVar.f347560e = true;
            rVar.f347557b = trim;
            this.f93990p = i17;
            if (this.f93992r != 1) {
                gm0.j1.d().a(1070, this);
                or1.r rVar2 = this.f93984g;
                this.f93986i = new lr1.h0(rVar2.f347557b, rVar2.f347558c, this.f93988n);
                gm0.j1.d().g(this.f93986i);
            } else {
                long[] jArr = this.f93989o;
                if (jArr.length == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "business type size is 0.");
                    return;
                } else {
                    b(trim, i17, jArr[0]);
                    this.f93985h.a(0);
                }
            }
            or1.q qVar = this.f93987m;
            if (qVar != null) {
                com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI = (com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI) qVar;
                searchOrRecommendBizUI.f94043d = db5.e1.Q(searchOrRecommendBizUI.getContext(), searchOrRecommendBizUI.getString(com.tencent.mm.R.string.f490573yv), searchOrRecommendBizUI.getString(com.tencent.mm.R.string.bkc), true, true, new or1.k2(searchOrRecommendBizUI));
            }
        }
    }

    public final void b(java.lang.String str, int i17, long j17) {
        this.f93984g.f347560e = true;
        gm0.j1.d().a(1071, this);
        or1.m mVar = this.f93982e;
        long[] jArr = this.f93989o;
        or1.k k17 = mVar.k(jArr[jArr.length - 1]);
        r45.qp qpVar = null;
        java.util.List list = k17 != null ? k17.f347521h : null;
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "Get business content by type failed.(keyword : %s, offset : %s, businessType : %s)", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        } else {
            qpVar = (r45.qp) list.get(list.size() - 1);
        }
        gm0.j1.d().g(new lr1.g0(str, j17, i17, this.f93988n, qpVar != null ? qpVar.f384160m : ""));
        this.f93985h.a(1);
    }

    public or1.m getAdapter() {
        return this.f93982e;
    }

    public or1.q getIOnSearchStateChangedListener() {
        return this.f93987m;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        r45.qp qpVar;
        com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI;
        android.app.ProgressDialog progressDialog;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "errType (%d) , errCode (%d) , errMsg (errMsg)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        or1.q qVar = this.f93987m;
        if (qVar != null && (progressDialog = (searchOrRecommendBizUI = (com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI) qVar).f94043d) != null) {
            progressDialog.dismiss();
            searchOrRecommendBizUI.f94043d = null;
        }
        if (i17 != 0 || i18 != 0) {
            this.f93984g.f347560e = false;
            this.f93991q = true;
            java.lang.String G = com.tencent.mm.sdk.platformtools.t8.G(str);
            if (com.tencent.mm.sdk.platformtools.t8.K0(G)) {
                G = getContext().getString(com.tencent.mm.R.string.fdr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            }
            dp.a.makeText(getContext(), G, 0).show();
            return;
        }
        this.f93991q = false;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "scene is null.");
            return;
        }
        if (m1Var.getType() == 1070) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchHomePage.");
            gm0.j1.d().q(1070, this);
            r45.yw5 yw5Var = ((lr1.h0) m1Var).f320676h;
            java.util.LinkedList linkedList = yw5Var != null ? yw5Var.f391452e : null;
            this.f93982e.n(this.f93984g.f347557b, linkedList);
            or1.m mVar = this.f93982e;
            long[] jArr = this.f93989o;
            or1.k k17 = mVar.k(jArr[jArr.length - 1]);
            i19 = (k17 == null || k17.f347520g) ? 0 : k17.f347516c;
            i27 = i19 != 0 ? 2 : 3;
            if (linkedList != null && linkedList.size() > 0 && (qpVar = (r45.qp) linkedList.get(linkedList.size() - 1)) != null) {
                this.f93984g.f347559d = qpVar.f384161n + this.f93990p;
            }
        } else {
            if (m1Var.getType() != 1071) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "Error type(%d).", java.lang.Integer.valueOf(m1Var.getType()));
                return;
            }
            gm0.j1.d().q(1071, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchDetailPage.");
            r45.kw5 kw5Var = ((lr1.g0) m1Var).f320665f;
            r45.qp qpVar2 = kw5Var != null ? kw5Var.f379004d : null;
            if (qpVar2 == null || qpVar2.f384158h == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchResultItemContainer", "BusinessContent or itemList is null.");
            }
            i19 = qpVar2 == null ? 0 : qpVar2.f384155e;
            i27 = i19 != 0 ? 2 : 3;
            this.f93982e.f(qpVar2, true);
            if (qpVar2 != null) {
                this.f93984g.f347559d = qpVar2.f384161n + this.f93990p;
            }
        }
        if (this.f93982e.isEmpty()) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new or1.o(this));
        } else {
            this.f93984g.f347561f = true;
        }
        this.f93984g.f347556a = i19;
        this.f93985h.a(i27);
        this.f93984g.f347560e = false;
    }

    public void setAdapter(or1.m mVar) {
        this.f93982e = mVar;
        if (mVar == null) {
            this.f93981d.setAdapter((android.widget.ListAdapter) mVar);
            return;
        }
        mVar.getClass();
        android.widget.ListView listView = this.f93981d;
        or1.p pVar = this.f93985h;
        android.content.Context context = getContext();
        pVar.getClass();
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bsg, null);
        pVar.f347548a = inflate.findViewById(com.tencent.mm.R.id.imc);
        pVar.f347549b = inflate.findViewById(com.tencent.mm.R.id.f485680im1);
        pVar.f347550c = inflate.findViewById(com.tencent.mm.R.id.imi);
        android.view.View view = pVar.f347548a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = pVar.f347549b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = pVar.f347550c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$FooterController", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        listView.addFooterView(inflate, null, false);
        this.f93981d.setAdapter((android.widget.ListAdapter) this.f93982e);
        this.f93981d.setOnScrollListener(new or1.n(this));
        this.f93981d.setOnItemClickListener(this.f93982e);
        if (this.f93984g.f347558c == 0) {
            setBusinessTypes(1);
        }
    }

    public void setAddContactScene(int i17) {
        this.f93982e.f347529i = i17;
    }

    public void setBusinessTypes(long... jArr) {
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        this.f93989o = jArr;
        this.f93984g.f347558c = 0L;
        for (long j17 : jArr) {
            this.f93984g.f347558c |= j17;
        }
        or1.m mVar = this.f93982e;
        mVar.getClass();
        if (jArr.length > 0) {
            mVar.f347535r = jArr;
        }
    }

    public void setIOnSearchStateChangedListener(or1.q qVar) {
        this.f93987m = qVar;
    }

    public void setMode(int i17) {
        this.f93992r = i17;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        super.setOnTouchListener(onTouchListener);
        this.f93981d.setOnTouchListener(onTouchListener);
    }

    public void setReporter(or1.l lVar) {
        or1.m mVar = this.f93982e;
        if (mVar != null) {
            mVar.f347536s = lVar;
        }
    }

    public void setScene(int i17) {
        this.f93988n = i17;
        this.f93982e.getClass();
    }
}
