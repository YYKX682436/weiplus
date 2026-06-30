package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class uh extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai f217672b;

    public uh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ai aiVar) {
        this.f217672b = aiVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        java.util.Iterator it = this.f217672b.f215312f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(false, false, 0);
        }
    }

    @Override // hx2.i
    public void c(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        java.util.Iterator it = this.f217672b.f215312f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).f();
        }
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        java.util.Iterator it = this.f217672b.f215312f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).c(true, false, 0);
        }
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        java.util.Iterator it = this.f217672b.f215312f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it.next()).d();
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        for (com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar : this.f217672b.f215312f) {
            float f18 = 1.0f;
            float m62616x9c78005c = ((f17 - layout.m62616x9c78005c()) * 1.0f) / (layout.m62615x4ea7bf6() - layout.m62616x9c78005c());
            if (m62616x9c78005c < 0.0f) {
                m62616x9c78005c = 0.0f;
            }
            if (m62616x9c78005c <= 1.0f) {
                f18 = m62616x9c78005c;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HalfScreenDrawerUIC", "onTranslationChange translation: " + f17 + " percent: " + f18);
            aVar.a(f18);
        }
    }
}
