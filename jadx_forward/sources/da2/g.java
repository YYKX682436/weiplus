package da2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public r45.hj2 f309282a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f309283b;

    /* renamed from: c, reason: collision with root package name */
    public long f309284c;

    /* renamed from: d, reason: collision with root package name */
    public final kk4.g0 f309285d;

    /* renamed from: e, reason: collision with root package name */
    public final qd2.g f309286e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f309287f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f309288g;

    /* renamed from: h, reason: collision with root package name */
    public kk4.b f309289h;

    /* renamed from: i, reason: collision with root package name */
    public zy2.g5 f309290i;

    public g(r45.hj2 hj2Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, long j17, kk4.g0 g0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 4) != 0 ? 0L : j17;
        g0Var = (i17 & 8) != 0 ? null : g0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f309282a = hj2Var;
        this.f309283b = activity;
        this.f309284c = j17;
        this.f309285d = g0Var;
        this.f309287f = "";
        this.f309286e = new qd2.g(activity, c(), new da2.b(this));
    }

    public static boolean l(da2.g gVar, r45.zi2 zi2Var, long j17, java.lang.String str, int i17, long j18, int i18, boolean z17, android.content.Intent intent, int i19, java.lang.Object obj) {
        r45.r23 r23Var;
        android.content.Intent intent2 = (i19 & 128) != 0 ? null : intent;
        gVar.getClass();
        r45.rz6 rz6Var = (zi2Var == null || (r23Var = (r45.r23) zi2Var.m75936x14adae67(17)) == null) ? null : (r45.rz6) r23Var.m75936x14adae67(1);
        if (rz6Var == null) {
            return false;
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f465118d = rz6Var.f466853d;
        q23Var.f465119e = rz6Var.f466854e;
        q23Var.f465120f = rz6Var.f466855f;
        q23Var.f465127p = j17;
        q23Var.f465124m = str;
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        android.content.Intent intent3 = intent2;
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "handleClickPost: case2 post by feed music id " + str);
            intent3.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", str);
        }
        intent3.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var.mo14344x5f01b1f6());
        intent3.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", zi2Var.m75945x2fec8307(12));
        intent3.putExtra("KEY_ORIGIN_MUSIC_PLAY_DURATION", gVar.e(zi2Var));
        intent3.putExtra("key_ref_feed_id", gVar.f());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = gVar.c();
        intent3.putExtra("key_ref_feed_dup_flag", c17 != null ? c17.m59229xb5af1dd5() : null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = gVar.f309283b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        intent3.putExtra("key_ref_comment_scene", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
        intent3.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
        if (!z17) {
            intent3.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j18 != 0 ? j18 : gVar.f()));
        jSONObject.put("source_songid", zi2Var.m75945x2fec8307(12));
        java.lang.String str2 = gVar.f309288g;
        if (str2 != null) {
            jSONObject.put("source_audioid", str2);
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Di(gVar.f309283b, q23Var, gVar.f(), i17, intent3, jSONObject, i18, false);
        return true;
    }

    public final java.lang.String a(long j17) {
        java.lang.String m75945x2fec8307;
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = c17 != null ? cu2.u.f303974a.p(c17) : null;
            j17 = p17 != null ? p17.mo2128x1ed62e84() : 0L;
        }
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "checkFeedMusicId: id is zero");
            return null;
        }
        r45.hj2 hj2Var = this.f309282a;
        if (hj2Var == null || (m75945x2fec8307 = hj2Var.m75945x2fec8307(10)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicTopicPostHandler", "checkFeedMusicId: prefix is null");
            return null;
        }
        java.lang.String str = m75945x2fec8307 + ((java.lang.Object) jz5.x.a(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "checkFeedMusicId: " + str);
        return str;
    }

    public final android.content.Intent b(int i17, r45.zi2 zi2Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.Object m143895xf1229813;
        java.lang.String m76317x2a881cd1;
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1001) {
            intent.putExtra("key_finder_post_router", 2);
            intent.putExtra("key_maas_entrance", 7);
        } else {
            intent.putExtra("key_finder_post_router", 3);
        }
        java.lang.String a17 = this.f309286e.a();
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", a17);
        java.lang.String str3 = "";
        if (zi2Var == null || (str2 = zi2Var.m75945x2fec8307(5)) == null) {
            str2 = "";
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", str2);
        r45.hj2 hj2Var = this.f309282a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = c();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f309283b;
        java.lang.String c18 = hc2.m0.c(hj2Var, activity, c17);
        java.lang.String a18 = hc2.m0.a(this.f309282a, activity);
        int e17 = e(zi2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c19 = c();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19 != null ? c19.m59299x6bf53a6c() : null, xy2.c.e(activity));
        intent.putExtra("key_finder_post_from", 18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null && (m76317x2a881cd1 = c19783xd9a946b7.m76317x2a881cd1()) != null) {
            str3 = m76317x2a881cd1;
        }
        intent.putExtra("key_finder_post_id", str3);
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "innerPost: case3 post by feed music id " + str);
            intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", str);
        }
        if (a17.length() > 0) {
            java.lang.String m75945x2fec8307 = zi2Var != null ? zi2Var.m75945x2fec8307(5) : null;
            if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && zi2Var != null) {
                zi2Var.set(5, a17);
            }
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var != null ? zi2Var.mo14344x5f01b1f6() : null));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        if (((android.content.Intent) m143895xf1229813) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicTopicPostHandler", "innerPost: to pb error");
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", zi2Var != null ? zi2Var.m75945x2fec8307(12) : null);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", c18);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL", a18);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", e17);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_AUTHOR", this.f309287f);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", b17);
        intent.putExtra("key_maas_entrance", 7);
        intent.putExtra("key_ref_feed_id", f());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c27 = c();
        intent.putExtra("key_ref_feed_dup_flag", c27 != null ? c27.m59229xb5af1dd5() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        intent.putExtra("key_ref_comment_scene", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
        intent.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
        return intent;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c() {
        return bu2.j.f106067a.h(f());
    }

    public final r45.zi2 d() {
        r45.hj2 hj2Var = this.f309282a;
        r45.zi2 zi2Var = hj2Var != null ? (r45.zi2) hj2Var.m75936x14adae67(3) : null;
        java.lang.String m75945x2fec8307 = zi2Var != null ? zi2Var.m75945x2fec8307(12) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && zi2Var != null) {
            zi2Var.set(0, zi2Var.m75945x2fec8307(12));
        }
        return zi2Var;
    }

    public final int e(r45.zi2 zi2Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = c();
        int b17 = (c17 == null || (feedObject = c17.getFeedObject()) == null) ? 0 : (int) bu2.z.b(feedObject);
        if (b17 > 0) {
            return b17;
        }
        if (zi2Var != null) {
            return zi2Var.m75939xb282bd08(9);
        }
        return 0;
    }

    public final long f() {
        if (this.f309284c == 0) {
            this.f309284c = hc2.m0.b(this.f309283b);
        }
        return this.f309284c;
    }

    public final void g(java.lang.String source, android.content.Context targetContext, int i17, long j17, long j18) {
        int i18;
        int i19;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        int i28;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String m75945x2fec8307;
        java.lang.String str4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetContext, "targetContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "handleClickPost: source=" + source + ", enterScene=" + i17 + ", feedId=" + pm0.v.u(f()) + " targetFeedId=" + pm0.v.u(j17) + ", targetContext=" + targetContext);
        r45.zi2 d17 = d();
        java.lang.String a17 = a(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handlePost] name:");
        sb6.append(d17 != null ? d17.m75945x2fec8307(2) : null);
        sb6.append(" docId:");
        sb6.append(d17 != null ? d17.m75945x2fec8307(0) : null);
        sb6.append(" song_id:");
        sb6.append(d17 != null ? d17.m75945x2fec8307(12) : null);
        sb6.append(" mediaStreamingUrl:");
        sb6.append(d17 != null ? d17.m75945x2fec8307(5) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f309283b;
        p2Var.W(p2Var.i(context, i17, false));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(gm0.j1.b().j());
        sb7.append('_');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb7.append(java.lang.System.currentTimeMillis());
        java.lang.String sb8 = sb7.toString();
        p2Var.T(sb8, null);
        p2Var.R(sb8);
        int hashCode = source.hashCode();
        if (hashCode == -324092691) {
            if (source.equals("HeaderPost")) {
                i18 = 3401;
                i19 = i18;
            }
            i19 = 0;
        } else if (hashCode != 148559304) {
            if (hashCode == 343709003 && source.equals("EffectTemplate")) {
                i18 = 3403;
                i19 = i18;
            }
            i19 = 0;
        } else {
            if (source.equals("BottomBar")) {
                i18 = 3402;
                i19 = i18;
            }
            i19 = 0;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b72 != null) {
            c19783xd9a946b72.m76361x1e8b320e(i19);
        }
        long f17 = f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c17 = c();
        if (c17 != null) {
            str = sb8;
            abstractC14490x69736cb5 = cu2.u.f303974a.p(c17);
        } else {
            str = sb8;
            abstractC14490x69736cb5 = null;
        }
        java.lang.String w17 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            i27 = i19;
            nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        } else {
            i27 = i19;
            nyVar = null;
        }
        p2Var.U(f17, w17, nyVar != null ? nyVar.f216913n : 0);
        java.lang.String m75945x2fec83072 = d17 != null ? d17.m75945x2fec8307(12) : null;
        if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) && (c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b) != null) {
            c19783xd9a946b7.m76435x22d96412(m75945x2fec83072);
        }
        android.content.Intent intent = context.getIntent();
        int intExtra = intent != null ? intent.getIntExtra("key_source_postion", 0) : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b73 != null) {
            c19783xd9a946b73.m76439x91db4f66(intExtra);
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("EffectTemplate", source);
        if (b17) {
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String str5 = this.f309288g;
            if (str5 == null) {
                r45.hj2 hj2Var = this.f309282a;
                str4 = hj2Var != null ? hj2Var.m75945x2fec8307(15) : null;
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = str5;
            }
            intent2.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", str4);
            l(this, d17, j18, a17, i17, j17, i27, b17, null, 128, null);
            return;
        }
        if (!((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
            i95.m c18 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 kg6 = w40.e.kg((w40.e) c18, targetContext, null, i17, 2, null);
            kg6.f293405n = da2.d.f309272d;
            kg6.f293414s = new da2.e(this, d17, j18, a17, i17, j17, i27, targetContext);
            kg6.f293387d = da2.f.f309281d;
            kg6.v();
            return;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.n(i17, false);
        if (l(this, d17, j18, a17, i17, j17, i27, b17, null, 128, null) || this.f309286e.e(targetContext)) {
            return;
        }
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Vi("FinderMusicAggregationPageFollowShootingButton", i17, 0, str, true, "", (d17 == null || (m75945x2fec8307 = d17.m75945x2fec8307(12)) == null) ? "" : m75945x2fec8307, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j17 != 0 ? j17 : f()));
        jSONObject.put("source_songid", d17 != null ? d17.m75945x2fec8307(12) : null);
        java.lang.String str6 = this.f309288g;
        if (str6 == null) {
            r45.hj2 hj2Var2 = this.f309282a;
            if (hj2Var2 != null) {
                i28 = 15;
                str3 = hj2Var2.m75945x2fec8307(15);
            } else {
                i28 = 15;
                str3 = null;
            }
            str6 = str3 == null ? "" : str3;
        } else {
            i28 = 15;
        }
        jSONObject.put("source_audioid", str6);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
        android.content.Intent b18 = b(1001, d17, a17);
        b18.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
        java.lang.String str7 = this.f309288g;
        if (str7 == null) {
            r45.hj2 hj2Var3 = this.f309282a;
            str2 = hj2Var3 != null ? hj2Var3.m75945x2fec8307(i28) : null;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = str7;
        }
        b18.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, b18);
    }

    public final void i(int i17, android.content.Context context, long j17) {
        java.lang.String str;
        long j18 = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTopicPostHandler", "innerPost " + i17 + " downloadFinish=" + this.f309286e.f443263d);
        r45.zi2 d17 = d();
        java.lang.String a17 = a(j18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j18 != 0 ? j18 : f()));
        jSONObject.put("source_songid", d17 != null ? d17.m75945x2fec8307(12) : null);
        jSONObject.put("source_audioid", this.f309288g);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
        if (i17 == 1001) {
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            java.lang.String hj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj();
            if (j18 == 0) {
                j18 = f();
            }
            java.lang.String u17 = pm0.v.u(j18);
            if (d17 == null || (str = d17.m75945x2fec8307(12)) == null) {
                str = "";
            }
            ((yy0.m7) l0Var).Vi("FinderMusicAggregationPageFollowShootingButton", 21, 0, hj6, true, u17, str, "");
        } else if (this.f309286e.e(context)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, b(i17, d17, a17));
    }

    public final void j() {
        qd2.g gVar = this.f309286e;
        dn.m mVar = gVar.f443268i;
        if (mVar != null) {
            c50.y0 y0Var = (c50.y0) ((jz5.n) gVar.f443267h).mo141623x754a37bb();
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            ((mn2.q0) y0Var).c(field_mediaId);
        }
        pm0.v.C(gVar.f443269j);
        kk4.b bVar = this.f309289h;
        if (bVar != null) {
            ((kk4.v) bVar).f390132x = null;
        }
        if (bVar != null) {
            ((kk4.v) bVar).P();
        }
        this.f309289h = null;
        zy2.g5 g5Var = this.f309290i;
        if (g5Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) g5Var).d();
        }
        zy2.g5 g5Var2 = this.f309290i;
        if (g5Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) g5Var2).b();
        }
        this.f309290i = null;
    }

    public final void k() {
        r45.hj2 hj2Var = this.f309282a;
        this.f309286e.d(hj2Var != null ? (r45.zi2) hj2Var.m75936x14adae67(3) : null);
    }
}
