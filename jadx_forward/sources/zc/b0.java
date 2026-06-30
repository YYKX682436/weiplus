package zc;

/* loaded from: classes11.dex */
public final class b0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f552861d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f552862e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f552863f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f552864g;

    /* renamed from: h, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f552865h;

    /* renamed from: i, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 f552866i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24244x84f3e062 f552867m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.z f552868n = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f552869o = new java.util.LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f552870p;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: checkAndGetLiteAppPath */
    public void mo89800xb98ad5b1(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24238x18d4a33f msg, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65262xb98ad5b1(msg.m89690x74292566(), msg.m89691xad16abb(), msg.m89692xe2b6420(), new zc.z(callback));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: createStore */
    public void mo89801xe1eba545(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24240x6586b079 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String m89718x74292566 = msg.m89718x74292566();
        long m89717x79e4cb68 = msg.m89717x79e4cb68();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65272xc4fb67d3(m89718x74292566, (int) m89717x79e4cb68, msg.m89720x19450b93(), (int) msg.m89719xad9dc583());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: createStoreWithPkgPath */
    public void mo89802x525bd5e6(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24241xa481ed6a msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65273xe9e03674(msg.m89733x74292566(), (int) msg.m89732x79e4cb68(), msg.m89734x1eeeffdb());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: destroyLiteAppView */
    public void mo89803xf42bf7e(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24242xf73983a4 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long m89744xe7b2546 = msg.m89744xe7b2546();
        java.util.Map map = this.f552869o;
        int i17 = (int) m89744xe7b2546;
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = (com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (c3646xcf902238 != null) {
            c3646xcf902238.a();
        }
        map.remove(java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: dispatchStore */
    public long mo89804x81288087(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24243x14ff8537 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65286x88ed7f15(msg.m89757x74292566(), msg.m89756x5c9f19d7(), msg.m89758x29c21c7c());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: genLiteAppUuidAndSessionId */
    public void mo89805xb8e5c4d8(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24253x7627c9d2 msg, yz5.l callback) {
        long m65288x9f34180c;
        java.lang.String sessionId;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo m65438xe4663f0e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65438xe4663f0e(msg.m89792x74292566(), msg.m89793xfb83cb05(), msg.m89794xfb83cc9b());
        if (m65438xe4663f0e != null) {
            m65288x9f34180c = m65438xe4663f0e.f37285xd0ade97c;
            if (m65288x9f34180c != 0) {
                sessionId = m65438xe4663f0e.f37294x243a3e51;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionId, "sessionId");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8(m65288x9f34180c, sessionId))));
            }
        }
        m65288x9f34180c = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65288x9f34180c();
        sessionId = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65290xce8d5c6e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sessionId, "genLiteAppSessionId(...)");
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24252x83616db8(m65288x9f34180c, sessionId))));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: getLiteAppEngineId */
    public long mo89806x89dfd87a() {
        if (this.f552870p == null) {
            this.f552870p = java.lang.Long.valueOf(zc.y.f552911a);
            zc.y.f552911a++;
        }
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "WxaLiteAppWidgetPlugin hash: " + hashCode() + ", getLiteAppEngineId: " + this.f552870p, new java.lang.Object[0]);
        java.lang.Long l17 = this.f552870p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        return l17.longValue();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: init */
    public void mo89807x316510() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.IWxaLiteAppCallback iWxaLiteAppCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37158x1ab9c7d2;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.mo65596xb88c7b75();
        }
        kx5.n.h().i(this.f552863f);
        kx5.n h17 = kx5.n.h();
        int hashCode = hashCode();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f552863f;
        if (c28580x69eec95e != null) {
            h17.f394850g.put(hashCode, c28580x69eec95e);
        } else {
            h17.getClass();
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onAttachedToActivity " + binding.mo137508x19263085() + ' ' + binding.mo137509xed6858b4(), new java.lang.Object[0]);
        this.f552861d = binding.mo137508x19263085();
        this.f552862e = binding.mo137509xed6858b4();
        ((p3325xe03a0797.p3326xc267989b.a0) this.f552868n).U(jz5.f0.f384359a);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onAttachedToEngine " + flutterPluginBinding.m137982x6e669035(), new java.lang.Object[0]);
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        companion.m89820x684369d(m137983x3b5b91dc, this);
        this.f552863f = flutterPluginBinding.m137986xf7af55c8();
        this.f552864g = flutterPluginBinding.m137982x6e669035();
        this.f552865h = flutterPluginBinding.m137983x3b5b91dc();
        this.f552866i = flutterPluginBinding.m137986xf7af55c8().m137439x2173b36a();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f552865h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f2);
        this.f552867m = new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24244x84f3e062(interfaceC28679x1b8c77f2);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromActivity", new java.lang.Object[0]);
        this.f552861d = null;
        this.f552862e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromActivityForConfigChanges", new java.lang.Object[0]);
        this.f552861d = null;
        this.f552862e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromEngine", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f552869o;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p362xadfe2b3.C3646xcf902238) ((java.util.Map.Entry) it.next()).getValue()).a();
        }
        linkedHashMap.clear();
        kx5.n h17 = kx5.n.h();
        h17.f394850g.remove(hashCode());
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = flutterPluginBinding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        companion.m89820x684369d(m137983x3b5b91dc, null);
        this.f552864g = null;
        this.f552865h = null;
        this.f552863f = null;
        this.f552870p = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onReattachedToActivityForConfigChanges " + binding.mo137508x19263085() + ' ' + binding.mo137509xed6858b4(), new java.lang.Object[0]);
        this.f552861d = binding.mo137508x19263085();
        this.f552862e = binding.mo137509xed6858b4();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: publishEventToTopPage */
    public void mo89808x4a281bfe(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24277x176fbee0 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long m89849xe7b2546 = msg.m89849xe7b2546();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65428xcc4d4c8c((int) m89849xe7b2546, (int) msg.m89852x271761b3(), msg.m89851x149f58f(), msg.m89850xfb7e5820());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: publishGlobalEvent */
    public void mo89809x38afe828(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24278xda00a968 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long m89865xe7b2546 = msg.m89865xe7b2546();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65431x659b84b6((int) m89865xe7b2546, (int) msg.m89868x29bd2700(), msg.m89867x149f58f(), msg.m89866xfb7e5820());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: publishGlobalEventToAll */
    public void mo89810xa161dde(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24280xdae18f40 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65434x2ebb8e6c(msg.m89894x149f58f(), msg.m89893xfb7e5820());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: publishGlobalEventToAllByAppId */
    public void mo89811x9e226547(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24279xe93a45e9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65433x5d05e3d5(msg.m89880x74292566(), msg.m89882x149f58f(), msg.m89881xfb7e5820());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: publishGlobalEventToTopPage */
    public void mo89812xa68b2341(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24281x3a64f0fd msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65437xc4376dcf((int) msg.m89906xe7b2546(), msg.m89908x149f58f(), msg.m89907xfb7e5820());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: releaseStore */
    public void mo89813x8a31cd1a(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24282xd0b722f6 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65449x1f6945a8(msg.m89918x74292566());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: showLiteAppView */
    public void mo89814xe2d2949b(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24284x9bdf8c4e msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.y0 a18 = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "showLiteAppView appId: " + msg.m89953x74292566() + " appUuid: " + msg.m89954xe7b2546(), new java.lang.Object[0]);
        java.lang.String m89953x74292566 = msg.m89953x74292566();
        java.lang.String m89959xfb83cb05 = msg.m89959xfb83cb05();
        java.lang.String m89961x750cbf12 = msg.m89961x750cbf12();
        java.lang.String m89963x23a7af9b = msg.m89963x23a7af9b();
        java.lang.String m89960xfb83cc9b = msg.m89960xfb83cc9b();
        java.lang.String m89964x942c4fd = msg.m89964x942c4fd();
        msg.m89967x4510f9c8();
        p3325xe03a0797.p3326xc267989b.l.d(a18, null, null, new zc.a0(this, msg.m89954xe7b2546(), m89953x74292566, m89959xfb83cb05, m89961x750cbf12, m89963x23a7af9b, m89960xfb83cc9b, m89964x942c4fd, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65385xa9637197(m89953x74292566), null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: storeIsAlive */
    public boolean mo89815xb84155a2(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24285x533e716e msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65498x67a6be30(msg.m89976x74292566());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: subscribeStore */
    public void mo89816x58c0e9b7(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24286x81145579 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65502xfc6d8845(msg.m89987x74292566(), msg.m89988x97a2c74c());
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.InterfaceC24254x7f365548
    /* renamed from: unsubscribeStore */
    public void mo89817xcb2f890(com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24288x49556a40 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65508x3680c51e(msg.m90011x74292566(), msg.m90012x97a2c74c());
    }
}
