package fn4;

/* loaded from: classes4.dex */
public class c1 extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {
    public fn4.b O1;
    public java.lang.String P1;

    public c1(android.content.Context context, fn4.b bVar) {
        super(context);
        this.P1 = "";
        this.f271273f = context;
        this.O1 = bVar;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71 c18756x7b629d71 = new com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71(context);
        c18756x7b629d71.m75833xe3743643(true);
        c18756x7b629d71.m75832xcbe8d3cd(k0());
        c18756x7b629d71.m75830x4a473e76(true);
        return c18756x7b629d71;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public void I() {
        super.I();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public boolean O() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean Z(int i17, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2) {
        boolean z17;
        c19767x257d7f.f38864x6ac9171 = java.lang.Math.max(i17, this.E1);
        int i18 = this.f153184y1;
        if (i18 == 1 || i18 == 0) {
            if (this.f153185z1 == null || !k0()) {
                z17 = false;
            } else {
                c19767x257d7f2.f38864x6ac9171 = 0;
                c19767x257d7f.f38864x6ac9171 = 0;
                z17 = this.f153185z1.e(i17 + 1, c19767x257d7f, c19767x257d7f2);
            }
            if (!z17) {
                c19767x257d7f.f38864x6ac9171 = i17;
                c19767x257d7f2.f38864x6ac9171 = i17 + 4;
            }
        } else {
            z17 = false;
        }
        if (this.f153184y1 == 2) {
            d61.f fVar = this.f153185z1;
            if (fVar != null) {
                z17 = fVar.e(i17, c19767x257d7f, c19767x257d7f2);
                c19767x257d7f2.f38864x6ac9171 += 4;
            }
            if (!z17) {
                int i19 = i17 - 8;
                c19767x257d7f.f38864x6ac9171 = i19;
                if (i19 < 0) {
                    c19767x257d7f.f38864x6ac9171 = 0;
                }
                c19767x257d7f2.f38864x6ac9171 = c19767x257d7f.f38864x6ac9171 + this.F1 + 8;
            }
        }
        int i27 = this.f153184y1;
        if (i27 == 3 || i27 == 4) {
            c19767x257d7f.f38864x6ac9171 = this.E1;
            c19767x257d7f2.f38864x6ac9171 = this.A1 + 1;
        }
        int i28 = c19767x257d7f2.f38864x6ac9171;
        int i29 = this.A1;
        if (i28 >= i29 + 1) {
            c19767x257d7f2.f38864x6ac9171 = i29 + 1;
        }
        int i37 = c19767x257d7f2.f38864x6ac9171;
        int i38 = c19767x257d7f.f38864x6ac9171;
        if (i37 < i38) {
            c19767x257d7f2.f38864x6ac9171 = i38 + 2;
            return false;
        }
        N();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean a0(int i17) {
        boolean z17;
        d61.f fVar;
        if (this.f153182x1 == 3) {
            return true;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        boolean z18 = false;
        try {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            if (i17 == 0 && this.f153185z1 != null && k0()) {
                c19767x257d7f4.f38864x6ac9171 = 0;
                c19767x257d7f3.f38864x6ac9171 = 0;
                z17 = this.f153185z1.e(i17 + 1, c19767x257d7f3, c19767x257d7f4);
            } else {
                z17 = false;
            }
            int i18 = i17 + 1;
            if (z17) {
                i18 = c19767x257d7f4.f38864x6ac9171;
            }
            if (this.f153181x0 != null && (fVar = this.f153185z1) != null && fVar.b(i17, i18, c19767x257d7f, c19767x257d7f2) && (z18 = this.f153181x0.e(this.f153183y0, c19767x257d7f.f38864x6ac9171, c19767x257d7f2.f38864x6ac9171))) {
                this.E1 = i18;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryVideoView", "%s check video data error %s ", N(), e17.toString());
        }
        return z18;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void d() {
        super.d();
        this.O1 = null;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIPause", N());
        if (this.f271274g) {
            this.f271282r = mo61523x898ffe25();
            this.f271283s = mo61531xc00617a4();
            this.G = 0;
            this.F = 0;
            mo48231x65825f6();
            V();
            this.f271274g = false;
            H(600L, mo48229xc9e6d95a() + 11, 1L, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    public void f(java.lang.String str, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str)) {
            N();
            if (this.D1 && this.f153184y1 == 3) {
                b0(mo61523x898ffe25());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public void f0() {
        t21.n0 n0Var = this.J1;
        n0Var.f496373a = 4;
        n0Var.f496374b = 2;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s onUIResume", N());
        if (this.f271274g) {
            return;
        }
        this.f271274g = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            if (this.f271283s) {
                mo48232x348b34();
            } else {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) f4Var).E();
            }
        }
        H(600L, mo48229xc9e6d95a() + 10, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosMs */
    public int mo64621x25784152() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        int mo69307x9746038c = f4Var != null ? f4Var.mo69307x9746038c() : 0;
        int i17 = this.B1;
        return i17 > 0 ? i17 * 1000 : mo69307x9746038c;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosSec */
    public int mo61523x898ffe25() {
        int round = this.f271281q != null ? java.lang.Math.round((r0.mo69307x9746038c() * 1.0f) / 1000.0f) : 0;
        int i17 = this.B1;
        return i17 > 0 ? i17 : round;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    /* renamed from: getSessionId */
    public java.lang.String mo66135x23a7af9b() {
        return this.P1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: isPlaying */
    public boolean mo61531xc00617a4() {
        boolean mo61531xc00617a4 = super.mo61531xc00617a4();
        if (mo61531xc00617a4) {
            int i17 = this.f153184y1;
        }
        N();
        return mo61531xc00617a4;
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public boolean j0(int i17, boolean z17) {
        int f17;
        d61.f fVar = this.f153185z1;
        if (fVar != null && i17 > (f17 = fVar.f()) && f17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoView", "%s seek to reset time ori[%d] last key frame[%d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f17));
            i17 = f17;
        }
        return super.j0(i17, z17);
    }

    public final boolean k0() {
        try {
            gm0.j1.i();
            return gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryVideoView", e17, "check need reset error", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    public void o(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var;
        super.o(str, i17);
        if (i17 == 0 || (b1Var = this.f271284t) == null) {
            return;
        }
        b1Var.N(mo66135x23a7af9b(), mo48228x75e04be9(), "download error", i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        super.mo9756xaf8aa769(i17, i18);
        if (i18 == -3) {
            uu4.b.a(3);
            return;
        }
        if (i18 != -2) {
            if (i18 != -1) {
                return;
            }
            uu4.b.a(1);
            return;
        }
        try {
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
            if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71) f4Var).m75832xcbe8d3cd(true);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryVideoView", e17, "%s onError [%s]", N(), e17.toString());
        }
        uu4.b.a(2);
    }

    /* renamed from: setVideoInfo */
    public void m129837xab2f6987(r45.xn6 xn6Var) {
        h(false, xn6Var.f471789e, 0);
        this.f153183y0 = wm4.u.c(xn6Var.f471792h, xn6Var.f471804v);
        this.f153178l1 = this.O1.z4() + this.f153183y0 + ".mp4";
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: start */
    public void mo48238x68ac462() {
        super.mo48238x68ac462();
        uu4.a.a(5);
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: stop */
    public void mo48239x360802() {
        super.mo48239x360802();
    }
}
