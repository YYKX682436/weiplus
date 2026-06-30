package fg0;

/* loaded from: classes5.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final fg0.g a() {
        ig0.o oVar = (ig0.o) i95.n0.c(ig0.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        if (!jm0.g.class.isAssignableFrom(fg0.g.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(fg0.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (fg0.g) ((jm0.g) a17);
    }
}
