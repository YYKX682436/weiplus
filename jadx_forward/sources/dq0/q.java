package dq0;

/* loaded from: classes7.dex */
public final class q implements com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f323858d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f323859e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e f323860f;

    /* renamed from: g, reason: collision with root package name */
    public final float f323861g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f323862h = new java.lang.ref.WeakReference(null);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f323863i = new java.util.HashMap();

    public q(boolean z17) {
        this.f323858d = z17;
    }

    public final void a(java.lang.String viewId) {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f323863i.get(viewId);
        if (kVar != null && (surfaceProducer = kVar.f323848c) != null) {
            long id6 = surfaceProducer.id();
            if (this.f323858d) {
                com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39 c27672xb7462a39 = (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39) com.p314xaae8f345.p3248x6e8731b.C27980x1de85921.m121408x9cf0d20b().m121421xcf9b80a7();
                if (c27672xb7462a39 != null) {
                    c27672xb7462a39.m119329x3116808c(viewId, (int) id6);
                }
            } else {
                com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e c23976x8577590e = this.f323860f;
                if (c23976x8577590e != null) {
                    c23976x8577590e.m88739x3116808c(viewId, id6, dq0.l.f323853d);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "frameFrameRendered for viewId: ".concat(viewId));
    }

    public final void b(java.lang.String viewGroupId, java.lang.String viewId, cf3.d view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroupId, "viewGroupId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.HashMap hashMap = this.f323863i;
        hashMap.containsKey(viewId);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f323859e;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer m139631xfdf2a2c3 = interfaceC28980x1159d658 != null ? interfaceC28980x1159d658.m139631xfdf2a2c3() : null;
        if (m139631xfdf2a2c3 != null) {
            m139631xfdf2a2c3.mo138097xdd9eabf1(new dq0.m(view));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m139631xfdf2a2c3);
        view.f122451c = m139631xfdf2a2c3.mo138084xcf572877();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBExternalViewStub", "currentSize=(" + view.f122455g + ',' + view.f122456h + "), targetSize=(100, 100)");
        if (100 != view.f122455g || 100 != view.f122456h) {
            view.f122455g = 100;
            view.f122456h = 100;
            if (view.f122452d) {
                jc3.o oVar = view.f122459k;
                if (oVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("canvasEventConsumer");
                    throw null;
                }
                rc3.w0 w0Var = (rc3.w0) oVar;
                w0Var.M(new rc3.l0(w0Var, view.f122458j, 100, 100));
            } else {
                jc3.o oVar2 = view.f122459k;
                if (oVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("canvasEventConsumer");
                    throw null;
                }
                int i17 = view.f122458j;
                android.view.Surface surface = view.f122451c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface);
                ((rc3.w0) oVar2).pg(i17, surface, 100, 100);
                view.f122452d = true;
            }
        }
        hashMap.put(viewId, new dq0.k(viewId, view, m139631xfdf2a2c3, 0L, 0L, 0L, 0L));
        if (this.f323858d) {
            com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39 c27672xb7462a39 = (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39) com.p314xaae8f345.p3248x6e8731b.C27980x1de85921.m121408x9cf0d20b().m121421xcf9b80a7();
            if (c27672xb7462a39 != null) {
                c27672xb7462a39.m119327x3978b1e2(viewGroupId, viewId);
            }
        } else {
            com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e c23976x8577590e = this.f323860f;
            if (c23976x8577590e != null) {
                c23976x8577590e.m88737x3978b1e2(viewGroupId, viewId, dq0.n.f323855d);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "insert viewId: " + viewId + ' ' + this.f323859e);
    }

    public final void c(java.lang.String viewId) {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f323863i.remove(viewId);
        if (kVar != null && (surfaceProducer = kVar.f323848c) != null) {
            surfaceProducer.mo138094x41012807();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "remove viewId: ".concat(viewId));
    }

    public final void d(java.lang.String viewId, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        dq0.k kVar = (dq0.k) this.f323863i.get(viewId);
        if (kVar != null) {
            kVar.f323849d = j17;
            kVar.f323850e = j18;
            kVar.f323851f = j19;
            kVar.f323852g = j27;
        }
        if (this.f323858d) {
            com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39 c27672xb7462a39 = (com.p314xaae8f345.p3133xd0ce8b26.p3172x390bf7.C27672xb7462a39) com.p314xaae8f345.p3248x6e8731b.C27980x1de85921.m121408x9cf0d20b().m121421xcf9b80a7();
            if (c27672xb7462a39 != null) {
                c27672xb7462a39.m119328x68fb707(viewId, (int) j17, (int) j18, (int) j19, (int) j27);
            }
        } else {
            com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e c23976x8577590e = this.f323860f;
            if (c23976x8577590e != null) {
                c23976x8577590e.m88738x68fb707(viewId, j17, j18, j19, j27, dq0.o.f323856d);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "layout viewId: " + viewId + ", offset = (" + j17 + ", " + j18 + "), size = (" + j19 + ", " + j27 + ')');
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x02fb, code lost:
    
        if (r6 != false) goto L48;
     */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022
    /* renamed from: dispatchTouchEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo88729xb864a2b5(java.lang.String r45, java.util.List r46) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq0.q.mo88729xb864a2b5(java.lang.String, java.util.List):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f323862h = new java.lang.ref.WeakReference(binding.m137986xf7af55c8());
        this.f323859e = binding.m137988x3128f042();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        this.f323860f = new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23976x8577590e(m137983x3b5b91dc, null, 2, 0 == true ? 1 : 0);
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.Companion.m88731x97a46f3a(companion, m137983x3b5b91dc2, this, null, 4, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "attachToEngine, engine: " + binding.m137986xf7af55c8());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f323862h.get(), binding.m137986xf7af55c8())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "onDetachedFromEngine invoke, engine is the last engine, status not clear");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushFlutterPlugin.SCL", "onDetachedFromEngine, engine: " + binding.m137986xf7af55c8());
        java.util.HashMap hashMap = this.f323863i;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = ((dq0.k) it.next()).f323848c;
            if (surfaceProducer != null) {
                surfaceProducer.mo138094x41012807();
            }
        }
        hashMap.clear();
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.InterfaceC23973x253c6022.Companion.m88731x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f323859e = null;
        this.f323860f = null;
        this.f323862h.clear();
    }
}
