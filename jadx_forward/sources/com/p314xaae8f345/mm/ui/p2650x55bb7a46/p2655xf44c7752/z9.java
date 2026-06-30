package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class z9 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public int f283149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 f283150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja f283151f;

    public z9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar) {
        this.f283150e = k1Var;
        this.f283151f = jaVar;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f283150e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var.v();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = v17.f282971p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
        pk4.d dVar = (pk4.d) f4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onSeekTo(" + i17 + ')');
        v17.d();
        v17.f282970o.setVisibility(8);
        boolean e17 = dVar.e();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f283151f;
        if (e17) {
            dVar.m158660x87223eb7(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.y9(jaVar, v17));
            dVar.a(i17 * 1000, true);
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = k1Var.w();
            if (w17 != null && w17.m78014x7b98c171()) {
                t21.d3.w(w17.z0(), i17 * 1000, dVar.getIsOnlineVideo());
            }
            int I7 = viewOnClickListenerC21748xb3d38e6b.I7();
            k1Var.f282631p.A(k1Var.y(I7), I7);
        }
        viewOnClickListenerC21748xb3d38e6b.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w18 = k1Var.w();
        if (w18 != null && w18.M2()) {
            viewOnClickListenerC21748xb3d38e6b.f282209y.c(w18, 13);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            jaVar.A = i17 * 1000;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("playeridentifier", java.lang.Long.valueOf(yd5.p.f542660q));
            lVarArr[1] = new jz5.l("chat_username", viewOnClickListenerC21748xb3d38e6b.f282132d);
            lVarArr[2] = new jz5.l("msgid", java.lang.Long.valueOf(viewOnClickListenerC21748xb3d38e6b.Q1));
            lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(viewOnClickListenerC21748xb3d38e6b.f282132d) ? 2 : 1));
            lVarArr[4] = new jz5.l("report_scene", java.lang.Integer.valueOf(yd5.p.f542661r));
            lVarArr[5] = new jz5.l("drag_process_type", java.lang.Integer.valueOf(this.f283149d));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("video_drag_process", kz5.c1.k(lVarArr), 31762);
        }
        viewOnClickListenerC21748xb3d38e6b.a9(true, viewOnClickListenerC21748xb3d38e6b.I7());
    }

    @Override // m34.e
    public void b() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f283151f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f283150e;
        if (z17) {
            this.f283149d = k1Var.f282625g.x8() ? 1 : 2;
            if (k1Var.v() != null) {
                jaVar.B += java.lang.Math.abs(r0.f282971p.mo69307x9746038c() - jaVar.A);
                jaVar.A = r0.f282971p.mo69307x9746038c();
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var.v();
            if (v17 != null) {
                v17.d();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465) v17.f282971p).mo69313x65825f6();
                jaVar.L(v17, false);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = jaVar.f282607o;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g;
        viewOnClickListenerC21748xb3d38e6b.a9(false, viewOnClickListenerC21748xb3d38e6b.I7());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onSeekPre");
    }

    @Override // m34.e
    public void d(int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = this.f283150e;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var.v();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = v17.f282971p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            pk4.d dVar = (pk4.d) f4Var;
            v17.f282970o.setVisibility(8);
            dVar.a(i17 * 1000, false);
            k1Var.f282625g.o9(false);
            k1Var.f282625g.t9();
            if (dVar.m158654xc00617a4()) {
                dVar.m158656x65825f6();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = this.f283151f;
                jaVar.L(v17, false);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = jaVar.f282607o;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
            }
        }
    }
}
