package f40;

/* loaded from: classes5.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final f40.m a() {
        d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        if (!jm0.g.class.isAssignableFrom(f40.m.class)) {
            throw new java.lang.IllegalArgumentException(qVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(qVar.getViewModel(), new jm0.e(qVar)).a(f40.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (f40.m) ((jm0.g) a17);
    }
}
