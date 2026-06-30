package pu;

/* loaded from: classes5.dex */
public final class h0 {
    public h0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final pu.t0 a() {
        ig0.o oVar = (ig0.o) i95.n0.c(ig0.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        if (!jm0.g.class.isAssignableFrom(pu.t0.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(pu.t0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (pu.t0) ((jm0.g) a17);
    }
}
