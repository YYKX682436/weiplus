package go0;

/* loaded from: classes10.dex */
public final class w1 implements ps0.a {

    /* renamed from: a, reason: collision with root package name */
    public rh0.d0 f355429a;

    /* renamed from: b, reason: collision with root package name */
    public is0.c f355430b;

    /* renamed from: c, reason: collision with root package name */
    public p05.e2 f355431c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced f355432d;

    /* renamed from: e, reason: collision with root package name */
    public qu5.a f355433e;

    public w1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftOnlyProcess", "#init " + hashCode());
    }

    public static final void c(go0.w1 w1Var) {
        rh0.d0 d0Var = w1Var.f355429a;
        if (d0Var != null) {
            ((p05.l4) d0Var).E(null);
        }
        rh0.d0 d0Var2 = w1Var.f355429a;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).o();
        }
        is0.c cVar = w1Var.f355430b;
        if (cVar != null) {
            cVar.close();
        }
        w1Var.f355429a = null;
        w1Var.f355430b = null;
        w1Var.f355432d = null;
    }

    public final void a(p05.e2 e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftOnlyProcess", "#attachEffect " + hashCode() + " subEffect=" + e17.hashCode());
        this.f355431c = e17;
        rh0.d0 d0Var = this.f355429a;
        if (d0Var != null) {
            e17.b(d0Var);
        }
    }

    public void b() {
        android.os.Looper mo50280x23b2dd47;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        qu5.a aVar = this.f355433e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(currentThread, (aVar == null || (mo50280x23b2dd47 = aVar.mo50280x23b2dd47()) == null) ? null : mo50280x23b2dd47.getThread());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftOnlyProcess", "#release " + hashCode() + " isThreadSame=" + b17);
        if (b17) {
            c(this);
            return;
        }
        qu5.a aVar2 = this.f355433e;
        if (aVar2 != null) {
            aVar2.mo50293x3498a0(new go0.u1(this));
        }
    }

    public is0.c d(int i17, int i18, int i19, int i27, int i28, boolean z17, boolean z18) {
        boolean z19;
        int i29;
        f();
        if (this.f355430b == null) {
            this.f355430b = is0.b.b(true, 18L);
        }
        rh0.d0 d0Var = this.f355429a;
        is0.c cVar = this.f355430b;
        if (d0Var == null || cVar == null) {
            return null;
        }
        p05.l4 l4Var = (p05.l4) d0Var;
        l4Var.J(i27, i28);
        if (z18) {
            l4Var.f432129i |= 1;
        } else {
            l4Var.f432129i &= -2;
        }
        rh0.d0.b(d0Var, i17, z17, 0, false, 12, null);
        cVar.a(i27, i28, 32856, null, 9729, 10497);
        int[] iArr = new int[2];
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr, 0);
        android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr, 1);
        if (iArr[0] != i18 || iArr[1] != i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePkGiftOnlyProcess", "input texture size not match, inputWidth=" + i18 + ", inputHeight=" + i19 + ", inputTextureSize[0]=" + iArr[0] + ", inputTextureSize[1]=" + iArr[1]);
        }
        boolean z27 = l4Var.f432125e;
        if (z27) {
            int i37 = cVar.f375928e;
            int i38 = cVar.f375933m;
            int i39 = cVar.f375934n;
            if (i17 != 0 && i18 != 0 && i19 != 0 && i37 != 0 && i38 != 0 && i39 != 0) {
                if (l4Var.f432126f == 0) {
                    l4Var.l(i17, i37, false, 0, z18);
                } else {
                    int k17 = l4Var.k(0);
                    l4Var.j();
                    p05.p4 p4Var = l4Var.G;
                    p4Var.getClass();
                    boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    p4Var.f432186i = android.os.SystemClock.elapsedRealtime();
                    if (z27) {
                        i29 = 0;
                        z19 = false;
                    } else {
                        z19 = z18;
                        i29 = k17;
                    }
                    com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83743x268cd8d6(l4Var.f432126f, i37, i38, i39, 32856, i17, i18, i19, 32856, false, z17, i29, z19);
                    p4Var.a();
                }
            }
        } else {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLivePkGiftOnlyProcess", "upsideDown on non-rci mode is not supported");
            }
            rh0.d0.c(d0Var, i17, cVar.f375928e, 0L, 0, false, false, z18, 8, null);
        }
        return cVar;
    }

    public void e(qu5.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#setGlHandler ");
        sb6.append(hashCode());
        sb6.append(" handler=");
        sb6.append(aVar != null ? aVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftOnlyProcess", sb6.toString());
        this.f355433e = aVar;
        if (aVar == null || this.f355429a != null || this.f355431c == null || aVar == null) {
            return;
        }
        aVar.mo50293x3498a0(new go0.v1(this));
    }

    public final void f() {
        if (this.f355429a == null) {
            rh0.f0 f0Var = (rh0.f0) i95.n0.c(rh0.f0.class);
            rh0.z zVar = rh0.z.f477147h;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("FaceAlignmentCombined", "1");
            linkedHashMap.put("Face3DLandmark", "0");
            rh0.d0 wi6 = ((qh0.r) f0Var).wi(1, zVar, linkedHashMap, rn0.a.f479142a.a());
            this.f355429a = wi6;
            p05.e2 e2Var = this.f355431c;
            if (e2Var != null) {
                e2Var.b(wi6);
            }
            rh0.d0 d0Var = this.f355429a;
            if (d0Var != null) {
                ((p05.l4) d0Var).E(this.f355432d);
            }
        }
    }
}
