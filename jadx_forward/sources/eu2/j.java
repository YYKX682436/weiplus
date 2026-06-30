package eu2;

/* loaded from: classes2.dex */
public final class j implements fu2.c {

    /* renamed from: a, reason: collision with root package name */
    public final du2.l f338323a = eu2.b0.I;

    /* renamed from: b, reason: collision with root package name */
    public final fu2.a f338324b = new fu2.a(null, null);

    /* renamed from: c, reason: collision with root package name */
    public final fu2.b f338325c = new fu2.b(0, 0, 0.0f, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f338326d;

    public j(eu2.b0 b0Var) {
        this.f338326d = b0Var;
    }

    public final android.app.PendingIntent a(int i17, android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1637x7c6522f1.ServiceC15002xfa6c787f.class);
        intent.putExtra("key_action_code", i17);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.PendingIntent foregroundService = android.app.PendingIntent.getForegroundService(context, i17, intent, 201326592);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(foregroundService);
            return foregroundService;
        }
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i17, intent, 201326592);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(service);
        return service;
    }

    public final void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff902;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2;
        cw2.da daVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f3;
        cw2.da daVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f4;
        eu2.b0 b0Var = this.f338326d;
        if (z17) {
            b0Var.f338300q = false;
        }
        int ordinal = b0Var.f338295i.ordinal();
        r4 = null;
        java.lang.Integer num = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            if (z17) {
                int ordinal2 = b0Var.f338293g.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 2) {
                        return;
                    }
                    in5.s0 s0Var = b0Var.f338294h;
                    if (s0Var != null && (c15196x85976f5f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.k(com.p314xaae8f345.mm.R.id.e_k)) != null) {
                        cw2.v9.n(c15196x85976f5f4, 0, null, null, 7, null);
                    }
                    b0Var.f338296m = false;
                    return;
                }
                b0Var.f338299p = true;
                b0Var.Di();
                if (!b0Var.Zi() || (daVar2 = b0Var.f338290d) == null) {
                    return;
                }
                daVar2.mo56716x4121a19(true);
                if (zy2.g5.u(daVar2, null, 1, null)) {
                    return;
                }
                daVar2.mo56709x764d819b(false);
                return;
            }
            int ordinal3 = b0Var.f338293g.ordinal();
            if (ordinal3 == 0) {
                b0Var.f338299p = true;
                b0Var.Di();
                if (!b0Var.Zi() || (daVar = b0Var.f338290d) == null) {
                    return;
                }
                daVar.mo58788x65825f6();
                return;
            }
            if (ordinal3 != 2) {
                return;
            }
            in5.s0 s0Var2 = b0Var.f338294h;
            java.lang.Object videoView = (s0Var2 == null || (c15196x85976f5f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var2.k(com.p314xaae8f345.mm.R.id.e_k)) == null) ? null : c15196x85976f5f3.getVideoView();
            java.lang.Object obj = videoView instanceof cw2.u9 ? (cw2.u9) videoView : null;
            if (obj != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b) obj).mo58788x65825f6();
            }
            if (b0Var.f338295i == eu2.e.f338316e) {
                b0Var.f338296m = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handleLivePauseAction]: videoView = " + obj + ", pause live feed, livePausedByMediaSessionOrNotificationAction = true");
                return;
            }
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause video");
            int ordinal4 = b0Var.f338293g.ordinal();
            if (ordinal4 == 0) {
                b0Var.f338299p = true;
                b0Var.Di();
                if (!eu2.b0.Bi(b0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard video is pausing now, update player state!");
                    b0Var.cj(null);
                    return;
                } else {
                    if (!b0Var.Zi()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard is not shown!");
                        return;
                    }
                    cw2.da daVar3 = b0Var.f338290d;
                    if (daVar3 != null) {
                        daVar3.w();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: keyGuard pause!");
                    b0Var.ij("lock_screen_widget_stop");
                    return;
                }
            }
            if (ordinal4 == 1) {
                kd2.p1.T0(kd2.p1.N.a(), false, false, false, 7, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause mini view!");
                b0Var.ij("lock_screen_widget_stop");
                return;
            }
            if (ordinal4 != 2) {
                return;
            }
            android.content.res.Configuration configuration = b0Var.f338309z;
            if (configuration != null && configuration.orientation == 2) {
                in5.s0 s0Var3 = b0Var.f338294h;
                cw2.da videoView2 = (s0Var3 == null || (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var3.k(com.p314xaae8f345.mm.R.id.e_k)) == null) ? null : c15196x85976f5f.getVideoView();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                java.lang.Object parent = c15188xd8bd4bd != null ? c15188xd8bd4bd.getParent() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd) parent : null;
                if (abstractGestureDetectorOnGestureListenerC15410x706991fd != null) {
                    abstractGestureDetectorOnGestureListenerC15410x706991fd.i();
                }
            } else {
                in5.s0 s0Var4 = b0Var.f338294h;
                if (s0Var4 != null && (c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var4.k(com.p314xaae8f345.mm.R.id.ghd)) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.I(c15178x4303ff90, "FinderSystemPlayerDepend", false, 2, null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePauseAction]: pause video feed!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: start play video");
        int ordinal5 = b0Var.f338293g.ordinal();
        if (ordinal5 == 0) {
            b0Var.f338299p = true;
            b0Var.Di();
            if (eu2.b0.Bi(b0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard video is playing now, update player state!");
                b0Var.cj(null);
                return;
            } else {
                if (!b0Var.Zi()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard is not shown!");
                    return;
                }
                cw2.da daVar4 = b0Var.f338290d;
                if (daVar4 != null) {
                    zy2.g5.u(daVar4, null, 1, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: keyGuard start play!");
                b0Var.ij("lock_screen_widget_play");
                return;
            }
        }
        if (ordinal5 == 1) {
            kd2.p1.T0(kd2.p1.N.a(), false, false, false, 7, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", "[handlePlayAction]: mini view start play!");
            b0Var.ij("lock_screen_widget_play");
            return;
        }
        if (ordinal5 != 2) {
            return;
        }
        android.content.res.Configuration configuration2 = b0Var.f338309z;
        if (configuration2 != null && configuration2.orientation == 2) {
            in5.s0 s0Var5 = b0Var.f338294h;
            cw2.da videoView3 = (s0Var5 == null || (c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var5.k(com.p314xaae8f345.mm.R.id.e_k)) == null) ? null : c15196x85976f5f2.getVideoView();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = videoView3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView3 : null;
            android.view.ViewParent parent2 = c15188xd8bd4bd2 != null ? c15188xd8bd4bd2.getParent() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd2 = parent2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd) parent2 : null;
            if (abstractGestureDetectorOnGestureListenerC15410x706991fd2 != null) {
                abstractGestureDetectorOnGestureListenerC15410x706991fd2.i();
            }
        } else {
            in5.s0 s0Var6 = b0Var.f338294h;
            if (s0Var6 != null && (c15178x4303ff902 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var6.k(com.p314xaae8f345.mm.R.id.ghd)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.I(c15178x4303ff902, "FinderSystemPlayerDepend", false, 2, null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handlePlayAction]: mediaType = ");
        cw2.wa waVar = b0Var.f338291e;
        if (waVar != null && (c14989xf862ae88 = waVar.f305632f) != null) {
            num = java.lang.Integer.valueOf(c14989xf862ae88.getMediaType());
        }
        sb6.append(num);
        sb6.append(", start play feed stream!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerDepend", sb6.toString());
    }

    public final void c(boolean z17) {
        eu2.b0 b0Var = this.f338326d;
        cw2.da daVar = b0Var.f338290d;
        if (b0Var.f338293g == eu2.k.f338327d && b0Var.aj() && daVar != null) {
            if (!z17) {
                b(false);
                b0Var.Ui().Ui(false, eu2.b0.I);
                return;
            }
            b0Var.Ui().Ui(true, eu2.b0.I);
            if (b0Var.f338300q) {
                return;
            }
            if ((daVar instanceof cw2.u9) || daVar.mo56685x3d7f3f1d() != 0) {
                b(true);
            }
        }
    }

    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        cw2.wa waVar = this.f338326d.f338291e;
        if (waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) {
            return null;
        }
        return c14989xf862ae88.getNickName();
    }

    public android.graphics.Bitmap e() {
        android.graphics.Bitmap bitmap = this.f338324b.f348405a;
        if (bitmap == null || !(!bitmap.isRecycled())) {
            return null;
        }
        return bitmap;
    }

    public java.util.List f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return kz5.b0.c(eu2.b0.Bi(this.f338326d) ? new z2.f0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563192c45, "Pause", a(3, context)) : new z2.f0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563193c46, "Play", a(2, context)));
    }

    public java.lang.String g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        eu2.b0 b0Var = this.f338326d;
        int ordinal = b0Var.f338295i.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            throw new jz5.j();
        }
        cw2.wa waVar = b0Var.f338291e;
        if (waVar == null || (c14989xf862ae88 = waVar.f305632f) == null) {
            return null;
        }
        return c14989xf862ae88.getDescription();
    }
}
