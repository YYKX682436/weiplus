package ig0;

@j95.b
/* loaded from: classes12.dex */
public final class o extends jm0.o implements dg0.f {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.ref.WeakReference f372866m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f372867n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.ref.WeakReference f372868o;

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(pu.t0.class);
        set.add(fg0.g.class);
    }

    public void Zi(cg0.a params) {
        gm0.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        gm0.m b17 = gm0.j1.b();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (b17 == null || (bVar = b17.f354778h) == null) ? null : bVar.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new ig0.f(params, this, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceMsgFeatureService", "asyncDownloadVoice scope is null");
        }
    }

    public void aj(qi3.b0 b0Var) {
        pu.t0 a17 = pu.t0.f439909i.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelTask, id:");
        sb6.append(b0Var != null ? b0Var.id() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsgAsyncSendFSC", sb6.toString());
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439911f).mo141623x754a37bb(), null, new pu.i0(b0Var, null), 1, null);
    }

    public boolean bj() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20524x4364c8e6()) == 1;
    }

    public boolean cj() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20541xbb7a2fe6()) == 1;
    }

    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j fj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (!(task instanceof qi3.c)) {
            throw new java.lang.UnsupportedOperationException("sendAsync only support BaseSendMsgTask Type");
        }
        pu.t0 a17 = pu.t0.f439909i.a();
        qi3.c cVar = (qi3.c) task;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        cVar.f445211g = b17;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) a17.f439911f).mo141623x754a37bb(), null, new pu.o0(cVar, a17, null), 1, null);
        return b17;
    }

    public void hj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (!(task instanceof qi3.c)) {
            throw new java.lang.UnsupportedOperationException("sendSync only support BaseSendMsgTask Type");
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j fj6 = ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).fj(task);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new ig0.j(fj6, null), 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object ij(cg0.a r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.VoiceMsgFeatureService"
            boolean r1 = r8 instanceof ig0.m
            if (r1 == 0) goto L15
            r1 = r8
            ig0.m r1 = (ig0.m) r1
            int r2 = r1.f372863h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f372863h = r2
            goto L1a
        L15:
            ig0.m r1 = new ig0.m
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f372861f
            pz5.a r2 = pz5.a.f440719d
            int r3 = r1.f372863h
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            java.lang.Object r7 = r1.f372860e
            cg0.a r7 = (cg0.a) r7
            java.lang.Object r1 = r1.f372859d
            ig0.o r1 = (ig0.o) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L50
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            fg0.c r8 = fg0.g.f343369h
            fg0.g r8 = r8.a()
            r1.f372859d = r6
            r1.f372860e = r7
            r1.f372863h = r4
            java.lang.Object r8 = r8.U6(r7, r1)
            if (r8 != r2) goto L4f
            return r2
        L4f:
            r1 = r6
        L50:
            cg0.b r8 = (cg0.b) r8
            cg0.c r2 = r8.f122576a
            cg0.c r3 = cg0.c.f122577d
            if (r2 != r3) goto L9f
            pt0.e0 r2 = pt0.f0.f439742b1     // Catch: java.lang.Exception -> L8c
            java.lang.String r3 = r7.f122568b     // Catch: java.lang.Exception -> L8c
            long r4 = r7.f122569c     // Catch: java.lang.Exception -> L8c
            com.tencent.mm.storage.f9 r7 = r2.k(r3, r4)     // Catch: java.lang.Exception -> L8c
            if (r7 == 0) goto L82
            java.lang.ref.WeakReference r2 = r1.f372866m     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L73
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L8c
            c01.v8 r2 = (c01.v8) r2     // Catch: java.lang.Exception -> L8c
            if (r2 == 0) goto L73
            r2.a(r7)     // Catch: java.lang.Exception -> L8c
        L73:
            ku5.u0 r2 = ku5.t0.f394148d     // Catch: java.lang.Exception -> L8c
            ig0.n r3 = new ig0.n     // Catch: java.lang.Exception -> L8c
            r3.<init>(r1, r7)     // Catch: java.lang.Exception -> L8c
            ku5.t0 r2 = (ku5.t0) r2     // Catch: java.lang.Exception -> L8c
            r2.B(r3)     // Catch: java.lang.Exception -> L8c
            jz5.f0 r7 = jz5.f0.f384359a     // Catch: java.lang.Exception -> L8c
            goto L83
        L82:
            r7 = 0
        L83:
            if (r7 != 0) goto L9f
            java.lang.String r7 = "syncDownloadVoice notifiers msgInfo is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)     // Catch: java.lang.Exception -> L8c
            goto L9f
        L8c:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "syncDownloadVoice notifiers error: "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
        L9f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ig0.o.ij(cg0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
