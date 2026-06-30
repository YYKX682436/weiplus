package ll3;

/* loaded from: classes10.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ll3.q0 f400743a = new ll3.q0();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f400744b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f400745c = "";

    /* renamed from: d, reason: collision with root package name */
    public static b21.t f400746d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f400747e = true;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f400748f = "";

    /* renamed from: g, reason: collision with root package name */
    public static b21.t f400749g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f400750h;

    public static final void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "removeMusicFloatBall needStopMusic: %s", java.lang.Boolean.valueOf(z17));
        f400747e = z17;
        f400743a.a(z17);
    }

    public static final void d(b21.r rVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = rVar != null ? java.lang.Boolean.valueOf(rVar.T) : null;
        objArr[1] = java.lang.Boolean.valueOf(f400744b);
        objArr[2] = rVar != null ? java.lang.Boolean.valueOf(rVar.N) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "resumeMusicFloatBallIfNeed isFromNewMusicPlayer: %s, isMusicMvMode: %s, showMusicFloatBall: %s", objArr);
        if (!(rVar != null && rVar.N)) {
            b(false);
            return;
        }
        if (rVar.T || f400744b) {
            rVar.T = true;
            ll3.b1 b1Var = ll3.b1.f400673a;
            ll3.b1.f400674b.p0(rVar);
        } else {
            ll3.j0 j0Var = ll3.i0.f400714a;
            if (j0Var != null) {
                j0Var.p0(rVar);
            }
        }
    }

    public static final void e(b21.r rVar, b21.t tVar) {
        java.lang.String str;
        r45.xs4 xs4Var;
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        r45.xs4 xs4Var2;
        r45.xs4 xs4Var3;
        java.lang.String str3 = "";
        if (rVar == null || (str = rVar.f98879e) == null) {
            str = tVar != null ? tVar.f98898a : null;
            if (str == null) {
                str = "";
            }
        }
        f400745c = str;
        f400746d = tVar;
        boolean z17 = (rVar != null && rVar.T) || !(tVar == null || zy2.qc.a(tVar.f98899b));
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = f400745c;
        objArr[1] = rVar != null ? java.lang.Boolean.valueOf(rVar.T) : null;
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = (tVar == null || (xs4Var3 = tVar.f98899b) == null) ? null : xs4Var3.m75945x2fec8307(14);
        objArr[4] = (tVar == null || (xs4Var2 = tVar.f98899b) == null) ? null : xs4Var2.m75945x2fec8307(4);
        objArr[5] = rVar != null ? java.lang.Boolean.valueOf(rVar.N) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "updateMusicInfo musicId: %s, isFromNewMusicPlayer: %s, isValid: %s, song: %s, %s, showMusicBall: %s", objArr);
        if (!z17) {
            f400744b = false;
            ll3.b1 b1Var = ll3.b1.f400673a;
            ll3.e1 e1Var = ll3.b1.f400674b;
            e1Var.v0(null, true);
            e1Var.x0(null);
            return;
        }
        f400744b = true;
        java.lang.String str4 = tVar != null ? tVar.f98900c : null;
        if (str4 == null || str4.length() == 0) {
            if (tVar != null && (xs4Var = tVar.f98899b) != null) {
                m75945x2fec8307 = xs4Var.m75945x2fec8307(13);
            }
            m75945x2fec8307 = null;
        } else {
            if (tVar != null) {
                m75945x2fec8307 = tVar.f98900c;
            }
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            if (rVar != null && (str2 = rVar.f98884m) != null) {
                str3 = str2;
            }
            m75945x2fec8307 = str3;
        }
        ll3.b1 b1Var2 = ll3.b1.f400673a;
        ll3.e1 e1Var2 = ll3.b1.f400674b;
        e1Var2.v0(m75945x2fec8307, rVar != null && rVar.N);
        e1Var2.x0(tVar != null ? tVar.f98899b : null);
    }

    public static final void f(android.os.Bundle bundle) {
        if (bundle != null) {
            f400744b = true;
        }
        ll3.b1.f400673a.getClass();
        ll3.b1.f400674b.w0(bundle);
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "removeMusicBall reset: " + z17);
        ll3.i0.f400714a.d();
        ll3.b1 b1Var = ll3.b1.f400673a;
        ll3.b1.f400674b.d();
        if (z17) {
            c();
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "resetMusicMvInfo");
        f400744b = false;
        f400746d = null;
        ll3.b1.f400673a.getClass();
        ll3.b1.f400674b.x0(null);
        ll3.b1.f400673a.getClass();
        ll3.b1.f400674b.w0(null);
    }
}
