package com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/brandservice/flutter/model/FlutterBizFinderLivePlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/biz_base/BizFinderLivePlayersManager;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderLivePlayerPlugin */
/* loaded from: classes11.dex */
public final class C10489xb9bf491d implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23431x9f40eee8 f146767e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f146768f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f146769g;

    /* renamed from: p, reason: collision with root package name */
    public boolean f146775p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146766d = "MicroMsg.FlutterBizFinderLivePlayerPlugin";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f146770h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f146771i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f146772m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f146773n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f146774o = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final bw5.os0 f146776q = bw5.os0.MMFinder_GetComment_Scene_MPFlowList;

    public final void a(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 c23517x16019274, mn0.b0 b0Var, long j17) {
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.lang.String m86836xb2ccb423 = c23517x16019274.m86836xb2ccb423();
        if (m86836xb2ccb423 == null) {
            m86836xb2ccb423 = "";
        }
        s40.w0.U9(w0Var, 0L, "", 65, 2, "", true, null, 0L, null, false, false, m86836xb2ccb423, null, 0, 10176, null).l().K(new lx.d0(this, j17, b0Var));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080
    /* renamed from: createPlayer */
    public void mo44059x55f37afd(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 finderLivePlayInfo, boolean z17, long j17, yz5.l result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f146768f;
        java.lang.String str = this.f146766d;
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "create player but activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.NullPointerException("activity is null")))));
            return;
        }
        if (this.f146769g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "create player but textureRegistry is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.NullPointerException("textureRegistry is null")))));
            return;
        }
        if (!fp.q.b("live_sdk")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "create player but live_sdk is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.NullPointerException("live_sdk is null")))));
            return;
        }
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f146768f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf2);
        mn0.b0 wi6 = ((v40.q) q0Var).wi(abstractActivityC21394xb3d2c0cf2);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f146769g;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer m139631xfdf2a2c3 = interfaceC28980x1159d658 != null ? interfaceC28980x1159d658.m139631xfdf2a2c3() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m139631xfdf2a2c3);
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.f411253s, 17);
        ls5.d dVar = yVar.f411340f;
        if (dVar != null) {
            dVar.f402661h = new lx.y(this);
        }
        yVar.Q(0);
        java.lang.Long m86835x212266bb = finderLivePlayInfo.m86835x212266bb();
        int longValue = m86835x212266bb != null ? (int) m86835x212266bb.longValue() : 0;
        java.lang.Long m86834xe95b76d2 = finderLivePlayInfo.m86834xe95b76d2();
        m139631xfdf2a2c3.mo138098x76500f83(longValue, m86834xe95b76d2 != null ? (int) m86834xe95b76d2.longValue() : 0);
        android.view.Surface mo138084xcf572877 = m139631xfdf2a2c3.mo138084xcf572877();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo138084xcf572877, "getSurface(...)");
        java.lang.Long m86835x212266bb2 = finderLivePlayInfo.m86835x212266bb();
        int longValue2 = m86835x212266bb2 != null ? (int) m86835x212266bb2.longValue() : 0;
        java.lang.Long m86834xe95b76d22 = finderLivePlayInfo.m86834xe95b76d2();
        ((nn0.c) wi6).v(mo138084xcf572877, longValue2, m86834xe95b76d22 != null ? (int) m86834xe95b76d22.longValue() : 0);
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23515xf59b68be(java.lang.Long.valueOf(m139631xfdf2a2c3.id()), null, null, 6, null), java.lang.Long.valueOf(this.f146772m.incrementAndGet()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPlayer: ");
        java.lang.Long m86784xebddad52 = c23514x26e27c3a.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad52);
        sb6.append(m86784xebddad52.longValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.Map map = this.f146770h;
        java.lang.Long m86784xebddad522 = c23514x26e27c3a.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad522);
        map.put(m86784xebddad522, new lx.a6(wi6, finderLivePlayInfo));
        java.util.Map map2 = this.f146771i;
        java.lang.Long m86784xebddad523 = c23514x26e27c3a.m86784xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad523);
        map2.put(m86784xebddad523, m139631xfdf2a2c3);
        yVar.J(new lx.c0(this, c23514x26e27c3a, finderLivePlayInfo));
        result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c23514x26e27c3a)));
        if (z17) {
            java.lang.Long m86784xebddad524 = c23514x26e27c3a.m86784xebddad52();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad524);
            a(finderLivePlayInfo, wi6, m86784xebddad524.longValue());
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080
    /* renamed from: destroy */
    public void mo44060x5cd39ffa(long j17) {
        mn0.b0 b0Var;
        java.util.Map map = this.f146770h;
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (a6Var != null && (b0Var = a6Var.f403223a) != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
            ((mn0.y) b0Var).w();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.util.Map map2 = this.f146771i;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.HashSet) this.f146774o).remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f146773n).remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, "destroy player " + j17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
        this.f146768f = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? abstractActivityC21394xb3d2c0cf : null;
        if (abstractActivityC21394xb3d2c0cf2 == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf2.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.Companion.m86404x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f146769g = binding.m137988x3128f042();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f146767e = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23431x9f40eee8(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f146768f;
        sb6.append(abstractActivityC21394xb3d2c0cf != null ? java.lang.Boolean.valueOf(abstractActivityC21394xb3d2c0cf.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, sb6.toString());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f146768f;
        if (!(abstractActivityC21394xb3d2c0cf2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            abstractActivityC21394xb3d2c0cf2 = null;
        }
        if (abstractActivityC21394xb3d2c0cf2 != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf2.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f146768f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f146768f = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivityForConfigChanges playerKeepers.size = ");
        java.util.Map map = this.f146770h;
        sb6.append(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo44060x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine playerKeepers.size = ");
        java.util.Map map = this.f146770h;
        sb6.append(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo44060x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080.Companion.m86404x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f146767e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f146768f = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = this.f146766d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            this.f146775p = true;
        }
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
            this.f146775p = false;
            java.util.Map map = this.f146773n;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        mo44062x360802(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080
    /* renamed from: play */
    public void mo44061x348b34(long j17) {
        java.lang.String str = this.f146766d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "play: " + j17);
        if (!this.f146775p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "try play when background, playerId: " + j17);
            return;
        }
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) this.f146770h).get(java.lang.Long.valueOf(j17));
        if (a6Var != null) {
            ((java.util.HashSet) this.f146774o).add(java.lang.Long.valueOf(j17));
            a(a6Var.f403224b, a6Var.f403223a, j17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23436x94246080
    /* renamed from: stop */
    public void mo44062x360802(long j17) {
        mn0.b0 b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f146766d, "stop: " + j17);
        lx.a6 a6Var = (lx.a6) ((java.util.LinkedHashMap) this.f146770h).get(java.lang.Long.valueOf(j17));
        if (a6Var == null || (b0Var = a6Var.f403223a) == null) {
            return;
        }
        ((java.util.HashSet) this.f146774o).remove(java.lang.Long.valueOf(j17));
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((java.util.concurrent.ConcurrentHashMap) this.f146773n).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }
}
