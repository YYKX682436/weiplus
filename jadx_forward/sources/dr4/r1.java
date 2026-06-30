package dr4;

/* loaded from: classes14.dex */
public abstract class r1 extends os0.a {
    public int C;
    public is0.c D;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f324270J;
    public boolean K;
    public final java.lang.String L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final java.lang.String P;

    public r1(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        this.C = -1;
        this.E = 36784;
        this.F = 36787;
        java.lang.String e17 = rs0.n.f480839d.e();
        this.L = e17;
        this.M = e17 != null ? r26.n0.B(e17, "Imagination Technologies", false) : false;
        this.N = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_render_imagination_delay, false);
        this.O = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_render_use_direct, false);
        this.P = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_voip_render_use_direct_lists, "QUALCOMM Adreno(TM) 750$QUALCOMM Adreno(TM) 732$QUALCOMM Adreno(TM) 735", true);
    }

    public android.util.Size A() {
        return new android.util.Size(this.f429525a, this.f429526b);
    }

    public boolean B() {
        return gq4.v.wi().f447510k;
    }

    public void C(int i17) {
    }

    public void D(int i17) {
    }

    public void E(int i17) {
    }

    public void F(boolean z17) {
    }

    @Override // os0.a
    public void g() {
        boolean z17;
        if (B()) {
            if (!this.K || ((z17 = this.M) && !(z17 && this.N))) {
                super.u(this.I, this.f324270J);
            } else {
                super.u(this.G, this.H);
            }
            this.K = false;
        }
        super.g();
    }

    @Override // os0.a
    public void n() {
        super.n();
        if (x()) {
            android.opengl.GLES20.glDisable(this.E);
        }
    }

    @Override // os0.a
    public void p() {
        if (x()) {
            int i17 = this.E;
            android.opengl.GLES20.glEnable(i17);
            android.opengl.GLES20.glHint(i17, this.F);
        }
    }

    @Override // os0.a
    public void u(int i17, int i18) {
        if (B() && (i17 != this.I || i18 != this.f324270J)) {
            int i19 = this.f429527c;
            this.G = i19;
            int i27 = this.f429528d;
            this.H = i27;
            this.I = i17;
            this.f324270J = i18;
            this.K = (i19 == 0 || i27 == 0 || (i17 == i19 && i18 == i27)) ? false : true;
        }
        super.u(i17, i18);
    }

    public final boolean x() {
        java.lang.String str;
        if (this.O && (str = this.P) != null) {
            for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{"$"}, false, 0, 6, null)) {
                java.lang.String str3 = this.L;
                if ((str3 != null && r26.n0.B(str3, str2, false)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void y(java.nio.ByteBuffer pBuff, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pBuff, "pBuff");
    }

    public void z(byte[] pBuff, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pBuff, "pBuff");
    }
}
