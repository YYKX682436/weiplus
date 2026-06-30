package sf4;

/* loaded from: classes4.dex */
public final class f2 implements t21.i0 {

    /* renamed from: d, reason: collision with root package name */
    public nf4.o f489006d;

    /* renamed from: e, reason: collision with root package name */
    public t21.h0 f489007e;

    /* renamed from: f, reason: collision with root package name */
    public if4.h f489008f;

    /* renamed from: g, reason: collision with root package name */
    public int f489009g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f489010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f489011i;

    public f2(sf4.j2 j2Var) {
        this.f489011i = j2Var;
    }

    @Override // t21.i0
    public void a(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pm0.v.X(new sf4.e2(this, mediaId, i17, i18));
    }

    @Override // t21.i0
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String b17;
        java.lang.Object obj;
        int i17;
        sf4.p1 p1Var;
        int i18;
        r45.xe6 xe6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", "startHttpStream " + str + ' ' + str2 + ' ' + str3 + " this:" + this);
        if4.h hVar = this.f489008f;
        if (hVar != null) {
            ef4.k0 k0Var = ef4.k0.f333992a;
            nf4.o b18 = k0Var.b(hVar);
            this.f489006d = b18;
            if (!com.p314xaae8f345.mm.vfs.w6.j(b18.f66550xf1e9b966)) {
                java.lang.String field_filePath = b18.f66550xf1e9b966;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_filePath, "field_filePath");
                if (!(field_filePath.length() == 0)) {
                    java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(field_filePath);
                    com.p314xaae8f345.mm.vfs.w6.u(r17);
                    com.p314xaae8f345.mm.vfs.w6.t(r17);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", "startHttpStream error downloadFinish " + b18.t0() + " ret:" + com.p314xaae8f345.mm.vfs.w6.j(b18.f66550xf1e9b966) + " path:" + b18.f66550xf1e9b966);
                b18.f66549x799e9d9e = 0;
                b18.f66552x78351860 = 0;
                ef4.w.f334001t.k().D0(b18);
            }
            if4.h hVar2 = this.f489011i.f489037f;
            if (hVar2 != null) {
                if (mf4.c.f407685d > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryBrowseIDKeyStat", "startHttp");
                    mf4.c.f407691j = true;
                }
                mf4.b bVar = mf4.b.f407675a;
                long j17 = hVar2.f372787b;
                if (bVar.a()) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.util.Map map = mf4.b.f407677c;
                    if (map.containsKey(valueOf)) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map.get(java.lang.Long.valueOf(j17)));
                    }
                }
            }
            if4.h hVar3 = this.f489008f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((hVar3 == null || (xe6Var = hVar3.f372791f) == null) ? null : xe6Var.f471556f)) {
                return;
            }
            sf4.j2 j2Var = this.f489011i;
            j2Var.f489042k++;
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
            if (c18499x2fc2446b != null) {
                c18499x2fc2446b.m71535x7db42847(true);
            }
            sf4.d2 d2Var = new sf4.d2(this.f489011i);
            d2Var.f488982e = this.f489007e;
            nf4.o oVar = this.f489006d;
            if4.h hVar4 = this.f489008f;
            d2Var.f488983f = oVar;
            d2Var.f488984g = hVar4;
            dn.o oVar2 = new dn.o();
            oVar2.f323318d = "task_StoryVideoViewMgr";
            oVar2.f69601xaca5bdda = str;
            oVar2.M1 = str3;
            oVar2.H1 = 1;
            oVar2.Z = 6;
            oVar2.f323342y0 = 4;
            oVar2.f69595x6d25b0d9 = str2;
            oVar2.f323348c2 = d2Var;
            oVar2.f69592xf1ebe47b = 20302;
            oVar2.f69610x4f5245a8 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, str2);
            sf4.u1 u1Var = sf4.u1.f489116a;
            if4.h hVar5 = this.f489008f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar5);
            int i19 = hVar5.f372788c;
            java.lang.String str4 = hVar5.f372791f.f471556f;
            if (str4 == null) {
                b17 = "story_local_video_" + i19;
            } else {
                b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("storyvideo", i19, "story", str4);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                b17 = null;
            }
            sf4.u1.f489127l = b17;
            sf4.u1.f489128m = java.lang.Long.valueOf(hVar5.f372787b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "markCurrentPlay:" + sf4.u1.f489127l + " then remove it from preload");
            java.util.Iterator it = sf4.u1.f489124i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, ((sf4.q1) obj).f489106c)) {
                        break;
                    }
                }
            }
            sf4.q1 q1Var = (sf4.q1) obj;
            if (q1Var != null) {
                sf4.u1.f489124i.remove(q1Var);
                sf4.u1.f489116a.d(q1Var.f489104a);
            }
            if4.h hVar6 = this.f489011i.f489037f;
            if (hVar6 != null) {
                mf4.b bVar2 = mf4.b.f407675a;
                long j18 = hVar6.f372787b;
                nf4.o oVar3 = this.f489006d;
                if (oVar3 != null) {
                    int i27 = oVar3.f66549x799e9d9e;
                }
                java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
                java.util.Map map2 = mf4.b.f407677c;
                if (map2.containsKey(valueOf2)) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(map2.get(java.lang.Long.valueOf(j18)));
                }
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().f(oVar2);
            if4.h hVar7 = this.f489008f;
            if (hVar7 == null || str == null) {
                return;
            }
            sf4.u1 u1Var2 = sf4.u1.f489116a;
            java.lang.String a17 = k0Var.a(hVar7.f372788c, hVar7.f372791f.f471556f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "checkPreloadOnVideoPlay:" + a17);
            nf4.o b19 = k0Var.b(hVar7);
            int i28 = b19.f66549x799e9d9e;
            if (i28 <= 0 || (i18 = b19.f66552x78351860) <= 0) {
                i17 = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", a17 + " not hit cache or moov not ready");
                p1Var = new sf4.p1(false, 0L, 0L, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "hit cache, mediaId:" + a17 + ", cachePercent:" + (i28 / i18) + ", filePath:" + b19.f66550xf1e9b966);
                java.lang.String str5 = b19.f66550xf1e9b966;
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
                long[] jArr = new long[2];
                c2CDownloadRequest.f17792xcd096f43 = a17;
                c2CDownloadRequest.f17793xd428dad6 = 6;
                c2CDownloadRequest.url = hVar7.f372791f.f471556f;
                c2CDownloadRequest.m37861xfb0731c4(str5);
                c2CDownloadRequest.f17826x479f4643 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(1, str5);
                boolean m37764x7493d10a = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37764x7493d10a(c2CDownloadRequest, jArr);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(a17);
                sb6.append(" queryMoovReady: ");
                sb6.append(m37764x7493d10a);
                sb6.append(", offset:");
                sb6.append(jArr[0]);
                sb6.append(", length:");
                sb6.append(jArr[1]);
                sb6.append(", preloadFinish:");
                java.util.Set set = sf4.u1.f489123h;
                sb6.append(kz5.n0.O(set, a17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
                i17 = 0;
                p1Var = new sf4.p1(true, jArr[0], jArr[1], kz5.n0.O(set, a17));
            }
            sf4.p1 p1Var2 = p1Var;
            if (!p1Var2.f489089a || d2Var.f488981d) {
                return;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkPreloadOnVideoPlay ");
            sb7.append(str);
            sb7.append(", moovReady, offset:");
            sb7.append(p1Var2.f489090b);
            sb7.append(", length:");
            sb7.append(p1Var2.f489091c);
            sb7.append(", cacheSize:");
            nf4.o oVar4 = this.f489006d;
            sb7.append(oVar4 != null ? java.lang.Integer.valueOf(oVar4.f66549x799e9d9e) : null);
            sb7.append(", totalSize:");
            nf4.o oVar5 = this.f489006d;
            sb7.append(oVar5 != null ? java.lang.Integer.valueOf(oVar5.f66552x78351860) : null);
            sb7.append(", preloadFinish:");
            sb7.append(p1Var2.f489092d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb7.toString());
            long j19 = p1Var2.f489090b;
            if (j19 > 0) {
                long j27 = p1Var2.f489091c;
                if (j27 > 0) {
                    d2Var.mo65708xe7d268fb(str, j19, j27, new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo());
                    nf4.o oVar6 = this.f489006d;
                    this.f489009g = oVar6 != null ? oVar6.f66549x799e9d9e : i17;
                    this.f489010h = p1Var2.f489092d;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r8 == null) goto L67;
     */
    @Override // t21.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.f2.c(java.lang.String):void");
    }

    @Override // t21.i0
    public void d(t21.h0 h0Var) {
        this.f489007e = h0Var;
    }

    @Override // t21.i0
    public boolean e(java.lang.String mediaId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        if4.h hVar = this.f489008f;
        if (hVar != null) {
            nf4.o b17 = ef4.k0.f333992a.b(hVar);
            this.f489006d = b17;
            if (b17.t0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isVideoDataAvailable ");
                sb6.append(mediaId);
                sb6.append(", ");
                sb6.append(i17);
                sb6.append(", ");
                sb6.append(i18);
                sb6.append(", download finish cacheSize:");
                nf4.o oVar = this.f489006d;
                sb6.append(oVar != null ? java.lang.Integer.valueOf(oVar.f66549x799e9d9e) : null);
                sb6.append(" this:");
                sb6.append(this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
                return true;
            }
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        boolean o17 = t21.o2.Di().o(mediaId, i17, i18);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isVideoDataAvailable ");
        sb7.append(mediaId);
        sb7.append(", ");
        sb7.append(i17);
        sb7.append(", ");
        sb7.append(i18);
        sb7.append(", available:");
        sb7.append(o17);
        sb7.append(" cacheSize:");
        nf4.o oVar2 = this.f489006d;
        sb7.append(oVar2 != null ? java.lang.Integer.valueOf(oVar2.f66549x799e9d9e) : null);
        sb7.append(" this:");
        sb7.append(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", sb7.toString());
        return o17;
    }
}
