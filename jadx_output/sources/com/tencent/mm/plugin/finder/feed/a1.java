package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class a1 implements fs2.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f106174d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106175e;

    /* renamed from: f, reason: collision with root package name */
    public final int f106176f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106177g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f106178h;

    /* renamed from: i, reason: collision with root package name */
    public final int f106179i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.RefreshLoadMoreLayout f106180m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f106181n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.k0 f106182o;

    /* renamed from: p, reason: collision with root package name */
    public final int f106183p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f106184q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f106185r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f106186s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f106187t;

    public a1(com.tencent.mm.ui.MMActivity context, int i17, int i18, boolean z17, int i19, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f106174d = context;
        this.f106175e = i18;
        this.f106176f = i19;
        this.f106177g = z18;
        this.f106178h = "Finder.FinderBaseGridFeedUIContract.ViewCallback";
        this.f106179i = 3;
        android.view.View l17 = l(com.tencent.mm.R.id.m6e);
        kotlin.jvm.internal.o.d(l17);
        this.f106180m = (com.tencent.mm.view.RefreshLoadMoreLayout) l17;
        this.f106183p = -1;
        this.f106184q = new com.tencent.mm.plugin.finder.storage.jj0(0, null, 3, null);
        this.f106187t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.m0(this));
    }

    public android.view.View A() {
        return null;
    }

    public abstract java.lang.CharSequence B(ym5.s3 s3Var);

    public void C(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public void D(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public boolean E(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return false;
    }

    public float F() {
        return 0.0f;
    }

    public final boolean G(r45.qt2 qt2Var) {
        int integer = qt2Var.getInteger(5);
        boolean z17 = integer == 22 || integer == 26 || integer == 28 || integer == 30 || integer == 81 || integer == 138 || integer == 155;
        com.tencent.mars.xlog.Log.i(this.f106178h, "needMarkRead:" + z17 + " commentScene:" + qt2Var.getInteger(5) + " fromCommentScene:" + qt2Var.getInteger(7));
        return z17;
    }

    public final boolean H(r45.qt2 qt2Var) {
        int integer = qt2Var.getInteger(5);
        boolean z17 = integer == 95 || integer == 138 || integer == 195;
        com.tencent.mars.xlog.Log.i(this.f106178h, "needReportWhiteScreen:" + z17 + " commentScene:" + qt2Var.getInteger(5) + " fromCommentScene:" + qt2Var.getInteger(7));
        return z17;
    }

    public boolean I() {
        return false;
    }

    public void J(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public abstract void K(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17);

    public void L(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
    }

    public abstract void M();

    public void N(boolean z17) {
    }

    public void O(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }

    public void P() {
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.x0(this));
    }

    public boolean Q(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return false;
    }

    public boolean R() {
        return !(this instanceof com.tencent.mm.plugin.finder.feed.xa);
    }

    public boolean S() {
        return !(this instanceof com.tencent.mm.plugin.finder.feed.xa);
    }

    public final void T(com.tencent.mm.plugin.finder.feed.k0 k0Var) {
        kotlin.jvm.internal.o.g(k0Var, "<set-?>");
        this.f106182o = k0Var;
    }

    public void U() {
        com.tencent.mars.xlog.Log.i(this.f106178h, "showEmptyView");
        android.view.View t17 = t();
        if (t17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f106180m;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(8);
            }
            android.widget.TextView textView = (android.widget.TextView) t17.findViewById(com.tencent.mm.R.id.dft);
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View findViewById = t17.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = t17.findViewById(com.tencent.mm.R.id.m2g);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public boolean V() {
        return this instanceof com.tencent.mm.plugin.finder.feed.co;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.f106180m.getRecyclerView();
    }

    public final android.view.View l(int i17) {
        android.view.View findViewById;
        android.view.View A = A();
        return (A == null || (findViewById = A.findViewById(i17)) == null) ? this.f106174d.findViewById(i17) : findViewById;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter o() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106181n;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }

    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f106184q;
    }

    public void r(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f106180m.getRecyclerView();
        com.tencent.mm.ui.MMActivity activity = this.f106174d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager y17 = y(activity);
        kotlin.jvm.internal.o.g(y17, "<set-?>");
        recyclerView.setLayoutManager(y17);
        com.tencent.mm.plugin.finder.feed.n0 n0Var = new com.tencent.mm.plugin.finder.feed.n0(data, this, z().c(), I());
        this.f106181n = n0Var;
        recyclerView.setAdapter(n0Var);
        recyclerView.N(x());
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f106181n;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.feed.o0(this);
        wxRecyclerAdapter.f293104n = new com.tencent.mm.plugin.finder.feed.p0(this);
        android.view.View w17 = w();
        this.f106185r = w17;
        if (w17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f106181n;
            if (wxRecyclerAdapter2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            in5.n0.U(wxRecyclerAdapter2, w17, 0, false, 4, null);
        }
        android.view.View v17 = v();
        this.f106186s = v17;
        if (v17 != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f106181n;
            if (wxRecyclerAdapter3 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            wxRecyclerAdapter3.O(v17, this.f106183p, false);
        }
        this.f106180m.setActionCallback(new com.tencent.mm.plugin.finder.feed.u0(this));
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        int i17 = this.f106176f;
        fc2.o Z6 = nyVar.Z6(i17);
        if (Z6 != null) {
            Z6.d(recyclerView);
        }
        P();
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.S1().r()).intValue() == 1) {
            recyclerView.i(u());
        }
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) a17;
        r45.qt2 W6 = nyVar2.n7() ? nyVar2.W6(i17) : nyVar2.V6();
        if (G(W6) || H(W6)) {
            in5.o.b(recyclerView, new com.tencent.mm.plugin.finder.feed.y0(this, W6, new com.tencent.mm.plugin.finder.feed.w0(this, W6), new com.tencent.mm.plugin.finder.feed.v0(this, W6), F()), com.tencent.mm.plugin.finder.feed.z0.f111219d);
        } else {
            z().f107159h.b(recyclerView, W6);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            or2.j.f347656a.a(recyclerView, getClass().getSimpleName());
        }
    }

    public abstract java.lang.String s(ym5.s3 s3Var);

    public abstract android.view.View t();

    public final sc2.c8 u() {
        return (sc2.c8) ((jz5.n) this.f106187t).getValue();
    }

    public android.view.View v() {
        return null;
    }

    public abstract android.view.View w();

    public abstract androidx.recyclerview.widget.p2 x();

    public abstract androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context);

    public final com.tencent.mm.plugin.finder.feed.k0 z() {
        com.tencent.mm.plugin.finder.feed.k0 k0Var = this.f106182o;
        if (k0Var != null) {
            return k0Var;
        }
        kotlin.jvm.internal.o.o("present");
        throw null;
    }

    public /* synthetic */ a1(com.tencent.mm.ui.MMActivity mMActivity, int i17, int i18, boolean z17, int i19, boolean z18, int i27, kotlin.jvm.internal.i iVar) {
        this(mMActivity, i17, i18, (i27 & 8) != 0 ? false : z17, (i27 & 16) != 0 ? -1 : i19, (i27 & 32) != 0 ? false : z18);
    }
}
