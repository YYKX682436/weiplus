package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class j1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 {

    /* renamed from: l, reason: collision with root package name */
    public static final int f197099l = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L1).mo141623x754a37bb()).r()).intValue();

    /* renamed from: m, reason: collision with root package name */
    public static final int f197100m = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.M1).mo141623x754a37bb()).r()).intValue();

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f197101a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f197102b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f197103c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f197105e;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f197111k;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f197104d = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f197106f = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f197107g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Vector f197108h = new java.util.Vector();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f197109i = new java.util.LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f197110j = p3325xe03a0797.p3326xc267989b.p3332x361a9b.l.a(false, 1, null);

    public j1() {
        java.lang.String str = "Finder.GiftQueueImpl@" + hashCode();
        this.f197111k = str;
        this.f197101a = new java.util.LinkedList();
        this.f197102b = new byte[0];
        this.f197103c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f197105e = new java.util.concurrent.CopyOnWriteArraySet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "MAX_SIZE:" + f197099l + ",COMBOID_LIVE_TIME:" + f197100m);
    }

    public boolean a(java.util.Collection collection) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1> S0;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        boolean contains;
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f197122d.m75945x2fec8307(2))) {
                if (!kz5.n0.O(this.f197105e, l1Var.f197122d.m75945x2fec8307(2))) {
                    java.lang.String str2 = l1Var.f197126h;
                    if (str2 == null) {
                        contains = false;
                    } else {
                        contains = this.f197108h.contains(str2);
                        if (contains) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "skipComboId:".concat(str2));
                        }
                    }
                    if (!contains) {
                        java.lang.String m75945x2fec8307 = l1Var.f197122d.m75945x2fec8307(2);
                        if (m75945x2fec8307 != null) {
                            ((java.util.concurrent.CopyOnWriteArraySet) this.f197105e).add(m75945x2fec8307);
                        }
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "addAll: duplicate client_msg_id:" + l1Var.f197122d.m75945x2fec8307(2));
                it.remove();
            }
        }
        synchronized (this.f197102b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "addAll: incrementMsgId = " + this.f197104d + ", list size = " + this.f197101a.size() + ", collection size = " + collection.size() + ", observerSetSize:" + ((java.util.concurrent.CopyOnWriteArraySet) this.f197103c).size());
            int size = collection.size();
            int i17 = f197099l;
            if (size > i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "addAll: oversize, drop origin collection:" + kz5.n0.L0(kz5.n0.S0(collection), collection.size() - i17));
                S0 = kz5.n0.K0(collection, i17);
            } else {
                S0 = kz5.n0.S0(collection);
            }
            if (this.f197101a.size() + S0.size() > i17) {
                java.lang.String str3 = this.f197111k;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("offer: oversize, drop list:");
                java.util.LinkedList linkedList = this.f197101a;
                sb6.append(kz5.n0.L0(linkedList, (linkedList.size() + S0.size()) - i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                java.util.LinkedList linkedList2 = this.f197101a;
                this.f197101a = new java.util.LinkedList(kz5.n0.S(linkedList2, (linkedList2.size() + S0.size()) - i17));
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var2 : S0) {
                l1Var2.f197124f = this.f197104d.getAndIncrement();
                java.lang.String str4 = l1Var2.f197126h;
                if (str4 == null) {
                    str4 = "";
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r45.xn1 xn1Var = (r45.xn1) l1Var2.f197122d.m75936x14adae67(13);
                if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                    str = "";
                }
                p3325xe03a0797.p3326xc267989b.l.d(this.f197106f, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h1(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1(str4, currentTimeMillis, str), null), 3, null);
            }
            this.f197101a.addAll(S0);
            kz5.g0.s(this.f197101a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 d17 = d();
        if (d17 != null) {
            java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) this.f197103c).iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1) it6.next()).N(d17, S0);
            }
        }
        return true;
    }

    public void b(ug2.f msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        synchronized (this.f197102b) {
            msg.a(this.f197104d.getAndIncrement());
            if (msg.mo167986xba8879a4() == ug2.d.f509052d) {
                this.f197107g.addLast(msg);
            } else {
                this.f197107g.addFirst(msg);
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f197103c).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1) it.next()).y();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r1.b() == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ug2.f c(ug2.e r8, java.lang.Long r9) {
        /*
            r7 = this;
            java.lang.String r0 = "slot"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.Object r0 = r7.f197102b
            monitor-enter(r0)
            java.util.LinkedList r1 = r7.f197107g     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = kz5.n0.k0(r1)     // Catch: java.lang.Throwable -> L70
            ug2.f r1 = (ug2.f) r1     // Catch: java.lang.Throwable -> L70
            r2 = 0
            if (r1 == 0) goto L4b
            ug2.d r3 = r1.mo167986xba8879a4()     // Catch: java.lang.Throwable -> L70
            int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L42
            r4 = 1
            if (r3 == r4) goto L39
            r4 = 2
            if (r3 == r4) goto L24
            goto L49
        L24:
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            if (r9 == 0) goto L4a
            long r3 = r1.c()     // Catch: java.lang.Throwable -> L70
            long r5 = r9.longValue()     // Catch: java.lang.Throwable -> L70
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L49
            goto L4a
        L39:
            if (r9 != 0) goto L49
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            goto L4a
        L42:
            ug2.e r3 = r1.b()     // Catch: java.lang.Throwable -> L70
            if (r3 != r8) goto L49
            goto L4a
        L49:
            r1 = r2
        L4a:
            r2 = r1
        L4b:
            monitor-exit(r0)
            java.lang.String r0 = r7.f197111k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[findNextExtraMsg] slot:"
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = ", nextGiftIncId:"
            r1.append(r8)
            r1.append(r9)
            java.lang.String r8 = ", result:"
            r1.append(r8)
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
            return r2
        L70:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1.c(ug2.e, java.lang.Long):ug2.f");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 m1Var;
        synchronized (this.f197102b) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) this.f197101a.peekFirst();
            m1Var = l1Var != null ? l1Var.f197123e : null;
        }
        return m1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.e1
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.finder.live.util.e1 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.e1) r0
            int r1 = r0.f197022g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197022g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.finder.live.util.e1 r0 = new com.tencent.mm.plugin.finder.live.util.e1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f197020e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f197022g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f197019d
            kotlin.jvm.internal.h0 r7 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlin.jvm.internal.h0 r8 = new kotlin.jvm.internal.h0
            r8.<init>()
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.plugin.finder.live.util.f1 r4 = new com.tencent.mm.plugin.finder.live.util.f1
            r5 = 0
            r4.<init>(r6, r8, r7, r5)
            r0.f197019d = r8
            r0.f197022g = r3
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.l.g(r2, r4, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r7 = r8
        L4f:
            java.lang.Object r7 = r7.f391656d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j1.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean f() {
        boolean z17;
        synchronized (this.f197102b) {
            z17 = !this.f197107g.isEmpty();
        }
        return z17;
    }

    public boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var) {
        boolean contains;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        if (l1Var == null) {
            return false;
        }
        java.lang.String str2 = l1Var.f197126h;
        if (str2 == null) {
            contains = false;
        } else {
            contains = this.f197108h.contains(str2);
            if (contains) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "skipComboId:".concat(str2));
            }
        }
        if (contains) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l1Var.f197122d.m75945x2fec8307(2))) {
            if (kz5.n0.O(this.f197105e, l1Var.f197122d.m75945x2fec8307(2))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "offer: duplicate client_msg_id:" + l1Var.f197122d.m75945x2fec8307(2));
                return false;
            }
            java.lang.String m75945x2fec8307 = l1Var.f197122d.m75945x2fec8307(2);
            if (m75945x2fec8307 != null) {
                ((java.util.concurrent.CopyOnWriteArraySet) this.f197105e).add(m75945x2fec8307);
            }
        }
        synchronized (this.f197102b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "offer: incrementMsgId = " + this.f197104d + ", size = " + this.f197101a.size());
            int size = this.f197101a.size();
            int i17 = f197099l;
            if (size >= i17 && i17 >= 1) {
                java.lang.String str3 = this.f197111k;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("offer: oversize, drop:");
                java.util.LinkedList linkedList = this.f197101a;
                sb6.append(kz5.n0.L0(linkedList, (linkedList.size() - i17) + 1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
                this.f197101a = new java.util.LinkedList(kz5.n0.K0(this.f197101a, i17 - 1));
            }
            l1Var.f197124f = this.f197104d.getAndIncrement();
            this.f197101a.offerLast(l1Var);
            kz5.g0.s(this.f197101a);
            java.lang.String str4 = l1Var.f197126h;
            if (str4 == null) {
                str4 = "";
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.xn1 xn1Var = (r45.xn1) l1Var.f197122d.m75936x14adae67(13);
            if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str = "";
            }
            p3325xe03a0797.p3326xc267989b.l.d(this.f197106f, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h1(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n1(str4, currentTimeMillis, str), null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 d17 = d();
        if (d17 != null) {
            java.util.List c17 = kz5.b0.c(l1Var);
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f197103c).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1) it.next()).N(d17, c17);
            }
        }
        return true;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 h(java.lang.String comboId) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboId, "comboId");
        synchronized (this.f197102b) {
            java.util.Iterator it = this.f197101a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (comboId.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj).f197126h)) {
                    break;
                }
            }
            l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
        }
        return l1Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 i(java.lang.String targetUserName) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUserName, "targetUserName");
        synchronized (this.f197102b) {
            java.util.Iterator it = this.f197101a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (targetUserName.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj).f197134s)) {
                    break;
                }
            }
            l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
        }
        return l1Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 j(java.lang.String targetUserName) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUserName, "targetUserName");
        synchronized (this.f197102b) {
            java.util.Iterator it = this.f197101a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var2.f197129n, "PRECIOUS_GIFT_SCHEDULE_NONE") && targetUserName.equals(l1Var2.f197134s)) {
                    break;
                }
            }
            l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
        }
        return l1Var;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 k(java.lang.String comboId) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboId, "comboId");
        synchronized (this.f197102b) {
            h17 = h(comboId);
            if (h17 != null) {
                this.f197101a.remove(h17);
            }
        }
        return h17;
    }

    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("registerObserver ");
        sb6.append(observer);
        sb6.append("  ");
        java.util.Set set = this.f197103c;
        sb6.append(((java.util.concurrent.CopyOnWriteArraySet) set).size());
        sb6.append(' ');
        sb6.append(j40.o.f379137a.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, sb6.toString());
        ((java.util.concurrent.CopyOnWriteArraySet) set).add(observer);
    }

    public void m(ug2.f msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        synchronized (this.f197102b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, "[removeExtraMsg] msg:" + msg);
            this.f197107g.remove(msg);
        }
    }

    public void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k1 observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unregisterObserver ");
        sb6.append(observer);
        sb6.append("  ");
        java.util.Set set = this.f197103c;
        sb6.append(((java.util.concurrent.CopyOnWriteArraySet) set).size());
        sb6.append(' ');
        sb6.append(j40.o.f379137a.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197111k, sb6.toString());
        ((java.util.concurrent.CopyOnWriteArraySet) set).remove(observer);
    }
}
