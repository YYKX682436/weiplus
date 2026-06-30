package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class th extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f104613e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f104614f;

    /* renamed from: g, reason: collision with root package name */
    public final int f104615g;

    /* renamed from: m, reason: collision with root package name */
    public boolean f104618m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f104619n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f104620o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f104621p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f104623r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f104624s;

    /* renamed from: t, reason: collision with root package name */
    public long f104625t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f104616h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public so2.i1 f104617i = new so2.i1();

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.lh f104622q = new com.tencent.mm.plugin.finder.convert.lh(this);

    /* renamed from: u, reason: collision with root package name */
    public final in5.s f104626u = new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$itemConvertFactory$1
        @Override // in5.s
        public in5.r getItemConvert(int type) {
            if (type == 2004) {
                return new com.tencent.mm.plugin.finder.convert.uh(com.tencent.mm.plugin.finder.convert.th.this.f104615g);
            }
            if (type == 2005) {
                return new com.tencent.mm.plugin.finder.convert.vh(com.tencent.mm.plugin.finder.convert.th.this.f104615g);
            }
            com.tencent.mm.plugin.finder.convert.th.n(com.tencent.mm.plugin.finder.convert.th.this);
            hc2.l.a("FinderFeedLiveListConvert", type);
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.qh f104627v = new com.tencent.mm.plugin.finder.convert.qh(this);

    public th(com.tencent.mm.plugin.finder.feed.k8 k8Var, r45.qt2 qt2Var, int i17) {
        this.f104613e = k8Var;
        this.f104614f = qt2Var;
        this.f104615g = i17;
    }

    public static final /* synthetic */ java.lang.String n(com.tencent.mm.plugin.finder.convert.th thVar) {
        thVar.getClass();
        return "FinderFeedLiveListConvert";
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487849q;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.tencent.mm.plugin.finder.convert.lh lhVar = this.f104622q;
        lhVar.f103929b = recyclerView;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104613e;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        if (pzVar != null && (finderHomeTabFragment = pzVar.f108756h) != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = (com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class);
            d1Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.DoubleClickTipUIC", "registActionBarLayoutChangeListener, actionBarLayoutChangeListener:" + lhVar + '!');
            d1Var.f134064n = lhVar;
            android.view.ViewGroup O6 = d1Var.O6();
            if (O6 != null && (viewTreeObserver = O6.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) ((jz5.n) d1Var.f134068r).getValue());
            }
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "[onAttachedToRecyclerView]");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f7 A[LOOP:2: B:58:0x01c7->B:71:0x01f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fd A[EDGE_INSN: B:72:0x01fd->B:73:0x01fd BREAK  A[LOOP:2: B:58:0x01c7->B:71:0x01f7], SYNTHETIC] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, in5.c r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.th.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        p(holder);
        recyclerView.i(this.f104627v);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.icm);
        kotlin.jvm.internal.o.d(wxRecyclerView);
        ym5.a1.g(wxRecyclerView, new com.tencent.mm.plugin.finder.convert.sh(this));
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "[onDetachedFromRecyclerView]");
        recyclerView.V0(this.f104627v);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104613e;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        if (pzVar == null || (finderHomeTabFragment = pzVar.f108756h) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).V6();
    }

    public final void o(in5.s0 s0Var, int i17) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ian);
        if (p17 != null) {
            p17.setPadding(p17.getPaddingLeft(), i17, p17.getPaddingRight(), p17.getPaddingBottom());
            com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "adjustLayoutPadding newHeight:" + i17);
        }
    }

    public final void p(in5.s0 s0Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) s0Var.p(com.tencent.mm.R.id.icm);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(this.f104626u, this.f104616h, false);
        this.f104619n = wxRecyclerAdapter;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 10.0f), 1));
        in5.n0.U(wxRecyclerAdapter, view, 1, false, 4, null);
        android.view.View view2 = new android.view.View(context);
        view2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 10.0f), 1));
        in5.n0.P(wxRecyclerAdapter, view2, 2, false, 4, null);
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.convert.mh(wxRecyclerAdapter, this);
        this.f104620o = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        this.f104621p = new com.tencent.mm.plugin.finder.convert.nh(this);
        wxRecyclerView.setAdapter(this.f104619n);
        wxRecyclerView.setLayoutManager(this.f104620o);
        androidx.recyclerview.widget.w2 w2Var = this.f104621p;
        if (w2Var != null) {
            wxRecyclerView.i(w2Var);
        }
        wxRecyclerView.setHasFixedSize(true);
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f104613e;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = finderHomeTabFragment instanceof androidx.fragment.app.Fragment ? finderHomeTabFragment : null;
        if (finderHomeTabFragment2 != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.qh) pf5.z.f353948a.b(finderHomeTabFragment2).a(com.tencent.mm.plugin.finder.viewmodel.component.qh.class)).f135713h = true;
        }
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "[bindAdapter] tabType:" + this.f104615g + ",innderAdapter:" + this.f104619n);
    }

    public final java.lang.String q() {
        int i17 = this.f104615g;
        if (i17 == 1) {
            ml2.q1 q1Var = ml2.q1.f327812e;
            return "temp_9";
        }
        if (i17 == 3) {
            ml2.q1 q1Var2 = ml2.q1.f327812e;
        } else {
            if (i17 == 2) {
                ml2.q1 q1Var3 = ml2.q1.f327812e;
                return "temp_10";
            }
            ml2.q1 q1Var4 = ml2.q1.f327812e;
        }
        return "temp_1";
    }
}
