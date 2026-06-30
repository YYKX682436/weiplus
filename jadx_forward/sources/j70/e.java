package j70;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w implements k70.g0, k70.v, k70.y, k70.z {
    public void Ai(java.lang.String str, k70.u uVar) {
        m11.b1.wi().a(str, true, uVar);
    }

    public android.graphics.Bitmap Bi(java.lang.String str) {
        return m11.b1.wi().b(str);
    }

    public k70.x Di() {
        gm0.j1.b().c();
        if (m11.b1.Ai().f404194f == null) {
            m11.b1.Ai().f404194f = new m11.j();
        }
        return m11.b1.Ai().f404194f;
    }

    public k70.a0 Ni() {
        return m11.b1.Di();
    }

    public k70.e0 Ri() {
        if (((m11.x0) i95.n0.c(m11.x0.class)).f404341d == null) {
            ((m11.x0) i95.n0.c(m11.x0.class)).f404341d = new m11.z0();
        }
        return ((m11.x0) i95.n0.c(m11.x0.class)).f404341d;
    }

    public void Ui(java.lang.String str, k70.f0 f0Var) {
        m11.l1 Ni = m11.b1.Ni();
        Ni.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            Ni.d(str, "", f0Var);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new m11.e1(Ni, str, "", f0Var));
    }

    public void Vi(java.lang.String str, android.graphics.Bitmap bitmap) {
        m11.b1.wi().c(str, bitmap);
    }

    public boolean Zi(long j17) {
        java.util.Set set = m11.o0.f404297a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgService", "set Run %s", java.lang.Long.valueOf(j17));
        return ((java.util.HashSet) m11.o0.f404297a).add(java.lang.Long.valueOf(j17));
    }

    public void aj(java.lang.String str) {
        m11.g wi6 = m11.b1.wi();
        wi6.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "stop load fail, url is empty");
        } else {
            wi6.f404229a.remove(str);
        }
    }

    public void wi(java.lang.String str, k70.f0 f0Var) {
        m11.l1 Ni = m11.b1.Ni();
        Ni.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            Ni.b(str, f0Var);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new m11.f1(Ni, str, f0Var));
    }
}
