package b92;

@j95.b
/* loaded from: classes10.dex */
public final class u2 extends i95.w implements bg0.v {
    public kp4.a Ai(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 track) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        return new kp4.c1((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) track);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 Bi(java.util.List trackList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(trackList, 10));
        java.util.Iterator it = trackList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VLogCompositionTrack");
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) l0Var);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(arrayList);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 Di(java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(path, z17 ? 1 : 2, 0);
    }

    public boolean Ni(boolean z17) {
        boolean fj6;
        ts2.a aVar = ts2.a.f503153a;
        if (com.p314xaae8f345.mm.ui.bk.A()) {
            return false;
        }
        java.lang.Object b17 = bm5.o1.f104252a.b(bm5.h0.RepairerConfig_Maas_RecordTemplateEnable_Int, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            return false;
        }
        if (intValue != 1) {
            if (z17) {
                fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).sj(e42.c0.clicfg_finder_improve_record_entrance_p2, false);
            } else {
                fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_finder_improve_record_entrance_p2, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordTemplateConfig", "enableTemplate:" + fj6);
            if (!fj6 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
                return false;
            }
        }
        return true;
    }

    public boolean Ri(java.lang.String src, java.lang.String dest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        return wo4.a.f529774a.a(src, dest);
    }

    public boolean Ui(boolean z17, long j17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.f(z17, j17) || com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.e();
    }

    public java.lang.String Vi() {
        vt3.p pVar;
        java.util.List l17 = us2.u.f512081a.l(9, 0L);
        if (l17 == null || (pVar = (vt3.p) kz5.n0.Z(l17)) == null) {
            return null;
        }
        return pVar.f521554c;
    }

    public rm5.k Zi(r45.mb4 media, int i17, int i18, java.lang.Object obj) {
        rs0.q a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        r45.h70 h70Var = (r45.h70) media.m75936x14adae67(21);
        r45.h70 h70Var2 = (r45.h70) media.m75936x14adae67(21);
        if (!(!(h70Var2 != null && h70Var2.f457436m)) && h70Var != null) {
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.d(h70Var, c22979xbb268bc);
            zv3.c e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.e(h70Var);
            ((zv3.f) e17).e();
            d17.p(e17);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
                java.util.Iterator it = d17.f257130c.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
                    if (i1Var.f257150b == 2 && (a17 = rs0.r.f480849a.a(i1Var.f257149a)) != null) {
                        d17.b(a17.f480846b, a17.f480847c, a17.f480848d);
                    }
                }
            }
            return new cw2.db(d17.j(), rm5.h.f479022h.b(d17.e()), new cw2.n9(e17, c22979xbb268bc));
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(media.m75945x2fec8307(0))) {
            return new cw2.s4(media);
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mn2.g4 g4Var = new mn2.g4(media, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209900t, "xV10", 0, 0, null, false, null, 248, null);
        dk4.a aVar = new dk4.a(g4Var.n(), g4Var.mo148083xfb83cc9b(), g4Var.mo148084xb5887639() + '/' + g4Var.i(), (int) media.m75938x746dc8a6(4), (int) media.m75938x746dc8a6(5));
        aVar.f316000d = media.m75945x2fec8307(17);
        rw2.k kVar = new rw2.k(aVar);
        kVar.f392604a = i17;
        kVar.f392605b = i18;
        return new rw2.j(kVar, obj instanceof kk4.h ? (kk4.h) obj : null);
    }

    public java.lang.String aj(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.String wi6 = ((rs0.s) ((ss0.e) i95.n0.c(ss0.e.class))).wi(filePath);
        return wi6 == null ? "" : wi6;
    }

    public void bj(java.lang.String str) {
        dw3.c0.f325715a.s(str);
    }

    public void cj(int i17) {
        boolean m40092xb9aa8b5f;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).ij();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        us2.u.n(i17, m40092xb9aa8b5f);
    }

    public void fj(int i17, java.lang.String templateID, boolean z17) {
        boolean m40092xb9aa8b5f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateID, "templateID");
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).ij();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!r75.d.f474792f) {
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context);
        } else if (r75.d.f474790d == -100) {
            int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
            r75.d.f474790d = m40067xab9ed241;
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(m40067xab9ed241);
        } else {
            ((ku5.t0) ku5.t0.f394148d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            m40092xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40092xb9aa8b5f(r75.d.f474790d);
        }
        boolean z18 = m40092xb9aa8b5f;
        us2.u uVar = us2.u.f512081a;
        synchronized (us2.u.class) {
            boolean z19 = true;
            if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderEnableMJCameraPreload", 1) == 1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "preloadTemplate >> preload switch is off");
                return;
            }
            if (!((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true) || !py0.b.f440504a.a()) {
                z19 = false;
            }
            if (!z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "preloadTemplate >> template is disabled");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "preloadTemplate >> start, enterScene=" + i17 + ", templateID=" + templateID + ", autoDownload=" + z18);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new us2.s(templateID, 9, i17, z18, z17, null), 2, null);
        }
    }

    public rm5.v hj(r45.h70 proto, com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc effectMgr, zv3.c frame, android.graphics.Rect rect, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectMgr, "effectMgr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.d(proto, effectMgr);
        d17.p(frame);
        if (rect != null) {
            d17.t(rect);
        }
        if (i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i17);
            if (i17 > 0) {
                d17.f257137j = i17;
            }
        }
        return d17.e();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g0 wi(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 vlogComposition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vlogComposition, "vlogComposition");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1) vlogComposition);
    }
}
