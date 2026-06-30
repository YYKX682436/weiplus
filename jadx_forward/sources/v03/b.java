package v03;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, t03.g, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, s03.e, s03.f {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f513832d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f513833e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final c06.e f513834f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 f513835g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink f513836h;

    /* renamed from: i, reason: collision with root package name */
    public nk4.s f513837i;

    /* renamed from: m, reason: collision with root package name */
    public f25.l0 f513838m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f513839n;

    public b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f513834f = c06.f.a(android.os.SystemClock.elapsedRealtime());
    }

    @Override // s03.f
    public void L(java.lang.String str, long j17, long j18, long j19) {
        s03.f fVar;
        java.lang.ref.WeakReference weakReference = this.f513839n;
        if (weakReference == null || (fVar = (s03.f) weakReference.get()) == null) {
            return;
        }
        fVar.L(str, j17, j18, j19);
    }

    public final t03.k0 a(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var != null) {
            return k0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterThumbPlayerPlugin", "getPlayer playerId:" + j17 + " player is null");
        return null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.Companion.m89044x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f513832d = flutterPluginBinding.m137988x3128f042();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(flutterPluginBinding.m137983x3b5b91dc(), "tp_player/event");
        this.f513835g = c28681x6bf9b529;
        c28681x6bf9b529.m138415x95b45268(new v03.a(this));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa.Companion.m89044x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = this.f513835g;
        if (c28681x6bf9b529 != null) {
            c28681x6bf9b529.m138415x95b45268(null);
        }
        java.util.HashMap hashMap = this.f513833e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((t03.k0) ((java.util.Map.Entry) it.next()).getValue()).e();
        }
        hashMap.clear();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpAddEffect */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo89007xb692fe76(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24099x1cc123e4 r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v03.b.mo89007xb692fe76(com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect):boolean");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpClearEffect */
    public boolean mo89008x5d51a222(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496000i.f510726b.f();
        k0Var.f496006r.clear();
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpGetFeedbackInfo */
    public com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24054x10234abf mo89009xfb6c6e2d(long j17) {
        com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24054x10234abf p17;
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFeedbackInfo ");
        t03.r0 r0Var = k0Var.f496001m;
        sb6.append((r0Var == null || (p17 = r0Var.p()) == null) ? null : p17.m89001x9616526c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, sb6.toString());
        t03.r0 r0Var2 = k0Var.f496001m;
        if (r0Var2 != null) {
            return r0Var2.p();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpGetPlayerContext */
    public com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24095x17c57272 mo89010xbe67fa74(long j17) {
        return null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpGetPlayerState */
    public long mo89011x44bff696(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return 0L;
        }
        return k0Var.f496001m != null ? r2.v(r2.f390112d) : 0;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpGetVideoSize */
    public com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24109x243dec81 mo89012xa7dad02(long j17) {
        t03.r0 r0Var;
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        jz5.l lVar = null;
        if (k0Var != null && (r0Var = k0Var.f496001m) != null) {
            kk4.c cVar = r0Var.f390110b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar != null ? ((kk4.f0) cVar).mo100929x8d5c7601() : 0);
            kk4.c cVar2 = r0Var.f390110b;
            lVar = new jz5.l(valueOf, java.lang.Integer.valueOf(cVar2 != null ? ((kk4.f0) cVar2).mo100928x463504c() : 0));
        }
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24109x243dec81(java.lang.Long.valueOf(lVar != null ? ((java.lang.Number) lVar.f384366d).intValue() : 0), java.lang.Long.valueOf(lVar != null ? ((java.lang.Number) lVar.f384367e).intValue() : 0));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlaySetScaleType */
    public boolean mo89013x9271552(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24100x1a34bc0d arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89133xebddad52()));
        if (k0Var == null) {
            return false;
        }
        int m89134x8f7ec8ee = (int) arg.m89134x8f7ec8ee();
        um5.p pVar = k0Var.f496000i;
        pVar.f510714y = m89134x8f7ec8ee;
        xm5.b.c(pVar.f510709t, "setScaleType:" + m89134x8f7ec8ee, new java.lang.Object[0]);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerCreate */
    public long mo89014x912543d9(long j17, java.util.Map map) {
        java.util.HashMap hashMap;
        int intValue;
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerCreate mediaType:" + j17 + " reporter:" + this.f513837i);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f513832d;
        if (interfaceC28980x1159d658 == null) {
            return 0L;
        }
        c06.e eVar = this.f513834f;
        long f17 = eVar.f();
        while (true) {
            hashMap = this.f513833e;
            if (!hashMap.containsKey(java.lang.Long.valueOf(f17))) {
                break;
            }
            f17 = eVar.f();
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer m139631xfdf2a2c3 = interfaceC28980x1159d658.m139631xfdf2a2c3();
        if (m139631xfdf2a2c3 == null) {
            return 0L;
        }
        t03.k0 k0Var = new t03.k0(m139631xfdf2a2c3, this, this);
        nk4.s sVar = this.f513837i;
        k0Var.f496008t = sVar;
        f25.l0 l0Var = null;
        if (sVar != null) {
            if (map != null) {
                try {
                    java.lang.Object obj2 = map.get("commentScene");
                    if (obj2 != null) {
                        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
                        if (num != null) {
                            intValue = num.intValue();
                            if (map != null || (obj = map.get("contextID")) == null || (r10 = obj.toString()) == null) {
                                java.lang.String str = "flutter@" + f17 + '@' + k0Var.f496008t;
                            }
                            ((kw2.m0) sVar).K(intValue, str);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerCreate error.");
                }
            }
            intValue = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74064x8a36b1f0;
            if (map != null) {
            }
            java.lang.String str2 = "flutter@" + f17 + '@' + k0Var.f496008t;
            ((kw2.m0) sVar).K(intValue, str2);
        }
        f25.l0 l0Var2 = this.f513838m;
        if (l0Var2 != null) {
            l0Var = new f25.l0(l0Var2.f340637a + '_' + f17, l0Var2.f340638b);
        }
        k0Var.f496009u = l0Var;
        hashMap.put(java.lang.Long.valueOf(f17), k0Var);
        return f17;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerGetPlayRange */
    public com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24098x2e60cac0 mo89015x418458d0(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24098x2e60cac0(-1L, -1L);
        }
        t03.r0 r0Var = k0Var.f496001m;
        return new com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24098x2e60cac0(r0Var != null ? r0Var.C : -1L, r0Var != null ? r0Var.D : -1L);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerInit */
    public long mo89016x94461b2d(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24096x43162713 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerInit playerId:" + arg.m89077xebddad52() + ", width:" + arg.m89078x755bd410() + ", height:" + arg.m89076x1c4fb41d());
        long m89077xebddad52 = arg.m89077xebddad52();
        long m89078x755bd410 = arg.m89078x755bd410();
        long m89076x1c4fb41d = arg.m89076x1c4fb41d();
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(m89077xebddad52));
        if (k0Var == null) {
            return 0L;
        }
        int i17 = (int) m89078x755bd410;
        int i18 = (int) m89076x1c4fb41d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "init: [" + i17 + ',' + i18 + ']');
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = k0Var.f495995d;
        surfaceProducer.mo138098x76500f83(i17, i18);
        android.view.Surface mo138084xcf572877 = surfaceProducer.mo138084xcf572877();
        um5.p pVar = k0Var.f496000i;
        pVar.e(mo138084xcf572877, i17, i18);
        pVar.n(k0Var);
        return k0Var.f495999h;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerPause */
    public boolean mo89017xf4da3379(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPause playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "pause");
        k0Var.f496005q = false;
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            kk4.b.i(r0Var, false, z17, 1, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerPlay */
    public boolean mo89018x94494151(long j17) {
        t03.e eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPlay playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "start");
        k0Var.f496005q = true;
        if (!k0Var.f496003o && (eVar = k0Var.f496002n) != null) {
            pm0.v.X(new t03.d(eVar));
        }
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            r0Var.O();
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerPrepare */
    public boolean mo89019x433ac5ca(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPrepare playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "prepare");
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            kk4.b.a(r0Var, null, 1, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSeek */
    public boolean mo89020x944a8495(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24101x1befe27b arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        long m89146xebddad52 = arg.m89146xebddad52();
        long m89147x31040049 = arg.m89147x31040049();
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(m89146xebddad52));
        if (k0Var == null) {
            return false;
        }
        int i17 = (int) m89147x31040049;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "seek:" + i17);
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        kk4.b.f(r0Var, i17, true, null, 4, null);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetLoop */
    public boolean mo89021xcc81aee9(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24102x504985cf arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89160xebddad52()));
        if (k0Var == null) {
            return false;
        }
        boolean m89159xfb822f1a = arg.m89159xfb822f1a();
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.A(m89159xfb822f1a);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetMediaInfo */
    public boolean mo89022x8e10318d(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24103xc311f573 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89187xebddad52()));
        if (k0Var == null) {
            return false;
        }
        java.lang.String m89185x75e04be9 = arg.m89185x75e04be9();
        java.lang.String m89186xfb83cc9b = arg.m89186xfb83cc9b();
        java.lang.String m89191xb5887639 = arg.m89191xb5887639();
        long m89195x8d5c7601 = arg.m89195x8d5c7601();
        long m89194x463504c = arg.m89194x463504c();
        boolean m89197x7b0e8c61 = arg.m89197x7b0e8c61();
        dk4.a aVar = new dk4.a(m89185x75e04be9, m89186xfb83cc9b, m89191xb5887639, (int) m89195x8d5c7601, (int) m89194x463504c);
        aVar.f315999c = arg.m89192x41694f40();
        aVar.f316000d = arg.m89183x1e2296db();
        aVar.f316001e = m89197x7b0e8c61;
        aVar.f315997a = 2;
        aVar.f315998b = arg.m89184x432e8489();
        aVar.f316003g = arg.m89193x36bbd779();
        aVar.f316006j = arg.m89188x4eae2065();
        aVar.f316004h = arg.m89189xd93f812f();
        aVar.f316005i = arg.m89190x8c50ae0a();
        aVar.f316014r = arg.m89184x432e8489();
        int i17 = t03.k0.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "setMediaInfo:" + aVar);
        k0Var.d();
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            r0Var.G(new t03.n(k0Var));
        }
        t03.r0 r0Var2 = k0Var.f496001m;
        if (r0Var2 != null) {
            r0Var2.B(aVar);
        }
        t03.r0 r0Var3 = k0Var.f496001m;
        if (r0Var3 != null) {
            r0Var3.f390118j = true;
        }
        android.view.Surface surface = k0Var.f496004p;
        if (surface != null && r0Var3 != null) {
            r0Var3.J(surface, k0Var.f496005q);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetMediaProto */
    public boolean mo89023x345a98e9(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24104xa57efcf params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMediaProto playerId:" + params.m89211xebddad52());
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(params.m89211xebddad52()));
        if (k0Var == null) {
            return false;
        }
        u03.a mediaType = u03.a.m167294xcee59d22()[(int) params.m89210x7f025288()];
        byte[] mediaProto = params.m89209x610c705a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaProto, "mediaProto");
        java.lang.String str = k0Var.f495998g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setMediaProto");
        k0Var.d();
        f25.l0 l0Var = k0Var.f496009u;
        if (l0Var != null && !k0Var.f496003o) {
            k0Var.f496002n = new t03.e(new java.lang.ref.WeakReference(k0Var), l0Var);
        }
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            r0Var.G(new t03.o(k0Var));
        }
        t03.r0 r0Var2 = k0Var.f496001m;
        if (r0Var2 != null) {
            r0Var2.F(new t03.p(k0Var));
        }
        t03.r0 r0Var3 = k0Var.f496001m;
        if (r0Var3 != null) {
            r0Var3.f496041e0 = mediaType;
        }
        if (r0Var3 != null) {
            r0Var3.f496042f0 = mediaProto;
        }
        if (r0Var3 != null) {
            r0Var3.f390118j = true;
        }
        android.view.Surface surface = k0Var.f496004p;
        if (surface != null && r0Var3 != null) {
            r0Var3.J(surface, k0Var.f496005q);
        }
        if (params.m89212x867a3149() > 0) {
            int m89212x867a3149 = (int) params.m89212x867a3149();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "setPlayStartSeek:" + m89212x867a3149);
            t03.r0 r0Var4 = k0Var.f496001m;
            if (r0Var4 != null) {
                r0Var4.P = m89212x867a3149;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetMute */
    public boolean mo89024xcc823a5e(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24105x7faee584 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMute mute:" + arg.m89223xfb82ba8f());
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89224xebddad52()));
        if (k0Var == null) {
            return false;
        }
        k0Var.f(arg.m89223xfb82ba8f(), false);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetPlayRange */
    public boolean mo89025x9dd81944(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24106x31a4f7ea arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89237xebddad52()));
        if (k0Var == null) {
            return false;
        }
        long m89238x6bb2831f = arg.m89238x6bb2831f();
        long m89236x606f7358 = arg.m89236x606f7358();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "setPlayRange:[" + m89238x6bb2831f + ", " + m89236x606f7358 + ']');
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.H(m89238x6bb2831f, m89236x606f7358);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPlayerSetStreamType */
    public boolean mo89026x7a58735f(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24107x8f2999c5 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetStreamType streamType:" + arg.m89250xa70a4ad0());
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89249xebddad52()));
        if (k0Var == null) {
            return false;
        }
        int m89250xa70a4ad0 = (int) arg.m89250xa70a4ad0();
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.F = m89250xa70a4ad0;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpPreload */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo89027xf1c2f3ed(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24097x8f724772 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = new com.tencent.mm.protocal.protobuf.FinderObject
            r0.<init>()
            byte[] r1 = r5.m89090x610c705a()
            r2 = 0
            if (r1 != 0) goto L13
        L11:
            r0 = r2
            goto L24
        L13:
            r0.mo11468x92b714fd(r1)     // Catch: java.lang.Exception -> L17
            goto L24
        L17:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r1, r0)
            goto L11
        L24:
            if (r0 != 0) goto L2e
            java.lang.String r5 = "MicroMsg.FlutterThumbPlayerPlugin"
            java.lang.String r0 = "null finder object"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
            return
        L2e:
            java.lang.Class<zy2.a7> r1 = zy2.a7.class
            i95.m r1 = i95.n0.c(r1)
            zy2.a7 r1 = (zy2.a7) r1
            long r2 = r5.m89089x8fadefe3()
            int r5 = (int) r2
            r2 = 0
            com.tencent.mm.plugin.finder.service.l2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2) r1
            r1.Bi(r0, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v03.b.mo89027xf1c2f3ed(com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpRelease */
    public boolean mo89028x45bfadeb(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpRelease playerId:" + j17);
        java.util.HashMap hashMap = this.f513833e;
        t03.k0 k0Var = (t03.k0) hashMap.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.e();
        hashMap.remove(java.lang.Long.valueOf(j17));
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpRemoveEffect */
    public boolean mo89029x7010b3d1(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24099x1cc123e4 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89121xebddad52()));
        if (k0Var == null) {
            return false;
        }
        uq5.y yVar = (uq5.y) k0Var.f496006r.get(java.lang.Long.valueOf(arg.m89117x3f38e002()));
        if (yVar == null) {
            return false;
        }
        k0Var.f496000i.f510726b.o(yVar);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetInterruptedWhenBackground */
    public void mo89030xcc944144(long j17, boolean z17) {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetOnFirstFrameRenderedListener */
    public boolean mo89031x78e2c7eb(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496012x = new t03.x(j17, k0Var);
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.E(new t03.y(k0Var));
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetOnPlayerHideBufferingListener */
    public boolean mo89032x6cb17cee(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496014z = new t03.r(k0Var, j17);
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.f390130v = new t03.s(k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetOnPlayerShowBufferingListener */
    public boolean mo89033xb8364c93(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496013y = new t03.u(k0Var, j17);
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.f390129u = new t03.v(k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetOnPlayerStateChangeListener */
    public boolean mo89034x685a958f(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.A = new t03.e0(k0Var, j17);
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        r0Var.K = new t03.f0(k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetOnPreparedListener */
    public boolean mo89035x43b42ef6(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496007s = new t03.a0(j17, k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetPlayCompletedListener */
    public boolean mo89036xd6cfaaa5(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f496010v = new t03.h0(j17, k0Var);
        return false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetPlaySpeed */
    public boolean mo89037xa6cb1fcd(long j17, double d17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var == null) {
            return true;
        }
        float f17 = (float) d17;
        r0Var.f390120l = f17;
        kk4.c cVar = r0Var.f390110b;
        if (cVar == null) {
            return true;
        }
        cVar.mo100967xd079f5a(f17);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpSetProgressListener */
    public boolean mo89038x13373a67(long j17) {
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            r0Var.I(new t03.j0(j17, k0Var), 400L);
        }
        k0Var.f496011w = new t03.c0(j17, k0Var);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpStop */
    public boolean mo89039xcc43ec9e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpStop playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "stop");
        k0Var.f496005q = false;
        t03.r0 r0Var = k0Var.f496001m;
        if (r0Var != null) {
            r0Var.mo143591x360802();
        }
        t03.e eVar = k0Var.f496002n;
        if (eVar == null) {
            return true;
        }
        pm0.v.X(new t03.b(eVar));
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpUpdateDisplaySize */
    public boolean mo89040x3e0afc3e(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24108xa9e6dd2d arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpUpdateDisplaySize playerId:" + arg.m89265xebddad52() + ", width:" + arg.m89266x755bd410() + ", height:" + arg.m89264x1c4fb41d());
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89265xebddad52()));
        if (k0Var == null) {
            return false;
        }
        int m89266x755bd410 = (int) arg.m89266x755bd410();
        int m89264x1c4fb41d = (int) arg.m89264x1c4fb41d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "updateRenderSize: [" + m89266x755bd410 + ',' + m89264x1c4fb41d + ']');
        k0Var.f495995d.mo138098x76500f83(m89266x755bd410, m89264x1c4fb41d);
        k0Var.f496000i.j(m89266x755bd410, m89264x1c4fb41d);
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpUpdateEffect */
    public boolean mo89041x6ae3ec56(com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.C24099x1cc123e4 arg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(arg.m89121xebddad52()));
        if (k0Var == null) {
            return false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2863x1e0b88ad.InterfaceC24056xa4a87ffa
    /* renamed from: tpUpdateExtraInfo */
    public void mo89042x3a18fff9(long j17, java.util.Map extraInfo) {
        nk4.s sVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        t03.k0 k0Var = (t03.k0) this.f513833e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null || (sVar = k0Var.f496008t) == null) {
            return;
        }
        kw2.m0 m0Var = (kw2.m0) sVar;
        for (java.util.Map.Entry entry : extraInfo.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (str != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m0Var.f394597i;
                if (value != null) {
                    concurrentHashMap.put(str, value);
                } else {
                    concurrentHashMap.remove(str);
                }
            }
        }
    }
}
