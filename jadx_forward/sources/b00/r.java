package b00;

@j95.b
/* loaded from: classes9.dex */
public final class r extends i95.w implements c00.z2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.m f98290d = new e00.m();

    /* renamed from: e, reason: collision with root package name */
    public final c00.y2 f98291e = new e00.e();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f98292f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f98293g = new java.util.HashMap();

    public static final void wi(b00.r rVar, e00.n nVar) {
        synchronized (rVar) {
            rVar.f98292f.remove(nVar.mo126544xb5884f29());
            java.util.List list = (java.util.List) rVar.f98293g.remove(nVar.mo126544xb5884f29());
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    rVar.Di((e00.n) it.next());
                }
            }
        }
    }

    public java.lang.Object Ai(java.util.List list, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        e00.e0 e0Var = new e00.e0(i17, list, z17);
        e0Var.f327292d = new b00.f(e0Var, list, this, rVar);
        Bi(e0Var);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final void Bi(e00.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "request " + nVar.mo126543x7b5cb3e0() + " of type: $" + nVar.b() + " with batch size: " + nVar.c() + ", ignoreCache cache: " + nVar.a());
        synchronized (this) {
            java.lang.String mo126544xb5884f29 = nVar.mo126544xb5884f29();
            e00.n nVar2 = (e00.n) this.f98292f.get(mo126544xb5884f29);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "batchRequestProductCardInfo for key:" + mo126544xb5884f29);
            if (nVar2 != null) {
                java.util.List list = (java.util.List) this.f98293g.get(mo126544xb5884f29);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(nVar);
                this.f98293g.put(mo126544xb5884f29, list);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "batchRequest " + nVar.mo126543x7b5cb3e0() + " task running, pending size:" + list.size());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "batchRequest " + nVar.mo126543x7b5cb3e0() + " execute now");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        v05.b Vi = Vi(msgContent);
        w05.h hVar = Vi != null ? (w05.h) Vi.m75936x14adae67(Vi.f513848e + 74) : null;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: no ecsInfo, skip");
            return;
        }
        java.lang.String str = "";
        if (hVar.B()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: is bulk buy card, call fetchBulkBuyCardJumpInfoAndPreloadIfNeed");
            v05.b Ri = Ri(msgContent);
            w05.h hVar2 = Ri != null ? (w05.h) Ri.m75936x14adae67(Ri.f513848e + 74) : null;
            if (hVar2 == null) {
                return;
            }
            s05.d dVar = (s05.d) Ri.m75936x14adae67(Ri.f513848e + 39);
            if (dVar != null && (p18 = dVar.p()) != null) {
                str = p18;
            }
            e00.v vVar = new e00.v(str, hVar2, i17);
            vVar.f327357d = new b00.g(vVar, this);
            Bi(vVar);
            return;
        }
        int r17 = hVar.r();
        boolean z17 = false;
        boolean z18 = (r17 & 4) != 0;
        boolean z19 = (r17 & 1) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: flags=" + r17 + ", hasExposeFetch=" + z18 + ", hasExposePreload=" + z19);
        if (!z18 && !z19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "fetchNativeCardJumpInfoAndPreloadIfNeed: no expose flags, skip");
            return;
        }
        if (z18) {
            s05.d dVar2 = (s05.d) Vi.m75936x14adae67(Vi.f513848e + 39);
            if (dVar2 != null && (p17 = dVar2.p()) != null) {
                str = p17;
            }
            e00.y yVar = new e00.y(str, hVar, i17);
            yVar.f327366d = new b00.h(yVar, this, z19);
            Bi(yVar);
            return;
        }
        if (z19) {
            bw5.x7 qj6 = qj(hVar.q());
            if (qj6 != null && (b17 = qj6.b()) != null && (linkedList = b17.f111630d) != null && (!linkedList.isEmpty())) {
                z17 = true;
            }
            if (!z17 || (a17 = y02.r0.f540159d.a()) == null) {
                return;
            }
            bw5.m7 b18 = qj6.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getCgiPreloadInfo(...)");
            ((y02.r0) a17).d(b18);
        }
    }

    public final v05.b Ri(java.lang.String str) {
        boolean z17 = false;
        if (str == null || str.length() == 0) {
            return null;
        }
        l15.c cVar = new l15.c();
        cVar.m126728xdc93280d(str);
        v05.b k17 = cVar.k();
        w05.h hVar = k17 != null ? (w05.h) k17.m75936x14adae67(k17.f513848e + 74) : null;
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
        cVar.m126728xdc93280d(str);
        v05.b k17 = cVar.k();
        if ((k17 != null ? (w05.h) k17.m75936x14adae67(k17.f513848e + 74) : null) != null) {
            return cVar.k();
        }
        return null;
    }

    public java.util.List Zi(java.util.List products, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(products, "products");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = products.iterator();
        while (it.hasNext()) {
            bw5.ne0 reqInfo = (bw5.ne0) it.next();
            e00.e eVar = (e00.e) this.f98291e;
            eVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(reqInfo.f112185d);
            sb6.append('_');
            sb6.append(reqInfo.f112192n[5] ? reqInfo.f112189h : "");
            java.lang.String sb7 = sb6.toString();
            e00.c cVar = (e00.c) eVar.f327286a.get(sb7);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("get product cache of key ");
            sb8.append(sb7);
            sb8.append(", cache time:");
            sb8.append(cVar != null ? java.lang.Long.valueOf(cVar.f327279b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", sb8.toString());
            bw5.qe0 qe0Var = cVar != null ? cVar.f327278a : null;
            if (qe0Var != null) {
                arrayList.add(qe0Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "getProductCardFromCache request size: " + products.size() + " result size: " + arrayList.size());
        return arrayList;
    }

    public java.lang.String aj(ot0.q qVar) {
        java.lang.String str;
        zy2.l lVar;
        r45.br2 br2Var;
        if (qVar == null || (lVar = (zy2.l) qVar.y(zy2.l.class)) == null || (br2Var = lVar.f558982b) == null || (str = br2Var.m75945x2fec8307(9)) == null) {
            str = "";
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574102oa2, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    public int bj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.String talker, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        g95.e0.f(msg);
        return e00.j.f327316a.a(msg.y0(), msg.T0(), z17);
    }

    public final java.lang.String cj(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nev);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        return "[" + str + "] " + str2;
    }

    public java.lang.String fj(ot0.q qVar) {
        hs.a aVar;
        bw5.g9 g9Var = (qVar == null || (aVar = (hs.a) qVar.y(hs.a.class)) == null) ? null : aVar.f366040b;
        java.lang.String e17 = g9Var != null ? g9Var.e() : null;
        if (e17 == null) {
            e17 = "";
        }
        java.lang.String m11974x8010e5e4 = g9Var != null ? g9Var.m11974x8010e5e4() : null;
        return cj(e17, m11974x8010e5e4 != null ? m11974x8010e5e4 : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r0 == pz5.a.f440719d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object hj(android.content.Context r12, java.lang.String r13, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14, bw5.x8 r15, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r16) {
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
            r45.br2 r3 = r3.f558982b
            goto L1e
        L1d:
            r3 = r2
        L1e:
            if (r1 == 0) goto L2c
            java.lang.Class<rj.a> r4 = rj.a.class
            ot0.h r1 = r1.y(r4)
            rj.a r1 = (rj.a) r1
            if (r1 == 0) goto L2c
            w05.h r2 = r1.f477665b
        L2c:
            jz5.f0 r10 = jz5.f0.f384359a
            if (r3 == 0) goto L73
            java.lang.String r4 = r14.y0()
            java.lang.String r1 = "getFromUsername(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            java.lang.String r5 = r14.T0()
            java.lang.String r1 = "getToUsername(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)
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
            pz5.a r1 = pz5.a.f440719d
            if (r0 != r1) goto L7a
            goto L7b
        L73:
            java.lang.String r0 = "ProductCardJumpDelegate"
            java.lang.String r1 = "open product detail content is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
        L7a:
            r0 = r10
        L7b:
            pz5.a r1 = pz5.a.f440719d
            if (r0 != r1) goto L80
            return r0
        L80:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.hj(android.content.Context, java.lang.String, com.tencent.mm.storage.f9, bw5.x8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void ij(android.content.Context context, java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, bw5.x8 reqScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqScene, "reqScene");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new b00.i(this, context, talker, msg, reqScene, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mj(android.content.Context r13, c00.j4 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof b00.j
            if (r0 == 0) goto L13
            r0 = r15
            b00.j r0 = (b00.j) r0
            int r1 = r0.f98225f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98225f = r1
            goto L18
        L13:
            b00.j r0 = new b00.j
            r0.<init>(r12, r15)
        L18:
            r10 = r0
            java.lang.Object r15 = r10.f98223d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f98225f
            jz5.f0 r11 = jz5.f0.f384359a
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L59
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            r15 = r14
            g00.c r15 = (g00.c) r15
            bw5.u8 r6 = r15.f348919d
            if (r6 == 0) goto L5b
            e00.s r1 = new e00.s
            r1.<init>()
            g00.c r14 = (g00.c) r14
            java.lang.String r3 = r14.f348922g
            java.lang.String r4 = r14.f348923h
            java.lang.String r5 = r14.f348921f
            java.lang.String r7 = r14.f348924i
            java.lang.String r8 = r14.f348925m
            bw5.x8 r9 = r14.f348920e
            r10.f98225f = r2
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r13, r14)
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
    public java.lang.Object nj(android.content.Context r17, c00.k4 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            r16 = this;
            r0 = r19
            boolean r1 = r0 instanceof b00.k
            if (r1 == 0) goto L17
            r1 = r0
            b00.k r1 = (b00.k) r1
            int r2 = r1.f98234f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f98234f = r2
            r2 = r16
            goto L1e
        L17:
            b00.k r1 = new b00.k
            r2 = r16
            r1.<init>(r2, r0)
        L1e:
            r12 = r1
            java.lang.Object r0 = r12.f98232d
            pz5.a r1 = pz5.a.f440719d
            int r3 = r12.f98234f
            jz5.f0 r15 = jz5.f0.f384359a
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            goto L65
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r0)
            r0 = r18
            g00.f r0 = (g00.f) r0
            bw5.g9 r5 = r0.f348931d
            if (r5 == 0) goto L67
            e00.k0 r3 = new e00.k0
            r3.<init>()
            r0 = r18
            g00.f r0 = (g00.f) r0
            java.lang.String r6 = r0.f348933f
            java.lang.String r7 = r0.f348934g
            java.lang.String r8 = r0.f348935h
            java.lang.String r9 = r0.f348936i
            bw5.x8 r10 = r0.f348932e
            r11 = 0
            r13 = 128(0x80, float:1.8E-43)
            r14 = 0
            r12.f98234f = r4
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L71:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.nj(android.content.Context, c00.k4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public java.lang.Object oj(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, bw5.x8 x8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object c17 = new e00.k0().c(context, str, f9Var, x8Var, interfaceC29045xdcb5ca57);
        return c17 == pz5.a.f440719d ? c17 : jz5.f0.f384359a;
    }

    public void pj(android.content.Context context, java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, bw5.x8 reqScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqScene, "reqScene");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new b00.l(this, context, talker, msg, reqScene, null), 3, null);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Ecs.EcsCardMgrService", "parseEcsJumpInfoFromBase64 failed: " + e17);
            return null;
        }
    }

    public final boolean rj(bw5.x7 x7Var, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        y02.p0 a17;
        java.util.LinkedList linkedList;
        boolean z18 = false;
        if (x7Var == null || x7Var.f116510h.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "performNativeCardJump: no valid jumpInfo");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "performNativeCardJump with jumpInfo, clickTimestamp=" + j17 + ", openTimestamp=" + currentTimeMillis + ", diff=" + (currentTimeMillis - j17) + "ms");
        if (z17) {
            bw5.m7 b17 = x7Var.b();
            if (b17 != null && (linkedList = b17.f111630d) != null && (!linkedList.isEmpty())) {
                z18 = true;
            }
            if (z18 && (a17 = y02.r0.f540159d.a()) != null) {
                bw5.m7 b18 = x7Var.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getCgiPreloadInfo(...)");
                ((y02.r0) a17).d(b18);
            }
        }
        pq.a aVar = new pq.a(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("click_timestamp", j17);
        jSONObject.put("open_timestamp", currentTimeMillis);
        aVar.b(jSONObject);
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q.Lb((pq.q) c17, aVar, x7Var, null, 4, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r22, android.content.Context r23, bw5.x8 r24) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b00.r.sj(com.tencent.mm.storage.f9, android.content.Context, bw5.x8):boolean");
    }

    public void tj(android.content.Context context, java.lang.String str, long j17, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "finalJumpInfoBase64 nil");
            return;
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.a aVar = new pq.a(context);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("entranceGMsgID", ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(str, j17));
        aVar.b(jSONObject);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        pq.q.se((pq.q) c17, aVar, str2, null, 4, null);
    }

    public void uj(android.content.Context context, r45.lh0 lh0Var, java.lang.String str, int i17, long j17) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.EcsCardMgrService", "processSnsProductJump");
        try {
            str2 = Ui(lh0Var, i17, str, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Ecs.EcsCardMgrService", "getFinalJumpInfoBase64 exp:" + e17);
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
    public java.lang.Object vj(bw5.ne0 r9, int r10, boolean r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof b00.q
            if (r0 == 0) goto L13
            r0 = r12
            b00.q r0 = (b00.q) r0
            int r1 = r0.f98285f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98285f = r1
            goto L18
        L13:
            b00.q r0 = new b00.q
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f98283d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f98285f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L5f
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.util.List r4 = kz5.b0.c(r9)
            r0.f98285f = r3
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
            r12.f327276d = r11
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
