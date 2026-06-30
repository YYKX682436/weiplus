package ve5;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ve5.e f517651a = new ve5.e();

    public final ve5.n a(java.lang.Class fscClz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fscClz, "fscClz");
        ki5.a aVar = (ki5.a) ((ve5.f) i95.n0.c(ve5.f.class));
        aVar.getClass();
        java.lang.Object obj = aVar.f389699m.get(fscClz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        java.lang.Class cls = (java.lang.Class) obj;
        if (!jm0.g.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException(ki5.a.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        java.lang.Object a17 = new p012xc85e97e9.p093xedfae76a.j1(aVar.getViewModel(), new jm0.e(aVar)).a(cls);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (ve5.n) ((jm0.g) a17);
    }
}
