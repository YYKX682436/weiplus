package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public abstract class AppBrandRecentView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.k0 f91882b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.c2 f91883c2;

    public AppBrandRecentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract void g1();

    @Override // androidx.recyclerview.widget.RecyclerView
    public abstract androidx.recyclerview.widget.f2 getAdapter();

    public abstract int getCount();

    public abstract com.tencent.mm.plugin.appbrand.widget.recent.h0 getOnItemClickListener();

    public com.tencent.mm.plugin.appbrand.widget.recent.k0 getRefreshListener() {
        return this.f91882b2;
    }

    public com.tencent.mm.plugin.appbrand.widget.recent.c2 getSceneFactory() {
        return this.f91883c2;
    }

    public abstract void setDataQuery(com.tencent.mm.plugin.appbrand.widget.recent.i0 i0Var);

    public abstract void setOnItemClickListener(com.tencent.mm.plugin.appbrand.widget.recent.h0 h0Var);

    public void setRefreshListener(com.tencent.mm.plugin.appbrand.widget.recent.k0 k0Var) {
        this.f91882b2 = k0Var;
    }

    public void setSceneFactory(com.tencent.mm.plugin.appbrand.widget.recent.c2 c2Var) {
        this.f91883c2 = c2Var;
    }

    public AppBrandRecentView(android.content.Context context) {
        super(context, null);
    }
}
