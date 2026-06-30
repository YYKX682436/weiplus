package a13;

/* loaded from: classes14.dex */
public final class t implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler, com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public b13.f f82104d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f82105e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f82106f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f82107g = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: h, reason: collision with root package name */
    public boolean f82108h = true;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f82109i;

    /* renamed from: m, reason: collision with root package name */
    public b13.m f82110m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f82111n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f2 f82112o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f82113p;

    public t(b13.f fVar) {
        this.f82104d = fVar;
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.z0.c(b17, null);
        this.f82109i = b17;
        this.f82112o = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f2();
        this.f82113p = vq4.b0.f520804b;
    }

    public final void a(java.lang.String str) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        a13.b bVar = new a13.b(this, str);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(bVar, 100L, false);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: accept */
    public boolean mo267xab27b508(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24110x78d908ce arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "accept(" + arg.m89290xfbec27f7() + ')');
        if (!arg.m89290xfbec27f7()) {
            b13.m mVar = this.f82110m;
            if (mVar != null) {
                return mVar.f257921s ? mVar.i() : mVar.l();
            }
            return false;
        }
        b13.m mVar2 = this.f82110m;
        if (mVar2 == null || !mVar2.f257907e.b(4101)) {
            return false;
        }
        mVar2.D0();
        gq4.v.Bi().O(1, true);
        gq4.v.Bi().a(true, mVar2.f257921s);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11046, 1, java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Integer.valueOf(gq4.v.Bi().m()), 0, java.lang.Integer.valueOf(mVar2.f257920r ? 1 : 0));
        g0Var.d(11080, 2, 0, 0);
        mVar2.E0(4111);
        mVar2.E0(4101);
        mVar2.E0(4100);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r0.u0() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r10, boolean r11, boolean r12, yz5.l r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "minimize: activity="
            r0.<init>(r1)
            android.app.Activity r1 = r9.f82106f
            r0.append(r1)
            java.lang.String r1 = ", needPop="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", showAlertIfNoPermission:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FlutterVoipPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            b13.m r0 = r9.f82110m
            if (r0 == 0) goto L31
            boolean r0 = r0.u0()
            r2 = 1
            if (r0 != r2) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            if (r2 == 0) goto L3f
            java.lang.String r10 = "voip is already minimized, ignore!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r13.mo146xb9724478(r10)
            return
        L3f:
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            sb0.f r0 = (sb0.f) r0
            boolean r0 = r0.Ui(r2)
            if (r0 != 0) goto L85
            if (r11 != 0) goto L59
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r13.mo146xb9724478(r10)
            return
        L59:
            java.lang.String r11 = "minimize, permission denied"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r11)
            android.content.Context r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.Class<tb0.i> r11 = tb0.i.class
            i95.m r11 = i95.n0.c(r11)
            tb0.i r11 = (tb0.i) r11
            r3 = 9
            r0 = 2131778907(0x7f105d5b, float:1.9189356E38)
            java.lang.String r4 = r2.getString(r0)
            a13.e r5 = new a13.e
            r5.<init>(r9, r12, r10, r13)
            java.lang.String r8 = n25.a.a()
            sb0.f r11 = (sb0.f) r11
            r11.getClass()
            r6 = 1
            r7 = 0
            com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(r2, r3, r4, r5, r6, r7, r8)
            goto L91
        L85:
            b13.m r11 = r9.f82110m
            if (r11 == 0) goto L91
            a13.f r0 = new a13.f
            r0.<init>(r10, r9, r13)
            r11.H0(r12, r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.b(boolean, boolean, boolean, yz5.l):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: cancel */
    public boolean mo268xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "cancel()");
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return mVar.f257921s ? mVar.j0(true) : mVar.j0(false);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: checkWeVisonSupport */
    public boolean mo269x22ecbde6() {
        return rs0.i.f480829a.e("GL_OES_EGL_image_external_essl3");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: clearVirtualBackground */
    public void mo270xdce8bcc(boolean z17) {
        b13.m mVar;
        if (!z17 && (mVar = this.f82110m) != null) {
            mVar.o0(8);
        }
        ar4.c.a(ar4.c.f94934a, 2, null, 2, null);
        ar4.c.f94935b = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getAudioOutputDevice */
    public long mo271xb5504f7() {
        b13.m mVar = this.f82110m;
        int i17 = 2;
        if (mVar != null) {
            vq4.z zVar = mVar.f257906d;
            if (zVar != null && ((vq4.m0) zVar).b()) {
                i17 = 1;
            } else if (zVar != null) {
                i17 = ((vq4.m0) zVar).a();
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getConnectedTime */
    public long mo272x974ec9c0() {
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return mVar.G;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return java.lang.System.currentTimeMillis();
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f82107g;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getRingStreamType */
    public long mo274xbd0daa20() {
        int i17;
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            vx3.c cVar = Ai.f549478e;
            if (cVar != null) {
                i17 = cVar.f522804b;
            } else {
                yx3.k kVar = Ai.f549476c;
                i17 = kVar != null ? kVar.c() : 3;
            }
        } else {
            i17 = 5;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "getRingStreamType: " + i17);
        return i17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getSmallStreamAspectRatio */
    public double mo275x72eddba2(boolean z17) {
        b13.m mVar = this.f82110m;
        if (mVar == null) {
            return 0.0d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "getSmallStreamSizeRatio, roomId:" + mVar.f98650z1 + ", isLocal:" + z17);
        return gq4.v.Bi().p(z17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getStatus */
    public long mo276x2fe4f2e8() {
        int ordinal;
        b13.m mVar = this.f82110m;
        if ((mVar != null ? java.lang.Integer.valueOf(mVar.c0()) : null) == null) {
            z03.c cVar = z03.d.f550744d;
            ordinal = 0;
        } else {
            z03.c cVar2 = z03.d.f550744d;
            b13.m mVar2 = this.f82110m;
            java.lang.Integer valueOf = mVar2 != null ? java.lang.Integer.valueOf(mVar2.c0()) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            ordinal = cVar2.a(valueOf.intValue()).ordinal();
        }
        return ordinal;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getTextureId */
    public long mo277xc2ca74e0(long j17) {
        b13.f fVar = this.f82104d;
        if (fVar != null) {
            int i17 = (int) j17;
            x.f fVar2 = fVar.f98631c;
            b13.a aVar = fVar2.e() > 1 ? (b13.a) fVar2.f(i17) : null;
            if (aVar != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCameraTextureId, textureId:");
                long j18 = aVar.f98619a;
                sb6.append(j18);
                sb6.append(", renderType:");
                sb6.append(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
                return j18;
            }
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: getUserInfo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24130xba62221f mo278x6bf3248f(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r0)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            r2 = 1
            com.tencent.mm.storage.z3 r1 = r1.n(r13, r2)
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            com.tencent.mm.storage.z3 r0 = r0.n(r13, r2)
            c13.b0 r3 = c13.b0.f119393d
            java.lang.Class<kv.a0> r3 = kv.a0.class
            i95.m r4 = i95.n0.c(r3)
            kv.a0 r4 = (kv.a0) r4
            com.tencent.mm.feature.avatar.w r4 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r4
            r4.getClass()
            com.tencent.mm.modelavatar.z r4 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai()
            java.lang.String r4 = r4.j(r13, r2)
            int r5 = r4.length()
            r6 = 0
            if (r5 != 0) goto L48
            r5 = r2
            goto L49
        L48:
            r5 = r6
        L49:
            java.lang.String r7 = "MicroMsg.FlutterVoipService"
            if (r5 != 0) goto L53
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r5 != 0) goto L77
        L53:
            i95.m r3 = i95.n0.c(r3)
            kv.a0 r3 = (kv.a0) r3
            com.tencent.mm.feature.avatar.w r3 = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) r3
            r3.getClass()
            com.tencent.mm.modelavatar.z r3 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai()
            java.lang.String r4 = r3.j(r13, r6)
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            if (r3 != 0) goto L77
            java.lang.String r3 = "getAvatarPath returns null. path: "
            java.lang.String r3 = r3.concat(r4)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r3)
            r3 = 0
            goto L94
        L77:
            java.lang.String r3 = com.p314xaae8f345.mm.vfs.w6.i(r4, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getAvatarPath -> path: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = ", realPath: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r4)
        L94:
            java.lang.String r4 = ""
            if (r3 != 0) goto L9a
            r7 = r4
            goto L9b
        L9a:
            r7 = r3
        L9b:
            java.lang.Class<tg3.v0> r3 = tg3.v0.class
            i95.m r3 = i95.n0.c(r3)
            tg3.v0 r3 = (tg3.v0) r3
            sg3.a r3 = (sg3.a) r3
            r3.getClass()
            java.lang.String r8 = c01.a2.e(r13)
            int r1 = r1.I
            if (r1 == r2) goto Lb9
            r2 = 2
            if (r1 == r2) goto Lb6
            java.lang.String r1 = "unknown"
            goto Lbb
        Lb6:
            java.lang.String r1 = "female"
            goto Lbb
        Lb9:
            java.lang.String r1 = "male"
        Lbb:
            r9 = r1
            java.lang.String r0 = t41.g.a(r0)
            if (r0 != 0) goto Lc4
            r11 = r4
            goto Lc5
        Lc4:
            r11 = r0
        Lc5:
            boolean r10 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(r13)
            com.tencent.pigeon.flutter_voip.UserInfoParams r0 = new com.tencent.pigeon.flutter_voip.UserInfoParams
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.mo278x6bf3248f(java.lang.String):com.tencent.pigeon.flutter_voip.UserInfoParams");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: hangUp */
    public void mo279xb70276ad() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "hangUp()");
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            mVar.s0();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: hideRingtoneHalfDialog */
    public void mo280xa40a797f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f2 f2Var = this.f82112o;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = f2Var.f258029a;
        if (z2Var != null) {
            z2Var.B();
        }
        f2Var.f258029a = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isAccessibleModeOn */
    public boolean mo281xdbde8b82() {
        return com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42850xa56c1dd1();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isCaller */
    public boolean mo282xd6a65955() {
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return mVar.f257920r;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isCameraFloatable */
    public boolean mo283xf1d3b187() {
        return wo.v1.f529355b.f529193e == 1;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isCameraOn */
    public boolean mo284xc7cd3f2e() {
        return !gq4.v.wi().f447509j;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isFrontCamera */
    public boolean mo285x24672724() {
        dr4.p1 p1Var;
        xq4.a aVar;
        b13.m mVar = this.f82110m;
        if (mVar == null || (p1Var = mVar.f257908f) == null || (aVar = p1Var.f324237c) == null) {
            return false;
        }
        return ((zq4.b) aVar).f556574a;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isMuted */
    public boolean mo286x7b1f9e61() {
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return ((vq4.m0) mVar.f257906d).f520894y;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isScreenInteractive */
    public boolean mo287x647766cc() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context.getSystemService("keyguard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        java.lang.Object systemService2 = context.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager powerManager = (android.os.PowerManager) systemService2;
        boolean isKeyguardLocked = ((android.app.KeyguardManager) systemService).isKeyguardLocked();
        android.app.Activity activity = this.f82106f;
        if (activity != null) {
            activity.hasWindowFocus();
        }
        if (isKeyguardLocked) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "isKeyguardLocked in ilink " + this.f82106f);
            return false;
        }
        if (powerManager.isInteractive()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "isInteractive in ilink " + this.f82106f);
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isScreenSplited */
    public boolean mo288x5c47e623() {
        android.app.Activity activity = this.f82106f;
        if (activity == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.fl.b(activity);
        if (com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(activity.getTaskId())) {
            return com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId()) || com.p314xaae8f345.mm.ui.fj.b(activity);
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isSplitScreenSupported */
    public boolean mo289x947bb72() {
        android.app.Activity activity = this.f82106f;
        if (activity == null) {
            return false;
        }
        com.p314xaae8f345.mm.ui.fl.b(activity);
        return com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(activity.getTaskId());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: isVideoMode */
    public boolean mo290x95ad4eb4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "isVideoMode()");
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return mVar.f257921s;
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: minimize */
    public void mo291xaefe469e(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24119xe52109e4 params, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        b(params.m89390xaad21da5(), params.m89391xc0118636(), params.m89389x27cab7d8(), new a13.g(callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        b13.f fVar;
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f82106f = mo137508x19263085;
        this.f82111n = (mo137508x19263085 == null || (intent = mo137508x19263085.getIntent()) == null) ? null : c13.b0.f119393d.pd(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onAttachedToActivity: " + this.f82106f + ", isFreshLaunch=" + this.f82108h);
        binding.mo137508x19263085().getWindow().addFlags(6815872);
        binding.mo137508x19263085().setRequestedOrientation(7);
        android.view.Window window = binding.mo137508x19263085().getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        gq4.a aVar = gq4.v.Bi().f258092b;
        b13.m mVar = aVar instanceof b13.m ? (b13.m) aVar : null;
        if (this.f82108h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "init flutter voip mgr");
            if (mVar == null) {
                c13.b0 b0Var = c13.b0.f119393d;
                android.content.Intent intent2 = binding.mo137508x19263085().getIntent();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent2, "getIntent(...)");
                java.lang.String pd6 = b0Var.pd(intent2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pd6);
                b0Var.W9(pd6);
                gq4.a aVar2 = gq4.v.Bi().f258092b;
                mVar = aVar2 instanceof b13.m ? (b13.m) aVar2 : null;
            }
            this.f82110m = mVar;
        }
        b13.m mVar2 = this.f82110m;
        if (mVar2 != null) {
            android.app.Activity mo137508x192630852 = binding.mo137508x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo137508x192630852, "getActivity(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onActivityAttached, " + mVar2);
            mVar2.H1 = mo137508x192630852;
        }
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipPlugin", "manager is null, skip onAttachedToActivity");
            return;
        }
        android.app.Activity activity = this.f82106f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        if (!mVar.J0(activity)) {
            mVar.p0();
            binding.mo137508x19263085().finish();
            this.f82110m = null;
            return;
        }
        if (this.f82108h && !this.f82113p && mVar.f257921s && (fVar = this.f82104d) != null) {
            fVar.b(mVar);
        }
        this.f82108h = false;
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
            Bi.f258106p = false;
            Bi.f258107q = false;
        }
        android.app.Activity mo137508x192630853 = binding.mo137508x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a activityC18916xbd02f08a = mo137508x192630853 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a ? (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a) mo137508x192630853 : null;
        hq4.a T6 = activityC18916xbd02f08a != null ? activityC18916xbd02f08a.T6() : null;
        w03.c cVar = T6 instanceof w03.c ? (w03.c) T6 : null;
        if (cVar != null) {
            cVar.f523410e = new a13.k(this);
        }
        b13.m mVar3 = this.f82110m;
        if (mVar3 == null) {
            return;
        }
        android.app.Activity mo137508x192630854 = binding.mo137508x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo137508x192630854, "getActivity(...)");
        p012xc85e97e9.p093xedfae76a.y yVar = mo137508x192630854 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) mo137508x192630854 : null;
        if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$observePermission$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
                /* renamed from: onCreate */
                public final void m63518x3e5a77bb() {
                    mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(gq4.v.Bi().n()));
                    if (wi6 != null) {
                        wi6.a();
                    }
                }

                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                /* renamed from: onResume */
                public final void m63519x57429eec() {
                    android.view.Window window2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onResume");
                    b13.m mVar4 = a13.t.this.f82110m;
                    if (mVar4 != null) {
                        if (mVar4.f257909g != null && mVar4.E != 1) {
                            mVar4.x0(new d13.e(mVar4), 1);
                        }
                        android.app.Activity activity2 = mVar4.H1;
                        if ((activity2 != null ? activity2.getIntent() : null) != null) {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            android.app.Activity activity3 = mVar4.H1;
                            android.content.Intent intent3 = activity3 != null ? activity3.getIntent() : null;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent3);
                            ep1.m.b(context, intent3, true);
                            android.app.Activity activity4 = mVar4.H1;
                            android.view.View decorView2 = (activity4 == null || (window2 = activity4.getWindow()) == null) ? null : window2.getDecorView();
                            ep1.m.a(mVar4.H1, false);
                            dr4.p1 p1Var = mVar4.f257908f;
                            if (p1Var != null) {
                                p1Var.i(true);
                            }
                            pv.g0 g0Var = mVar4.J1;
                            if (g0Var != null) {
                                android.app.Activity activity5 = mVar4.H1;
                                android.content.Intent intent4 = activity5 != null ? activity5.getIntent() : null;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(intent4);
                                ((ep1.k) g0Var).c(intent4, decorView2, null, new b13.k(mVar4));
                            }
                        }
                    }
                    b13.m mVar5 = a13.t.this.f82110m;
                    if (!(mVar5 != null && mVar5.u0())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "not in minimized state, call onVoipDeviceCalled()");
                        b13.m mVar6 = a13.t.this.f82110m;
                        if (mVar6 != null) {
                            mVar6.d();
                        }
                    }
                    gq4.v.Ai().a(true);
                    if (gm0.j1.a()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi2 = gq4.v.Bi();
                        Bi2.f258106p = false;
                        Bi2.f258107q = false;
                    }
                }
            });
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(mo137508x192630854, vq4.n0.g(mVar3.c0()) ? new java.lang.String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 19, "", "");
        binding.mo137507xb8c6e287(new a13.j(mo137508x192630854, this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onAttachToEngine");
        this.f82108h = true;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807.Companion.m89511x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "flutter_voip");
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f82105e = c28688xe8dbe4c2;
        this.f82107g.f(p012xc85e97e9.p093xedfae76a.m.ON_START);
        b13.f fVar = this.f82104d;
        if (fVar == null) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042 = flutterPluginBinding.m137988x3128f042();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137988x3128f042, "getTextureRegistry(...)");
            fVar = new b13.f(m137988x3128f042);
        }
        this.f82104d = fVar;
        this.f82109i = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: onBooted */
    public void mo292x3c8029d0() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: onClickRingtoneButton */
    public void mo293xf5bc28bd() {
        vx3.i iVar;
        gq4.a aVar = gq4.v.Bi().f258092b;
        java.lang.String str = aVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).f257916p : null;
        android.app.Activity activity = this.f82106f;
        a13.m mVar = new a13.m(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.f2 f2Var = this.f82112o;
        f2Var.getClass();
        boolean z17 = true;
        rq4.q.f480613n = true;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17 || (iVar = (vx3.i) mx3.f0.f414084d.mo3195x754a37bb()) == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
        f2Var.f258029a = cy3.q.b(activityC0065xcd7aa112, mo273xed6858b4, "", iVar, 1L, 9, 0, "", false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e2(iVar, mVar, activityC0065xcd7aa112, str, f2Var), null, 2112, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipPlugin", "onDetachedFromActivity: activity=" + this.f82106f + ", voipMgr=" + this.f82110m);
        android.app.Activity activity = this.f82106f;
        if (activity != null) {
            if (!activity.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipPlugin", "activity detached but not in finishing state");
                activity.finish();
            }
            this.f82106f = null;
        }
        b13.m mVar = this.f82110m;
        if (mVar == null) {
            java.lang.String str = this.f82111n;
            if (str != null) {
                a(str);
                return;
            }
            return;
        }
        int c07 = mVar.c0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state=");
        sb6.append(c07);
        sb6.append(", engineId=");
        java.lang.String str2 = mVar.f98649y1;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipPlugin", sb6.toString());
        java.util.Map map = vq4.n0.f520899a;
        if ((c07 == 262 || c07 == 8) || c07 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterVoipPlugin", "VoIP has been finished, clear the engine");
            a(str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onActivityDetached, " + mVar);
        mVar.H1 = null;
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.E0(true);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f82106f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        y03.h hVar;
        y03.i iVar;
        y03.h hVar2;
        y03.i iVar2;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onDetachedFromEngine");
        mo280xa40a797f();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f82105e;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        this.f82105e = null;
        this.f82107g.f(p012xc85e97e9.p093xedfae76a.m.ON_STOP);
        p3325xe03a0797.p3326xc267989b.z0.e(this.f82109i, null, 1, null);
        this.f82110m = null;
        b13.f fVar = this.f82104d;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f98630b, fVar.hashCode() + " release all textures");
            boolean z17 = vq4.b0.f520804b;
            java.util.List list = fVar.f98632d;
            if (z17) {
                y03.f fVar2 = fVar.f98633e;
                if (fVar2 != null && (surfaceTextureEntry2 = fVar2.f540172b) != null) {
                    ((java.util.ArrayList) list).add(surfaceTextureEntry2);
                }
                y03.f fVar3 = fVar.f98634f;
                if (fVar3 != null && (surfaceTextureEntry = fVar3.f540172b) != null) {
                    ((java.util.ArrayList) list).add(surfaceTextureEntry);
                }
                y03.f fVar4 = fVar.f98633e;
                y03.h hVar3 = fVar4 != null ? fVar4.f540173c : null;
                if (hVar3 != null) {
                    hVar3.f540179f = null;
                }
                if (fVar4 != null && (hVar2 = fVar4.f540173c) != null && (iVar2 = hVar2.f540178e) != null) {
                    iVar2.b();
                }
                y03.f fVar5 = fVar.f98634f;
                y03.h hVar4 = fVar5 != null ? fVar5.f540173c : null;
                if (hVar4 != null) {
                    hVar4.f540179f = null;
                }
                if (fVar5 != null && (hVar = fVar5.f540173c) != null && (iVar = hVar.f540178e) != null) {
                    iVar.b();
                }
            } else {
                x.f fVar6 = fVar.f98631c;
                int e17 = fVar6.e();
                for (int i17 = 0; i17 < e17; i17++) {
                    b13.a aVar = (b13.a) fVar6.f(i17);
                    d13.c cVar = aVar.f98621c;
                    cVar.f307257f = null;
                    cVar.a();
                    ((java.util.ArrayList) list).add(aVar.f98620b);
                }
                fVar6.m174730x5a5b64d();
            }
        }
        b13.f fVar7 = this.f82104d;
        if (fVar7 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar7.f98630b, fVar7.hashCode() + " clearTextureTrash");
            java.util.ArrayList arrayList = (java.util.ArrayList) fVar7.f98632d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) it.next()).mo138094x41012807();
            }
            arrayList.clear();
        }
        java.lang.String str = this.f82111n;
        if (str != null) {
            a(str);
        }
        this.f82104d = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(call.f71610xbfc5d0e1, "getPlatformVersion")) {
            result.mo65719xbc9fa82f();
            return;
        }
        result.mo65720x90b54003("Android " + android.os.Build.VERSION.RELEASE);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f82106f = binding.mo137508x19263085();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onReattachedToActivityForConfigChanges:" + this.f82106f);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: onRendered */
    public void mo295x879b63b4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "onRendered()");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: pauseRing */
    public void mo296x316f1946() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "pauseRing");
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            Ai.d(vx3.b.f522797d);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: prepareTextures */
    public void mo297xd69f48df() {
        b13.m mVar;
        b13.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "prepareTextures");
        if (this.f82113p || (mVar = this.f82110m) == null || (fVar = this.f82104d) == null) {
            return;
        }
        fVar.b(mVar);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: queryAudioRouteInfos */
    public java.util.List mo298xedbbaf4a() {
        vq4.z zVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b13.m mVar = this.f82110m;
        if (mVar != null && (zVar = mVar.f257906d) != null) {
            for (cv.v0 v0Var : ((vq4.m0) zVar).f520890u.a()) {
                java.lang.String str = v0Var.f304050b;
                if (str == null) {
                    str = "";
                }
                int i17 = v0Var.f304049a;
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42972x1b72d28e : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42975x5a332e62 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42974xfe9d1958 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf, str));
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: queryCurrentAudioRouteInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81 mo299xe184b952() {
        cv.v0 v0Var;
        java.lang.String str;
        vq4.z zVar;
        b13.m mVar = this.f82110m;
        if (mVar == null || (zVar = mVar.f257906d) == null) {
            v0Var = null;
        } else {
            ((vq4.m0) zVar).f520890u.getClass();
            v0Var = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        }
        if (v0Var == null || (str = v0Var.f304050b) == null) {
            str = "";
        }
        int i17 = v0Var != null ? v0Var.f304049a : -1;
        return new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42972x1b72d28e : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42975x5a332e62 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42974xfe9d1958 : com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac.f42976xb313ebdf, str);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: queryGPURating */
    public long mo300x39b16181() {
        return rs0.n.f480839d.f();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: reject */
    public boolean mo301xc849739f() {
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            return mVar.f257921s ? mVar.r() : mVar.U();
        }
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: releaseTexture */
    public void mo302xe0c07f14(long j17) {
        java.lang.Long valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "releaseTexture, textureId:" + j17);
        b13.f fVar = this.f82104d;
        if (fVar == null || (valueOf = java.lang.Long.valueOf(j17)) == null || vq4.b0.f520804b) {
            return;
        }
        long longValue = valueOf.longValue();
        x.f fVar2 = fVar.f98631c;
        b13.a aVar = (b13.a) fVar2.c(longValue, null);
        if (aVar != null) {
            d13.c cVar = aVar.f98621c;
            cVar.f307257f = null;
            ((java.util.ArrayList) fVar.f98632d).add(aVar.f98620b);
            cVar.a();
        }
        int b17 = x.e.b(fVar2.f532355e, fVar2.f532357g, valueOf.longValue());
        if (b17 >= 0) {
            java.lang.Object[] objArr = fVar2.f532356f;
            java.lang.Object obj = objArr[b17];
            java.lang.Object obj2 = x.f.f532353h;
            if (obj != obj2) {
                objArr[b17] = obj2;
                fVar2.f532354d = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f98630b, "release flutter texture " + valueOf);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: reportFps */
    public void mo303xeaf04315(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24118x4eb67faf params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: requestRefreshTextureSize */
    public void mo304x8f163ad0() {
        b13.f fVar = this.f82104d;
        if (fVar != null) {
            y03.f fVar2 = fVar.f98633e;
            if (fVar2 != null) {
                c13.b0 b0Var = c13.b0.f119393d;
                ((ku5.t0) ku5.t0.f394148d).B(new c13.x(fVar2));
            }
            y03.f fVar3 = fVar.f98634f;
            if (fVar3 != null) {
                c13.b0 b0Var2 = c13.b0.f119393d;
                ((ku5.t0) ku5.t0.f394148d).B(new c13.x(fVar3));
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: requestRingtoneInfo */
    public void mo305xbeb35b9f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "requestRingtoneInfo: ".concat(username));
        p3325xe03a0797.p3326xc267989b.l.d(this.f82109i, null, null, new a13.n(this, username, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: requestRingtoneMute */
    public void mo306xbeb5490a(boolean z17) {
        yx3.v Ai;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "requestRingtoneMute: " + z17 + ".value");
        if (j65.e.b() && j65.e.g() && (Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai()) != null) {
            Ai.f549481h = z17;
            yx3.k kVar = Ai.f549476c;
            if (kVar != null) {
                kVar.i(z17);
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: restartRing */
    public void mo307x2fe5dcdf() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "restartRing");
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: resumeRing */
    public void mo308xdecac7fd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "resumeRing");
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            Ai.d(vx3.b.f522800g);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: routeToDevice */
    public boolean mo309x48b2ce1a(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81 device) {
        vq4.z zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac type = device.m89309x1cd0bea6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            int i17 = z03.a.f550735a[type.ordinal()];
            cv.v0 v0Var = new cv.v0(i17 != 1 ? i17 != 2 ? i17 != 3 ? 1 : 2 : 3 : 4, null, 0, 6, null);
            mVar.B0(v0Var);
            mVar.z0(v0Var.c(), 19);
        }
        b13.m mVar2 = this.f82110m;
        if (mVar2 == null || (zVar = mVar2.f257906d) == null) {
            return false;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.EnumC24111x635c95ac type2 = device.m89309x1cd0bea6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type2, "type");
        int i18 = z03.a.f550735a[type2.ordinal()];
        ((vq4.m0) zVar).m(new cv.v0(i18 != 1 ? i18 != 2 ? i18 != 3 ? 1 : 2 : 3 : 4, device.m89308x1ccda9f7(), 0, 4, null));
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: setMuted */
    public void mo310x5362b229(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setMuted(" + z17);
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            mVar.K0(z17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: setRingtoneSelf */
    public void mo311x78836b90(java.lang.String username, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf: ".concat(username));
        p3325xe03a0797.p3326xc267989b.l.d(this.f82109i, null, null, new a13.o(callback, username, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: setSegmentVirtualBackground */
    public void mo312x89672628(long j17) {
        b13.m mVar = this.f82110m;
        if (mVar != null) {
            mVar.o0(7);
        }
        ar4.c.f94934a.b(rh0.b0.m162388xcee59d22()[(int) j17]);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: setSpeakerEnabled */
    public void mo313xd980cb44(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled: " + z17);
        p3325xe03a0797.p3326xc267989b.l.d(this.f82109i, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new a13.p(this, z17, null), 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled ended");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: showNotFriend */
    public void mo314x100e48d4(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.lfi : com.p314xaae8f345.mm.R.C30867xcad56011.lhu;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i17));
        u1Var.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lo7));
        u1Var.q(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: showTalkingUnSafe */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo315x3efe051f(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L11
            int r2 = r6.length()
            if (r2 <= 0) goto Lc
            r2 = r0
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 != r0) goto L11
            r2 = r0
            goto L12
        L11:
            r2 = r1
        L12:
            java.lang.String r3 = "MicroMsg.FlutterVoipPlugin"
            if (r2 == 0) goto L6c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "unsafe talking, need verification "
            r2.<init>(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            java.lang.String r6 = "rawUrl"
            java.lang.String r3 = r3.toString()
            r2.putExtra(r6, r3)
            java.lang.String r6 = "showShare"
            r2.putExtra(r6, r1)
            java.lang.String r6 = "show_bottom"
            r2.putExtra(r6, r1)
            java.lang.String r6 = "needRedirect"
            r2.putExtra(r6, r1)
            java.lang.String r6 = "neverGetA8Key"
            r2.putExtra(r6, r0)
            com.tencent.mm.protocal.JsapiPermissionWrapper r6 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h
            java.lang.String r0 = "hardcode_jspermission"
            r2.putExtra(r0, r6)
            com.tencent.mm.protocal.GeneralControlWrapper r6 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e
            java.lang.String r0 = "hardcode_general_ctrl"
            r2.putExtra(r0, r6)
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 0
            java.lang.String r1 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            j45.l.j(r6, r1, r3, r2, r0)
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            db5.f.i(r6)
            goto L93
        L6c:
            java.lang.String r6 = "unsafe talking, showing tip dialog"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            com.tencent.mm.ui.widget.dialog.u1 r6 = new com.tencent.mm.ui.widget.dialog.u1
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r6.<init>(r0)
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r2 = 2131778992(0x7f105db0, float:1.9189528E38)
            java.lang.String r0 = r0.getString(r2)
            r6.g(r0)
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r2 = 2131778991(0x7f105daf, float:1.9189526E38)
            java.lang.String r0 = r0.getString(r2)
            r6.n(r0)
            r6.q(r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.mo315x3efe051f(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: switchCamera */
    public void mo316x2db92f79(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCamera, this.roomId:");
        b13.m mVar = this.f82110m;
        sb6.append(mVar != null ? java.lang.Integer.valueOf(mVar.f98650z1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        b13.m mVar2 = this.f82110m;
        if (mVar2 != null) {
            mVar2.w0(new a13.r(callback));
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: switchCameraOpenStatus */
    public void mo317x2f44b35(yz5.l callback) {
        dr4.p1 p1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCameraOpenStatus, this.roomId:");
        b13.m mVar = this.f82110m;
        sb6.append(mVar != null ? java.lang.Integer.valueOf(mVar.f98650z1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        final b13.m mVar2 = this.f82110m;
        if (mVar2 != null && (p1Var = mVar2.f257908f) != null) {
            yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.d0$$b
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                    d0Var.getClass();
                    if (bool.booleanValue()) {
                        rq4.q qVar = rq4.q.f480600a;
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        rq4.q.f480625z = java.lang.System.currentTimeMillis();
                    } else {
                        long j17 = rq4.q.f480624y;
                        long j18 = rq4.q.f480625z;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        rq4.q.f480624y = j17 + (java.lang.System.currentTimeMillis() - j18);
                        rq4.q.f480625z = 0L;
                    }
                    if (gq4.v.wi().f447517r != 0) {
                        if (bool.booleanValue()) {
                            gq4.v.Bi().f258091a.o(true);
                        } else {
                            gq4.v.Bi().f258091a.o(false);
                        }
                    }
                    d0Var.o0(bool.booleanValue() ? 6 : 5);
                    return null;
                }
            };
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSwitchCameraOpenStatus");
            xq4.a aVar = p1Var.f324237c;
            if (aVar != null) {
                if (((zq4.b) aVar).f556583j) {
                    gq4.v.wi().f447509j = true;
                    aVar.f();
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                } else {
                    gq4.v.wi().f447509j = false;
                    aVar.d();
                    lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new a13.s(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: switchToVoiceMode */
    public boolean mo318xa905f9e6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "switchToVoiceMode()");
        b13.m mVar = this.f82110m;
        if (mVar == null) {
            return false;
        }
        if (gq4.v.Bi().m() != 0) {
            return mVar.C0();
        }
        mVar.f257928y = true;
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: toggleSplitScreen */
    public void mo319xe537dc32() {
        android.app.Activity activity = this.f82106f;
        if (activity == null) {
            return;
        }
        if (mo288x5c47e623()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "merge screen");
            com.p314xaae8f345.mm.ui.ee.g(activity.getTaskId(), 0);
            com.p314xaae8f345.mm.ui.fj.a(activity, true, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipPlugin", "split screen");
            com.p314xaae8f345.mm.ui.ee.g(activity.getTaskId(), 2);
            com.p314xaae8f345.mm.ui.fj.i(activity, true, true);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.InterfaceC24155x4d8db807
    /* renamed from: updateTextureSize */
    public void mo320x1c406b33(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24129xf8beb679 sizeParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeParam, "sizeParam");
    }
}
