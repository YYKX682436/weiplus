package oq0;

/* loaded from: classes7.dex */
public final class b implements gq0.s {
    @Override // gq0.s
    public jz5.l a(iq0.d bizConfig, jc3.l0 preloadLifecycleListener) {
        jc3.r0 E0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadLifecycleListener, "preloadLifecycleListener");
        if (!(bizConfig instanceof iq0.i)) {
            return new jz5.l(jc3.r0.f380512e, null);
        }
        iq0.i iVar = (iq0.i) bizConfig;
        xq0.b bVar = new xq0.b(new xq0.c(bizConfig.f375181a, null, iVar.f375185e, bizConfig.f375186f, (xq0.a) iVar.f375188h, bizConfig.f375187g, null, bizConfig.f375189i, false, null, 768, null));
        bVar.S(preloadLifecycleListener);
        jc3.s0 preloadStrategy = bizConfig.f375182b;
        long j17 = bizConfig.f375183c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadStrategy, "preloadStrategy");
        synchronized (bVar) {
            E0 = preloadStrategy == jc3.s0.f380517d ? bVar.E0(j17) : jc3.r0.f380515h;
        }
        return jc3.r0.f380511d == E0 ? new jz5.l(E0, bVar) : new jz5.l(E0, null);
    }

    @Override // gq0.s
    public jc3.i0 b(jc3.i0 biz, iq0.a bizConfig) {
        android.widget.FrameLayout F4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        if (!(biz instanceof xq0.b) || !(bizConfig instanceof iq0.h)) {
            return null;
        }
        iq0.h hVar = (iq0.h) bizConfig;
        xq0.a aVar = (xq0.a) hVar.f375171e;
        if (aVar != null) {
            xq0.b bVar = (xq0.b) biz;
            bVar.f407160f = aVar;
            bf3.p pVar = bVar.f407166o;
            if (pVar != null && (F4 = aVar.F4()) != null) {
                android.widget.FrameLayout frameLayout = bVar.f407167p;
                if (frameLayout != null) {
                    pVar.c(frameLayout);
                }
                bVar.f407167p = F4;
                pVar.a(F4);
            }
        }
        xq0.d dVar = hVar.f375198i;
        if (dVar != null) {
            ((xq0.b) biz).K0(dVar);
        }
        biz.S(bizConfig.f375168b);
        return biz;
    }

    @Override // gq0.s
    public jc3.i0 c(iq0.a bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        if (!(bizConfig instanceof iq0.h)) {
            return null;
        }
        iq0.h hVar = (iq0.h) bizConfig;
        xq0.b bVar = new xq0.b(new xq0.c(bizConfig.f375167a, hVar.f375198i, hVar.f375169c, bizConfig.f375170d, (xq0.a) hVar.f375171e, bizConfig.f375172f, null, hVar.f375199j, bizConfig.f375173g, bizConfig.f375174h));
        bVar.S(bizConfig.f375168b);
        return bVar;
    }
}
