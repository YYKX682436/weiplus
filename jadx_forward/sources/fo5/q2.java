package fo5;

/* loaded from: classes14.dex */
public final class q2 implements jp5.o {

    /* renamed from: d, reason: collision with root package name */
    public static final fo5.q2 f346604d = new fo5.q2();

    /* renamed from: e, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f346605e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f346606f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f346607g;

    /* renamed from: h, reason: collision with root package name */
    public static pi0.n1 f346608h;

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2793xcfa97743.C22882x6b43f41d f346609i;

    /* renamed from: m, reason: collision with root package name */
    public static android.content.Intent f346610m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2793xcfa97743.v2.C22888x6cadc14e f346611n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f346612o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f346613p;

    /* JADX WARN: Type inference failed for: r0v9, types: [com.tencent.mm.voipmp.v2.VoIPMPLauncher$smallViewObserver$1] */
    static {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        f346605e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        f346606f = jz5.h.b(fo5.v1.f346665d);
        f346607g = jz5.h.b(fo5.t1.f346652d);
        f346611n = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.voipmp.v2.VoIPMPLauncher$smallViewObserver$1

            /* renamed from: d, reason: collision with root package name */
            public final jz5.g f295313d = jz5.h.b(fo5.o2.f346586d);

            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                android.os.PowerManager.WakeLock wakeLock;
                p012xc85e97e9.p093xedfae76a.o oVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "on Ilink voip small view state changed " + event);
                p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE;
                jz5.g gVar = this.f295313d;
                if (mVar != event) {
                    if (p012xc85e97e9.p093xedfae76a.m.ON_RESUME != event || (wakeLock = (android.os.PowerManager.WakeLock) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
                        return;
                    }
                    yj0.a.c(wakeLock, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    wakeLock.acquire();
                    yj0.a.f(wakeLock, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                    return;
                }
                android.os.PowerManager.WakeLock wakeLock2 = (android.os.PowerManager.WakeLock) ((jz5.n) gVar).mo141623x754a37bb();
                if (wakeLock2 != null) {
                    yj0.a.c(wakeLock2, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock2.release();
                    yj0.a.f(wakeLock2, "com/tencent/mm/voipmp/v2/VoIPMPLauncher$smallViewObserver$1", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
                pi0.n1 n1Var = fo5.q2.f346608h;
                if (n1Var == null || (oVar = n1Var.f436211e) == null) {
                    return;
                }
                oVar.c(this);
            }
        };
        f346612o = jz5.h.b(fo5.p2.f346599d);
        f346613p = jz5.h.b(fo5.u1.f346655d);
    }

    public static final java.lang.Object b(fo5.q2 q2Var, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        q2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(z17 ? "callee" : "caller");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPMP.Launcher", "createFlutterInstance, currentUsername:" + sb6.toString(), new java.lang.Object[0]);
        java.lang.Object a17 = q2Var.c().a(q2Var, new fo5.z0(), interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    @Override // jp5.o
    public void A2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "closeReceiverBanner");
        fo5.r0 f17 = f();
        if (f17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.t(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void Ad(android.app.Activity activity, yz5.l callback) {
        android.app.Activity activity2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        fo5.r0 f17 = f();
        f17.getClass();
        java.lang.ref.WeakReference weakReference = f17.f346627m;
        if (weakReference != null && (activity2 = (android.app.Activity) weakReference.get()) != null) {
            activity = activity2;
        }
        if (activity != null) {
            ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) activity).mo2507xfe541f5f().e("MicroMsg.VoIPMP.CoreV2", new eo5.b(), new fo5.w(callback)).a("", null);
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("launchFileSelectPage fail, activity is null")))));
        }
    }

    @Override // jp5.o
    public boolean B1() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            return f17.k();
        }
        return true;
    }

    @Override // jp5.o
    public boolean Bh() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            return f17.f346628n.f401749c.f382766b;
        }
        return false;
    }

    @Override // jp5.o
    public void Ee() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.s();
        }
    }

    @Override // jp5.o
    public void Gi(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f346626l.getClass();
            if (nq4.f.f420547a.b() && !nq4.f.f420552f) {
                java.lang.String b17 = nq4.e.f420541a.b();
                if (java.lang.Boolean.valueOf(!(b17 == null || b17.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_CN") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_TW") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "zh_HK") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, "en"))).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "use bluetooth quick connect, block ring");
                    return;
                }
            }
            f17.f346635u = true;
            gp5.e eVar = f17.f346622h;
            boolean a17 = f17.f346621g.a(z17, false);
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPRingtoneController", "startRingWithFloatCard() called with: username = " + username + ", videoCall = " + z17 + ", outCall = false");
            if (eVar.f355997e) {
                return;
            }
            eVar.a(username, z17, false, qo5.b.f447199d, a17);
        }
    }

    @Override // jp5.o
    public boolean H0() {
        fo5.r0 f17 = f();
        if (f17 == null) {
            return false;
        }
        ro5.b bVar = f17.f346630p;
        if (bVar != null) {
            return bVar.H0();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
        throw null;
    }

    @Override // jp5.o
    public void Hd() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.u();
        }
    }

    @Override // jp5.o
    public void Hh(int i17) {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.f2(i17, null), 3, null);
    }

    @Override // jp5.o
    public void I6(int i17) {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.x1(i17, null), 3, null);
    }

    @Override // jp5.o
    public void Jh(java.lang.String createUser, java.util.ArrayList inviteUser, java.lang.String groupID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createUser, "createUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inviteUser, "inviteUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "launhc voip " + createUser + " and " + inviteUser + " and " + groupID);
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.i1(createUser, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        v0Var.j(h(), fo5.j1.f346539a);
        v0Var.g(createUser, inviteUser, false, groupID, (long) co5.i.f125372a.a(), true, fo5.k1.f346545a);
    }

    @Override // jp5.o
    public void K8() {
        if (f() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.v(fo5.b0.f346489a);
        }
    }

    @Override // jp5.o
    public void L5(android.content.Context context, int i17, er4.r roomType, long j17, long j18, java.lang.String username, java.util.ArrayList arrayList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.p1(username, z17, context, roomType, i17, j18, j17, arrayList, null), 3, null);
    }

    @Override // jp5.o
    public void M0() {
        qo5.b.f447196a.c(true);
    }

    @Override // jp5.o
    public void N5(boolean z17) {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.h2(z17, null), 3, null);
    }

    @Override // jp5.o
    public android.app.Activity P9() {
        return f().o();
    }

    @Override // jp5.o
    public java.lang.Object Pi(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return jz5.f0.f384359a;
    }

    @Override // jp5.o
    public void Qb() {
        fo5.r0 f17 = f();
        if (f17 == null || f17.I == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "checkUnLaunchInComingCard, hasAttachEngine:" + f17.f346633s + ", handlerSubCallParam:" + f17.f346615J);
        if (f17.f346633s && !f17.f346615J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMP.CoreV2", "skip handle execution due to engine attached");
            f17.e(f17.f346616b, f17.f346617c == er4.q.MP_ROOM_ROLE_CALLER);
            f17.I = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "delay launch incoming card due to resume");
            yz5.a aVar = f17.I;
            if (aVar != null) {
            }
            f17.I = null;
            f17.f346615J = false;
        }
    }

    @Override // jp5.o
    public void S5(byte[] imageData, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        fo5.r0 f17 = f();
        f17.getClass();
        ro5.b bVar = f17.f346630p;
        if (bVar != null) {
            bVar.v(imageData, i17, i18);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
            throw null;
        }
    }

    @Override // jp5.o
    public boolean Sd() {
        er4.l lVar = f().f346620f;
        return (lVar != null && lVar != er4.l.MAIN_UI_CALL_END) && f().k();
    }

    @Override // jp5.o
    public void Te(boolean z17) {
        qo5.b.f447197b = z17;
    }

    @Override // jp5.o
    public void W2(int i17) {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.z1(i17, null), 3, null);
    }

    @Override // jp5.o
    public void W6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "switchAudioPlayerMute " + z17);
        fo5.r0 f17 = f();
        if (f17 != null && j65.e.b() && j65.e.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "switchAudioPlayerMute " + z17);
            go5.x xVar = f17.f346621g;
            xVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioController", "switchAudioPlayerMute " + z17);
            xVar.f355688g = z17;
            ((go5.c0) xVar.d()).f355659c = z17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jp5.o
    public void Z4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        final fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f346627m = new java.lang.ref.WeakReference(binding.mo137508x19263085());
            final android.app.Activity o17 = f17.o();
            if (o17 != 0) {
                o17.getIntent();
                p012xc85e97e9.p093xedfae76a.y yVar = o17 instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) o17 : null;
                if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                    mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.voipmp.v2.VoIPMPCoreV2$onActivityInit$1

                        /* renamed from: d, reason: collision with root package name */
                        public boolean f295310d;

                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
                        /* renamed from: onCreate */
                        public final void m82956x3e5a77bb() {
                            this.f295310d = true;
                        }

                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                        /* renamed from: onDestroy */
                        public final void m82957xac79a11b() {
                            this.f295310d = false;
                            fo5.r0.this.K = false;
                        }

                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
                        /* renamed from: onPause */
                        public final void m82958xb01dfb57() {
                            iq4.b.f375331a.z();
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
                        
                            if ((r1 != null && r1 == er4.l.MAIN_UI_INVITING) != false) goto L33;
                         */
                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                        /* renamed from: onResume */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void m82959x57429eec() {
                            /*
                                r12 = this;
                                java.lang.String r0 = "MicroMsg.VoIPMP.CoreV2"
                                java.lang.String r1 = "onResume"
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
                                fo5.r0 r1 = fo5.r0.this
                                er4.l r2 = r1.f346620f
                                r3 = 1
                                r4 = 0
                                if (r2 == 0) goto L15
                                er4.l r5 = er4.l.MAIN_UI_CALL_END
                                if (r2 == r5) goto L15
                                r2 = r3
                                goto L16
                            L15:
                                r2 = r4
                            L16:
                                if (r2 != 0) goto L23
                                java.lang.String r1 = "already end"
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
                                android.app.Activity r0 = r2
                                r0.finish()
                                return
                            L23:
                                r1.K = r3
                                java.lang.Class<jp5.o> r0 = jp5.o.class
                                i95.m r1 = i95.n0.c(r0)
                                jp5.o r1 = (jp5.o) r1
                                r1.M0()
                                fo5.r0 r1 = fo5.r0.this
                                er4.r r2 = r1.f346616b
                                er4.r r5 = er4.r.MP_ROOM_TYPE_VIDEO
                                r6 = 0
                                if (r2 != r5) goto L47
                                ro5.b r1 = r1.f346630p
                                if (r1 == 0) goto L41
                                r1.a()
                                goto L47
                            L41:
                                java.lang.String r0 = "renderController"
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
                                throw r6
                            L47:
                                i95.m r1 = i95.n0.c(r0)
                                jp5.o r1 = (jp5.o) r1
                                boolean r1 = r1.a5()
                                if (r1 == 0) goto L65
                                android.app.Activity r1 = r2
                                i95.m r2 = i95.n0.c(r0)
                                java.lang.String r7 = "getService(...)"
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r7)
                                jp5.o r2 = (jp5.o) r2
                                r7 = 2
                                jp5.o.R3(r2, r1, r4, r7, r6)
                                goto L74
                            L65:
                                boolean r1 = r12.f295310d
                                if (r1 == 0) goto L74
                                android.app.Activity r1 = r2
                                i95.m r2 = i95.n0.c(r0)
                                jp5.o r2 = (jp5.o) r2
                                r2.ph(r1, r4)
                            L74:
                                fo5.r0 r1 = fo5.r0.this
                                boolean r1 = r1.r()
                                if (r1 != 0) goto L8b
                                fo5.r0 r1 = fo5.r0.this
                                er4.l r1 = r1.f346620f
                                if (r1 == 0) goto L88
                                er4.l r2 = er4.l.MAIN_UI_INVITING
                                if (r1 != r2) goto L88
                                r1 = r3
                                goto L89
                            L88:
                                r1 = r4
                            L89:
                                if (r1 == 0) goto Lbf
                            L8b:
                                fo5.r0 r1 = fo5.r0.this
                                r1.f346635u = r3
                                fo5.r0 r1 = fo5.r0.this
                                gp5.e r7 = r1.f346622h
                                long r8 = qo5.b.f447199d
                                go5.x r2 = r1.f346621g
                                er4.r r6 = r1.f346616b
                                if (r6 != r5) goto L9d
                                r5 = r3
                                goto L9e
                            L9d:
                                r5 = r4
                            L9e:
                                er4.q r1 = r1.f346617c
                                er4.q r6 = er4.q.MP_ROOM_ROLE_CALLER
                                if (r1 != r6) goto La5
                                goto La6
                            La5:
                                r3 = r4
                            La6:
                                boolean r10 = r2.a(r5, r3)
                                r7.getClass()
                                kotlinx.coroutines.y0 r1 = p3325xe03a0797.p3326xc267989b.z0.b()
                                r2 = 0
                                r3 = 0
                                gp5.d r4 = new gp5.d
                                r11 = 0
                                r6 = r4
                                r6.<init>(r7, r8, r10, r11)
                                r5 = 3
                                r6 = 0
                                p3325xe03a0797.p3326xc267989b.l.d(r1, r2, r3, r4, r5, r6)
                            Lbf:
                                i95.m r0 = i95.n0.c(r0)
                                jp5.o r0 = (jp5.o) r0
                                r0.je()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2793xcfa97743.v2.C22887xda76d171.m82959x57429eec():void");
                        }
                    });
                }
            }
        }
        f346610m = binding.mo137508x19263085().getIntent();
    }

    @Override // jp5.o
    public boolean a5() {
        return f346609i != null;
    }

    public final fo5.x0 c() {
        return (fo5.x0) ((jz5.n) f346607g).mo141623x754a37bb();
    }

    @Override // jp5.o
    public void cb() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "rejectByShortCut");
            if (f17.p()) {
                f17.B = true;
                if (f17.f346640z) {
                    if (f17.f346637w >= 4) {
                        long j17 = f17.f346638x;
                        long j18 = f17.f346639y;
                        long j19 = f17.f346616b.f337699d;
                        boolean a17 = f17.a();
                        boolean z17 = f17.B;
                        boolean z18 = f17.f346640z;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                        c7006x6281fdcd.f143206d = j17;
                        c7006x6281fdcd.f143207e = j18;
                        c7006x6281fdcd.f143208f = (int) j19;
                        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
                        c7006x6281fdcd.f143210h = z17 ? 1 : 0;
                        c7006x6281fdcd.f143211i = z18 ? 6 : 1;
                        c7006x6281fdcd.o();
                        c7006x6281fdcd.k();
                    } else {
                        long j27 = f17.f346638x;
                        long j28 = f17.f346639y;
                        long j29 = f17.f346616b.f337699d;
                        boolean a18 = f17.a();
                        boolean z19 = f17.B;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                        c7006x6281fdcd2.f143206d = j27;
                        c7006x6281fdcd2.f143207e = j28;
                        c7006x6281fdcd2.f143208f = (int) j29;
                        c7006x6281fdcd2.f143209g = a18 ? 1 : 0;
                        c7006x6281fdcd2.f143210h = z19 ? 1 : 0;
                        c7006x6281fdcd2.f143211i = 5;
                        c7006x6281fdcd2.o();
                        c7006x6281fdcd2.k();
                    }
                } else if (f17.f346637w >= 4) {
                    long j37 = f17.f346638x;
                    long j38 = f17.f346639y;
                    long j39 = f17.f346616b.f337699d;
                    boolean a19 = f17.a();
                    boolean z27 = f17.B;
                    boolean z28 = f17.f346640z;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                    c7006x6281fdcd3.f143206d = j37;
                    c7006x6281fdcd3.f143207e = j38;
                    c7006x6281fdcd3.f143208f = (int) j39;
                    c7006x6281fdcd3.f143209g = a19 ? 1 : 0;
                    c7006x6281fdcd3.f143210h = z27 ? 1 : 0;
                    c7006x6281fdcd3.f143211i = z28 ? 6 : 1;
                    c7006x6281fdcd3.o();
                    c7006x6281fdcd3.k();
                } else {
                    long j47 = f17.f346638x;
                    long j48 = f17.f346639y;
                    long j49 = f17.f346616b.f337699d;
                    boolean a27 = f17.a();
                    boolean z29 = f17.B;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                    c7006x6281fdcd4.f143206d = j47;
                    c7006x6281fdcd4.f143207e = j48;
                    c7006x6281fdcd4.f143208f = (int) j49;
                    c7006x6281fdcd4.f143209g = a27 ? 1 : 0;
                    c7006x6281fdcd4.f143210h = z29 ? 1 : 0;
                    c7006x6281fdcd4.f143211i = 2;
                    c7006x6281fdcd4.o();
                    c7006x6281fdcd4.k();
                }
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.n0(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void e9(java.lang.String msgSubType, java.lang.String newxmlMsg, long j17, java.lang.String username, er4.b notifyFrom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSubType, "msgSubType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newxmlMsg, "newxmlMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyFrom, "notifyFrom");
        i();
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        v0Var.j(h(), fo5.c2.f346497a);
        v0Var.z(newxmlMsg, msgSubType, j17, username, notifyFrom, fo5.d2.f346502a);
    }

    public final fo5.r0 f() {
        return (fo5.r0) f346606f.mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    @Override // jp5.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fa(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.q2.fa(java.lang.String, boolean):boolean");
    }

    @Override // jp5.o
    public boolean g3() {
        return a5() || f().K || f().f346628n.f401749c.f382766b;
    }

    @Override // jp5.o
    public void gf() {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.n2(null), 3, null);
    }

    public final er4.x h() {
        er4.i iVar = er4.i.MP_UNKOWN;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
        boolean z17 = false;
        int i17 = g17 != null ? g17.I : 0;
        if (i17 == 1) {
            iVar = er4.i.MP_MALE;
        } else if (i17 == 2) {
            iVar = er4.i.MP_FEMALE;
        }
        er4.x xVar = new er4.x();
        xVar.f337731f = c01.z1.c();
        boolean[] zArr = xVar.f337735m;
        zArr[3] = true;
        xVar.f337732g = iVar;
        zArr[4] = true;
        xVar.f337729d = c01.z1.r();
        zArr[1] = true;
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String r17 = c01.z1.r();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        xVar.f337730e = com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, true, false);
        zArr[2] = true;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c01.z1.g().d1()) && c01.z1.g().I1 != 0) {
            z17 = true;
        }
        xVar.f337733h = z17;
        zArr[5] = true;
        return xVar;
    }

    public final void i() {
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.y0 y0Var = fo5.f3.f346517a;
        fo5.r0 service = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipmpCoreServiceCenter", "bindcoreservice");
        if (fo5.f3.f346519c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.i();
        }
        fo5.f3.f346519c = service;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("voipmp.systemauth", "VoIPMPSystemAuthNativeServiceAndroid launchOnAccountInitialized ...");
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.i1.f258805a = co5.x.f125430a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.a1.f258755a = co5.y.f125431a;
        jz5.g gVar = co5.v.f125420j;
        ((co5.v) ((jz5.n) co5.v.f125420j).mo141623x754a37bb()).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b, "getInstance(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        v0Var.k();
        if (((java.lang.Boolean) ((jz5.n) f346612o).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.f1.f258786a = fo5.b1.f346490a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.d1.f258771a = fo5.c1.f346496a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.e1.f258780a = fo5.d1.f346501a;
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jo5.i.f382483f = context.getApplicationContext();
            p05.a3 a3Var = p05.a3.f431972a;
            a3Var.a();
            java.lang.String str = p05.a3.f431976e;
            boolean a17 = vq4.b0.f520803a.a();
            boolean d17 = vq4.b0.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.f fVar = !a17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.f.VoIPMPDeviceLevelVeryLowEnd : d17 ? com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.f.VoIPMPDeviceLevelHighEnd : com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.f.VoIPMPDeviceLevelLowEnd;
            java.lang.String f17 = a3Var.f(d17 ? rh0.z.f477144e : rh0.z.f477144e);
            if (f17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMP.Launcher", "VoIP settings unavailable, there will be no beauty");
            }
            if (f17 == null) {
                f17 = "";
            }
            v0Var.H(str, f17, fVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "blackscreen: initVoIPMPService: " + this + ", " + f());
    }

    @Override // jp5.o
    public boolean ib() {
        return ((java.lang.Boolean) ((jz5.n) f346613p).mo141623x754a37bb()).booleanValue();
    }

    @Override // jp5.o
    public boolean ie() {
        er4.l lVar;
        fo5.r0 f17 = f();
        return (f17 == null || (lVar = f17.f346620f) == null || lVar == er4.l.MAIN_UI_CALL_END) ? false : true;
    }

    @Override // jp5.o
    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "release account ...");
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.F();
        jz5.g gVar = co5.v.f125420j;
        co5.v vVar = (co5.v) ((jz5.n) co5.v.f125420j).mo141623x754a37bb();
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "VQMManager end ...");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.vqm.b.f258849b.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("vqm", "it is not enable!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.a.f258826b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aVar, "getInstance(...)");
        aVar.c();
        vVar.f125423c = 0L;
        vVar.f125424d = 0L;
        vVar.f125425e = 0L;
        vVar.f125426f = 0L;
        vVar.f125427g = 0L;
        vVar.f125428h = 0L;
        vVar.f125429i = 0L;
    }

    @Override // jp5.o
    public boolean jb(java.lang.String groupname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupname, "groupname");
        if (ie()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.n(groupname, fo5.f1.f346515a);
        return true;
    }

    @Override // jp5.o
    public void je() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "dismissSmallWindow: ");
        com.p314xaae8f345.mm.p2793xcfa97743.C22882x6b43f41d c22882x6b43f41d = f346609i;
        if (c22882x6b43f41d != null) {
            iq4.b.f375331a.f0(c22882x6b43f41d);
        }
        f346609i = null;
        pi0.n1 n1Var = f346608h;
        if (n1Var != null) {
            n1Var.a();
        }
        f346608h = null;
    }

    @Override // jp5.o
    public boolean lh() {
        er4.l lVar = f().f346620f;
        return (lVar != null && lVar == er4.l.MAIN_UI_TALKING) && f().k();
    }

    @Override // jp5.o
    public void m4(com.p314xaae8f345.p2845xc516c4b6.p2883xcfa97743.C25217x98ba1c58 result, boolean z17, android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "launchPreViewPage: filePath=" + result.m93318x5000ed37() + ", fileExt=" + result.m93316xad696cf());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String m93318x5000ed37 = result.m93318x5000ed37();
        if (m93318x5000ed37 == null) {
            m93318x5000ed37 = "";
        }
        linkedHashMap.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, m93318x5000ed37);
        java.lang.String m93316xad696cf = result.m93316xad696cf();
        if (m93316xad696cf == null) {
            m93316xad696cf = "";
        }
        linkedHashMap.put("fileExt", m93316xad696cf);
        java.lang.String m93317x5000039d = result.m93317x5000039d();
        linkedHashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, m93317x5000039d != null ? m93317x5000039d : "");
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.n1(linkedHashMap, z17, activity, null), 3, null);
    }

    @Override // jp5.o
    public void mc(java.lang.String username, er4.r roomType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        qo5.b bVar = qo5.b.f447196a;
        boolean z17 = true;
        boolean z18 = roomType == er4.r.MP_ROOM_TYPE_VIDEO;
        if (roomType != er4.r.MP_ROOM_TYPE_TRANS_MUTLTI && roomType != er4.r.MP_ROOM_TYPE_MULTI_TALK) {
            z17 = false;
        }
        bVar.d(username, z18, z17, false);
    }

    @Override // jp5.o
    public void mg() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            boolean z17 = f17.f346628n.f401749c.f382766b;
            boolean a57 = ((jp5.o) i95.n0.c(jp5.o.class)).a5();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on resume page, hasInComingCard:");
            sb6.append(f17.I != null);
            sb6.append(", isCardModeShow:");
            sb6.append(z17);
            sb6.append(", isFloatUIVisible:");
            sb6.append(a57);
            sb6.append(", resumingPage:");
            sb6.append(f17.f346632r);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
            if (z17 || a57 || f17.f346632r) {
                return;
            }
            i95.m c17 = i95.n0.c(jp5.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
            f17.f346632r = true;
        }
    }

    @Override // jp5.o
    public void n2(int i17) {
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.b2(i17, null), 3, null);
    }

    @Override // jp5.o
    public void ph(android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.m1(z17, context, null), 3, null);
    }

    @Override // jp5.o
    /* renamed from: reportIDKey */
    public void mo129946xf0018e90(long j17, long j18, long j19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "reportIDKey() called with: id = " + j17 + ", key = " + j18 + ", value = " + j19);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, false);
    }

    @Override // jp5.o
    public void ti() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "acceptByShortCut");
            if (f17.p()) {
                f17.B = true;
                long j17 = f17.f346638x;
                long j18 = f17.f346639y;
                long j19 = f17.f346616b.f337699d;
                boolean a17 = f17.a();
                boolean z17 = f17.B;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
                c7006x6281fdcd.f143206d = j17;
                c7006x6281fdcd.f143207e = j18;
                c7006x6281fdcd.f143208f = (int) j19;
                c7006x6281fdcd.f143209g = a17 ? 1 : 0;
                c7006x6281fdcd.f143210h = z17 ? 1 : 0;
                c7006x6281fdcd.f143211i = 0;
                c7006x6281fdcd.o();
                c7006x6281fdcd.k();
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fo5.i(f17, null), 3, null);
        }
    }

    @Override // jp5.o
    public void u4(java.lang.String createUser, java.util.ArrayList inviteUser, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createUser, "createUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inviteUser, "inviteUser");
        i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "launch voip " + createUser + " and " + z17);
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.q1(createUser, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        v0Var.j(h(), fo5.r1.f346641a);
        v0Var.g(createUser, inviteUser, z17, "", (long) co5.i.f125372a.a(), false, fo5.s1.f346647a);
    }

    @Override // jp5.o
    public void ug(android.content.res.Configuration configuration) {
        io5.e eVar = f().f346631q;
        eVar.e();
        eVar.b();
    }

    @Override // jp5.o
    public void v1() {
        fo5.r0 f17 = f();
        if (f17 != null) {
            f17.f346627m = null;
        }
        f346610m = null;
    }

    @Override // jp5.o
    public void ve(android.content.Context context, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPMP.Launcher", "generateTalkingIntent", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149651e = -1;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode backgroundMode = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28542xca5fdcd3.BackgroundMode.opaque;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundMode, "<set-?>");
        c10716x931597c6.f149652f = backgroundMode;
        c10716x931597c6.f149658o = false;
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.a1(callback, context, c10716x931597c6, null), 3, null);
    }

    @Override // jp5.o
    public void we(er4.r roomType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomType, "roomType");
        p3325xe03a0797.p3326xc267989b.l.d(f346605e, null, null, new fo5.h1(roomType, null), 3, null);
    }

    @Override // jp5.o
    public java.lang.Object x4(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "callEnd release flutter");
        je();
        y9();
        java.lang.Object b17 = c().b(this, fo5.y0.f346686d, interfaceC29045xdcb5ca57);
        return b17 == pz5.a.f440719d ? b17 : jz5.f0.f384359a;
    }

    @Override // jp5.o
    public void y9() {
        java.lang.Object m143895xf1229813;
        qo5.b bVar = qo5.b.f447196a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.VoIPMPVoIPNotificationHelper", "unbindService: isBindVoIPForegroundService " + qo5.b.f447197b, new java.lang.Object[0]);
        if (fp.h.c(26)) {
            qo5.b.f447198c = null;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ServiceC18941x53733812.class));
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPVoIPNotificationHelper", "unbindService: unbind error ", m143898xd4a2fc34);
                m143895xf1229813 = java.lang.Boolean.TRUE;
            }
            qo5.b.f447197b = ((java.lang.Boolean) m143895xf1229813).booleanValue();
        }
    }

    @Override // jp5.o
    public void zi(java.lang.String toUser, boolean z17, int i17, long j17, long j18, long j19, int i18) {
        java.lang.String string;
        boolean z18;
        long j27;
        long j28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "insertMsg() called with: toUser = " + toUser + ", caller = " + z17 + ", roomType = " + i17 + ", timeInSec = " + j17 + ", inviteId = " + j18 + ", roomId = " + j19 + ", msgType = " + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ho5.c.f364435a;
        int i19 = (int) j17;
        long j29 = (long) i18;
        ho5.a aVar = (ho5.a) ho5.c.f364436b.get((int) j29);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPBubbleHelper", "insertMsg: can not get msgInfo for type " + j29);
            return;
        }
        if (i17 > 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPBubbleHelper", "insertMsg: unknown room type");
            return;
        }
        boolean z19 = i17 == 1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.e1(c01.w9.o(toUser));
        f9Var.m124850x7650bebc(50);
        f9Var.d1(z19 ? "voip_content_video" : "voip_content_voice");
        f9Var.u1(toUser);
        f9Var.j1(z17 ? 1 : 0);
        f9Var.r1(aVar.f364431d ? 3 : 6);
        if (aVar.f364432e && i19 > 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int i27 = aVar.f364429b;
            java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i19 / 60), java.lang.Integer.valueOf(i19 % 60)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            string = context.getString(i27, format);
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(aVar.f364430c);
        }
        f9Var.u3(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0 j0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.f258215a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0(j19, 0L, j18, toUser, z19, z17);
        synchronized (j0Var) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.f258218d;
            reentrantLock.lock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg() called with: voipInfo = " + k0Var + ", msgInfo = " + f9Var);
            dm.sb f17 = j0Var.f(k0Var);
            if (f17 == null) {
                z18 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.p(k0Var, true);
                f17 = j0Var.f(k0Var);
            } else {
                z18 = true;
            }
            if (f17 == null || f17.L0() != 4) {
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg: already has bubble msg");
                reentrantLock.unlock();
                j28 = f17.G0();
            } else {
                if (f17 != null) {
                    j27 = j0Var.l(f17, f9Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPBubbleHelper", "insertILinkVoIPMsg: get bubble info error");
                    j27 = 0;
                }
                reentrantLock.unlock();
                j28 = j27;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPBubbleHelper", "innerInsertMsg: insert msg result " + j28);
    }
}
