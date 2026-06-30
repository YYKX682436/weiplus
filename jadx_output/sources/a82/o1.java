package a82;

/* loaded from: classes11.dex */
public final class o1 implements com.tencent.mm.modelcdntran.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.o4 f2100a;

    public o1(o72.o4 o4Var) {
        this.f2100a = o4Var;
    }

    @Override // com.tencent.mm.modelcdntran.v2
    public void b(com.tencent.mm.modelcdntran.n1 n1Var) {
        o72.o4 o4Var;
        if (n1Var == null || (o4Var = this.f2100a) == null) {
            return;
        }
        dn.g gVar = n1Var.f71107e;
        long j17 = gVar != null ? gVar.field_finishedLength : 0L;
        long j18 = gVar != null ? gVar.field_toltalLength : 0L;
        zf0.h hVar = (zf0.h) o4Var;
        java.lang.Integer e17 = qi3.c.e(hVar.f472423a, false, 1, null);
        if (e17 != null) {
            zf0.v0 v0Var = hVar.f472423a;
            java.lang.String str = hVar.f472424b;
            kotlinx.coroutines.q qVar = hVar.f472425c;
            e17.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " cancel task,stop download fav file");
            ((a82.u1) ((o72.q4) i95.n0.c(o72.q4.class))).Ri(str);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(-510001));
            } catch (java.lang.Throwable unused) {
            }
            e17.intValue();
            return;
        }
        zf0.v0 v0Var2 = hVar.f472423a;
        vf0.o2 o2Var = hVar.f472426d;
        float f17 = j18 > 0 ? (((float) j17) * 1.0f) / ((float) j18) : 0.0f;
        v0Var2.id();
        if (o2Var == vf0.o2.f436242d) {
            float f18 = v0Var2.f472569r;
            float f19 = (f17 * 15.0f) + 5.0f;
            if (f19 > 20.0f) {
                f19 = 20.0f;
            }
            if (f19 >= f18) {
                f18 = f19;
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j19 = elapsedRealtime - v0Var2.f472566o;
            float f27 = f18 - v0Var2.f472569r;
            if (j19 < 500 || f27 < 1.0f) {
                return;
            }
            v0Var2.f472569r = f18;
            v0Var2.f472566o = elapsedRealtime;
            v0Var2.L(f18, qi3.g0.f363708g);
        }
    }
}
