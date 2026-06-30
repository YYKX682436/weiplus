package ll2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ll2.e f400666a = new ll2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f400667b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f400668c = kz5.c0.i("startlive.more", "startlive.more.video", "startlive.more.silent", "startlive.more.fansgroup", "startlive.more.anchorwish", "startlive.more.anchorwish.interactionwish", "startlive.more.heatup", "startlive.more.grow", "startlive.more.commentmanage", "startlive.more.commentmanage.comment", "startlive.more.commentmanage.sensitivity", "startlive.more.commentmanage.assistant", "startlive.more.commentmanage.quickreply", "startlive.more.morefunction", "startlive.more.morefunction.mictalking", "startlive.more.morefunction.connectmic", "startlive.more.morefunction.gift", "startlive.more.morefunction.like", "startlive.more.morefunction.hidenick", "startlive.more.recommend", "startlive.more.help", "startlive.bottom.videosetting", "startlive.bottom.videosetting.beauty", "startlive.bottom.videosetting.makeup", "startlive.bottom.videosetting.filter", "startlive.bottom.videosetting.gesture", "startlive.bottom.videosetting.mirror", "startlive.bottom.videosetting.switchcam", "startlive.bottom.audiosetting", "startlive.bottom.audiosetting.background", "startlive.bottom.music", "startlive.bottom.music.bgmusic", "startlive.bottom.music.song", "startlive.more.newmusic", "startlive.more.newmusic.song", "startlive.bottom.link", "startlive.bottom.shopping", "startlive.bottom.lottery", "startlive.mode.audio", "startlive.mode.audio.ktv", "anchorlive.more", "anchorlive.more.sharefriend", "anchorlive.more.sharemoments", "anchorlive.more.shareqrcode", "anchorlive.more.silent", "anchorlive.more.fansgroup", "anchorlive.more.anchorwish", "anchorlive.more.anchorwish.interactionwish", "anchorlive.more.heatup", "anchorlive.more.grow", "anchorlive.more.commentmanage", "anchorlive.more.commentmanage.comment", "anchorlive.more.commentmanage.sensitivity", "anchorlive.more.commentmanage.assistant", "anchorlive.more.commentmanage.quickreply", "anchorlive.more.commentmanage.askproduction", "anchorlive.more.morefunction", "anchorlive.more.morefunction.mictalking", "anchorlive.more.morefunction.connectmic", "anchorlive.more.morefunction.gift", "anchorlive.more.morefunction.like", "anchorlive.more.morefunction.hidenick", "anchorlive.more.morefunction.recommend", "anchorlive.more.help", "anchorlive.more.handoff", "anchorlive.more.minimize", "anchorlive.more.pauselive", "anchorlive.more.edittitle", "anchorlive.more.extendtrylivetime", "anchorlive.bottom.videosetting", "anchorlive.bottom.videosetting.beauty", "anchorlive.bottom.videosetting.makeup", "anchorlive.bottom.videosetting.filter", "anchorlive.bottom.videosetting.gesture", "anchorlive.bottom.videosetting.mirror", "anchorlive.bottom.videosetting.switchcam", "anchorlive.bottom.audiosetting", "anchorlive.bottom.audiosetting.background", "anchorlive.bottom.music", "anchorlive.bottom.music.bgmusic", "anchorlive.bottom.music.song", "anchorlive.bottom.newmusic", "anchorlive.bottom.newmusic.song", "anchorlive.bottom.tools", "anchorlive.bottom.tools.screenshare", "anchorlive.bottom.tools.vote", "anchorlive.bottom.tools.link", "anchorlive.bottom.shopping", "anchorlive.bottom.game", "anchorlive.bottom.multiangle", "anchorlive.bottom.connectmic", "anchorlive.bottom.lottery", "anchorlive.bottom.lottery.lottery", "anchorlive.bottom.lottery.redpacket", "assistant.more", "assistant.more.commentmanage", "assistant.more.commentmanage.comment", "assistant.more.commentmanage.sensitivity", "assistant.more.commentmanage.quickreply", "assistant.more.commentmanage.quickreply.edittitle", "assistant.more.morefunction", "assistant.more.morefunction.gift", "assistant.more.morefunction.like", "assistant.more.morefunction.hidenick", "assistant.more.morefunction.edittitle", "audience.more.morefunction", "audience.more.morefunction.minimize", "audience.more.morefunction.gifteffect", "audience.more.morefunction.rewardlimit", "audience.more.morefunction.rewardlimitamount", "anchor_live_skin_seg");

    public static void b(ll2.e eVar, java.lang.String path, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.vs2 f17 = eVar.f(path);
        java.lang.String str = f17 != null ? f17.f470033u : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "dispose " + path + " with group id " + str + ", fromExpose = " + z17);
        if (!z17 && z18) {
            eVar.m(path, 2);
        }
        if (str == null || str.length() == 0) {
            nk6.N(path);
        } else {
            nk6.g(str);
        }
    }

    public static /* synthetic */ void d(ll2.e eVar, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = true;
        }
        eVar.c(str, z17, z18);
    }

    public static void l(ll2.e eVar, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String path, android.view.View view, android.view.View view2, android.widget.TextView textView, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            view2 = null;
        }
        if ((i17 & 16) != 0) {
            textView = null;
        }
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (view == null) {
            return;
        }
        eVar.k(yVar, path, new ll2.c(view2, textView, view));
    }

    public final boolean a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
        if (I0 == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reddot ");
        sb6.append(path);
        sb6.append(" expose time = ");
        r45.q40 q40Var = I0.f455430q;
        sb6.append(q40Var != null ? java.lang.Integer.valueOf(q40Var.f465189d) : null);
        sb6.append(" limit = ");
        sb6.append(I0.f455433t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", sb6.toString());
        int i17 = I0.f455433t;
        if (i17 <= 0) {
            return false;
        }
        r45.q40 q40Var2 = I0.f455430q;
        return i17 <= (q40Var2 != null ? q40Var2.f465189d : 0);
    }

    public final void c(java.lang.String path, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.vs2 f17 = f(path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "disposeRedDotByPathWithGroupId " + path + " with group id " + (f17 != null ? f17.f470033u : null) + ", fromExpose = " + z17);
        if (!z17 && z18) {
            m(path, 2);
        }
        nk6.N(path);
    }

    public final void e(java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (a(path)) {
            if (z17) {
                d(this, path, true, false, 4, null);
            } else {
                b(this, path, true, false, 4, null);
            }
        }
    }

    public final r45.vs2 f(java.lang.String str) {
        java.lang.Object obj;
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.Iterator it = zy2.fa.O0(nk6, str, xy2.c.e(context), false, false, 12, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.util.LinkedList<r45.f03> show_infos = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj).f65874xb5f7102a.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            boolean z17 = false;
            for (r45.f03 f03Var : show_infos) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var.f455425i, str) && f03Var.f455424h == 1) {
                    z17 = true;
                }
            }
            if (z17) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
        if (jbVar != null) {
            return jbVar.f65874xb5f7102a;
        }
        return null;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 g(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f400667b;
        java.lang.Object obj = linkedHashMap.get(path);
        if (obj == null) {
            obj = new p012xc85e97e9.p093xedfae76a.j0();
            linkedHashMap.put(path, obj);
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final boolean h(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) g(path).mo3195x754a37bb();
        return aVar != null && aVar.f186860a;
    }

    public final void i(int i17, java.util.List showInfos, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfos, "showInfos");
        r45.vs2 vs2Var = new r45.vs2();
        vs2Var.f470023h = java.lang.String.valueOf(c01.id.c());
        vs2Var.f470020e = i17;
        vs2Var.f470033u = str;
        java.util.Iterator it = showInfos.iterator();
        while (it.hasNext()) {
            vs2Var.f470022g.add((r45.f03) it.next());
        }
        zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "insert reddot, type = " + i17, null, true, null, 20, null);
    }

    public final void j(java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() == 0) {
            return;
        }
        m(path, 1);
        e(path, z17);
        r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0(path);
        if (I0 != null && I0.f455433t > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "reddot path " + I0.f455425i + " exposed, exposeCount = " + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().U0(path));
        }
    }

    public final void k(p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String path, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (yVar == null) {
            return;
        }
        o(yVar, path, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "register reddot ".concat(path));
        pm0.v.y(g(path), yVar, new ll2.d(callback));
    }

    public final void m(java.lang.String str, int i17) {
        java.lang.String str2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("task_red", str);
        r45.vs2 f17 = f400666a.f(str);
        if (f17 != null && (str2 = f17.f470023h) != null) {
            jSONObject.put("task_id", str2);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f555483a.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.E1, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c18;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 38L, jSONObject2, null, 4, null);
        }
    }

    public final java.lang.String n(java.lang.String currUI, java.lang.String path, int i17, java.lang.String lastTids) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currUI, "currUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastTids, "lastTids");
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        r45.f03 I0 = nk6.I0(path);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = nk6.L0(path);
        str = "";
        if (I0 != null && L0 != null) {
            ll2.a aVar = ll2.a.f400657e;
            if (i17 == 1) {
                java.lang.String str2 = L0.f65874xb5f7102a.f470023h;
                str = str2 != null ? str2 : "";
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lastTids, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "[checkLivePersonCenterRedDotReport] repeat report tipsId = ".concat(str));
                    return str;
                }
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ri(currUI, L0, I0, i17, "", 0, 0, 0);
        }
        return str;
    }

    public final void o(p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String path, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (yVar != null) {
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "unregister reddot ".concat(path));
            }
            f400666a.g(path).m7809x1ff8439(yVar);
        }
    }
}
