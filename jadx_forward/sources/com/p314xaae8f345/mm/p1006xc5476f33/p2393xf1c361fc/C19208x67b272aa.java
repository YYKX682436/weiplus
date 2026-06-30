package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/websearch/FlutterSearchFinderLivePlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/websearch/SearchResultFinderLivePlayersManager;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.FlutterSearchFinderLivePlayerPlugin */
/* loaded from: classes11.dex */
public final class C19208x67b272aa implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25251x255f0afa f262937e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f262938f;

    /* renamed from: g, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f262939g;

    /* renamed from: p, reason: collision with root package name */
    public boolean f262945p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f262936d = "MicroMsg.FlutterSearchFinderLivePlayerPlugin";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f262940h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f262941i = new java.util.LinkedHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f262942m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f262943n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f262944o = new java.util.HashSet();

    public final void a(com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39 c25250xe2010b39, mn0.b0 b0Var, long j17) {
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        java.lang.String m93393x90d3d65 = c25250xe2010b39.m93393x90d3d65();
        if (m93393x90d3d65 == null) {
            m93393x90d3d65 = "";
        }
        s40.w0.U9(w0Var, 0L, "", 65, 2, "", true, null, 0L, null, false, false, m93393x90d3d65, null, 0, 10176, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w0(this, j17, b0Var));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592
    /* renamed from: createPlayer */
    public void mo74030x55f37afd(com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25250xe2010b39 finderLivePlayInfo, boolean z17, long j17, yz5.l result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f262938f;
        java.lang.String str = this.f262936d;
        if (abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "create player but activity is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.NullPointerException("activity is null")))));
            return;
        }
        if (this.f262939g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "create player but textureRegistry is null");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.NullPointerException("textureRegistry is null")))));
            return;
        }
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f262938f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf2);
        mn0.b0 wi6 = ((v40.q) q0Var).wi(abstractActivityC21394xb3d2c0cf2);
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = this.f262939g;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = interfaceC28980x1159d658 != null ? interfaceC28980x1159d658.mo138022xdee757ca() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo138022xdee757ca);
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.f411253s, 17);
        ls5.d dVar = yVar.f411340f;
        if (dVar != null) {
            dVar.f402661h = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.r0(this);
        }
        yVar.Q(0);
        android.graphics.SurfaceTexture mo138117x299653ae = mo138022xdee757ca.mo138117x299653ae();
        mo138117x299653ae.setDefaultBufferSize(1920, 1080);
        java.lang.Long m93392x212266bb = finderLivePlayInfo.m93392x212266bb();
        int longValue = m93392x212266bb != null ? (int) m93392x212266bb.longValue() : 0;
        java.lang.Long m93391xe95b76d2 = finderLivePlayInfo.m93391xe95b76d2();
        int longValue2 = m93391xe95b76d2 != null ? (int) m93391xe95b76d2.longValue() : 0;
        nn0.o oVar = ((nn0.i) ((nn0.c) wi6).p()).f420117b;
        if (oVar != null) {
            oVar.le(mo138117x299653ae, longValue, longValue2);
        }
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c c25288xea0efc4c = new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25288xea0efc4c(new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25289x97feeaec(java.lang.Long.valueOf(mo138022xdee757ca.id()), null, null, 6, null), java.lang.Long.valueOf(this.f262942m.incrementAndGet()));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createPlayer: ");
        java.lang.Long m93458xebddad52 = c25288xea0efc4c.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad52);
        sb6.append(m93458xebddad52.longValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        java.util.Map map = this.f262940h;
        java.lang.Long m93458xebddad522 = c25288xea0efc4c.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad522);
        map.put(m93458xebddad522, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1(wi6, finderLivePlayInfo));
        java.util.Map map2 = this.f262941i;
        java.lang.Long m93458xebddad523 = c25288xea0efc4c.m93458xebddad52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad523);
        map2.put(m93458xebddad523, mo138022xdee757ca);
        yVar.J(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v0(this, c25288xea0efc4c));
        result.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c25288xea0efc4c)));
        if (z17) {
            java.lang.Long m93458xebddad524 = c25288xea0efc4c.m93458xebddad52();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m93458xebddad524);
            a(finderLivePlayInfo, wi6, m93458xebddad524.longValue());
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592
    /* renamed from: destroy */
    public void mo74031x5cd39ffa(long j17) {
        mn0.b0 b0Var;
        java.util.Map map = this.f262940h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (v1Var != null && (b0Var = v1Var.f263217a) != null) {
            mn0.b0.C(b0Var, false, false, false, 6, null);
            ((mn0.y) b0Var).w();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.util.Map map2 = this.f262941i;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.mo138094x41012807();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.HashSet) this.f262944o).remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f262943n).remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, "destroy player " + j17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
        this.f262938f = abstractActivityC21394xb3d2c0cf;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? abstractActivityC21394xb3d2c0cf : null;
        if (abstractActivityC21394xb3d2c0cf2 == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf2.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, "onAttachedToEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.Companion.m93407x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        this.f262939g = binding.m137988x3128f042();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f262937e = new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25251x255f0afa(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f262938f;
        sb6.append(abstractActivityC21394xb3d2c0cf != null ? java.lang.Boolean.valueOf(abstractActivityC21394xb3d2c0cf.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, sb6.toString());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f262938f;
        if (!(abstractActivityC21394xb3d2c0cf2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            abstractActivityC21394xb3d2c0cf2 = null;
        }
        if (abstractActivityC21394xb3d2c0cf2 != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf2.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f262938f = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f262938f = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivityForConfigChanges playerKeepers.size = ");
        java.util.Map map = this.f262940h;
        sb6.append(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo74031x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromEngine playerKeepers.size = ");
        java.util.Map map = this.f262940h;
        sb6.append(map.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, sb6.toString());
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) map).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo74031x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592.Companion.m93407x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f262937e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f262938f = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.String str = this.f262936d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            this.f262945p = true;
        }
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
            this.f262945p = false;
            java.util.Map map = this.f262943n;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        mo74034x360802(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592
    /* renamed from: play */
    public void mo74032x348b34(long j17) {
        java.lang.String str = this.f262936d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "play: " + j17);
        if (!this.f262945p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "try play when background, playerId: " + j17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1) ((java.util.LinkedHashMap) this.f262940h).get(java.lang.Long.valueOf(j17));
        if (v1Var != null) {
            ((java.util.HashSet) this.f262944o).add(java.lang.Long.valueOf(j17));
            a(v1Var.f263218b, v1Var.f263217a, j17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592
    /* renamed from: setMute */
    public void mo74033x764d819b(long j17, boolean z17) {
        mn0.b0 b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, "setMute: " + j17 + ' ' + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1) ((java.util.LinkedHashMap) this.f262940h).get(java.lang.Long.valueOf(j17));
        if (v1Var == null || (b0Var = v1Var.f263217a) == null) {
            return;
        }
        ((mn0.y) b0Var).G(z17);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25256x3dc75592
    /* renamed from: stop */
    public void mo74034x360802(long j17) {
        mn0.b0 b0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f262936d, "stop: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1 v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.v1) ((java.util.LinkedHashMap) this.f262940h).get(java.lang.Long.valueOf(j17));
        if (v1Var == null || (b0Var = v1Var.f263217a) == null) {
            return;
        }
        ((java.util.HashSet) this.f262944o).remove(java.lang.Long.valueOf(j17));
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((java.util.concurrent.ConcurrentHashMap) this.f262943n).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
    }
}
