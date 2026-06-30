package e80;

/* loaded from: classes12.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final e80.r a() {
        v70.w wVar = (v70.w) i95.n0.c(v70.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wVar);
        if (!jm0.g.class.isAssignableFrom(e80.r.class)) {
            throw new java.lang.IllegalArgumentException(wVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(wVar.getViewModel(), new jm0.e(wVar)).a(e80.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (e80.r) ((jm0.g) a17);
    }
}
