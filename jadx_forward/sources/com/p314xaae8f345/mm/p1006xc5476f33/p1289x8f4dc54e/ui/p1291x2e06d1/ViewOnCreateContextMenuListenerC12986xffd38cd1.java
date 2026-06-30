package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView */
/* loaded from: classes9.dex */
public class ViewOnCreateContextMenuListenerC12986xffd38cd1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374 implements lr1.r, android.widget.AdapterView.OnItemLongClickListener, android.view.View.OnCreateContextMenuListener, fb5.j {
    public pr1.j A;
    public boolean B;
    public boolean C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 D;
    public boolean E;
    public pr1.i F;
    public pr1.h G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f175580J;
    public android.view.View K;
    public android.widget.TextView L;
    public final db5.t4 M;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f175581s;

    /* renamed from: t, reason: collision with root package name */
    public final lr1.s f175582t;

    /* renamed from: u, reason: collision with root package name */
    public int f175583u;

    /* renamed from: v, reason: collision with root package name */
    public rl5.r f175584v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f175585w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ListView f175586x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f175587y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f175588z;

    public ViewOnCreateContextMenuListenerC12986xffd38cd1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f175581s = new java.util.HashMap();
        lr1.s sVar = new lr1.s();
        this.f175582t = sVar;
        this.f175583u = 251658241;
        this.E = true;
        this.H = 0;
        this.I = 0;
        this.M = new pr1.f(this);
        m79358xb669868c(this);
        m54324x6a3f32bf(false);
        i();
        java.util.LinkedList linkedList = sVar.f402234d;
        if (!linkedList.contains(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
            linkedList.add(this);
        }
        this.f175584v = new rl5.r(getContext());
        m79360xa1aeda28(new pr1.b(this));
        m79361x1c3e70c(this);
    }

    public static java.util.List g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1, java.util.List list) {
        viewOnCreateContextMenuListenerC12986xffd38cd1.getClass();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.co coVar = (r45.co) list.get(i17);
            if (coVar != null && coVar.f453210e != null) {
                if (viewOnCreateContextMenuListenerC12986xffd38cd1.G != null) {
                    java.lang.String username = coVar.f453209d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                    if (!((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).Ri(username) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("gh_1564d9ea7be2", username)) {
                    }
                }
                fb5.n nVar = new fb5.n();
                nVar.f342431b = coVar;
                int W0 = coVar.f453210e.W0();
                if (W0 >= 97 && W0 <= 122) {
                    W0 -= 32;
                }
                if (W0 < 65 || W0 > 90) {
                    nVar.f342430a = "#";
                } else {
                    nVar.f342430a = ((char) W0) + "";
                }
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1) {
        fb5.m mVar = viewOnCreateContextMenuListenerC12986xffd38cd1.f279399g;
        mVar.c(mVar.f342427d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569786o7, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    public boolean c(java.lang.String str, fb5.n nVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && nVar != null) {
            this.f175580J = str;
            r45.co coVar = (r45.co) nVar.f342431b;
            if (coVar == null || (z3Var = coVar.f453210e) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
            } else {
                java.lang.String g27 = z3Var.g2();
                java.lang.String T0 = z3Var.T0();
                java.lang.String U0 = z3Var.U0();
                java.lang.String upperCase = str.toUpperCase();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) {
                    return true;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T0) && T0.toUpperCase().indexOf(upperCase) != -1) {
                    return true;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase)) {
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

    /* renamed from: getITransferToChildOnTouchListener */
    public pr1.j m54316x60135a31() {
        return this.A;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getItemViewCreator */
    public fb5.l mo48655x185aee7e() {
        return new pr1.e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getListView */
    public android.widget.ListView mo48656xcc101dd9() {
        this.f175586x = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        if (this.K == null) {
            android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a2z, null);
            this.K = inflate;
            if (this.f175586x != null && inflate != null) {
                this.L = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cjm);
                this.f175586x.addFooterView(this.K, null, false);
            }
        }
        return this.f175586x;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getNoResultView */
    public android.view.View mo48657x932e1f79() {
        return findViewById(com.p314xaae8f345.mm.R.id.kch);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2644x631d3143.AbstractC21579x95b0374
    /* renamed from: getScrollBar */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 mo48658x1853ff50() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById(com.p314xaae8f345.mm.R.id.mwe);
    }

    public void i() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        pr1.c cVar = new pr1.c(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cVar, 1000L, false);
        lr1.s sVar = this.f175582t;
        pr1.d dVar = new pr1.d(this);
        sVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        pq5.h.a().q(new lr1.q(sVar, linkedList, linkedList2)).h(new lr1.p(sVar, linkedList, linkedList2, dVar));
    }

    public void j() {
        if (gm0.j1.a()) {
            ((java.util.ArrayList) r01.q3.pj().f449808a).clear();
        }
        lr1.s sVar = this.f175582t;
        sVar.getClass();
        gm0.j1.d().q(387, sVar);
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.Object obj;
        if (contextMenuInfo == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        fb5.n nVar = (fb5.n) ((android.widget.AdapterView) view).getItemAtPosition(adapterContextMenuInfo.position);
        if (nVar == null || (obj = nVar.f342431b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", nVar);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = ((r45.co) obj).f453210e;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
            return;
        }
        this.f175585w = z3Var.d1();
        java.lang.String g27 = z3Var.g2();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        ((ke0.e) xVar).getClass();
        contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, g27));
        qk.o b17 = r01.z.b(z3Var.d1());
        if (b17 == null || b17.J0()) {
            return;
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqb);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        pr1.j jVar = this.A;
        if (jVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12978x882bdc19) jVar).mo48674x36654fab();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (this.C) {
            return false;
        }
        rl5.r rVar = this.f175584v;
        rVar.f478883t = view;
        rVar.g(adapterView, i17, j17, this, this.M, this.H, this.I);
        return true;
    }

    /* renamed from: setDataSource */
    public void m54317x683d6267(pr1.h hVar) {
        this.G = hVar;
    }

    /* renamed from: setDelegate */
    public void m54318xa7687c07(pr1.i iVar) {
        this.F = iVar;
    }

    /* renamed from: setITransferToChildOnTouchListener */
    public void m54319x3d908ba5(pr1.j jVar) {
        this.A = jVar;
    }

    /* renamed from: setIsCustomItemClickEnabled */
    public void m54320xd96da529(boolean z17) {
        this.f175588z = z17;
    }

    /* renamed from: setIsItemLongClickDisabled */
    public void m54321xa5206a69(boolean z17) {
        this.C = z17;
    }

    /* renamed from: setReturnResult */
    public void m54322xc605daef(boolean z17) {
        this.B = z17;
    }

    /* renamed from: setServiceType */
    public void m54323xfd4b21cd(int i17) {
        this.f175583u = i17;
        i();
    }

    /* renamed from: setShowFooterView */
    public void m54324x6a3f32bf(boolean z17) {
        f(this.L, z17);
    }

    /* renamed from: setShowItemDetailView */
    public void m54325x73721e68(boolean z17) {
        this.f175587y = z17;
    }
}
