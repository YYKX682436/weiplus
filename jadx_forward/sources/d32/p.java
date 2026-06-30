package d32;

/* loaded from: classes14.dex */
public abstract class p extends os0.a implements d32.r, d32.q {
    public final int C;
    public final int D;
    public final is0.c E;
    public s22.a F;
    public boolean G;
    public boolean H;
    public t85.j I;

    /* renamed from: J, reason: collision with root package name */
    public final os0.a f307723J;

    public p(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        int i37 = t22.o.f496636d;
        this.C = i37;
        this.D = i37;
        this.G = true;
        this.E = is0.b.b(true, -1L);
        this.f307723J = new d32.o(i37, i37, i19, i27, 1, 1);
    }

    @Override // d32.r
    public void a() {
        this.G = true;
    }

    @Override // d32.r
    public void b(boolean z17) {
        this.H = z17;
        x();
        s22.a aVar = this.F;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", "setRemoveBg: " + z17);
            p05.l4 l4Var = aVar.f483826e;
            if (l4Var != null) {
                l4Var.H(z17);
            }
        }
    }

    @Override // d32.r
    public void c(t85.j jVar) {
        this.I = jVar;
        x();
        s22.a aVar = this.F;
        if (aVar != null) {
            aVar.a(jVar);
        }
    }

    @Override // d32.q
    public is0.c d() {
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            return aVar.f429533i;
        }
        return null;
    }

    @Override // d32.r
    public void e() {
        this.G = false;
        s22.a aVar = this.F;
        if (aVar != null) {
            aVar.b();
        }
        this.F = null;
    }

    @Override // os0.a
    public void n() {
        super.n();
        is0.c cVar = this.E;
        if (cVar != null) {
            cVar.close();
        }
        os0.a aVar = this.f307723J;
        if (aVar != null) {
            aVar.n();
        }
        s22.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.F = null;
    }

    @Override // os0.a
    public void p() {
        int i17;
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            aVar.w(this.f429525a, this.f429526b);
        }
        if (aVar != null) {
            aVar.f429538n = this.f429538n;
        }
        if (aVar != null) {
            aVar.f429540p = this.f429540p;
        }
        if (aVar != null) {
            aVar.o();
            is0.c cVar = aVar.f429533i;
            i17 = cVar != null ? cVar.f375928e : -1;
        } else {
            i17 = 0;
        }
        x();
        s22.a aVar2 = this.F;
        if (aVar2 != null) {
            int i18 = this.C;
            aVar2.f483824c = i18;
            int i19 = this.D;
            aVar2.f483825d = i19;
            p05.l4 l4Var = aVar2.f483826e;
            if (l4Var != null) {
                l4Var.J(i18, i19);
            }
            aVar2.f483822a = i17;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            try {
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiFilterProcess", e17, "filterProcess error", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkDrawFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 14L, 1L);
            }
            if (aVar2.f483828g) {
                p05.l4 l4Var2 = aVar2.f483826e;
                if (l4Var2 != null) {
                    rh0.d0.b(l4Var2, aVar2.f483822a, false, 0, false, 14, null);
                }
                int i27 = aVar2.f483823b;
                int i28 = aVar2.f483824c;
                int i29 = aVar2.f483825d;
                android.opengl.GLES20.glBindTexture(3553, i27);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i28, i29, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
                p05.l4 l4Var3 = aVar2.f483826e;
                if (l4Var3 != null) {
                    rh0.d0.c(l4Var3, aVar2.f483822a, aVar2.f483823b, 0L, 0, false, false, false, 124, null);
                }
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.os.SystemClock.elapsedRealtime();
            } else {
                android.opengl.GLES20.glBindFramebuffer(36160, aVar2.f483827f);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, aVar2.f483822a, 0);
                int i37 = aVar2.f483823b;
                int i38 = aVar2.f483824c;
                int i39 = aVar2.f483825d;
                android.opengl.GLES20.glBindTexture(3553, i37);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i38, i39, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glBindTexture(3553, aVar2.f483823b);
                android.opengl.GLES20.glCopyTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, 0, 0, aVar2.f483824c, aVar2.f483825d, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
            }
        }
        is0.c cVar2 = this.E;
        int i47 = cVar2 != null ? cVar2.f375928e : 0;
        os0.a aVar3 = this.f307723J;
        if (aVar3 != null) {
            ((d32.o) aVar3).L = i47;
        }
        if (aVar3 != null) {
            aVar3.o();
        }
    }

    public final void x() {
        int i17;
        os0.a aVar = ((d32.a) this).K;
        if (aVar != null) {
            is0.c cVar = aVar.f429533i;
            i17 = cVar != null ? cVar.f375928e : -1;
        } else {
            i17 = 0;
        }
        if (this.F == null && this.G) {
            s22.a aVar2 = new s22.a();
            this.F = aVar2;
            is0.c cVar2 = this.E;
            int i18 = cVar2 != null ? cVar2.f375928e : 0;
            aVar2.f483822a = i17;
            aVar2.f483823b = i18;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", "initial %s, %d, " + aVar2.f483828g, aVar2, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, rh0.z.f477145f, null, false, 445, null);
                aVar2.f483826e = l4Var;
                l4Var.F.f144457d = 5;
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_smooth_weight, -1);
                int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_bright_weight, -1);
                int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bigger_weight, -1);
                int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bright_weight, -1);
                int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_face_thin_weight, -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", "Face beauty config: skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni5));
                p05.l4 l4Var2 = aVar2.f483826e;
                if (l4Var2 != null) {
                    l4Var2.A(Ni, Ni3, Ni5, Ni2, Ni4);
                }
                p05.l4 l4Var3 = aVar2.f483826e;
                if (l4Var3 != null) {
                    l4Var3.C(true);
                }
                p05.l4 l4Var4 = aVar2.f483826e;
                if (l4Var4 != null) {
                    l4Var4.H(false);
                }
                p05.l4 l4Var5 = aVar2.f483826e;
                if (l4Var5 != null) {
                    l4Var5.r();
                }
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
                int i19 = iArr[0];
                if (i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
                    i19 = 0;
                }
                aVar2.f483827f = i19;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiFilterProcess", e17, "initial error", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkInitFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 13L, 1L);
            }
            s22.a aVar3 = this.F;
            if (aVar3 != null) {
                boolean z17 = this.H;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiFilterProcess", "setRemoveBg: " + z17);
                p05.l4 l4Var6 = aVar3.f483826e;
                if (l4Var6 != null) {
                    l4Var6.H(z17);
                }
            }
            s22.a aVar4 = this.F;
            if (aVar4 != null) {
                aVar4.a(this.I);
            }
        }
    }
}
