package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class q extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y f186711b;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar) {
        this.f186711b = yVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        java.util.Iterator it = this.f186711b.f186729q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.y yVar = this.f186711b;
        java.util.Iterator it = yVar.f186729q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50245, "page_in", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.a(yVar.m80379x76847179(), kz5.c1.k(new jz5.l("page_name", "native_drama_collection_page"), new jz5.l("feed_id", pm0.v.u(yVar.f186720e)), new jz5.l("native_drama_id", pm0.v.u(yVar.f186719d)), new jz5.l("comment_scene", 357))), 25496);
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar : this.f186711b.f186729q) {
            float f18 = 1.0f;
            float m62616x9c78005c = ((f17 - layout.m62616x9c78005c()) * 1.0f) / (layout.m62615x4ea7bf6() - layout.m62616x9c78005c());
            if (m62616x9c78005c < 0.0f) {
                m62616x9c78005c = 0.0f;
            }
            if (m62616x9c78005c <= 1.0f) {
                f18 = m62616x9c78005c;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNativeDramaDramaUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
