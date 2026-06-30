package com.tencent.mm.mj_template.maas.uic;

/* loaded from: classes5.dex */
public final class MaasSdkUIC extends com.tencent.mm.ui.component.UIComponent implements dz0.l {
    public volatile yz5.l A;
    public volatile boolean B;
    public boolean C;
    public final dz0.e0 D;
    public boolean E;
    public boolean F;
    public java.lang.String G;
    public boolean H;
    public final com.tencent.mm.sdk.event.IListener I;

    /* renamed from: J, reason: collision with root package name */
    public f25.m0 f69782J;

    /* renamed from: d, reason: collision with root package name */
    public az0.n7 f69783d;

    /* renamed from: e, reason: collision with root package name */
    public dz0.h f69784e;

    /* renamed from: f, reason: collision with root package name */
    public dz0.k f69785f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f69786g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f69787h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.j0 f69788i;

    /* renamed from: m, reason: collision with root package name */
    public final dz0.x f69789m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f69790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f69791o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f69792p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f69793q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f69794r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f69795s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Object f69796t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f69797u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f69798v;

    /* renamed from: w, reason: collision with root package name */
    public dz0.e f69799w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f69800x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f69801y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange f69802z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasSdkUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f69784e = new dz0.h("TemplateRecommendv2", false, true, -1, false, p0Var, 0, false, null, false);
        this.f69786g = new androidx.lifecycle.j0();
        this.f69787h = new androidx.lifecycle.j0(p0Var);
        this.f69788i = new androidx.lifecycle.j0(p0Var);
        this.f69789m = new dz0.x();
        this.f69790n = "";
        this.f69791o = true;
        this.f69792p = true;
        this.f69794r = "";
        this.f69795s = "";
        this.f69796t = new java.lang.Object();
        this.f69797u = new java.util.LinkedHashMap();
        this.f69798v = p0Var;
        this.f69800x = com.tencent.maas.model.time.MJTime.ZeroTime;
        this.f69801y = true;
        this.f69802z = new dz0.g1(this);
        this.D = new dz0.e0(this);
        this.G = "";
        this.I = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(this) { // from class: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC$voipCallEventListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f69804e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f69804e = this;
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (gm0.j1.a()) {
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = androidx.appcompat.app.AppCompatActivity.this;
                    if (!appCompatActivity.isFinishing() && !appCompatActivity.isDestroyed()) {
                        int i17 = event.f54942g.f8161d;
                        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f69804e;
                        if (i17 == 11) {
                            kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.q2(maasSdkUIC, null), 3, null);
                        } else if (i17 == 7) {
                            kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.r2(maasSdkUIC, null), 3, null);
                        }
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public static final java.util.List O6(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        az0.n7 n7Var = maasSdkUIC.f69783d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (n7Var == null || (mJMovieSession = n7Var.f15742a) == null) {
            return p0Var;
        }
        dz0.e0 e0Var = maasSdkUIC.D;
        java.util.List<com.tencent.maas.model.MJMusicInfo> V6 = e0Var.f244823f && ((java.lang.Boolean) ((jz5.n) e0Var.f244824g).getValue()).booleanValue() ? maasSdkUIC.V6() : mJMovieSession.getCurrentTemplateMusicInfos();
        return V6 == null ? p0Var : V6;
    }

    public static final java.lang.Object P6(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        boolean z17 = maasSdkUIC.B;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "execute now");
            java.lang.Object invoke = lVar.invoke(continuation);
            return invoke == pz5.a.f359186d ? invoke : f0Var;
        }
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "execute delay");
        maasSdkUIC.A = lVar;
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q6(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.Q6(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void R6(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        java.util.List list = maasSdkUIC.D.f244821d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((com.tencent.maas.model.MJTemplateInfo) next).getTemplateDescVersion() != 0) {
                arrayList.add(next);
            }
        }
        kz5.p0 p0Var = kz5.p0.f313996d;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "recommendResult: template.size:" + arrayList.size() + ",categories.size:0");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.maas.model.MJTemplateInfo template = (com.tencent.maas.model.MJTemplateInfo) it6.next();
            nz0.o oVar = nz0.o.f341530a;
            kotlin.jvm.internal.o.g(template, "template");
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.CreationSameInfoHolder", "cacheMJTemplate:" + template.getTemplateID() + ", " + template.getTemplateDescVersion() + ", " + template.getTemplateDescURL() + ", " + template.getThumbnailURL());
            nz0.o.f341539j.put(template.getTemplateID(), template);
        }
        maasSdkUIC.f69787h.postValue(arrayList);
        maasSdkUIC.f69788i.postValue(p0Var);
        kotlinx.coroutines.l.d(maasSdkUIC.getLifecycleScope(), null, null, new dz0.h1(maasSdkUIC, arrayList, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d7(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7, az0.n7 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof dz0.q1
            if (r0 == 0) goto L13
            r0 = r9
            dz0.q1 r0 = (dz0.q1) r0
            int r1 = r0.f244991f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244991f = r1
            goto L18
        L13:
            dz0.q1 r0 = new dz0.q1
            r0.<init>(r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.f244990e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r4.f244991f
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r4.f244989d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r7 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "performCreation delay task executed maasPreview "
            r9.<init>(r1)
            boolean r1 = r7.f69801y
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.mars.xlog.Log.i(r1, r9)
            boolean r9 = r7.f69801y
            if (r9 != 0) goto L54
            r7.t7()
            goto L7a
        L54:
            r9 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r4.f244989d = r7
            r4.f244991f = r2
            r1 = r8
            r2 = r9
            java.lang.Object r9 = az0.n7.p(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L65
            return r0
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L71
            r7.t7()
            goto L7a
        L71:
            dz0.k r7 = r7.f69785f
            if (r7 == 0) goto L7a
            java.lang.String r8 = "start play error"
            r7.t(r8)
        L7a:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.d7(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC, az0.n7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S6(java.lang.String r10, yz5.l r11, yz5.p r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.S6(java.lang.String, yz5.l, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T6(java.lang.String r21, az0.e r22, float r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.T6(java.lang.String, az0.e, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object U6(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rVar.m(new dz0.w0(kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.y0(this, rVar, "263", currentTimeMillis, null), 3, null), "263", currentTimeMillis));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public final java.util.List V6() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        az0.n7 n7Var = this.f69783d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (n7Var == null || (mJMovieSession = n7Var.f15742a) == null) {
            return p0Var;
        }
        com.tencent.maas.model.MJTemplateInfo currentTemplateInfo = mJMovieSession.getCurrentTemplateInfo();
        java.lang.String templateID = currentTemplateInfo != null ? currentTemplateInfo.getTemplateID() : null;
        if (templateID == null) {
            templateID = "";
        }
        java.util.List<com.tencent.maas.model.MJMusicInfo> currentTemplateMusicInfos = mJMovieSession.getCurrentTemplateMusicInfos();
        com.tencent.maas.model.MJMusicInfo mJMusicInfo = currentTemplateMusicInfos != null ? (com.tencent.maas.model.MJMusicInfo) kz5.n0.a0(currentTemplateMusicInfos, 0) : null;
        dz0.e0 e0Var = this.D;
        e0Var.getClass();
        ?? r07 = (java.util.List) ((java.util.LinkedHashMap) e0Var.f244828k.D.f244825h).get(templateID);
        if (r07 != 0) {
            p0Var = r07;
        }
        java.util.List V0 = kz5.n0.V0(p0Var);
        if (mJMusicInfo != null) {
            ((java.util.ArrayList) V0).add(0, mJMusicInfo);
        }
        if (mJMusicInfo != null) {
            mJMusicInfo.getSongName();
        }
        com.tencent.maas.model.MJMusicInfo mJMusicInfo2 = (com.tencent.maas.model.MJMusicInfo) kz5.n0.k0(V0);
        if (mJMusicInfo2 != null) {
            mJMusicInfo2.getSongName();
        }
        ((java.util.ArrayList) V0).size();
        return V0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object W6(az0.b0 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.W6(az0.b0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.util.List X6() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        java.util.List<com.tencent.maas.model.MJLyricInfo> currentLyricInfos;
        az0.n7 n7Var = this.f69783d;
        if (n7Var == null || (mJMovieSession = n7Var.f15742a) == null || (currentLyricInfos = mJMovieSession.getCurrentLyricInfos()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(currentLyricInfos, 10));
        java.util.Iterator<T> it = currentLyricInfos.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.maas.model.MJLyricInfo) it.next()).getContent());
        }
        return arrayList;
    }

    public long Y6() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        com.tencent.maas.model.time.MJTime playbackDuration;
        az0.n7 n7Var = this.f69783d;
        if (n7Var != null && (mJMovieSession = n7Var.f15742a) != null && (playbackDuration = mJMovieSession.getPlaybackDuration()) != null) {
            java.lang.Double valueOf = java.lang.Double.valueOf(playbackDuration.toMilliseconds());
            if (!(!java.lang.Double.isNaN(valueOf.doubleValue()))) {
                valueOf = null;
            }
            if (valueOf != null) {
                return a06.d.c(valueOf.doubleValue());
            }
        }
        return 0L;
    }

    public final java.lang.String Z6(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) ((java.util.LinkedHashMap) this.f69797u).get(str + '-' + str2);
        return str3 == null ? str2 == null ? str : str2 : str3;
    }

    public kotlinx.coroutines.r2 a7(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.c1(this, bool != null ? bool.booleanValue() : this.F, bool2 != null ? bool2.booleanValue() : this.E, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f1 -> B:10:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.b7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.c7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[Catch: e -> 0x0123, TryCatch #0 {e -> 0x0123, blocks: (B:11:0x0032, B:13:0x00d7, B:15:0x00dd, B:18:0x0117, B:37:0x0088, B:39:0x008c, B:41:0x0093, B:46:0x009f, B:47:0x00b0, B:49:0x00b6, B:51:0x00c2, B:56:0x011d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e7(com.tencent.mm.mj_template.sns.compose.widget.m5 r8, ly0.o r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.e7(com.tencent.mm.mj_template.sns.compose.widget.m5, ly0.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f7(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof dz0.v1
            if (r0 == 0) goto L13
            r0 = r7
            dz0.v1 r0 = (dz0.v1) r0
            int r1 = r0.f245043h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f245043h = r1
            goto L18
        L13:
            dz0.v1 r0 = new dz0.v1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f245041f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f245043h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r1 = r0.f245040e
            az0.n7 r1 = (az0.n7) r1
            java.lang.Object r0 = r0.f245039d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r0 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            az0.n7 r7 = r6.f69783d
            if (r7 == 0) goto L96
            boolean r2 = r7.i()
            if (r2 != 0) goto L5f
            r0.f245039d = r6
            r0.f245040e = r7
            r0.f245043h = r3
            java.lang.Object r0 = r7.q(r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r1 = r7
            r7 = r0
            r0 = r6
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L96
            r7 = r1
            goto L60
        L5f:
            r0 = r6
        L60:
            boolean r1 = r0.C
            if (r1 == 0) goto L6d
            java.lang.String r1 = r0.f69794r
            java.lang.String r2 = r0.f69795s
            java.lang.String r1 = r0.Z6(r1, r2)
            goto L6e
        L6d:
            r1 = r4
        L6e:
            r7.getClass()
            az0.i6 r2 = new az0.i6
            r2.<init>(r7, r1)
            az0.l6 r1 = new az0.l6
            r1.<init>(r7)
            r3 = 0
            java.lang.String r5 = "222"
            kotlinx.coroutines.flow.j r1 = az0.rc.b(r5, r2, r1, r3)
            dz0.x1 r2 = new dz0.x1
            r2.<init>(r0, r7, r4)
            kotlinx.coroutines.flow.g0 r3 = new kotlinx.coroutines.flow.g0
            r3.<init>(r1, r2)
            dz0.y1 r1 = new dz0.y1
            r1.<init>(r0, r7, r4)
            kotlinx.coroutines.flow.g0 r4 = new kotlinx.coroutines.flow.g0
            r4.<init>(r3, r1)
        L96:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.f7(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g7(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.g7(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h7(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.h7(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean i7() {
        if (this.f69782J == null) {
            this.f69782J = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i0.f259099c, null);
        }
        f25.m0 m0Var = this.f69782J;
        if (m0Var != null && ((g25.e) m0Var).f267980c) {
            return true;
        }
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.i0.f259099c, null);
        this.f69782J = m96;
        return m96 != null && ((g25.e) m96).f267980c;
    }

    public boolean k7(java.lang.String aiModelType, java.util.List paths) {
        kotlin.jvm.internal.o.g(aiModelType, "aiModelType");
        kotlin.jvm.internal.o.g(paths, "paths");
        az0.n7 n7Var = this.f69783d;
        if (n7Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setAssetsByAIModelType start:".concat(aiModelType));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(paths, 10));
        java.util.Iterator it = paths.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Filepath, (java.lang.String) it.next(), qg.c.Image));
        }
        com.tencent.maas.instamovie.base.MJError assetsByAIModelType = n7Var.f15742a.setAssetsByAIModelType(aiModelType, arrayList);
        if (assetsByAIModelType != null) {
            bz0.b.b(bz0.b.f36724a, "264", assetsByAIModelType, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setAssetsByAIModelType " + aiModelType + ", ret:" + assetsByAIModelType);
        return assetsByAIModelType == null;
    }

    public void l7(java.lang.String templateId, java.lang.String str) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "set templateId: " + templateId + ", musicId: " + str);
        this.f69790n = templateId;
        if (str == null) {
            str = "";
        }
        this.f69794r = str;
        this.f69795s = "";
    }

    public void m7(java.lang.String templateId, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "set templateId: " + templateId + ", musicId: " + str + ", feedID: " + str2);
        this.f69790n = templateId;
        if (str == null) {
            str = "";
        }
        this.f69794r = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f69795s = str2;
    }

    public void n7() {
        ig.n f17;
        int i17;
        int i18;
        az0.n7 n7Var = this.f69783d;
        if (n7Var == null || (f17 = n7Var.f()) == null) {
            return;
        }
        bz0.j jVar = bz0.j.f36750a;
        com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct = bz0.j.f36751b;
        maasRecommendReportStruct.f58981e = java.lang.System.currentTimeMillis();
        java.lang.String exportTemplateId = f17.getExportTemplateId();
        kotlin.jvm.internal.o.f(exportTemplateId, "getExportTemplateId(...)");
        maasRecommendReportStruct.f58991o = maasRecommendReportStruct.b("savetid", r26.i0.t(exportTemplateId, ",", ";", false), true);
        java.lang.String exportMusicId = f17.getExportMusicId();
        kotlin.jvm.internal.o.f(exportMusicId, "getExportMusicId(...)");
        maasRecommendReportStruct.f58992p = maasRecommendReportStruct.b("savesid", r26.i0.t(exportMusicId, ",", ";", false), true);
        java.lang.String exportMusicSongName = f17.getExportMusicSongName();
        kotlin.jvm.internal.o.f(exportMusicSongName, "getExportMusicSongName(...)");
        maasRecommendReportStruct.f59000x = maasRecommendReportStruct.b("song_name", r26.i0.t(exportMusicSongName, ",", ";", false), true);
        ig.p exportMusicSourceType = f17.getExportMusicSourceType();
        kotlin.jvm.internal.o.f(exportMusicSourceType, "getExportMusicSourceType(...)");
        int ordinal = exportMusicSourceType.ordinal();
        maasRecommendReportStruct.f58999w = ordinal != 0 ? (ordinal == 1 || ordinal != 3) ? 2 : 1 : 0;
        maasRecommendReportStruct.f58983g = f17.getAssetsCount();
        java.util.List<ig.e> assetsList = f17.getAssetsList();
        kotlin.jvm.internal.o.f(assetsList, "getAssetsList(...)");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (ig.e eVar : assetsList) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (eVar.getMediaType() == ig.k.IMAGE) {
                jSONObject.put("mediaType", "image");
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.List<java.lang.Integer> imageClassExceedsList = eVar.getImageClassExceedsList();
                if (imageClassExceedsList != null) {
                    for (java.lang.Integer num : imageClassExceedsList) {
                        kotlin.jvm.internal.o.d(num);
                        jSONArray2.put(num.intValue());
                    }
                }
                jSONObject.put("visTag", jSONArray2);
                org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                java.util.List<java.lang.Integer> imageClassExceedsList2 = eVar.getImageClassExceedsList();
                if (imageClassExceedsList2 != null) {
                    for (java.lang.Integer num2 : imageClassExceedsList2) {
                        kotlin.jvm.internal.o.d(num2);
                        jSONArray3.put(num2.intValue());
                    }
                }
                jSONObject.put("cred", jSONArray3);
            } else {
                if (eVar.getMediaType() == ig.k.VIDEO) {
                    jSONObject.put("mediaType", "video");
                } else if (eVar.getMediaType() == ig.k.LIVE_PHOTO) {
                    jSONObject.put("mediaType", "livephoto");
                }
                org.json.JSONArray jSONArray4 = new org.json.JSONArray();
                java.util.List<java.lang.Integer> videoClassVisualLabelsList = eVar.getVideoClassVisualLabelsList();
                if (videoClassVisualLabelsList != null) {
                    for (java.lang.Integer num3 : videoClassVisualLabelsList) {
                        kotlin.jvm.internal.o.d(num3);
                        jSONArray4.put(num3.intValue());
                    }
                }
                jSONObject.put("visTag", jSONArray4);
                org.json.JSONArray jSONArray5 = new org.json.JSONArray();
                java.util.List<java.lang.Integer> videoClassVisualExceedsList = eVar.getVideoClassVisualExceedsList();
                if (videoClassVisualExceedsList != null) {
                    for (java.lang.Integer num4 : videoClassVisualExceedsList) {
                        kotlin.jvm.internal.o.d(num4);
                        jSONArray5.put(num4.intValue());
                    }
                }
                jSONObject.put("cred", jSONArray5);
                org.json.JSONArray jSONArray6 = new org.json.JSONArray();
                java.util.List<java.lang.Integer> videoClassAudioLabelsList = eVar.getVideoClassAudioLabelsList();
                if (videoClassAudioLabelsList != null) {
                    for (java.lang.Integer num5 : videoClassAudioLabelsList) {
                        kotlin.jvm.internal.o.d(num5);
                        jSONArray6.put(num5.intValue());
                    }
                }
                jSONObject.put("audTag", jSONArray6);
            }
            jSONObject.put("aspectRatio", eVar.getAspectRatio());
            jSONObject.put("duration", eVar.getDurationMs());
            jSONObject.put("duration_before_edit", eVar.getDurationMs());
            jSONObject.put("aiTag", eVar.getAiTags());
            jSONObject.put("isOverThreshold", eVar.getIsOverThreshold() ? 1 : 0);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray7 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray7, "toString(...)");
        maasRecommendReportStruct.f58984h = maasRecommendReportStruct.b("mediadetail", r26.i0.t(jSONArray7, ",", ";", false), true);
        java.util.TreeMap treeMap = bz0.j.f36754e;
        boolean z17 = !treeMap.isEmpty();
        java.util.List list = bz0.j.f36757h;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Collection values = treeMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.List<ig.w> templateActionsList = f17.getTemplateActionsList();
            kotlin.jvm.internal.o.f(templateActionsList, "getTemplateActionsList(...)");
            for (ig.w wVar : templateActionsList) {
                java.lang.String previewTemplateId = wVar.getPreviewTemplateId();
                if (!values.contains(previewTemplateId)) {
                    arrayList.add(wVar);
                } else if (((java.util.ArrayList) list).contains(previewTemplateId)) {
                    arrayList.add(wVar);
                    if (!linkedHashSet.contains(previewTemplateId)) {
                        kotlin.jvm.internal.o.d(previewTemplateId);
                        linkedHashSet.add(previewTemplateId);
                        arrayList2.add(wVar);
                    }
                } else {
                    arrayList2.add(wVar);
                }
            }
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct2 = bz0.j.f36751b;
            maasRecommendReportStruct2.f58987k = maasRecommendReportStruct2.b("previewseq", jVar.d(arrayList), true);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ig.w) it.next()).getPreviewTemplateId());
            }
            java.lang.String g07 = kz5.n0.g0(arrayList3, ";", "[", "]", 0, null, null, 56, null);
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct3 = bz0.j.f36751b;
            maasRecommendReportStruct3.C = maasRecommendReportStruct3.b("double_previewseq", g07, true);
            java.lang.String str = bz0.j.f36751b.C;
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct4 = bz0.j.f36751b;
            java.util.List templateActionsList2 = f17.getTemplateActionsList();
            kotlin.jvm.internal.o.f(templateActionsList2, "getTemplateActionsList(...)");
            maasRecommendReportStruct4.f58987k = maasRecommendReportStruct4.b("previewseq", jVar.d(templateActionsList2), true);
        }
        java.lang.String str2 = bz0.j.f36751b.f58987k;
        kotlin.jvm.internal.o.f(str2, "getPreviewseq(...)");
        r26.i0.t(str2, ";", ",", false);
        maasRecommendReportStruct.f58997u = maasRecommendReportStruct.b("creation_id", f17.getTemplateRecommendation().getCreationId(), true);
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(f17.getTemplateRecommendation().getRequestId());
        if (valueOf.signum() < 0) {
            valueOf = valueOf.add(java.math.BigInteger.ONE.shiftLeft(64));
        }
        java.lang.String bigInteger = valueOf.toString();
        kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
        maasRecommendReportStruct.f58995s = maasRecommendReportStruct.b("request_id", bigInteger, true);
        maasRecommendReportStruct.f58994r = maasRecommendReportStruct.b("projectClassification", f17.getTemplateRecommendation().getProjectClassification(), true);
        java.lang.String sceneTag = f17.getTemplateRecommendation().getSceneTag();
        kotlin.jvm.internal.o.f(sceneTag, "getSceneTag(...)");
        maasRecommendReportStruct.f58993q = maasRecommendReportStruct.b("scenetag", r26.i0.t(sceneTag, ",", ";", false), true);
        maasRecommendReportStruct.f58996t = maasRecommendReportStruct.b("session_id", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi(), true);
        if (((java.util.ArrayList) list).contains(f17.getExportTemplateId())) {
            i17 = 4;
        } else {
            ig.c0 exportTemplateSourceType = f17.getExportTemplateSourceType();
            kotlin.jvm.internal.o.f(exportTemplateSourceType, "getExportTemplateSourceType(...)");
            int ordinal2 = exportTemplateSourceType.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    i18 = (ordinal2 == 2 || ordinal2 == 3) ? 2 : 1;
                }
                i17 = i18;
            }
            i17 = 0;
        }
        bz0.j.f36751b.f59001y = i17;
        java.lang.String attachmentsJson = f17.getTemplateRecommendation().getAttachmentsJson();
        maasRecommendReportStruct.f59002z = maasRecommendReportStruct.b("sdkinfo", attachmentsJson != null ? r26.i0.t(attachmentsJson, ",", ";", false) : null, true);
        java.util.List list2 = bz0.j.f36762m;
        org.json.JSONArray jSONArray8 = new org.json.JSONArray();
        java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
        while (it6.hasNext()) {
            bz0.h hVar = (bz0.h) it6.next();
            java.lang.String g08 = kz5.n0.g0(hVar.f36747d, "#", null, null, 0, null, null, 62, null);
            boolean z18 = hVar.f36745b;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("edit_medialist", g08);
            jSONObject2.put("result", hVar.f36746c);
            jSONObject2.put("click_go_miaojian", z18 ? 1 : 0);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("tid", hVar.f36744a);
            jSONObject3.put("edit_info", jSONObject2);
            jSONArray8.put(jSONObject3);
        }
        java.lang.String jSONArray9 = jSONArray8.toString();
        kotlin.jvm.internal.o.f(jSONArray9, "toString(...)");
        maasRecommendReportStruct.D = maasRecommendReportStruct.b("editseq", r26.i0.t(jSONArray9, ",", ";", false), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "setReportData savetid=" + bz0.j.f36751b.f58991o + ", session_id=" + bz0.j.f36751b.f58996t);
    }

    public void o7(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "setMovieOption() called with: musicMuted = " + z17 + ", originMuted = " + z18);
        this.E = z18;
        this.F = z17;
        if (i7()) {
            az0.n7 n7Var = this.f69783d;
            if (n7Var != null) {
                n7Var.l(z17, z18);
                return;
            }
            return;
        }
        az0.n7 n7Var2 = this.f69783d;
        if (n7Var2 != null) {
            n7Var2.l(true, true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "release onBeforeFinish");
        n7();
        az0.n7 n7Var = this.f69783d;
        if (n7Var != null) {
            n7Var.k();
        }
        this.f69783d = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onCreate: ");
        int intExtra = getIntent().getIntExtra("key_maas_entrance", 0);
        if (intExtra == 1 || intExtra == 2) {
            i17 = 1;
        } else {
            i17 = 3;
            if (intExtra != 3) {
                i17 = 4;
                if (intExtra != 4 && intExtra != 5) {
                    if (intExtra == 7) {
                        i17 = 5;
                    } else if (intExtra != 10) {
                        i17 = 200;
                        if (intExtra != 200) {
                            if (intExtra != 100) {
                                i17 = 101;
                                if (intExtra != 101) {
                                    i17 = 300;
                                }
                            } else {
                                i17 = 100;
                            }
                        }
                    } else {
                        i17 = 6;
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: " + i17 + ", field: " + bz0.a.f36723b);
        bz0.a.f36723b = i17;
        bz0.j jVar = bz0.j.f36750a;
        int i18 = bz0.a.f36723b >= 100 ? 1 : 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasReport25621", "start " + i18);
        bz0.j.f36752c = true;
        ((java.util.ArrayList) bz0.j.f36753d).clear();
        ((java.util.ArrayList) bz0.j.f36758i).clear();
        bz0.j.f36755f = kz5.p0.f313996d;
        com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct();
        maasRecommendReportStruct.f58980d = java.lang.System.currentTimeMillis();
        maasRecommendReportStruct.f58982f = i18;
        bz0.j.f36751b = maasRecommendReportStruct;
        bz0.f fVar = bz0.f.f36735a;
        bz0.f.f36737c.f58942q = getIntent().getIntExtra("key_maas_entrance", 0);
        kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.e1(this, null), 3, null);
        this.I.alive();
        bz0.j.f36751b.E = getIntent().getIntExtra("key_is_user_manual_switch_template_view", 0) > 0 ? 1 : 0;
        bz0.j.f36751b.F = (int) getIntent().getLongExtra("key_entrance_event_type", 0L);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onDestroy:");
        kotlinx.coroutines.z0.e(getMainScope(), null, 1, null);
        ky0.i iVar = ky0.i.f313481a;
        ((java.util.LinkedHashMap) ky0.i.f313482b).clear();
        az0.n7 n7Var = this.f69783d;
        if (n7Var != null && (mJMovieSession = n7Var.f15742a) != null) {
            mJMovieSession.setOnPlaybackMediaTimeDidChange(null);
        }
        n7();
        az0.n7 n7Var2 = this.f69783d;
        if (n7Var2 != null) {
            n7Var2.k();
        }
        this.f69783d = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "setReportScene: 0, field: " + bz0.a.f36723b);
        bz0.a.f36723b = 0;
        this.I.dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onPause: ");
        if (!this.f69801y) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onPause: cancel pause, maasPreview is " + this.f69801y);
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.f1(this, null), 3, null);
        f25.m0 m0Var = this.f69782J;
        if (m0Var != null) {
            i95.m c17 = i95.n0.c(f25.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((f25.n0) c17).yg(m0Var);
        }
        this.f69782J = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onResume: hasRenderSurface " + this.B);
        if (!this.f69801y) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onResume: cancel resume, maasPreview is " + this.f69801y);
        } else if (this.B) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.i1(this, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "onResume: delay");
            this.A = new dz0.j1(this, null);
        }
    }

    public void p7(android.view.Surface surface) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "setRenderSurface: ");
        az0.n7 n7Var = this.f69783d;
        if (n7Var != null) {
            n7Var.f15742a.setSurface(surface);
        }
        this.B = surface != null;
        if (surface != null) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new dz0.m2(this, null), 3, null);
        }
    }

    public void q7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "setSingleMusicMode: " + z17);
        this.C = z17;
    }

    public void r7(int i17) {
        db5.e1.E(getContext(), "", i65.a.r(getContext(), i17), i65.a.r(getContext(), com.tencent.mm.R.string.hhl), false, dz0.n2.f244951d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s7(boolean r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dz0.o2
            if (r0 == 0) goto L13
            r0 = r10
            dz0.o2 r0 = (dz0.o2) r0
            int r1 = r0.f244962g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244962g = r1
            goto L18
        L13:
            dz0.o2 r0 = new dz0.o2
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f244960e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f244962g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f244959d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r8 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto La1
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f244959d
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r8 = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L80
        L40:
            kotlin.ResultKt.throwOnFailure(r10)
            r7.E = r9
            r7.F = r8
            boolean r10 = r7.i7()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "switchMovieOption() called with: musicMuted = "
            r2.<init>(r6)
            r2.append(r8)
            java.lang.String r6 = ", originMuted = "
            r2.append(r6)
            r2.append(r9)
            java.lang.String r6 = "  gainFocus:"
            r2.append(r6)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "MaasMultiTemplate.MaasSdkUIC"
            com.tencent.mars.xlog.Log.i(r6, r2)
            if (r10 != 0) goto L91
            az0.n7 r8 = r7.f69783d
            if (r8 == 0) goto L8a
            r0.f244959d = r7
            r0.f244962g = r5
            java.lang.Object r10 = r8.r(r5, r5, r0)
            if (r10 != r1) goto L7f
            return r1
        L7f:
            r8 = r7
        L80:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != r5) goto L8b
            r4 = r5
            goto L8b
        L8a:
            r8 = r7
        L8b:
            if (r4 == 0) goto Lb1
            r8.t7()
            goto Lb1
        L91:
            az0.n7 r10 = r7.f69783d
            if (r10 == 0) goto Lab
            r0.f244959d = r7
            r0.f244962g = r3
            java.lang.Object r10 = r10.r(r8, r9, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            r8 = r7
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != r5) goto Lac
            r4 = r5
            goto Lac
        Lab:
            r8 = r7
        Lac:
            if (r4 == 0) goto Lb1
            r8.t7()
        Lb1:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.s7(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t7() {
        com.tencent.maas.instamovie.MJMovieSession mJMovieSession;
        az0.n7 n7Var = this.f69783d;
        if (((n7Var == null || (mJMovieSession = n7Var.f15742a) == null) ? null : mJMovieSession.getCurrentMovieOptions()) == null) {
            com.tencent.mars.xlog.Log.w("MaasMultiTemplate.MaasSdkUIC", "updateMovieOption: current movieOption is null");
            return;
        }
        az0.n7 n7Var2 = this.f69783d;
        if (n7Var2 == null || n7Var2.f15742a == null) {
            return;
        }
        dz0.x xVar = this.f69789m;
        xVar.f245054e.postValue(java.lang.Boolean.valueOf(this.F));
        xVar.f245055f.postValue(java.lang.Boolean.valueOf(this.E));
    }
}
