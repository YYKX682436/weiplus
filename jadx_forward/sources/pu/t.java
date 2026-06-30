package pu;

/* loaded from: classes5.dex */
public final class t {
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final pu.f0 a() {
        ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        if (!jm0.g.class.isAssignableFrom(pu.f0.class)) {
            throw new java.lang.IllegalArgumentException(gVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(gVar.getViewModel(), new jm0.e(gVar)).a(pu.f0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (pu.f0) ((jm0.g) a17);
    }
}
