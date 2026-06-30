package go0;

/* loaded from: classes14.dex */
public class f1 extends ms0.e {
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced H;
    public go0.t1 I;

    /* renamed from: J, reason: collision with root package name */
    public final java.nio.FloatBuffer f355303J;
    public final java.nio.FloatBuffer K;
    public lo0.b0 L;
    public int M;
    public yz5.l N;
    public yz5.l O;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 P;
    public int Q;
    public boolean R;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f355304t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f355305u;

    /* renamed from: v, reason: collision with root package name */
    public go0.o0 f355306v;

    /* renamed from: w, reason: collision with root package name */
    public go0.k0 f355307w;

    /* renamed from: x, reason: collision with root package name */
    public is0.c f355308x;

    /* renamed from: y, reason: collision with root package name */
    public go0.w1 f355309y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f355310z;

    public f1(boolean z17, boolean z18, boolean z19) {
        super(2, 0, 2, null);
        this.f355304t = z17;
        this.f355305u = z19;
        this.f355310z = true;
        rs0.g gVar = rs0.i.f480829a;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer, "asFloatBuffer(...)");
        this.f355303J = asFloatBuffer;
        rs0.g gVar2 = rs0.i.f480829a;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(asFloatBuffer2, "asFloatBuffer(...)");
        this.K = asFloatBuffer2;
        this.Q = 1;
    }

    @Override // ms0.c
    public os0.a f() {
        this.I = w();
        os0.a fVar = this.f355304t ? new os0.f(this.f412478a, this.f412479b, this.D, this.E, this.f412482e, this.f412483f) : new os0.c(this.f412478a, this.f412479b, this.D, this.E, this.f412482e, this.f412483f);
        if (this.f355305u) {
            fVar.f429537m = new go0.c1(this);
        }
        return fVar;
    }

    @Override // ms0.c
    public is0.c g() {
        is0.c cVar = this.f355308x;
        if (cVar != null) {
            int i17 = this.F;
            int i18 = this.G;
            cVar.f375933m = i17;
            cVar.f375934n = i18;
        }
        return cVar;
    }

    @Override // ms0.c
    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", "mirror mirrorMode:" + this.Q + " mirror:" + z17);
        go0.k0 k0Var = this.f355307w;
        if (k0Var != null) {
            k0Var.f429540p = false;
        }
        super.m(false);
        if (this.f355305u) {
            this.R = z17;
            return;
        }
        go0.t1 t1Var = this.I;
        if (t1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveYTFaceBeautyRendererProgram", "setMirror " + z17);
            t1Var.f355394h = z17;
            go0.a aVar = t1Var.f355389c;
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFilterProcessTex", "setMirror " + z17);
                aVar.f355265h = z17;
            }
        }
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        is0.c cVar = this.f355308x;
        if (cVar != null) {
            cVar.close();
        }
        go0.o0 o0Var = this.f355306v;
        if (o0Var != null) {
            o0Var.n();
        }
        go0.k0 k0Var = this.f355307w;
        if (k0Var != null) {
            k0Var.n();
        }
        go0.t1 t1Var = this.I;
        if (t1Var != null) {
            os0.e eVar = t1Var.f355390d;
            if (eVar != null) {
                eVar.n();
            }
            is0.c cVar2 = t1Var.f355388b;
            if (cVar2 != null) {
                cVar2.close();
            }
            go0.a aVar = t1Var.f355389c;
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveFilterProcessTex", "clear %s %d", aVar, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                try {
                    is0.c cVar3 = aVar.f355260c;
                    if (cVar3 != null) {
                        cVar3.close();
                    }
                    rh0.d0 d0Var = aVar.f355263f;
                    if (d0Var != null) {
                        ((p05.l4) d0Var).o();
                        aVar.f355263f = null;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiveFilterProcessTex", e17, "clear error: %s", e17.getMessage());
                }
            }
            android.opengl.GLES20.glDeleteProgram(t1Var.f355391e);
        }
        go0.w1 w1Var = this.f355309y;
        if (w1Var != null) {
            w1Var.b();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.P;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.P;
        if (b4Var2 != null) {
            b4Var2.mo50299x35224f();
        }
    }

    @Override // ms0.c, android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        this.D = i17;
        this.E = i18;
        go0.k0 k0Var = this.f355307w;
        if (k0Var != null) {
            k0Var.u(i17, i18);
        }
        v();
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.f429539o = true;
        }
        x("onSurfaceChanged");
        go0.k0 k0Var2 = this.f355307w;
        if (k0Var2 != null) {
            k0Var2.M++;
        }
        go0.o0 o0Var = this.f355306v;
        if (o0Var != null) {
            o0Var.X++;
        }
    }

    @Override // ms0.c, android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        super.onSurfaceCreated(gl10, eGLConfig);
        go0.k0 k0Var = new go0.k0(this.f412478a, this.f412479b, this.D, this.E);
        if (this.f355305u) {
            k0Var.f429537m = go0.d1.f355282d;
        }
        this.f355307w = k0Var;
        x("onSurfaceCreated");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c5  */
    @Override // ms0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go0.f1.p():void");
    }

    @Override // ms0.c
    public void r(int i17) {
        super.r(i17);
        v();
        x("setRotate(" + i17 + ')');
    }

    @Override // ms0.c
    public void t(int i17, int i18) {
        go0.k0 k0Var = this.f355307w;
        if (k0Var != null) {
            k0Var.u(i17, i18);
        }
    }

    @Override // ms0.c
    public void u(int i17, int i18) {
        super.u(i17, i18);
        v();
    }

    public final void v() {
        int i17;
        int i18 = this.D;
        if (i18 <= 0 || (i17 = this.f412478a) <= 0) {
            return;
        }
        int i19 = this.f412491n;
        boolean z17 = i19 == 90 || i19 == 270;
        int i27 = z17 ? this.f412479b : i17;
        this.F = i27;
        if (!z17) {
            i17 = this.f412479b;
        }
        this.G = i17;
        float f17 = i18 / i27;
        int i28 = this.E;
        float f18 = i28 / i17;
        if (f17 < f18) {
            this.B = i27 - (i27 - ((int) (i18 / f18)));
            this.C = i17;
        } else if (f17 > f18) {
            this.C = i17 - (i17 - ((int) (i28 / f17)));
            this.B = i27;
        } else {
            this.C = i17;
            this.B = i27;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", "calculate crop texture width:" + this.B + " height:" + this.C);
        super.t(this.F, this.G);
        y(this.f355306v, this.f412480c, this.f412481d);
        go0.k0 k0Var = this.f355307w;
        if (k0Var != null) {
            k0Var.w(this.F, this.G);
        }
    }

    public go0.t1 w() {
        rh0.d0 d0Var;
        go0.t1 t1Var = new go0.t1(this.f355305u);
        com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced = this.H;
        t1Var.f355395i = interfaceC22961x9807eced;
        go0.a aVar = t1Var.f355389c;
        if (aVar != null && (d0Var = aVar.f355263f) != null) {
            ((p05.l4) d0Var).E(interfaceC22961x9807eced);
        }
        return t1Var;
    }

    public final void x(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" outputSize(TextureView):(");
        sb6.append(this.D);
        sb6.append(',');
        sb6.append(this.E);
        sb6.append("),flipTextureSize:(");
        sb6.append(this.F);
        sb6.append(',');
        sb6.append(this.G);
        sb6.append("),textureSize:(");
        sb6.append(this.f412478a);
        sb6.append(',');
        sb6.append(this.f412479b);
        sb6.append("),cropSize:(");
        sb6.append(this.B);
        sb6.append(',');
        sb6.append(this.C);
        sb6.append(")\nLiveTexEditRenderer drawSize:(");
        sb6.append(this.f412480c);
        sb6.append(',');
        sb6.append(this.f412481d);
        sb6.append("),textureSize:(");
        sb6.append(this.f412478a);
        sb6.append(',');
        sb6.append(this.f412479b);
        sb6.append(")\nGLTextureRenderProc drawSize:(");
        os0.a aVar = this.f412484g;
        sb6.append(aVar != null ? aVar.k() : null);
        sb6.append("),textureSize:(");
        os0.a aVar2 = this.f412484g;
        sb6.append(aVar2 != null ? aVar2.l() : null);
        sb6.append(")\nblendRender drawSize:(");
        go0.o0 o0Var = this.f355306v;
        sb6.append(o0Var != null ? o0Var.k() : null);
        sb6.append("),textureSize:(");
        go0.o0 o0Var2 = this.f355306v;
        sb6.append(o0Var2 != null ? o0Var2.l() : null);
        sb6.append(")\nscreenRender drawSize:(");
        go0.k0 k0Var = this.f355307w;
        sb6.append(k0Var != null ? k0Var.k() : null);
        sb6.append("),textureSize:(");
        go0.k0 k0Var2 = this.f355307w;
        sb6.append(k0Var2 != null ? k0Var2.l() : null);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveTexEditRenderer", sb6.toString());
    }

    public final void y(os0.a aVar, int i17, int i18) {
        if (aVar != null) {
            if (i17 > i18) {
                aVar.s(0);
                aVar.j(true);
                aVar.u(i17, i18);
                aVar.t(i17, i18);
                return;
            }
            aVar.s(0);
            aVar.j(true);
            aVar.u(i17, i18);
            aVar.t(i17, i18);
        }
    }
}
