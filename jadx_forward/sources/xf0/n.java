package xf0;

/* loaded from: classes12.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final xf0.s a() {
        xf0.u uVar = (xf0.u) i95.n0.c(xf0.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
        if (!jm0.g.class.isAssignableFrom(xf0.s.class)) {
            throw new java.lang.IllegalArgumentException(uVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(uVar.getViewModel(), new jm0.e(uVar)).a(xf0.s.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (xf0.s) ((jm0.g) a17);
    }
}
