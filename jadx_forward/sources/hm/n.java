package hm;

/* loaded from: classes12.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final hm.u a() {
        i95.m c17 = i95.n0.c(lm.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.kernel.mvvm.MvvmFeatureService");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(hm.u.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(hm.u.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (hm.u) ((jm0.g) a17);
    }
}
