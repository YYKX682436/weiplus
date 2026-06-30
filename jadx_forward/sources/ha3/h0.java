package ha3;

/* loaded from: classes15.dex */
public final class h0 implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361402d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f361403e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f361404f;

    public h0() {
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.g() + "/video/";
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.u(str);
        }
        this.f361402d = java.lang.String.valueOf(str);
        this.f361403e = java.util.Collections.synchronizedMap(new java.util.HashMap());
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "getCdnAuthInfo mediaId:" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ha3.f0
            if (r0 == 0) goto L13
            r0 = r6
            ha3.f0 r0 = (ha3.f0) r0
            int r1 = r0.f361382h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f361382h = r1
            goto L18
        L13:
            ha3.f0 r0 = new ha3.f0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f361380f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f361382h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f361379e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f361378d
            ha3.h0 r5 = (ha3.h0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L72
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            ha3.r0 r6 = ha3.r0.f361463a
            java.util.Map r6 = ha3.r0.f361464b
            java.util.LinkedHashMap r6 = (java.util.LinkedHashMap) r6
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4e
            jz5.l r0 = new jz5.l
            r0.<init>(r5, r6)
            return r0
        L4e:
            r0.f361378d = r4
            r0.f361379e = r5
            r0.f361382h = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r6 = pz5.f.b(r0)
            r5.<init>(r6, r3)
            r5.k()
            r4.f361404f = r5
            ha3.g0 r6 = new ha3.g0
            r6.<init>(r4)
            r5.m(r6)
            java.lang.Object r6 = r5.j()
            if (r6 != r1) goto L71
            return r1
        L71:
            r5 = r4
        L72:
            jz5.l r6 = (jz5.l) r6
            r0 = 0
            r5.f361404f = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ha3.h0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final ha3.e0 b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        return (ha3.e0) this.f361403e.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
    }

    public final ha3.e0 c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (ha3.e0) this.f361403e.get(str);
    }

    public final int d(java.lang.String str, int i17) {
        java.lang.String str2;
        int i18;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask url is null");
            return -1;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask url: " + str + ", mediaId: " + b17 + ", ratio: " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("_liteapp");
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(this.f361402d + sb6.toString()).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "preloadTask filePath: ".concat(o17));
        java.util.Map map = this.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var == null) {
            e0Var = new ha3.e0();
        }
        if (e0Var.f361375j) {
            str2 = "MicroMsg.LiteAppVideoPlayerCdnDownloadMgr";
            if (e0Var.f361366a < (e0Var.f361368c * i17) / 100) {
                e0Var.f361375j = false;
            }
        } else {
            str2 = "MicroMsg.LiteAppVideoPlayerCdnDownloadMgr";
        }
        if (e0Var.f361369d || e0Var.f361375j || e0Var.f361372g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "preload task has downloaded or isDoing, mediaId: " + b17 + ", complete: " + e0Var.f361369d + ", preloadComplete: " + e0Var.f361375j + ", isDoing: " + e0Var.f361372g);
        } else {
            dn.o oVar = new dn.o();
            oVar.f323318d = "task_FlutterCdnDownloadMgr_1";
            oVar.f69601xaca5bdda = b17;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.Y = 2;
            oVar.H1 = 2;
            oVar.Z = 3;
            oVar.f69610x4f5245a8 = 0;
            oVar.f69595x6d25b0d9 = o17;
            oVar.f323342y0 = 8;
            oVar.f323339x0 = 1;
            oVar.f323348c2 = this;
            oVar.f323320f = this;
            oVar.f323329p0 = this;
            oVar.f69608x6ac8fea7 = i17;
            if (!((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(b17)) {
                ha3.i0 i0Var = ha3.j0.f361419a;
                i18 = ha3.j0.f361419a.a(oVar);
                e0Var.f361372g = true;
                e0Var.f361374i = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "preload addDownloadTask mediaId: " + b17);
                e0Var.f361370e = o17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
                map.put(b17, e0Var);
                return i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "preload task has existed mediaId: " + b17);
        }
        i18 = -1;
        e0Var.f361370e = o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(b17, e0Var);
        return i18;
    }

    public final void e(java.lang.String str, boolean z17, java.lang.Long l17) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask url is null");
            return;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask url: " + str + ", mediaId: " + b17 + ", minLength: " + l17);
        ha3.e0 b18 = b(str);
        if (b18 == null) {
            b18 = new ha3.e0();
        }
        if (z17) {
            if (!b18.f361372g || !b18.f361374i) {
                h(str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", play mode is downloading");
            return;
        }
        if (b18.f361372g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", is already downloading, isPlayMode: " + z17 + ", curMode: " + b18.f361374i);
            return;
        }
        if (!b18.f361375j || (l17 != null && l17.longValue() != 0 && b18.f361367b < l17.longValue())) {
            if (l17 != null) {
                d(str, (int) (((l17.longValue() * 1.0d) / b18.f361368c) * 100));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "retryStartTask mediaId: " + b17 + ", preload already done");
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onProgress mediaId: " + str + ", offset: " + j17 + ", total: " + j18);
        if (str != null) {
            java.util.Map map = this.f361403e;
            ha3.e0 e0Var = (ha3.e0) map.get(str);
            if (e0Var == null) {
                e0Var = new ha3.e0();
            }
            e0Var.f361366a = j17;
            e0Var.f361368c = j18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
            map.put(str, e0Var);
            if (j17 == j18 && !e0Var.f361369d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onProgress task is complete, mediaId: ".concat(str));
                e0Var.f361369d = true;
            }
            double d17 = ((j17 * 100.0d) / j18) * 1.0d;
            ha3.i0 i0Var = ha3.j0.f361419a;
            ha3.a aVar = (ha3.a) ha3.j0.f361421c.get(str);
            if (aVar != null) {
                aVar.l(java.lang.Double.valueOf(d17));
            }
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish mediaId: " + str + ", ret: " + i17 + ", sceneResult: " + hVar);
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(str);
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish but mediaId: " + str + " not found");
            return;
        }
        long j17 = hVar.f69523x17c343e7;
        e0Var.f361366a = j17;
        e0Var.f361368c = j17;
        e0Var.f361369d = true;
        e0Var.f361372g = false;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(str, e0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onFinish mediaId:" + str + ", is playMode:" + e0Var.f361374i);
    }

    public final void h(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask url is null");
            return;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        if (r26.i0.y(str, "preview://", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask abort, only preview, url:" + str + ", mediaId: " + b17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask url: " + str + ", mediaId: " + b17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(b17);
        sb6.append("_liteapp");
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(this.f361402d + sb6.toString()).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.util.Map map = this.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var == null) {
            e0Var = new ha3.e0();
        }
        if (e0Var.f361372g && e0Var.f361374i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask playMode is downloading, mediaId: " + b17);
            return;
        }
        if (e0Var.f361369d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask mediaId: " + b17 + " has downloaded.");
        } else {
            dn.o oVar = new dn.o();
            oVar.f323318d = "task_FlutterCdnDownloadMgr_2";
            oVar.f69601xaca5bdda = b17;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.Y = 1;
            oVar.H1 = 1;
            oVar.Z = 3;
            oVar.f69610x4f5245a8 = 0;
            oVar.f69595x6d25b0d9 = o17;
            oVar.f323342y0 = 8;
            oVar.f323348c2 = this;
            for (java.lang.String str2 : map.keySet()) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, b17) && ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(str2)) {
                    ha3.i0 i0Var = ha3.j0.f361419a;
                    ha3.i0 i0Var2 = ha3.j0.f361419a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    int b18 = i0Var2.b(str2);
                    ha3.e0 e0Var2 = (ha3.e0) map.get(str2);
                    if (e0Var2 != null) {
                        e0Var2.f361372g = false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask cancel downloadTask mediaId: " + b17 + ", ret: " + b18);
                }
            }
            if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(b17) && !e0Var.f361374i) {
                ha3.i0 i0Var3 = ha3.j0.f361419a;
                ha3.i0 i0Var4 = ha3.j0.f361419a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                int b19 = i0Var4.b(b17);
                e0Var.f361372g = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask cancel downloadTask because not in playMode, mediaId: " + b17 + ", ret: " + b19);
            }
            ha3.i0 i0Var5 = ha3.j0.f361419a;
            int a17 = ha3.j0.f361419a.a(oVar);
            e0Var.f361372g = true;
            e0Var.f361374i = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "startTask addDownload mediaId: " + b17 + ", ret: " + a17 + ", path: " + o17);
        }
        e0Var.f361370e = o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(b17, e0Var);
    }

    public final int i(java.lang.String str, boolean z17) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "stopTask url is null.");
            return -1;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "stopTask url: " + str + ", mediaId: " + b17);
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.i0 i0Var2 = ha3.j0.f361419a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        int b18 = i0Var2.b(b17);
        java.util.Map map = this.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(b17);
        if (e0Var != null) {
            e0Var.f361372g = false;
        }
        if (z17) {
            map.remove(b17);
        }
        return b18;
    }

    @Override // dn.n
    /* renamed from: onDataAvailable */
    public void mo65706x9bb59ea0(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onMoovReady mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
    }

    @Override // dn.n
    /* renamed from: onM3U8Ready */
    public void mo65707xc5dd699b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onM3U8Ready mediaId: " + str + ", m3u8: " + str2);
        if (str == null || str2 == null) {
            return;
        }
        ha3.r0 r0Var = ha3.r0.f361463a;
        ha3.r0.f361464b.put(str, str2);
        jz5.l lVar = new jz5.l(str, str2);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f361404f;
        if (qVar != null) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lVar));
        }
        this.f361404f = null;
    }

    @Override // dn.n
    /* renamed from: onMoovReady */
    public void mo65708xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onMoovReady mediaId: " + str + ", offset: " + j17 + ", length: " + j18 + ", info: " + videoInfo);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.util.Objects.toString(gVar);
        java.util.Objects.toString(hVar);
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "decodePrepareResponse mediaId:" + str);
        return new byte[0];
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onPreloadCompleted mediaId: " + str + ", sceneResult: " + hVar);
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = this.f361403e;
        ha3.e0 e0Var = (ha3.e0) map.get(str);
        if (e0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "onPreloadCompleted, but task not found, mediaId:".concat(str));
            return;
        }
        e0Var.f361368c = hVar.f69523x17c343e7;
        e0Var.f361367b = hVar.f69548xe026fea1;
        e0Var.f361375j = true;
        e0Var.f361372g = false;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(str, e0Var);
    }
}
