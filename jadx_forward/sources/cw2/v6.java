package cw2;

/* loaded from: classes15.dex */
public final class v6 implements android.view.TextureView.SurfaceTextureListener, mk4.a, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305601d;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        this.f305601d = c15188xd8bd4bd;
    }

    @Override // mk4.a
    public boolean a(java.lang.Object surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (surface instanceof android.graphics.SurfaceTexture) {
            return false;
        }
        boolean z17 = surface instanceof android.view.SurfaceHolder;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        if (z17) {
            if (!(c15188xd8bd4bd.m61394x356ded51() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768)) {
                return false;
            }
            mk4.h hVar = c15188xd8bd4bd.A1;
            mk4.b m61394x356ded51 = c15188xd8bd4bd.m61394x356ded51();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m61394x356ded51, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.render.MMSurfaceViewRender");
            hVar.e((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768) m61394x356ded51);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceDestroy() surface:" + surface + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        return false;
    }

    @Override // mk4.a
    public void b(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceChange  surface:" + surface + ' ' + i17 + ' ' + i18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        if (surface instanceof android.graphics.SurfaceTexture) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.h(c15188xd8bd4bd, (android.graphics.SurfaceTexture) surface, i17, i18);
            return;
        }
        if (surface instanceof android.view.SurfaceHolder) {
            android.view.SurfaceHolder surfaceHolder = (android.view.SurfaceHolder) surface;
            cw2.z5 z5Var = c15188xd8bd4bd.G1;
            if (z5Var != null) {
                android.view.Surface surface2 = surfaceHolder.getSurface();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface2, "getSurface(...)");
                z5Var.c(surface2, i17, i18);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceChange() width:" + i17 + " height:" + i18 + " surface:" + surface + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
    }

    @Override // mk4.a
    public void c(java.lang.Object surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        boolean z17 = surface instanceof android.graphics.SurfaceTexture;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f(c15188xd8bd4bd, (android.graphics.SurfaceTexture) surface, i17, i18);
            return;
        }
        if (surface instanceof android.view.SurfaceHolder) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.g(c15188xd8bd4bd, (android.view.SurfaceHolder) surface, i17, i18);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceAvailable() width:" + i17 + " height:" + i18 + " surface:" + surface + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
    }

    @Override // mk4.a
    public void d(java.lang.Object surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        c15188xd8bd4bd.q(7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onCompletion() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        pm0.v.X(new cw2.u6(c15188xd8bd4bd));
        zy2.ub videoViewCallback = c15188xd8bd4bd.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
            videoViewCallback.E("", mediaSource != null ? mediaSource.f305629c : null);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, int i18, long j17, long j18) {
        zy2.ub videoViewCallback;
        cw2.wa mediaSource;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onError() " + i17 + ' ' + i18 + " bgPrepareStatus:" + c15188xd8bd4bd.f212210z + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        c15188xd8bd4bd.P(true);
        c15188xd8bd4bd.q(10);
        if (i18 == 11030406 && (mediaSource = c15188xd8bd4bd.getMediaSource()) != null) {
            cu2.x xVar = cu2.x.f303982a;
            long feedId = mediaSource.f305632f.getFeedId();
            java.lang.String str = mediaSource.f305629c;
            mn2.j4 j4Var = mediaSource.f305631e;
            java.lang.String m75945x2fec8307 = j4Var.e().m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String str2 = mediaSource.f305627a;
            cu2.x.h(xVar, feedId, str, m75945x2fec8307, str2 != null ? str2 : "", j4Var.b(), j4Var.g(), j4Var.c(), 0L, 0L, 1, j4Var.e().m75939xb282bd08(3), "", "", false, j4Var.d(), 8192, null);
            cw2.s6 s6Var = c15188xd8bd4bd.f212202v;
            if (s6Var != null) {
                s6Var.b();
            }
        }
        if (c15188xd8bd4bd.f212210z != 0) {
            player.mo100934x6761d4f();
            c15188xd8bd4bd.F();
            return;
        }
        cw2.wa mediaSource2 = c15188xd8bd4bd.getMediaSource();
        if (mediaSource2 == null || (videoViewCallback = c15188xd8bd4bd.getVideoViewCallback()) == null) {
            return;
        }
        videoViewCallback.N("", mediaSource2.f305629c, "", i18, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        cw2.wa mediaSource;
        cw2.i9 lifecycle;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae884;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
        pw2.b bVar = this.f305601d.f212208y0;
        long j19 = 0;
        if (i17 != 101) {
            if (i17 != 102) {
                if (i17 != 104) {
                    bVar.getClass();
                } else if (bVar.f440222e == 0) {
                    bVar.f440222e = android.os.SystemClock.uptimeMillis();
                }
            } else if (bVar.f440220c == 0) {
                bVar.f440220c = android.os.SystemClock.uptimeMillis();
            }
        } else if (bVar.f440219b == 0) {
            bVar.f440219b = android.os.SystemClock.uptimeMillis();
        }
        if (i17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#firstAudioFrameRendered " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
            if (!c15188xd8bd4bd.isViewFocused || (mediaSource = c15188xd8bd4bd.getMediaSource()) == null || (lifecycle = this.f305601d.getLifecycle()) == null) {
                return;
            }
            lifecycle.p(new nk4.j(mediaSource.f305632f.m59124x87980ca(), android.os.SystemClock.uptimeMillis(), mediaSource.f305632f.getDupFlag()));
            return;
        }
        java.lang.String str = null;
        r6 = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = null;
        str = null;
        if (i17 == 106) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#firstVideoFrameRendered " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            kz2.a aVar = this.f305601d.R;
            if (aVar != null) {
                aVar.b("onRendered");
            }
            this.f305601d.Q("onFirstFrameRendered");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f305601d;
            nk4.a aVar2 = c15188xd8bd4bd2.f212205x0;
            kz2.a aVar3 = c15188xd8bd4bd2.R;
            aVar2.E = aVar3 != null ? aVar3.d() : null;
            cw2.i9 lifecycle2 = this.f305601d.getLifecycle();
            if (lifecycle2 != null) {
                cw2.wa mediaSource2 = this.f305601d.getMediaSource();
                lifecycle2.u(mediaSource2 != null ? mediaSource2.f305630d : null, 0L, this.f305601d.R);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = this.f305601d;
            pw2.b bVar2 = c15188xd8bd4bd3.f212208y0;
            boolean z17 = c15188xd8bd4bd3.isViewFocused;
            if (bVar2.f440223f == 0) {
                bVar2.f440230m = z17 ? 1 : 0;
                bVar2.f440223f = android.os.SystemClock.uptimeMillis();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = this.f305601d;
            c15188xd8bd4bd4.f212205x0.F = c15188xd8bd4bd4.f212208y0.a();
            cw2.i9 lifecycle3 = this.f305601d.getLifecycle();
            if (lifecycle3 != null) {
                cw2.wa mediaSource3 = this.f305601d.getMediaSource();
                if (mediaSource3 != null && (c14989xf862ae882 = mediaSource3.f305632f) != null) {
                    j19 = c14989xf862ae882.getFeedId();
                }
                long j27 = j19;
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd5 = this.f305601d;
                org.json.JSONObject jSONObject = c15188xd8bd4bd5.f212205x0.F;
                cw2.wa mediaSource4 = c15188xd8bd4bd5.getMediaSource();
                if (mediaSource4 != null && (c14989xf862ae88 = mediaSource4.f305632f) != null) {
                    str = c14989xf862ae88.getDupFlag();
                }
                lifecycle3.B(new nk4.c(j27, 7, uptimeMillis, jSONObject, str));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#firstVideoFrameRendered " + this.f305601d.f212208y0);
            return;
        }
        if (i17 == 108) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#firstVideoFrameRenderedAfterSurfaceChange " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            this.f305601d.R();
            return;
        }
        if (i17 == 204) {
            java.lang.String m61380xe56ce956 = this.f305601d.m61380xe56ce956();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
            sb6.append(j17);
            sb6.append(' ');
            cw2.wa mediaSource5 = this.f305601d.getMediaSource();
            sb6.append(mediaSource5 != null ? mediaSource5.f305629c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956, sb6.toString());
            cw2.wa mediaSource6 = this.f305601d.getMediaSource();
            if (((mediaSource6 == null || (mb4Var2 = mediaSource6.f305630d) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var2.m75936x14adae67(69)) == null) {
                cw2.wa mediaSource7 = this.f305601d.getMediaSource();
                r45.mb4 mb4Var3 = mediaSource7 != null ? mediaSource7.f305630d : null;
                if (mb4Var3 != null) {
                    mb4Var3.set(69, new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1());
                }
            }
            int i18 = (int) j17;
            if (i18 == 102) {
                cw2.p6 p6Var = this.f305601d.T;
                p6Var.getClass();
                p6Var.f305465c = "MediaCodec";
            } else {
                cw2.p6 p6Var2 = this.f305601d.T;
                p6Var2.getClass();
                p6Var2.f305465c = "FFmpeg";
            }
            cw2.wa mediaSource8 = this.f305601d.getMediaSource();
            if (mediaSource8 != null && (mb4Var = mediaSource8.f305630d) != null) {
                c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
            }
            if (c19791x8d6e6bf1 == null) {
                return;
            }
            c19791x8d6e6bf1.m76739x62ee2d08(i18);
            return;
        }
        int i19 = 1;
        if (i17 == 502) {
            java.lang.String m61380xe56ce9562 = this.f305601d.m61380xe56ce956();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecInfo:");
            sb7.append(j17);
            sb7.append(' ');
            cw2.wa mediaSource9 = this.f305601d.getMediaSource();
            sb7.append(mediaSource9 != null ? mediaSource9.f305629c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce9562, sb7.toString());
            if (!(obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#mediaCodecInfo return for not codecInfo");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj;
            if (tPMediaCodecInfo.f50894x7f94e13e != com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50889xc181df11) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#mediaCodecInfo return for not video type");
                return;
            }
            int i27 = tPMediaCodecInfo.f50893xa9b6108;
            try {
                if (i27 == com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50891x96f7dbd1) {
                    cl0.g gVar = new cl0.g(((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj).msg);
                    nk4.t tVar = this.f305601d.A;
                    if (tVar != null) {
                        tVar.f419638c = gVar.optBoolean("reuseEnable") ? 1 : -1;
                    }
                    nk4.t tVar2 = this.f305601d.A;
                    if (tVar2 != null) {
                        if (!gVar.optBoolean("isReuse")) {
                            i19 = -1;
                        }
                        tVar2.f419639d = i19;
                    }
                    nk4.t tVar3 = this.f305601d.A;
                    if (tVar3 != null) {
                        tVar3.f419640e = gVar.optInt("totalCodec");
                    }
                } else if (i27 == com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50890xf67a037d) {
                    cl0.g gVar2 = new cl0.g(((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj).msg);
                    nk4.t tVar4 = this.f305601d.A;
                    if (tVar4 != null) {
                        tVar4.f419641f = gVar2.mo15082x48bce8a4("errorCodec");
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            cw2.i9 lifecycle4 = this.f305601d.getLifecycle();
            if (lifecycle4 != null) {
                cw2.wa mediaSource10 = this.f305601d.getMediaSource();
                lifecycle4.g(mediaSource10 != null ? mediaSource10.f305630d : null, this.f305601d.A);
                return;
            }
            return;
        }
        if (i17 == 1006) {
            if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#downloadProgressUpdate: " + ((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) obj).f50885x990e2b68);
                return;
            }
            return;
        }
        if (i17 == 150) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#onLoopStart() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            return;
        }
        if (i17 == 151) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f305601d.m61380xe56ce956(), "FTPP.onInfo#onLoopEnd()  " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            cw2.i9 lifecycle5 = this.f305601d.getLifecycle();
            if (lifecycle5 != null) {
                cw2.wa mediaSource11 = this.f305601d.getMediaSource();
                lifecycle5.F(mediaSource11 != null ? mediaSource11.f305630d : null);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546217a.a();
            return;
        }
        if (i17 == 200) {
            java.lang.String m61380xe56ce9563 = this.f305601d.m61380xe56ce956();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("FTPP.onInfo#onBufferingStart() pos:");
            sb8.append(this.f305601d.mo56685x3d7f3f1d());
            sb8.append(" feedId:");
            cw2.wa mediaSource12 = this.f305601d.getMediaSource();
            if (mediaSource12 != null && (c14989xf862ae883 = mediaSource12.f305632f) != null) {
                j19 = c14989xf862ae883.getFeedId();
            }
            sb8.append(pm0.v.u(j19));
            sb8.append(' ');
            sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce9563, sb8.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd6 = this.f305601d;
            cw2.wa mediaSource13 = c15188xd8bd4bd6.getMediaSource();
            java.lang.String str2 = mediaSource13 != null ? mediaSource13.f305629c : null;
            java.lang.Runnable runnable = c15188xd8bd4bd6.H;
            if (runnable != null) {
                c15188xd8bd4bd6.G.mo50300x3fa464aa(runnable);
                c15188xd8bd4bd6.H = null;
            }
            cw2.b7 b7Var = new cw2.b7(c15188xd8bd4bd6, str2);
            c15188xd8bd4bd6.H = b7Var;
            c15188xd8bd4bd6.G.mo50297x7c4d7ca2(b7Var, (!c15188xd8bd4bd6.f212198r || c15188xd8bd4bd6.isSeeking) ? 1000L : 500L);
            return;
        }
        if (i17 == 201) {
            java.lang.String m61380xe56ce9564 = this.f305601d.m61380xe56ce956();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("FTPP.onInfo#onBufferingEnd() pos:");
            sb9.append(this.f305601d.mo56685x3d7f3f1d());
            sb9.append(" feedId:");
            cw2.wa mediaSource14 = this.f305601d.getMediaSource();
            if (mediaSource14 != null && (c14989xf862ae884 = mediaSource14.f305632f) != null) {
                j19 = c14989xf862ae884.getFeedId();
            }
            sb9.append(pm0.v.u(j19));
            sb9.append(' ');
            sb9.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(this.f305601d));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce9564, sb9.toString());
            this.f305601d.P(true);
            return;
        }
        if (i17 == 260) {
            java.lang.String m61380xe56ce9565 = this.f305601d.m61380xe56ce956();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecOpenStuck:");
            sb10.append(j17);
            sb10.append(' ');
            cw2.wa mediaSource15 = this.f305601d.getMediaSource();
            sb10.append(mediaSource15 != null ? mediaSource15.f305629c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9565, sb10.toString());
            this.f305601d.f212205x0.f419596z = (int) j17;
            return;
        }
        if (i17 != 261) {
            return;
        }
        java.lang.String m61380xe56ce9566 = this.f305601d.m61380xe56ce956();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecCloseStuck:");
        sb11.append(j17);
        sb11.append(' ');
        cw2.wa mediaSource16 = this.f305601d.getMediaSource();
        sb11.append(mediaSource16 != null ? mediaSource16.f305629c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m61380xe56ce9566, sb11.toString());
        this.f305601d.f212205x0.A = (int) j17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        cw2.i9 lifecycle;
        so2.i3 i3Var;
        cw2.i9 lifecycle2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.OnPrepared() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        kz2.a aVar = c15188xd8bd4bd.R;
        if (aVar != null) {
            aVar.c("onPrepared");
        }
        pw2.b bVar = c15188xd8bd4bd.f212208y0;
        if (bVar.f440219b == 0) {
            bVar.f440221d = android.os.SystemClock.uptimeMillis();
        }
        c15188xd8bd4bd.q(4);
        java.lang.String m61380xe56ce956 = c15188xd8bd4bd.m61380xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dFile:");
        sb6.append(c15188xd8bd4bd.getRequestOffset());
        sb6.append('/');
        sb6.append(c15188xd8bd4bd.f212182d2);
        sb6.append(':');
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) c15188xd8bd4bd.getRequestOffset()) * 100.0f) / ((float) c15188xd8bd4bd.f212182d2))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append("% ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m61380xe56ce956, sb6.toString());
        zy2.ub videoViewCallback = c15188xd8bd4bd.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
            videoViewCallback.o("", mediaSource != null ? mediaSource.f305629c : null);
        }
        cw2.wa mediaSource2 = c15188xd8bd4bd.getMediaSource();
        if (mediaSource2 != null && (lifecycle2 = c15188xd8bd4bd.getLifecycle()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = mediaSource2.f305632f;
            lifecycle2.C(new nk4.q(c14989xf862ae88.m59124x87980ca(), ((kk4.f0) c15188xd8bd4bd.getPlayer()).f390065h, android.os.SystemClock.uptimeMillis(), c14989xf862ae88.getDupFlag()));
        }
        if (c15188xd8bd4bd.isViewFocused) {
            c15188xd8bd4bd.X(2);
        } else if (c15188xd8bd4bd.W()) {
            c15188xd8bd4bd.m61372xd9190ed2(1);
            player.mo100931xe51afc9e();
        }
        cw2.s6 s6Var = c15188xd8bd4bd.f212202v;
        if (s6Var != null && (i3Var = s6Var.f305535g) != null) {
            i3Var.f68967xa78549dc = (int) player.mo100924x2d67b867(101);
            i3Var.f68994xfd4dbd97 = (int) player.mo100924x2d67b867(202);
            i3Var.f68978xbb1b16e8 = (int) player.mo100924x2d67b867(206);
            i3Var.f68995x3b89adfb = (int) player.mo100924x2d67b867(201);
            long j17 = i3Var.f68967xa78549dc + i3Var.f68994xfd4dbd97;
            c15188xd8bd4bd.F1 = j17;
            c15188xd8bd4bd.T.f305471i = j17;
            c15188xd8bd4bd.f212205x0.f419591u = i3Var.f68978xbb1b16e8;
        }
        cw2.d0 playerBufferController = c15188xd8bd4bd.getPlayerBufferController();
        if (playerBufferController != null) {
            long j18 = c15188xd8bd4bd.F1;
            long mo100917x37a7fa50 = player.mo100917x37a7fa50();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(playerBufferController.d(), "onPrepared durationMs:" + mo100917x37a7fa50 + " bitrate:" + j18);
        }
        zy2.ub videoViewCallback2 = c15188xd8bd4bd.getVideoViewCallback();
        if (videoViewCallback2 != null) {
            cw2.wa mediaSource3 = c15188xd8bd4bd.getMediaSource();
            videoViewCallback2.o("", mediaSource3 != null ? mediaSource3.f305629c : null);
        }
        cw2.wa mediaSource4 = c15188xd8bd4bd.getMediaSource();
        if (mediaSource4 != null && (lifecycle = c15188xd8bd4bd.getLifecycle()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = mediaSource4.f305632f;
            lifecycle.C(new nk4.q(c14989xf862ae882.getFeedId(), ((kk4.f0) c15188xd8bd4bd.getPlayer()).f390065h, android.os.SystemClock.uptimeMillis(), c14989xf862ae882.getDupFlag()));
        }
        if (c15188xd8bd4bd.isViewFocused) {
            c15188xd8bd4bd.X(2);
        } else if (c15188xd8bd4bd.W()) {
            c15188xd8bd4bd.m61372xd9190ed2(1);
            player.mo100931xe51afc9e();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener onSeekCompleteListener = c15188xd8bd4bd.getOnSeekCompleteListener();
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.mo53284xe1fdf750(interfaceC26164x73fc6bc6);
        }
        c15188xd8bd4bd.m61418xe1a2e326(null);
        pw2.b bVar = c15188xd8bd4bd.f212208y0;
        if (bVar.f440226i == 0) {
            bVar.f440226i = android.os.SystemClock.uptimeMillis();
        }
        c15188xd8bd4bd.m61427x26c61fa8(false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.f(this.f305601d, surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.h(c15188xd8bd4bd, surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        c15188xd8bd4bd.getClass();
        c15188xd8bd4bd.f212205x0.f419578e++;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        cw2.i9 lifecycle;
        java.lang.String str;
        mn2.j4 j4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        java.util.LinkedList<r45.mb4> m59135x7efe73ec;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae883;
        so2.i3 i3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305601d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15188xd8bd4bd.m61380xe56ce956(), "FTPP.OnVideoSizeChanged() width:" + j17 + " height:" + j18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.j(c15188xd8bd4bd));
        int i17 = (int) j17;
        int i18 = (int) j18;
        c15188xd8bd4bd.m61394x356ded51().a(i17, i18);
        c15188xd8bd4bd.m61432x5ae92066(new android.util.Size(i17, i18));
        c15188xd8bd4bd.H();
        cw2.z5 z5Var = c15188xd8bd4bd.G1;
        if (z5Var != null) {
            z5Var.b(i17, i18);
        }
        cw2.s6 s6Var = c15188xd8bd4bd.f212202v;
        if (s6Var != null && (i3Var = s6Var.f305535g) != null) {
            i3Var.f68973xffefc = c15188xd8bd4bd.L;
            i3Var.f68972x7ed828cf = c15188xd8bd4bd.M;
            i3Var.f68974x45abca = c15188xd8bd4bd.N;
        }
        cw2.wa mediaSource = c15188xd8bd4bd.getMediaSource();
        java.lang.Long valueOf = (mediaSource == null || (c14989xf862ae883 = mediaSource.f305632f) == null) ? null : java.lang.Long.valueOf(c14989xf862ae883.getFeedId());
        cw2.wa mediaSource2 = c15188xd8bd4bd.getMediaSource();
        java.lang.Integer valueOf2 = (mediaSource2 == null || (c14989xf862ae882 = mediaSource2.f305632f) == null) ? null : java.lang.Integer.valueOf(c14989xf862ae882.getPosition());
        cw2.wa mediaSource3 = c15188xd8bd4bd.getMediaSource();
        bu2.h0 d17 = (mediaSource3 == null || (c14989xf862ae88 = mediaSource3.f305632f) == null || (m59135x7efe73ec = c14989xf862ae88.m59135x7efe73ec()) == null) ? null : bu2.z.d(m59135x7efe73ec, "FTPP.FinderThumbPlayerProxy", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTPP.FinderThumbPlayerProxy", "onVideoSizeChanged: width: %s, height: %s, feedId: %s, position: %s, mediaHWRatio: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), valueOf, valueOf2, d17 != null ? java.lang.Float.valueOf(d17.f106049a) : null);
        if (valueOf == null || valueOf2 == null || d17 == null || (lifecycle = c15188xd8bd4bd.getLifecycle()) == null) {
            return;
        }
        long longValue = valueOf.longValue();
        cw2.wa mediaSource4 = c15188xd8bd4bd.getMediaSource();
        java.lang.String str2 = mediaSource4 != null ? mediaSource4.f305629c : null;
        int intValue = valueOf2.intValue();
        cw2.wa mediaSource5 = c15188xd8bd4bd.getMediaSource();
        if (mediaSource5 == null || (j4Var = mediaSource5.f305631e) == null || (str = j4Var.g()) == null) {
            str = "";
        }
        lifecycle.t(j17, j18, longValue, str2, intValue, d17, str);
    }
}
