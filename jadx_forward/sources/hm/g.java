package hm;

/* loaded from: classes12.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final hm.j a() {
        jm.y yVar = (jm.y) i95.n0.c(jm.y.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        if (!jm0.g.class.isAssignableFrom(hm.j.class)) {
            throw new java.lang.IllegalArgumentException(yVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(yVar.getViewModel(), new jm0.e(yVar)).a(hm.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (hm.j) ((jm0.g) a17);
    }
}
