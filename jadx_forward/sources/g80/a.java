package g80;

/* loaded from: classes5.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final g80.o a() {
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(g80.o.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(wVar.getViewModel(), new jm0.e(wVar)).a(g80.o.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (g80.o) ((jm0.g) a17);
    }
}
