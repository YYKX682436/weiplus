package ut;

/* loaded from: classes9.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ut.b a() {
        ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        if (!jm0.g.class.isAssignableFrom(ut.b.class)) {
            throw new java.lang.IllegalArgumentException(gVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(gVar.getViewModel(), new jm0.e(gVar)).a(ut.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (ut.b) ((jm0.g) a17);
    }
}
