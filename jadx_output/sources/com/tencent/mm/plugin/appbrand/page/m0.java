package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes3.dex */
public class m0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f86867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader f86868e;

    public m0(com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader, java.util.List list) {
        this.f86868e = appBrandMenuHeader;
        this.f86867d = list;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        rect.set(0, 0, 0, ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).b() == this.f86867d.size() + (-1) ? 0 : ym5.x.a(this.f86868e.getContext(), 8.0f));
    }
}
