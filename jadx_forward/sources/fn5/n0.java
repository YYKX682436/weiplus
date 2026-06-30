package fn5;

/* loaded from: classes14.dex */
public final class n0 extends p012xc85e97e9.p093xedfae76a.c1 {
    public static final java.util.List E = kz5.c0.i("4", "27", "28", "152", "153", "156", "157", "159", "160");
    public aq.b A;
    public boolean B;
    public boolean C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346254d = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346255e = new p012xc85e97e9.p093xedfae76a.j0(en5.d.f336904d);

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346256f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f346257g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346258h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346259i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346260m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346261n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346262o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f346263p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f346264q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f346265r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f346266s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f346267t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Map f346268u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f346269v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f346270w;

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f346271x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f346272y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f346273z;

    public n0() {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(fn5.o0.f346276d);
        this.f346256f = j0Var;
        this.f346257g = j0Var;
        this.f346258h = new p012xc85e97e9.p093xedfae76a.j0("");
        this.f346259i = new p012xc85e97e9.p093xedfae76a.j0(new java.util.ArrayList());
        this.f346260m = new p012xc85e97e9.p093xedfae76a.j0(0);
        this.f346261n = new p012xc85e97e9.p093xedfae76a.j0();
        this.f346262o = new p012xc85e97e9.p093xedfae76a.j0(fn5.p0.f346280d);
        this.f346263p = new p012xc85e97e9.p093xedfae76a.j0();
        this.f346264q = new java.util.ArrayList();
        this.f346265r = new java.util.ArrayList();
        this.f346266s = new java.util.ArrayList();
        this.f346267t = new java.util.ArrayList();
        this.f346268u = new java.util.LinkedHashMap();
        this.f346269v = new java.util.ArrayList();
        this.A = aq.b.f94370f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N6(fn5.n0 r4, java.util.ArrayList r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof fn5.m0
            if (r0 == 0) goto L16
            r0 = r6
            fn5.m0 r0 = (fn5.m0) r0
            int r1 = r0.f346248g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f346248g = r1
            goto L1b
        L16:
            fn5.m0 r0 = new fn5.m0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f346246e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f346248g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f346245d
            fn5.n0 r4 = (fn5.n0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "updateNormalData >> "
            r6.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r6.append(r2)
            r2 = 32
            r6.append(r2)
            int r2 = r5.size()
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r2 = "MicroMsg.ImageQueryViewModel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            r0.f346245d = r4
            r0.f346248g = r3
            java.lang.Object r6 = r4.a7(r5, r0)
            if (r6 != r1) goto L6c
            goto Lda
        L6c:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            androidx.lifecycle.j0 r5 = r4.f346255e
            java.lang.Object r5 = r5.mo3195x754a37bb()
            en5.d r5 = (en5.d) r5
            if (r5 != 0) goto L7a
            r5 = -1
            goto L82
        L7a:
            int[] r0 = fn5.u.f346299a
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L82:
            java.lang.String r0 = "get(...)"
            if (r5 == r3) goto La7
            r1 = 2
            if (r5 == r1) goto L9a
            r2 = 3
            if (r5 == r2) goto L8d
            goto Lb4
        L8d:
            java.lang.Object r5 = r6.get(r1)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
            goto Lb4
        L9a:
            java.lang.Object r5 = r6.get(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
            goto Lb4
        La7:
            r5 = 0
            java.lang.Object r5 = r6.get(r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.b7(r5)
        Lb4:
            androidx.lifecycle.j0 r5 = r4.f346262o
            java.lang.Object r5 = r5.mo3195x754a37bb()
            fn5.p0 r5 = (fn5.p0) r5
            if (r5 == 0) goto Lc3
            java.lang.String r5 = r5.name()
            goto Lc4
        Lc3:
            r5 = 0
        Lc4:
            java.lang.String r1 = "PERSON"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r1)
            if (r5 == 0) goto Ld8
            java.lang.Object r5 = r6.get(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.Q6(r5)
        Ld8:
            jz5.f0 r1 = jz5.f0.f384359a
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.n0.N6(fn5.n0, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void O6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyReq");
        java.util.ArrayList arrayList = this.f346269v;
        boolean z17 = true;
        if (!(arrayList == null || arrayList.isEmpty())) {
            java.util.Iterator it = E.iterator();
            while (it.hasNext()) {
                if (arrayList.contains((java.lang.String) it.next())) {
                    break;
                }
            }
        }
        z17 = false;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f346262o;
        if (z17) {
            j0Var.mo523x53d8522f(fn5.p0.f346281e);
            this.f346271x = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new fn5.e0(this, null), 2, null);
            return;
        }
        j0Var.mo523x53d8522f(fn5.p0.f346280d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "applyNormalReq: " + java.lang.Thread.currentThread().getName());
        this.f346270w = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new fn5.z(this, null), 2, null);
    }

    public final void P6(java.lang.String text, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f346258h.mo523x53d8522f(text);
        this.f346254d.mo523x53d8522f(new java.util.ArrayList());
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f346256f;
        j0Var.mo523x53d8522f(fn5.o0.f346277e);
        java.util.ArrayList arrayList = this.f346269v;
        arrayList.clear();
        this.A = aq.b.f94370f;
        this.f346263p.mo523x53d8522f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzv));
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f346273z;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f346273z = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new fn5.k0(this, null), 2, null);
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
            }
            arrayList.addAll(arrayList2);
            O6();
            return;
        }
        if (text.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "confirmToSearch >> text is empty");
            j0Var.mo523x53d8522f(fn5.o0.f346278f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "getLabelIdByText: ".concat(text));
        aq.r0 r0Var = aq.r0.f94473a;
        java.util.ArrayList h17 = r0Var.h(text, false);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (h17 == null || h17.isEmpty()) {
            java.util.ArrayList i17 = r0Var.i(text, false);
            if (i17 != null) {
                java.util.Iterator it6 = i17.iterator();
                while (it6.hasNext()) {
                    java.lang.Object second = ((android.util.Pair) it6.next()).second;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                    java.lang.Iterable iterable = (java.lang.Iterable) second;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                    java.util.Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(java.lang.String.valueOf(((java.lang.Number) it7.next()).intValue()));
                    }
                    hashSet.addAll(arrayList3);
                }
            }
        } else {
            java.util.Iterator it8 = h17.iterator();
            while (it8.hasNext()) {
                java.lang.Object second2 = ((android.util.Pair) it8.next()).second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second2, "second");
                java.lang.Iterable iterable2 = (java.lang.Iterable) second2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
                java.util.Iterator it9 = iterable2.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(java.lang.String.valueOf(((java.lang.Number) it9.next()).intValue()));
                }
                hashSet.addAll(arrayList4);
            }
        }
        if (hashSet.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "current query label is null，go to check Intercept");
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), null, null, new fn5.f0(text, this, null), 3, null);
        } else {
            arrayList.addAll(hashSet);
            O6();
        }
    }

    public final void Q6(java.util.ArrayList arrayList) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", java.lang.Thread.currentThread().getName() + " dealPeopleData >> data size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next();
            java.lang.String str = c4988x89c61bdd.f134741i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getCropLabelId(...)");
            for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null)) {
                if (str2.length() > 0) {
                    if (this.f346268u.containsKey(str2)) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f346268u.get(str2);
                        if (arrayList2 != null) {
                            arrayList2.add(c4988x89c61bdd);
                        }
                    } else {
                        java.util.Map map = this.f346268u;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(c4988x89c61bdd);
                        map.put(str2, arrayList3);
                    }
                }
            }
        }
        this.f346268u = kz5.c1.t(kz5.c1.q(kz5.n0.F0(kz5.e1.v(this.f346268u), new fn5.h0())));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : this.f346268u.entrySet()) {
            int i18 = i17 + 1;
            java.lang.String str3 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (i17 <= 9) {
                java.lang.String str4 = (java.lang.String) entry.getKey();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "getCropImagePath >> labelId: " + str4);
                java.util.Iterator it6 = this.f346267t.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    aq.a aVar = (aq.a) it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f94359a, str4)) {
                        str3 = aVar.f94360b;
                        break;
                    }
                }
                if (str3 != null) {
                    arrayList4.add(new aq.a((java.lang.String) entry.getKey(), str3));
                }
            }
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "dealPeopleData >> personMapSize: " + this.f346268u.size() + ", headerItemListSize: " + arrayList4.size());
        if (!arrayList4.isEmpty()) {
            this.B = true;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f346261n;
        j0Var.mo523x53d8522f(arrayList4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealPeopleData >> personCropImageLiveDataSize: ");
        java.lang.Object mo3195x754a37bb = j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb);
        sb6.append(((java.util.ArrayList) mo3195x754a37bb).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", sb6.toString());
    }

    public final n0.e5 R6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1735455997);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346259i, new java.util.ArrayList(), y0Var, 72);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 S6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1010966032);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346263p, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzv), y0Var, 8);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 T6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(1660768815);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346256f, fn5.o0.f346276d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 U6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-808356205);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346258h, "", y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 V6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1171320090);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346255e, en5.d.f336904d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final n0.e5 W6(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(866073633);
        java.lang.Object obj = n0.e1.f415025a;
        n0.e5 a17 = v0.c.a(this.f346262o, fn5.p0.f346280d, y0Var, 56);
        y0Var.o(false);
        return a17;
    }

    public final boolean X6(java.util.ArrayList arrayList) {
        return ((arrayList == null || arrayList.isEmpty()) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((aq.d) kz5.n0.X(arrayList)).f94382a, "TOP")) ? false : true;
    }

    public final boolean Y6(java.util.ArrayList arrayList, com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next()).f134738f, c4988x89c61bdd.f134738f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z6(java.lang.String imagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        java.util.Iterator it = this.f346266s.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next()).f134738f, imagePath)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x018a -> B:11:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01b5 -> B:20:0x01b6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(java.util.ArrayList r30, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r31) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn5.n0.a7(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7(java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", java.lang.Thread.currentThread().getName() + " updateDataFromCustom >> data size: " + arrayList.size());
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "the data is no need, so spilt dataList is empty");
            return;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f346259i;
        java.lang.Object mo3195x754a37bb = j0Var.mo3195x754a37bb();
        bm5.v0 v0Var = bm5.v0.f104287a;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = this.f346260m;
        if (mo3195x754a37bb == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            v0Var.a(arrayList, arrayList2);
            arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
            arrayList2.add(new aq.d("BOTTOM", new java.util.ArrayList()));
            j0Var.mo523x53d8522f(arrayList2);
            j0Var2.mo523x53d8522f(java.lang.Integer.valueOf(arrayList2.size() - 1));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(" updateDataFromCustom current live data size ");
        java.lang.Object mo3195x754a37bb2 = j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb2);
        sb6.append(((java.util.ArrayList) mo3195x754a37bb2).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", sb6.toString());
        java.lang.Object mo3195x754a37bb3 = j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb3);
        java.util.ArrayList arrayList3 = new java.util.ArrayList((java.util.Collection) mo3195x754a37bb3);
        v0Var.a(arrayList, arrayList3);
        if (X6(arrayList3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "data num before, add top");
            arrayList3.add(0, new aq.d("TOP", new java.util.ArrayList()));
        }
        if (!arrayList3.isEmpty()) {
            arrayList3.add(new aq.d("BOTTOM", new java.util.ArrayList()));
        }
        j0Var.mo523x53d8522f(arrayList3);
        java.lang.Object mo3195x754a37bb4 = j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb4);
        if (((java.util.ArrayList) mo3195x754a37bb4).size() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("data num before ");
            sb7.append(j0Var2.mo3195x754a37bb());
            sb7.append(", ");
            java.lang.Object mo3195x754a37bb5 = j0Var.mo3195x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb5);
            sb7.append(((aq.d) ((java.util.ArrayList) mo3195x754a37bb5).get(0)).f94383b.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("data num before ");
        sb8.append(j0Var2.mo3195x754a37bb());
        sb8.append(", ");
        java.lang.Object mo3195x754a37bb6 = j0Var.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb6);
        sb8.append(((aq.d) ((java.util.ArrayList) mo3195x754a37bb6).get(0)).f94383b.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", sb8.toString());
        java.lang.Object mo3195x754a37bb7 = j0Var2.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb7);
        j0Var2.mo523x53d8522f(java.lang.Integer.valueOf(((java.lang.Number) mo3195x754a37bb7).intValue() + arrayList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryViewModel", "data num after " + j0Var2.mo3195x754a37bb());
        f65.n nVar = f65.n.f341442a;
        nVar.d(this.f346264q.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchResultExpose,  " + aq.o.f94453a);
        if (!aq.o.f94453a && !f65.o.f341465u && f65.o.f341456l != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99 c6659x3e773f99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6659x3e773f99();
            c6659x3e773f99.f140058s = c6659x3e773f99.b("Username", f65.o.f341446b, true);
            c6659x3e773f99.f140043d = c6659x3e773f99.b("sessionid", f65.o.f341447c, true);
            c6659x3e773f99.f140045f = 56L;
            c6659x3e773f99.f140044e = c6659x3e773f99.b("searchsessionid", f65.o.f341450f, true);
            c6659x3e773f99.f140057r = f65.o.f341453i;
            c6659x3e773f99.f140061v = f65.o.f341461q;
            f65.o.f341465u = true;
            c6659x3e773f99.p(f65.o.f341451g);
            c6659x3e773f99.f140052m = f65.o.f341456l;
            c6659x3e773f99.f140056q = java.lang.System.currentTimeMillis() - f65.o.f341463s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReporter", "searchResultExpose >> action: " + c6659x3e773f99.f140045f);
            c6659x3e773f99.k();
        }
        fn5.p0 p0Var = (fn5.p0) this.f346262o.mo3195x754a37bb();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
            nVar.e(this.f346265r.size());
        }
    }

    public final void c7(java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f346258h.mo523x53d8522f(text);
        this.f346255e.mo523x53d8522f(en5.d.f336904d);
        if (text.length() == 0) {
            this.f346254d.mo523x53d8522f(new java.util.ArrayList());
        }
        java.util.ArrayList arrayList = this.f346264q;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f346265r;
        if (size != 0) {
            f65.n nVar = f65.n.f341442a;
            nVar.d(arrayList.size());
            nVar.g(arrayList.size());
            fn5.p0 p0Var = (fn5.p0) this.f346262o.mo3195x754a37bb();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
                nVar.e(arrayList2.size());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportSetPrintQuery >> " + text + ", " + aq.o.f94453a);
        if (!aq.o.f94453a) {
            f65.o.f341454j = r26.i0.t(text, ",", " ", false);
        }
        if (text.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> 51, " + aq.o.f94453a);
            if (!aq.o.f94453a) {
                f65.o.f341445a.c(51);
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f346271x;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f346270w;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f346259i.mo523x53d8522f(new java.util.ArrayList());
        this.f346260m.mo523x53d8522f(0);
        arrayList.clear();
        arrayList2.clear();
        this.f346266s.clear();
        this.f346267t.clear();
        ((java.util.LinkedHashMap) this.f346268u).clear();
        this.f346263p.mo523x53d8522f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.fzv));
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f346273z;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        aq.n nVar2 = aq.o.f94455c;
        if (nVar2 != null) {
            nVar2.f94447i = null;
            nVar2.f94448j = null;
        }
    }

    public final void d7(en5.d type) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f346255e;
        j0Var.mo523x53d8522f(type);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int ordinal = type.ordinal();
        java.util.ArrayList arrayList3 = this.f346265r;
        if (ordinal == 0) {
            arrayList = this.f346264q;
        } else if (ordinal == 1) {
            arrayList = arrayList3;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            arrayList = this.f346266s;
        }
        bm5.v0.f104287a.a(arrayList, arrayList2);
        if (X6(arrayList2)) {
            arrayList2.add(0, new aq.d("TOP", new java.util.ArrayList()));
        }
        if (true ^ arrayList2.isEmpty()) {
            arrayList2.add(new aq.d("BOTTOM", new java.util.ArrayList()));
        }
        fn5.p0 p0Var = (fn5.p0) this.f346262o.mo3195x754a37bb();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p0Var != null ? p0Var.name() : null, "PERSON")) {
            this.f346261n.mo523x53d8522f(new java.util.ArrayList());
            ((java.util.LinkedHashMap) this.f346268u).clear();
            this.B = false;
            en5.d dVar = (en5.d) j0Var.mo3195x754a37bb();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar != null ? dVar.name() : null, "OCR")) {
                Q6(arrayList3);
            }
        }
        this.f346260m.mo523x53d8522f(java.lang.Integer.valueOf(arrayList.size()));
        this.f346259i.mo523x53d8522f(arrayList2);
    }
}
