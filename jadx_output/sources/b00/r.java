package b00;

@j95.b
/* loaded from: classes9.dex */
public final class r extends i95.w implements c00.z2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.m f16757d = new e00.m();

    /* renamed from: e, reason: collision with root package name */
    public final c00.y2 f16758e = new e00.e();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f16759f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f16760g = new java.util.HashMap();

    public static final void wi(b00.r rVar, e00.n nVar) {
        synchronized (rVar) {
            rVar.f16759f.remove(nVar.getKey());
            java.util.List list = (java.util.List) rVar.f16760g.remove(nVar.getKey());
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    rVar.Di((e00.n) it.next());
                }
            }
        }
    }

    public java.lang.Object Ai(java.util.List list, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        e00.e0 e0Var = new e00.e0(i17, list, z17);
        e0Var.f245759d = new b00.f(e0Var, list, this, rVar);
        Bi(e0Var);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final void Bi(e00.n nVar) {
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "request " + nVar.getCardType() + " of type: $" + nVar.b() + " with batch size: " + nVar.c() + ", ignoreCache cache: " + nVar.a());
        synchronized (this) {
            java.lang.String key = nVar.getKey();
            e00.n nVar2 = (e00.n) this.f16759f.get(key);
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "batchRequestProductCardInfo for key:" + key);
            if (nVar2 != null) {
                java.util.List list = (java.util.List) this.f16760g.get(key);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(nVar);
                this.f16760g.put(key, list);
                com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "batchRequest " + nVar.getCardType() + " task running, pending size:" + list.size());
            } else {
                com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "batchRequest " + nVar.getCardType() + " execute now");
                Di(nVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di(e00.n r22) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.Di(e00.n):void");
    }

    public void Ni(java.lang.String msgContent, int i17) {
        y02.p0 a17;
        bw5.m7 b17;
        java.util.LinkedList linkedList;
        java.lang.String p17;
        java.lang.String p18;
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        v05.b Vi = Vi(msgContent);
        w05.h hVar = Vi != null ? (w05.h) Vi.getCustom(Vi.f432315e + 74) : null;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: no ecsInfo, skip");
            return;
        }
        java.lang.String str = "";
        if (hVar.B()) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: is bulk buy card, call fetchBulkBuyCardJumpInfoAndPreloadIfNeed");
            v05.b Ri = Ri(msgContent);
            w05.h hVar2 = Ri != null ? (w05.h) Ri.getCustom(Ri.f432315e + 74) : null;
            if (hVar2 == null) {
                return;
            }
            s05.d dVar = (s05.d) Ri.getCustom(Ri.f432315e + 39);
            if (dVar != null && (p18 = dVar.p()) != null) {
                str = p18;
            }
            e00.v vVar = new e00.v(str, hVar2, i17);
            vVar.f245824d = new b00.g(vVar, this);
            Bi(vVar);
            return;
        }
        int r17 = hVar.r();
        boolean z17 = false;
        boolean z18 = (r17 & 4) != 0;
        boolean z19 = (r17 & 1) != 0;
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: flags=" + r17 + ", hasExposeFetch=" + z18 + ", hasExposePreload=" + z19);
        if (!z18 && !z19) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: no expose flags, skip");
            return;
        }
        if (z18) {
            s05.d dVar2 = (s05.d) Vi.getCustom(Vi.f432315e + 39);
            if (dVar2 != null && (p17 = dVar2.p()) != null) {
                str = p17;
            }
            e00.y yVar = new e00.y(str, hVar, i17);
            yVar.f245833d = new b00.h(yVar, this, z19);
            Bi(yVar);
            return;
        }
        if (z19) {
            bw5.x7 qj6 = qj(hVar.q());
            if (qj6 != null && (b17 = qj6.b()) != null && (linkedList = b17.f30097d) != null && (!linkedList.isEmpty())) {
                z17 = true;
            }
            if (!z17 || (a17 = y02.r0.f458626d.a()) == null) {
                return;
            }
            bw5.m7 b18 = qj6.b();
            kotlin.jvm.internal.o.f(b18, "getCgiPreloadInfo(...)");
            ((y02.r0) a17).d(b18);
        }
    }

    public final v05.b Ri(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() == 0) {
            return null;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(str);
        v05.b k17 = cVar.k();
        w05.h hVar = k17 != null ? (w05.h) k17.getCustom(k17.f432315e + 74) : null;
        if (hVar != null && hVar.B()) {
            z17 = true;
        }
        if (z17) {
            return cVar.k();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Ui(r45.lh0 r9, int r10, java.lang.String r11, long r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.Ui(r45.lh0, int, java.lang.String, long):java.lang.String");
    }

    public final v05.b Vi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(str);
        v05.b k17 = cVar.k();
        if ((k17 != null ? (w05.h) k17.getCustom(k17.f432315e + 74) : null) != null) {
            return cVar.k();
        }
        return null;
    }

    public java.util.List Zi(java.util.List products, int i17) {
        kotlin.jvm.internal.o.g(products, "products");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = products.iterator();
        while (it.hasNext()) {
            bw5.ne0 reqInfo = (bw5.ne0) it.next();
            e00.e eVar = (e00.e) this.f16758e;
            eVar.getClass();
            kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(reqInfo.f30652d);
            sb6.append('_');
            sb6.append(reqInfo.f30659n[5] ? reqInfo.f30656h : "");
            java.lang.String sb7 = sb6.toString();
            e00.c cVar = (e00.c) eVar.f245753a.get(sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("get product cache of key ");
            sb8.append(sb7);
            sb8.append(", cache time:");
            sb8.append(cVar != null ? java.lang.Long.valueOf(cVar.f245746b) : null);
            com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", sb8.toString());
            bw5.qe0 qe0Var = cVar != null ? cVar.f245745a : null;
            if (qe0Var != null) {
                arrayList.add(qe0Var);
            }
        }
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "getProductCardFromCache request size: " + products.size() + " result size: " + arrayList.size());
        return arrayList;
    }

    public java.lang.String aj(ot0.q qVar) {
        java.lang.String str;
        zy2.l lVar;
        r45.br2 br2Var;
        if (qVar == null || (lVar = (zy2.l) qVar.y(zy2.l.class)) == null || (br2Var = lVar.f477449b) == null || (str = br2Var.getString(9)) == null) {
            str = "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492569oa2, str);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public int bj(com.tencent.mm.storage.f9 msg, java.lang.String talker, boolean z17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(talker, "talker");
        g95.e0.f(msg);
        return e00.j.f245783a.a(msg.y0(), msg.T0(), z17);
    }

    public final java.lang.String cj(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nev);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        return "[" + str + "] " + str2;
    }

    public java.lang.String fj(ot0.q qVar) {
        hs.a aVar;
        bw5.g9 g9Var = (qVar == null || (aVar = (hs.a) qVar.y(hs.a.class)) == null) ? null : aVar.f284507b;
        java.lang.String e17 = g9Var != null ? g9Var.e() : null;
        if (e17 == null) {
            e17 = "";
        }
        java.lang.String nickname = g9Var != null ? g9Var.getNickname() : null;
        return cj(e17, nickname != null ? nickname : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r0 == pz5.a.f359186d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hj(android.content.Context r12, java.lang.String r13, com.tencent.mm.storage.f9 r14, bw5.x8 r15, kotlin.coroutines.Continuation r16) {
        /*
            r11 = this;
            e00.s r0 = new e00.s
            r0.<init>()
            java.lang.String r1 = r14.U1()
            ot0.q r1 = ot0.q.v(r1)
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.Class<zy2.l> r3 = zy2.l.class
            ot0.h r3 = r1.y(r3)
            zy2.l r3 = (zy2.l) r3
            if (r3 == 0) goto L1d
            r45.br2 r3 = r3.f477449b
            goto L1e
        L1d:
            r3 = r2
        L1e:
            if (r1 == 0) goto L2c
            java.lang.Class<rj.a> r4 = rj.a.class
            ot0.h r1 = r1.y(r4)
            rj.a r1 = (rj.a) r1
            if (r1 == 0) goto L2c
            w05.h r2 = r1.f396132b
        L2c:
            jz5.f0 r10 = jz5.f0.f302826a
            if (r3 == 0) goto L73
            java.lang.String r4 = r14.y0()
            java.lang.String r1 = "getFromUsername(...)"
            kotlin.jvm.internal.o.f(r4, r1)
            java.lang.String r5 = r14.T0()
            java.lang.String r1 = "getToUsername(...)"
            kotlin.jvm.internal.o.f(r5, r1)
            bw5.u8 r6 = e00.l.b(r3)
            java.lang.Class<c00.c3> r1 = c00.c3.class
            i95.m r1 = i95.n0.c(r1)
            c00.c3 r1 = (c00.c3) r1
            b00.u r1 = (b00.u) r1
            r3 = r14
            java.lang.String r7 = r1.wi(r14)
            if (r2 == 0) goto L5d
            java.lang.String r1 = r2.A()
            if (r1 != 0) goto L5f
        L5d:
            java.lang.String r1 = ""
        L5f:
            r8 = r1
            r1 = r12
            r2 = r4
            r3 = r5
            r4 = r13
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r15
            r9 = r16
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            pz5.a r1 = pz5.a.f359186d
            if (r0 != r1) goto L7a
            goto L7b
        L73:
            java.lang.String r0 = "ProductCardJumpDelegate"
            java.lang.String r1 = "open product detail content is null"
            com.tencent.mars.xlog.Log.i(r0, r1)
        L7a:
            r0 = r10
        L7b:
            pz5.a r1 = pz5.a.f359186d
            if (r0 != r1) goto L80
            return r0
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.hj(android.content.Context, java.lang.String, com.tencent.mm.storage.f9, bw5.x8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(android.content.Context context, java.lang.String talker, com.tencent.mm.storage.f9 msg, bw5.x8 reqScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(reqScene, "reqScene");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new b00.i(this, context, talker, msg, reqScene, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mj(android.content.Context r13, c00.j4 r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof b00.j
            if (r0 == 0) goto L13
            r0 = r15
            b00.j r0 = (b00.j) r0
            int r1 = r0.f16692f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16692f = r1
            goto L18
        L13:
            b00.j r0 = new b00.j
            r0.<init>(r12, r15)
        L18:
            r10 = r0
            java.lang.Object r15 = r10.f16690d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f16692f
            jz5.f0 r11 = jz5.f0.f302826a
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L59
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r14
            g00.c r15 = (g00.c) r15
            bw5.u8 r6 = r15.f267386d
            if (r6 == 0) goto L5b
            e00.s r1 = new e00.s
            r1.<init>()
            g00.c r14 = (g00.c) r14
            java.lang.String r3 = r14.f267389g
            java.lang.String r4 = r14.f267390h
            java.lang.String r5 = r14.f267388f
            java.lang.String r7 = r14.f267391i
            java.lang.String r8 = r14.f267392m
            bw5.x8 r9 = r14.f267387e
            r10.f16692f = r2
            r2 = r13
            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r13 != r0) goto L59
            return r0
        L59:
            r13 = r11
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r13 != 0) goto L65
            java.lang.String r13 = "Ecs.EcsCardMgrService"
            java.lang.String r14 = "openProductWithModel: model.productShareObject is null"
            com.tencent.mars.xlog.Log.e(r13, r14)
        L65:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.mj(android.content.Context, c00.j4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object nj(android.content.Context r17, c00.k4 r18, kotlin.coroutines.Continuation r19) {
        /*
            r16 = this;
            r0 = r19
            boolean r1 = r0 instanceof b00.k
            if (r1 == 0) goto L17
            r1 = r0
            b00.k r1 = (b00.k) r1
            int r2 = r1.f16701f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f16701f = r2
            r2 = r16
            goto L1e
        L17:
            b00.k r1 = new b00.k
            r2 = r16
            r1.<init>(r2, r0)
        L1e:
            r12 = r1
            java.lang.Object r0 = r12.f16699d
            pz5.a r1 = pz5.a.f359186d
            int r3 = r12.f16701f
            jz5.f0 r15 = jz5.f0.f302826a
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            kotlin.ResultKt.throwOnFailure(r0)
            goto L65
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r18
            g00.f r0 = (g00.f) r0
            bw5.g9 r5 = r0.f267398d
            if (r5 == 0) goto L67
            e00.k0 r3 = new e00.k0
            r3.<init>()
            r0 = r18
            g00.f r0 = (g00.f) r0
            java.lang.String r6 = r0.f267400f
            java.lang.String r7 = r0.f267401g
            java.lang.String r8 = r0.f267402h
            java.lang.String r9 = r0.f267403i
            bw5.x8 r10 = r0.f267399e
            r11 = 0
            r13 = 128(0x80, float:1.8E-43)
            r14 = 0
            r12.f16701f = r4
            r4 = r17
            java.lang.Object r0 = e00.k0.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L65
            return r1
        L65:
            r0 = r15
            goto L68
        L67:
            r0 = 0
        L68:
            if (r0 != 0) goto L71
            java.lang.String r0 = "Ecs.EcsCardMgrService"
            java.lang.String r1 = "openShopCardWithModel: model.shopCardShareObject is null"
            com.tencent.mars.xlog.Log.e(r0, r1)
        L71:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.nj(android.content.Context, c00.k4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object oj(android.content.Context context, java.lang.String str, com.tencent.mm.storage.f9 f9Var, bw5.x8 x8Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object c17 = new e00.k0().c(context, str, f9Var, x8Var, continuation);
        return c17 == pz5.a.f359186d ? c17 : jz5.f0.f302826a;
    }

    public void pj(android.content.Context context, java.lang.String talker, com.tencent.mm.storage.f9 msg, bw5.x8 reqScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(reqScene, "reqScene");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new b00.l(this, context, talker, msg, reqScene, null), 3, null);
    }

    public final bw5.x7 qj(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            bw5.x7 x7Var = new bw5.x7();
            r10.a.a(x7Var, str);
            return x7Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Ecs.EcsCardMgrService", "parseEcsJumpInfoFromBase64 failed: " + e17);
            return null;
        }
    }

    public final boolean rj(bw5.x7 x7Var, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        y02.p0 a17;
        java.util.LinkedList linkedList;
        boolean z18 = false;
        if (x7Var == null || x7Var.f34977h.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "performNativeCardJump: no valid jumpInfo");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "performNativeCardJump with jumpInfo, clickTimestamp=" + j17 + ", openTimestamp=" + currentTimeMillis + ", diff=" + (currentTimeMillis - j17) + "ms");
        if (z17) {
            bw5.m7 b17 = x7Var.b();
            if (b17 != null && (linkedList = b17.f30097d) != null && (!linkedList.isEmpty())) {
                z18 = true;
            }
            if (z18 && (a17 = y02.r0.f458626d.a()) != null) {
                bw5.m7 b18 = x7Var.b();
                kotlin.jvm.internal.o.f(b18, "getCgiPreloadInfo(...)");
                ((y02.r0) a17).d(b18);
            }
        }
        pq.a aVar = new pq.a(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("click_timestamp", j17);
        jSONObject.put("open_timestamp", currentTimeMillis);
        aVar.b(jSONObject);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sj(com.tencent.mm.storage.f9 r22, android.content.Context r23, bw5.x8 r24) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.sj(com.tencent.mm.storage.f9, android.content.Context, bw5.x8):boolean");
    }

    public void tj(android.content.Context context, java.lang.String str, long j17, java.lang.String str2) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "finalJumpInfoBase64 nil");
            return;
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.a aVar = new pq.a(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("entranceGMsgID", ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(str, j17));
        aVar.b(jSONObject);
        kotlin.jvm.internal.o.d(str2);
        pq.q.se((pq.q) c17, aVar, str2, null, 4, null);
    }

    public void uj(android.content.Context context, r45.lh0 lh0Var, java.lang.String str, int i17, long j17) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "processSnsProductJump");
        try {
            str2 = Ui(lh0Var, i17, str, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Ecs.EcsCardMgrService", "getFinalJumpInfoBase64 exp:" + e17);
            str2 = "";
        }
        tj(context, str, j17, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object vj(bw5.ne0 r9, int r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof b00.q
            if (r0 == 0) goto L13
            r0 = r12
            b00.q r0 = (b00.q) r0
            int r1 = r0.f16752f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16752f = r1
            goto L18
        L13:
            b00.q r0 = new b00.q
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f16750d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f16752f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r12)
            goto L5f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.List r4 = kz5.b0.c(r9)
            r0.f16752f = r3
            kotlinx.coroutines.r r9 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r12 = pz5.f.b(r0)
            r9.<init>(r12, r3)
            r9.k()
            e00.b0 r12 = new e00.b0
            r12.<init>(r10, r4, r11)
            b00.e r11 = new b00.e
            r2 = r11
            r3 = r12
            r5 = r8
            r6 = r10
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r12.f245743d = r11
            r8.Bi(r12)
            java.lang.Object r12 = r9.j()
            if (r12 != r1) goto L5f
            return r1
        L5f:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L6a
            java.lang.Object r9 = kz5.n0.Z(r12)
            bw5.qe0 r9 = (bw5.qe0) r9
            goto L6b
        L6a:
            r9 = 0
        L6b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.vj(bw5.ne0, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
