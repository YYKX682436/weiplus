package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v9 extends com.tencent.mm.plugin.finder.feed.q9 {

    /* renamed from: k, reason: collision with root package name */
    public final int f110882k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderContact f110883l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f110884m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f110885n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1 f110886o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1 f110887p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1 f110888q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f110889r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f110890s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.ref.WeakReference f110891t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1] */
    public v9(com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f110882k = com.tencent.mm.R.id.g1y;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f110886o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderFeedUiActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$adFeedUiActionListener$1
            {
                this.__eventId = 2090220060;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent) {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                com.tencent.mm.autogen.events.FinderFeedUiActionEvent event = finderFeedUiActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.feed.v9 v9Var = com.tencent.mm.plugin.finder.feed.v9.this;
                am.fb fbVar = event.f54275g;
                int i17 = fbVar.f6664b;
                if (i17 == 10000) {
                    long j17 = fbVar.f6663a;
                    java.lang.Runnable runnable = v9Var.f110885n;
                    if (runnable != null && (recyclerView = v9Var.f108810h) != null) {
                        recyclerView.removeCallbacks(runnable);
                    }
                    com.tencent.mm.plugin.finder.feed.r9 r9Var = new com.tencent.mm.plugin.finder.feed.r9(v9Var, j17);
                    v9Var.f110885n = r9Var;
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = v9Var.f108810h;
                    if (recyclerView2 != null) {
                        recyclerView2.postDelayed(r9Var, 1000L);
                    }
                    v9Var.m();
                    return true;
                }
                if (i17 == 40001) {
                    long j18 = fbVar.f6663a;
                    if (j18 != v9Var.f108805c) {
                        return true;
                    }
                    v9Var.n(j18, fbVar.f6669g, v9Var.f108808f);
                    return true;
                }
                if (i17 == 30000) {
                    com.tencent.mm.plugin.finder.feed.v9.f(v9Var, fbVar.f6663a, fbVar.f6669g, 3, 2, fbVar.f6665c, fbVar.f6666d);
                    return true;
                }
                if (i17 != 30001) {
                    return true;
                }
                com.tencent.mm.plugin.finder.feed.v9.f(v9Var, fbVar.f6663a, fbVar.f6669g, 2, 2, fbVar.f6665c, fbVar.f6666d);
                return true;
            }
        };
        this.f110887p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$feedUpdateListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                if (iaVar != null && iaVar.f6919b == 22) {
                    com.tencent.mm.plugin.finder.feed.v9.this.m();
                }
                return false;
            }
        };
        this.f110888q = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.feed.FinderFeedSnsAdHandler$lifecycleObserver$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f106092d;

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
            public final void onPause() {
                com.tencent.mm.plugin.finder.feed.v9 v9Var = com.tencent.mm.plugin.finder.feed.v9.this;
                androidx.recyclerview.widget.RecyclerView recyclerView = v9Var.f108810h;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(v9Var.f110885n);
                }
                v9Var.f110884m = v9Var.j(v9Var.f110883l);
                v9Var.g();
            }

            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
            public final void onResume() {
                androidx.recyclerview.widget.RecyclerView recyclerView;
                androidx.recyclerview.widget.f2 adapter;
                androidx.recyclerview.widget.RecyclerView recyclerView2;
                androidx.recyclerview.widget.f2 adapter2;
                androidx.recyclerview.widget.f2 adapter3;
                androidx.recyclerview.widget.f2 adapter4;
                androidx.recyclerview.widget.RecyclerView recyclerView3;
                androidx.recyclerview.widget.f2 adapter5;
                if (!this.f106092d) {
                    this.f106092d = true;
                    return;
                }
                com.tencent.mm.plugin.finder.feed.v9 v9Var = com.tencent.mm.plugin.finder.feed.v9.this;
                boolean j17 = v9Var.j(v9Var.f110883l);
                com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "changeAdFollowView isFollowCur:" + j17 + " isFollowOnLeavePage:" + v9Var.f110884m + ", lastFeedPos=" + v9Var.f108807e);
                if (v9Var.f110884m != j17) {
                    androidx.recyclerview.widget.RecyclerView recyclerView4 = v9Var.f108810h;
                    int itemCount = (recyclerView4 == null || (adapter5 = recyclerView4.getAdapter()) == null) ? 0 : adapter5.getItemCount();
                    if (j17) {
                        androidx.recyclerview.widget.RecyclerView recyclerView5 = v9Var.f108810h;
                        if (recyclerView5 != null && (adapter4 = recyclerView5.getAdapter()) != null) {
                            long itemId = adapter4.getItemId(v9Var.f108807e);
                            java.lang.Runnable runnable = v9Var.f110885n;
                            if (runnable != null && (recyclerView3 = v9Var.f108810h) != null) {
                                recyclerView3.removeCallbacks(runnable);
                            }
                            com.tencent.mm.plugin.finder.feed.r9 r9Var = new com.tencent.mm.plugin.finder.feed.r9(v9Var, itemId);
                            v9Var.f110885n = r9Var;
                            androidx.recyclerview.widget.RecyclerView recyclerView6 = v9Var.f108810h;
                            if (recyclerView6 != null) {
                                recyclerView6.postDelayed(r9Var, 1000L);
                            }
                        }
                        androidx.recyclerview.widget.RecyclerView recyclerView7 = v9Var.f108810h;
                        if (recyclerView7 != null && (adapter3 = recyclerView7.getAdapter()) != null) {
                            adapter3.notifyItemChanged(v9Var.f108807e, new jz5.l(25, 2));
                        }
                        v9Var.m();
                    } else {
                        v9Var.f108809g = false;
                        if (itemCount > 0 && (recyclerView = v9Var.f108810h) != null && (adapter = recyclerView.getAdapter()) != null) {
                            adapter.notifyItemRangeChanged(0, itemCount, new jz5.l(25, 0));
                        }
                        v9Var.n(v9Var.f108805c, v9Var.f108806d, null);
                    }
                    if (itemCount <= 0 || (recyclerView2 = v9Var.f108810h) == null || (adapter2 = recyclerView2.getAdapter()) == null) {
                        return;
                    }
                    adapter2.notifyItemRangeChanged(0, itemCount, new jz5.l(29, 1));
                }
            }
        };
        this.f110890s = jz5.h.b(com.tencent.mm.plugin.finder.feed.u9.f109146d);
    }

    public static final void f(com.tencent.mm.plugin.finder.feed.v9 v9Var, long j17, java.lang.String str, int i17, int i18, int i19, int i27) {
        int i28 = (j17 == v9Var.f108805c && v9Var.f108809g) ? i19 : i27;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.ui.MMActivity context = v9Var.f108803a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        o3Var.Fk(j17, str, i17, i18, i28, i19, "", nyVar != null ? nyVar.V6() : null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f108810h = recyclerView;
        com.tencent.mm.ui.MMActivity activity = this.f108803a;
        kotlin.jvm.internal.o.g(activity, "activity");
        fc2.c n17 = zy2.ra.n1((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class), 0, 1, null);
        if (n17 != null) {
            n17.a(this.f108812j);
        }
        alive();
        alive();
        activity.mo133getLifecycle().a(this.f110888q);
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void b(fc2.t ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "onCenterFeedChange");
        if (this.f108807e == 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f108810h;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f110885n);
            }
            g();
        }
        if (ev6.f260994m == 0) {
            n(ev6.f260992k, ev6.f260993l, ev6.f260996o);
        }
        this.f108809g = false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void c() {
        com.tencent.mm.ui.MMActivity activity = this.f108803a;
        kotlin.jvm.internal.o.g(activity, "activity");
        fc2.c n17 = zy2.ra.n1((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class), 0, 1, null);
        if (n17 != null) {
            n17.d(this.f108812j);
        }
        dead();
        dead();
        activity.mo133getLifecycle().c(this.f110888q);
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void d(long j17) {
        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "onVideoPlayOneMinute");
        if (j17 == this.f108805c && !this.f108809g) {
            com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "onVideoPlayOneMinute feedId:" + j17);
            l(j17);
        }
        this.f108804b = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.q9
    public void e(long j17) {
        if (j17 == this.f108805c && !this.f108809g) {
            l(j17);
        }
        super.e(j17);
    }

    public final void g() {
        android.view.View view;
        androidx.recyclerview.widget.k3 k3Var;
        androidx.recyclerview.widget.k3 k3Var2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.k3 m07;
        android.view.View findViewById;
        com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView invoke");
        if (i()) {
            java.lang.ref.WeakReference weakReference = this.f110891t;
            view = (weakReference == null || (k3Var = (androidx.recyclerview.widget.k3) weakReference.get()) == null) ? null : k3Var.itemView;
        } else {
            view = this.f110889r;
        }
        if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.e9w)) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView");
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f484486ee3);
            if (findViewById2 != null) {
                com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView footer translationY " + findViewById2.getTranslationY() + " footer :0.0");
                android.view.ViewPropertyAnimator animate = findViewById2.animate();
                if (animate != null) {
                    animate.cancel();
                }
                findViewById2.setTranslationY(0.0f);
            }
            android.view.View findViewById3 = view.findViewById(this.f110882k);
            if (findViewById3 != null) {
                com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView seekLayoutId translationY " + findViewById3.getTranslationY() + " seekLayoutId :0.0");
                android.view.ViewPropertyAnimator animate2 = findViewById3.animate();
                if (animate2 != null) {
                    animate2.cancel();
                }
                findViewById3.setTranslationY(0.0f);
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView adTip translationY " + findViewById.getTranslationY() + " adTip :0.0");
            android.view.ViewPropertyAnimator animate3 = findViewById.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            findViewById.setTranslationY(0.0f);
        }
        if (j(this.f110883l)) {
            com.tencent.mars.xlog.Log.i("Finder.FeedAdHandler", "cancelAdAnimView isFollowed notify adTip gone");
            if (i()) {
                java.lang.ref.WeakReference weakReference2 = this.f110891t;
                if (weakReference2 != null && (k3Var2 = (androidx.recyclerview.widget.k3) weakReference2.get()) != null) {
                    k(k3Var2);
                }
            } else {
                android.view.View view2 = this.f110889r;
                if (view2 != null && (recyclerView = this.f108810h) != null && (m07 = recyclerView.m0(view2)) != null) {
                    k(m07);
                }
            }
        }
        this.f110889r = null;
        this.f110891t = null;
    }

    public final androidx.recyclerview.widget.k3 h(long j17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f108810h;
        androidx.recyclerview.widget.f2 adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        if (wxRecyclerAdapter == null) {
            return null;
        }
        java.util.Iterator it = wxRecyclerAdapter.getData().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((in5.c) it.next()).getItemId() == j17) {
                break;
            }
            i17++;
        }
        if (i17 < 0 || (recyclerView = this.f108810h) == null) {
            return null;
        }
        return recyclerView.p0(i17);
    }

    public final boolean i() {
        return ((java.lang.Boolean) ((jz5.n) this.f110890s).getValue()).booleanValue();
    }

    public final boolean j(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        java.lang.String str;
        nv2.d0 d0Var = nv2.d0.f340470e;
        nv2.d0 d0Var2 = nv2.d0.f340470e;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        return nv2.d0.c(d0Var2, str, false, true, 2, null);
    }

    public final void k(androidx.recyclerview.widget.k3 k3Var) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f108810h;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(k3Var.getAdapterPosition(), new jz5.l(25, 6));
    }

    public final void l(long j17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.k3 h17 = h(j17);
        if (h17 == null || h17.getAdapterPosition() < 0 || (recyclerView = this.f108810h) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyItemChanged(h17.getAdapterPosition(), new jz5.l(24, 3));
    }

    public final void m() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f108810h;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.s9(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r1.intValue() != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(long r17, java.lang.String r19, com.tencent.mm.plugin.finder.storage.FeedData r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.v9.n(long, java.lang.String, com.tencent.mm.plugin.finder.storage.FeedData):void");
    }
}
