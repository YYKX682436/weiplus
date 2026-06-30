package com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/flutter/plugin/LVNativePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Landroidx/lifecycle/v;", "Lcom/tencent/pigeon/mega_video/MegaVideoNativeApi;", "Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin */
/* loaded from: classes10.dex */
public final class C15549xc1495cd4 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f218829d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f218830e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f218831f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.BroadcastReceiver f218832g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24446x57409d1a f218833h;

    /* renamed from: i, reason: collision with root package name */
    public float f218834i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15550xf4f8d11d f218835m = new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$lifecycleObserver$1
        @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
        /* renamed from: onPause */
        public void mo7796xb01dfb57(p012xc85e97e9.p093xedfae76a.y owner) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
            com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4 c15549xc1495cd4 = com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4.this;
            c15549xc1495cd4.getClass();
            try {
                android.content.BroadcastReceiver broadcastReceiver = c15549xc1495cd4.f218832g;
                if (broadcastReceiver != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(broadcastReceiver);
                }
                c15549xc1495cd4.f218832g = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "did stop observing volume change");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LVNativePlugin", "failed to stop observing volume");
            }
        }

        @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
        /* renamed from: onResume */
        public void mo7055x57429eec(p012xc85e97e9.p093xedfae76a.y owner) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
            final com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4 c15549xc1495cd4 = com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4.this;
            if (c15549xc1495cd4.f218832g != null) {
                return;
            }
            c15549xc1495cd4.f218834i = c15549xc1495cd4.a();
            c15549xc1495cd4.f218832g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.flutter.plugin.LVNativePlugin$startObserveVolumeChangeEvent$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION")) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4 c15549xc1495cd42 = com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4.this;
                        float a17 = c15549xc1495cd42.a();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "newVolume:" + a17);
                        java.util.Map<java.lang.String, ? extends java.lang.Object> l17 = kz5.c1.l(new jz5.l("volume", java.lang.Float.valueOf(a17)), new jz5.l("oldVolume", java.lang.Float.valueOf(c15549xc1495cd42.f218834i)));
                        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24446x57409d1a c24446x57409d1a = c15549xc1495cd42.f218833h;
                        if (c24446x57409d1a != null) {
                            c24446x57409d1a.m90798xaf8c47fb("VolumeChanged", l17, h03.r.f359448d);
                        }
                        c15549xc1495cd42.f218834i = a17;
                    }
                }
            };
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c15549xc1495cd4.f218832g, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "did start observing volume");
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LVNativePlugin", "failed to start observing volume");
            }
        }
    };

    public final float a() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        return (audioManager != null ? audioManager.getStreamVolume(3) : 0) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : 1);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: didGetGestureEvent */
    public void mo63501x9ca962c8(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14439x62dcccee c14439x62dcccee;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14439x62dcccee c14439x62dcccee2;
        if (z17) {
            java.lang.ref.WeakReference weakReference = this.f218831f;
            if (weakReference == null || (c14439x62dcccee2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14439x62dcccee) weakReference.get()) == null) {
                return;
            }
            c14439x62dcccee2.f202431d = true;
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f218831f;
        if (weakReference2 == null || (c14439x62dcccee = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14439x62dcccee) weakReference2.get()) == null) {
            return;
        }
        c14439x62dcccee.f202431d = false;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: getInitMainFeedListContext */
    public com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24445xbba6dc8 mo63502xfe0ffc54() {
        return null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: isStarred */
    public java.lang.Boolean mo63503x6c5c8075(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        c16601x7ed0e40c.f66791xc8a07680 = str;
        c16601x7ed0e40c.f66793x2262335f = 25;
        return java.lang.Boolean.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c));
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026b  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: markStar */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo63504xeb052bf(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 r19, byte[] r20, long r21, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24444x1c8b3c r23) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15549xc1495cd4.mo63504xeb052bf(com.tencent.pigeon.mega_video.MegaVideoFeedInfo, byte[], long, com.tencent.pigeon.mega_video.LVSnapshotInfo):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: minimize */
    public void mo63505xaefe469e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "minimize playerId " + j17);
        android.app.Activity activity = this.f218830e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 activityC15554x67783102 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15554x67783102) activity : null;
        if (activityC15554x67783102 != null) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC15554x67783102).a(w03.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            w03.u.S6((w03.u) a17, false, false, false, java.lang.Long.valueOf(j17), 7, null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        return false;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "onAttachedToActivity");
        this.f218830e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
        android.app.Activity activity = this.f218830e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15550xf4f8d11d c15550xf4f8d11d = this.f218835m;
        if (activity != null) {
            bm5.a1.a(activity).c(c15550xf4f8d11d);
        }
        android.app.Activity activity2 = this.f218830e;
        if (activity2 != null) {
            bm5.a1.a(activity2).a(c15550xf4f8d11d);
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        this.f218833h = new com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24446x57409d1a(m137983x3b5b91dc, null, 2, null);
        this.f218829d = binding.m137982x6e669035();
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.Companion.m90894x97a46f3a(companion, m137983x3b5b91dc2, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "onDetachedFromActivity");
        this.f218830e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f218830e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a.Companion.m90894x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f218833h = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f218830e = binding.mo137508x19263085();
        binding.mo137502xbf77c2e1(this);
        android.app.Activity activity = this.f218830e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.p1708xc5476f33.C15550xf4f8d11d c15550xf4f8d11d = this.f218835m;
        if (activity != null) {
            bm5.a1.a(activity).c(c15550xf4f8d11d);
        }
        android.app.Activity activity2 = this.f218830e;
        if (activity2 != null) {
            bm5.a1.a(activity2).a(c15550xf4f8d11d);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: openFeedPlayerDetail */
    public void mo63507xe9bc85ba(java.lang.String checkroomTicket, byte[] openParamsBytes) {
        bw5.id0 id0Var;
        bw5.zc0 b17;
        bw5.yr b18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkroomTicket, "checkroomTicket");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openParamsBytes, "openParamsBytes");
        try {
            id0Var = new bw5.id0().mo11468x92b714fd(openParamsBytes);
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 unused) {
            id0Var = null;
        }
        bw5.id0 id0Var2 = id0Var;
        if (c03.k.f119198a.a(pm0.v.u((id0Var2 == null || (b17 = id0Var2.b()) == null || (b18 = b17.b()) == null) ? 0L : b18.f117165d))) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            c0Var.f391645d = id0Var2 != null ? id0Var2.f110075g : false;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = new android.os.Bundle();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new h03.s(id0Var2 != null ? id0Var2.f110088w : false, h0Var, this, linkedHashMap, checkroomTicket, c0Var, id0Var2, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: openKitchen */
    public void mo63508xca3d81fa(long j17, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: openWatchLaterList */
    public void mo63509x9ceb3e25(java.lang.String ticket) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ticket, "ticket");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("checkroom_ticket", ticket);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LVNativePlugin", "openWatchLaterList ticket ".concat(ticket));
        android.app.Activity activity = this.f218830e;
        if (activity != null) {
            a03.h0 h0Var = (a03.h0) ((n40.o) i95.n0.c(n40.o.class));
            h0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoUniversalService", "jumpWatchLaterUI ");
            p3325xe03a0797.p3326xc267989b.l.d(h0Var.f81958m, null, null, new a03.c0(h0Var, linkedHashMap, activity, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: removeStar */
    public void mo63510x417a90f6(java.lang.String str, long j17) {
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.C7((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, str, 25, false, 4, null);
        android.app.Activity activity = this.f218830e;
        if (activity != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nlg);
            e4Var.c();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: setOnceOrientation */
    public void mo63511x72067fcd(long j17) {
        android.app.Activity activity;
        int i17 = (int) j17;
        if (i17 != 0) {
            if (i17 == 1 && (activity = this.f218830e) != null) {
                activity.setRequestedOrientation(0);
                return;
            }
            return;
        }
        android.app.Activity activity2 = this.f218830e;
        if (activity2 == null) {
            return;
        }
        activity2.setRequestedOrientation(1);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: showLastExitFeedHint */
    public void mo63512x1a2f9356(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        ((ku5.t0) ku5.t0.f394148d).a(new h03.t(feed));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: showSharePanel */
    public void mo63513xf395bc42(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 feed, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: updatePlaySessionId */
    public void mo63514x122c7334(java.lang.String playSessionId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playSessionId, "playSessionId");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.InterfaceC24501x5bc8f97a
    /* renamed from: updateStarInfo */
    public void mo63515x82472a09(java.lang.String startId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startId, "startId");
        android.app.Activity activity = this.f218830e;
        if (activity == null) {
            return;
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sb0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sb0.class)).getClass();
    }
}
