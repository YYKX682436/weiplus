package com.tencent.mm.plugin.brandservice.ui.base;

/* loaded from: classes9.dex */
public class BrandServiceSortView extends com.tencent.mm.ui.base.sortview.BaseSortView implements lr1.r, android.widget.AdapterView.OnItemLongClickListener, android.view.View.OnCreateContextMenuListener, fb5.j {
    public pr1.j A;
    public boolean B;
    public boolean C;
    public com.tencent.mm.ui.widget.dialog.u3 D;
    public boolean E;
    public pr1.i F;
    public pr1.h G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f94047J;
    public android.view.View K;
    public android.widget.TextView L;
    public final db5.t4 M;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f94048s;

    /* renamed from: t, reason: collision with root package name */
    public final lr1.s f94049t;

    /* renamed from: u, reason: collision with root package name */
    public int f94050u;

    /* renamed from: v, reason: collision with root package name */
    public rl5.r f94051v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f94052w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ListView f94053x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f94054y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f94055z;

    public BrandServiceSortView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f94048s = new java.util.HashMap();
        lr1.s sVar = new lr1.s();
        this.f94049t = sVar;
        this.f94050u = 251658241;
        this.E = true;
        this.H = 0;
        this.I = 0;
        this.M = new pr1.f(this);
        setDataSetObserver(this);
        setShowFooterView(false);
        i();
        java.util.LinkedList linkedList = sVar.f320701d;
        if (!linkedList.contains(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
            linkedList.add(this);
        }
        this.f94051v = new rl5.r(getContext());
        setOnItemClickListener(new pr1.b(this));
        setOnItemLongClickListener(this);
    }

    public static java.util.List g(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView, java.util.List list) {
        brandServiceSortView.getClass();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.co coVar = (r45.co) list.get(i17);
            if (coVar != null && coVar.f371677e != null) {
                if (brandServiceSortView.G != null) {
                    java.lang.String username = coVar.f371676d;
                    kotlin.jvm.internal.o.g(username, "username");
                    if (!((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).Ri(username) || kotlin.jvm.internal.o.b("gh_1564d9ea7be2", username)) {
                    }
                }
                fb5.n nVar = new fb5.n();
                nVar.f260898b = coVar;
                int W0 = coVar.f371677e.W0();
                if (W0 >= 97 && W0 <= 122) {
                    W0 -= 32;
                }
                if (W0 < 65 || W0 > 90) {
                    nVar.f260897a = "#";
                } else {
                    nVar.f260897a = ((char) W0) + "";
                }
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public static void h(com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView) {
        fb5.m mVar = brandServiceSortView.f197866g;
        mVar.c(mVar.f260894d);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488253o7, this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        com.tencent.mm.storage.z3 z3Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && nVar != null) {
            this.f94047J = str;
            r45.co coVar = (r45.co) nVar.f260898b;
            if (coVar == null || (z3Var = coVar.f371677e) == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
            } else {
                java.lang.String g27 = z3Var.g2();
                java.lang.String T0 = z3Var.T0();
                java.lang.String U0 = z3Var.U0();
                java.lang.String upperCase = str.toUpperCase();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) {
                    return true;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(T0) && T0.toUpperCase().indexOf(upperCase) != -1) {
                    return true;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.H = (int) motionEvent.getRawX();
            this.I = (int) motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public pr1.j getITransferToChildOnTouchListener() {
        return this.A;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new pr1.e(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        this.f94053x = (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
        if (this.K == null) {
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a2z, null);
            this.K = inflate;
            if (this.f94053x != null && inflate != null) {
                this.L = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cjm);
                this.f94053x.addFooterView(this.K, null, false);
            }
        }
        return this.f94053x;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        return findViewById(com.tencent.mm.R.id.kch);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.mwe);
    }

    public void i() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        pr1.c cVar = new pr1.c(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cVar, 1000L, false);
        lr1.s sVar = this.f94049t;
        pr1.d dVar = new pr1.d(this);
        sVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        pq5.h.a().q(new lr1.q(sVar, linkedList, linkedList2)).h(new lr1.p(sVar, linkedList, linkedList2, dVar));
    }

    public void j() {
        if (gm0.j1.a()) {
            ((java.util.ArrayList) r01.q3.pj().f368275a).clear();
        }
        lr1.s sVar = this.f94049t;
        sVar.getClass();
        gm0.j1.d().q(387, sVar);
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.Object obj;
        if (contextMenuInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        fb5.n nVar = (fb5.n) ((android.widget.AdapterView) view).getItemAtPosition(adapterContextMenuInfo.position);
        if (nVar == null || (obj = nVar.f260898b) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", nVar);
            return;
        }
        com.tencent.mm.storage.z3 z3Var = ((r45.co) obj).f371677e;
        if (z3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
            return;
        }
        this.f94052w = z3Var.d1();
        java.lang.String g27 = z3Var.g2();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        ((ke0.e) xVar).getClass();
        contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, g27));
        qk.o b17 = r01.z.b(z3Var.d1());
        if (b17 == null || b17.J0()) {
            return;
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.tencent.mm.R.string.gqb);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        pr1.j jVar = this.A;
        if (jVar != null) {
            ((com.tencent.mm.plugin.brandservice.ui.BrandServiceLocalSearchUI) jVar).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (this.C) {
            return false;
        }
        rl5.r rVar = this.f94051v;
        rVar.f397350t = view;
        rVar.g(adapterView, i17, j17, this, this.M, this.H, this.I);
        return true;
    }

    public void setDataSource(pr1.h hVar) {
        this.G = hVar;
    }

    public void setDelegate(pr1.i iVar) {
        this.F = iVar;
    }

    public void setITransferToChildOnTouchListener(pr1.j jVar) {
        this.A = jVar;
    }

    public void setIsCustomItemClickEnabled(boolean z17) {
        this.f94055z = z17;
    }

    public void setIsItemLongClickDisabled(boolean z17) {
        this.C = z17;
    }

    public void setReturnResult(boolean z17) {
        this.B = z17;
    }

    public void setServiceType(int i17) {
        this.f94050u = i17;
        i();
    }

    public void setShowFooterView(boolean z17) {
        f(this.L, z17);
    }

    public void setShowItemDetailView(boolean z17) {
        this.f94054y = z17;
    }
}
