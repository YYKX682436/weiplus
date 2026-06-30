package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public boolean D;
    public int E;
    public final java.util.LinkedList F;
    public final java.util.LinkedList G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232838d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f232839e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f232840f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f232841g;

    /* renamed from: h, reason: collision with root package name */
    public fm3.u f232842h;

    /* renamed from: i, reason: collision with root package name */
    public r45.hf2 f232843i;

    /* renamed from: m, reason: collision with root package name */
    public ll3.h1 f232844m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f232845n;

    /* renamed from: o, reason: collision with root package name */
    public long f232846o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f232847p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.ws4 f232848q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f232849r;

    /* renamed from: s, reason: collision with root package name */
    public long f232850s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f232851t;

    /* renamed from: u, reason: collision with root package name */
    public int f232852u;

    /* renamed from: v, reason: collision with root package name */
    public t45.n0 f232853v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f232854w;

    /* renamed from: x, reason: collision with root package name */
    public r45.at4 f232855x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f232856y;

    /* renamed from: z, reason: collision with root package name */
    public int f232857z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232838d = "MicroMsg.Mv.MusicMvDataUIC";
        this.f232839e = "MicroMsg.Mv.GetLyric";
        this.f232842h = new fm3.u();
        this.f232843i = new r45.hf2();
        this.f232845n = true;
        this.f232848q = new r45.ws4();
        this.f232857z = 1;
        this.A = "";
        this.B = "";
        this.E = 2;
        this.F = new java.util.LinkedList();
        this.G = new java.util.LinkedList();
    }

    public final int O6() {
        b21.r b17 = b21.m.b();
        if (android.text.TextUtils.isEmpty(b17 != null ? b17.P : null)) {
            return 1;
        }
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b18 = b21.m.b();
        java.lang.String str = b18 != null ? b18.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f409935d.get(str);
        return ((num != null && num.intValue() == 2) || this.f232857z == 2) ? 2 : 3;
    }

    public final java.lang.String P6() {
        int i17 = 1;
        java.lang.String m75945x2fec8307 = this.f232843i.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        r45.at4 at4Var = this.f232855x;
        if (at4Var != null && !android.text.TextUtils.isEmpty(at4Var.f451788d)) {
            r45.at4 at4Var2 = this.f232855x;
            if (at4Var2 != null && at4Var2.f451790f == 1) {
                i17 = 2;
            }
        }
        sb6.append(i17);
        jSONObject.putOpt(m75945x2fec8307, sb6.toString());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final int Q6() {
        return fm3.z.f345703f == 0 ? 1 : 2;
    }

    public final boolean R6(b21.r rVar) {
        if (rVar == null) {
            return false;
        }
        int i17 = rVar.f98878d;
        java.lang.Integer num = this.f232840f;
        return num != null && i17 == num.intValue() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f98879e, this.f232841g);
    }

    public final void S6() {
        r45.hf2 hf2Var = this.f232843i;
        java.lang.String m75945x2fec8307 = hf2Var.m75945x2fec8307(6);
        if (!(!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0))) {
            hf2Var = null;
        }
        if (hf2Var != null) {
            ll3.h1 f17 = ll3.h1.f(hf2Var.m75945x2fec8307(6), m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4r), "", ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).Ai(hf2Var.m75945x2fec8307(4), hf2Var.m75945x2fec8307(2)), hf2Var.m75945x2fec8307(1), false, false);
            this.f232844m = f17.e() > 1 ? f17 : null;
        }
    }

    public final void T6() {
        t45.g gVar;
        t45.n0 n0Var = this.f232853v;
        boolean z17 = n0Var != null && n0Var.f497148d == 2;
        vx3.k kVar = vx3.l.E;
        if (z17 && n0Var != null && (gVar = n0Var.f497150f) != null) {
            ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
            t45.n0 n0Var2 = this.f232853v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n0Var2);
            ((dd0.m0) a1Var).getClass();
            kVar.e(gVar, n0Var2).f522822f = this.f232853v;
        }
        t45.n0 n0Var3 = this.f232853v;
        if (n0Var3 != null && n0Var3.f497148d == 1) {
            t45.f0 f0Var = n0Var3 != null ? n0Var3.f497149e : null;
            if (f0Var == null || n0Var3 == null) {
                return;
            }
            ed0.a1 a1Var2 = (ed0.a1) i95.n0.c(ed0.a1.class);
            long j17 = f0Var.f497089i;
            ((dd0.m0) a1Var2).getClass();
            vx3.i g17 = kVar.g(0L, j17, n0Var3, null);
            if (g17 == null) {
                return;
            }
            g17.f522822f = n0Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0291  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        fm3.j0 j0Var;
        long j17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class);
        lm3.e eVar = (lm3.e) kz5.n0.a0(c16668xffb9dd68.f232510g, c16668xffb9dd68.f232515o);
        fm3.u uVar = eVar != null ? eVar.f401015d : null;
        fm3.j0 j0Var2 = fm3.j0.f345611a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        r45.hf2 songInfo = this.f232843i;
        kl3.t.g().a().a();
        int Q6 = Q6();
        int O6 = O6();
        java.lang.String P6 = P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 7, r45.bt4.class);
        if (bt4Var == null) {
            bt4Var = fm3.j0.f345613c;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6776x59fbce58 c6776x59fbce58 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6776x59fbce58();
        if (bt4Var != null) {
            c6776x59fbce58.f141032d = c6776x59fbce58.b("ContextId", bt4Var.f452570e, true);
            c6776x59fbce58.f141037i = bt4Var.f452569d;
            c6776x59fbce58.f141038j = c6776x59fbce58.b("FromSourceId", bt4Var.f452572g, true);
            c6776x59fbce58.f141047s = bt4Var.f452573h;
            c6776x59fbce58.f141049u = bt4Var.f452580r;
            c6776x59fbce58.f141051w = bt4Var.f452581s;
            c6776x59fbce58.f141052x = bt4Var.f452582t;
            c6776x59fbce58.f141053y = bt4Var.f452583u;
            c6776x59fbce58.f141054z = bt4Var.f452584v;
            if (bt4Var.f452587y == 3) {
                c6776x59fbce58.A = 3L;
            } else {
                c6776x59fbce58.A = 2L;
            }
        }
        int i17 = fm3.j0.f345612b;
        if (i17 == 18) {
            c6776x59fbce58.f141037i = i17;
            android.content.Intent intent = context.getIntent();
            c6776x59fbce58.B = c6776x59fbce58.b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
            fm3.j0.f345612b = 0;
        }
        fm3.k0 b17 = j0Var2.b(context);
        c6776x59fbce58.f141044p = b17.f345615a;
        c6776x59fbce58.f141045q = b17.f345616b;
        c6776x59fbce58.f141046r = b17.f345617c;
        java.lang.String m75945x2fec8307 = songInfo.m75945x2fec8307(0);
        c6776x59fbce58.f141033e = c6776x59fbce58.b("SongName", m75945x2fec8307 != null ? r26.i0.t(m75945x2fec8307, ",", " ", false) : null, true);
        c6776x59fbce58.f141036h = c6776x59fbce58.b("AppId", songInfo.m75945x2fec8307(3), true);
        c6776x59fbce58.f141034f = c6776x59fbce58.b("WebUrl", songInfo.m75945x2fec8307(4), true);
        c6776x59fbce58.f141035g = c6776x59fbce58.b("DataUrl", songInfo.m75945x2fec8307(2), true);
        java.lang.String m75945x2fec83072 = songInfo.m75945x2fec8307(6);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            j0Var = j0Var2;
            j17 = 2;
        } else {
            j0Var = j0Var2;
            j17 = 1;
        }
        c6776x59fbce58.f141041m = j17;
        java.lang.String m75945x2fec83073 = songInfo.m75945x2fec8307(5);
        c6776x59fbce58.f141042n = c6776x59fbce58.b("SongId", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", " ", false) : null, true);
        java.lang.String m75945x2fec83074 = songInfo.m75945x2fec8307(1);
        c6776x59fbce58.f141050v = c6776x59fbce58.b("Singer", m75945x2fec83074 != null ? r26.i0.t(m75945x2fec83074, ",", " ", false) : null, true);
        c6776x59fbce58.f141043o = 2L;
        long c17 = j0Var.c(context);
        c6776x59fbce58.f141048t = c17;
        c6776x59fbce58.C = Q6;
        c6776x59fbce58.D = O6;
        c6776x59fbce58.E = c6776x59fbce58.b("JumpType", P6, true);
        long j18 = fm3.z.f345704g;
        long j19 = j18 + c17;
        fm3.z.f345704g = j19;
        c6776x59fbce58.G = songInfo.m75939xb282bd08(14);
        c6776x59fbce58.H = j19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "songPlayDurationSoFar:" + j19 + ", currentSongPlayDurationSoFar:" + j18 + ", playMusicTime:" + c17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isMvWithBeat:");
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(uVar.f345679z) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", sb6.toString());
        c6776x59fbce58.I = 0L;
        c6776x59fbce58.f141031J = c6776x59fbce58.b("SyncBeatFeedID", "", true);
        c6776x59fbce58.F = c6776x59fbce58.b("PlaySameSongSessionId", fm3.z.f345706i, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "songTotalDuration:" + songInfo.m75939xb282bd08(14) + ", playMusicTime:" + c17 + ", syncBeatPlayDurationSoFar:" + c6776x59fbce58.I);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvReportLogic", "struct.contextId:" + c6776x59fbce58.f141032d + ", struct.syncBeatFeedID:" + c6776x59fbce58.f141031J + ", playSameSongSessionId:" + c6776x59fbce58.F);
        c6776x59fbce58.k();
        c6776x59fbce58.o();
        fm3.j0.f345612b = 0;
        fm3.f0 f0Var = fm3.f0.f345581a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMvMainUIExit, songName:");
        r45.hf2 hf2Var = fm3.f0.f345589i;
        sb7.append(hf2Var != null ? hf2Var.m75945x2fec8307(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f345589i;
        sb7.append(hf2Var2 != null ? hf2Var2.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvChattingDataManger", sb7.toString());
        fm3.f0.f345600t = null;
        fm3.f0.f345593m.clear();
        fm3.f0.f345594n.clear();
        fm3.f0.f345595o.clear();
        fm3.f0.f345596p.clear();
        if (2 == fm3.f0.f345598r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvChattingDataManger", "song is stop Playing, session End");
            f0Var.b();
        }
        fm3.f0.f345599s = false;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onMvMainUIExit, songName:");
        r45.hf2 hf2Var3 = fm3.z.f345700c;
        sb8.append(hf2Var3 != null ? hf2Var3.m75945x2fec8307(0) : null);
        sb8.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f345700c;
        sb8.append(hf2Var4 != null ? hf2Var4.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", sb8.toString());
        fm3.z.f345705h = java.lang.System.currentTimeMillis();
        if (2 == fm3.z.f345701d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", "song is stop Playing, session End");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onSessionEnd, songName:");
            r45.hf2 hf2Var5 = fm3.z.f345700c;
            sb9.append(hf2Var5 != null ? hf2Var5.m75945x2fec8307(0) : null);
            sb9.append(", singer:");
            r45.hf2 hf2Var6 = fm3.z.f345700c;
            sb9.append(hf2Var6 != null ? hf2Var6.m75945x2fec8307(1) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", sb9.toString());
            fm3.z.f345698a = true;
            fm3.z.f345704g = 0L;
            fm3.z.f345705h = 0L;
        }
        fm3.z.f345702e = false;
        kl3.e l17 = kl3.t.l();
        if (l17 != null) {
            if (!(l17 instanceof kl3.k)) {
                l17 = null;
            }
            if (l17 != null) {
                kl3.z zVar = (kl3.z) ((kl3.k) l17);
                if (zVar.f390393i != null) {
                    zVar.f390393i = null;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232838d, "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scene:" + m1Var);
    }
}
