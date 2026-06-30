package wc5;

/* loaded from: classes10.dex */
public final class z0 implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f526202a;

    public z0(wc5.k1 k1Var) {
        this.f526202a = k1Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        wc5.k1 k1Var = this.f526202a;
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) k1Var.V6()).m7());
        if (b17 == null) {
            return;
        }
        java.lang.Object a07 = kz5.n0.a0(b17.m82898xfb7e5820(), i17);
        uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
        if (h0Var == null) {
            return;
        }
        if (k1Var.f526127g) {
            z17 = !z17;
        }
        uc5.d dVar = h0Var.f508027d;
        uc5.c cVar = dVar.f508009d;
        if ((cVar instanceof uc5.b) && ((uc5.b) cVar).f508004a == z17) {
            return;
        }
        k1Var.W6(dVar.v(), new uc5.b(z17));
        b17.m8152xc67946d3(i17, 1, "state_update");
    }

    @Override // kn5.a
    public boolean b(int i17) {
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) this.f526202a.V6()).m7());
        if (b17 == null) {
            return false;
        }
        return kz5.n0.a0(b17.m82898xfb7e5820(), i17) instanceof uc5.h0;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        xm3.t0 b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) this.f526202a.V6()).m7());
        if (b17 == null) {
            return false;
        }
        java.lang.Object a07 = kz5.n0.a0(b17.m82898xfb7e5820(), i17);
        uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
        if (h0Var == null) {
            return false;
        }
        uc5.c cVar = h0Var.f508027d.f508009d;
        return (cVar instanceof uc5.b) && ((uc5.b) cVar).f508004a;
    }
}
