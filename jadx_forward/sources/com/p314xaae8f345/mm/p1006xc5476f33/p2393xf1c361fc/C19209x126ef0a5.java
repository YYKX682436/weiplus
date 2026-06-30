package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/websearch/SearchResultFinderVideoPlayersManager;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.FlutterSearchFinderVideoPlayerPlugin */
/* loaded from: classes11.dex */
public final class C19209x126ef0a5 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f262946d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f262947e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953 f262948f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f262949g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f262950h = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f262951i = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f262952m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f262953n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f262954o;

    public final void a(zy2.g5 g5Var) {
        g5Var.mo56716x4121a19(true);
        g5Var.mo56709x764d819b(true);
        zy2.g5.u(g5Var, null, 1, null);
        android.view.View mo56698x4ee17f0a = g5Var.mo56698x4ee17f0a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo56698x4ee17f0a, arrayList.toArray(), "com/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo56698x4ee17f0a.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo56698x4ee17f0a, "com/tencent/mm/plugin/websearch/FlutterSearchFinderVideoPlayerPlugin", "playInner", "(Lcom/tencent/mm/plugin/findersdk/api/IBaseFinderVideoView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: createPlayer */
    public void mo74035x55f37afd(com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25264xee5684d2 finderVideoPlayInfo, boolean z17, long j17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderVideoPlayInfo, "finderVideoPlayInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "Create player with nonceId " + finderVideoPlayInfo.m93422xbc613d34() + " and objectId " + finderVideoPlayInfo.m93421x4dbff9e8());
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.x0(finderVideoPlayInfo, j17, this, new java.lang.ref.WeakReference(this), callback, z17, null), 3, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: destroy */
    public void mo74036x5cd39ffa(long j17) {
        java.util.Map map = this.f262949g;
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58801x360802();
            g5Var.mo56716x4121a19(false);
            g5Var.d();
            g5Var.b();
        }
        map.remove(java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("release texture  ");
        java.util.Map map2 = this.f262950h;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        sb6.append(surfaceTextureEntry != null ? java.lang.Long.valueOf(surfaceTextureEntry.id()) : null);
        sb6.append("  nativeHandle=");
        sb6.append(android.opengl.EGL14.eglGetCurrentContext().getNativeHandle());
        sb6.append(" Tid=");
        sb6.append(java.lang.Thread.currentThread().getId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", sb6.toString());
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry2 = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) ((java.util.LinkedHashMap) map2).get(java.lang.Long.valueOf(j17));
        if (surfaceTextureEntry2 != null) {
            surfaceTextureEntry2.mo138094x41012807();
        }
        map2.remove(java.lang.Long.valueOf(j17));
        ((java.util.concurrent.ConcurrentHashMap) this.f262952m).remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: getCurrentPlayMs */
    public long mo74037x3d7f3f1d(long j17) {
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f262949g).get(java.lang.Long.valueOf(j17));
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onAttachedToActivity");
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        this.f262946d = mo137508x19263085;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo137508x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo137508x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf == null || (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onAttachedToEngine");
        this.f262954o = true;
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.Companion.m93446x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f262948f = new com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.C25265xa0a01953(m137983x3b5b91dc2, null, 2, 0 == true ? 1 : 0);
        this.f262947e = binding.m137988x3128f042();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f262946d;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", sb6.toString());
        android.app.Activity activity2 = this.f262946d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activity2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity2 : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this);
        }
        this.f262946d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f262946d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b.Companion.m93446x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(((java.util.LinkedHashMap) this.f262949g).keySet());
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            mo74036x5cd39ffa(((java.lang.Number) it.next()).longValue());
        }
        this.f262947e = binding.m137988x3128f042();
        this.f262948f = null;
        this.f262954o = false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f262946d = binding.mo137508x19263085();
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            this.f262953n = true;
        }
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_STOP) {
            this.f262953n = false;
            java.util.Map map = this.f262952m;
            if (!((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
                for (java.util.Map.Entry entry : ((java.util.concurrent.ConcurrentHashMap) map).entrySet()) {
                    if (((java.lang.Boolean) entry.getValue()).booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "pause when onStop: " + ((java.lang.Number) entry.getKey()).longValue());
                        mo74038x65825f6(((java.lang.Number) entry.getKey()).longValue());
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: pause */
    public void mo74038x65825f6(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "pause: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f262949g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58788x65825f6();
            g5Var.mo56716x4121a19(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f262952m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: play */
    public void mo74039x348b34(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "play: " + j17);
        if (!this.f262953n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "try play when background, playerId: " + j17);
            return;
        }
        java.util.Map map = this.f262952m;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(java.lang.Long.valueOf(j17))) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.concurrent.ConcurrentHashMap) map).get(java.lang.Long.valueOf(j17)), java.lang.Boolean.TRUE)) {
                return;
            }
        }
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f262949g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            a(g5Var);
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Long.valueOf(j17), java.lang.Boolean.TRUE);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: setMute */
    public void mo74040x764d819b(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "setMute: " + j17 + ' ' + z17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f262949g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo56709x764d819b(z17);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2885xf1c361fc.InterfaceC25278x65f7786b
    /* renamed from: stop */
    public void mo74041x360802(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterSearchFinderVideoPlayerPlugin", "stop: " + j17);
        zy2.g5 g5Var = (zy2.g5) ((java.util.LinkedHashMap) this.f262949g).get(java.lang.Long.valueOf(j17));
        if (g5Var != null) {
            g5Var.mo58801x360802();
            g5Var.mo56716x4121a19(false);
            ((java.util.concurrent.ConcurrentHashMap) this.f262952m).put(java.lang.Long.valueOf(j17), java.lang.Boolean.FALSE);
        }
    }
}
