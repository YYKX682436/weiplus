package a13;

/* loaded from: classes14.dex */
public final class t implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler, com.tencent.pigeon.flutter_voip.VoIPPluginApi, io.flutter.embedding.engine.plugins.activity.ActivityAware, androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public b13.f f571d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f572e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f573f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.b0 f574g = new androidx.lifecycle.b0(this, true);

    /* renamed from: h, reason: collision with root package name */
    public boolean f575h = true;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.y0 f576i;

    /* renamed from: m, reason: collision with root package name */
    public b13.m f577m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f578n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.f2 f579o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f580p;

    public t(b13.f fVar) {
        this.f571d = fVar;
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.z0.c(b17, null);
        this.f576i = b17;
        this.f579o = new com.tencent.mm.plugin.voip.model.f2();
        this.f580p = vq4.b0.f439271b;
    }

    public final void a(java.lang.String str) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        a13.b bVar = new a13.b(this, str);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(bVar, 100L, false);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean accept(com.tencent.pigeon.flutter_voip.AcceptParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "accept(" + arg.getNeedSwitchToVoice() + ')');
        if (!arg.getNeedSwitchToVoice()) {
            b13.m mVar = this.f577m;
            if (mVar != null) {
                return mVar.f176388s ? mVar.i() : mVar.l();
            }
            return false;
        }
        b13.m mVar2 = this.f577m;
        if (mVar2 == null || !mVar2.f176374e.b(4101)) {
            return false;
        }
        mVar2.D0();
        gq4.v.Bi().O(1, true);
        gq4.v.Bi().a(true, mVar2.f176388s);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11046, 1, java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Integer.valueOf(gq4.v.Bi().m()), 0, java.lang.Integer.valueOf(mVar2.f176387r ? 1 : 0));
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
            android.app.Activity r1 = r9.f573f
            r0.append(r1)
            java.lang.String r1 = ", needPop="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", showAlertIfNoPermission:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FlutterVoipPlugin"
            com.tencent.mars.xlog.Log.i(r1, r0)
            b13.m r0 = r9.f577m
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
            com.tencent.mars.xlog.Log.w(r1, r10)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r13.invoke(r10)
            return
        L3f:
            java.lang.Class<tb0.j> r0 = tb0.j.class
            i95.m r0 = i95.n0.c(r0)
            tb0.j r0 = (tb0.j) r0
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            sb0.f r0 = (sb0.f) r0
            boolean r0 = r0.Ui(r2)
            if (r0 != 0) goto L85
            if (r11 != 0) goto L59
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r13.invoke(r10)
            return
        L59:
            java.lang.String r11 = "minimize, permission denied"
            com.tencent.mars.xlog.Log.e(r1, r11)
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
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
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.R6(r2, r3, r4, r5, r6, r7, r8)
            goto L91
        L85:
            b13.m r11 = r9.f577m
            if (r11 == 0) goto L91
            a13.f r0 = new a13.f
            r0.<init>(r10, r9, r13)
            r11.H0(r12, r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.b(boolean, boolean, boolean, yz5.l):void");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "cancel()");
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return mVar.f176388s ? mVar.j0(true) : mVar.j0(false);
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean checkWeVisonSupport() {
        return rs0.i.f399296a.e("GL_OES_EGL_image_external_essl3");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void clearVirtualBackground(boolean z17) {
        b13.m mVar;
        if (!z17 && (mVar = this.f577m) != null) {
            mVar.o0(8);
        }
        ar4.c.a(ar4.c.f13401a, 2, null, 2, null);
        ar4.c.f13402b = null;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long getAudioOutputDevice() {
        b13.m mVar = this.f577m;
        int i17 = 2;
        if (mVar != null) {
            vq4.z zVar = mVar.f176373d;
            if (zVar != null && ((vq4.m0) zVar).b()) {
                i17 = 1;
            } else if (zVar != null) {
                i17 = ((vq4.m0) zVar).a();
            }
        }
        return i17;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long getConnectedTime() {
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return mVar.G;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return java.lang.System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f574g;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long getRingStreamType() {
        int i17;
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            vx3.c cVar = Ai.f467945e;
            if (cVar != null) {
                i17 = cVar.f441271b;
            } else {
                yx3.k kVar = Ai.f467943c;
                i17 = kVar != null ? kVar.c() : 3;
            }
        } else {
            i17 = 5;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "getRingStreamType: " + i17);
        return i17;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public double getSmallStreamAspectRatio(boolean z17) {
        b13.m mVar = this.f577m;
        if (mVar == null) {
            return 0.0d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "getSmallStreamSizeRatio, roomId:" + mVar.f17117z1 + ", isLocal:" + z17);
        return gq4.v.Bi().p(z17);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long getStatus() {
        int ordinal;
        b13.m mVar = this.f577m;
        if ((mVar != null ? java.lang.Integer.valueOf(mVar.c0()) : null) == null) {
            z03.c cVar = z03.d.f469211d;
            ordinal = 0;
        } else {
            z03.c cVar2 = z03.d.f469211d;
            b13.m mVar2 = this.f577m;
            java.lang.Integer valueOf = mVar2 != null ? java.lang.Integer.valueOf(mVar2.c0()) : null;
            kotlin.jvm.internal.o.d(valueOf);
            ordinal = cVar2.a(valueOf.intValue()).ordinal();
        }
        return ordinal;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long getTextureId(long j17) {
        b13.f fVar = this.f571d;
        if (fVar != null) {
            int i17 = (int) j17;
            x.f fVar2 = fVar.f17098c;
            b13.a aVar = fVar2.e() > 1 ? (b13.a) fVar2.f(i17) : null;
            if (aVar != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCameraTextureId, textureId:");
                long j18 = aVar.f17086a;
                sb6.append(j18);
                sb6.append(", renderType:");
                sb6.append(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
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
    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.pigeon.flutter_voip.UserInfoParams getUserInfo(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r0)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            r2 = 1
            com.tencent.mm.storage.z3 r1 = r1.n(r13, r2)
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.tencent.mm.plugin.messenger.foundation.h2) r0
            com.tencent.mm.storage.k4 r0 = r0.Bi()
            com.tencent.mm.storage.z3 r0 = r0.n(r13, r2)
            c13.b0 r3 = c13.b0.f37860d
            java.lang.Class<kv.a0> r3 = kv.a0.class
            i95.m r4 = i95.n0.c(r3)
            kv.a0 r4 = (kv.a0) r4
            com.tencent.mm.feature.avatar.w r4 = (com.tencent.mm.feature.avatar.w) r4
            r4.getClass()
            com.tencent.mm.modelavatar.z r4 = com.tencent.mm.modelavatar.d1.Ai()
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
            boolean r5 = com.tencent.mm.vfs.w6.j(r4)
            if (r5 != 0) goto L77
        L53:
            i95.m r3 = i95.n0.c(r3)
            kv.a0 r3 = (kv.a0) r3
            com.tencent.mm.feature.avatar.w r3 = (com.tencent.mm.feature.avatar.w) r3
            r3.getClass()
            com.tencent.mm.modelavatar.z r3 = com.tencent.mm.modelavatar.d1.Ai()
            java.lang.String r4 = r3.j(r13, r6)
            boolean r3 = com.tencent.mm.vfs.w6.j(r4)
            if (r3 != 0) goto L77
            java.lang.String r3 = "getAvatarPath returns null. path: "
            java.lang.String r3 = r3.concat(r4)
            com.tencent.mars.xlog.Log.i(r7, r3)
            r3 = 0
            goto L94
        L77:
            java.lang.String r3 = com.tencent.mm.vfs.w6.i(r4, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getAvatarPath -> path: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = ", realPath: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            com.tencent.mars.xlog.Log.i(r7, r4)
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
            boolean r10 = com.tencent.mm.storage.z3.m4(r13)
            com.tencent.pigeon.flutter_voip.UserInfoParams r0 = new com.tencent.pigeon.flutter_voip.UserInfoParams
            kotlin.jvm.internal.o.d(r8)
            r5 = r0
            r6 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.getUserInfo(java.lang.String):com.tencent.pigeon.flutter_voip.UserInfoParams");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void hangUp() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "hangUp()");
        b13.m mVar = this.f577m;
        if (mVar != null) {
            mVar.s0();
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void hideRingtoneHalfDialog() {
        com.tencent.mm.plugin.voip.model.f2 f2Var = this.f579o;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = f2Var.f176496a;
        if (z2Var != null) {
            z2Var.B();
        }
        f2Var.f176496a = null;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isAccessibleModeOn() {
        return com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isTouchExplorationEnable();
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isCaller() {
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return mVar.f176387r;
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isCameraFloatable() {
        return wo.v1.f447822b.f447660e == 1;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isCameraOn() {
        return !gq4.v.wi().f365976j;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isFrontCamera() {
        dr4.p1 p1Var;
        xq4.a aVar;
        b13.m mVar = this.f577m;
        if (mVar == null || (p1Var = mVar.f176375f) == null || (aVar = p1Var.f242704c) == null) {
            return false;
        }
        return ((zq4.b) aVar).f475041a;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isMuted() {
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return ((vq4.m0) mVar.f176373d).f439361y;
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isScreenInteractive() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context.getSystemService("keyguard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        java.lang.Object systemService2 = context.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        android.os.PowerManager powerManager = (android.os.PowerManager) systemService2;
        boolean isKeyguardLocked = ((android.app.KeyguardManager) systemService).isKeyguardLocked();
        android.app.Activity activity = this.f573f;
        if (activity != null) {
            activity.hasWindowFocus();
        }
        if (isKeyguardLocked) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "isKeyguardLocked in ilink " + this.f573f);
            return false;
        }
        if (powerManager.isInteractive()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "isInteractive in ilink " + this.f573f);
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isScreenSplited() {
        android.app.Activity activity = this.f573f;
        if (activity == null) {
            return false;
        }
        com.tencent.mm.ui.fl.b(activity);
        if (com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(activity.getTaskId())) {
            return com.tencent.mm.ui.bk.z(activity.getTaskId()) || com.tencent.mm.ui.fj.b(activity);
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isSplitScreenSupported() {
        android.app.Activity activity = this.f573f;
        if (activity == null) {
            return false;
        }
        com.tencent.mm.ui.fl.b(activity);
        return com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.eg.d(activity.getTaskId());
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean isVideoMode() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "isVideoMode()");
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return mVar.f176388s;
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void minimize(com.tencent.pigeon.flutter_voip.MinimizeParams params, yz5.l callback) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(callback, "callback");
        b(params.getNeedPop(), params.getShowAlertIfNoPermission(), params.getNeedAnimation(), new a13.g(callback));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        b13.f fVar;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        this.f573f = activity;
        this.f578n = (activity == null || (intent = activity.getIntent()) == null) ? null : c13.b0.f37860d.pd(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onAttachedToActivity: " + this.f573f + ", isFreshLaunch=" + this.f575h);
        binding.getActivity().getWindow().addFlags(6815872);
        binding.getActivity().setRequestedOrientation(7);
        android.view.Window window = binding.getActivity().getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        gq4.a aVar = gq4.v.Bi().f176559b;
        b13.m mVar = aVar instanceof b13.m ? (b13.m) aVar : null;
        if (this.f575h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "init flutter voip mgr");
            if (mVar == null) {
                c13.b0 b0Var = c13.b0.f37860d;
                android.content.Intent intent2 = binding.getActivity().getIntent();
                kotlin.jvm.internal.o.f(intent2, "getIntent(...)");
                java.lang.String pd6 = b0Var.pd(intent2);
                kotlin.jvm.internal.o.d(pd6);
                b0Var.W9(pd6);
                gq4.a aVar2 = gq4.v.Bi().f176559b;
                mVar = aVar2 instanceof b13.m ? (b13.m) aVar2 : null;
            }
            this.f577m = mVar;
        }
        b13.m mVar2 = this.f577m;
        if (mVar2 != null) {
            android.app.Activity activity2 = binding.getActivity();
            kotlin.jvm.internal.o.f(activity2, "getActivity(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onActivityAttached, " + mVar2);
            mVar2.H1 = activity2;
        }
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVoipPlugin", "manager is null, skip onAttachedToActivity");
            return;
        }
        android.app.Activity activity3 = this.f573f;
        kotlin.jvm.internal.o.d(activity3);
        if (!mVar.J0(activity3)) {
            mVar.p0();
            binding.getActivity().finish();
            this.f577m = null;
            return;
        }
        if (this.f575h && !this.f580p && mVar.f176388s && (fVar = this.f571d) != null) {
            fVar.b(mVar);
        }
        this.f575h = false;
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
            Bi.f176573p = false;
            Bi.f176574q = false;
        }
        android.app.Activity activity4 = binding.getActivity();
        com.tencent.mm.plugin.voip.ui.VideoActivity videoActivity = activity4 instanceof com.tencent.mm.plugin.voip.ui.VideoActivity ? (com.tencent.mm.plugin.voip.ui.VideoActivity) activity4 : null;
        hq4.a T6 = videoActivity != null ? videoActivity.T6() : null;
        w03.c cVar = T6 instanceof w03.c ? (w03.c) T6 : null;
        if (cVar != null) {
            cVar.f441877e = new a13.k(this);
        }
        b13.m mVar3 = this.f577m;
        if (mVar3 == null) {
            return;
        }
        android.app.Activity activity5 = binding.getActivity();
        kotlin.jvm.internal.o.f(activity5, "getActivity(...)");
        androidx.lifecycle.y yVar = activity5 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) activity5 : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoipPlugin$observePermission$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_CREATE)
                public final void onCreate() {
                    mg0.a wi6 = ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).wi(java.lang.String.valueOf(gq4.v.Bi().n()));
                    if (wi6 != null) {
                        wi6.a();
                    }
                }

                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                public final void onResume() {
                    android.view.Window window2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onResume");
                    b13.m mVar4 = a13.t.this.f577m;
                    if (mVar4 != null) {
                        if (mVar4.f176376g != null && mVar4.E != 1) {
                            mVar4.x0(new d13.e(mVar4), 1);
                        }
                        android.app.Activity activity6 = mVar4.H1;
                        if ((activity6 != null ? activity6.getIntent() : null) != null) {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            android.app.Activity activity7 = mVar4.H1;
                            android.content.Intent intent3 = activity7 != null ? activity7.getIntent() : null;
                            kotlin.jvm.internal.o.d(intent3);
                            ep1.m.b(context, intent3, true);
                            android.app.Activity activity8 = mVar4.H1;
                            android.view.View decorView2 = (activity8 == null || (window2 = activity8.getWindow()) == null) ? null : window2.getDecorView();
                            ep1.m.a(mVar4.H1, false);
                            dr4.p1 p1Var = mVar4.f176375f;
                            if (p1Var != null) {
                                p1Var.i(true);
                            }
                            pv.g0 g0Var = mVar4.J1;
                            if (g0Var != null) {
                                android.app.Activity activity9 = mVar4.H1;
                                android.content.Intent intent4 = activity9 != null ? activity9.getIntent() : null;
                                kotlin.jvm.internal.o.d(intent4);
                                ((ep1.k) g0Var).c(intent4, decorView2, null, new b13.k(mVar4));
                            }
                        }
                    }
                    b13.m mVar5 = a13.t.this.f577m;
                    if (!(mVar5 != null && mVar5.u0())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "not in minimized state, call onVoipDeviceCalled()");
                        b13.m mVar6 = a13.t.this.f577m;
                        if (mVar6 != null) {
                            mVar6.d();
                        }
                    }
                    gq4.v.Ai().a(true);
                    if (gm0.j1.a()) {
                        com.tencent.mm.plugin.voip.model.h2 Bi2 = gq4.v.Bi();
                        Bi2.f176573p = false;
                        Bi2.f176574q = false;
                    }
                }
            });
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity5, vq4.n0.g(mVar3.c0()) ? new java.lang.String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 19, "", "");
        binding.addRequestPermissionsResultListener(new a13.j(activity5, this));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onAttachToEngine");
        this.f575h = true;
        com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion companion = com.tencent.pigeon.flutter_voip.VoIPPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_voip.VoIPPluginApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_voip");
        methodChannel.setMethodCallHandler(this);
        this.f572e = methodChannel;
        this.f574g.f(androidx.lifecycle.m.ON_START);
        b13.f fVar = this.f571d;
        if (fVar == null) {
            io.flutter.view.TextureRegistry textureRegistry = flutterPluginBinding.getTextureRegistry();
            kotlin.jvm.internal.o.f(textureRegistry, "getTextureRegistry(...)");
            fVar = new b13.f(textureRegistry);
        }
        this.f571d = fVar;
        this.f576i = kotlinx.coroutines.z0.b();
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void onBooted() {
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void onClickRingtoneButton() {
        vx3.i iVar;
        gq4.a aVar = gq4.v.Bi().f176559b;
        java.lang.String str = aVar != null ? ((com.tencent.mm.plugin.voip.model.d0) aVar).f176383p : null;
        android.app.Activity activity = this.f573f;
        a13.m mVar = new a13.m(this);
        com.tencent.mm.plugin.voip.model.f2 f2Var = this.f579o;
        f2Var.getClass();
        boolean z17 = true;
        rq4.q.f399080n = true;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17 || (iVar = (vx3.i) mx3.f0.f332551d.getValue()) == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        if (appCompatActivity == null) {
            return;
        }
        androidx.lifecycle.o mo133getLifecycle = appCompatActivity.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
        f2Var.f176496a = cy3.q.b(appCompatActivity, mo133getLifecycle, "", iVar, 1L, 9, 0, "", false, false, new com.tencent.mm.plugin.voip.model.e2(iVar, mVar, appCompatActivity, str, f2Var), null, 2112, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipPlugin", "onDetachedFromActivity: activity=" + this.f573f + ", voipMgr=" + this.f577m);
        android.app.Activity activity = this.f573f;
        if (activity != null) {
            if (!activity.isFinishing()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipPlugin", "activity detached but not in finishing state");
                activity.finish();
            }
            this.f573f = null;
        }
        b13.m mVar = this.f577m;
        if (mVar == null) {
            java.lang.String str = this.f578n;
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
        java.lang.String str2 = mVar.f17116y1;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipPlugin", sb6.toString());
        java.util.Map map = vq4.n0.f439366a;
        if ((c07 == 262 || c07 == 8) || c07 == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterVoipPlugin", "VoIP has been finished, clear the engine");
            a(str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onActivityDetached, " + mVar);
        mVar.H1 = null;
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.E0(true);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f573f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        y03.h hVar;
        y03.i iVar;
        y03.h hVar2;
        y03.i iVar2;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onDetachedFromEngine");
        hideRingtoneHalfDialog();
        io.flutter.plugin.common.MethodChannel methodChannel = this.f572e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f572e = null;
        this.f574g.f(androidx.lifecycle.m.ON_STOP);
        kotlinx.coroutines.z0.e(this.f576i, null, 1, null);
        this.f577m = null;
        b13.f fVar = this.f571d;
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i(fVar.f17097b, fVar.hashCode() + " release all textures");
            boolean z17 = vq4.b0.f439271b;
            java.util.List list = fVar.f17099d;
            if (z17) {
                y03.f fVar2 = fVar.f17100e;
                if (fVar2 != null && (surfaceTextureEntry2 = fVar2.f458639b) != null) {
                    ((java.util.ArrayList) list).add(surfaceTextureEntry2);
                }
                y03.f fVar3 = fVar.f17101f;
                if (fVar3 != null && (surfaceTextureEntry = fVar3.f458639b) != null) {
                    ((java.util.ArrayList) list).add(surfaceTextureEntry);
                }
                y03.f fVar4 = fVar.f17100e;
                y03.h hVar3 = fVar4 != null ? fVar4.f458640c : null;
                if (hVar3 != null) {
                    hVar3.f458646f = null;
                }
                if (fVar4 != null && (hVar2 = fVar4.f458640c) != null && (iVar2 = hVar2.f458645e) != null) {
                    iVar2.b();
                }
                y03.f fVar5 = fVar.f17101f;
                y03.h hVar4 = fVar5 != null ? fVar5.f458640c : null;
                if (hVar4 != null) {
                    hVar4.f458646f = null;
                }
                if (fVar5 != null && (hVar = fVar5.f458640c) != null && (iVar = hVar.f458645e) != null) {
                    iVar.b();
                }
            } else {
                x.f fVar6 = fVar.f17098c;
                int e17 = fVar6.e();
                for (int i17 = 0; i17 < e17; i17++) {
                    b13.a aVar = (b13.a) fVar6.f(i17);
                    d13.c cVar = aVar.f17088c;
                    cVar.f225724f = null;
                    cVar.a();
                    ((java.util.ArrayList) list).add(aVar.f17087b);
                }
                fVar6.clear();
            }
        }
        b13.f fVar7 = this.f571d;
        if (fVar7 != null) {
            com.tencent.mars.xlog.Log.i(fVar7.f17097b, fVar7.hashCode() + " clearTextureTrash");
            java.util.ArrayList arrayList = (java.util.ArrayList) fVar7.f17099d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.flutter.view.TextureRegistry.SurfaceTextureEntry) it.next()).release();
            }
            arrayList.clear();
        }
        java.lang.String str = this.f578n;
        if (str != null) {
            a(str);
        }
        this.f571d = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (!kotlin.jvm.internal.o.b(call.method, "getPlatformVersion")) {
            result.notImplemented();
            return;
        }
        result.success("Android " + android.os.Build.VERSION.RELEASE);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f573f = binding.getActivity();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onReattachedToActivityForConfigChanges:" + this.f573f);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void onRendered() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "onRendered()");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void pauseRing() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "pauseRing");
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            Ai.d(vx3.b.f441264d);
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void prepareTextures() {
        b13.m mVar;
        b13.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "prepareTextures");
        if (this.f580p || (mVar = this.f577m) == null || (fVar = this.f571d) == null) {
            return;
        }
        fVar.b(mVar);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public java.util.List queryAudioRouteInfos() {
        vq4.z zVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b13.m mVar = this.f577m;
        if (mVar != null && (zVar = mVar.f176373d) != null) {
            for (cv.v0 v0Var : ((vq4.m0) zVar).f439357u.a()) {
                java.lang.String str = v0Var.f222517b;
                if (str == null) {
                    str = "";
                }
                int i17 = v0Var.f222516a;
                arrayList.add(new com.tencent.pigeon.flutter_voip.AudioRouteInfo(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER : com.tencent.pigeon.flutter_voip.AudioDevice.BLUETOOTH : com.tencent.pigeon.flutter_voip.AudioDevice.HEADSET : com.tencent.pigeon.flutter_voip.AudioDevice.EARPIECE : com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER, str));
            }
        }
        return arrayList;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public com.tencent.pigeon.flutter_voip.AudioRouteInfo queryCurrentAudioRouteInfo() {
        cv.v0 v0Var;
        java.lang.String str;
        vq4.z zVar;
        b13.m mVar = this.f577m;
        if (mVar == null || (zVar = mVar.f176373d) == null) {
            v0Var = null;
        } else {
            ((vq4.m0) zVar).f439357u.getClass();
            v0Var = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        }
        if (v0Var == null || (str = v0Var.f222517b) == null) {
            str = "";
        }
        int i17 = v0Var != null ? v0Var.f222516a : -1;
        return new com.tencent.pigeon.flutter_voip.AudioRouteInfo(i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER : com.tencent.pigeon.flutter_voip.AudioDevice.BLUETOOTH : com.tencent.pigeon.flutter_voip.AudioDevice.HEADSET : com.tencent.pigeon.flutter_voip.AudioDevice.EARPIECE : com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER, str);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public long queryGPURating() {
        return rs0.n.f399306d.f();
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean reject() {
        b13.m mVar = this.f577m;
        if (mVar != null) {
            return mVar.f176388s ? mVar.r() : mVar.U();
        }
        return false;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void releaseTexture(long j17) {
        java.lang.Long valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "releaseTexture, textureId:" + j17);
        b13.f fVar = this.f571d;
        if (fVar == null || (valueOf = java.lang.Long.valueOf(j17)) == null || vq4.b0.f439271b) {
            return;
        }
        long longValue = valueOf.longValue();
        x.f fVar2 = fVar.f17098c;
        b13.a aVar = (b13.a) fVar2.c(longValue, null);
        if (aVar != null) {
            d13.c cVar = aVar.f17088c;
            cVar.f225724f = null;
            ((java.util.ArrayList) fVar.f17099d).add(aVar.f17087b);
            cVar.a();
        }
        int b17 = x.e.b(fVar2.f450822e, fVar2.f450824g, valueOf.longValue());
        if (b17 >= 0) {
            java.lang.Object[] objArr = fVar2.f450823f;
            java.lang.Object obj = objArr[b17];
            java.lang.Object obj2 = x.f.f450820h;
            if (obj != obj2) {
                objArr[b17] = obj2;
                fVar2.f450821d = true;
            }
        }
        com.tencent.mars.xlog.Log.i(fVar.f17097b, "release flutter texture " + valueOf);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void reportFps(com.tencent.pigeon.flutter_voip.FpsParams params) {
        kotlin.jvm.internal.o.g(params, "params");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void requestRefreshTextureSize() {
        b13.f fVar = this.f571d;
        if (fVar != null) {
            y03.f fVar2 = fVar.f17100e;
            if (fVar2 != null) {
                c13.b0 b0Var = c13.b0.f37860d;
                ((ku5.t0) ku5.t0.f312615d).B(new c13.x(fVar2));
            }
            y03.f fVar3 = fVar.f17101f;
            if (fVar3 != null) {
                c13.b0 b0Var2 = c13.b0.f37860d;
                ((ku5.t0) ku5.t0.f312615d).B(new c13.x(fVar3));
            }
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void requestRingtoneInfo(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "requestRingtoneInfo: ".concat(username));
        kotlinx.coroutines.l.d(this.f576i, null, null, new a13.n(this, username, null), 3, null);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void requestRingtoneMute(boolean z17) {
        yx3.v Ai;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "requestRingtoneMute: " + z17 + ".value");
        if (j65.e.b() && j65.e.g() && (Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai()) != null) {
            Ai.f467948h = z17;
            yx3.k kVar = Ai.f467943c;
            if (kVar != null) {
                kVar.i(z17);
            }
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void restartRing() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "restartRing");
        b13.m mVar = this.f577m;
        if (mVar != null) {
            mVar.d();
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void resumeRing() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "resumeRing");
        yx3.v Ai = ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Ai();
        if (Ai != null) {
            Ai.d(vx3.b.f441267g);
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean routeToDevice(com.tencent.pigeon.flutter_voip.AudioRouteInfo device) {
        vq4.z zVar;
        kotlin.jvm.internal.o.g(device, "device");
        b13.m mVar = this.f577m;
        if (mVar != null) {
            com.tencent.pigeon.flutter_voip.AudioDevice type = device.getDeviceType();
            kotlin.jvm.internal.o.g(type, "type");
            int i17 = z03.a.f469202a[type.ordinal()];
            cv.v0 v0Var = new cv.v0(i17 != 1 ? i17 != 2 ? i17 != 3 ? 1 : 2 : 3 : 4, null, 0, 6, null);
            mVar.B0(v0Var);
            mVar.z0(v0Var.c(), 19);
        }
        b13.m mVar2 = this.f577m;
        if (mVar2 == null || (zVar = mVar2.f176373d) == null) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.AudioDevice type2 = device.getDeviceType();
        kotlin.jvm.internal.o.g(type2, "type");
        int i18 = z03.a.f469202a[type2.ordinal()];
        ((vq4.m0) zVar).m(new cv.v0(i18 != 1 ? i18 != 2 ? i18 != 3 ? 1 : 2 : 3 : 4, device.getDeviceName(), 0, 4, null));
        return true;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void setMuted(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setMuted(" + z17);
        b13.m mVar = this.f577m;
        if (mVar != null) {
            mVar.K0(z17);
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void setRingtoneSelf(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setRingtoneSelf: ".concat(username));
        kotlinx.coroutines.l.d(this.f576i, null, null, new a13.o(callback, username, null), 3, null);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void setSegmentVirtualBackground(long j17) {
        b13.m mVar = this.f577m;
        if (mVar != null) {
            mVar.o0(7);
        }
        ar4.c.f13401a.b(rh0.b0.values()[(int) j17]);
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void setSpeakerEnabled(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled: " + z17);
        kotlinx.coroutines.l.d(this.f576i, kotlinx.coroutines.q1.f310570c, null, new a13.p(this, z17, null), 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "setSpeakerEnabled ended");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void showNotFriend(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.string.lfi : com.tencent.mm.R.string.lhu;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i17));
        u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo7));
        u1Var.q(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showTalkingUnSafe(java.lang.String r6) {
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
            com.tencent.mars.xlog.Log.i(r3, r2)
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
            com.tencent.mm.protocal.JsapiPermissionWrapper r6 = com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h
            java.lang.String r0 = "hardcode_jspermission"
            r2.putExtra(r0, r6)
            com.tencent.mm.protocal.GeneralControlWrapper r6 = com.tencent.mm.protocal.GeneralControlWrapper.f192175e
            java.lang.String r0 = "hardcode_general_ctrl"
            r2.putExtra(r0, r6)
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 0
            java.lang.String r1 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            j45.l.j(r6, r1, r3, r2, r0)
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a
            db5.f.i(r6)
            goto L93
        L6c:
            java.lang.String r6 = "unsafe talking, showing tip dialog"
            com.tencent.mars.xlog.Log.i(r3, r6)
            com.tencent.mm.ui.widget.dialog.u1 r6 = new com.tencent.mm.ui.widget.dialog.u1
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r6.<init>(r0)
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131778992(0x7f105db0, float:1.9189528E38)
            java.lang.String r0 = r0.getString(r2)
            r6.g(r0)
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 2131778991(0x7f105daf, float:1.9189526E38)
            java.lang.String r0 = r0.getString(r2)
            r6.n(r0)
            r6.q(r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a13.t.showTalkingUnSafe(java.lang.String):void");
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void switchCamera(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCamera, this.roomId:");
        b13.m mVar = this.f577m;
        sb6.append(mVar != null ? java.lang.Integer.valueOf(mVar.f17117z1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        b13.m mVar2 = this.f577m;
        if (mVar2 != null) {
            mVar2.w0(new a13.r(callback));
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void switchCameraOpenStatus(yz5.l callback) {
        dr4.p1 p1Var;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchCameraOpenStatus, this.roomId:");
        b13.m mVar = this.f577m;
        sb6.append(mVar != null ? java.lang.Integer.valueOf(mVar.f17117z1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", sb6.toString());
        final b13.m mVar2 = this.f577m;
        if (mVar2 != null && (p1Var = mVar2.f176375f) != null) {
            yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.d0$$b
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    com.tencent.mm.plugin.voip.model.d0 d0Var = com.tencent.mm.plugin.voip.model.d0.this;
                    d0Var.getClass();
                    if (bool.booleanValue()) {
                        rq4.q qVar = rq4.q.f399067a;
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        rq4.q.f399092z = java.lang.System.currentTimeMillis();
                    } else {
                        long j17 = rq4.q.f399091y;
                        long j18 = rq4.q.f399092z;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        rq4.q.f399091y = j17 + (java.lang.System.currentTimeMillis() - j18);
                        rq4.q.f399092z = 0L;
                    }
                    if (gq4.v.wi().f365984r != 0) {
                        if (bool.booleanValue()) {
                            gq4.v.Bi().f176558a.o(true);
                        } else {
                            gq4.v.Bi().f176558a.o(false);
                        }
                    }
                    d0Var.o0(bool.booleanValue() ? 6 : 5);
                    return null;
                }
            };
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "onSwitchCameraOpenStatus");
            xq4.a aVar = p1Var.f242704c;
            if (aVar != null) {
                if (((zq4.b) aVar).f475050j) {
                    gq4.v.wi().f365976j = true;
                    aVar.f();
                    lVar.invoke(java.lang.Boolean.TRUE);
                } else {
                    gq4.v.wi().f365976j = false;
                    aVar.d();
                    lVar.invoke(java.lang.Boolean.FALSE);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new a13.s(callback));
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public boolean switchToVoiceMode() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "switchToVoiceMode()");
        b13.m mVar = this.f577m;
        if (mVar == null) {
            return false;
        }
        if (gq4.v.Bi().m() != 0) {
            return mVar.C0();
        }
        mVar.f176395y = true;
        return true;
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void toggleSplitScreen() {
        android.app.Activity activity = this.f573f;
        if (activity == null) {
            return;
        }
        if (isScreenSplited()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "merge screen");
            com.tencent.mm.ui.ee.g(activity.getTaskId(), 0);
            com.tencent.mm.ui.fj.a(activity, true, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipPlugin", "split screen");
            com.tencent.mm.ui.ee.g(activity.getTaskId(), 2);
            com.tencent.mm.ui.fj.i(activity, true, true);
        }
    }

    @Override // com.tencent.pigeon.flutter_voip.VoIPPluginApi
    public void updateTextureSize(com.tencent.pigeon.flutter_voip.UpdateTextureSizeParams sizeParam) {
        kotlin.jvm.internal.o.g(sizeParam, "sizeParam");
    }
}
