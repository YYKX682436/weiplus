package fm3;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a */
    public static final fm3.j0 f345611a = new fm3.j0();

    /* renamed from: b */
    public static int f345612b;

    /* renamed from: c */
    public static r45.bt4 f345613c;

    public final long a(fm3.u musicMv) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        return musicMv.f345675v > 0 ? (musicMv.f345676w + c01.id.c()) - musicMv.f345675v : musicMv.f345676w;
    }

    public final fm3.k0 b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        fm3.f0 f0Var = fm3.f0.f345581a;
        java.util.HashMap hashMap = fm3.f0.f345587g;
        java.util.LinkedList<java.util.Map.Entry> linkedList = new java.util.LinkedList();
        linkedList.addAll(hashMap.entrySet());
        kz5.g0.t(linkedList, fm3.i0.f345609d);
        long j17 = 1;
        long j18 = 1;
        for (java.util.Map.Entry entry : linkedList) {
            if (j17 < ((java.lang.Number) entry.getKey()).intValue()) {
                j17 = ((java.lang.Number) entry.getKey()).intValue();
            }
            if (j18 > ((java.lang.Number) entry.getKey()).intValue()) {
                j18 = ((java.lang.Number) entry.getKey()).intValue();
            }
        }
        return new fm3.k0(j17, j18, ((java.util.Map.Entry) kz5.n0.Z(linkedList)) != null ? ((java.lang.Number) r11.getKey()).intValue() : 0L);
    }

    public final long c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var == null) {
            return 0 / 1000;
        }
        if (bt4Var.f452579q <= 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return (android.os.SystemClock.elapsedRealtime() - bt4Var.f452577o) - bt4Var.f452578p;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - bt4Var.f452579q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "pause music now, pauseTime:" + elapsedRealtime);
        return (android.os.SystemClock.elapsedRealtime() - bt4Var.f452577o) - elapsedRealtime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if ((r1.m76784x5db1b11() != 0) != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r16, r45.hf2 r17, fm3.u r18, int r19, long r20) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.d(android.content.Context, r45.hf2, fm3.u, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0193, code lost:
    
        if (r0 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a6, code lost:
    
        if ((r0.m76784x5db1b11() != 0) != false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Context r17, r45.hf2 r18, fm3.u r19) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.e(android.content.Context, r45.hf2, fm3.u):void");
    }

    public final void f(android.content.Context context, r45.hf2 songInfo, fm3.u musicMv, int i17, int i18, int i19, int i27, int i28, int i29, java.lang.String jumpType, int i37) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpType, "jumpType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvInfo, action:" + i17);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6778xd3fdd5e0 c6778xd3fdd5e0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6778xd3fdd5e0();
        if (bt4Var != null) {
            c6778xd3fdd5e0.f141078d = c6778xd3fdd5e0.b("ContextId", bt4Var.f452570e, true);
            java.lang.String m75945x2fec83072 = songInfo.m75945x2fec8307(0);
            c6778xd3fdd5e0.f141079e = c6778xd3fdd5e0.b("SongName", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", " ", false) : null, true);
            java.lang.String m75945x2fec83073 = songInfo.m75945x2fec8307(5);
            c6778xd3fdd5e0.f141080f = c6778xd3fdd5e0.b("SongId", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", " ", false) : null, true);
            c6778xd3fdd5e0.f141081g = c6778xd3fdd5e0.b("WebUrl", songInfo.m75945x2fec8307(4), true);
            c6778xd3fdd5e0.f141082h = c6778xd3fdd5e0.b("DataUrl", songInfo.m75945x2fec8307(2), true);
            java.lang.String m75945x2fec83074 = songInfo.m75945x2fec8307(1);
            c6778xd3fdd5e0.f141083i = c6778xd3fdd5e0.b("Singer", m75945x2fec83074 != null ? r26.i0.t(m75945x2fec83074, ",", " ", false) : null, true);
            long j17 = i17;
            c6778xd3fdd5e0.f141084j = j17;
            c6778xd3fdd5e0.f141085k = c6778xd3fdd5e0.b("AppId", songInfo.m75945x2fec8307(3), true);
            java.lang.String m75945x2fec83075 = songInfo.m75945x2fec8307(6);
            c6778xd3fdd5e0.f141086l = m75945x2fec83075 == null || m75945x2fec83075.length() == 0 ? 2L : 1L;
            c6778xd3fdd5e0.f141087m = c6778xd3fdd5e0.b("Sect", songInfo.m75945x2fec8307(9), true);
            c6778xd3fdd5e0.f141088n = c6778xd3fdd5e0.b("CoverURL", songInfo.m75945x2fec8307(8), true);
            c6778xd3fdd5e0.f141084j = j17;
            c6778xd3fdd5e0.f141090p = i18;
            c6778xd3fdd5e0.f141091q = i19;
            r45.if2 if2Var = (r45.if2) songInfo.m75936x14adae67(17);
            c6778xd3fdd5e0.f141092r = c6778xd3fdd5e0.b("H5URL", (if2Var == null || (m75945x2fec8307 = if2Var.m75945x2fec8307(0)) == null) ? "" : r26.i0.t(m75945x2fec8307, ",", " ", false), true);
            c6778xd3fdd5e0.f141093s = i27;
            c6778xd3fdd5e0.f141095u = i29;
            c6778xd3fdd5e0.f141094t = i28;
            c6778xd3fdd5e0.f141096v = c6778xd3fdd5e0.b("JumpType", jumpType, true);
            c6778xd3fdd5e0.f141097w = i37;
        }
        c6778xd3fdd5e0.k();
        c6778xd3fdd5e0.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if ((r11.m76784x5db1b11() != 0) != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.content.Context r10, r45.hf2 r11, fm3.u r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.h(android.content.Context, r45.hf2, fm3.u, int, int):void");
    }

    public final void i(android.content.Context context, r45.hf2 songInfo, fm3.u musicMv, int i17, int i18, java.lang.String jumpType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpType, "jumpType");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        f345613c = bt4Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6776x59fbce58 c6776x59fbce58 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6776x59fbce58();
        if (bt4Var != null) {
            c6776x59fbce58.f141032d = c6776x59fbce58.b("ContextId", bt4Var.f452570e, true);
            c6776x59fbce58.f141037i = bt4Var.f452569d;
            c6776x59fbce58.f141038j = c6776x59fbce58.b("FromSourceId", bt4Var.f452572g, true);
            bt4Var.f452580r = 0;
            bt4Var.f452581s = 0;
            bt4Var.f452584v = 0L;
            bt4Var.f452582t = 0;
            bt4Var.f452583u = 2;
            if (bt4Var.f452569d == 18) {
                f345612b = 18;
            }
        }
        if (f345612b == 18 && (context instanceof android.app.Activity)) {
            android.content.Intent intent = ((android.app.Activity) context).getIntent();
            c6776x59fbce58.B = c6776x59fbce58.b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
        }
        java.lang.String m75945x2fec8307 = songInfo.m75945x2fec8307(0);
        c6776x59fbce58.f141033e = c6776x59fbce58.b("SongName", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", " ", false) : null, true);
        c6776x59fbce58.f141036h = c6776x59fbce58.b("AppId", songInfo.m75945x2fec8307(3), true);
        c6776x59fbce58.f141034f = c6776x59fbce58.b("WebUrl", songInfo.m75945x2fec8307(4), true);
        c6776x59fbce58.f141035g = c6776x59fbce58.b("DataUrl", songInfo.m75945x2fec8307(2), true);
        java.lang.String m75945x2fec83072 = songInfo.m75945x2fec8307(6);
        c6776x59fbce58.f141041m = m75945x2fec83072 == null || m75945x2fec83072.length() == 0 ? 2L : 1L;
        java.lang.Long l17 = musicMv.f345656c;
        c6776x59fbce58.f141039k = c6776x59fbce58.b("MvObjectId", pm0.v.u(l17 != null ? l17.longValue() : 0L), true);
        c6776x59fbce58.f141040l = c6776x59fbce58.b("MvNonceId", musicMv.f345657d, true);
        java.lang.String m75945x2fec83073 = songInfo.m75945x2fec8307(5);
        c6776x59fbce58.f141042n = c6776x59fbce58.b("SongId", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", " ", false) : null, true);
        c6776x59fbce58.f141043o = 1L;
        java.lang.String m75945x2fec83074 = songInfo.m75945x2fec8307(1);
        c6776x59fbce58.f141050v = c6776x59fbce58.b("Singer", m75945x2fec83074 != null ? r26.i0.t(m75945x2fec83074, ",", " ", false) : null, true);
        c6776x59fbce58.F = c6776x59fbce58.b("PlaySameSongSessionId", fm3.z.f345706i, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvMainUIEnter struct.contextId:" + c6776x59fbce58.f141032d + ", playSameSongSessionId:" + c6776x59fbce58.F);
        c6776x59fbce58.k();
        c6776x59fbce58.o();
    }

    public final void j(android.content.Context context, r45.ss4 ss4Var, int i17, fm3.q qVar, jk4.a aVar, jk4.b bVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (ss4Var == null || qVar == null || aVar == null || bVar == null) {
            return;
        }
        long j17 = aVar.f381664a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        aVar.f381666c = android.os.SystemClock.elapsedRealtime() - j17;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6781x37bc1cf9 c6781x37bc1cf9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6781x37bc1cf9();
        if (bt4Var != null) {
            c6781x37bc1cf9.f141131e = c6781x37bc1cf9.b("contextId", bt4Var.f452570e, true);
            c6781x37bc1cf9.f141130d = bt4Var.f452569d;
        }
        fm3.o oVar = qVar.f345646n;
        boolean b17 = oVar != null ? oVar.b() : false;
        boolean z18 = qVar.f345647o != null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
        if (c19792x256d2725 == null || (str = java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()).toString()) == null) {
            str = "";
        }
        c6781x37bc1cf9.f141132f = c6781x37bc1cf9.b("mvObjectId", str, true);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
        c6781x37bc1cf9.f141133g = c6781x37bc1cf9.b("mvNonceId", c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null, true);
        c6781x37bc1cf9.f141134h = i17;
        c6781x37bc1cf9.f141135i = z18 ? 2 : 1;
        c6781x37bc1cf9.f141136j = b17 ? 1 : 2;
        c6781x37bc1cf9.f141137k = aVar.f381665b;
        c6781x37bc1cf9.f141138l = aVar.f381667d;
        c6781x37bc1cf9.f141139m = aVar.f381673j;
        c6781x37bc1cf9.f141140n = aVar.f381674k;
        c6781x37bc1cf9.k();
        aVar.f381664a = android.os.SystemClock.elapsedRealtime();
        bVar.f381675a = 0;
        bVar.f381676b = 0L;
        bVar.f381677c = 0;
        bVar.f381678d = 0;
        c6781x37bc1cf9.o();
    }

    public final void k(android.content.Context context, r45.hf2 songInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "reportMvMusicCardAction, action:" + i17);
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 c6773x3bf523d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8();
        if (bt4Var != null) {
            c6773x3bf523d8.f140983d = c6773x3bf523d8.b("ContextId", bt4Var.f452570e, true);
            c6773x3bf523d8.f140990k = bt4Var.f452569d;
            c6773x3bf523d8.f140991l = c6773x3bf523d8.b("FromSourceId", bt4Var.f452572g, true);
        }
        java.lang.String m75945x2fec8307 = songInfo.m75945x2fec8307(0);
        c6773x3bf523d8.f140984e = c6773x3bf523d8.b("SongName", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", " ", false) : null, true);
        java.lang.String m75945x2fec83072 = songInfo.m75945x2fec8307(5);
        c6773x3bf523d8.f140985f = c6773x3bf523d8.b("SongId", m75945x2fec83072 != null ? r26.i0.t(m75945x2fec83072, ",", " ", false) : null, true);
        c6773x3bf523d8.f140986g = c6773x3bf523d8.b("WebUrl", songInfo.m75945x2fec8307(4), true);
        c6773x3bf523d8.f140987h = c6773x3bf523d8.b("DataUrl", songInfo.m75945x2fec8307(2), true);
        java.lang.String m75945x2fec83073 = songInfo.m75945x2fec8307(1);
        c6773x3bf523d8.f140988i = c6773x3bf523d8.b("Singer", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", " ", false) : null, true);
        c6773x3bf523d8.f140992m = c6773x3bf523d8.b("AppId", songInfo.m75945x2fec8307(3), true);
        c6773x3bf523d8.f140989j = i17;
        c6773x3bf523d8.k();
        c6773x3bf523d8.o();
    }

    public final void l(android.content.Context context, fm3.u musicMv, jk4.e eVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        if (eVar == null) {
            return;
        }
        java.util.HashMap hashMap = eVar.f381687e;
        if (hashMap.isEmpty()) {
            return;
        }
        long j17 = eVar.f381684b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        eVar.f381685c = android.os.SystemClock.elapsedRealtime() - j17;
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6782x51f637cf c6782x51f637cf = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6782x51f637cf();
        if (bt4Var != null) {
            c6782x51f637cf.f141142e = c6782x51f637cf.b("contextId", bt4Var.f452570e, true);
            c6782x51f637cf.f141141d = bt4Var.f452569d;
        }
        c6782x51f637cf.f141144g = c6782x51f637cf.b("mvNonceId", musicMv.f345657d, true);
        java.lang.Long l17 = musicMv.f345656c;
        c6782x51f637cf.f141143f = c6782x51f637cf.b("mvObjectId", l17 != null ? l17.toString() : null, true);
        c6782x51f637cf.f141145h = eVar.f381686d;
        c6782x51f637cf.f141147j = eVar.f381685c;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((jk4.a) it.next()).f381667d;
        }
        c6782x51f637cf.f141146i = i17;
        try {
            cl0.g gVar = new cl0.g();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                cl0.g gVar2 = new cl0.g();
                gVar2.p("firstFrame", ((jk4.a) entry.getValue()).f381665b);
                gVar2.p("playTime", ((jk4.a) entry.getValue()).f381666c);
                gVar2.o("waitCount", ((jk4.a) entry.getValue()).f381667d);
                gVar2.o("renderTime", ((jk4.a) entry.getValue()).f381670g);
                if (((jk4.a) entry.getValue()).f381674k != 1000) {
                    gVar2.o("errType", ((jk4.a) entry.getValue()).f381673j);
                    gVar2.o("errCode", ((jk4.a) entry.getValue()).f381674k);
                }
                if (((jk4.a) entry.getValue()).f381671h > 0) {
                    gVar2.o("ptsNegative", ((jk4.a) entry.getValue()).f381671h);
                }
                if (((jk4.a) entry.getValue()).f381672i > 0) {
                    gVar2.o("ptsOutOfBound", ((jk4.a) entry.getValue()).f381672i);
                }
                gVar.h(java.lang.String.valueOf(((java.lang.Number) entry.getKey()).intValue()), gVar2);
            }
            java.lang.String gVar3 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
            str = r26.i0.t(gVar3, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MV.MvReportInfo", e17, "getJson", new java.lang.Object[0]);
            str = "";
        }
        c6782x51f637cf.f141148k = c6782x51f637cf.b("VideoPlayInfo", str, true);
        java.util.Collection values2 = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        java.util.Iterator it6 = values2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            i18 += ((jk4.a) it6.next()).f381674k != 1000 ? 1 : 0;
        }
        c6782x51f637cf.f141149l = i18;
        c6782x51f637cf.k();
        hashMap.clear();
        jk4.b bVar = eVar.f381683a;
        if (bVar != null) {
            bVar.f381675a = 0;
            bVar.f381676b = 0L;
            bVar.f381677c = 0;
            bVar.f381678d = 0;
        }
        c6782x51f637cf.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        if (r9 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        if ((r9.m76784x5db1b11() != 0) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.content.Context r8, r45.hf2 r9, fm3.u r10, int r11, int r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.j0.m(android.content.Context, r45.hf2, fm3.u, int, int, java.lang.String, int):void");
    }
}
