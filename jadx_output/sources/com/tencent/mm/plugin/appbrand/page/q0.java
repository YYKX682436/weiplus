package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87020d;

    public q0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, int i17) {
        this.f87020d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        rect.top = recyclerView.u0(view) > 0 ? this.f87020d : 0;
    }
}
