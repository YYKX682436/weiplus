package x03;

/* loaded from: classes15.dex */
public final class s extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532644d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f532645e;

    /* renamed from: f, reason: collision with root package name */
    public final x03.t1 f532646f;

    /* renamed from: g, reason: collision with root package name */
    public long f532647g;

    /* renamed from: h, reason: collision with root package name */
    public int f532648h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f532649i;

    /* renamed from: m, reason: collision with root package name */
    public long f532650m;

    /* renamed from: n, reason: collision with root package name */
    public long f532651n;

    /* renamed from: o, reason: collision with root package name */
    public int f532652o;

    /* renamed from: p, reason: collision with root package name */
    public long f532653p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f532654q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f532655r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f532656s;

    public s(x03.i0 i0Var, java.lang.String mainMediaId, java.lang.String rawPreviewUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawPreviewUrl, "rawPreviewUrl");
        this.f532656s = i0Var;
        this.f532644d = mainMediaId;
        this.f532645e = "FlutterVideoHLSPlayer.HLSResourceLoaderProxy";
        this.f532646f = new x03.t1();
        this.f532649i = "";
        this.f532652o = -1;
        this.f532654q = "";
        this.f532655r = "";
    }

    public final void a(java.lang.String fileName, boolean z17) {
        x03.t1 t1Var = this.f532646f;
        t1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.u1 u1Var = (x03.u1) ((java.util.LinkedHashMap) t1Var.f532663d).get(fileName);
        t1Var.hashCode();
        if (u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f532645e, "[prepareTsData] failed: ".concat(fileName));
        } else {
            b(u1Var);
            if (z17) {
                b(t1Var.b(u1Var.f532679a + 1));
            }
        }
    }

    public final void b(x03.u1 u1Var) {
        dn.o oVar;
        x03.f fVar;
        boolean z17;
        x03.f fVar2;
        java.lang.String str = this.f532645e;
        if (u1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[tryDownloadSegment] failed, invalid segmentInfo");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[tryDownloadSegment] seg, " + u1Var.f532681c);
        java.lang.String str2 = u1Var.f532682d;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String segmentFile = u1Var.f532681c;
        x03.v0 v0Var = x03.x0.f532694d;
        x03.x0 a17 = v0Var.a();
        java.lang.String rawUrl = this.f532656s.f532582f;
        x03.i iVar = a17.f532697b;
        iVar.getClass();
        java.lang.String mainMediaId = this.f532644d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawUrl, "rawUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentFile, "segmentFile");
        java.lang.String mediaId = x03.z1.f532711a.a(mainMediaId, segmentFile);
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(iVar.f532572e + '-' + mainMediaId + "-hls").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPreviewSegmentTask] try start, mediaId: ");
        sb6.append(mediaId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str4 = iVar.f532571d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        try {
            android.net.Uri parse = android.net.Uri.parse(rawUrl);
            java.lang.String host = parse.getHost();
            java.lang.String queryParameter = parse.getQueryParameter("aesKey");
            java.lang.String str5 = o17 + '/' + mediaId;
            java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
            if (queryParameter2 == null) {
                queryParameter2 = "mp4";
            }
            oVar = dn.e.a(mediaId, str3, host, queryParameter, str5, queryParameter2);
        } catch (java.lang.Exception unused) {
            oVar = null;
        }
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "[startPreviewSegmentTask] create task failed, mediaId: ".concat(mediaId));
            return;
        }
        java.util.Map map = iVar.f532574g;
        if (map.get(mediaId) == null) {
            fVar = new x03.f();
        } else {
            java.lang.Object obj = map.get(mediaId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            fVar = (x03.f) obj;
        }
        java.lang.String field_fullpath = oVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
        if (com.p314xaae8f345.mm.vfs.w6.j(field_fullpath)) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(field_fullpath);
            if (map.get(mediaId) == null) {
                fVar2 = new x03.f();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar2 = (x03.f) obj2;
            }
            fVar2.f532548d = true;
            fVar2.f532545a = k17;
            fVar2.f532547c = k17;
            fVar2.f532549e = field_fullpath;
            fVar2.f532551g = false;
            map.put(mediaId, fVar2);
            x03.f fVar3 = (x03.f) map.get(mediaId);
            if (fVar3 != null) {
                fVar3.f532551g = false;
            }
            iVar.f532573f = null;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, "[startPreviewSegmentTask] hit cache, mediaId: ".concat(mediaId));
            return;
        }
        if (fVar.f532551g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "[startPreviewSegmentTask] isDoing: mediaId: ".concat(mediaId));
            return;
        }
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(mediaId)) {
            int b17 = v0Var.a().f532698c.b(mediaId);
            fVar.f532551g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "[startPreviewSegmentTask] cancel for restart, mediaId: " + mediaId + " cancelResult:" + b17);
        }
        java.lang.String field_fullpath2 = oVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath2, "field_fullpath");
        fVar.f532549e = field_fullpath2;
        fVar.f532551g = true;
        oVar.f323348c2 = iVar;
        x03.j jVar = v0Var.a().f532698c;
        jVar.getClass();
        java.lang.String str6 = oVar.f69595x6d25b0d9;
        java.lang.String str7 = oVar.f69595x6d25b0d9 + "_temp";
        oVar.f69595x6d25b0d9 = str7;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest b18 = x03.z1.f532711a.b(oVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(b18, jVar, new x03.y1(jVar, str7, str6), 0) == 0) {
            java.util.HashMap hashMap = jVar.f532593d;
            java.lang.String field_mediaId = oVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, oVar);
        }
        map.put(mediaId, fVar);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (r26.i0.n(fileName, ".ts", false)) {
            return "video/mp2t";
        }
        java.util.Objects.toString(this.f532656s.f532578b);
        return "application/vnd.apple.mpegurl";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String str2 = x03.x0.f532694d.a().f532697b.b(x03.z1.f532711a.a(this.f532644d, fileName)).f532549e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.util.Objects.toString(this.f532656s.f532578b);
        return str2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String a17 = x03.z1.f532711a.a(this.f532644d, fileName);
        x03.v0 v0Var = x03.x0.f532694d;
        java.lang.String str2 = v0Var.a().f532697b.b(a17).f532549e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
        x03.i0 i0Var = this.f532656s;
        java.lang.String str3 = this.f532645e;
        if (j17) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
            if (k17 == 0) {
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                a(fileName, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[getDataTotalSize] res exist but length = 0, retry download mediaId=" + a17 + " fileName=" + fileName);
                return k17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[getDataTotalSize] res exist, player: " + i0Var.f532578b + " mediaId=" + a17 + " fileName=" + fileName + " localTotalSize:" + k17);
            return k17;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(v0Var.a().f532697b.b(a17).f532547c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        long longValue = valueOf.longValue();
        if (this.f532653p != longValue || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532654q, fileName)) {
            this.f532653p = longValue;
            this.f532654q = fileName;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[getDataTotalSize] wait to download, player: " + i0Var.f532578b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
        }
        if (longValue <= 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532655r, fileName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[getDataTotalSize] error, player: " + i0Var.f532578b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
            this.f532655r = fileName;
        }
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3, com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getM3U8Content */
    public java.lang.String mo103114x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
        x03.i0 i0Var;
        x03.t1 t1Var;
        x03.i0 i0Var2;
        java.util.Iterator it;
        x03.t1 t1Var2;
        double d17;
        java.util.Iterator it6;
        x03.i0 i0Var3 = this.f532656s;
        java.lang.String str3 = i0Var3.f532586j;
        ?? r47 = 0;
        boolean z17 = i0Var3.f532587k.length() == 0;
        x03.t1 t1Var3 = this.f532646f;
        if (z17) {
            java.lang.String rawM3U8Content = i0Var3.f532586j;
            t1Var3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawM3U8Content, "rawM3U8Content");
            java.lang.StringBuilder sb6 = t1Var3.f532661b;
            r26.e0.d(sb6);
            java.util.ArrayList arrayList = (java.util.ArrayList) t1Var3.f532662c;
            arrayList.clear();
            java.util.Map map = t1Var3.f532663d;
            ((java.util.LinkedHashMap) map).clear();
            java.util.Iterator it7 = new r26.t("\\r?\\n").g(rawM3U8Content, 0).iterator();
            int i18 = 0;
            x03.u1 u1Var = null;
            java.util.LinkedHashMap linkedHashMap = null;
            while (it7.hasNext()) {
                java.lang.String obj = r26.n0.u0((java.lang.String) it7.next()).toString();
                if (!(obj.length() == 0 ? true : r47)) {
                    if (r26.i0.y(obj, "#EXT-X-MEDIA-SEQUENCE:", r47)) {
                        java.lang.String substring = obj.substring(22);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        java.lang.Integer h17 = r26.h0.h(substring);
                        t1Var3.f532660a = h17 != null ? h17.intValue() : r47;
                        t1Var3.a(obj);
                    } else if (r26.i0.y(obj, "#EXT-X-TARGETDURATION:", r47)) {
                        java.lang.String substring2 = obj.substring(22);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        java.lang.Double e17 = r26.g0.e(substring2);
                        if (e17 != null) {
                            e17.doubleValue();
                        }
                        t1Var3.a(obj);
                    } else {
                        if (r26.i0.y(obj, "#EXT-X-KEY:", r47)) {
                            java.lang.String substring3 = obj.substring(11);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
                            java.util.List f07 = r26.n0.f0(substring3, new java.lang.String[]{","}, false, 0, 6, null);
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.Iterator it8 = f07.iterator();
                            while (it8.hasNext()) {
                                java.util.List f08 = r26.n0.f0((java.lang.String) it8.next(), new java.lang.String[]{"="}, false, 2, 2, null);
                                java.util.Iterator it9 = it7;
                                if (f08.size() >= 2) {
                                    java.lang.String obj2 = r26.n0.u0((java.lang.String) f08.get(r47)).toString();
                                    java.lang.String obj3 = r26.n0.u0((java.lang.String) f08.get(1)).toString();
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, "URI")) {
                                        it6 = it8;
                                        if (r26.i0.A(obj3, "\"", r47, 2, null) && r26.i0.n(obj3, "\"", r47)) {
                                            obj3 = obj3.substring(1, obj3.length() - 1);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "substring(...)");
                                            linkedHashMap2.put(obj2, obj3);
                                        }
                                    } else {
                                        it6 = it8;
                                    }
                                    linkedHashMap2.put(obj2, obj3);
                                } else {
                                    it6 = it8;
                                }
                                it8 = it6;
                                it7 = it9;
                            }
                            it = it7;
                            t1Var3.a(obj);
                            i0Var2 = i0Var3;
                            t1Var2 = t1Var3;
                            linkedHashMap = linkedHashMap2;
                        } else {
                            it = it7;
                            if (r26.i0.y(obj, "#EXTINF:", r47)) {
                                u1Var = new x03.u1(0, 0.0d, null, null, null, 31, null);
                                u1Var.f532679a = t1Var3.f532660a + i18;
                                i18++;
                                java.lang.String substring4 = obj.substring(8);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                                int K = r26.n0.K(substring4, ',', 0, false, 6, null);
                                java.lang.String str4 = substring4;
                                if (K != -1) {
                                    java.lang.String substring5 = substring4.substring(r47, K);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring5, "substring(...)");
                                    str4 = substring5;
                                }
                                java.lang.Double e18 = r26.g0.e(str4);
                                i0Var2 = i0Var3;
                                if (e18 != null) {
                                    double doubleValue = e18.doubleValue();
                                    t1Var2 = t1Var3;
                                    d17 = doubleValue;
                                } else {
                                    t1Var2 = t1Var3;
                                    d17 = 0.0d;
                                }
                                u1Var.f532680b = java.lang.Math.max(0.0d, d17);
                                u1Var.f532683e = linkedHashMap;
                                t1Var2.a(obj);
                            } else {
                                i0Var2 = i0Var3;
                                t1Var2 = t1Var3;
                                if (!r26.i0.y(obj, "#", false) && u1Var != null) {
                                    java.lang.String str5 = i18 + ".ts";
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                                    u1Var.f532681c = str5;
                                    u1Var.f532682d = obj;
                                    map.put(str5, u1Var);
                                    arrayList.add(u1Var);
                                    obj = u1Var.f532681c;
                                    u1Var = null;
                                }
                                t1Var2.a(obj);
                            }
                        }
                        t1Var3 = t1Var2;
                        i0Var3 = i0Var2;
                        r47 = 0;
                        it7 = it;
                    }
                }
                i0Var2 = i0Var3;
                it = it7;
                t1Var2 = t1Var3;
                t1Var3 = t1Var2;
                i0Var3 = i0Var2;
                r47 = 0;
                it7 = it;
            }
            i0Var = i0Var3;
            t1Var = t1Var3;
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            i0Var.f532587k = sb7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f532645e, "[tryDownloadSegment] index: 0");
            b(t1Var.b(0));
        } else {
            i0Var = i0Var3;
            t1Var = t1Var3;
        }
        t1Var.getClass();
        return i0Var.f532587k;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String a17 = x03.z1.f532711a.a(this.f532644d, fileName);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532649i, a17) || j17 != this.f532650m || j18 != this.f532651n || this.f532652o != this.f532656s.f532584h) {
            java.util.Objects.toString(this.f532656s.f532578b);
            int i18 = this.f532656s.f532584h;
            this.f532650m = j17;
            this.f532651n = j18;
            this.f532649i = a17;
            this.f532652o = i18;
        }
        if (j18 <= 0) {
            return 0;
        }
        x03.f b17 = x03.x0.f532694d.a().f532697b.b(a17);
        long j19 = this.f532647g;
        long j27 = b17.f532545a;
        if (j19 != j27) {
            this.f532647g = j27;
            ((ku5.t0) ku5.t0.f394148d).B(new x03.r(this.f532656s));
        }
        if (b17.f532548d) {
            return (int) j18;
        }
        if (this.f532656s.f532584h == 6 || !((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(a17)) {
            int i19 = this.f532656s.f532584h;
            return 0;
        }
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37752x9b94c84e(a17, j17, j18)) {
            return (int) j18;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStartReadData */
    public int mo103122x6e58d43(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.z1.f532711a.a(this.f532644d, fileName);
        java.util.Objects.toString(this.f532656s.f532578b);
        a(fileName, true);
        int i18 = this.f532648h;
        this.f532648h = i18 + 1;
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        x03.z1.f532711a.a(this.f532644d, fileName);
        java.util.Objects.toString(this.f532656s.f532578b);
        return this.f532648h;
    }
}
