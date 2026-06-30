package zh1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class})
/* loaded from: classes8.dex */
public final class p extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public static final zh1.p f554464d = new zh1.p();

    public zh1.z0 Ai(bi1.g openMaterialScene, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.v0 v0Var, zh1.c1 c1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        openMaterialCollection.m52062x9616526c();
        zh1.z0 a17 = zh1.v.f554478n.a(2L, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, c1Var);
        a17.o(zh1.y0.ENABLE);
        return a17;
    }

    public void Bi(java.util.List materialModelList, zh1.a1 a1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModelList, "materialModelList");
        materialModelList.toString();
        int i17 = ai1.a.f86613a;
        ai1.p pVar = ai1.p.f86635b;
        java.lang.String a17 = ai1.b.f86614a.a(materialModelList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterials materialModelList:" + materialModelList);
        java.util.HashMap hashMap = ai1.p.f86636c;
        synchronized (hashMap) {
            ai1.f fVar = new ai1.f(a1Var, materialModelList);
            if (hashMap.containsKey(a17)) {
                if (a1Var != null) {
                    java.lang.Object obj = hashMap.get(a17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    ((java.util.ArrayList) obj).add(fVar);
                }
                return;
            }
            hashMap.put(a17, new java.util.ArrayList());
            if (a1Var != null) {
                java.lang.Object obj2 = hashMap.get(a17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                ((java.util.ArrayList) obj2).add(fVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchMultiSelectOpenMaterialsByCgi requestKey:" + a17 + " materialModelList:" + materialModelList);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x xVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/batchgetmaterialrecommwxa";
            lVar.f152200d = 16463;
            r45.pf pfVar = new r45.pf();
            x.d dVar = new x.d(0);
            java.util.Iterator it = materialModelList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                java.util.LinkedList linkedList = pfVar.f464525d;
                if (!hasNext) {
                    linkedList.size();
                    lVar.f152197a = pfVar;
                    lVar.f152198b = new r45.qf();
                    ((h80.i) xVar).wi(lVar.a(), new ai1.j(materialModelList, a17));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) it.next();
                java.lang.String mimeType = c12476xea20f622.f167802d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
                if ((mimeType.length() > 0) && !dVar.contains(c12476xea20f622.f167802d)) {
                    r45.wi4 wi4Var = new r45.wi4();
                    wi4Var.f470741d = c12476xea20f622.f167802d;
                    wi4Var.f470742e = c12476xea20f622.f167803e;
                    linkedList.add(wi4Var);
                    dVar.add(c12476xea20f622.f167802d);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Di(java.util.List r12) {
        /*
            r11 = this;
            java.lang.String r0 = "materialModelList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            r12.toString()
            ai1.p r0 = ai1.p.f86635b
            ai1.b r1 = ai1.b.f86614a
            boolean r2 = r12.isEmpty()
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r6 = "MicroMsg.AppBrand.OpenMaterialDataCache"
            if (r2 == 0) goto L1e
            java.lang.String r1 = "materialModelList is null, get fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            goto Lc3
        L1e:
            java.lang.String r1 = r1.a(r12)
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r2 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "materialModelListKey is null, get fail, materialModelList:"
            r1.<init>(r2)
            int r2 = r12.size()
            r1.append(r2)
            java.lang.String r2 = " return"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r1)
            goto Lc3
        L44:
            java.lang.String r2 = "OpenMaterialsMultiRsp###"
            java.lang.String r2 = r2.concat(r1)
            com.tencent.mm.plugin.appbrand.app.q0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a
            com.tencent.mm.sdk.platformtools.o4 r8 = r7.a()
            if (r8 == 0) goto L57
            java.lang.String r8 = r8.getString(r2, r5)
            goto L58
        L57:
            r8 = r5
        L58:
            java.lang.String r9 = "OpenMaterialsMultiRspTime###_"
            java.lang.String r1 = r9.concat(r1)
            com.tencent.mm.sdk.platformtools.o4 r7 = r7.a()
            r9 = 0
            if (r7 == 0) goto L6a
            long r9 = r7.getLong(r1, r9)
        L6a:
            if (r8 == 0) goto L75
            int r1 = r8.length()
            if (r1 != 0) goto L73
            goto L75
        L73:
            r1 = r4
            goto L76
        L75:
            r1 = r3
        L76:
            if (r1 != 0) goto Lc3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "get, got rawCgiRsp for cacheKey: "
            r1.<init>(r7)
            r1.append(r2)
            java.lang.String r2 = " rawCgiRsp:"
            r1.append(r2)
            int r2 = r8.length()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            r45.qf r1 = new r45.qf     // Catch: java.lang.Exception -> Lb1
            r1.<init>()     // Catch: java.lang.Exception -> Lb1
            java.nio.charset.Charset r2 = r26.c.f450400c     // Catch: java.lang.Exception -> Lb1
            byte[] r2 = r8.getBytes(r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r7 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r7)     // Catch: java.lang.Exception -> Lb1
            r1.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> Lb1
            nm5.b r1 = nm5.j.c(r1, r2)     // Catch: java.lang.Exception -> Lb1
            goto Lc4
        Lb1:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "get, parse rawCgiRsp fail since "
            r2.<init>(r7)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r1)
        Lc3:
            r1 = r5
        Lc4:
            if (r1 != 0) goto Lce
            java.lang.String r12 = "MicroMsg.AppBrand.WeChatOpenMaterialDataSource"
            java.lang.String r0 = "fetchMultiSelectOpenMaterialsQuickly, cachedCgiRsp is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r0)
            goto Lec
        Lce:
            java.lang.Object r2 = r1.a(r4)
            java.lang.String r4 = "$1(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r45.qf r2 = (r45.qf) r2
            java.lang.Object r1 = r1.a(r3)
            java.lang.String r3 = "$2(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r5 = r0.c(r2, r3, r12)
        Lec:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.p.Di(java.util.List):com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection");
    }

    public void Ni(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel, zh1.a1 fetchOpenMaterialsCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetchOpenMaterialsCallback, "fetchOpenMaterialsCallback");
        materialModel.m52074x9616526c();
        ai1.p pVar = ai1.p.f86635b;
        nm5.b b17 = ai1.b.f86614a.b(materialModel);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeChatOpenMaterialDataSource", "fetchOpenMaterials, cachedCgiRsp is null");
            pVar.b(materialModel, fetchOpenMaterialsCallback);
            return;
        }
        java.lang.Object a17 = b17.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$1(...)");
        java.lang.Object a18 = b17.a(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
        pm0.v.X(new ai1.n(fetchOpenMaterialsCallback, (r45.ji3) a17, ((java.lang.Number) a18).longValue(), materialModel));
        pVar.b(materialModel, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 Ri(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        int i17 = ai1.a.f86613a;
        ai1.p pVar = ai1.p.f86635b;
        nm5.b b17 = ai1.b.f86614a.b(materialModel);
        if (b17 == null) {
            return null;
        }
        java.lang.Object a17 = b17.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$1(...)");
        java.lang.Object a18 = b17.a(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$2(...)");
        return pVar.d((r45.ji3) a17, ((java.lang.Number) a18).longValue(), materialModel);
    }

    public zh1.w0 Ui(long j17, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5, java.lang.String str) {
        bi1.g gVar;
        bi1.g gVar2;
        if (j17 != 1) {
            bi1.g gVar3 = bi1.g.IMAGE;
            if (j17 != 2) {
                if (j17 == 3) {
                    gVar2 = bi1.g.VIDEO;
                } else if (j17 == 4) {
                    gVar2 = bi1.g.ATTACH;
                } else if (j17 == 5) {
                    gVar2 = bi1.g.SNS_IMAGE;
                } else if (j17 == 6) {
                    gVar2 = bi1.g.SNS_VIDEO;
                }
            }
            gVar = gVar3;
            return new di1.f(j18, gVar, c12473xe2bfc4b5, str);
        }
        gVar2 = bi1.g.WEB_VIEW;
        gVar = gVar2;
        return new di1.f(j18, gVar, c12473xe2bfc4b5, str);
    }

    public boolean Vi(bi1.g openMaterialScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        boolean z17 = (j62.e.g().i(openMaterialScene.f102526f, openMaterialScene.f102527g, true, true) & openMaterialScene.f102525e) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "isEnabled(" + openMaterialScene + "): " + z17);
        return z17;
    }

    public boolean Zi(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        int i17 = bottomSheet.R1;
        boolean z17 = true;
        java.util.List appBrandOpenMaterialDetailModels = openMaterialCollection.f167785g;
        if (i17 == 0) {
            java.util.List appBrandOpenMaterialModels = openMaterialCollection.f167784f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
            if (!(!appBrandOpenMaterialModels.isEmpty())) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
                if (!(!appBrandOpenMaterialDetailModels.isEmpty())) {
                    z17 = false;
                }
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            z17 = true ^ appBrandOpenMaterialDetailModels.isEmpty();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialService", "needEnhance, needEnhance: " + z17);
        return z17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 aj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel) {
        java.lang.String jSONObject;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, materialModel: " + materialModel + ", remove: false");
        org.json.JSONObject e17 = ai1.d.e(materialModel);
        if (e17 == null || (jSONObject = e17.toString()) == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5.a(materialModel);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5 = null;
        if (a17 != null && (string = a17.getString(jSONObject, null)) != null) {
            try {
                c12473xe2bfc4b5 = ai1.d.a(new org.json.JSONObject(string));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialsTempStorage", "getCollectionInner, fail since " + e18);
            }
        }
        return c12473xe2bfc4b5 == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5.a(materialModel) : c12473xe2bfc4b5;
    }

    public zh1.w0 bj(bi1.g openMaterialScene, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialScene, "openMaterialScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        ai1.c cVar = ai1.c.f86615a;
        return new di1.f(2L, openMaterialScene, openMaterialCollection, z17 ? cVar.a(materialModel, true) : cVar.a(materialModel, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[EDGE_INSN: B:30:0x00a8->B:31:0x00a8 BREAK  A[LOOP:0: B:9:0x000f->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[LOOP:0: B:9:0x000f->B:35:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(java.util.List r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            java.util.Iterator r8 = r8.iterator()
        Lf:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto La7
            java.lang.Object r1 = r8.next()
            r3 = r1
            com.tencent.mm.plugin.scanner.ImageQBarDataBean r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) r3
            int r4 = r3.f240153e
            java.lang.String r3 = r3.f240152d
            java.lang.Class<kd0.l2> r5 = kd0.l2.class
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(r4, r3)
            if (r6 != 0) goto La3
            i95.m r6 = i95.n0.c(r5)
            kd0.l2 r6 = (kd0.l2) r6
            jd0.z1 r6 = (jd0.z1) r6
            r6.getClass()
            boolean r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.k(r4, r3)
            if (r6 != 0) goto La3
            i95.m r5 = i95.n0.c(r5)
            kd0.l2 r5 = (kd0.l2) r5
            jd0.z1 r5 = (jd0.z1) r5
            r5.getClass()
            boolean r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.m(r4, r3)
            if (r3 != 0) goto La3
            boolean r3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(r4)
            if (r3 == 0) goto La1
            goto La3
        La1:
            r3 = r2
            goto La4
        La3:
            r3 = r0
        La4:
            if (r3 == 0) goto Lf
            goto La8
        La7:
            r1 = 0
        La8:
            if (r1 != 0) goto Lab
            goto Lac
        Lab:
            r0 = r2
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.p.wi(java.util.List):boolean");
    }
}
