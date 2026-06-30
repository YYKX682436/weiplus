package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\tR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Lin5/c;", "D", "Lin5/n0;", "Lin5/s0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljava/util/ArrayList;", "in5/b1", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter */
/* loaded from: classes10.dex */
public class C22848x6ddd90cf<D extends in5.c> extends in5.n0 {
    public boolean A;
    public in5.u B;
    public final android.util.LongSparseArray C;
    public final android.util.LongSparseArray D;
    public final android.util.LongSparseArray E;
    public in5.y0 F;
    public in5.b1 G;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 H;
    private java.util.ArrayList<D> data;

    /* renamed from: t, reason: collision with root package name */
    public final in5.s f295248t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f295249u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f295250v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f295251w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f295252x;

    /* renamed from: y, reason: collision with root package name */
    public final in5.d1 f295253y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.LongSparseArray f295254z;

    public /* synthetic */ C22848x6ddd90cf(in5.s sVar, java.util.ArrayList arrayList, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(sVar, arrayList, (i17 & 4) != 0 ? false : z17);
    }

    public final void A0() {
        b0().post(new in5.k1(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public void mo8160xd8bfd53(in5.s0 holder) {
        in5.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        if (layoutParams == null || (cVar = (in5.c) holder.f374658i) == null) {
            return;
        }
        boolean z17 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams;
        android.util.LongSparseArray longSparseArray = this.f295254z;
        if (z17) {
            in5.v0 v0Var = new in5.v0(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams).e(), holder.f3639x46306858.getMeasuredWidth(), holder.f3639x46306858.getMeasuredHeight());
            if (v0Var.f374677b == 0 || v0Var.f374678c == 0) {
                holder.f3639x46306858.post(new in5.l1(v0Var, holder));
            }
            longSparseArray.put(cVar.mo2128x1ed62e84(), v0Var);
            return;
        }
        in5.v0 v0Var2 = new in5.v0(0, holder.f3639x46306858.getMeasuredWidth(), holder.f3639x46306858.getMeasuredHeight());
        if (v0Var2.f374677b == 0 || v0Var2.f374678c == 0) {
            holder.f3639x46306858.post(new in5.m1(v0Var2, holder));
        }
        longSparseArray.put(cVar.mo2128x1ed62e84(), v0Var2);
    }

    @Override // in5.n0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public void mo8161x38c82990(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        in5.r rVar = (in5.r) this.f295250v.get(java.lang.Integer.valueOf(holder.m8185xcdaf1228()));
        if (rVar != null) {
            rVar.k(holder);
        }
        super.mo8161x38c82990(holder);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void mo8162x34789575(in5.s0 holder) {
        in5.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "rvnotify-test-onViewRecycled viewType=" + holder.m8185xcdaf1228() + " hashCode=" + holder.f3639x46306858.hashCode());
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        if (y0Var != null) {
            this.f295251w.remove(y0Var);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = holder.f374653d;
        if (y0Var2 != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
        }
        holder.f374653d = null;
        if (holder.m8183xf806b362() >= 0 && (rVar = (in5.r) this.f295250v.get(java.lang.Integer.valueOf(holder.m8185xcdaf1228()))) != null) {
            rVar.l(holder);
        }
        super.mo8162x34789575(holder);
    }

    public final void E0(java.util.ArrayList newData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newData, "newData");
        this.data = newData;
    }

    @Override // in5.n0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 K(android.view.ViewGroup parent, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        in5.r u07 = u0(i17);
        android.os.SystemClock.uptimeMillis();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(u07.e(), parent, false);
        android.os.SystemClock.uptimeMillis();
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f374659m = b0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent;
        u07.i(c1163xf1deaba4, s0Var, i17);
        s0Var.f374655f = c1163xf1deaba4.mo7946xf939df19();
        return s0Var;
    }

    @Override // in5.n0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 L(android.view.ViewGroup parent, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        in5.r v07 = v0(i17);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(v07.e(), parent, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "CreateView Cost=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms viewType=" + i17);
        in5.s0 s0Var = new in5.s0(inflate);
        s0Var.f374659m = b0();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent;
        v07.i(c1163xf1deaba4, s0Var, i17);
        s0Var.f374655f = c1163xf1deaba4.mo7946xf939df19();
        return s0Var;
    }

    @Override // in5.n0
    public void V(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, boolean z17) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295251w;
        if (z17) {
            holder.j();
            p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
            if (y0Var != null) {
                concurrentHashMap.put(y0Var, new java.lang.Object());
                return;
            }
            return;
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = holder.f374653d;
        if (y0Var2 != null) {
            concurrentHashMap.remove(y0Var2);
        }
        holder.i();
        p3325xe03a0797.p3326xc267989b.y0 y0Var3 = holder.f374653d;
        if (y0Var3 != null) {
            concurrentHashMap.put(y0Var3, new java.lang.Object());
        }
    }

    @Override // in5.n0
    public void X(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295251w;
        if (y0Var != null) {
            concurrentHashMap.remove(y0Var);
        }
        holder.i();
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = holder.f374653d;
        if (y0Var2 != null) {
            concurrentHashMap.put(y0Var2, new java.lang.Object());
        }
    }

    /* renamed from: getData */
    public final java.util.List m82898xfb7e5820() {
        return this.data;
    }

    @Override // in5.n0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view.getParent() != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerViewAdapterEx", java.lang.String.valueOf(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3()));
        }
        return new in5.s0(view);
    }

    @Override // in5.n0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void B(in5.s0 holder, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.B(holder, i17, info);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        holder.f374659m = b0();
        holder.f374658i = info;
        u0(mo863xcdaf1228).h(holder, info, i17, mo863xcdaf1228, false, null);
    }

    @Override // in5.n0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void E(in5.s0 holder, int i17, in5.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.E(holder, i17, info);
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        holder.f374659m = b0();
        holder.f374658i = info;
        v0(mo863xcdaf1228).h(holder, info, i17, mo863xcdaf1228, false, null);
    }

    @Override // in5.n0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8156x4147ed22(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rvnotify-test-onAttachedToRecyclerView ");
        sb6.append(j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", sb6.toString());
        if (j62.e.g().i("clicfg_scope_adapter_notify_all_switch", 0, false, false) == 1) {
            recyclerView.addOnAttachStateChangeListener(this.f295253y);
        }
        java.util.Iterator it = this.f295250v.entrySet().iterator();
        while (it.hasNext()) {
            in5.r rVar = (in5.r) ((java.util.Map.Entry) it.next()).getValue();
            if (!rVar.f()) {
                rVar.g(recyclerView, this);
            }
        }
        if (this.f295249u) {
            in5.b1 b1Var = new in5.b1(this);
            recyclerView.i(b1Var);
            this.G = b1Var;
            in5.i1 i1Var = new in5.i1(recyclerView, this);
            mo8163xed962dec(i1Var);
            this.H = i1Var;
        }
    }

    @Override // in5.n0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.mo8158xdba684df(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerViewAdapterEx", "rvnotify-test-onDetachedFromRecyclerView");
        recyclerView.removeOnAttachStateChangeListener(this.f295253y);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295251w;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.z0.e((p3325xe03a0797.p3326xc267989b.y0) ((java.util.Map.Entry) it.next()).getKey(), null, 1, null);
        }
        concurrentHashMap.clear();
        java.util.Iterator it6 = this.f295250v.entrySet().iterator();
        while (it6.hasNext()) {
            in5.r rVar = (in5.r) ((java.util.Map.Entry) it6.next()).getValue();
            if (rVar.f()) {
                rVar.j(recyclerView);
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var = this.H;
        if (h2Var != null) {
            mo8165x48eac7b3(h2Var);
        }
    }

    @Override // in5.n0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void I(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int mo863xcdaf1228 = mo863xcdaf1228(a0() + i17);
        D d17 = this.data.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "get(...)");
        D d18 = d17;
        holder.f374658i = d18;
        holder.f374659m = b0();
        w0(mo863xcdaf1228).h(holder, d18, i17, mo863xcdaf1228, false, null);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        t0(itemView, d18, i17);
        if (this.A) {
            this.A = false;
            b0().post(new in5.c1(this));
        }
    }

    @Override // in5.n0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        int mo863xcdaf1228 = mo863xcdaf1228(a0() + i17);
        D d17 = this.data.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "get(...)");
        D d18 = d17;
        holder.f374659m = b0();
        holder.f374658i = d18;
        w0(mo863xcdaf1228).h(holder, d18, i17, mo863xcdaf1228, true, payloads);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        t0(itemView, d18, i17);
    }

    @Override // in5.n0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        in5.r w07 = w0(i17);
        android.view.View c17 = w07.c(b0());
        if (c17 == null) {
            c17 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(w07.e(), parent, false);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 b07 = b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        in5.s0 d17 = w07.d(b07, c17);
        if (d17 == null) {
            d17 = new in5.s0(c17);
        }
        d17.f374659m = b0();
        w07.i(b0(), d17, i17);
        d17.f374655f = b0().mo7946xf939df19();
        return d17;
    }

    public final void t0(android.view.View view, in5.c cVar, int i17) {
        if (x0()) {
            view.setOnTouchListener(new in5.e1(this, i17, view, cVar));
            view.setOnClickListener(new in5.f1(this, i17, view, cVar));
            view.setOnLongClickListener(new in5.g1(this, i17, view, cVar));
        }
    }

    public final in5.r u0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295250v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f295248t.mo43555xf2bb75ea(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx.FixedViewInfo>");
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    public final in5.r v0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295250v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f295248t.mo43555xf2bb75ea(i17);
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    public final in5.r w0(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f295250v;
        in5.r rVar = (in5.r) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (rVar == null) {
            rVar = this.f295248t.mo43555xf2bb75ea(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(rVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<D of com.tencent.mm.view.recyclerview.WxRecyclerAdapter>");
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), rVar);
            if (!rVar.f()) {
                rVar.g(b0(), this);
            }
        }
        return rVar;
    }

    @Override // in5.n0
    public int x() {
        return this.data.size();
    }

    public boolean x0() {
        return this instanceof f41.v;
    }

    @Override // in5.n0
    public long y(int i17) {
        return this.data.get(i17).mo2128x1ed62e84();
    }

    public void y0(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        in5.b1 b1Var = this.G;
        if (b1Var != null) {
            b1Var.mo481x4d79408f(recyclerView, 5);
        }
    }

    @Override // in5.n0
    public int z(int i17) {
        return this.data.get(i17).h();
    }

    public final void z0() {
        b0().post(new in5.j1(this));
    }

    public C22848x6ddd90cf(in5.s itemConvertFactory, java.util.ArrayList data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f295248t = itemConvertFactory;
        this.data = data;
        this.f295249u = z17;
        this.f295250v = new java.util.concurrent.ConcurrentHashMap();
        this.f295251w = new java.util.concurrent.ConcurrentHashMap();
        this.f295253y = new in5.d1(this);
        this.f295254z = new android.util.LongSparseArray();
        this.A = true;
        this.C = new android.util.LongSparseArray();
        this.D = new android.util.LongSparseArray();
        this.E = new android.util.LongSparseArray();
    }
}
