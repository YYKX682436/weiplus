package pk1;

/* loaded from: classes15.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l {
    public static final pk1.f O = new pk1.f(null);
    public static int P;
    public final mk1.b0 M;
    public pk1.l0 N;

    public q(android.content.Context context, android.os.Looper looper, boolean z17, mk1.b0 b0Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context, looper, z17, false, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wxa_appbrand_enable_set_thumb_player_min_buffer_duration, false));
        this.M = b0Var;
        pk1.r rVar = new pk1.r();
        this.E = rVar;
        java.lang.String str = rVar.f437019a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        java.lang.String m40070xdc68a9b2 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m40070xdc68a9b2);
        rVar.f437035l = m40070xdc68a9b2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setNetType netType:%s", m40070xdc68a9b2);
    }

    public static final void X(pk1.q qVar, long j17) {
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.BaseMediaPlayer", "notifyOnVideoPreloadedMetaData, preloadSize:%d", java.lang.Long.valueOf(j17));
        synchronized (qVar) {
            if (qVar.f542696b) {
                return;
            }
            ye1.p pVar = qVar.f542704j;
            if (pVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47 abstractC12277x3bbbdb47 = ((ff1.k) pVar).f343153a;
                try {
                    ye1.e eVar = abstractC12277x3bbbdb47.f165192g;
                    if (qVar != eVar) {
                        abstractC12277x3bbbdb47.g("another player on preloaded meta data, return now.[%s, %s]", qVar, eVar);
                    } else {
                        abstractC12277x3bbbdb47.e("on preloaded meta preloadedSize:%d", java.lang.Long.valueOf(j17));
                        ff1.z zVar = abstractC12277x3bbbdb47.f165197o;
                        if (zVar != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e abstractC12278xb84f839e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12278xb84f839e) zVar;
                            abstractC12278xb84f839e.k("MicroMsg.Video.AbstractVideoView", "on preloaded meta data preloadSize:%d", java.lang.Long.valueOf(j17));
                            oe1.h1 h1Var = abstractC12278xb84f839e.f165219q;
                            if (h1Var != null) {
                                h1Var.n(abstractC12278xb84f839e.m51468x23a7af9b(), j17);
                            }
                        }
                    }
                } catch (java.lang.Exception e17) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1121x4f8299a0.AbstractC12277x3bbbdb47.Q;
                    abstractC12277x3bbbdb47.f(e17, "on preloaded meta error", new java.lang.Object[0]);
                }
            }
        }
    }

    public static final void Y(pk1.q qVar, long j17) {
        qVar.getClass();
        int i17 = j17 > 0 ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = qVar.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "setHitPreload hitPreload:%d, hitPreloadSize:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
            rVar.f437032i = i17;
            rVar.f437033j = j17;
        }
    }

    @Override // ye1.a, ye1.s
    public void C(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f437024c0 = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateJsInsertCostTime jsInsertCostTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // ye1.a
    public boolean G(int i17, int i18) {
        boolean G = super.G(i17, i18);
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f437003h, "onError");
            pk1.z zVar = pk1.z.f437063a;
            pk1.v cacheInfoHolder = l0Var.f437004i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheInfoHolder, "cacheInfoHolder");
            pk1.u uVar = cacheInfoHolder.f437059a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheInfo: " + uVar);
            com.p314xaae8f345.mm.vfs.r6 c17 = zVar.c();
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(uVar.f437056b + ".res", false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var = c17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c17.f294699d;
            if (l17 != null && !l17.isEmpty()) {
                java.lang.String str = z7Var.f294812f;
                z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheError, cacheDeleted: " + (m17.a() && m17.f294799a.d(m17.f294800b)));
            com.p314xaae8f345.mm.vfs.r6 c18 = zVar.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = uVar.f437056b;
            sb6.append(str2);
            sb6.append(".mark");
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(sb6.toString(), false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var2 = c18 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c18.f294699d;
            if (l18 != null && !l18.isEmpty()) {
                java.lang.String str3 = z7Var2.f294812f;
                z7Var2 = new com.p314xaae8f345.mm.vfs.z7(z7Var2.f294810d, z7Var2.f294811e, str3 + '/' + l18, z7Var2.f294813g, z7Var2.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(z7Var2, null);
            boolean z17 = m18.a() && m18.f294799a.d(m18.f294800b);
            com.p314xaae8f345.mm.vfs.r6 c19 = zVar.c();
            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str2 + ".temp.mark", false, true);
            com.p314xaae8f345.mm.vfs.z7 z7Var3 = c19 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c19.f294699d;
            if (l19 != null && !l19.isEmpty()) {
                java.lang.String str4 = z7Var3.f294812f;
                z7Var3 = new com.p314xaae8f345.mm.vfs.z7(z7Var3.f294810d, z7Var3.f294811e, str4 + '/' + l19, z7Var3.f294813g, z7Var3.f294814h);
            }
            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(z7Var3, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "clearMark, markDeleted: " + z17 + ", tempMarkDeleted: " + (m19.a() && m19.f294799a.d(m19.f294800b)));
            cacheInfoHolder.f437059a = pk1.u.a(uVar, null, null, null, false, 7, null);
        }
        return G;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l
    public java.lang.String Q() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p.e()) {
            return k91.d3.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, k91.n0.a());
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getApplicationId(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r17, java.lang.String r18, yz5.a r19) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk1.q.a0(java.lang.String, java.lang.String, yz5.a):void");
    }

    public final synchronized void b0() {
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            l0Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            java.lang.String str = rVar.f437019a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStartDownload");
            rVar.H = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "markRequestVideoMoovTime");
            rVar.M = java.lang.System.currentTimeMillis();
        }
    }

    public final synchronized void c0() {
        pk1.l0 l0Var = this.N;
        if (l0Var != null) {
            l0Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((pk1.r) aVar).f437019a, "onStopDownload");
            java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    public void m(java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (this.f172421q) {
            a0(path, str, new pk1.i(path));
        } else {
            a0(path, str, new pk1.j(path));
        }
    }

    @Override // ye1.a, ye1.s
    public void o(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (jSONObject != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateExtraData extraData:%s", jSONObject.toString());
                if (jSONObject.optLong("videoBitrate", 0L) > 0) {
                    rVar.f437047x = jSONObject.optLong("videoBitrate", 0L);
                }
                if (jSONObject.optLong("audioBitrate", 0L) > 0) {
                    rVar.f437048y = jSONObject.optLong("audioBitrate", 0L);
                }
                if (jSONObject.optLong("fileSize", 0L) > 0) {
                    rVar.f437025d = jSONObject.optLong("fileSize", 0L);
                }
                if (jSONObject.optInt("width", 0) > 0) {
                    rVar.F = jSONObject.optInt("width", 0);
                }
                if (jSONObject.optInt("height", 0) > 0) {
                    rVar.G = jSONObject.optInt("height", 0);
                }
                if (jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, 0) > 0) {
                    rVar.E = jSONObject.optLong(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, 0L);
                }
                java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                rVar.f437049z = optString;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    /* renamed from: pause */
    public void mo1857x65825f6() {
        super.mo1857x65825f6();
        c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = rVar.f437041r + (currentTimeMillis - rVar.f437038o);
            rVar.f437041r = j17;
            rVar.f437040q = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "pause realPlayTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    /* renamed from: prepareAsync */
    public void mo1858x857611b5() {
        super.mo1858x857611b5();
        b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "prepare");
            rVar.f437037n = java.lang.System.currentTimeMillis();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    /* renamed from: release */
    public void mo1859x41012807() {
        super.mo1859x41012807();
        synchronized (this) {
            pk1.l0 l0Var = this.N;
            if (l0Var != null) {
                l0Var.a();
            }
        }
        synchronized (O) {
            P--;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((pk1.r) aVar).f437019a, "release");
        }
    }

    @Override // ye1.a, ye1.s
    /* renamed from: setAppId */
    public void mo53294x52b73fda(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f437021b, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateAppId appId:%s", str);
            }
            rVar.f437021b = str;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    /* renamed from: start */
    public void mo1865x68ac462() {
        super.mo1865x68ac462();
        b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f437028e0 = false;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            rVar.f437038o = currentTimeMillis;
            long j17 = rVar.f437040q;
            if (j17 > 0) {
                rVar.f437039p += currentTimeMillis - j17;
                rVar.f437040q = 0L;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "start pauseTotalTime:%d", java.lang.Long.valueOf(rVar.f437039p));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l, ye1.e
    /* renamed from: stop */
    public void mo1866x360802() {
        super.mo1866x360802();
        c0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            java.lang.String str = rVar.f437019a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = rVar.f437040q;
            if (j17 > 0) {
                rVar.f437039p += currentTimeMillis - j17;
                rVar.f437040q = 0L;
            } else {
                rVar.f437041r += currentTimeMillis - rVar.f437038o;
            }
            rVar.f437040q = 0L;
            if (rVar.f437028e0) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6320x3cc71f3a c6320x3cc71f3a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6320x3cc71f3a();
            c6320x3cc71f3a.f136771d = c6320x3cc71f3a.b("AppId", rVar.f437021b, true);
            c6320x3cc71f3a.f136772e = c6320x3cc71f3a.b("Url", rVar.f437023c, true);
            c6320x3cc71f3a.f136773f = rVar.f437025d;
            c6320x3cc71f3a.f136775h = rVar.f437027e;
            c6320x3cc71f3a.f136774g = rVar.f437029f;
            c6320x3cc71f3a.f136776i = rVar.f437030g;
            c6320x3cc71f3a.f136777j = rVar.f437031h;
            c6320x3cc71f3a.f136778k = rVar.f437032i;
            c6320x3cc71f3a.f136779l = rVar.f437033j;
            c6320x3cc71f3a.f136780m = rVar.f437034k;
            c6320x3cc71f3a.f136781n = c6320x3cc71f3a.b("NetType", rVar.f437035l, true);
            c6320x3cc71f3a.f136782o = rVar.f437036m;
            c6320x3cc71f3a.f136783p = rVar.f437039p;
            c6320x3cc71f3a.f136784q = rVar.f437041r;
            c6320x3cc71f3a.f136785r = rVar.f437042s;
            c6320x3cc71f3a.f136786s = rVar.f437043t;
            c6320x3cc71f3a.f136787t = rVar.f437044u;
            c6320x3cc71f3a.f136788u = rVar.f437046w;
            c6320x3cc71f3a.f136789v = (int) rVar.f437047x;
            c6320x3cc71f3a.f136790w = (int) rVar.f437048y;
            c6320x3cc71f3a.f136791x = c6320x3cc71f3a.b("PlayCodeFormat", rVar.f437049z, true);
            c6320x3cc71f3a.f136792y = (int) rVar.A;
            c6320x3cc71f3a.f136793z = (int) rVar.B;
            c6320x3cc71f3a.A = (int) rVar.C;
            c6320x3cc71f3a.B = (int) rVar.D;
            c6320x3cc71f3a.C = (int) rVar.E;
            c6320x3cc71f3a.D = rVar.F;
            c6320x3cc71f3a.E = rVar.G;
            c6320x3cc71f3a.F = rVar.I;
            c6320x3cc71f3a.G = rVar.f437018J;
            c6320x3cc71f3a.H = rVar.K;
            c6320x3cc71f3a.I = rVar.L;
            c6320x3cc71f3a.f136770J = rVar.N;
            c6320x3cc71f3a.K = rVar.O;
            c6320x3cc71f3a.L = rVar.P;
            c6320x3cc71f3a.M = rVar.Q;
            c6320x3cc71f3a.N = rVar.R;
            c6320x3cc71f3a.O = c6320x3cc71f3a.b("DropFrameRate", "" + rVar.S, true);
            c6320x3cc71f3a.P = rVar.T ? 1L : 0L;
            c6320x3cc71f3a.Q = rVar.U;
            c6320x3cc71f3a.R = rVar.V;
            c6320x3cc71f3a.S = rVar.W;
            c6320x3cc71f3a.T = rVar.X;
            c6320x3cc71f3a.U = rVar.Y ? 1L : 0L;
            c6320x3cc71f3a.V = rVar.Z ? 1L : 0L;
            c6320x3cc71f3a.W = rVar.f437020a0 ? 1L : 0L;
            c6320x3cc71f3a.X = rVar.f437022b0 ? 1L : 0L;
            c6320x3cc71f3a.Y = rVar.f437024c0;
            c6320x3cc71f3a.Z = rVar.f437026d0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "report thumb player report data 35934");
            c6320x3cc71f3a.k();
            rVar.f437028e0 = true;
        }
    }

    @Override // ye1.a, ye1.e
    public void u(java.lang.String str, java.lang.String str2, ye1.h hVar) {
        ((ku5.t0) ku5.t0.f394148d).g(new pk1.l(this, str, str2, hVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            ((pk1.r) aVar).a(str);
        }
    }

    @Override // ye1.a, ye1.s
    public void v(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = this.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            rVar.f437026d0 = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "updateJsInsertToLoadMetaDataCostTime jsInsertToLoadMetaDataCostTime:%d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // ye1.a, ye1.e
    public void x(java.lang.String path, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        a0(path, str, new pk1.k(i17, path));
    }
}
