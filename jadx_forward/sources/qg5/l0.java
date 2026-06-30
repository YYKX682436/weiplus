package qg5;

@j95.b
/* loaded from: classes12.dex */
public final class l0 extends jm0.o implements ct.q2 {

    /* renamed from: u, reason: collision with root package name */
    public bc5.e f444592u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f444594w;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f444584m = jz5.h.b(qg5.v.f444751d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f444585n = jz5.h.b(qg5.z.f444803d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f444586o = jz5.h.b(qg5.k0.f444564d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f444587p = jz5.h.b(qg5.j0.f444557d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f444588q = jz5.h.b(qg5.w.f444766d);

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f444589r = jz5.h.b(qg5.a0.f444433d);

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e f444590s = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e("ChatRecordsStagingFS", null, 0, 6, null);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f444591t = new java.util.concurrent.atomic.AtomicReference(null);

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Object f444593v = new java.lang.Object();

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(sy.g.class);
    }

    public void Zi(boolean z17) {
        qg5.r rVar = (qg5.r) this.f444591t.get();
        if (rVar == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = rVar.f444685c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            c01.ob obVar = (c01.ob) next;
            if ((obVar.f118907b == null || obVar.f118906a == null) ? false : true) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            v65.i.b(this.f444590s, null, new qg5.u((c01.ob) it6.next(), this, z17, null), 1, null);
        }
    }

    public final tg3.u0 aj() {
        return (tg3.u0) ((jz5.n) this.f444584m).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bj(java.util.List r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof qg5.x
            if (r0 == 0) goto L13
            r0 = r8
            qg5.x r0 = (qg5.x) r0
            int r1 = r0.f444785f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f444785f = r1
            goto L18
        L13:
            qg5.x r0 = new qg5.x
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f444783d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f444785f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L62
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            java.lang.Class<jm0.g> r8 = jm0.g.class
            java.lang.Class<sy.g> r2 = sy.g.class
            boolean r8 = r8.isAssignableFrom(r2)
            if (r8 == 0) goto L91
            androidx.lifecycle.j1 r8 = new androidx.lifecycle.j1
            jm0.e r4 = new jm0.e
            r4.<init>(r6)
            androidx.lifecycle.l1 r5 = r6.getViewModel()
            r8.<init>(r5, r4)
            androidx.lifecycle.c1 r8 = r8.a(r2)
            java.lang.String r2 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r2)
            jm0.g r8 = (jm0.g) r8
            sy.g r8 = (sy.g) r8
            r0.f444785f = r3
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = r8.T6(r7, r2, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = kz5.d0.q(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L73:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r8.next()
            sy.a r0 = (sy.a) r0
            if (r0 == 0) goto L8b
            jz5.l r1 = new jz5.l
            java.lang.String r2 = r0.f495308a
            java.lang.String r0 = r0.f495309b
            r1.<init>(r2, r0)
            goto L8c
        L8b:
            r1 = 0
        L8c:
            r7.add(r1)
            goto L73
        L90:
            return r7
        L91:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Class<qg5.l0> r8 = qg5.l0.class
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = " must extends FeatureServiceComponent"
            java.lang.String r8 = r8.concat(r0)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.l0.bj(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object cj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r10, boolean r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof qg5.y
            if (r0 == 0) goto L13
            r0 = r12
            qg5.y r0 = (qg5.y) r0
            int r1 = r0.f444796h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f444796h = r1
            goto L18
        L13:
            qg5.y r0 = new qg5.y
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f444794f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f444796h
            r3 = 0
            r4 = 1
            java.lang.String r5 = "MicroMsg.ChatRecordsStagingFeatureService"
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r10 = r0.f444793e
            qg5.l0 r10 = (qg5.l0) r10
            java.lang.Object r11 = r0.f444792d
            com.tencent.mm.storage.f9 r11 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L90
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r12 = r9.mj(r10)
            if (r12 != 0) goto Lda
            if (r11 != 0) goto L5f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "will not try to download, msgId: "
            r11.<init>(r12)
            long r0 = r10.m124847x74d37ac6()
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r10)
            return r3
        L5f:
            boolean r11 = te5.y0.b(r10, r4)
            boolean r12 = r9.hj(r10)
            if (r11 != 0) goto Lb3
            if (r12 != 0) goto L6c
            goto Lb3
        L6c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "try to download file, msgId: "
            r11.<init>(r12)
            long r6 = r10.m124847x74d37ac6()
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r11)
            r0.f444792d = r10
            r0.f444793e = r9
            r0.f444796h = r4
            java.lang.Object r12 = r9.pj(r10, r0)
            if (r12 != r1) goto L8f
            return r1
        L8f:
            r11 = r9
        L90:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9d
            java.lang.String r3 = r11.mj(r10)
            goto Lb2
        L9d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "asyncPrepareFileLocalPaths failed to download file, msgId: "
            r11.<init>(r12)
            long r0 = r10.m124847x74d37ac6()
            r11.append(r0)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r10)
        Lb2:
            return r3
        Lb3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "will not try to download, isExpired: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ", isTp: "
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = ", msgId: "
            r0.append(r11)
            long r10 = r10.m124847x74d37ac6()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r10)
            return r3
        Lda:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.l0.cj(com.tencent.mm.storage.f9, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final wf0.q1 fj() {
        return (wf0.q1) ((jz5.n) this.f444587p).mo141623x754a37bb();
    }

    public final boolean hj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        v05.a aVar;
        java.lang.String str = "";
        if (f9Var.J2()) {
            try {
                j15.d dVar = new j15.d();
                java.lang.String U1 = f9Var.U1();
                if (U1 != null) {
                    str = U1;
                }
                dVar.m126728xdc93280d(str);
                java.lang.String J2 = dVar.o().J();
                java.lang.String A = dVar.o().A();
                if (A == null || r26.n0.N(A)) {
                    return !(J2 == null || r26.n0.N(J2));
                }
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatRecordsStagingFeatureService", e17, "ImgMsg.fromXml failed", new java.lang.Object[0]);
                return false;
            }
        }
        if (f9Var.m78014x7b98c171()) {
            ((vf0.w1) fj()).getClass();
            t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
            try {
                y15.d dVar2 = new y15.d();
                r5 = g17 != null ? g17.g() : null;
                if (r5 != null) {
                    str = r5;
                }
                dVar2.m126728xdc93280d(str);
                y15.c n17 = dVar2.n();
                java.lang.String m75945x2fec8307 = n17.m75945x2fec8307(n17.f540455d + 5);
                return !(m75945x2fec8307 == null || r26.n0.N(m75945x2fec8307));
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatRecordsStagingFeatureService", e18, "VideoMsg.fromXml failed", new java.lang.Object[0]);
                return false;
            }
        }
        try {
            l15.c cVar = new l15.c();
            java.lang.String U12 = f9Var.U1();
            if (U12 != null) {
                str = U12;
            }
            cVar.m126728xdc93280d(str);
            v05.b k17 = cVar.k();
            if (k17 != null && (aVar = (v05.a) k17.m75936x14adae67(k17.f513848e + 8)) != null) {
                r5 = aVar.C();
            }
            return !(r5 == null || r26.n0.N(r5));
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatRecordsStagingFeatureService", e19, "[buildFileIdInfo] CommonMsg.fromXml failed", new java.lang.Object[0]);
            return false;
        }
    }

    public void ij() {
        p3325xe03a0797.p3326xc267989b.z zVar;
        p3325xe03a0797.p3326xc267989b.z zVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsStagingFeatureService", "releaseStagedChatRecords");
        p3325xe03a0797.p3326xc267989b.z0.d(this.f444590s, "Staged records were released", null, 2, null);
        this.f444590s = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e("ChatRecordsStagingFS", null, 0, 6, null);
        synchronized (this.f444593v) {
            this.f444592u = null;
            this.f444594w = null;
        }
        qg5.r rVar = (qg5.r) this.f444591t.get();
        if (rVar == null) {
            return;
        }
        for (c01.ob obVar : rVar.f444685c) {
            c01.nb nbVar = obVar.f118907b;
            if (nbVar != null && (zVar2 = nbVar.f118885b) != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(zVar2, null, 1, null);
            }
            c01.nb nbVar2 = obVar.f118907b;
            if (nbVar2 != null && (zVar = nbVar2.f118886c) != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(zVar, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.p2.a(obVar.f118908c, null, 1, null);
        }
        this.f444591t.set(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a1, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r2) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0148, code lost:
    
        r2 = r2.f68099xfeae815;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0188 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0025 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2 A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a A[Catch: all -> 0x01a4, TryCatch #0 {all -> 0x01a4, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0017, B:18:0x001f, B:20:0x0025, B:22:0x0033, B:27:0x003f, B:30:0x0053, B:35:0x005f, B:38:0x0067, B:40:0x0084, B:44:0x0045, B:46:0x008c, B:48:0x0092, B:50:0x00af, B:53:0x00b7, B:55:0x00d4, B:58:0x00dc, B:60:0x00e2, B:64:0x00ea, B:66:0x00fa, B:67:0x0104, B:69:0x010e, B:71:0x0124, B:73:0x0130, B:74:0x0139, B:76:0x013f, B:81:0x014e, B:86:0x015a, B:91:0x0148, B:94:0x0161, B:96:0x0167, B:98:0x016d, B:103:0x0179, B:108:0x0180, B:110:0x0188, B:112:0x019d), top: B:2:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.l0.mj(com.tencent.mm.storage.f9):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:10|(3:11|12|13)|14|15|16|17|18|(4:20|21|22|(1:24)(11:26|27|28|(1:30)|31|(1:33)(1:62)|34|(1:36)(1:61)|(1:38)|39|(9:42|43|44|45|46|47|48|49|(1:51)(7:52|14|15|16|17|18|(9:68|69|70|(1:72)|73|(2:75|(3:81|(5:83|84|85|(2:87|88)(2:90|91)|89)|96))|97|98|99)(0)))(4:41|17|18|(0)(0))))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:42)|43|44|45|46|47|48|49|(1:51)(7:52|14|15|16|17|18|(9:68|69|70|(1:72)|73|(2:75|(3:81|(5:83|84|85|(2:87|88)(2:90|91)|89)|96))|97|98|99)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:42|43|44|45|46|47|48|49|(1:51)(7:52|14|15|16|17|18|(9:68|69|70|(1:72)|73|(2:75|(3:81|(5:83|84|85|(2:87|88)(2:90|91)|89)|96))|97|98|99)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r14 = r15;
        r15 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0176 -> B:17:0x0179). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015d -> B:14:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x016a -> B:16:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object nj(java.lang.String r20, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.l0.nj(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void oj(android.content.Context uiCtx, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, java.util.List messages, boolean z17) {
        c01.nb nbVar;
        int b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCtx, "uiCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messages, "messages");
        if (this.f444591t.get() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "Already in staging");
            if (!z17) {
                return;
            } else {
                ij();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(messages, 10));
        java.util.Iterator it = messages.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 message = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
            int mo78013xfb85f7b0 = message.mo78013xfb85f7b0();
            if (mo78013xfb85f7b0 == 3 || mo78013xfb85f7b0 == 13 || mo78013xfb85f7b0 == 23 || mo78013xfb85f7b0 == 33 || mo78013xfb85f7b0 == 39 || mo78013xfb85f7b0 == 62 || mo78013xfb85f7b0 == 268435505 || mo78013xfb85f7b0 == 1090519089 || mo78013xfb85f7b0 == 43 || mo78013xfb85f7b0 == 44 || (message.mo78013xfb85f7b0() == 49 || message.k2() ? (b17 = g95.e0.b(message)) == 2 || b17 == 4 || b17 == 6 || b17 == 74 || b17 == 130 || b17 == 131 : message.J2() || message.m78014x7b98c171() || message.n2() || message.o2())) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                nbVar = new c01.nb(uuid, p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null), p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null));
            } else {
                nbVar = null;
            }
            arrayList.add(new c01.ob(message, nbVar, p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null)));
        }
        this.f444591t.set(new qg5.r(str, z3Var, arrayList));
        qg5.r rVar = (qg5.r) this.f444591t.get();
        if (rVar != null) {
        }
        synchronized (this.f444593v) {
            bc5.e eVar = new bc5.e(uiCtx, messages, z3Var);
            this.f444592u = eVar;
            if (str == null) {
                str = "";
            }
            eVar.f100728k = str;
            this.f444594w = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(8:17|18|19|20|(1:22)(1:27)|23|24|25))(2:32|33))(3:34|35|(6:37|38|39|(2:41|(2:43|(1:45)(1:33)))|46|47)(2:48|(3:50|(1:52)|(2:54|55)(3:56|(1:80)|(2:61|62)(2:63|(2:65|66)(4:67|68|69|(3:71|72|73)(2:74|(1:76)(6:77|20|(0)(0)|23|24|25))))))(4:81|(5:83|(1:96)|(2:91|(1:93)(1:13))|94|95)|97|98)))|28|29|30|31))|102|6|7|(0)(0)|28|29|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatRecordsStagingFeatureService", "tryDownloadFile error: " + r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00be, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b6 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:19:0x004c, B:20:0x01b2, B:22:0x01b6, B:23:0x01c0, B:27:0x01bb), top: B:18:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bb A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:19:0x004c, B:20:0x01b2, B:22:0x01b6, B:23:0x01c0, B:27:0x01bb), top: B:18:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [wf0.u1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [wf0.u1] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r2v28, types: [t21.w2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pj(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.l0.pj(com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
