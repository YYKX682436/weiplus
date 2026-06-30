package com.tencent.mm.feature.ecs.product.finder_feed;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/EcsProductContainerView;", "Landroid/widget/FrameLayout;", "Lk20/h;", "", "naviHeight", "Ljz5/f0;", "setNaviHeight", "Lk20/g;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFeedBackListener", "", "jsonStr", "setFinderCardInfo", "getEcsReportDataForFinder", "Landroid/util/AttributeSet;", "d", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "e", "I", "getDefStyleAttr", "()I", "defStyleAttr", "i", "get_naviHeight", "set_naviHeight", "(I)V", "_naviHeight", "", "Ll20/p0;", "getAllDistinctViews", "()Ljava/util/List;", "allDistinctViews", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsProductContainerView extends android.widget.FrameLayout implements k20.h {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.util.AttributeSet attrs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int defStyleAttr;

    /* renamed from: f, reason: collision with root package name */
    public l20.p0 f65903f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f65904g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f65905h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int _naviHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsProductContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // k20.h
    public void a(boolean z17) {
        l20.p0 p0Var = this.f65903f;
        if (p0Var != null) {
            p0Var.a(z17);
        }
    }

    @Override // k20.h
    public void b() {
        l20.p0 p0Var = this.f65903f;
        if (p0Var != null) {
            p0Var.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.tencent.mm.feature.ecs.product.finder_feed.EcsProductContainerView, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductViewV3] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductNewAndBulkBuyerView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.mm.protobuf.g r20) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.product.finder_feed.EcsProductContainerView.d(com.tencent.mm.protobuf.g):void");
    }

    public final java.util.List<l20.p0> getAllDistinctViews() {
        return kz5.n0.Q(this.f65905h);
    }

    public final android.util.AttributeSet getAttrs() {
        return this.attrs;
    }

    public final int getDefStyleAttr() {
        return this.defStyleAttr;
    }

    @Override // k20.h
    public java.lang.String getEcsReportDataForFinder() {
        java.lang.String ecsReportDataForFinder;
        l20.p0 p0Var = this.f65903f;
        return (p0Var == null || (ecsReportDataForFinder = p0Var.getEcsReportDataForFinder()) == null) ? "" : ecsReportDataForFinder;
    }

    public final int get_naviHeight() {
        return this._naviHeight;
    }

    @Override // k20.h
    public void onPause() {
        l20.p0 p0Var = this.f65903f;
        if (p0Var != null) {
            p0Var.onPause();
        }
    }

    @Override // k20.h
    public void onResume() {
        l20.p0 p0Var = this.f65903f;
        if (p0Var != null) {
            p0Var.onResume();
        }
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        java.util.Iterator<T> it = getAllDistinctViews().iterator();
        while (it.hasNext()) {
            ((l20.p0) it.next()).setFinderCardInfo(jsonStr);
        }
    }

    @Override // k20.h
    public void setNaviHeight(int i17) {
        this._naviHeight = i17;
        java.util.Iterator<T> it = getAllDistinctViews().iterator();
        while (it.hasNext()) {
            ((l20.p0) it.next()).setNaviHeight(i17);
        }
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.Iterator<T> it = getAllDistinctViews().iterator();
        while (it.hasNext()) {
            ((l20.p0) it.next()).setOnFeedBackListener(listener);
        }
    }

    public final void set_naviHeight(int i17) {
        this._naviHeight = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsProductContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.attrs = attributeSet;
        this.defStyleAttr = i17;
        this.f65904g = new java.util.LinkedHashMap();
        this.f65905h = new java.util.ArrayList();
    }
}
