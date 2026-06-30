package cw2;

/* loaded from: classes10.dex */
public final class y7 implements vm5.a {

    /* renamed from: d, reason: collision with root package name */
    public long f305655d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf f305656e;

    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf) {
        this.f305656e = c15189x4abd2ecf;
    }

    @Override // vm5.a
    public void a(long j17) {
        long m61436x8edb9ad8;
        long m61436x8edb9ad82;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305656e;
        cw2.fb lifecycle = c15189x4abd2ecf.getLifecycle();
        if (lifecycle != null) {
            r45.mb4 mb4Var = c15189x4abd2ecf.B;
            m61436x8edb9ad82 = c15189x4abd2ecf.m61436x8edb9ad8();
            lifecycle.v(mb4Var, j17 - m61436x8edb9ad82, c15189x4abd2ecf.mo56695x7723e6ff());
        }
        long j18 = this.f305655d;
        if (j18 == -1 || j17 - j18 > 1000 || j17 < j18) {
            cw2.fb lifecycle2 = c15189x4abd2ecf.getLifecycle();
            if (lifecycle2 != null) {
                r45.mb4 mb4Var2 = c15189x4abd2ecf.B;
                m61436x8edb9ad8 = c15189x4abd2ecf.m61436x8edb9ad8();
                cw2.fb.w(lifecycle2, mb4Var2, (int) ((j17 - m61436x8edb9ad8) / 1000), c15189x4abd2ecf.mo56694x36bbd779(), null, 8, null);
            }
            this.f305655d = j17;
        }
        if (c15189x4abd2ecf.mo56695x7723e6ff() <= 0 || j17 <= 0 || c15189x4abd2ecf.mo56695x7723e6ff() - j17 > 500 || c15189x4abd2ecf.D || !c15189x4abd2ecf.f294824n) {
            return;
        }
        cw2.fb lifecycle3 = c15189x4abd2ecf.getLifecycle();
        if (lifecycle3 != null) {
            lifecycle3.F(c15189x4abd2ecf.B);
        }
        c15189x4abd2ecf.D = true;
    }

    @Override // vm5.a
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305656e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c15189x4abd2ecf.f212220y;
        if (b1Var != null) {
            b1Var.N(c15189x4abd2ecf.f212221z, c15189x4abd2ecf.A, "", -1, -1);
        }
    }

    @Override // vm5.a
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305656e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c15189x4abd2ecf.f212220y;
        if (b1Var != null) {
            b1Var.E(c15189x4abd2ecf.f212221z, c15189x4abd2ecf.A);
        }
    }

    @Override // vm5.a
    public void i() {
    }

    @Override // vm5.a
    public void s() {
        cw2.fb lifecycle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305656e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c15189x4abd2ecf.f212220y;
        if (b1Var != null) {
            b1Var.l(c15189x4abd2ecf.f212221z, c15189x4abd2ecf.A);
        }
        if ((c15189x4abd2ecf.C || !c15189x4abd2ecf.f294824n) && (lifecycle = c15189x4abd2ecf.getLifecycle()) != null) {
            lifecycle.h(c15189x4abd2ecf.B);
        }
        c15189x4abd2ecf.C = false;
        c15189x4abd2ecf.D = false;
    }

    @Override // vm5.a
    public void x() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15189x4abd2ecf c15189x4abd2ecf = this.f305656e;
        c15189x4abd2ecf.E = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c15189x4abd2ecf.f212220y;
        if (b1Var != null) {
            b1Var.p2(c15189x4abd2ecf.f212221z, c15189x4abd2ecf.A);
        }
        cw2.fb lifecycle = c15189x4abd2ecf.getLifecycle();
        if (lifecycle != null) {
            lifecycle.D(c15189x4abd2ecf.B, 0L);
        }
    }
}
