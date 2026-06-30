package no4;

/* loaded from: classes5.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a, iv3.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f420303a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 f420304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a f420305c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f420306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f420307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f420308f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f420309g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f420310h;

    public c(android.os.Bundle extra, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f420303a = extra;
        this.f420304b = scene;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a.class.getClassLoader(), new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.AudioCallback");
        }
        this.f420305c = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a) newProxyInstance;
        this.f420309g = jz5.h.b(new no4.b(this));
        this.f420310h = jz5.h.b(new no4.a(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void a() {
        this.f420305c.a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f420305c.b(info);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void c(boolean z17, java.util.List lyricsInfos) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsInfos, "lyricsInfos");
        this.f420305c.c(z17, lyricsInfos);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void d() {
        this.f420305c.d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void e(android.view.View favBtn, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favBtn, "favBtn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        oo4.d dVar = oo4.d.f428730a;
        java.util.Map m17 = kz5.c1.m(dVar.d(this.f420303a), dVar.e("bgm_panel_collect", info));
        cy1.a aVar = (cy1.a) dVar.f();
        aVar.pk(favBtn, "bgm_panel_collect");
        aVar.Tj(favBtn, 40, 1, false);
        aVar.gk(favBtn, m17);
        aVar.Ai(favBtn, new oo4.b(info));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void f(java.lang.String searchWord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchWord, "searchWord");
        this.f420307e = searchWord;
        oo4.d dVar = oo4.d.f428730a;
        java.lang.String str = this.f420308f;
        java.util.Map d17 = dVar.d(this.f420303a);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("search_word", searchWord);
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("search_sessionid", str);
        lVarArr[2] = new jz5.l("bgm_panel_tab", 1000);
        java.util.Map m17 = kz5.c1.m(d17, kz5.c1.k(lVarArr));
        ((cy1.a) dVar.f()).Tj(null, 8, 1, false);
        ((cy1.a) dVar.f()).Hj("bgm_panel_search_song", "search_trigger", m17, 25496);
        ((cy1.a) dVar.f()).Bj("bgm_panel_search_song", "search_trigger", m17, 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void g(boolean z17) {
        u("toggleOrigin", this.f420306d, "remove:" + z17);
        oo4.d dVar = oo4.d.f428730a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f420306d;
        android.os.Bundle bundle = this.f420303a;
        int i17 = !z17 ? 1 : 0;
        bw5.jr reportInfoScene = t();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_acoustic", c16997xb0aa383a);
        e17.put("status", java.lang.Integer.valueOf(i17));
        dVar.j(25496, "bgm_panel_acoustic", bundle, (r17 & 8) != 0 ? kz5.q0.f395534d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(6, java.lang.Integer.valueOf(i17 ^ 1));
        dVar.l(reportInfoScene, c17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void h(java.lang.String searchWord, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchWord, "searchWord");
        oo4.d dVar = oo4.d.f428730a;
        java.lang.String str = this.f420308f;
        java.util.Map d17 = dVar.d(this.f420303a);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("search_word", searchWord);
        lVarArr[1] = new jz5.l("search_bgm_cnt", java.lang.Integer.valueOf(i17));
        lVarArr[2] = new jz5.l("search_time", java.lang.Long.valueOf(j17));
        if (str == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("search_sessionid", str);
        lVarArr[4] = new jz5.l("bgm_panel_tab", 1000);
        java.util.Map m17 = kz5.c1.m(d17, kz5.c1.k(lVarArr));
        ((cy1.a) dVar.f()).Tj(null, 8, 1, false);
        ((cy1.a) dVar.f()).Bj("bgm_panel_search_song", "search_result", m17, 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        oo4.d dVar = oo4.d.f428730a;
        ((cy1.a) dVar.f()).Bj("bgm_panel_remove_collect", z17 ? "view_exp" : "view_clk", kz5.c1.m(kz5.c1.m(dVar.d(this.f420303a), dVar.e("bgm_panel_remove_collect", info)), kz5.b1.e(new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(info.f237252p))))), 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17, long j17) {
        oo4.d dVar = oo4.d.f428730a;
        java.lang.String str = this.f420307e;
        java.lang.String str2 = this.f420308f;
        if (c16997xb0aa383a == null) {
            return;
        }
        if (!kz5.n0.O(oo4.d.f428731b, java.lang.Integer.valueOf(c16997xb0aa383a.f237252p))) {
            str = "";
        }
        java.util.Map m17 = kz5.c1.m(dVar.d(this.f420303a), dVar.e("bgm_panel_song", c16997xb0aa383a));
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(c16997xb0aa383a.f237252p)));
        lVarArr[1] = new jz5.l("bgm_play_time", java.lang.Long.valueOf(j17));
        lVarArr[2] = new jz5.l("search_word", str);
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[3] = new jz5.l("search_sessionid", str2);
        ((cy1.a) dVar.f()).Bj("bgm_panel_song", "bgm_play_end", kz5.c1.m(m17, kz5.c1.k(lVarArr)), 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.lang.String sourceTabID, android.view.View view, boolean z17, boolean z18, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceTabID, "sourceTabID");
        u("onAudioItemViewBehaviorReport", c16997xb0aa383a, null);
        oo4.d dVar = oo4.d.f428730a;
        android.os.Bundle bundle2 = this.f420303a;
        java.lang.String str = this.f420307e;
        java.lang.String str2 = this.f420308f;
        if (c16997xb0aa383a == null) {
            return;
        }
        int i17 = c16997xb0aa383a.f237252p;
        java.lang.String str3 = i17 == 15 || i17 == 16 ? "bgm_panel_soundtrack" : "bgm_panel_song";
        java.util.Map e17 = dVar.e(str3, c16997xb0aa383a);
        e17.put("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(c16997xb0aa383a.f237252p)));
        int i18 = c16997xb0aa383a.f237252p;
        if (i18 == 15 || i18 == 16) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c16997xb0aa383a.f237261y;
            e17.put("soundtrack_feedid", pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
            e17.put("soundtrack_scene", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p == 16 ? 2 : 1));
            e17.put("card_index", java.lang.Integer.valueOf(c16997xb0aa383a.f237259w + 1));
            dVar.j(25496, str3, bundle2, e17, view, z18, z17);
            return;
        }
        e17.put("bgm_panel_tab", java.lang.Integer.valueOf(dVar.a(i18)));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ya.a.f77450x918d59a8, sourceTabID)) {
            if (str == null) {
                str = "";
            }
            e17.put("search_word", str);
            if (str2 == null) {
                str2 = "";
            }
            e17.put("search_sessionid", str2);
        }
        dVar.j(25496, str3, bundle2, e17, view, z18, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void l(android.view.View view) {
        oo4.d.f428730a.j(0, "bgm_panel_search_half_screen", this.f420303a, (r17 & 8) != 0 ? kz5.q0.f395534d : null, (r17 & 16) != 0 ? null : view, (r17 & 32) != 0 ? false : false, (r17 & 64) != 0 ? false : true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        u("onAudioSelected", c16997xb0aa383a, null);
        this.f420306d = c16997xb0aa383a;
        if (c16997xb0aa383a == null) {
            nu3.i iVar = nu3.i.f421751a;
            iVar.f("KEY_MUSIC_ID_STRING");
            iVar.f("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING");
            iVar.f("KEY_SOUND_TRACK_TYPE");
            iVar.f("KEY_MUSIC_SESSION_BUFFER");
        } else {
            nu3.i iVar2 = nu3.i.f421751a;
            iVar2.n("KEY_MUSIC_ID_STRING", c16997xb0aa383a.e());
            r45.pg4 pg4Var = c16997xb0aa383a.A;
            java.lang.String str = pg4Var != null ? pg4Var.f464557m : null;
            if (str == null) {
                str = "";
            }
            iVar2.n("KEY_MUSIC_LIKE_FINDER_FEED_ID_STRING", str);
            iVar2.n("KEY_SOUND_TRACK_TYPE", java.lang.Integer.valueOf(c16997xb0aa383a.f237252p));
            java.lang.String str2 = c16997xb0aa383a.D;
            iVar2.n("KEY_MUSIC_SESSION_BUFFER", str2 != null ? str2 : "");
            int i17 = c16997xb0aa383a.f237252p;
            int i18 = 1;
            if (i17 != 7) {
                if (i17 == 8) {
                    i18 = 2;
                } else if (i17 == 18) {
                    i18 = 3;
                } else if (i17 == 12) {
                    i18 = 4;
                } else if (i17 == 13) {
                    i18 = 5;
                } else {
                    if (i17 != 1 && i17 != 2) {
                        i18 = 0;
                    }
                    i18 = i18 != 0 ? 6 : 0;
                }
            }
            iVar2.n("KEY_MUSIC_TYPE_INT", java.lang.Integer.valueOf(i18));
            pv3.n nVar = pv3.n.f440152a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene = this.f420304b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "subscribeEvent " + scene);
            pv3.n.f440153b.put(scene, this);
            ((nv3.l) ((jz5.n) this.f420310h).mo141623x754a37bb()).b((long) c16997xb0aa383a.f237244e);
        }
        oo4.d.f428730a.g(c16997xb0aa383a, t(), this.f420307e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void n(int i17, int i18, long j17) {
        oo4.d dVar = oo4.d.f428730a;
        ((cy1.a) dVar.f()).Bj("bgm_panel", "bgm_panel_request", kz5.c1.m(dVar.d(this.f420303a), kz5.c1.k(new jz5.l("bgm_cnt", java.lang.Integer.valueOf(i18)), new jz5.l("bgm_request_duration", java.lang.Long.valueOf(j17)), new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(dVar.b(i17))))), 1, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void o() {
        this.f420308f = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public java.lang.String p() {
        return this.f420308f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void q(java.lang.String str) {
        this.f420308f = str;
        oo4.d dVar = oo4.d.f428730a;
        android.os.Bundle bundle = this.f420303a;
        if (str == null) {
            str = "";
        }
        dVar.j(25496, "bgm_panel_search_song", bundle, (r17 & 8) != 0 ? kz5.q0.f395534d : kz5.b1.e(new jz5.l("search_sessionid", str)), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void r(int i17) {
        oo4.d.f428730a.i(i17, this.f420303a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    public void s(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        u("toggleMusic", c16997xb0aa383a, "isSelected:" + z17);
        this.f420306d = c16997xb0aa383a;
        oo4.d dVar = oo4.d.f428730a;
        android.os.Bundle bundle = this.f420303a;
        bw5.jr reportInfoScene = t();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_music", c16997xb0aa383a);
        e17.put("status", java.lang.Integer.valueOf(c16997xb0aa383a != null ? 1 : 0));
        dVar.j(25496, "bgm_panel_music", bundle, (r17 & 8) != 0 ? kz5.q0.f395534d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(4, java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.l(reportInfoScene, c17);
    }

    public final bw5.jr t() {
        return (bw5.jr) ((jz5.n) this.f420309g).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a
    /* renamed from: toggleLyrics */
    public void mo68205x3720c068(boolean z17) {
        u("toggleLyrics", this.f420306d, "isSelected:" + z17);
        oo4.d dVar = oo4.d.f428730a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f420306d;
        android.os.Bundle bundle = this.f420303a;
        bw5.jr reportInfoScene = t();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        java.util.Map e17 = dVar.e("bgm_panel_lyric", c16997xb0aa383a);
        e17.put("status", java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.j(25496, "bgm_panel_lyric", bundle, (r17 & 8) != 0 ? kz5.q0.f395534d : e17, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? false : false);
        r45.ej2 c17 = dVar.c(reportInfoScene);
        c17.set(5, java.lang.Integer.valueOf(z17 ? 1 : 0));
        dVar.l(reportInfoScene, c17);
    }

    public final void u(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.lang.String str2) {
        r45.pg4 pg4Var;
        r45.mh4 mh4Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(str);
        sb6.append("] selected:");
        sb6.append(c16997xb0aa383a != null);
        sb6.append(" reportInfoScene:");
        sb6.append(t());
        sb6.append(" itemType:");
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.I) : null);
        sb6.append(" index:");
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237259w) : null);
        sb6.append(" songId:");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.e() : null);
        sb6.append(" musicId=");
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237244e) : null);
        sb6.append(" listenId:");
        sb6.append(pm0.v.u((c16997xb0aa383a == null || (mh4Var = c16997xb0aa383a.f237243d) == null) ? 0L : mh4Var.f462057w));
        sb6.append(" mjMusicId=");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.C : null);
        sb6.append(" finderFeedId=");
        sb6.append((c16997xb0aa383a == null || (pg4Var = c16997xb0aa383a.A) == null) ? null : pg4Var.f464557m);
        sb6.append(" source=");
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237252p) : null);
        sb6.append(' ');
        if (str2 == null) {
            str2 = null;
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPickerReportCallback", sb6.toString());
    }
}
