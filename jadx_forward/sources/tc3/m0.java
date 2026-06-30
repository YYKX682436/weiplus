package tc3;

/* loaded from: classes7.dex */
public final class m0 extends qc3.e {

    /* renamed from: e, reason: collision with root package name */
    public final sc3.k1 f498768e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f498769f;

    public m0(sc3.k1 biz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        this.f498768e = biz;
        this.f498769f = true;
    }

    @Override // qc3.f
    public void D1() {
        if (this.f498769f) {
            this.f498768e.D1();
        }
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (this.f498769f) {
            this.f498768e.J5(i17, result);
        }
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerIds, "pointerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(x17, "x");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y17, "y");
        if (this.f498769f) {
            this.f498768e.M1(i17, i18, i19, j17, pointerIds, x17, y17);
        }
    }

    @Override // qc3.f
    public void Oc(int i17) {
        if (this.f498769f) {
            sc3.k1 k1Var = this.f498768e;
            k1Var.getClass();
            try {
                android.os.IBinder asBinder = k1Var.H0().asBinder();
                if (asBinder != null) {
                    asBinder.unlinkToDeath(k1Var.X, 0);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(k1Var.Q, "unlink client binder death failed: " + e17);
            }
            k1Var.Oc(i17);
        }
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        if (this.f498769f) {
            this.f498768e.cj(i17, i18, i19);
        }
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (this.f498769f) {
            this.f498768e.fj(i17, result);
        }
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (this.f498769f) {
            this.f498768e.pg(i17, surface, i18, i19);
        }
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f498769f) {
            this.f498768e.s2(event, data);
        }
    }

    @Override // qc3.f
    /* renamed from: setMute */
    public void mo159830x764d819b(boolean z17) {
        if (this.f498769f) {
            this.f498768e.mo159830x764d819b(z17);
        }
    }

    @Override // qc3.f
    public void uc() {
        if (this.f498769f) {
            this.f498768e.uc();
        }
    }

    @Override // qc3.f
    public void w3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (this.f498769f) {
            this.f498768e.w3(config);
        }
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        if (this.f498769f) {
            this.f498768e.w9(script, i17);
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        if (this.f498769f) {
            this.f498768e.yd(i17);
        }
    }

    @Override // qc3.f
    public void z3() {
        if (this.f498769f) {
            this.f498768e.z3();
        }
    }
}
