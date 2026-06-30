package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class av extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b f215338b;

    public av(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b) {
        this.f215338b = c15471x9d199e5b;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = this.f215338b;
        c15471x9d199e5b.f215159n = false;
        c15471x9d199e5b.R6(true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(c15471x9d199e5b.f215152d);
        java.util.Iterator it = c15471x9d199e5b.f215162q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = this.f215338b;
        c15471x9d199e5b.f215159n = true;
        c15471x9d199e5b.R6(false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(c15471x9d199e5b.f215152d);
        java.util.Iterator it = c15471x9d199e5b.f215162q.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar : this.f215338b.f215162q) {
            float f18 = 1.0f;
            float m62616x9c78005c = ((f17 - layout.m62616x9c78005c()) * 1.0f) / (layout.m62615x4ea7bf6() - layout.m62616x9c78005c());
            if (m62616x9c78005c < 0.0f) {
                m62616x9c78005c = 0.0f;
            }
            if (m62616x9c78005c <= 1.0f) {
                f18 = m62616x9c78005c;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileDrawerUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
