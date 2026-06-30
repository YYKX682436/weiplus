package oq0;

/* loaded from: classes7.dex */
public final class a implements gq0.s {
    @Override // gq0.s
    public jz5.l a(iq0.d bizConfig, jc3.l0 preloadLifecycleListener) {
        jc3.r0 r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadLifecycleListener, "preloadLifecycleListener");
        if (!(bizConfig instanceof iq0.f)) {
            return new jz5.l(jc3.r0.f380512e, null);
        }
        iq0.f fVar = (iq0.f) bizConfig;
        hq0.b0 b0Var = new hq0.b0(new iq0.g(bizConfig.f375181a, fVar.f375193j, fVar.f375194k, fVar.f375185e, bizConfig.f375186f, fVar.f375195l, bizConfig.f375187g, bizConfig.f375183c, null));
        jc3.s0 preloadStrategy = bizConfig.f375182b;
        long j17 = bizConfig.f375183c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadStrategy, "preloadStrategy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "preload preloadStrategy: " + preloadStrategy);
        if (preloadStrategy == jc3.s0.f380517d) {
            b0Var.R = j17;
            synchronized (b0Var) {
                if (b0Var.V) {
                    r0Var = jc3.r0.f380514g;
                } else {
                    b0Var.V = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "preload runtime");
                    b0Var.a2(true);
                    r0Var = jc3.r0.f380511d;
                }
            }
        } else {
            r0Var = jc3.r0.f380515h;
        }
        return jc3.r0.f380511d == r0Var ? new jz5.l(r0Var, b0Var) : new jz5.l(r0Var, null);
    }

    @Override // gq0.s
    public jc3.i0 b(jc3.i0 biz, iq0.a bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        if ((biz instanceof hq0.b0) && (bizConfig instanceof iq0.g)) {
            return biz;
        }
        return null;
    }

    @Override // gq0.s
    public jc3.i0 c(iq0.a bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        if (bizConfig instanceof iq0.g) {
            return new hq0.b0((iq0.g) bizConfig);
        }
        return null;
    }
}
