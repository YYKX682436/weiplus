package f92;

/* loaded from: classes10.dex */
public final class t extends pf5.p0 implements g92.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f341807d = jz5.h.b(new f92.s(this));

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f341808e;

    /* renamed from: f, reason: collision with root package name */
    public final p92.a f341809f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f341810g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f341811h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f341812i;

    /* renamed from: m, reason: collision with root package name */
    public final kk.l f341813m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f341814n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f341815o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f341816p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f341817q;

    public t() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FinderAccountManager.Notify");
        n3Var.m77789xc5a5549d(false);
        this.f341808e = n3Var;
        this.f341809f = new p92.a();
        this.f341810g = new java.util.concurrent.ConcurrentHashMap();
        this.f341811h = jz5.h.b(f92.r.f341805d);
        this.f341812i = jz5.h.b(f92.p.f341800d);
        this.f341813m = new kk.l(20);
        this.f341814n = new java.util.concurrent.ConcurrentHashMap();
        this.f341815o = "";
        this.f341817q = new java.util.ArrayList();
    }

    @Override // g92.a
    public void A1(java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_USERNAME_STRING_SYNC;
        java.lang.String v17 = c17.v(u3Var, "");
        gm0.j1.u().c().x(u3Var, finderUsername);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.AccountManager", "[setDefaultAccount] finderUsername=" + finderUsername + " rawDefaultUsername=" + v17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17, finderUsername)) {
            return;
        }
        for (l92.c cVar : h6().f406518h) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v17);
            cVar.a(finderUsername, v17);
        }
    }

    @Override // g92.a
    public boolean C(m92.c account, m92.j source) {
        m92.b bVar;
        android.content.ContentValues contentValues;
        boolean b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.Set set = source.f406542d;
        java.lang.String str = account.f68723xdec927b;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = m92.c.V1;
        java.util.concurrent.atomic.AtomicLong atomicLong2 = m92.c.V1;
        long j17 = account.U1;
        if (!atomicLong2.compareAndSet(j17, 1 + j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManager", "[replaceFinderAccount] replace account modifyVersion[" + j17 + "] has invalid. current modifyVersion is " + atomicLong2.get());
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = -1L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        m92.b b18 = b1(str, true);
        if (b18 == null) {
            b18 = new m92.b();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (!set.isEmpty()) {
                java.util.HashSet hashSet = new java.util.HashSet(set);
                hashSet.add(dm.i4.f66875xa013b0d5);
                java.util.List S0 = kz5.n0.S0(hashSet);
                bVar = new m92.b();
                android.content.ContentValues mo9763xeb27878e = account.mo9763xeb27878e();
                l75.e0 e0Var = m92.b.T1;
                bVar.mo9015xbf5d97fd(new m92.k(mo9763xeb27878e, m92.b.T1, S0));
            } else {
                bVar = account;
            }
            r92.b O6 = O6();
            java.lang.String field_username = bVar.f68723xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
            long y07 = O6.y0(field_username);
            g0Var.f391654d = y07;
            boolean mo880xb970c2b9 = y07 < 0 ? O6().mo880xb970c2b9(bVar) : O6().mo11261xce0038c9(g0Var.f391654d, bVar);
            java.lang.String field_username2 = bVar.f68723xdec927b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username2, "field_username");
            m92.b b19 = b1(field_username2, false);
            if (b19 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f341810g;
                java.lang.String field_username3 = bVar.f68723xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username3, "field_username");
                concurrentHashMap.put(field_username3, b19);
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(mo880xb970c2b9);
            pm0.a0 a0Var = new pm0.a0(valueOf, java.lang.System.currentTimeMillis() - currentTimeMillis, false, 4, null);
            m92.b b110 = b1(str, true);
            if (b110 == null) {
                b110 = new m92.b();
            }
            java.lang.String head = "[replaceFinderAccount] cost=" + a0Var + " rowId=" + g0Var.f391654d + " ret=" + valueOf.booleanValue() + " source=" + source;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(head, "head");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b18.getClass().getCanonicalName(), b110.getClass().getCanonicalName());
                sb6.append(head);
                sb6.append("\n");
                sb6.append(" ============================= db item ===============================");
                sb6.append("\n");
                sb6.append("| class: " + b110.getClass().getCanonicalName());
                sb6.append("\n");
                android.content.ContentValues mo9763xeb27878e2 = b18.mo9763xeb27878e();
                android.content.ContentValues mo9763xeb27878e3 = b110.mo9763xeb27878e();
                java.lang.String[] columns = b18.mo232x1380a922().f398487c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(columns, "columns");
                java.util.Iterator it = kz5.z.z0(columns).iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.lang.Object obj = mo9763xeb27878e2.get(str2);
                    java.lang.Object obj2 = mo9763xeb27878e3.get(str2);
                    android.content.ContentValues contentValues2 = mo9763xeb27878e2;
                    if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        contentValues = mo9763xeb27878e3;
                        b17 = ((byte[]) obj).length == ((byte[]) obj2).length && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((byte[]) obj2), com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((byte[]) obj));
                    } else {
                        contentValues = mo9763xeb27878e3;
                        b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, obj2);
                    }
                    if (b17) {
                        java.util.Iterator it6 = it;
                        if (obj instanceof byte[]) {
                            sb6.append("| ");
                            sb6.append(str2 + ": ");
                            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((byte[]) obj));
                            sb6.append("\n");
                        } else {
                            sb6.append("| ");
                            sb6.append(str2 + ": ");
                            sb6.append(dz2.a.a(obj2 != null ? obj2.toString() : null, 30));
                            sb6.append("\n");
                        }
                        mo9763xeb27878e2 = contentValues2;
                        mo9763xeb27878e3 = contentValues;
                        it = it6;
                    } else {
                        java.util.Iterator it7 = it;
                        pm0.a0 a0Var2 = a0Var;
                        if (!(obj instanceof byte[]) && !(obj2 instanceof byte[])) {
                            sb6.append("* ");
                            sb6.append(str2 + ": ");
                            sb6.append(dz2.a.a(obj != null ? obj.toString() : null, 30));
                            sb6.append(" => ");
                            sb6.append(dz2.a.a(obj2 != null ? obj2.toString() : null, 30));
                            sb6.append("\n");
                            mo9763xeb27878e2 = contentValues2;
                            mo9763xeb27878e3 = contentValues;
                            it = it7;
                            a0Var = a0Var2;
                        }
                        sb6.append("* ");
                        sb6.append(str2 + ": ");
                        sb6.append(obj instanceof byte[] ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((byte[]) obj) : "@null");
                        sb6.append(" => ");
                        sb6.append(obj2 instanceof byte[] ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b((byte[]) obj2) : "@null");
                        sb6.append("\n");
                        mo9763xeb27878e2 = contentValues2;
                        mo9763xeb27878e3 = contentValues;
                        it = it7;
                        a0Var = a0Var2;
                    }
                }
                pm0.a0 a0Var3 = a0Var;
                sb6.append(" ============================== " + new pm0.a0(jz5.f0.f384359a, java.lang.System.currentTimeMillis() - r13, false, 4, null) + " ==============================");
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", sb7);
                this.f341808e.mo50293x3498a0(new f92.q(this, g0Var, b110, source));
                return ((java.lang.Boolean) a0Var3.f438289a).booleanValue();
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // g92.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D4(m92.a r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f92.j
            if (r0 == 0) goto L13
            r0 = r10
            f92.j r0 = (f92.j) r0
            int r1 = r0.f341786f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f341786f = r1
            goto L18
        L13:
            f92.j r0 = new f92.j
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f341784d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f341786f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L50
            goto L49
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L50
            n92.a r1 = new n92.a     // Catch: java.lang.Throwable -> L50
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L50
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f341786f = r2     // Catch: java.lang.Throwable -> L50
            r2 = r9
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50
            if (r10 != r0) goto L49
            return r0
        L49:
            r45.r01 r10 = (r45.r01) r10     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r9 = move-exception
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L5b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.t.D4(m92.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // g92.a
    public void F1(java.lang.String finderUserName, m92.i info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f341813m.put(finderUserName, info);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(finderUserName);
        if (l2Var != null) {
            l2Var.f205453i = info;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        l2Var2.f205453i = info;
    }

    @Override // g92.a
    public boolean G2(java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        return (T0().length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(T0(), finderUsername);
    }

    @Override // g92.a
    public java.util.List I6(boolean z17) {
        java.lang.System.currentTimeMillis();
        try {
            java.util.List<m92.b> W1 = W1(z17);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(W1, 10));
            for (m92.b bVar : W1) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f341810g;
                java.lang.String field_username = bVar.f68723xdec927b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
                concurrentHashMap.put(field_username, bVar);
                arrayList.add(bVar.f68723xdec927b);
            }
            java.lang.System.currentTimeMillis();
            return arrayList;
        } catch (java.lang.Throwable th6) {
            java.lang.System.currentTimeMillis();
            throw th6;
        }
    }

    @Override // g92.a
    public java.lang.String K5(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi;
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = (x3Var == null || (Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi()) == null) ? null : Bi.n(str, true);
        if (n17 != null && ((int) n17.E2) != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.g2())) {
            str3 = n17.g2();
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String d17 = n17 != null ? n17.d1() : null;
            if (d17 != null) {
                str3 = d17;
            }
            str3 = "";
        } else {
            if (str2 != null) {
                str3 = str2;
            }
            str3 = "";
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "getDisplayName username " + str + " nickname " + str2 + " displayName:" + str3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        return str3;
    }

    @Override // g92.a
    public com.p314xaae8f345.mm.p944x882e457a.i M0(int i17) {
        return new n92.e(i17);
    }

    public final java.lang.String N6() {
        java.lang.String str = this.f341815o;
        if (!(str.length() == 0)) {
            return str;
        }
        java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MY_FINDER_USERNAME_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v17, "getString(...)");
        return v17;
    }

    @Override // g92.a
    public m92.b O2(boolean z17) {
        return b1(N6(), z17);
    }

    public final r92.b O6() {
        return (r92.b) ((jz5.n) this.f341811h).mo141623x754a37bb();
    }

    @Override // g92.a
    public void P0(java.lang.String finderUsername, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f341815o = finderUsername;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "[setCurFinderUserName] source=" + source + " finderUsername=" + finderUsername);
    }

    @Override // pf5.d
    /* renamed from: P6, reason: merged with bridge method [inline-methods] */
    public m92.h h6() {
        return (m92.h) ((jz5.n) this.f341807d).mo141623x754a37bb();
    }

    @Override // g92.a
    public boolean S1(m92.f accountPublicInfo, m92.j source) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountPublicInfo, "accountPublicInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.atomic.AtomicLong atomicLong = m92.f.f406511e;
        long j17 = accountPublicInfo.f406512d;
        if (!atomicLong.compareAndSet(j17, 1 + j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManager", "[replaceAccountPublicInfo] replace accountPublicInfo modifyVersion[" + j17 + "] has invalid. current modifyVersion is " + m92.c.V1.get());
            return false;
        }
        h6().getClass();
        com.p314xaae8f345.mm.vfs.r6 r6Var = ((r92.a) ((jz5.n) this.f341812i).mo141623x754a37bb()).f474982a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (r6Var.l()) {
                r6Var.k();
            }
            byte[] mo14344x5f01b1f6 = accountPublicInfo.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            com.p314xaae8f345.mm.vfs.s6.c(r6Var, mo14344x5f01b1f6);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813);
        if (m143903xa8fbbff4) {
            m92.e eVar = new m92.e();
            eVar.mo11468x92b714fd(accountPublicInfo.mo14344x5f01b1f6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "[replaceAccountPublicInfo] COST=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms source=" + source);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "[notifyState] update accountPublicInfo");
            m92.h h66 = h6();
            h66.getClass();
            h66.f406515e = eVar;
            pm0.v.X(new m92.g(h66, eVar));
            m92.h h67 = h6();
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.i2) ((jz5.n) h67.f435465d).mo141623x754a37bb()).e(h67);
        }
        return m143903xa8fbbff4;
    }

    @Override // g92.a
    public java.lang.String T0() {
        java.lang.String m75945x2fec8307 = k2().m75945x2fec8307(0);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // g92.a
    public java.lang.String U() {
        return N6();
    }

    @Override // g92.a
    public m92.b U5(boolean z17) {
        return b1(T0(), z17);
    }

    @Override // g92.a
    public void V4(java.lang.String username, m92.j source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            m92.b j37 = g92.a.j3(this, username, false, 2, null);
            boolean mo9951xb06685ab = j37 != null ? O6().mo9951xb06685ab(j37, new java.lang.String[0]) : false;
            if (mo9951xb06685ab) {
                m92.b bVar = (m92.b) this.f341810g.remove(username);
                if (bVar == null) {
                    return;
                } else {
                    this.f341808e.mo50293x3498a0(new f92.n(this, bVar, source));
                }
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(mo9951xb06685ab);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.AccountManager", "[deleteAccount] username=" + username + " source=" + source + " ret=" + valueOf.booleanValue() + ' ' + new pm0.a0(valueOf, java.lang.System.currentTimeMillis() - currentTimeMillis, false, 4, null));
        } finally {
            java.lang.System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[SYNTHETIC] */
    @Override // g92.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List W1(boolean r6) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r5.f341810g
            if (r6 == 0) goto L32
            java.util.Collection r6 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kz5.d0.q(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L1e:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r6.next()
            m92.b r2 = (m92.b) r2
            m92.b r2 = r2.m147066x5a5dd5d()
            r1.add(r2)
            goto L1e
        L32:
            kz5.p0 r1 = kz5.p0.f395529d
        L34:
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto La0
            r92.b r6 = r5.O6()
            r6.getClass()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.database.Cursor r6 = r6.mo78085xb5882a6b()
            boolean r2 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L99
            if (r2 == 0) goto L75
        L50:
            boolean r2 = r6.isAfterLast()     // Catch: java.lang.Throwable -> L99
            if (r2 != 0) goto L75
            m92.b r2 = new m92.b     // Catch: java.lang.Throwable -> L99
            r2.<init>()     // Catch: java.lang.Throwable -> L99
            r2.mo9015xbf5d97fd(r6)     // Catch: java.lang.Throwable -> L99
            java.lang.String r3 = r2.f68723xdec927b     // Catch: java.lang.Throwable -> L99
            if (r3 == 0) goto L6b
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L99
            if (r3 != 0) goto L69
            goto L6b
        L69:
            r3 = 0
            goto L6c
        L6b:
            r3 = 1
        L6c:
            if (r3 != 0) goto L50
            r1.add(r2)     // Catch: java.lang.Throwable -> L99
            r6.moveToNext()     // Catch: java.lang.Throwable -> L99
            goto L50
        L75:
            r2 = 0
            vz5.b.a(r6, r2)
            java.util.Iterator r6 = r1.iterator()
        L7d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r6.next()
            m92.b r2 = (m92.b) r2
            java.lang.String r3 = r2.f68723xdec927b
            java.lang.String r4 = "field_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            m92.b r2 = r2.m147066x5a5dd5d()
            r0.put(r3, r2)
            goto L7d
        L98:
            return r1
        L99:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L9b
        L9b:
            r1 = move-exception
            vz5.b.a(r6, r0)
            throw r1
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.t.W1(boolean):java.util.List");
    }

    @Override // g92.a
    public m92.i X4(java.lang.String finderUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        return (m92.i) this.f341813m.get(finderUserName);
    }

    @Override // g92.a
    public boolean Y() {
        return this.f341816p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x000d, B:6:0x0015, B:7:0x0020, B:9:0x0026, B:14:0x0032, B:18:0x0037, B:20:0x0047, B:23:0x001b), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:4:0x000d, B:6:0x0015, B:7:0x0020, B:9:0x0026, B:14:0x0032, B:18:0x0037, B:20:0x0047, B:23:0x001b), top: B:2:0x000b }] */
    @Override // g92.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m92.b b1(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r1 = r5.f341810g
            if (r7 == 0) goto L1b
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> L54
            m92.b r7 = (m92.b) r7     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L20
            m92.b r7 = new m92.b     // Catch: java.lang.Throwable -> L54
            r7.<init>()     // Catch: java.lang.Throwable -> L54
            goto L20
        L1b:
            m92.b r7 = new m92.b     // Catch: java.lang.Throwable -> L54
            r7.<init>()     // Catch: java.lang.Throwable -> L54
        L20:
            java.lang.String r2 = r7.f68723xdec927b     // Catch: java.lang.Throwable -> L54
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2f
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L2d
            goto L2f
        L2d:
            r2 = r3
            goto L30
        L2f:
            r2 = r4
        L30:
            if (r2 != 0) goto L37
            m92.b r6 = r7.m147066x5a5dd5d()     // Catch: java.lang.Throwable -> L54
            goto L50
        L37:
            r7.f68723xdec927b = r6     // Catch: java.lang.Throwable -> L54
            r92.b r2 = r5.O6()     // Catch: java.lang.Throwable -> L54
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54
            r4[r3] = r0     // Catch: java.lang.Throwable -> L54
            boolean r0 = r2.get(r7, r4)     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L4f
            r1.put(r6, r7)     // Catch: java.lang.Throwable -> L54
            m92.b r6 = r7.m147066x5a5dd5d()     // Catch: java.lang.Throwable -> L54
            goto L50
        L4f:
            r6 = 0
        L50:
            java.lang.System.currentTimeMillis()
            return r6
        L54:
            r6 = move-exception
            java.lang.System.currentTimeMillis()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.t.b1(java.lang.String, boolean):m92.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // g92.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c4(java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f92.k
            if (r0 == 0) goto L13
            r0 = r10
            f92.k r0 = (f92.k) r0
            int r1 = r0.f341789f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f341789f = r1
            goto L18
        L13:
            f92.k r0 = new f92.k
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f341787d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f341789f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L4f
            goto L48
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L4f
            com.tencent.mm.modelbase.i r1 = r8.u2(r9)     // Catch: java.lang.Throwable -> L4f
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f341789f = r2     // Catch: java.lang.Throwable -> L4f
            r2 = r9
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            if (r10 != r0) goto L48
            return r0
        L48:
            r45.xb1 r10 = (r45.xb1) r10     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L4f
            goto L5a
        L4f:
            r9 = move-exception
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L5a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.t.c4(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // g92.a
    public java.util.ArrayList g4() {
        return this.f341817q;
    }

    @Override // g92.a
    public boolean j4() {
        return T0().length() > 0;
    }

    @Override // g92.a
    public m92.e k2() {
        return h6().f406515e;
    }

    @Override // g92.a
    public void k4(m92.j source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.AccountManager", "[deleteAccountPublicInfo] source=" + source + ' ' + new pm0.a0(java.lang.Boolean.valueOf(((r92.a) ((jz5.n) this.f341812i).mo141623x754a37bb()).f474982a.l()), java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis(), false, 4, null));
        } catch (java.lang.Throwable th6) {
            java.lang.System.currentTimeMillis();
            throw th6;
        }
    }

    @Override // g92.a
    public void m5(m92.j source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f341810g;
        java.util.HashSet hashSet = new java.util.HashSet(concurrentHashMap.values());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.Iterator it = W1(true).iterator();
            while (it.hasNext()) {
                O6().mo9951xb06685ab((m92.b) it.next(), new java.lang.String[0]);
            }
            concurrentHashMap.clear();
            this.f341808e.mo50293x3498a0(new f92.o(hashSet, this, source));
            pm0.a0 a0Var = new pm0.a0(java.lang.Boolean.TRUE, java.lang.System.currentTimeMillis() - currentTimeMillis, false, 4, null);
            A1("");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.AccountManager", "[deleteAllAccount] source=" + source + ' ' + hashSet + ' ' + a0Var);
        } catch (java.lang.Throwable th6) {
            java.lang.System.currentTimeMillis();
            throw th6;
        }
    }

    @Override // g92.a
    public void p2(boolean z17) {
        this.f341816p = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "setEnableFinderGetCommentList :" + z17);
    }

    @Override // g92.a
    public void r5(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!O6().f474983d.J()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initialize] accountPublicInfo=[");
                m92.e eVar = h6().f406515e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
                java.lang.String jSONObject = pm0.b0.b(eVar).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                sb6.append(jSONObject);
                sb6.append(']');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", sb6.toString());
                if (h6().f406515e.m75939xb282bd08(1) != 2) {
                    m92.f fVar = new m92.f();
                    if (this.f341809f.a(fVar)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "[initialize] successfully upgrade!(" + h6().f406515e.m75939xb282bd08(1) + " to 2)");
                        fVar.set(1, 2);
                        S1(fVar, m92.j.f406523e);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.AccountManager", "[initialize] failure upgrade!(" + h6().f406515e.m75939xb282bd08(1) + ')');
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager.onUpgrade", "COST=" + new pm0.a0(jz5.f0.f384359a, java.lang.System.currentTimeMillis() - currentTimeMillis, false, 4, null));
                java.util.List<m92.b> K6 = g92.a.K6(this, false, 1, null);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[initialize] accounts=");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K6, 10));
                for (m92.b bVar : K6) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("nickname=");
                    sb8.append(bVar.f68710x21f9b213);
                    sb8.append(" user_flag=");
                    r45.nc4 nc4Var = bVar.f68714xaa8c8588;
                    sb8.append(nc4Var != null ? java.lang.Integer.valueOf(nc4Var.m75939xb282bd08(1)) : null);
                    sb8.append(" username=");
                    sb8.append(bVar.f68723xdec927b);
                    sb8.append(' ');
                    arrayList.add(sb8.toString());
                }
                sb7.append(arrayList);
                sb7.append(' ');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", sb7.toString());
            } catch (java.lang.Throwable th6) {
                java.lang.System.currentTimeMillis();
                throw th6;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "contextWithFinderUsername");
        sf5.e eVar2 = sf5.e.f489162a;
        f92.m mVar = new f92.m(this);
        java.util.ArrayList arrayList2 = sf5.e.f489163b;
        synchronized (arrayList2) {
            arrayList2.add(mVar);
        }
    }

    @Override // g92.a
    public com.p314xaae8f345.mm.p944x882e457a.i u2(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Bf).mo141623x754a37bb()).r()).booleanValue() ? new n92.g(source) : new n92.c(source);
    }

    @Override // g92.a
    public r45.lc1 u4() {
        java.lang.Object obj;
        g92.b bVar = g92.b.f351302e;
        r45.v32 v32Var = (r45.v32) bVar.k2().e().m75936x14adae67(18);
        r45.lc1 lc1Var = v32Var != null ? (r45.lc1) v32Var.m75936x14adae67(5) : null;
        if (lc1Var != null) {
            return lc1Var;
        }
        java.util.LinkedList m75941xfb821914 = bVar.k2().d().m75941xfb821914(24);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "joinlive_visible_info")) {
                break;
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var == null) {
            return null;
        }
        r45.lc1 lc1Var2 = new r45.lc1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var.m75934xbce7f2f(1);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            lc1Var2.mo11468x92b714fd(g17);
            return lc1Var2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }

    @Override // g92.a
    public boolean v(java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        return g92.a.j3(this, finderUsername, false, 2, null) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // g92.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x1(int r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof f92.l
            if (r0 == 0) goto L13
            r0 = r10
            f92.l r0 = (f92.l) r0
            int r1 = r0.f341792f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f341792f = r1
            goto L18
        L13:
            f92.l r0 = new f92.l
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f341790d
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f341792f
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L50
            goto L49
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L50
            n92.e r1 = new n92.e     // Catch: java.lang.Throwable -> L50
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L50
            r9 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f341792f = r2     // Catch: java.lang.Throwable -> L50
            r2 = r9
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50
            if (r10 != r0) goto L49
            return r0
        L49:
            r45.lk2 r10 = (r45.lk2) r10     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r10)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r9 = move-exception
            kotlin.Result$Companion r10 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r9 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r9)
            java.lang.Object r9 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r9)
        L5b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.t.x1(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // g92.a
    public java.lang.String y4(android.content.Context context) {
        java.lang.String str;
        int i17;
        int i18 = 1;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            str = T0();
        } else {
            str = context != null ? (java.lang.String) this.f341814n.get(java.lang.Integer.valueOf(context.hashCode())) : null;
            if (str != null && str.length() != 0) {
                i18 = 0;
            }
            if (i18 != 0) {
                str = T0();
                i17 = 2;
            } else {
                i17 = 3;
            }
            i18 = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AccountManager", "getSelfFinderUsername, case:" + i18 + ", finalUsername:" + str);
        return str;
    }

    @Override // g92.a
    public void z0(android.content.Context context, java.lang.String currentUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentUsername, "currentUsername");
        this.f341814n.put(java.lang.Integer.valueOf(context.hashCode()), currentUsername);
    }
}
