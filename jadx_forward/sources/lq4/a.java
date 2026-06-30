package lq4;

/* loaded from: classes4.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final lq4.b a() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(lq4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(lq4.b.class);
        }
        lq4.b bVar = (lq4.b) a17;
        if (!bVar.f401995m && gm0.j1.a()) {
            bVar.f401995m = bVar.O6(gm0.j1.u().h() + "/VoIPDB-8.db");
        }
        return bVar;
    }
}
