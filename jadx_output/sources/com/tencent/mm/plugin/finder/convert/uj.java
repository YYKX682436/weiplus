package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class uj extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104709e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f104710f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f104711g;

    /* renamed from: h, reason: collision with root package name */
    public long f104712h;

    /* renamed from: i, reason: collision with root package name */
    public td2.c f104713i;

    public uj(com.tencent.mm.plugin.finder.feed.k8 contract, int i17) {
        androidx.appcompat.app.AppCompatActivity context;
        fc2.c Y6;
        kotlin.jvm.internal.o.g(contract, "contract");
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        com.tencent.mm.ui.MMActivity f122643d = contract.getF122643d();
        if (f122643d != null && (context = f122643d.getContext()) != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null && (Y6 = nyVar.Y6(i17)) != null) {
                Y6.a(new com.tencent.mm.plugin.finder.convert.pj(this, g0Var));
            }
        }
        this.f104709e = "Finder.FinderFeedProductConvert";
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dv8;
    }

    @Override // in5.r
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        com.tencent.mars.xlog.Log.i(this.f104709e, "yjh onAttachedToRecyclerView");
        super.g(recyclerView, adapter);
        this.f104711g = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0041, code lost:
    
        if (r10 == null) goto L10;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r7, in5.c r8, int r9, int r10, boolean r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.uj.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.qj(holder, this));
    }

    @Override // in5.r
    public void j(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mars.xlog.Log.i(this.f104709e, "yjh onDetachedFromRecyclerView");
        super.j(recyclerView);
        this.f104711g = null;
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) holder.p(com.tencent.mm.R.id.agy);
        if (finderImgFeedMusicTag != null) {
            finderImgFeedMusicTag.g();
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.f484355ta0);
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
        if (hVar != null) {
            hVar.b();
        }
    }

    public final java.util.Map n(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        return com.tencent.mm.plugin.finder.report.d2.f124994a.a(context, kz5.c1.k(new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId())), new jz5.l("product_info", str), new jz5.l("session_buffer", baseFinderFeed.g0())));
    }

    public final void o(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        td2.c cVar = this.f104713i;
        if (cVar != null) {
            java.lang.String str = this.f104709e;
            try {
                if (mMFragmentActivity != null) {
                    try {
                        androidx.lifecycle.o mo133getLifecycle = mMFragmentActivity.mo133getLifecycle();
                        if (mo133getLifecycle != null) {
                            mo133getLifecycle.c(cVar);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w(str, "Error removing lifecycle observer", e17);
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "removeLifecycleObserverSafely " + mMFragmentActivity);
                this.f104713i = null;
            } catch (java.lang.Throwable th6) {
                this.f104713i = null;
                throw th6;
            }
        }
    }
}
