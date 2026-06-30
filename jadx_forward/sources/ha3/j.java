package ha3;

/* loaded from: classes15.dex */
public final class j extends com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.AbstractC26467x83ec0ba3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361408e;

    /* renamed from: f, reason: collision with root package name */
    public final ha3.l0 f361409f;

    /* renamed from: g, reason: collision with root package name */
    public int f361410g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f361411h;

    /* renamed from: i, reason: collision with root package name */
    public long f361412i;

    /* renamed from: m, reason: collision with root package name */
    public long f361413m;

    /* renamed from: n, reason: collision with root package name */
    public int f361414n;

    /* renamed from: o, reason: collision with root package name */
    public long f361415o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f361416p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f361417q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ha3.v f361418r;

    public j(ha3.v vVar, java.lang.String mainMediaId, java.lang.String rawPreviewUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawPreviewUrl, "rawPreviewUrl");
        this.f361418r = vVar;
        this.f361407d = mainMediaId;
        this.f361408e = "LiteAppVideoHLSPlayer.HLSResourceLoaderProxy";
        this.f361409f = new ha3.l0();
        this.f361411h = "";
        this.f361414n = -1;
        this.f361416p = "";
        this.f361417q = "";
    }

    public final void a() {
        java.util.Objects.toString(this.f361418r.f361473b);
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var = ha3.j0.f361420b;
        h0Var.getClass();
        java.lang.String mainMediaId = this.f361407d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        java.util.Map map = h0Var.f361403e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ha3.e0 e0Var = (ha3.e0) entry.getValue();
            if (!e0Var.f361371f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.i0.y(str, mainMediaId.concat("@"), false) && e0Var.f361372g) {
                    ha3.j0.f361419a.b(str);
                    e0Var.f361372g = false;
                }
            }
        }
    }

    public final void b(java.lang.String fileName, boolean z17) {
        ha3.l0 l0Var = this.f361409f;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        ha3.m0 m0Var = (ha3.m0) ((java.util.LinkedHashMap) l0Var.f361431d).get(fileName);
        l0Var.hashCode();
        if (m0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f361408e, "[prepareTsData] failed: ".concat(fileName));
        } else {
            c(m0Var);
            if (z17) {
                c(l0Var.b(m0Var.f361433a + 1));
            }
        }
    }

    public final void c(ha3.m0 m0Var) {
        dn.o oVar;
        ha3.e0 e0Var;
        boolean z17;
        ha3.e0 e0Var2;
        java.lang.String str = this.f361408e;
        if (m0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[tryDownloadSegment] failed, invalid segmentInfo");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[tryDownloadSegment] seg, " + m0Var.f361435c);
        java.lang.String str2 = m0Var.f361436d;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String segmentFile = m0Var.f361435c;
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var = ha3.j0.f361420b;
        java.lang.String str4 = this.f361418r.f361472a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        h0Var.getClass();
        java.lang.String mainMediaId = this.f361407d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainMediaId, "mainMediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentFile, "segmentFile");
        java.lang.String mediaId = ha3.r0.f361463a.a(mainMediaId, segmentFile);
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(h0Var.f361402d + mainMediaId.concat("_liteapp") + "-hls").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPreviewSegmentTask] try start, mediaId: ");
        sb6.append(mediaId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        try {
            android.net.Uri parse = android.net.Uri.parse(str4);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] create task failed, mediaId: ".concat(mediaId));
            return;
        }
        java.util.Map map = h0Var.f361403e;
        if (map.get(mediaId) == null) {
            e0Var = new ha3.e0();
        } else {
            java.lang.Object obj = map.get(mediaId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
            e0Var = (ha3.e0) obj;
        }
        java.lang.String field_fullpath = oVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
        if (com.p314xaae8f345.mm.vfs.w6.j(field_fullpath)) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(field_fullpath);
            if (map.get(mediaId) == null) {
                e0Var2 = new ha3.e0();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
                e0Var2 = (ha3.e0) obj2;
            }
            e0Var2.f361369d = true;
            e0Var2.f361366a = k17;
            e0Var2.f361368c = k17;
            e0Var2.f361370e = field_fullpath;
            e0Var2.f361372g = false;
            map.put(mediaId, e0Var2);
            ha3.e0 e0Var3 = (ha3.e0) map.get(mediaId);
            if (e0Var3 != null) {
                e0Var3.f361372g = false;
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] hit cache, mediaId: ".concat(mediaId));
            return;
        }
        if (e0Var.f361372g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] isDoing: mediaId: ".concat(mediaId));
            return;
        }
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(mediaId)) {
            int b17 = ha3.j0.f361419a.b(mediaId);
            e0Var.f361372g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] cancel for restart, mediaId: " + mediaId + " cancelResult:" + b17);
        }
        java.lang.String field_fullpath2 = oVar.f69595x6d25b0d9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath2, "field_fullpath");
        e0Var.f361370e = field_fullpath2;
        e0Var.f361372g = true;
        oVar.f323348c2 = h0Var;
        ha3.i0 i0Var2 = ha3.j0.f361419a;
        i0Var2.getClass();
        java.lang.String str6 = oVar.f69595x6d25b0d9;
        java.lang.String str7 = oVar.f69595x6d25b0d9 + "_temp";
        oVar.f69595x6d25b0d9 = str7;
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest b18 = ha3.r0.f361463a.b(oVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
        if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(b18, i0Var2, new ha3.q0(i0Var2, str7, str6), 0) == 0) {
            java.util.HashMap hashMap = i0Var2.f361406d;
            java.lang.String field_mediaId = oVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, oVar);
        }
        map.put(mediaId, e0Var);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getContentType */
    public java.lang.String mo103118xc2a49a1d(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (r26.i0.n(fileName, ".ts", false)) {
            return "video/mp2t";
        }
        java.util.Objects.toString(this.f361418r.f361473b);
        return "application/vnd.apple.mpegurl";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataFilePath */
    public java.lang.String mo103119x84354c01(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f361463a.a(this.f361407d, fileName);
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.e0 c17 = ha3.j0.f361420b.c(a17);
        java.lang.String str2 = c17 != null ? c17.f361370e : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.util.Objects.toString(this.f361418r.f361473b);
        return str2;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: getDataTotalSize */
    public long mo103120x2f5bd925(int i17, java.lang.String fileName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f361463a.a(this.f361407d, fileName);
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.h0 h0Var = ha3.j0.f361420b;
        ha3.e0 c17 = h0Var.c(a17);
        java.lang.String str2 = c17 != null ? c17.f361370e : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
        ha3.v vVar = this.f361418r;
        java.lang.String str3 = this.f361408e;
        if (j17) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str2);
            if (k17 == 0) {
                com.p314xaae8f345.mm.vfs.w6.h(str2);
                b(fileName, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[getDataTotalSize] res exist but length = 0, retry download mediaId=" + a17 + " fileName=" + fileName);
                return k17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[getDataTotalSize] res exist, player: " + vVar.f361473b + " mediaId=" + a17 + " fileName=" + fileName + " localTotalSize:" + k17);
            return k17;
        }
        ha3.e0 c18 = h0Var.c(a17);
        java.lang.Long valueOf = c18 != null ? java.lang.Long.valueOf(c18.f361368c) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        long longValue = valueOf.longValue();
        if (this.f361415o != longValue || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361416p, fileName)) {
            this.f361415o = longValue;
            this.f361416p = fileName;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[getDataTotalSize] wait to download, player: " + vVar.f361473b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
        }
        if (longValue <= 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361417q, fileName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "[getDataTotalSize] error, player: " + vVar.f361473b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
            this.f361417q = fileName;
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
        ha3.v vVar;
        ha3.l0 l0Var;
        ha3.v vVar2;
        java.util.Iterator it;
        ha3.l0 l0Var2;
        double d17;
        java.util.Iterator it6;
        ha3.v vVar3 = this.f361418r;
        java.lang.String str3 = vVar3.f361474c;
        ?? r47 = 0;
        boolean z17 = vVar3.f361475d.length() == 0;
        ha3.l0 l0Var3 = this.f361409f;
        if (z17) {
            java.lang.String rawM3U8Content = vVar3.f361474c;
            l0Var3.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawM3U8Content, "rawM3U8Content");
            java.lang.StringBuilder sb6 = l0Var3.f361429b;
            r26.e0.d(sb6);
            java.util.ArrayList arrayList = (java.util.ArrayList) l0Var3.f361430c;
            arrayList.clear();
            java.util.Map map = l0Var3.f361431d;
            ((java.util.LinkedHashMap) map).clear();
            java.util.Iterator it7 = new r26.t("\\r?\\n").g(rawM3U8Content, 0).iterator();
            int i18 = 0;
            ha3.m0 m0Var = null;
            java.util.LinkedHashMap linkedHashMap = null;
            while (it7.hasNext()) {
                java.lang.String obj = r26.n0.u0((java.lang.String) it7.next()).toString();
                if (!(obj.length() == 0 ? true : r47)) {
                    if (r26.i0.y(obj, "#EXT-X-MEDIA-SEQUENCE:", r47)) {
                        java.lang.String substring = obj.substring(22);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        java.lang.Integer h17 = r26.h0.h(substring);
                        l0Var3.f361428a = h17 != null ? h17.intValue() : r47;
                        l0Var3.a(obj);
                    } else if (r26.i0.y(obj, "#EXT-X-TARGETDURATION:", r47)) {
                        java.lang.String substring2 = obj.substring(22);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                        java.lang.Double e17 = r26.g0.e(substring2);
                        if (e17 != null) {
                            e17.doubleValue();
                        }
                        l0Var3.a(obj);
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
                            l0Var3.a(obj);
                            vVar2 = vVar3;
                            l0Var2 = l0Var3;
                            linkedHashMap = linkedHashMap2;
                        } else {
                            it = it7;
                            if (r26.i0.y(obj, "#EXTINF:", r47)) {
                                m0Var = new ha3.m0(0, 0.0d, null, null, null, 31, null);
                                m0Var.f361433a = l0Var3.f361428a + i18;
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
                                vVar2 = vVar3;
                                if (e18 != null) {
                                    double doubleValue = e18.doubleValue();
                                    l0Var2 = l0Var3;
                                    d17 = doubleValue;
                                } else {
                                    l0Var2 = l0Var3;
                                    d17 = 0.0d;
                                }
                                m0Var.f361434b = java.lang.Math.max(0.0d, d17);
                                m0Var.f361437e = linkedHashMap;
                                l0Var2.a(obj);
                            } else {
                                vVar2 = vVar3;
                                l0Var2 = l0Var3;
                                if (!r26.i0.y(obj, "#", false) && m0Var != null) {
                                    java.lang.String str5 = i18 + ".ts";
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                                    m0Var.f361435c = str5;
                                    m0Var.f361436d = obj;
                                    map.put(str5, m0Var);
                                    arrayList.add(m0Var);
                                    obj = m0Var.f361435c;
                                    m0Var = null;
                                }
                                l0Var2.a(obj);
                            }
                        }
                        l0Var3 = l0Var2;
                        vVar3 = vVar2;
                        r47 = 0;
                        it7 = it;
                    }
                }
                vVar2 = vVar3;
                it = it7;
                l0Var2 = l0Var3;
                l0Var3 = l0Var2;
                vVar3 = vVar2;
                r47 = 0;
                it7 = it;
            }
            vVar = vVar3;
            l0Var = l0Var3;
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            vVar.f361475d = sb7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f361408e, "[tryDownloadSegment] index: 0");
            c(l0Var.b(0));
        } else {
            vVar = vVar3;
            l0Var = l0Var3;
        }
        l0Var.getClass();
        return vVar.f361475d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onReadData */
    public int mo103121x715d255f(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f361463a.a(this.f361407d, fileName);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361411h, a17);
        ha3.v vVar = this.f361418r;
        if (!b17 || j17 != this.f361412i || j18 != this.f361413m || this.f361414n != vVar.f361479h) {
            java.util.Objects.toString(vVar.f361473b);
            int i18 = vVar.f361479h;
            this.f361412i = j17;
            this.f361413m = j18;
            this.f361411h = a17;
            this.f361414n = i18;
        }
        if (j18 <= 0) {
            return 0;
        }
        ha3.i0 i0Var = ha3.j0.f361419a;
        ha3.e0 c17 = ha3.j0.f361420b.c(a17);
        if (c17 != null && c17.f361369d) {
            return (int) j18;
        }
        if (vVar.f361479h == 6 || !((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37796x95bf072(a17)) {
            int i19 = vVar.f361479h;
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
        ha3.r0.f361463a.a(this.f361407d, fileName);
        java.util.Objects.toString(this.f361418r.f361473b);
        b(fileName, true);
        int i18 = this.f361410g;
        this.f361410g = i18 + 1;
        return i18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c
    /* renamed from: onStopReadData */
    public int mo103123xfb96d801(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        ha3.r0.f361463a.a(this.f361407d, fileName);
        java.util.Objects.toString(this.f361418r.f361473b);
        return this.f361410g;
    }
}
