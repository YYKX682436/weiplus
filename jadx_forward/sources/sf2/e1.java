package sf2;

/* loaded from: classes10.dex */
public final class e1 extends if2.b implements if2.e, ah2.d, zh2.a {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f488649m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f488650n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f488651o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f488652p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f488653q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f488654r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f488649m = jz5.h.b(new sf2.z0(this));
        this.f488650n = jz5.h.b(new sf2.p0(this));
        this.f488651o = jz5.h.b(new sf2.o0(this));
        this.f488652p = jz5.h.b(new sf2.u0(this, store));
        this.f488653q = jz5.h.b(new sf2.y0(this, store));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(sf2.e1 r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.Z6(sf2.e1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(sf2.e1 r8, r45.z22 r9, boolean r10, boolean r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.a7(sf2.e1, r45.z22, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void m7(sf2.e1 e1Var, r45.z22 z22Var, boolean z17, boolean z18, boolean z19, yz5.l lVar, int i17, java.lang.Object obj) {
        boolean z27 = (i17 & 2) != 0 ? true : z17;
        boolean z28 = (i17 & 4) != 0 ? true : z18;
        boolean z29 = (i17 & 8) != 0 ? false : z19;
        yz5.l lVar2 = (i17 & 16) != 0 ? null : lVar;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = e1Var.f488654r;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        e1Var.f488654r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(e1Var, null, null, new sf2.w0(e1Var, z22Var, z29, z27, lVar2, z28, null), 3, null);
    }

    @Override // jh2.a
    public void B5(java.lang.String songUniqueId, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
    }

    @Override // zh2.a
    public void E(r45.yx1 songInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
    }

    @Override // jh2.a
    public void E0(java.lang.String songUniqueId, jh2.d errorParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorParams, "errorParams");
    }

    @Override // jh2.a
    public void I4(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "notifyFinishSing: songUniqueId=".concat(songUniqueId));
    }

    @Override // jh2.a
    public void M4(java.lang.String songUniqueId, int i17, boolean z17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
    }

    @Override // bh2.b
    public void P1(java.lang.String songUniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "onPlayBGMEnd: " + songUniqueId + ", errorCode=" + i17);
        r45.z22 P6 = g7().P6(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayBGMEnd: starting next song: ");
        sb6.append(P6 != null ? P6.f473162f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", sb6.toString());
        m7(this, P6, false, false, true, null, 20, null);
    }

    @Override // zh2.a
    public void Q0(r45.yx1 songInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
    }

    @Override // jh2.a
    public void R0(java.lang.String songUniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "onSongInfoParserCallback: songUniqueId=" + songUniqueId + ", totalSentence=" + i17);
    }

    @Override // zh2.a
    public void R5(r45.yx1 songInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
    }

    @Override // bh2.b
    public void a0(java.lang.String songUniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "onPlayBGMStart: " + songUniqueId + ", errorCode=" + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(r45.z22 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sf2.k0
            if (r0 == 0) goto L13
            r0 = r6
            sf2.k0 r0 = (sf2.k0) r0
            int r1 = r0.f488719f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f488719f = r1
            goto L18
        L13:
            sf2.k0 r0 = new sf2.k0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f488717d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f488719f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f488719f = r3
            r6 = 5
            java.lang.Object r6 = r4.o7(r6, r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            r45.rd2 r6 = (r45.rd2) r6
            if (r6 == 0) goto L41
            goto L42
        L41:
            r3 = 0
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.b7(r45.z22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c7(r45.z22 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sf2.l0
            if (r0 == 0) goto L13
            r0 = r6
            sf2.l0 r0 = (sf2.l0) r0
            int r1 = r0.f488726f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f488726f = r1
            goto L18
        L13:
            sf2.l0 r0 = new sf2.l0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f488724d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f488726f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f488726f = r3
            r6 = 6
            java.lang.Object r6 = r4.o7(r6, r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            r45.rd2 r6 = (r45.rd2) r6
            if (r6 == 0) goto L41
            goto L42
        L41:
            r3 = 0
        L42:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.c7(r45.z22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(r45.z22 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sf2.m0
            if (r0 == 0) goto L13
            r0 = r6
            sf2.m0 r0 = (sf2.m0) r0
            int r1 = r0.f488734f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f488734f = r1
            goto L18
        L13:
            sf2.m0 r0 = new sf2.m0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f488732d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f488734f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r45.z22 r6 = new r45.z22
            r6.<init>()
            java.lang.String r2 = r5.f473160d
            r6.f473160d = r2
            boolean r2 = r5.f473161e
            r6.f473161e = r2
            java.lang.String r5 = r5.f473162f
            r6.f473162f = r5
            r0.f488734f = r3
            r5 = 4
            java.lang.Object r6 = r4.o7(r5, r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r45.rd2 r6 = (r45.rd2) r6
            r5 = 0
            if (r6 == 0) goto L70
            r0 = 3
            com.tencent.mm.protobuf.f r6 = r6.m75936x14adae67(r0)
            r45.z22 r6 = (r45.z22) r6
            if (r6 == 0) goto L5d
            java.lang.String r5 = r6.f473165i
        L5d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "callBackendPlaySong success, unique_play_id="
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "FinderLiveNormalRoomSingController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.d7(r45.z22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jh2.a
    public void e4(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "notifySingSuccess: songUniqueId=".concat(songUniqueId));
    }

    @Override // jh2.a
    public void e6(java.lang.String songUniqueId, jh2.d errorParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorParams, "errorParams");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNormalRoomSingController", "notifySingError: songUniqueId=" + songUniqueId + ", errorType=" + errorParams.f381340a + ", errorCode=" + errorParams.f381341b + ", errorMsg=" + errorParams.f381342c);
        r45.z22 P6 = g7().P6(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifySingError: starting next song: ");
        sb6.append(P6 != null ? P6.f473162f : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", sb6.toString());
        m7(this, P6, true, false, false, null, 28, null);
    }

    public final mm2.e1 e7() {
        return (mm2.e1) ((jz5.n) this.f488650n).mo141623x754a37bb();
    }

    @Override // jh2.a
    public void f6(java.lang.String songUniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "notifyVoiceEnd: songUniqueId=".concat(songUniqueId));
    }

    public final ah2.b f7() {
        return (ah2.b) ((jz5.n) this.f488652p).mo141623x754a37bb();
    }

    public final mm2.m6 g7() {
        return (mm2.m6) ((jz5.n) this.f488649m).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h7(java.lang.String r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.h7(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i7(r45.z22 r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.i7(r45.z22, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void k7(int i17, dh2.c0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomSingController", "setKtvBgmVolume: volume=" + i17 + ", source=" + source);
        ah2.b f76 = f7();
        if (f76 != null) {
            ((dh2.x) f76).o(java.lang.Integer.valueOf(i17), null, source);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l7(boolean r11, r45.z22 r12, om2.s r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.l7(boolean, r45.z22, om2.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n7(boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.e1.n7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object o7(int i17, r45.z22 z22Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String e17 = xy2.c.e(O6());
        java.lang.Long l17 = new java.lang.Long(e7().f410516m);
        java.lang.Long l18 = new java.lang.Long(e7().f410521r.m75942xfb822ef2(0));
        byte[] bArr = e7().f410518o;
        r45.b32 b32Var = new r45.b32();
        b32Var.f452029d.add(z22Var);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        new ek2.r2(e17, l17, l18, bArr, i17, b32Var, null, new sf2.h1(i17, rVar)).l();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // zh2.a
    public void r(r45.yx1 songInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
    }

    @Override // jh2.a
    public void v1(java.lang.String songUniqueId, int i17, int i18, float f17, int i19, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
    }

    @Override // zh2.a
    public void x5(r45.yx1 songInfo, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
    }

    @Override // bh2.b
    public void y2(java.lang.String songUniqueId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songUniqueId, "songUniqueId");
    }
}
