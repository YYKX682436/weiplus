package bp4;

/* loaded from: classes10.dex */
public final class y0 implements fp4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f104962a;

    public y0(bp4.b1 b1Var) {
        this.f104962a = b1Var;
    }

    @Override // fp4.e
    public void a(long j17, long j18, boolean z17) {
        long j19;
        ro4.b bVar;
        uq5.y yVar;
        ro4.b bVar2;
        bp4.b1 b1Var = this.f104962a;
        if (b1Var.f104641q != j17) {
            b1Var.f104641q = j17;
            b1Var.f104642r = j18;
            j19 = j17;
        } else {
            b1Var.f104641q = j17;
            b1Var.f104642r = j18;
            j19 = j18;
        }
        ju3.c0 c0Var = ju3.c0.f383423n2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG", b1Var.f104641q);
        bundle.putLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG", b1Var.f104642r);
        b1Var.f104632e.w(c0Var, bundle);
        if (!z17) {
            bp4.q0 q0Var = b1Var.f104643s;
            if (q0Var != null && (bVar = ((bp4.h1) q0Var).f104719a.f104801s) != null && (yVar = bVar.f479652c) != null) {
                yVar.b(0L, 0L);
            }
            bp4.c0 c0Var2 = b1Var.f104633f;
            if (c0Var2 != null) {
                c0Var2.mo10983x65825f6();
            }
            bp4.c0 c0Var3 = b1Var.f104633f;
            if (c0Var3 != null) {
                bp4.c0.m(c0Var3, j19, null, 2, null);
                return;
            }
            return;
        }
        bp4.q0 q0Var2 = b1Var.f104643s;
        if (q0Var2 != null && (bVar2 = ((bp4.h1) q0Var2).f104719a.f104801s) != null) {
            bVar2.f479653d = j17;
            bVar2.f479654e = j18;
            uq5.y yVar2 = bVar2.f479652c;
            if (yVar2 != null) {
                yVar2.b(j17, j18);
            }
        }
        bp4.c0 c0Var4 = b1Var.f104633f;
        if (c0Var4 != null) {
            bp4.c0.m(c0Var4, b1Var.f104641q, null, 2, null);
        }
        bp4.c0 c0Var5 = b1Var.f104633f;
        if (c0Var5 != null) {
            c0Var5.mo10984xc84dc82d();
        }
    }
}
