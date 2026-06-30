package dz0;

/* loaded from: classes5.dex */
public final class e0 implements dz0.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f326351a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326352b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f326353c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f326354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f326355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f326356f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326357g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f326358h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f326359i;

    /* renamed from: j, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f326360j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326361k;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2548x18d5ed17.C20460x6a8ac3c1()) == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b r5) {
        /*
            r4 = this;
            r4.f326361k = r5
            r4.<init>()
            bm5.o1 r5 = bm5.o1.f104252a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r0 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r0.<init>()
            int r5 = r5.h(r0)
            java.lang.Class<e42.e0> r0 = e42.e0.class
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r2) goto L2f
            r2 = 3
            if (r5 == r2) goto L2e
            i95.m r5 = i95.n0.c(r0)
            e42.e0 r5 = (e42.e0) r5
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance r2 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsMoreTemplateEntrance
            r2.<init>()
            h62.d r5 = (h62.d) r5
            int r5 = r5.nj(r2)
            if (r5 != r3) goto L2e
            goto L2f
        L2e:
            r3 = r1
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "enableShowMoreTemplateEntrance: "
            r5.<init>(r2)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r2 = "SnsMaasConfigImpl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
            r4.f326351a = r3
            i95.m r5 = i95.n0.c(r0)
            e42.e0 r5 = (e42.e0) r5
            e42.c0 r0 = e42.c0.clicfg_sns_maas_ai_template_force_skip
            h62.d r5 = (h62.d) r5
            boolean r5 = r5.fj(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "forceSkipAITemplateRecommend: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            r4.f326352b = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f326353c = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f326354d = r5
            dz0.z r5 = dz0.z.f326609d
            jz5.g r5 = jz5.h.b(r5)
            r4.f326357g = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r4.f326358h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.<init>(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC):void");
    }

    public final void b(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2 recommendResult) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recommendResult, "recommendResult");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "pushData: ");
        java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755> m33925x3b87fe12 = recommendResult.m33925x3b87fe12();
        if (m33925x3b87fe12 != null) {
            list = new java.util.ArrayList();
            java.util.Iterator<T> it = m33925x3b87fe12.iterator();
            while (it.hasNext()) {
                java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285> m33888xb16bed75 = ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755) it.next()).m33888xb16bed75();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33888xb16bed75, "getTemplateInfos(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m33888xb16bed75) {
                    java.lang.String m33891xed09a5a5 = ((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj).m33891xed09a5a5();
                    if ((((m33891xed09a5a5 == null || m33891xed09a5a5.length() == 0) ^ true) && this.f326352b) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                kz5.h0.u(list, arrayList);
            }
        } else {
            list = kz5.p0.f395529d;
        }
        java.util.List list2 = this.f326353c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) it6.next()).m33907x3bfa570b());
        }
        java.util.List list3 = this.f326354d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list3, 10));
        java.util.Iterator it7 = list3.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) it7.next()).m33907x3bfa570b());
        }
        java.util.List t07 = kz5.n0.t0(arrayList2, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (!((java.util.ArrayList) t07).contains(((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285) obj2).m33907x3bfa570b())) {
                arrayList4.add(obj2);
            }
        }
        this.f326356f = recommendResult.m33927x1ee84eda();
        arrayList4.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "pushData: get " + list.size() + " data, filtered " + arrayList4.size() + ", hasNext " + recommendResult.m33928x7fc17c34() + ", isEnableSingleTemplateMusicRec " + this.f326356f);
        int nj6 = this.f326351a ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326361k.f151317e.f326388a, "MomentsTemplateRecommendv2") ? 3 : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.C20374x60ed776c()) : Integer.MAX_VALUE;
        if (((java.util.ArrayList) this.f326354d).size() < nj6) {
            ((java.util.ArrayList) this.f326354d).addAll(kz5.n0.K0(arrayList4, nj6));
            if (arrayList4.size() > nj6) {
                synchronized (this.f326361k.f151329t) {
                    ((java.util.ArrayList) this.f326353c).addAll(kz5.n0.L0(arrayList4, arrayList4.size() - nj6));
                }
            }
            p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f326360j;
            if (interfaceC29045xdcb5ca57 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.valueOf(recommendResult.m33928x7fc17c34()), this.f326353c)));
            }
            this.f326360j = null;
        } else {
            synchronized (this.f326361k.f151329t) {
                ((java.util.ArrayList) this.f326353c).addAll(arrayList4);
            }
        }
        this.f326355e = recommendResult.m33928x7fc17c34() ? recommendResult.m33926x38161ccd() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0085 -> B:10:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r8, int r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dz0.b0
            if (r0 == 0) goto L13
            r0 = r10
            dz0.b0 r0 = (dz0.b0) r0
            int r1 = r0.f326312i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326312i = r1
            goto L18
        L13:
            dz0.b0 r0 = new dz0.b0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f326310g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f326312i
            java.lang.String r3 = "MaasMultiTemplate.MaasSdkUIC"
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            int r8 = r0.f326309f
            int r9 = r0.f326308e
            java.lang.Object r2 = r0.f326307d
            dz0.e0 r2 = (dz0.e0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L88
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "requestData: listSize "
            r10.<init>(r2)
            java.util.List r2 = r7.f326353c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r10.append(r2)
            java.lang.String r2 = " offset "
            r10.append(r2)
            r10.append(r8)
            java.lang.String r2 = " pageSize "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
            r2 = r7
        L69:
            java.util.List r10 = r2.f326353c
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            int r5 = r8 + r9
            if (r10 >= r5) goto La7
            java.lang.String r10 = r2.f326355e
            if (r10 == 0) goto La7
            r0.f326307d = r2
            r0.f326308e = r8
            r0.f326309f = r9
            r0.f326312i = r4
            java.lang.Object r10 = r2.d(r0)
            if (r10 != r1) goto L88
            return r1
        L88:
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            boolean r10 = r10 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L69
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "requestData: cancel, "
            r10.<init>(r0)
            java.util.List r0 = r2.f326353c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r10)
        La7:
            jz5.l r10 = new jz5.l
            java.lang.String r0 = r2.f326355e
            if (r0 == 0) goto Lae
            goto Laf
        Lae:
            r4 = 0
        Laf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            java.util.List r1 = r2.f326353c
            r2 = r1
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            int r9 = r9 + r8
            if (r2 >= r9) goto Lcd
            r9 = r1
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r8 = r1.subList(r8, r9)
            goto Ld3
        Lcd:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.List r8 = r1.subList(r8, r9)
        Ld3:
            r10.<init>(r0, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.c(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:26|27))(10:28|(1:30)(1:41)|31|32|(4:34|(1:36)|37|(1:39)(1:40))|25|(1:16)|17|18|(2:20|21)(1:23))|12|(5:14|(0)|17|18|(0)(0))|25|(0)|17|18|(0)(0)))|44|6|7|(0)(0)|12|(0)|25|(0)|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0079, B:14:0x007d, B:16:0x0085, B:17:0x008a, B:32:0x005f, B:34:0x0065, B:37:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:11:0x002c, B:12:0x0079, B:14:0x007d, B:16:0x0085, B:17:0x008a, B:32:0x005f, B:34:0x0065, B:37:0x006b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof dz0.d0
            if (r0 == 0) goto L13
            r0 = r9
            dz0.d0 r0 = (dz0.d0) r0
            int r1 = r0.f326338g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f326338g = r1
            goto L18
        L13:
            dz0.d0 r0 = new dz0.d0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f326336e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f326338g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MaasMultiTemplate.MaasSdkUIC"
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r0 = r0.f326335d
            dz0.e0 r0 = (dz0.e0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)     // Catch: java.lang.Throwable -> L30
            goto L79
        L30:
            r9 = move-exception
            goto L8f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "dataHolder triggerRecommend: "
            r9.<init>(r2)
            java.lang.String r2 = r8.f326355e
            if (r2 == 0) goto L52
            int r2 = r2.length()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            goto L53
        L52:
            r7 = r5
        L53:
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r9)
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC r9 = r8.f326361k
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L30
            az0.n7 r2 = r9.f151316d     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L82
            java.lang.String r7 = r8.f326355e     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L6b
            java.lang.String r7 = ""
        L6b:
            java.lang.String r9 = r9.f151323n     // Catch: java.lang.Throwable -> L30
            r0.f326335d = r8     // Catch: java.lang.Throwable -> L30
            r0.f326338g = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r2.j(r7, r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L78
            return r1
        L78:
            r0 = r8
        L79:
            com.tencent.maas.model.MJTemplateRecommendResult r9 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4123xc221bdc2) r9     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L82
            r0.b(r9)     // Catch: java.lang.Throwable -> L30
            r9 = r3
            goto L83
        L82:
            r9 = r5
        L83:
            if (r9 != 0) goto L8a
            java.lang.String r9 = "dataHolder triggerRecommend: recommend error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r9)     // Catch: java.lang.Throwable -> L30
        L8a:
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r3)     // Catch: java.lang.Throwable -> L30
            goto L99
        L8f:
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L99:
            java.lang.Throwable r9 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r9)
            if (r9 == 0) goto La8
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "triggerRecommend: onFailure"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r9, r1, r0)
            return r9
        La8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dz0.e0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
