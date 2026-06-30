package rq3;

@j95.b
/* loaded from: classes12.dex */
public final class k extends jm0.o implements cc0.l {
    public final void Zi(long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
        if (n17 == null || n17.m124847x74d37ac6() <= 0 || oq3.k.f428927a.c(i17, n17.Q0()) == 0) {
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        nVar.B.d(j17, i17, n17.I0());
    }

    public java.lang.String aj(long j17, java.lang.String str, int i17) {
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(rq3.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        java.lang.String T6 = ((rq3.m) ((jm0.g) a17)).T6(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadMediaMoveFSC", "get root path error");
            return "";
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(T6)) {
            com.p314xaae8f345.mm.vfs.w6.u(T6);
        }
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadMediaMoveFSC", "talker is null");
            return T6 + j17;
        }
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String str2 = T6 + kk.k.g(bytes);
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.u(str2);
        }
        return str2 + '/' + j17;
    }

    public final boolean bj(long j17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(str, j17);
        if (n17.m124847x74d37ac6() <= 0 || oq3.k.f428927a.c(i17, n17.Q0()) == 0) {
            return false;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(n17.I0());
        sb6.append('_');
        sb6.append(i17);
        java.lang.String msgItemId = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemId, "msgItemId");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        sq3.a Y6 = nVar.A.Y6(msgItemId);
        if (Y6 != null) {
            return Y6.I0() == 2 || (Y6.I0() == 1 && Y6.J0() != Y6.z0()) || (Y6.I0() == 4 && Y6.J0() != Y6.z0());
        }
        return false;
    }

    public void cj(long j17, java.lang.String str) {
        ((rq3.m) jm0.g.f381799e.a(this, rq3.m.class)).getClass();
    }

    public void fj(java.lang.String str, long j17, int i17) {
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(rq3.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
    }
}
