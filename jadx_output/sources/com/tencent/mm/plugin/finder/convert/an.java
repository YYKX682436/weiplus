package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class an extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public long f102894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f102895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yn f102896i;

    public an(com.tencent.mm.plugin.finder.feed.k8 k8Var, com.tencent.mm.plugin.finder.convert.yn ynVar) {
        this.f102895h = k8Var;
        this.f102896i = ynVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return (event instanceof ec2.f) || ((event instanceof fc2.s) && ((fc2.s) event).f260980d == 2) || (event instanceof fc2.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fc2.d
    public void G0(fc2.a ev6) {
        in5.s0 s0Var;
        in5.s0 s0Var2;
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f102895h;
        com.tencent.mm.plugin.finder.convert.yn ynVar = this.f102896i;
        if (z17) {
            com.tencent.mm.plugin.finder.feed.tl tlVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.tl ? (com.tencent.mm.plugin.finder.feed.tl) k8Var : null;
            if (tlVar == null || (s0Var2 = tlVar.f()) == null) {
                androidx.recyclerview.widget.RecyclerView recyclerView = ynVar.f104357J;
                androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
                if (wxRecyclerAdapter == null || (s0Var2 = (in5.s0) in5.n0.Y(wxRecyclerAdapter, ((ec2.f) ev6).f250965j, false, 2, null)) == null) {
                    return;
                }
            }
            ec2.f fVar = (ec2.f) ev6;
            int i17 = fVar.f250959d;
            if (i17 == 2) {
                if (fVar.f250965j == ((so2.j5) s0Var2.f293125i).getItemId()) {
                    ynVar.o0(s0Var2, s0Var2.getAdapterPosition(), s0Var2.getItemViewType(), 0);
                    return;
                }
                return;
            }
            if (i17 == 3 && fVar.f250965j == ((so2.j5) s0Var2.f293125i).getItemId()) {
                int i18 = fVar.f250964i;
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (i18 > t70Var.q2() && fVar.f250963h >= t70Var.q2() / 2) {
                    java.lang.Object obj = s0Var2.f293125i;
                    so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                    if (u1Var != null && fVar.f250963h >= t70Var.q2() && !u1Var.getIsDeepEnjoy()) {
                        com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "onEventHappen: VIDEO_PROGRESS long video total = " + fVar.f250964i + ", offset = " + fVar.f250963h + ", feedId=" + pm0.v.u(fVar.f250965j));
                        ynVar.o0(s0Var2, s0Var2.getAdapterPosition(), s0Var2.getItemViewType(), 1);
                    }
                }
                if (fVar.f250963h >= ynVar.T()) {
                    java.lang.Object obj2 = s0Var2.f293125i;
                    so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                    if (u1Var2 == null || u1Var2.getHasShowFollowAnim()) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("FinderLongVideoConvert", "onEventHappen: VIDEO_PROGRESS ten sec enjoy offset = " + fVar.f250963h + ", feedId=" + pm0.v.u(fVar.f250965j));
                    ynVar.y0(s0Var2);
                    return;
                }
                return;
            }
            return;
        }
        if (ev6 instanceof fc2.s) {
            fc2.s sVar = (fc2.s) ev6;
            if (sVar.f260980d == 2) {
                if (sVar.f260982f != sVar.f260984h) {
                    com.tencent.mm.plugin.finder.feed.tl tlVar2 = k8Var instanceof com.tencent.mm.plugin.finder.feed.tl ? (com.tencent.mm.plugin.finder.feed.tl) k8Var : null;
                    if (tlVar2 != null) {
                        ynVar.p0(tlVar2.f());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = ynVar.f104357J;
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2 != null ? recyclerView2.getAdapter() : null;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2 : null;
            if (wxRecyclerAdapter2 == null) {
                return;
            }
            fc2.t tVar = (fc2.t) ev6;
            int i19 = tVar.f260985d;
            if (i19 == 6) {
                if (this.f102894g != tVar.f260992k) {
                    in5.s0 s0Var3 = ynVar.f104375z;
                    if (s0Var3 != null) {
                        ynVar.z0(s0Var3, s0Var3.getAdapterPosition(), s0Var3.getItemViewType(), true);
                    }
                    long j17 = tVar.f260992k;
                    this.f102894g = j17;
                    in5.s0 s0Var4 = (in5.s0) in5.n0.Y(wxRecyclerAdapter2, j17, false, 2, null);
                    if (s0Var4 != null) {
                        ynVar.p0(s0Var4);
                    }
                }
                ynVar.R1().removeCallbacksAndMessages(null);
                return;
            }
            if (i19 == 10) {
                in5.s0 s0Var5 = (in5.s0) in5.n0.Y(wxRecyclerAdapter2, tVar.f260992k, false, 2, null);
                if (s0Var5 != null) {
                    if (!(s0Var5.f293125i instanceof so2.i1)) {
                        ynVar.z0(s0Var5, s0Var5.getAdapterPosition(), s0Var5.getItemViewType(), false);
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("FinderLongVideoConvert", "FinderFeedLiveList info:lastCenterFeedId:" + this.f102894g);
                    return;
                }
                return;
            }
            if (i19 != 9) {
                if (i19 != 0 || (s0Var = (in5.s0) in5.n0.Y(wxRecyclerAdapter2, tVar.f260992k, false, 2, null)) == null) {
                    return;
                }
                ynVar.x0(tVar.f260992k, s0Var);
                return;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = ynVar.f104357J;
            if (recyclerView3 != null) {
                int childCount = recyclerView3.getChildCount();
                for (int i27 = 0; i27 < childCount; i27++) {
                    android.view.View childAt = recyclerView3.getChildAt(i27);
                    if ((childAt != null && childAt.getVisibility() == 0) == false && childAt != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        this.f102896i.R1().removeCallbacksAndMessages(null);
    }
}
