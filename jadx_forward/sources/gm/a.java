package gm;

/* loaded from: classes4.dex */
public class a extends jm0.k {
    public static gm.a R6() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(gm.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(gm.a.class);
        }
        return (gm.a) a17;
    }

    @Override // n75.a
    public java.util.Set N6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(new gm.m());
        return hashSet;
    }

    @Override // jm0.k
    public boolean Q6() {
        return false;
    }
}
