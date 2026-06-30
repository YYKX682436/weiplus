package bp4;

/* loaded from: classes10.dex */
public final class y0 implements fp4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f23429a;

    public y0(bp4.b1 b1Var) {
        this.f23429a = b1Var;
    }

    @Override // fp4.e
    public void a(long j17, long j18, boolean z17) {
        long j19;
        ro4.b bVar;
        uq5.y yVar;
        ro4.b bVar2;
        bp4.b1 b1Var = this.f23429a;
        if (b1Var.f23108q != j17) {
            b1Var.f23108q = j17;
            b1Var.f23109r = j18;
            j19 = j17;
        } else {
            b1Var.f23108q = j17;
            b1Var.f23109r = j18;
            j19 = j18;
        }
        ju3.c0 c0Var = ju3.c0.f301890n2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG", b1Var.f23108q);
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG", b1Var.f23109r);
        b1Var.f23099e.w(c0Var, bundle);
        if (!z17) {
            bp4.q0 q0Var = b1Var.f23110s;
            if (q0Var != null && (bVar = ((bp4.h1) q0Var).f23186a.f23268s) != null && (yVar = bVar.f398119c) != null) {
                yVar.b(0L, 0L);
            }
            bp4.c0 c0Var2 = b1Var.f23100f;
            if (c0Var2 != null) {
                c0Var2.pause();
            }
            bp4.c0 c0Var3 = b1Var.f23100f;
            if (c0Var3 != null) {
                bp4.c0.m(c0Var3, j19, null, 2, null);
                return;
            }
            return;
        }
        bp4.q0 q0Var2 = b1Var.f23110s;
        if (q0Var2 != null && (bVar2 = ((bp4.h1) q0Var2).f23186a.f23268s) != null) {
            bVar2.f398120d = j17;
            bVar2.f398121e = j18;
            uq5.y yVar2 = bVar2.f398119c;
            if (yVar2 != null) {
                yVar2.b(j17, j18);
            }
        }
        bp4.c0 c0Var4 = b1Var.f23100f;
        if (c0Var4 != null) {
            bp4.c0.m(c0Var4, b1Var.f23108q, null, 2, null);
        }
        bp4.c0 c0Var5 = b1Var.f23100f;
        if (c0Var5 != null) {
            c0Var5.resume();
        }
    }
}
