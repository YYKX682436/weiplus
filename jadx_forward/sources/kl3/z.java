package kl3;

/* loaded from: classes11.dex */
public class z extends kl3.o implements kl3.i, kl3.k {

    /* renamed from: d, reason: collision with root package name */
    public int f390388d;

    /* renamed from: i, reason: collision with root package name */
    public kl3.j f390393i;

    /* renamed from: j, reason: collision with root package name */
    public nl3.b f390394j;

    /* renamed from: k, reason: collision with root package name */
    public nl3.a f390395k;

    /* renamed from: l, reason: collision with root package name */
    public nl3.c f390396l;

    /* renamed from: m, reason: collision with root package name */
    public nl3.d f390397m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390398n;

    /* renamed from: c, reason: collision with root package name */
    public int f390387c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f390389e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.g f390390f = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.g();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f390391g = new java.lang.Object();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f390392h = true;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f390399o = null;

    public ql3.a A(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        ql3.a y07 = ll3.o2.Ai().y0(str);
        if (y07 != null) {
            ((java.util.ArrayList) this.f390389e).add(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data exist in db , id:%s", str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "getMusicByDBMusicId, music data not exist in db , id:%s", str);
        }
        return y07;
    }

    public final kl3.g B() {
        ((ll3.o2) ((cl3.e) i95.n0.c(cl3.e.class))).m134976x2690a4ac();
        return this.f390369a;
    }

    public void C() {
        if (this.f390387c == 1) {
            return;
        }
        int i17 = this.f390388d + 1;
        this.f390388d = i17;
        this.f390388d = i17 % ((java.util.ArrayList) this.f390389e).size();
        ((kl3.t) B()).m(true);
        ((kl3.t) B()).n(null);
    }

    public void D() {
        if (this.f390387c == 1) {
            return;
        }
        int i17 = this.f390388d;
        java.util.List list = this.f390389e;
        int size = (i17 + ((java.util.ArrayList) list).size()) - 1;
        this.f390388d = size;
        this.f390388d = size % ((java.util.ArrayList) list).size();
        ((kl3.t) B()).m(true);
        ((kl3.t) B()).n(null);
    }

    public void E(ql3.a aVar, boolean z17, boolean z18) {
        if (aVar == null) {
            return;
        }
        if (this.f390394j != null) {
            gm0.j1.n().f354821b.d(this.f390394j);
            this.f390394j = null;
        }
        if (aVar.f66996x10603bf5 > 0 || !android.text.TextUtils.isEmpty(aVar.f66999xfba74ece)) {
            this.f390394j = new nl3.b(aVar, z17, z18);
            gm0.j1.n().f354821b.g(this.f390394j);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "can't get songId and mid is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10911, "1");
        }
    }

    @Override // kl3.o, kl3.e
    public void a() {
        if (!this.f390392h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: not support AudioFocusService");
            super.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "abandonFocus: support AudioFocusService");
        if (this.f390399o != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f390399o);
            this.f390399o = null;
        }
    }

    @Override // kl3.o, kl3.e
    public void b(b21.r rVar) {
        if (tl3.a.f501829a == null) {
            return;
        }
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "readyToPlay", "1.0", "0"}));
        tl3.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // kl3.o, kl3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c(java.lang.String r4) {
        /*
            r3 = this;
            com.tencent.mm.sdk.platformtools.r2 r0 = ml3.d.f409938a
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L9
            goto L18
        L9:
            com.tencent.mm.sdk.platformtools.r2 r0 = ml3.d.f409938a
            boolean r1 = r0.k(r4)
            if (r1 == 0) goto L18
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r0
        L1d:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            java.lang.String r1 = "MicroMsg.Music.MusicWechatPrivateLogic"
            java.lang.String r2 = "contain shake tag playUrl:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            boolean r0 = ml3.d.a(r4)
            if (r0 == 0) goto L3e
            java.lang.String r0 = "wxshakemusic"
            int r0 = r4.lastIndexOf(r0)
            r1 = 1
            if (r0 <= r1) goto L3e
            r2 = 0
            int r0 = r0 - r1
            java.lang.String r4 = r4.substring(r2, r0)
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kl3.z.c(java.lang.String):java.lang.String");
    }

    @Override // kl3.o, kl3.e
    public b21.r d(b21.r rVar) {
        boolean z17;
        java.lang.String a17 = xl3.c.a(rVar);
        synchronized (this.f390391g) {
            if (this.f390389e != null) {
                int i17 = 0;
                while (true) {
                    if (i17 >= ((java.util.ArrayList) this.f390389e).size()) {
                        z17 = false;
                        break;
                    }
                    if (a17.equals(((java.util.ArrayList) this.f390389e).get(i17))) {
                        this.f390388d = i17;
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if (((java.util.ArrayList) this.f390389e).size() > 1 && rVar.A) {
                    this.f390387c = 2;
                }
            } else {
                z17 = false;
            }
        }
        if (z17) {
            return o();
        }
        synchronized (this.f390391g) {
            ((java.util.ArrayList) this.f390389e).clear();
            ((java.util.ArrayList) this.f390389e).add(xl3.c.a(rVar));
        }
        this.f390388d = 0;
        ll3.o2.Ai().J0(rVar);
        if (this.f390387c != 2) {
            return rVar;
        }
        s75.d.b(new kl3.x(this, null), "music_get_list_task");
        return rVar;
    }

    @Override // kl3.o, kl3.e
    public void e(b21.r rVar) {
        if (pl3.c.f438234d > 0) {
            pl3.c.f438233c = (int) (pl3.c.f438233c + ((java.lang.System.currentTimeMillis() - pl3.c.f438234d) / 1000));
            pl3.c.f438234d = 0L;
        }
        if (tl3.a.f501829a == null) {
            return;
        }
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "paused", "1.0", java.lang.String.valueOf(b21.m.a().f98871b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void f(b21.r rVar) {
        pl3.c.d();
        tl3.a.c();
    }

    @Override // kl3.o, kl3.e
    public b21.r g(b21.r rVar) {
        if (rVar == null && ((java.util.ArrayList) this.f390389e).size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper is null && musicList's size is 0");
            return null;
        }
        if (rVar == null) {
            return o();
        }
        synchronized (this.f390391g) {
            ((java.util.ArrayList) this.f390389e).clear();
            ((java.util.ArrayList) this.f390389e).add(xl3.c.a(rVar));
        }
        this.f390388d = 0;
        ll3.o2.Ai().J0(rVar);
        if (this.f390387c != 2) {
            return rVar;
        }
        s75.d.b(new kl3.x(this, null), "music_get_list_task");
        return rVar;
    }

    @Override // kl3.e
    public java.lang.String h() {
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i("wcf://QQMusicCache/", true);
        com.p314xaae8f345.mm.vfs.w6.u("wcf://QQMusicCache/");
        return i17;
    }

    @Override // kl3.o, kl3.e
    public void i(b21.r rVar) {
        super.i(rVar);
        ll3.o2.Ai().J0(rVar);
    }

    @Override // kl3.o, kl3.e
    /* renamed from: init */
    public void mo143620x316510() {
        this.f390390f.a();
    }

    @Override // kl3.o, kl3.e
    public boolean j(int i17) {
        int i18 = ol3.a.f427681a;
        return true;
    }

    @Override // kl3.o, kl3.e
    public void k(b21.r rVar) {
        if (rVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2();
            tl3.a.f501829a = c6771xc0e95fa2;
            c6771xc0e95fa2.f140960d = c6771xc0e95fa2.b("SessionId", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa22 = tl3.a.f501829a;
            c6771xc0e95fa22.f140967k = c6771xc0e95fa22.b("Appid", rVar.f98891t, true);
            try {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa23 = tl3.a.f501829a;
                java.lang.String str = rVar.f98885n;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                c6771xc0e95fa23.f140964h = c6771xc0e95fa23.b("DataUrl", fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa24 = tl3.a.f501829a;
                java.lang.String str3 = rVar.f98882h;
                if (str3 == null) {
                    str3 = "";
                }
                c6771xc0e95fa24.f140962f = c6771xc0e95fa24.b("Singer", fp.s0.b(str3, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa25 = tl3.a.f501829a;
                java.lang.String str4 = rVar.f98881g;
                if (str4 == null) {
                    str4 = "";
                }
                c6771xc0e95fa25.f140961e = c6771xc0e95fa25.b("SongName", fp.s0.b(str4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa26 = tl3.a.f501829a;
                java.lang.String str5 = rVar.f98887p;
                if (str5 != null) {
                    str2 = str5;
                }
                c6771xc0e95fa26.f140963g = c6771xc0e95fa26.b("WebUrl", fp.s0.b(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), true);
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MusicPlayerReporter", e17, "encode properties", new java.lang.Object[0]);
            }
        }
        if (tl3.a.f501829a != null) {
            tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "preparing", "1.0", "0"}));
            tl3.a.a();
        }
        if (tl3.a.f501829a == null) {
            return;
        }
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "buffering", "1.0", java.lang.String.valueOf(b21.m.a().f98871b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void l(b21.r rVar) {
        if (tl3.a.f501829a == null) {
            return;
        }
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "seeking", "1.0", java.lang.String.valueOf(b21.m.a().f98871b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public void m(b21.r rVar) {
        pl3.c.d();
        tl3.a.c();
        if (this.f390387c == 2) {
            if (this.f390388d < ((java.util.ArrayList) this.f390389e).size() - 1 || rVar.A) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
                am.jk jkVar = c5722xb16ab0f4.f136045g;
                jkVar.f88569b = 15;
                jkVar.f88573f = "";
                c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
                C();
            }
        }
    }

    @Override // kl3.o, kl3.e
    public void n(b21.r rVar, int i17) {
        pl3.c.d();
    }

    @Override // kl3.o, kl3.e
    public b21.r o() {
        synchronized (this.f390391g) {
            if (((java.util.ArrayList) this.f390389e).size() == 0) {
                return null;
            }
            int size = ((java.util.ArrayList) this.f390389e).size();
            int i17 = this.f390388d;
            if (size <= i17) {
                return null;
            }
            ql3.a y07 = ll3.o2.Ai().y0((java.lang.String) ((java.util.ArrayList) this.f390389e).get(i17));
            if (y07 == null) {
                return null;
            }
            return y07.u0();
        }
    }

    @Override // kl3.o, kl3.e
    public void p(b21.r rVar) {
        pl3.c.d();
        pl3.c.f438234d = java.lang.System.currentTimeMillis();
        ql3.a z17 = z();
        synchronized (pl3.c.class) {
            pl3.c.f438235e = z17;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa2 = tl3.a.f501829a;
        if (c6771xc0e95fa2 == null) {
            return;
        }
        c6771xc0e95fa2.f140965i = b21.m.a().f98870a;
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "playing", "1.0", "0"}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public b21.r q(java.util.List list, int i17) {
        if (list == null || list.size() == 0 || i17 >= list.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "music wrapper list error");
            return null;
        }
        synchronized (this.f390391g) {
            ((java.util.ArrayList) this.f390389e).clear();
            for (int i18 = 0; i18 < list.size(); i18++) {
                b21.r rVar = (b21.r) list.get(i18);
                ((java.util.ArrayList) this.f390389e).add(xl3.c.a(rVar));
                ll3.o2.Ai().J0(rVar);
            }
        }
        this.f390388d = i17;
        this.f390387c = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "startPlayNewMusicList:%d", java.lang.Integer.valueOf(i17));
        b21.r o17 = o();
        if (o17.D > 0) {
            java.lang.String a17 = xl3.c.a(o17);
            ql3.b Ai = ll3.o2.Ai();
            Ai.getClass();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("startTime", (java.lang.Integer) 0);
            Ai.f446114e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17});
            ql3.a aVar = (ql3.a) ((lt0.f) Ai.f446113d).get(a17);
            if (aVar != null) {
                aVar.f67010x1bb3b54a = 0;
            }
        }
        return o17;
    }

    @Override // kl3.o, kl3.e
    public void r(b21.r rVar) {
        pl3.c.f438234d = java.lang.System.currentTimeMillis();
    }

    @Override // kl3.e
    /* renamed from: release */
    public void mo143621x41012807() {
        ((java.util.ArrayList) this.f390389e).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.g gVar = this.f390390f;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "uninitMusicPlayerService");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.ServiceC16625x51beb82f.class);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(intent);
        gVar.f232181a = null;
        gVar.f232183c.mo48814x2efc64();
    }

    @Override // kl3.o, kl3.e
    /* renamed from: requestFocus */
    public boolean mo143622x4c4bb389() {
        if (!this.f390392h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: not support AudioFocusService");
            return super.mo143622x4c4bb389();
        }
        if (this.f390399o != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f390399o);
            this.f390399o = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "requestFocus: support AudioFocusService");
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.v.f340647c, new kl3.w(this));
        this.f390399o = m96;
        if (m96 == null || !((g25.e) m96).f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus fail");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "getGainFocus success");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f3, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013c  */
    @Override // kl3.o, kl3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(b21.r r15) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kl3.z.s(b21.r):boolean");
    }

    @Override // kl3.o, kl3.e
    public synchronized void t(java.util.List list, boolean z17) {
        if (list != null) {
            if (list.size() != 0) {
                synchronized (this.f390391g) {
                    if (z17) {
                        ((java.util.ArrayList) this.f390389e).clear();
                    }
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        b21.r rVar = (b21.r) it.next();
                        ((java.util.ArrayList) this.f390389e).add(xl3.c.a(rVar));
                        ll3.o2.Ai().J0(rVar);
                    }
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "appendMusicList error");
    }

    @Override // kl3.o, kl3.e
    public void u(b21.r rVar) {
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "shake music item is null");
            return;
        }
        synchronized (this.f390391g) {
            ((java.util.ArrayList) this.f390389e).clear();
            ((java.util.ArrayList) this.f390389e).add(xl3.c.a(rVar));
        }
        this.f390388d = 0;
        ll3.o2.Ai().J0(rVar);
    }

    @Override // kl3.o, kl3.e
    public java.net.URL v(java.lang.String str) {
        return new com.p314xaae8f345.mm.p971x6de15a2e.m(str).f153601b;
    }

    @Override // kl3.o, kl3.e
    public void w(b21.r rVar) {
        if (tl3.a.f501829a == null) {
            return;
        }
        tl3.a.f501829a.p(tl3.a.b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), tl3.a.f501830b, "seekEnd", "1.0", java.lang.String.valueOf(b21.m.a().f98871b)}));
        tl3.a.a();
    }

    @Override // kl3.o, kl3.e
    public boolean x(int i17) {
        if (i17 != 0 && i17 != 1 && i17 != 4 && i17 != 5 && i17 != 12 && i17 != 14) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public boolean y() {
        return ((java.util.ArrayList) this.f390389e).size() > 0 && this.f390387c == 2;
    }

    public ql3.a z() {
        synchronized (this.f390391g) {
            if (((java.util.ArrayList) this.f390389e).size() == 0) {
                return null;
            }
            int size = ((java.util.ArrayList) this.f390389e).size();
            int i17 = this.f390388d;
            if (size <= i17) {
                return null;
            }
            return ll3.o2.Ai().y0((java.lang.String) ((java.util.ArrayList) this.f390389e).get(i17));
        }
    }
}
