package c61;

/* loaded from: classes13.dex */
public final class ab implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762, jy1.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23618x7826422 f120416d;

    public final boolean a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return android.text.TextUtils.equals(str, "biz_in") || android.text.TextUtils.equals(str, "biz_out") || android.text.TextUtils.equals(str, "session_in") || android.text.TextUtils.equals(str, "session_out") || android.text.TextUtils.equals(str, "page_in") || android.text.TextUtils.equals(str, "page_out");
    }

    public void b(java.lang.String action, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23618x7826422 c23618x7826422 = this.f120416d;
        if (c23618x7826422 != null) {
            c23618x7826422.m87501xe4cc98ac(action, params, c61.za.f120988d);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.Companion.m87507x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f120416d = new com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23618x7826422(m137983x3b5b91dc2, null, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[attachedFlutterEngine] listener : " + this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f178228e;
        if (!copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.add(this);
        }
        ez1.g.f339373i.P(eVar);
        mz1.b.b().a(eVar);
        gz1.d.f359247d.t(eVar);
        eVar.f178229f.mo48813x58998cd();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762.Companion.m87507x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f120416d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[detachedFlutterEngine] listener : " + this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) eVar.f178228e;
        copyOnWriteArrayList.remove(this);
        if (copyOnWriteArrayList.isEmpty()) {
            ((java.util.concurrent.ConcurrentHashMap) eVar.f178227d).clear();
            ez1.g.f339373i.Y(eVar);
            mz1.b.b().getClass();
            ((java.util.concurrent.CopyOnWriteArrayList) mz1.b.f414616d).remove(eVar);
            gz1.d.f359248e.remove(eVar);
            eVar.f178229f.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762
    /* renamed from: reportAllOutEvent */
    public void mo14230x4bc9aad9(final long j17, final long j18, final java.lang.String eventId, final java.lang.String pageName, java.util.Map params, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 sourcePageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(kz5.c1.s(params));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb = sourcePageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m87523x34ce98eb.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", sourcePageInfo.m87521x29bd2700());
        linkedHashMap2.put("page_name", sourcePageInfo.m87522xaf11af30());
        linkedHashMap.put("source_page", linkedHashMap2);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this;
                eVar2.getClass();
                java.util.HashMap hashMap = new java.util.HashMap(eVar2.Ai(linkedHashMap));
                hashMap.put("page_id", java.lang.Long.valueOf(j18));
                hashMap.put("page_name", pageName);
                ((fm4.f) ((qk.k8) i95.n0.c(qk.k8.class))).getClass();
                jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
                hashMap.put("exploresessions", Zi != null ? fm4.f.Ni(p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168842x21ba5539(((jm4.k4) Zi).m105978x2737f10())) : null);
                oz1.e.a().d(eventId, j17, hashMap);
            }
        });
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762
    /* renamed from: reportCustomCgiEvent */
    public void mo14231xb63d71fa(long j17, java.lang.String eventId, java.util.Map params, long j18, boolean z17, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 curPageInfo, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 sourcePageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curPageInfo, "curPageInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePageInfo, "sourcePageInfo");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb = curPageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m87523x34ce98eb.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.m87521x29bd2700());
        linkedHashMap2.put("page_name", curPageInfo.m87522xaf11af30());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb2 = sourcePageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : m87523x34ce98eb2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.m87521x29bd2700());
        linkedHashMap3.put("page_name", sourcePageInfo.m87522xaf11af30());
        if (a(eventId)) {
            linkedHashMap.put("source_page", linkedHashMap3);
        } else {
            linkedHashMap2.put("source_page", linkedHashMap3);
        }
        jy1.e eVar = (jy1.e) i95.n0.c(jy1.e.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) eVar;
        eVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[reportCustomCgiEvent] eventId : ".concat(eventId));
        cy1.a.Ui().yj(eventId, null, new java.util.HashMap(eVar2.Ai(linkedHashMap)), (int) j18, valueOf.booleanValue());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762
    /* renamed from: reportCustomEvent */
    public void mo14232xd43b3fd5(long j17, java.lang.String eventId, java.util.Map params, long j18, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 curPageInfo, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 sourcePageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curPageInfo, "curPageInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePageInfo, "sourcePageInfo");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb = curPageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m87523x34ce98eb.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.m87521x29bd2700());
        linkedHashMap2.put("page_name", curPageInfo.m87522xaf11af30());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb2 = sourcePageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : m87523x34ce98eb2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.m87521x29bd2700());
        linkedHashMap3.put("page_name", sourcePageInfo.m87522xaf11af30());
        if (a(eventId)) {
            linkedHashMap.put("source_page", linkedHashMap3);
        } else {
            linkedHashMap2.put("source_page", linkedHashMap3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[reportCustomEvent] eventId : ".concat(eventId));
        cy1.a.Ui().Ej(eventId, eVar.Ai(linkedHashMap), (int) j18);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762
    /* renamed from: reportStandardPageEvent */
    public void mo14233xa83f203a(final long j17, final java.lang.String eventId, long j18, long j19, final java.lang.String pageName, java.util.Map params, java.util.List routeRules, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 sourcePageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeRules, "routeRules");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = routeRules.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23632x14b08df1 c23632x14b08df1 = (com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23632x14b08df1) it.next();
            ky1.d dVar = new ky1.d();
            java.lang.Long m87536x96bda6d = c23632x14b08df1.m87536x96bda6d();
            boolean z17 = false;
            dVar.f395032a = m87536x96bda6d != null ? (int) m87536x96bda6d.longValue() : 0;
            java.lang.Long m87535x96ae22f = c23632x14b08df1.m87535x96ae22f();
            dVar.f395033b = m87535x96ae22f != null ? (int) m87535x96ae22f.longValue() : 0;
            java.lang.Boolean m87538xa5a4e184 = c23632x14b08df1.m87538xa5a4e184();
            if (m87538xa5a4e184 != null) {
                z17 = m87538xa5a4e184.booleanValue();
            }
            dVar.f395035d = z17;
            arrayList.add(dVar);
        }
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb = sourcePageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m87523x34ce98eb.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", sourcePageInfo.m87521x29bd2700());
        linkedHashMap2.put("page_name", sourcePageInfo.m87522xaf11af30());
        linkedHashMap.put("source_page", linkedHashMap2);
        final int i17 = (int) j19;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        if (android.text.TextUtils.isEmpty(eventId)) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(pageName) || i17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[reportStandardPageEvent] pageName : " + pageName + ", pageId : " + i17 + ", eventId : " + eventId);
            sz1.i.f495474b.mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$c
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
                
                    if ((u46.l.c(r15, "TopStoryHomeUI") || u46.l.c(r15, "CastUIB")) != false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
                
                    if ((u46.l.c(r8, "TopStoryHomeUI") || u46.l.c(r8, "CastUIB")) != false) goto L51;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 335
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.RunnableC13176x2e755e.run():void");
                }
            }, 500L);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.InterfaceC23622xf9edb762
    /* renamed from: reportStandardViewEvent */
    public void mo14234x15cde5e4(final long j17, final java.lang.String eventId, final java.lang.String viewId, java.util.Map params, java.util.List routeRules, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 curPageInfo, com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23631x8e646d51 sourcePageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(routeRules, "routeRules");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curPageInfo, "curPageInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePageInfo, "sourcePageInfo");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = routeRules.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23632x14b08df1 c23632x14b08df1 = (com.p314xaae8f345.p2845xc516c4b6.p2851xae3a4f69.C23632x14b08df1) it.next();
            ky1.d dVar = new ky1.d();
            java.lang.Long m87536x96bda6d = c23632x14b08df1.m87536x96bda6d();
            boolean z17 = false;
            dVar.f395032a = m87536x96bda6d != null ? (int) m87536x96bda6d.longValue() : 0;
            java.lang.Long m87535x96ae22f = c23632x14b08df1.m87535x96ae22f();
            dVar.f395033b = m87535x96ae22f != null ? (int) m87535x96ae22f.longValue() : 0;
            java.lang.Boolean m87538xa5a4e184 = c23632x14b08df1.m87538xa5a4e184();
            if (m87538xa5a4e184 != null) {
                z17 = m87538xa5a4e184.booleanValue();
            }
            dVar.f395035d = z17;
            arrayList.add(dVar);
        }
        final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(params);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb = curPageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : m87523x34ce98eb.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap2.put("page_id", curPageInfo.m87521x29bd2700());
        linkedHashMap2.put("page_name", curPageInfo.m87522xaf11af30());
        linkedHashMap.put("cur_page", linkedHashMap2);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.Map<java.lang.String, java.lang.Object> m87523x34ce98eb2 = sourcePageInfo.m87523x34ce98eb();
        if (m87523x34ce98eb2 != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry2 : m87523x34ce98eb2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        linkedHashMap3.put("page_id", sourcePageInfo.m87521x29bd2700());
        linkedHashMap3.put("page_name", sourcePageInfo.m87522xaf11af30());
        linkedHashMap2.put("source_page", linkedHashMap3);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e) ((jy1.e) i95.n0.c(jy1.e.class));
        eVar.getClass();
        if (android.text.TextUtils.isEmpty(eventId) || android.text.TextUtils.isEmpty(viewId)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FlutterDataReportService", "[reportStandardViewEvent] viewId : " + viewId + ", eventId : " + eventId);
        if (arrayList.size() <= 0) {
            return;
        }
        sz1.i.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.datareport.flutter.e$$e
            @Override // java.lang.Runnable
            public final void run() {
                sy1.f fVar;
                java.lang.String str = eventId;
                long j18 = j17;
                java.util.List list = arrayList;
                com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e eVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1350x802f5d5e.p1352xd2ae381c.e.this;
                eVar2.getClass();
                boolean c17 = u46.l.c(str, "view_clk");
                java.lang.String str2 = viewId;
                if (c17 && (fVar = cy1.a.Ui().f306223m) != null) {
                    fVar.f495386h = str2;
                    fVar.f495387i = j18;
                }
                java.util.HashMap hashMap = new java.util.HashMap(eVar2.Ai(linkedHashMap));
                hashMap.put("view_id", str2);
                cy1.a.Ui().Lj(j18, str, hashMap, list);
            }
        });
    }
}
