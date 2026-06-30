package fg0;

/* loaded from: classes12.dex */
public final class g extends jm0.g {

    /* renamed from: h, reason: collision with root package name */
    public static final fg0.c f343369h = new fg0.c(null);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f343370f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f343371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f343370f = jz5.h.b(fg0.f.f343368d);
        java.util.concurrent.ConcurrentHashMap.KeySetView newKeySet = java.util.concurrent.ConcurrentHashMap.newKeySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newKeySet, "newKeySet(...)");
        this.f343371g = newKeySet;
    }

    @Override // jm0.g
    public void S6() {
        ((java.util.concurrent.ConcurrentHashMap.KeySetView) this.f343371g).clear();
    }

    public final gg0.a T6(cg0.a aVar, yz5.p pVar) {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceCdnDownloadSwitch", 0) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20525x6b28f8a0()) != 1;
        java.lang.String str = aVar.f122567a;
        java.lang.String str2 = aVar.f122568b;
        long j17 = aVar.f122569c;
        long j18 = aVar.f122570d;
        long j19 = aVar.f122571e;
        boolean z18 = aVar.f122572f;
        return new gg0.a(fg0.b.class, str, str2, j17, j18, j19, z18 && z17, z18, aVar.f122573g, pVar, aVar.f122574h, aVar.f122575i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(cg0.a r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg0.g.U6(cg0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V6(cg0.a r8, yz5.p r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof fg0.e
            if (r0 == 0) goto L13
            r0 = r10
            fg0.e r0 = (fg0.e) r0
            int r1 = r0.f343367h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f343367h = r1
            goto L18
        L13:
            fg0.e r0 = new fg0.e
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f343365f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f343367h
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            java.lang.String r5 = "MicroMsg.VoiceMsgDownloadFSC"
            java.lang.String r6 = "submitDownloadMsgVoice["
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r8 = r0.f343364e
            cg0.a r8 = (cg0.a) r8
            java.lang.Object r9 = r0.f343363d
            fg0.g r9 = (fg0.g) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Exception -> L36
            goto L8e
        L36:
            r10 = move-exception
            goto La8
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.String r10 = r8.f122567a
            boolean r10 = r7.W6(r10)
            if (r10 != 0) goto L62
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.String r8 = r8.f122567a
            r9.append(r8)
            java.lang.String r8 = "] duplicated (already in-flight)"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r8)
            return r3
        L62:
            jz5.g r10 = r7.f343370f     // Catch: java.lang.Exception -> La5
            jz5.n r10 = (jz5.n) r10     // Catch: java.lang.Exception -> La5
            java.lang.Object r10 = r10.mo141623x754a37bb()     // Catch: java.lang.Exception -> La5
            w65.n r10 = (w65.n) r10     // Catch: java.lang.Exception -> La5
            gg0.j r2 = new gg0.j     // Catch: java.lang.Exception -> La5
            gg0.a r9 = r7.T6(r8, r9)     // Catch: java.lang.Exception -> La5
            r2.<init>(r9)     // Catch: java.lang.Exception -> La5
            r0.f343363d = r7     // Catch: java.lang.Exception -> La5
            r0.f343364e = r8     // Catch: java.lang.Exception -> La5
            r0.f343367h = r4     // Catch: java.lang.Exception -> La5
            lm.r r10 = (lm.r) r10     // Catch: java.lang.Exception -> La5
            r10.getClass()     // Catch: java.lang.Exception -> La5
            hm.n r9 = hm.u.f363710h     // Catch: java.lang.Exception -> La5
            hm.u r9 = r9.a()     // Catch: java.lang.Exception -> La5
            java.lang.Object r9 = r9.U6(r2, r0)     // Catch: java.lang.Exception -> La5
            if (r9 != r1) goto L8d
            return r1
        L8d:
            r9 = r7
        L8e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L36
            r10.<init>(r6)     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r8.f122567a     // Catch: java.lang.Exception -> L36
            r10.append(r0)     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = "] submitted"
            r10.append(r0)     // Catch: java.lang.Exception -> L36
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L36
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r10)     // Catch: java.lang.Exception -> L36
            return r3
        La5:
            r9 = move-exception
            r10 = r9
            r9 = r7
        La8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r1 = r8.f122567a
            r0.append(r1)
            java.lang.String r1 = "] submission failed: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r0)
            java.lang.String r8 = r8.f122567a
            r9.X6(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fg0.g.V6(cg0.a, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean W6(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (fileName.length() == 0) {
            return false;
        }
        java.util.Set set = this.f343371g;
        if (((java.util.concurrent.ConcurrentHashMap.KeySetView) set).size() >= 8192) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceMsgDownloadFSC", "tryMarkInFlight: cap reached, clearing, size=" + ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).size());
            ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).clear();
        }
        return ((java.util.concurrent.ConcurrentHashMap.KeySetView) set).add(fileName);
    }

    public final void X6(java.lang.String fileName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        if (fileName.length() == 0) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap.KeySetView) this.f343371g).remove(fileName);
    }
}
