package ru1;

/* loaded from: classes13.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final bv1.d f481263a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.OutputStream f481264b;

    /* renamed from: c, reason: collision with root package name */
    public gs0.b f481265c;

    /* renamed from: d, reason: collision with root package name */
    public long f481266d;

    public t(pu1.b bVar, bv1.d init) {
        gs0.b lVar;
        gs0.b lVar2;
        boolean fj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        this.f481263a = init;
        this.f481266d = -1L;
        if (bVar != null) {
            boolean z17 = true;
            try {
                if (fp.h.c(23)) {
                    int i17 = wo.v1.f529366m.f529298w;
                    if (i17 == -1) {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                    } else if (i17 == 1) {
                        fj6 = true;
                    } else if (i17 != 2) {
                        fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                    } else {
                        fj6 = false;
                    }
                    if (fj6) {
                        lVar2 = new gs0.p(bVar, new ru1.j(this));
                        this.f481265c = lVar2;
                    }
                }
                lVar2 = new gs0.l(bVar, new ru1.m(this));
                this.f481265c = lVar2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenCastVideoEncoder", e17, "encoder  error", new java.lang.Object[0]);
                try {
                    bVar.c();
                    if (fp.h.c(23)) {
                        int i18 = wo.v1.f529366m.f529298w;
                        if (i18 == -1) {
                            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                        } else if (i18 != 1) {
                            if (i18 != 2) {
                                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_use_async_codec, true);
                            } else {
                                z17 = false;
                            }
                        }
                        if (z17) {
                            lVar = new gs0.p(bVar, new ru1.p(this));
                            this.f481265c = lVar;
                        }
                    }
                    lVar = new gs0.l(bVar, new ru1.s(this));
                    this.f481265c = lVar;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenCastVideoEncoder", e18, "still happened crash %s", java.lang.String.valueOf(bVar));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markInitVideoEncoderFailed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 34L, 1L);
                    ((ku5.t0) ku5.t0.f394148d).B(new tu1.b(((tu1.d) this.f481263a).f503624a));
                }
            }
        }
    }

    public static final void a(ru1.t tVar, gs0.b bVar) {
        tVar.getClass();
        android.view.Surface c17 = bVar.c();
        tu1.d dVar = (tu1.d) tVar.f481263a;
        dVar.getClass();
        tu1.o oVar = dVar.f503624a;
        vu1.h hVar = oVar.f503650h;
        if (hVar != null) {
            hVar.f521726e = new tu1.c(oVar);
        }
        boolean z17 = true;
        if (hVar != null) {
            boolean z18 = hVar.f521734m;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastRenderMgr", "use open gl renderer media projection");
                hVar.f521733l = rs0.i.f480829a.l(hVar.f521722a, hVar.f521723b, android.opengl.EGL14.EGL_NO_CONTEXT);
                hVar.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoRendererUseOpenGL");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 14L, 1L);
            } else if (!z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastRenderMgr", "use image reader render media projection");
                hVar.c();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoRendererUseImageReader");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 15L, 1L);
            }
        }
        vu1.h hVar2 = oVar.f503650h;
        if (hVar2 != null) {
            hVar2.f521725d = c17;
            if (hVar2.f521734m) {
                rs0.h hVar3 = hVar2.f521733l;
                if (hVar3 != null) {
                    hVar3.f480826b = rs0.i.f480829a.k(hVar3.f480825a, c17);
                }
            } else {
                vu1.b bVar2 = hVar2.f521729h;
                if (bVar2 != null) {
                    bVar2.f521714e = c17;
                }
            }
        }
        bv1.b bVar3 = new bv1.b();
        oVar.f503658p = bVar3;
        bVar3.a();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        oVar.f503657o = android.os.SystemClock.elapsedRealtime();
        int i17 = wo.v1.f529366m.f529297v;
        if (i17 == -1) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
        } else if (i17 != 1) {
            if (i17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_screec_cast_pc_debug, false);
            } else {
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
            com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("ScreenCastDebug");
            if (!h07.m()) {
                h07.J();
            }
            tVar.f481264b = com.p314xaae8f345.mm.vfs.w6.K(h07.o() + "/video_" + android.os.SystemClock.elapsedRealtime() + ".h264", false);
        }
    }

    public static final void b(ru1.t tVar, android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
        tVar.getClass();
        if ((bufferInfo != null && bufferInfo.size == 0) || bufferInfo == null || byteBuffer == null) {
            return;
        }
        int i17 = bufferInfo.size;
        byte[] bArr = new byte[i17];
        byteBuffer.get(bArr);
        byteBuffer.position(bufferInfo.offset);
        tu1.d dVar = (tu1.d) tVar.f481263a;
        dVar.getClass();
        if (iq.b.E() || iq.b.F(dVar.f503625b, false) || iq.b.H() || com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send video ");
        } else {
            byte[] copyOf = java.util.Arrays.copyOf(bArr, i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByte("data_type", (byte) 1);
            bundle.putByteArray("data_data", copyOf);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = dVar.f503624a.f503652j;
            if (n3Var != null) {
                android.os.Message message = new android.os.Message();
                message.setData(bundle);
                n3Var.mo50308x2936bf5f(message);
            }
        }
        java.io.OutputStream outputStream = tVar.f481264b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
                java.io.OutputStream outputStream2 = tVar.f481264b;
                if (outputStream2 != null) {
                    outputStream2.close();
                }
            }
        }
        if (nu1.n.f421703e == null) {
            nu1.n.f421703e = new tu1.o();
        }
        tu1.o oVar = nu1.n.f421703e;
        if (oVar != null && oVar.f503655m == -1) {
            long j17 = tVar.f481266d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            tVar.f481266d = elapsedRealtime;
            if (nu1.n.f421703e == null) {
                nu1.n.f421703e = new tu1.o();
            }
            tu1.o oVar2 = nu1.n.f421703e;
            if (oVar2 == null) {
                return;
            }
            oVar2.f503655m = elapsedRealtime;
        }
    }

    public final void c() {
        gs0.b bVar = this.f481265c;
        if (bVar != null) {
            bVar.f();
        }
        java.io.OutputStream outputStream = this.f481264b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
    }
}
