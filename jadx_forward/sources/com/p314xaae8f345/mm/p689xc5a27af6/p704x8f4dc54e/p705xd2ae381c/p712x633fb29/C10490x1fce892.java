package com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/feature/brandservice/flutter/model/FlutterBizFinderVideoPlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/biz_base/BizFinderVidePlayersManager;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizFinderVideoPlayerPlugin */
/* loaded from: classes11.dex */
public final class C10490x1fce892 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f146777d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f146778e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23455x62fab325 f146779f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f146780g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f146781h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f146782i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f146783m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f146784n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f146785o;

    public final void a(zy2.g5 g5Var) {
        g5Var.mo56716x4121a19(true);
        long mo56687x6ff74db9 = g5Var.mo56687x6ff74db9();
        if (mo56687x6ff74db9 > 0) {
            g5Var.a((mo56687x6ff74db9 * 1.0d) / 1000, false);
        }
        g5Var.mo56709x764d819b(true);
        zy2.g5.u(g5Var, null, 1, null);
        android.view.View mo56698x4ee17f0a = g5Var.mo56698x4ee17f0a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo56698x4ee17f0a, arrayList.toArray(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo56698x4ee17f0a.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo56698x4ee17f0a, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: createPlayer */
    public void mo44064x55f37afd(com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23519x3a66e4f7 finderVideoPlayInfo, boolean z17, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderVideoPlayInfo, "finderVideoPlayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new lx.e0(finderVideoPlayInfo, j17, this, new java.lang.ref.WeakReference(this), callback, z17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: destroy */
    public void mo44065x5cd39ffa(long j17) {
        java.util.Map map = this.f146780g;
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58801x360802();
            g5Var.mo56716x4121a19(false);
            g5Var.d();
            g5Var.b();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release texture  ");
        java.util.Map map2 = this.f146781h;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        sb6.append(surfaceProducer != null ? java.lang.Long.valueOf(surfaceProducer.id()) : null);
        sb6.append("  nativeHandle=");
        sb6.append(android.opengl.EGL14.eglGetCurrentContext().getNativeHandle());
        sb6.append(" Tid=");
        sb6.append(java.lang.Thread.currentThread().getId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", sb6.toString());
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceProducer2 != null) {
            surfaceProducer2.mo138094x41012807();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f146783m).remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: getCurrentPlayMs */
    public long mo44066x3d7f3f1d(long j17) {
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f146780g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            return g5Var.mo56685x3d7f3f1d();
        }
        return 0L;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f146777d = mo137508x19263085;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "onAttachedToEngine");
        this.f146785o = true;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.Companion.m86493x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f146779f = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23455x62fab325(m137983x3b5b91dc2, null, 2, null);
        this.f146778e = binding.m137988x3128f042();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f146777d;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", sb6.toString());
        android.app.Activity activity2 = this.f146777d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity2 : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f146777d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f146777d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08.Companion.m86493x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) this.f146780g).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo44065x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
        this.f146778e = binding.m137988x3128f042();
        this.f146779f = null;
        this.f146785o = false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f146777d = binding.mo137508x19263085();
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            this.f146784n = true;
        }
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
            this.f146784n = false;
            java.util.Map map = this.f146783m;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "pause when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        mo44067x65825f6(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: pause */
    public void mo44067x65825f6(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "pause: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f146780g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58788x65825f6();
            g5Var.mo56716x4121a19(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f146783m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: play */
    public void mo44068x348b34(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "play: " + j17);
        if (!this.f146784n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "try play when background, playerId: " + j17);
            return;
        }
        java.util.Map map = this.f146783m;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Long.valueOf(j17)), java.lang.Boolean.TRUE)) {
                return;
            }
        }
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f146780g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            a(g5Var);
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.InterfaceC23446x65959c08
    /* renamed from: stop */
    public void mo44069x360802(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizFinderVideoPlayerPlugin", "stop: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f146780g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58801x360802();
            g5Var.mo56716x4121a19(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f146783m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }
}
