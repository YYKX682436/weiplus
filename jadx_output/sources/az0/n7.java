package az0;

/* loaded from: classes5.dex */
public final class n7 {

    /* renamed from: a */
    public final com.tencent.maas.instamovie.MJMovieSession f15742a;

    /* renamed from: b */
    public final dz0.h f15743b;

    /* renamed from: c */
    public com.tencent.maas.instamovie.MJMovieOptions f15744c;

    /* renamed from: d */
    public final jz5.g f15745d;

    /* renamed from: e */
    public final kotlinx.coroutines.y0 f15746e;

    /* renamed from: f */
    public kotlinx.coroutines.r2 f15747f;

    public n7(com.tencent.maas.instamovie.MJMovieSession movieSession, dz0.h initialPatams) {
        kotlin.jvm.internal.o.g(movieSession, "movieSession");
        kotlin.jvm.internal.o.g(initialPatams, "initialPatams");
        this.f15742a = movieSession;
        this.f15743b = initialPatams;
        movieSession.setTextResolver(az0.l5.f15663a);
        this.f15744c = d(initialPatams.f244856b, initialPatams.f244857c);
        this.f15745d = jz5.h.b(az0.t5.f15916d);
        this.f15746e = kotlinx.coroutines.z0.b();
    }

    public static final com.tencent.maas.instamovie.MJMovieOutroInfo a(az0.n7 n7Var) {
        return (com.tencent.maas.instamovie.MJMovieOutroInfo) ((jz5.n) n7Var.f15745d).getValue();
    }

    public static final kotlinx.coroutines.flow.j b(az0.n7 n7Var, az0.b0 b0Var, com.tencent.maas.instamovie.MJExportSettings exportSettings, boolean z17) {
        n7Var.getClass();
        java.lang.String str = b0Var.f15338a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "retry export");
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "delete previous video file");
                r6Var.l();
            }
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, true);
        if (i17 == null) {
            i17 = str;
        }
        kotlin.jvm.internal.o.d(i17);
        bz0.f fVar = bz0.f.f36735a;
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession = n7Var.f15742a;
        com.tencent.maas.model.MJTemplateInfo currentTemplateInfo = mJMovieSession.getCurrentTemplateInfo();
        java.lang.String templateID = currentTemplateInfo != null ? currentTemplateInfo.getTemplateID() : null;
        if (templateID == null) {
            templateID = "";
        }
        com.tencent.maas.model.MJMusicInfo currentMusicInfo = mJMovieSession.getCurrentMusicInfo();
        java.lang.String musicID = currentMusicInfo != null ? currentMusicInfo.getMusicID() : null;
        java.lang.String str2 = musicID != null ? musicID : "";
        com.tencent.maas.instamovie.MJMovieOptions movieOption = n7Var.f15744c;
        kotlin.jvm.internal.o.g(movieOption, "movieOption");
        kotlin.jvm.internal.o.g(exportSettings, "exportSettings");
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct = bz0.f.f36737c;
        maaSCreationReportStruct.f58939n = maaSCreationReportStruct.b("exportTemplateId", r26.i0.t(templateID, ",", ";", false), true);
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct2 = bz0.f.f36737c;
        maaSCreationReportStruct2.f58940o = maaSCreationReportStruct2.b("exportMusicId", r26.i0.t(str2, ",", ";", false), true);
        bz0.f.f36737c.f58935j = (movieOption.isBGMMuted() ? 0 : 4) | (movieOption.isOSTMuted() ? 0 : 2) | 1;
        com.tencent.mm.autogen.mmdata.rpt.MaaSCreationReportStruct maaSCreationReportStruct3 = bz0.f.f36737c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.maas.instamovie.mediafoundation.FrameRate frameRate = exportSettings.getFrameRate();
        kotlin.jvm.internal.o.f(frameRate, "getFrameRate(...)");
        int typeId = frameRate.getType().getTypeId();
        jSONObject.put("f", typeId != 5 ? typeId != 8 ? 1 : 60 : 30);
        int videoBitsPerFrame = exportSettings.getVideoBitsPerFrame();
        com.tencent.maas.instamovie.mediafoundation.FrameRate frameRate2 = exportSettings.getFrameRate();
        kotlin.jvm.internal.o.f(frameRate2, "getFrameRate(...)");
        int typeId2 = frameRate2.getType().getTypeId();
        jSONObject.put("vb", videoBitsPerFrame * (typeId2 != 5 ? typeId2 != 8 ? 1 : 60 : 30));
        jSONObject.put("ab", exportSettings.getAverageAudioBitRate());
        jSONObject.put("maxgop", exportSettings.getMaxKeyframeInterval());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        maaSCreationReportStruct3.f58941p = maaSCreationReportStruct3.b("exportParams", r26.i0.t(jSONObject2, ",", ";", false), true);
        return az0.rc.b(!z17 ? "260" : "261", new az0.c6(str, i17, exportSettings, n7Var, b0Var, java.lang.System.currentTimeMillis()), new az0.f6(n7Var), false);
    }

    public static /* synthetic */ java.lang.Object p(az0.n7 n7Var, com.tencent.maas.model.time.MJTime ZeroTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
            kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        }
        if ((i17 & 2) != 0) {
            mJTimeRange = null;
        }
        return n7Var.o(ZeroTime, mJTimeRange, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if ((r2.getCurrentState() == com.tencent.maas.instamovie.MJMovieSessionState.Recreating) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:10:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof az0.m5
            if (r0 == 0) goto L13
            r0 = r10
            az0.m5 r0 = (az0.m5) r0
            int r1 = r0.f15707i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15707i = r1
            goto L18
        L13:
            az0.m5 r0 = new az0.m5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f15705g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15707i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r9 = r0.f15704f
            java.lang.Object r2 = r0.f15703e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r0.f15702d
            az0.n7 r5 = (az0.n7) r5
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            r9 = r2
            goto L82
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r8
            r10 = r3
        L41:
            com.tencent.maas.instamovie.MJMovieSession r2 = r5.f15742a
            com.tencent.maas.instamovie.MJMovieSessionState r2 = r2.getCurrentState()
            com.tencent.maas.instamovie.MJMovieSessionState r6 = com.tencent.maas.instamovie.MJMovieSessionState.Updating
            if (r2 != r6) goto L4d
            r2 = r4
            goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r2 != 0) goto L6c
            com.tencent.maas.instamovie.MJMovieSession r2 = r5.f15742a
            com.tencent.maas.instamovie.MJMovieSessionState r6 = r2.getCurrentState()
            com.tencent.maas.instamovie.MJMovieSessionState r7 = com.tencent.maas.instamovie.MJMovieSessionState.Switching
            if (r6 != r7) goto L5c
            r6 = r4
            goto L5d
        L5c:
            r6 = r3
        L5d:
            if (r6 != 0) goto L6c
            com.tencent.maas.instamovie.MJMovieSessionState r2 = r2.getCurrentState()
            com.tencent.maas.instamovie.MJMovieSessionState r6 = com.tencent.maas.instamovie.MJMovieSessionState.Recreating
            if (r2 != r6) goto L69
            r2 = r4
            goto L6a
        L69:
            r2 = r3
        L6a:
            if (r2 == 0) goto L9e
        L6c:
            r2 = 5
            if (r10 >= r2) goto L9e
            int r10 = r10 + 1
            r0.f15702d = r5
            r0.f15703e = r9
            r0.f15704f = r10
            r0.f15707i = r4
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r2 = kotlinx.coroutines.k1.b(r6, r0)
            if (r2 != r1) goto L82
            return r1
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "awaitSessionStateToEnterSwitch: force delay "
            r2.<init>(r6)
            r2.append(r9)
            java.lang.String r6 = ", delayCount:"
            r2.append(r6)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.mars.xlog.Log.i(r6, r2)
            goto L41
        L9e:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.instamovie.MJMovieOptions d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.d(boolean, boolean):com.tencent.maas.instamovie.MJMovieOptions");
    }

    public final java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maas_");
        gm0.m b17 = gm0.j1.b();
        sb6.append(kk.v.a(b17 != null ? b17.h() : 0));
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }

    public final ig.n f() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(ig.n.parseFrom(this.f15742a.getTemplateAnalysisPbData()));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        return (ig.n) m521constructorimpl;
    }

    public final boolean g() {
        return this.f15742a.getCurrentState() == com.tencent.maas.instamovie.MJMovieSessionState.Playing;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[PHI: r8
  0x007b: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0078, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.tencent.maas.model.MJTemplateBuildResult r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof az0.z5
            if (r0 == 0) goto L13
            r0 = r8
            az0.z5 r0 = (az0.z5) r0
            int r1 = r0.f16105h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16105h = r1
            goto L18
        L13:
            az0.z5 r0 = new az0.z5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f16103f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16105h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f16102e
            com.tencent.maas.model.MJTemplateBuildResult r7 = (com.tencent.maas.model.MJTemplateBuildResult) r7
            java.lang.Object r2 = r0.f16101d
            az0.n7 r2 = (az0.n7) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L66
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = r7.getTemplateId()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "switchTemplateWithV2: start "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.MaasMovieSessionManager"
            com.tencent.mars.xlog.Log.i(r5, r2)
            r0.f16101d = r6
            r0.f16102e = r7
            r0.f16105h = r4
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            r2 = r6
        L66:
            az0.a6 r8 = new az0.a6
            r8.<init>(r2, r7)
            r7 = 0
            r0.f16101d = r7
            r0.f16102e = r7
            r0.f16105h = r3
            java.lang.String r7 = "226"
            java.lang.Object r8 = az0.rc.h(r7, r8, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.h(com.tencent.maas.model.MJTemplateBuildResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean i() {
        return this.f15742a.getCurrentState() == com.tencent.maas.instamovie.MJMovieSessionState.Ready;
    }

    public final java.lang.Object j(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        int requestTemplateRecommend = this.f15742a.requestTemplateRecommend(str, this.f15743b.f244864j, kz5.c0.j(str2), new az0.h6(rVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "recommendNext: reqRecommend " + str + ", " + requestTemplateRecommend);
        if (requestTemplateRecommend == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaasMovieSessionManager", "recommendNext: req recommend error");
        }
        rVar.m(new az0.g6(requestTemplateRecommend, this));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "release");
        az0.i5 i5Var = az0.i5.f15557a;
        com.tencent.maas.instamovie.MJMovieSession movieSession = this.f15742a;
        kotlin.jvm.internal.o.g(movieSession, "movieSession");
        az0.i5.f15569m = kotlinx.coroutines.l.d(az0.i5.f15568l, null, null, new az0.z4(movieSession, null), 3, null);
    }

    public final void l(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setMovieOption() called with: musicMuted = " + z17 + ", originMuted = " + z18);
        this.f15744c = d(z17, z18);
    }

    public final kotlinx.coroutines.flow.j m(java.lang.String templateId, java.lang.String str, java.lang.String str2, java.util.List mediaInfo, boolean z17, long j17, com.tencent.maas.instamovie.MJMovieSession.OnComplete onRecommendReady) {
        java.lang.String str3;
        com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(onRecommendReady, "onRecommendReady");
        java.lang.String value = e();
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + value + ", field: " + bz0.a.f36722a);
        bz0.a.f36722a = value;
        bz0.f fVar = bz0.f.f36735a;
        bz0.f.f36738d = kotlinx.coroutines.l.d(bz0.f.f36736b, null, null, new bz0.d(bz0.f.f36738d, mediaInfo, null), 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mediaInfo, 10));
        java.util.Iterator it = mediaInfo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
            int type = galleryItem$MediaItem.getType();
            qg.c cVar = qg.c.Video;
            qg.c cVar2 = qg.c.Image;
            qg.a aVar = qg.a.Filepath;
            if (type == 6) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) galleryItem$MediaItem;
                if (galleryItem$LivePhotoMediaItem.H == 1 && galleryItem$LivePhotoMediaItem.A != 2) {
                    java.lang.String wi6 = ((hs.x) ((qk.s7) i95.n0.c(qk.s7.class))).wi(qk.k9.f364209f, java.lang.String.valueOf(galleryItem$MediaItem.f138434i));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "mediaId: " + galleryItem$MediaItem.f138434i + " originalPath: " + galleryItem$LivePhotoMediaItem.f138430e + " destPath: " + wi6 + " isParsed: " + galleryItem$LivePhotoMediaItem.G);
                    if (galleryItem$LivePhotoMediaItem.G != 1) {
                        i95.m c17 = i95.n0.c(qk.r7.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        qk.r7 r7Var = (qk.r7) c17;
                        long j18 = galleryItem$MediaItem.f138434i;
                        java.lang.String o17 = galleryItem$LivePhotoMediaItem.o();
                        kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
                        aq.s0 s0Var = qk.r7.ui(r7Var, j18, wi6, o17, 0L, 8, null).f12975a;
                        boolean z18 = s0Var.f12960a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "livePhoto is no parse >> parse result : " + s0Var.f12960a + " errCode: " + s0Var.f12961b);
                        r3 = z18;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "copy result >> " + com.tencent.mm.vfs.w6.d(galleryItem$LivePhotoMediaItem.f138430e, wi6, false));
                    }
                    if (r3) {
                        galleryItem$MediaItem.f138430e = wi6;
                        mJAssetInfo = new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, wi6, cVar, qg.b.Video);
                    } else {
                        galleryItem$MediaItem.f138430e = galleryItem$LivePhotoMediaItem.o();
                        mJAssetInfo = new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, galleryItem$LivePhotoMediaItem.o(), cVar2);
                    }
                    arrayList.add(mJAssetInfo);
                }
            }
            if (galleryItem$MediaItem.getType() == 6) {
                str3 = galleryItem$MediaItem.o();
                galleryItem$MediaItem.f138430e = str3;
            } else {
                str3 = galleryItem$MediaItem.f138430e;
            }
            if (galleryItem$MediaItem.getType() == 1 || galleryItem$MediaItem.getType() == 6) {
                cVar = cVar2;
            }
            mJAssetInfo = new com.tencent.maas.instamovie.base.asset.MJAssetInfo(aVar, str3, cVar);
            arrayList.add(mJAssetInfo);
        }
        az0.z6 z6Var = new az0.z6(java.lang.System.currentTimeMillis(), onRecommendReady);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = com.tencent.maas.instamovie.c.Foreground;
        if (templateId.length() > 0) {
            if (z17) {
                h0Var.f310123d = com.tencent.maas.instamovie.c.Background;
            } else {
                h0Var.f310123d = com.tencent.maas.instamovie.c.None;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "startMovieCreation: mode:" + h0Var.f310123d);
        return az0.rc.b("200", new az0.v6(templateId, str2, str, j17, this, arrayList, h0Var, z6Var), new az0.y6(this), false);
    }

    public final kotlinx.coroutines.flow.j n(java.util.List mediaInfo, java.lang.String str, boolean z17, com.tencent.maas.instamovie.MJMovieSession.OnComplete onRecommendReady) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(onRecommendReady, "onRecommendReady");
        java.lang.String value = e();
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setSessionKey " + value + ", field: " + bz0.a.f36722a);
        bz0.a.f36722a = value;
        bz0.f fVar = bz0.f.f36735a;
        bz0.f.f36738d = kotlinx.coroutines.l.d(bz0.f.f36736b, null, null, new bz0.d(bz0.f.f36738d, mediaInfo, null), 3, null);
        return az0.rc.b("202", new az0.e7(mediaInfo, z17, z17 ? com.tencent.maas.instamovie.c.Background : com.tencent.maas.instamovie.c.None, this, str, new az0.i7(java.lang.System.currentTimeMillis(), onRecommendReady)), new az0.h7(this), false);
    }

    public final java.lang.Object o(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, kotlin.coroutines.Continuation continuation) {
        com.tencent.maas.model.time.MJTime endTime;
        com.tencent.maas.model.time.MJTime startTime;
        boolean g17 = g();
        boolean i17 = i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay, isPlaying: ");
        sb6.append(g17);
        sb6.append(" ready: ");
        sb6.append(i17);
        sb6.append(", startTime:");
        sb6.append(mJTime.toSeconds());
        sb6.append(", timeRangeForPlay:[");
        java.lang.Double d17 = null;
        sb6.append((mJTimeRange == null || (startTime = mJTimeRange.getStartTime()) == null) ? null : new java.lang.Double(startTime.toSeconds()));
        sb6.append(',');
        if (mJTimeRange != null && (endTime = mJTimeRange.getEndTime()) != null) {
            d17 = new java.lang.Double(endTime.toSeconds());
        }
        sb6.append(d17);
        sb6.append("], playbackDuration:");
        sb6.append(this.f15742a.getPlaybackDuration());
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        return (g17 || !i17) ? java.lang.Boolean.FALSE : az0.rc.d("241", new az0.j7(mJTimeRange, this, mJTime), continuation);
    }

    public final java.lang.Object q(kotlin.coroutines.Continuation continuation) {
        if (this.f15742a.getCurrentState() == com.tencent.maas.instamovie.MJMovieSessionState.Initial) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "cur state is initial, no need to stop");
            return java.lang.Boolean.TRUE;
        }
        boolean g17 = g();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "stopPlay, isPlaying: " + g17);
        return g17 ? az0.rc.d("242", new az0.k7(this), continuation) : java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(boolean r5, boolean r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof az0.l7
            if (r0 == 0) goto L13
            r0 = r7
            az0.l7 r0 = (az0.l7) r0
            int r1 = r0.f15669h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15669h = r1
            goto L18
        L13:
            az0.l7 r0 = new az0.l7
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f15667f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f15669h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f15666e
            com.tencent.maas.instamovie.MJMovieOptions r5 = (com.tencent.maas.instamovie.MJMovieOptions) r5
            java.lang.Object r6 = r0.f15665d
            az0.n7 r6 = (az0.n7) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.maas.instamovie.MJMovieOptions r5 = r4.d(r5, r6)
            az0.m7 r6 = new az0.m7
            r6.<init>(r4, r5)
            r0.f15665d = r4
            r0.f15666e = r5
            r0.f15669h = r3
            java.lang.String r7 = "240"
            java.lang.Object r7 = az0.rc.d(r7, r6, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r6 = r4
        L53:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            r6.f15744c = r5
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: az0.n7.r(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
