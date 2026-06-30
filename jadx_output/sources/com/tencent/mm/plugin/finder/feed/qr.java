package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qr extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f108846a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xr f108847b;

    public qr(com.tencent.mm.plugin.finder.feed.xr xrVar) {
        this.f108847b = xrVar;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f108846a || i17 <= 0) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f108847b;
        com.tencent.mm.ui.MMActivity activity = xrVar.f111095d;
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 != null) {
            fc2.i iVar = new fc2.i(Z6);
            androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.f111099h;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            iVar.onScrollStateChanged(recyclerView, 5);
        }
        this.f108846a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mars.xlog.Log.i(this.f108847b.f111096e, "onRequestLoadMore");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.or(this.f108847b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f108847b;
        com.tencent.mars.xlog.Log.i(xrVar.f111096e, "[onLoadMoreEnd] reason=" + reason);
        boolean z17 = reason.f463521f;
        androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.f111099h;
        if (!z17) {
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            if (recyclerView.getChildCount() > 0) {
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                android.view.View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.k3 m07 = recyclerView.m0(childAt);
                java.lang.Integer valueOf = m07 != null ? java.lang.Integer.valueOf(m07.getItemViewType()) : null;
                if (childAt.getHeight() > 0 && ((valueOf != null && valueOf.intValue() == 4) || (valueOf != null && valueOf.intValue() == 8))) {
                    int height = xrVar.getResources().getDisplayMetrics().heightPixels - childAt.getHeight();
                    com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
                    if (refreshLoadMoreLayout == null) {
                        kotlin.jvm.internal.o.o("rlLayout");
                        throw null;
                    }
                    refreshLoadMoreLayout.setExtraOverScrollFooterDx(height / 3);
                    com.tencent.mars.xlog.Log.i(xrVar.f111096e, "extraOverScrollFooterDx=" + height);
                }
            }
        }
        if (reason.f463524i && reason.f463521f) {
            if (recyclerView != null) {
                xrVar.j(recyclerView, true);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f108847b.f111097f;
        if (krVar.f107234h) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.pr(this.f108847b));
        } else if (krVar.f107235i && krVar.m().getDataList().isEmpty()) {
            this.f108847b.f111097f.m().requestRefresh();
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f108847b;
        if (xrVar.f111097f.f107234h) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        androidx.recyclerview.widget.RecyclerView recyclerView = xrVar.f111099h;
        if (recyclerView != null) {
            zy2.zb.Kh(zbVar, recyclerView, ml2.x1.f328202f, "1", ml2.y.f328242g, 0, 0L, 0, 112, null);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }
}
