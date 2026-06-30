package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class v extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ed0.r0 {

    /* renamed from: d, reason: collision with root package name */
    public int f240031d;

    /* renamed from: e, reason: collision with root package name */
    public int f240032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f240033f;

    /* renamed from: g, reason: collision with root package name */
    public final int f240034g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f240035h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f240036i;

    /* renamed from: m, reason: collision with root package name */
    public long f240037m;

    /* renamed from: n, reason: collision with root package name */
    public int f240038n;

    /* renamed from: o, reason: collision with root package name */
    public ox3.g f240039o;

    /* renamed from: p, reason: collision with root package name */
    public int f240040p;

    /* renamed from: q, reason: collision with root package name */
    public ox3.g f240041q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f240042r;

    /* renamed from: s, reason: collision with root package name */
    public int f240043s;

    /* renamed from: t, reason: collision with root package name */
    public f25.m0 f240044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f240031d = 1;
        this.f240032e = 1;
        this.f240033f = "";
        this.f240034g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ringtone_video_timeline, 0);
        this.f240035h = new p012xc85e97e9.p093xedfae76a.j0();
        this.f240037m = -1L;
        this.f240038n = -1;
        this.f240040p = -1;
        this.f240043s = -1;
    }

    public final void O6() {
        ox3.f fVar;
        java.util.List m82898xfb7e5820;
        if (this.f240040p >= 0) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f240036i;
            if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
                fVar = null;
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f240036i;
                fVar = (ox3.f) kz5.n0.a0(m82898xfb7e5820, (c22848x6ddd90cf2 != null ? c22848x6ddd90cf2.a0() : 0) + this.f240040p);
            }
            if (fVar != null) {
                ((ox3.g) fVar).f431283e = false;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f240036i;
            if (c22848x6ddd90cf3 != null) {
                c22848x6ddd90cf3.m8148xed6e4d18((c22848x6ddd90cf3 != null ? c22848x6ddd90cf3.a0() : 0) + this.f240040p, java.lang.Boolean.FALSE);
            }
            this.f240042r = true;
            this.f240043s = this.f240040p;
        }
    }

    public final void P6() {
        ox3.f fVar;
        java.util.List m82898xfb7e5820;
        if (Q6() && this.f240042r) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f240036i;
            if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
                fVar = null;
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f240036i;
                fVar = (ox3.f) kz5.n0.a0(m82898xfb7e5820, (c22848x6ddd90cf2 != null ? c22848x6ddd90cf2.a0() : 0) + this.f240043s);
            }
            if (fVar != null) {
                ((ox3.g) fVar).f431283e = true;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f240036i;
            if (c22848x6ddd90cf3 != null) {
                c22848x6ddd90cf3.m8148xed6e4d18((c22848x6ddd90cf3 != null ? c22848x6ddd90cf3.a0() : 0) + this.f240043s, java.lang.Boolean.TRUE);
            }
        }
        this.f240042r = false;
    }

    public final boolean Q6() {
        if (this.f240034g > 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239907f != 3) {
                return true;
            }
        }
        return false;
    }

    public final void R6(vx3.i ringtoneInfo, int i17, int i18, long j17, java.lang.String itemContext, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtoneInfo, "ringtoneInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemContext, "itemContext");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239907f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        jSONObject.put("session_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239906e);
        jSONObject.put("feed_id", ringtoneInfo.d());
        jSONObject.put("position", i19);
        jSONObject.put("entrance", this.f240032e);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        jSONObject.put("search_request_id", ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2.class)).R6());
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i27);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", ringtoneInfo.f522831o);
        intent.putExtra("feed_object_nonceId", ringtoneInfo.f522832p);
        intent.putExtra("key_session_id", c01.id.a());
        intent.putExtra("key_feed_report_enter", i17);
        intent.putExtra("key_feed_report_enter_type", i18);
        intent.putExtra("key_reuqest_scene", 28);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("KEY_RINGTONE_RECALL_ID", j17);
        intent.putExtra("key_session_id", itemContext);
        intent.putExtra("KEY_RINGTONE_REPORT_JSON", t17);
        int i28 = this.f240032e;
        intent.putExtra("KEY_RINGTONE_TO_USERNAME", (i28 == 6 || i28 == 9 || i28 == 10) ? "" : this.f240033f);
        intent.putExtra("KEY_RINGTONE_CHANNEL", this.f240032e);
        intent.putExtra("KEY_RINGTONE_CHOOSE_SCENE", i27);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
        intent.putExtra("KEY_RINGTONE_REC_REQUEST_ID", ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g2) zVar.a(activity4).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g2.class)).Q6());
        intent.putExtra("KEY_IS_VIDEO_STREAM", this.f240034g > 1);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
        kk4.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) zVar.a(activity5).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).f240093d.f448913m;
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", vVar != null ? vVar.o() : 0L);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, 25, intent);
        intent.putExtra("key_extra_info", "");
        intent.putExtra("key_enable_ringtone_bubble", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f542005a, m80379x76847179(), intent, false, 4, null);
    }

    public final void T6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_caller", this.f240031d);
        intent.putExtra("ringtone_channel", this.f240032e);
        intent.putExtra("exclusvie_name", this.f240033f);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14082x255de064.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(5);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderRingtoneSearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void U6(int i17, ox3.g ringtoneConvertData) {
        t45.f fVar;
        vx3.i a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtoneConvertData, "ringtoneConvertData");
        t45.g gVar = ringtoneConvertData.f431282d.f497150f;
        if (gVar == null || (fVar = gVar.f497093d) == null || (a17 = qx3.d.a(fVar.f497082d)) == null) {
            return;
        }
        t45.h0 h0Var = gVar.f497109w;
        java.lang.String str = a17.f522841y ? h0Var != null ? h0Var.f497119f : null : gVar.f497100n;
        java.lang.String str2 = h0Var != null ? h0Var.f497120g : null;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", str);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.w(m158354x19263085(), intent);
            return;
        }
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneDataUIC", "singerFinderUsername and singerBaikeUrl is null!");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str2);
        j45.l.j(m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
    }

    public final void V6(int i17, boolean z17, ox3.g gVar) {
        W6();
        if (z17) {
            this.f240040p = i17 != -1 ? i17 : this.f240040p;
            if (i17 == -1 || gVar == null) {
                gVar = this.f240041q;
            }
            this.f240041q = gVar;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f240037m = java.lang.System.currentTimeMillis();
            this.f240038n = this.f240040p;
            this.f240039o = this.f240041q;
        } else if (this.f240040p == i17) {
            this.f240040p = -1;
            this.f240041q = null;
            this.f240037m = 0L;
            this.f240038n = -1;
            this.f240039o = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "onPlayStateChange, position:" + i17 + ", play:" + z17 + ", curPlayPosition:" + this.f240040p);
    }

    public final void W6() {
        int i17 = this.f240038n;
        ox3.g gVar = this.f240039o;
        long j17 = this.f240037m;
        if (i17 < 0 || gVar == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).O6(2L, i17, gVar, currentTimeMillis);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f240031d = m158359x1e885992().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f240033f = stringExtra;
        this.f240032e = m158359x1e885992().getIntExtra("ringtone_channel", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "userName:" + this.f240033f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class)).f239907f != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataUIC", "hookPlayState");
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.i(this, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (by3.a.f117903b) {
            b21.m.g();
            ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
            b21.r b17 = b21.m.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
            if ((b17 == null || b17.N) ? false : true) {
                b17.N = true;
                b21.m.k(b17);
            }
            ll3.q0.d(b17);
        }
        by3.a.f117903b = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ed0.z0.i1((ed0.z0) a17, 10L, this.f240040p, this.f240041q, 0L, 8, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        O6();
        W6();
        this.f240040p = -1;
        this.f240041q = null;
        this.f240038n = -1;
        this.f240039o = null;
        this.f240037m = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        f25.m0 m0Var = this.f240044t;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f240044t = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.w.f340648c, new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.u(this));
        P6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        f25.m0 m0Var = this.f240044t;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }
}
