package ws2;

/* loaded from: classes15.dex */
public final class x1 implements android.view.TextureView.SurfaceTextureListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f530688d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9) {
        this.f530688d = c14932xfc4acec9;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        c14932xfc4acec9.f(7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onCompletion() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback = c14932xfc4acec9.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar = c14932xfc4acec9.f206430p;
            videoViewCallback.E("", waVar != null ? waVar.f305629c : null);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onError() " + i17 + ' ' + i18 + " bgPrepareStatus:" + c14932xfc4acec9.f206435u + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        if (c14932xfc4acec9.f206435u != 0) {
            player.mo100934x6761d4f();
            c14932xfc4acec9.F();
            return;
        }
        cw2.wa waVar = c14932xfc4acec9.f206430p;
        if (waVar == null || (videoViewCallback = c14932xfc4acec9.getVideoViewCallback()) == null) {
            return;
        }
        videoViewCallback.N("", waVar.f305629c, "", i18, i17);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        r45.mb4 mb4Var;
        r45.mb4 mb4Var2;
        yz5.p seiInfoCallback;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo() what:" + i17 + " arg1:" + j17 + " arg2:" + j18 + " extraObject:" + obj + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
        if (i17 == 105) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#firstAudioFrameRendered " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
            return;
        }
        r8 = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1 = null;
        if (i17 == 106) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#firstVideoFrameRendered " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
            this.f530688d.g("onFirstFrameRendered");
            kz2.a aVar = this.f530688d.B;
            if (aVar != null) {
                aVar.b("onRendered");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
            nk4.a aVar2 = c14932xfc4acec9.F;
            kz2.a aVar3 = c14932xfc4acec9.B;
            aVar2.E = aVar3 != null ? aVar3.d() : null;
            cw2.fb lifecycle = this.f530688d.getLifecycle();
            if (lifecycle != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec92 = this.f530688d;
                cw2.wa waVar = c14932xfc4acec92.f206430p;
                lifecycle.u(waVar != null ? waVar.f305630d : null, 0L, c14932xfc4acec92.B);
                return;
            }
            return;
        }
        if (i17 == 150) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#onReplay() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
            cw2.fb lifecycle2 = this.f530688d.getLifecycle();
            if (lifecycle2 != null) {
                cw2.wa waVar2 = this.f530688d.f206430p;
                lifecycle2.F(waVar2 != null ? waVar2.f305630d : null);
                return;
            }
            return;
        }
        if (i17 == 204) {
            java.lang.String m58777xe56ce956 = this.f530688d.m58777xe56ce956();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onInfo#videoDecodeType:");
            sb6.append(j17);
            sb6.append(' ');
            cw2.wa waVar3 = this.f530688d.f206430p;
            sb6.append(waVar3 != null ? waVar3.f305629c : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m58777xe56ce956, sb6.toString());
            cw2.wa waVar4 = this.f530688d.f206430p;
            if (((waVar4 == null || (mb4Var2 = waVar4.f305630d) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var2.m75936x14adae67(69)) == null) {
                cw2.wa waVar5 = this.f530688d.f206430p;
                r45.mb4 mb4Var3 = waVar5 != null ? waVar5.f305630d : null;
                if (mb4Var3 != null) {
                    mb4Var3.set(69, new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1());
                }
            }
            cw2.wa waVar6 = this.f530688d.f206430p;
            if (waVar6 != null && (mb4Var = waVar6.f305630d) != null) {
                c19791x8d6e6bf1 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1) mb4Var.m75936x14adae67(69);
            }
            if (c19791x8d6e6bf1 == null) {
                return;
            }
            c19791x8d6e6bf1.m76739x62ee2d08((int) j17);
            return;
        }
        if (i17 == 1006) {
            if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) {
                java.lang.String m58777xe56ce9562 = this.f530688d.m58777xe56ce956();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FTPP.onInfo#downloadProgressUpdate: ");
                com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) obj;
                sb7.append(tPDownLoadProgressInfo.f50885x990e2b68);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.f50883x51112b9);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.f50882x9e4c3cc2);
                sb7.append(',');
                sb7.append(tPDownLoadProgressInfo.f50886xd5bbe701);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m58777xe56ce9562, sb7.toString());
                return;
            }
            return;
        }
        if (i17 == 200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#onBufferingStart() pos:" + this.f530688d.mo56685x3d7f3f1d() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec93 = this.f530688d;
            cw2.wa waVar7 = c14932xfc4acec93.f206430p;
            java.lang.String str = waVar7 != null ? waVar7.f305629c : null;
            java.lang.Runnable runnable = c14932xfc4acec93.f206439y;
            if (runnable != null) {
                c14932xfc4acec93.f206438x.mo50300x3fa464aa(runnable);
                c14932xfc4acec93.f206439y = null;
            }
            ws2.y1 y1Var = new ws2.y1(c14932xfc4acec93, str);
            c14932xfc4acec93.f206439y = y1Var;
            c14932xfc4acec93.f206438x.mo50297x7c4d7ca2(y1Var, c14932xfc4acec93.f206429o ? 500L : 1000L);
            return;
        }
        int i18 = 1;
        if (i17 == 201) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#onBufferingEnd() pos:" + this.f530688d.mo56685x3d7f3f1d() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(this.f530688d));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec94 = this.f530688d;
            java.lang.Runnable runnable2 = c14932xfc4acec94.f206439y;
            if (runnable2 != null) {
                c14932xfc4acec94.f206438x.mo50300x3fa464aa(runnable2);
                c14932xfc4acec94.f206439y = null;
            }
            if (c14932xfc4acec94.f206433s) {
                c14932xfc4acec94.f206433s = false;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = c14932xfc4acec94.videoViewCallback;
                if (b1Var != null) {
                    cw2.wa waVar8 = c14932xfc4acec94.f206430p;
                    b1Var.m2("", waVar8 != null ? waVar8.f305629c : null, true);
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 502) {
            if (i17 != 503) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo tPVideoSeiInfo = obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo ? (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj : null;
            if (tPVideoSeiInfo == null || (seiInfoCallback = this.f530688d.getSeiInfoCallback()) == null) {
                return;
            }
            seiInfoCallback.mo149xb9724478(java.lang.Integer.valueOf(tPVideoSeiInfo.f50910x6cf04f36), obj);
            return;
        }
        java.lang.String m58777xe56ce9563 = this.f530688d.m58777xe56ce956();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("FTPP.onInfo#mediaCodecInfo:");
        sb8.append(j17);
        sb8.append(' ');
        cw2.wa waVar9 = this.f530688d.f206430p;
        sb8.append(waVar9 != null ? waVar9.f305629c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m58777xe56ce9563, sb8.toString());
        if (!(obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#mediaCodecInfo return for not codecInfo");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo tPMediaCodecInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj;
        if (tPMediaCodecInfo.f50894x7f94e13e != com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50889xc181df11) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f530688d.m58777xe56ce956(), "FTPP.onInfo#mediaCodecInfo return for not video type");
            return;
        }
        int i19 = tPMediaCodecInfo.f50893xa9b6108;
        try {
            if (i19 == com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50891x96f7dbd1) {
                cl0.g gVar = new cl0.g(((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj).msg);
                nk4.t tVar = this.f530688d.f206436v;
                if (tVar != null) {
                    tVar.f419638c = gVar.optBoolean("reuseEnable") ? 1 : -1;
                }
                nk4.t tVar2 = this.f530688d.f206436v;
                if (tVar2 != null) {
                    if (!gVar.optBoolean("isReuse")) {
                        i18 = -1;
                    }
                    tVar2.f419639d = i18;
                }
                nk4.t tVar3 = this.f530688d.f206436v;
                if (tVar3 != null) {
                    tVar3.f419640e = gVar.optInt("totalCodec");
                }
            } else if (i19 == com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo.f50890xf67a037d) {
                cl0.g gVar2 = new cl0.g(((com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaCodecInfo) obj).msg);
                nk4.t tVar4 = this.f530688d.f206436v;
                if (tVar4 != null) {
                    tVar4.f419641f = gVar2.mo15082x48bce8a4("errorCodec");
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        cw2.fb lifecycle3 = this.f530688d.getLifecycle();
        if (lifecycle3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec95 = this.f530688d;
            cw2.wa waVar10 = c14932xfc4acec95.f206430p;
            lifecycle3.g(waVar10 != null ? waVar10.f305630d : null, c14932xfc4acec95.f206436v);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.OnPrepared() " + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        kz2.a aVar = c14932xfc4acec9.B;
        if (aVar != null) {
            aVar.c("onPrepared");
        }
        c14932xfc4acec9.f(4);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback = c14932xfc4acec9.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar = c14932xfc4acec9.f206430p;
            videoViewCallback.o("", waVar != null ? waVar.f305629c : null);
        }
        if (!c14932xfc4acec9.isViewFocused || c14932xfc4acec9.E) {
            c14932xfc4acec9.m58775xd9190ed2(1);
            player.mo100931xe51afc9e();
        } else {
            c14932xfc4acec9.o(2);
        }
        c14932xfc4acec9.E = false;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback = this.f530688d.getVideoViewCallback();
        if (videoViewCallback != null) {
            videoViewCallback.mo55683xe1fdf750(interfaceC26164x73fc6bc6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onStateChange() preState:" + i17 + " curState:" + i18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.Boolean valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onSurfaceTextureAvailable() width:" + i17 + " height:" + i18 + " surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        kz2.a aVar = c14932xfc4acec9.B;
        if (aVar != null) {
            aVar.c("onSurfaceAva");
        }
        if (c14932xfc4acec9.f206426i == null) {
            c14932xfc4acec9.f206427m = surfaceTexture;
            c14932xfc4acec9.f206426i = new android.view.Surface(surfaceTexture);
            kk4.c cVar = c14932xfc4acec9.f206423f;
            if (cVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("player");
                throw null;
            }
            ((kk4.f0) cVar).mo100970x42c875eb(c14932xfc4acec9.f206426i);
            c14932xfc4acec9.o(1);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 26) {
            valueOf = java.lang.Boolean.FALSE;
        } else {
            android.graphics.SurfaceTexture surfaceTexture2 = c14932xfc4acec9.f206427m;
            valueOf = surfaceTexture2 != null ? java.lang.Boolean.valueOf(surfaceTexture2.isReleased()) : null;
        }
        java.lang.String m58777xe56ce956 = c14932xfc4acec9.m58777xe56ce956();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.onSurfaceTextureAvailable() return for surface:");
        android.view.Surface surface = c14932xfc4acec9.f206426i;
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : null);
        sb6.append(" valid:");
        android.view.Surface surface2 = c14932xfc4acec9.f206426i;
        sb6.append(surface2 != null ? java.lang.Boolean.valueOf(surface2.isValid()) : null);
        sb6.append(" released:");
        sb6.append(valueOf);
        sb6.append(" isReusing:");
        sb6.append(c14932xfc4acec9.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m58777xe56ce956, sb6.toString());
        pk4.b bVar = c14932xfc4acec9.f206425h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textureView");
            throw null;
        }
        android.graphics.SurfaceTexture surfaceTexture3 = c14932xfc4acec9.f206427m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture3);
        bVar.setSurfaceTexture(surfaceTexture3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onSurfaceTextureDestroyed() surfaceTexture:" + surfaceTexture.hashCode() + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.onSurfaceTextureSizeChanged  surfaceTexture:" + surfaceTexture.hashCode() + ' ' + i17 + ' ' + i18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        c14932xfc4acec9.getClass();
        c14932xfc4acec9.F.f419578e++;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        java.lang.String str;
        cw2.wa waVar;
        mn2.j4 j4Var;
        r45.mb4 e17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f530688d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14932xfc4acec9.m58777xe56ce956(), "FTPP.OnVideoSizeChanged() width:" + j17 + " height:" + j18 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9.c(c14932xfc4acec9));
        if (j17 > 0 && j18 > 0 && (waVar = c14932xfc4acec9.f206430p) != null && (j4Var = waVar.f305631e) != null && (e17 = j4Var.e()) != null) {
            e17.set(4, java.lang.Float.valueOf((float) j17));
            e17.set(5, java.lang.Float.valueOf((float) j18));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 videoViewCallback = c14932xfc4acec9.getVideoViewCallback();
        if (videoViewCallback != null) {
            cw2.wa waVar2 = c14932xfc4acec9.f206430p;
            if (waVar2 == null || (str = waVar2.f305629c) == null) {
                str = "";
            }
            videoViewCallback.I("", str, (int) j17, (int) j18);
        }
        pk4.b bVar = c14932xfc4acec9.f206425h;
        if (bVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749) bVar).m((int) j17, (int) j18);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textureView");
            throw null;
        }
    }
}
