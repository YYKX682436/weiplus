package b92;

@j95.b
/* loaded from: classes10.dex */
public final class u2 extends i95.w implements bg0.v {
    public kp4.a Ai(com.tencent.mm.plugin.vlog.model.l0 track) {
        kotlin.jvm.internal.o.g(track, "track");
        return new kp4.c1((com.tencent.mm.plugin.vlog.model.i1) track);
    }

    public com.tencent.mm.plugin.vlog.model.k0 Bi(java.util.List trackList) {
        kotlin.jvm.internal.o.g(trackList, "trackList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(trackList, 10));
        java.util.Iterator it = trackList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.vlog.model.l0 l0Var = (com.tencent.mm.plugin.vlog.model.l0) it.next();
            kotlin.jvm.internal.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VLogCompositionTrack");
            arrayList.add((com.tencent.mm.plugin.vlog.model.i1) l0Var);
        }
        return new com.tencent.mm.plugin.vlog.model.h1(arrayList);
    }

    public com.tencent.mm.plugin.vlog.model.l0 Di(java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(path, "path");
        return new com.tencent.mm.plugin.vlog.model.i1(path, z17 ? 1 : 2, 0);
    }

    public boolean Ni(boolean z17) {
        boolean fj6;
        ts2.a aVar = ts2.a.f421620a;
        if (com.tencent.mm.ui.bk.A()) {
            return false;
        }
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Maas_RecordTemplateEnable_Int, -1);
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
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
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordTemplateConfig", "enableTemplate:" + fj6);
            if (!fj6 || !com.tencent.mm.sdk.platformtools.z.f193115k) {
                return false;
            }
        }
        return true;
    }

    public boolean Ri(java.lang.String src, java.lang.String dest) {
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(dest, "dest");
        return wo4.a.f448241a.a(src, dest);
    }

    public boolean Ui(boolean z17, long j17) {
        return com.tencent.mm.plugin.vlog.model.v0.f(z17, j17) || com.tencent.mm.plugin.vlog.model.v0.e();
    }

    public java.lang.String Vi() {
        vt3.p pVar;
        java.util.List l17 = us2.u.f430548a.l(9, 0L);
        if (l17 == null || (pVar = (vt3.p) kz5.n0.Z(l17)) == null) {
            return null;
        }
        return pVar.f440021c;
    }

    public rm5.k Zi(r45.mb4 media, int i17, int i18, java.lang.Object obj) {
        rs0.q a17;
        kotlin.jvm.internal.o.g(media, "media");
        r45.h70 h70Var = (r45.h70) media.getCustom(21);
        r45.h70 h70Var2 = (r45.h70) media.getCustom(21);
        if (!(!(h70Var2 != null && h70Var2.f375903m)) && h70Var != null) {
            com.tencent.mm.xeffect.effect.EffectManager effectManager = new com.tencent.mm.xeffect.effect.EffectManager();
            com.tencent.mm.plugin.vlog.model.h1 d17 = com.tencent.mm.plugin.vlog.model.x.d(h70Var, effectManager);
            zv3.c e17 = com.tencent.mm.plugin.vlog.model.x.e(h70Var);
            ((zv3.f) e17).e();
            d17.p(e17);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_hdr_cover_color_correct, 1) == 1) {
                java.util.Iterator it = d17.f175597c.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
                    if (i1Var.f175617b == 2 && (a17 = rs0.r.f399316a.a(i1Var.f175616a)) != null) {
                        d17.b(a17.f399313b, a17.f399314c, a17.f399315d);
                    }
                }
            }
            return new cw2.db(d17.j(), rm5.h.f397489h.b(d17.e()), new cw2.n9(e17, effectManager));
        }
        if (com.tencent.mm.vfs.w6.j(media.getString(0))) {
            return new cw2.s4(media);
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        mn2.g4 g4Var = new mn2.g4(media, com.tencent.mm.plugin.finder.storage.y90.f128367t, "xV10", 0, 0, null, false, null, 248, null);
        dk4.a aVar = new dk4.a(g4Var.n(), g4Var.getPath(), g4Var.getUrl() + '/' + g4Var.i(), (int) media.getFloat(4), (int) media.getFloat(5));
        aVar.f234467d = media.getString(17);
        rw2.k kVar = new rw2.k(aVar);
        kVar.f311071a = i17;
        kVar.f311072b = i18;
        return new rw2.j(kVar, obj instanceof kk4.h ? (kk4.h) obj : null);
    }

    public java.lang.String aj(java.lang.String filePath) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String wi6 = ((rs0.s) ((ss0.e) i95.n0.c(ss0.e.class))).wi(filePath);
        return wi6 == null ? "" : wi6;
    }

    public void bj(java.lang.String str) {
        dw3.c0.f244182a.s(str);
    }

    public void cj(int i17) {
        boolean isWifi;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).ij();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        us2.u.n(i17, isWifi);
    }

    public void fj(int i17, java.lang.String templateID, boolean z17) {
        boolean isWifi;
        kotlin.jvm.internal.o.g(templateID, "templateID");
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).ij();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        boolean z18 = isWifi;
        us2.u uVar = us2.u.f430548a;
        synchronized (us2.u.class) {
            boolean z19 = true;
            if (!(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderEnableMJCameraPreload", 1) == 1)) {
                com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "preloadTemplate >> preload switch is off");
                return;
            }
            if (!((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ni(true) || !py0.b.f358971a.a()) {
                z19 = false;
            }
            if (!z19) {
                com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "preloadTemplate >> template is disabled");
                return;
            }
            com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "preloadTemplate >> start, enterScene=" + i17 + ", templateID=" + templateID + ", autoDownload=" + z18);
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new us2.s(templateID, 9, i17, z18, z17, null), 2, null);
        }
    }

    public rm5.v hj(r45.h70 proto, com.tencent.mm.xeffect.effect.EffectManager effectMgr, zv3.c frame, android.graphics.Rect rect, int i17) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(effectMgr, "effectMgr");
        kotlin.jvm.internal.o.g(frame, "frame");
        com.tencent.mm.plugin.vlog.model.h1 d17 = com.tencent.mm.plugin.vlog.model.x.d(proto, effectMgr);
        d17.p(frame);
        if (rect != null) {
            d17.t(rect);
        }
        if (i17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogComposition", "setFpsUpperLimit:" + i17);
            if (i17 > 0) {
                d17.f175604j = i17;
            }
        }
        return d17.e();
    }

    public com.tencent.mm.plugin.vlog.model.g0 wi(com.tencent.mm.plugin.vlog.model.k0 vlogComposition) {
        kotlin.jvm.internal.o.g(vlogComposition, "vlogComposition");
        return new com.tencent.mm.plugin.vlog.model.p((com.tencent.mm.plugin.vlog.model.h1) vlogComposition);
    }
}
