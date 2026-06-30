package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class q extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.y f105178b;

    public q(com.tencent.mm.plugin.finder.drama.detail.y yVar) {
        this.f105178b = yVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        java.util.Iterator it = this.f105178b.f105196q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.plugin.finder.drama.detail.y yVar = this.f105178b;
        java.util.Iterator it = yVar.f105196q.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) it.next()).c(true, false, 0);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50245, "page_in", com.tencent.mm.plugin.finder.report.d2.f124994a.a(yVar.getContext(), kz5.c1.k(new jz5.l("page_name", "native_drama_collection_page"), new jz5.l("feed_id", pm0.v.u(yVar.f105187e)), new jz5.l("native_drama_id", pm0.v.u(yVar.f105186d)), new jz5.l("comment_scene", 357))), 25496);
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar : this.f105178b.f105196q) {
            float f18 = 1.0f;
            float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / (layout.getBorderClose() - layout.getBorderExpand());
            if (borderExpand < 0.0f) {
                borderExpand = 0.0f;
            }
            if (borderExpand <= 1.0f) {
                f18 = borderExpand;
            }
            com.tencent.mars.xlog.Log.i("FinderNativeDramaDramaUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
