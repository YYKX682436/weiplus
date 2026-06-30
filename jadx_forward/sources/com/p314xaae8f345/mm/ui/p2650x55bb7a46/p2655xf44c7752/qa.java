package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class qa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa f282834d;

    public qa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa saVar) {
        this.f282834d = saVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        java.util.HashMap hashMap3;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        java.util.HashMap hashMap6;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sa saVar = this.f282834d;
        boolean z17 = true;
        saVar.f282904d.f282957b.f282625g.g9(true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = saVar.f282904d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = taVar.f282957b;
        int i17 = taVar.f282958c;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja) k1Var.f282631p).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "removePlayingCache");
        saVar.f282904d.f282957b.f282625g.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja jaVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja) saVar.f282904d.f282957b.f282631p;
        jaVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "onVideoCompletion");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = jaVar.f282419d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = k1Var2 != null ? k1Var2.v() : null;
        if (v17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = v17.f282971p;
        pk4.d dVar = f4Var instanceof pk4.d ? (pk4.d) f4Var : null;
        if (dVar == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var2 = v17.f282971p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            float f17 = ((pk4.d) f4Var2).getF();
            long mo69286x51e8b0a = v17.f282971p.mo69286x51e8b0a() - jaVar.A;
            jaVar.B += mo69286x51e8b0a;
            yd5.p pVar = jaVar.C;
            java.util.ArrayList arrayList = (pVar == null || (hashMap6 = pVar.f542672k) == null) ? null : (java.util.ArrayList) hashMap6.get(java.lang.Float.valueOf(f17));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(java.lang.Long.valueOf(mo69286x51e8b0a));
            yd5.p pVar2 = jaVar.C;
            if (pVar2 != null && (hashMap5 = pVar2.f542672k) != null) {
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - jaVar.f282617y;
            jaVar.f282618z += currentTimeMillis;
            yd5.p pVar3 = jaVar.C;
            java.util.ArrayList arrayList2 = (pVar3 == null || (hashMap4 = pVar3.f542673l) == null) ? null : (java.util.ArrayList) hashMap4.get(java.lang.Float.valueOf(f17));
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
            }
            arrayList2.add(java.lang.Long.valueOf(currentTimeMillis));
            yd5.p pVar4 = jaVar.C;
            if (pVar4 != null && (hashMap3 = pVar4.f542673l) != null) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            yd5.p pVar5 = jaVar.C;
            if (pVar5 != null && (hashMap2 = pVar5.f542672k) != null) {
                for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                    java.util.Iterator it = ((java.lang.Iterable) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        long longValue = ((java.lang.Number) it.next()).longValue();
                        if (sb6.length() > 0) {
                            sb6.append("#");
                        }
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(((java.lang.Number) entry.getKey()).floatValue());
                        sb7.append('|');
                        sb7.append(longValue);
                        sb6.append(sb7.toString());
                    }
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            yd5.p pVar6 = jaVar.C;
            if (pVar6 != null && (hashMap = pVar6.f542673l) != null) {
                for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
                    java.util.Iterator it6 = ((java.lang.Iterable) entry2.getValue()).iterator();
                    while (it6.hasNext()) {
                        long longValue2 = ((java.lang.Number) it6.next()).longValue();
                        if (sb8.length() > 0 ? z17 : false) {
                            sb8.append("#");
                        }
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                        sb9.append(((java.lang.Number) entry2.getKey()).floatValue());
                        sb9.append('|');
                        sb9.append(longValue2);
                        sb8.append(sb9.toString());
                        z17 = true;
                    }
                }
            }
            yd5.p pVar7 = jaVar.C;
            if (pVar7 != null) {
                pVar7.f542674m = jaVar.f282618z;
            }
            if (pVar7 != null) {
                pVar7.f542675n = jaVar.B;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var3 = jaVar.f282419d;
            if (k1Var3 == null || (viewOnClickListenerC21748xb3d38e6b = k1Var3.f282625g) == null) {
                viewOnClickListenerC21748xb3d38e6b = null;
            }
            jz5.l[] lVarArr = new jz5.l[11];
            lVarArr[0] = new jz5.l("playeridentifier", java.lang.Long.valueOf(yd5.p.f542660q));
            yd5.p pVar8 = jaVar.C;
            lVarArr[1] = new jz5.l("chat_username", pVar8 != null ? pVar8.f542669h : null);
            lVarArr[2] = new jz5.l("msgid", pVar8 != null ? java.lang.Long.valueOf(pVar8.f542671j) : null);
            yd5.p pVar9 = jaVar.C;
            lVarArr[3] = new jz5.l("chat_type", pVar9 != null ? java.lang.Integer.valueOf(pVar9.f542670i) : null);
            lVarArr[4] = new jz5.l("report_scene", java.lang.Integer.valueOf(yd5.p.f542661r));
            lVarArr[5] = new jz5.l("video_stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - (viewOnClickListenerC21748xb3d38e6b != null ? viewOnClickListenerC21748xb3d38e6b.P1 : 0L)));
            lVarArr[6] = new jz5.l("speed_paly_process_list", sb6.toString());
            lVarArr[7] = new jz5.l("speed_paly_real_list", sb8.toString());
            yd5.p pVar10 = jaVar.C;
            lVarArr[8] = new jz5.l("play_real_time_ms", pVar10 != null ? java.lang.Long.valueOf(pVar10.f542674m) : null);
            yd5.p pVar11 = jaVar.C;
            lVarArr[9] = new jz5.l("play_process_time_ms", pVar11 != null ? java.lang.Long.valueOf(pVar11.f542675n) : null);
            yd5.p pVar12 = jaVar.C;
            lVarArr[10] = new jz5.l("video_time_ms", pVar12 != null ? java.lang.Long.valueOf(pVar12.f542676o) : null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("video_end_play", kz5.c1.k(lVarArr), 31762);
            jaVar.C = null;
            yd5.p.f542660q = java.lang.System.currentTimeMillis();
            jaVar.f282419d.f282625g.o9(false);
            z17 = true;
        }
        jaVar.L(v17, z17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b2 = jaVar.f282419d.f282625g;
        viewOnClickListenerC21748xb3d38e6b2.U7();
        viewOnClickListenerC21748xb3d38e6b2.L1.a(0);
        v17.g(false, 0.0f);
        t21.d3.w(jaVar.f282612t, 0, dVar.getIsOnlineVideo());
        dVar.m158666x360802();
        jaVar.R(false);
    }
}
