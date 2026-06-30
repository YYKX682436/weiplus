package jm0;

/* loaded from: classes4.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(modelClass)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(modelClass);
        }
        return a17;
    }
}
