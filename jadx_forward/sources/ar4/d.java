package ar4;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f94938a;

    /* renamed from: b, reason: collision with root package name */
    public is0.c f94939b;

    /* renamed from: c, reason: collision with root package name */
    public int f94940c;

    /* renamed from: d, reason: collision with root package name */
    public int f94941d;

    /* renamed from: e, reason: collision with root package name */
    public p05.l4 f94942e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94943f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94944g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_virtual_background_use_gpu, false);

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab f94945h = vq4.b0.l();

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFilterProcessTex", "clear %s %d", this, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        try {
            is0.c cVar = this.f94939b;
            if (cVar != null) {
                cVar.close();
            }
            p05.l4 l4Var = this.f94942e;
            if (l4Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l4Var);
                l4Var.o();
                this.f94942e = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipFilterProcessTex", e17, "clear error: %s", e17.getMessage());
        }
    }

    public final void b(int i17, int i18, boolean z17) {
        int i19;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        try {
            int i27 = z17 ? ((i17 + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) - i18) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3 : (i17 + i18) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
            ar4.c cVar = ar4.c.f94934a;
            p05.l4 l4Var = this.f94942e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l4Var);
            rh0.b0 b0Var = ar4.c.f94935b;
            if (b0Var != null) {
                l4Var.I(true, 1.0f, b0Var);
            } else {
                l4Var.I(false, 1.0f, rh0.b0.f477113d);
            }
            p05.l4 l4Var2 = this.f94942e;
            if (l4Var2 != null) {
                rh0.d0.b(l4Var2, this.f94938a, false, i27, false, 8, null);
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            is0.c cVar2 = this.f94939b;
            if (cVar2 != null) {
                cVar2.a(this.f94940c, this.f94941d, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, null, 9729, 10497);
            }
            android.opengl.GLES20.glViewport(0, 0, this.f94940c, this.f94941d);
            p05.l4 l4Var3 = this.f94942e;
            if (l4Var3 != null) {
                int i28 = this.f94938a;
                is0.c cVar3 = this.f94939b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
                int i29 = i27;
                i19 = 3553;
                l4Var3.v(i28, cVar3.f375928e, 0L, 360 - i27, i29, true, false, false, this.f94940c, this.f94941d);
            } else {
                i19 = 3553;
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glBindTexture(i19, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipFilterProcessTex", e17, "filterProcess error", new java.lang.Object[0]);
        }
        android.os.SystemClock.elapsedRealtime();
    }

    public final boolean c(int i17, is0.c outputTexture, boolean z17) {
        p05.l4 l4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputTexture, "outputTexture");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFilterProcessTex", ">>initial %s, %d, beauytParams:%s, runWithGPU:%b", this, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), 1, java.lang.Boolean.valueOf(this.f94944g));
            if (this.f94942e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoipFilterProcessTex", "initial xLabEffect: again");
                p05.l4 l4Var2 = this.f94942e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l4Var2);
                l4Var2.o();
            }
            l4Var = new p05.l4(1, false, z17, true, this.f94944g, true, rh0.z.f477144e, null, false, 386, null);
            this.f94942e = l4Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipFilterProcessTex", e17, "initial error", new java.lang.Object[0]);
        }
        if (!(l4Var.f432126f != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipFilterProcessTex", "init x3dHandle failed and stop render");
            a();
            return false;
        }
        l4Var.H(false);
        p05.l4 l4Var3 = this.f94942e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l4Var3);
        l4Var3.F.f144457d = 4;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_lut_color_weight, 0);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_smooth_weight, -1);
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_skin_bright_weight, -1);
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bigger_weight, -1);
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_eye_bright_weight, -1);
        int Ni6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_voip_face_thin_weight, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFilterProcessTex", "Face beauty config: lutWeight: %d, skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(Ni3), java.lang.Integer.valueOf(Ni4), java.lang.Integer.valueOf(Ni5), java.lang.Integer.valueOf(Ni6));
        p05.l4 l4Var4 = this.f94942e;
        if (l4Var4 != null) {
            l4Var4.A(Ni2, Ni4, Ni6, Ni3, Ni5);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFilterProcessTex", "initial, needSkin:%s, needShape:%s, needFilter:%s", java.lang.Boolean.TRUE, bool, bool);
        p05.l4 l4Var5 = this.f94942e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l4Var5);
        l4Var5.K(true);
        p05.l4 l4Var6 = this.f94942e;
        if (l4Var6 != null) {
            l4Var6.r();
        }
        this.f94938a = i17;
        this.f94939b = outputTexture;
        this.f94943f = true;
        return true;
    }

    public final void d(int i17, int i18) {
        if (i18 != this.f94941d || i17 != this.f94940c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipFilterProcessTex", "updateTextureSize:%s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        this.f94940c = i17;
        this.f94941d = i18;
        p05.l4 l4Var = this.f94942e;
        if (l4Var != null) {
            l4Var.J(i17, i18);
        }
    }
}
