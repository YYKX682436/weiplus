package a82;

/* loaded from: classes11.dex */
public final class o1 implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f83633a;

    public o1(o72.o4 o4Var) {
        this.f83633a = o4Var;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        o72.o4 o4Var;
        if (n1Var == null || (o4Var = this.f83633a) == null) {
            return;
        }
        dn.g gVar = n1Var.f152640e;
        long j17 = gVar != null ? gVar.f69496x83ec3dd : 0L;
        long j18 = gVar != null ? gVar.f69500x8ab84c59 : 0L;
        zf0.h hVar = (zf0.h) o4Var;
        java.lang.Integer e17 = qi3.c.e(hVar.f553956a, false, 1, null);
        if (e17 != null) {
            zf0.v0 v0Var = hVar.f553956a;
            java.lang.String str = hVar.f553957b;
            p3325xe03a0797.p3326xc267989b.q qVar = hVar.f553958c;
            e17.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " cancel task,stop download fav file");
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Ri(str);
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(-510001));
            } catch (java.lang.Throwable unused) {
            }
            e17.intValue();
            return;
        }
        zf0.v0 v0Var2 = hVar.f553956a;
        vf0.o2 o2Var = hVar.f553959d;
        float f17 = j18 > 0 ? (((float) j17) * 1.0f) / ((float) j18) : 0.0f;
        v0Var2.id();
        if (o2Var == vf0.o2.f517775d) {
            float f18 = v0Var2.f554102r;
            float f19 = (f17 * 15.0f) + 5.0f;
            if (f19 > 20.0f) {
                f19 = 20.0f;
            }
            if (f19 >= f18) {
                f18 = f19;
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j19 = elapsedRealtime - v0Var2.f554099o;
            float f27 = f18 - v0Var2.f554102r;
            if (j19 < 500 || f27 < 1.0f) {
                return;
            }
            v0Var2.f554102r = f18;
            v0Var2.f554099o = elapsedRealtime;
            v0Var2.L(f18, qi3.g0.f445241g);
        }
    }
}
