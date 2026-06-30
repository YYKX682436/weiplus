package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

/* renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager */
/* loaded from: classes13.dex */
public class C3844x7a121c56 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 f128534b;

    /* renamed from: _hellAccFlag_ */
    private byte f15045x7f11beae;

    /* renamed from: c, reason: collision with root package name */
    private final android.content.Context f128536c;

    /* renamed from: g, reason: collision with root package name */
    private android.media.projection.MediaProjection f128540g;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.Map<android.view.Surface, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a> f128538e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f128539f = false;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.Runnable f128541h = com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.f.a(this);

    /* renamed from: i, reason: collision with root package name */
    private final android.media.projection.MediaProjection.Callback f128542i = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    private final android.os.Handler f128537d = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l f128535a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l();

    /* renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends android.media.projection.MediaProjection.Callback {
        public AnonymousClass1() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.this.f128535a.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.j.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.this));
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager$VirtualDisplayListener */
    /* loaded from: classes13.dex */
    public interface VirtualDisplayListener {
        /* renamed from: onCaptureError */
        void mo31419xa18c41e1();

        /* renamed from: onStartFinish */
        void mo31420x96877436(boolean z17, boolean z18);
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager$a */
    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public android.view.Surface f128544a;

        /* renamed from: b, reason: collision with root package name */
        public int f128545b;

        /* renamed from: c, reason: collision with root package name */
        public int f128546c;

        /* renamed from: d, reason: collision with root package name */
        public com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener f128547d;

        /* renamed from: e, reason: collision with root package name */
        public android.hardware.display.VirtualDisplay f128548e;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }
    }

    private C3844x7a121c56(android.content.Context context) {
        this.f128536c = context.getApplicationContext();
    }

    public static com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 a(android.content.Context context) {
        if (f128534b == null) {
            synchronized (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.class) {
                if (f128534b == null) {
                    f128534b = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56(context);
                }
            }
        }
        return f128534b;
    }

    public static /* synthetic */ void c(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56) {
        java.util.HashMap hashMap = new java.util.HashMap(c3844x7a121c56.f128538e);
        c3844x7a121c56.f128538e.clear();
        for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a aVar : hashMap.values()) {
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener = aVar.f128547d;
            if (virtualDisplayListener != null) {
                if (aVar.f128548e != null) {
                    virtualDisplayListener.mo31419xa18c41e1();
                } else {
                    virtualDisplayListener.mo31420x96877436(false, false);
                }
            }
        }
        c3844x7a121c56.a(false);
    }

    private void b() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "stopScreenCaptureService");
        try {
            this.f128536c.stopService(new android.content.Intent(this.f128536c, (java.lang.Class<?>) com.p314xaae8f345.p2926x359365.p2927x6b0147b.ServiceC25493x6c93903b.class));
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void b(android.media.projection.MediaProjection mediaProjection) {
        try {
            java.lang.Class.forName("com.tencent.liteav.audio.SystemLoopbackRecorder").getMethod("notifyMediaProjectionState", android.media.projection.MediaProjection.class).invoke(null, mediaProjection);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("VirtualDisplayManager", "fail to send media projection session " + e17.getMessage());
        }
        try {
            int i17 = com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.f127781a;
            com.p314xaae8f345.p373xbe494963.p376xac25df1c.C3735x39c9ab5a.class.getMethod("notifyMediaProjectionState", android.media.projection.MediaProjection.class).invoke(null, mediaProjection);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e18) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("VirtualDisplayManager", "fail to send media projection session " + e18.getMessage());
        }
    }

    private void a() {
        for (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a aVar : this.f128538e.values()) {
            if (aVar.f128548e == null) {
                try {
                    aVar.f128548e = this.f128540g.createVirtualDisplay("TXCScreenCapture", aVar.f128545b, aVar.f128546c, 1, 1, aVar.f128544a, null, null);
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f128548e);
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener = aVar.f128547d;
                    if (virtualDisplayListener != null) {
                        virtualDisplayListener.mo31420x96877436(true, false);
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("VirtualDisplayManager", "create VirtualDisplay error ", th6);
                    com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener2 = aVar.f128547d;
                    if (virtualDisplayListener2 != null) {
                        virtualDisplayListener2.mo31420x96877436(false, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17) {
        if (this.f128538e.isEmpty()) {
            if (z17) {
                this.f128535a.a(this.f128541h, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "Stop media projection session " + this.f128540g);
            if (this.f128540g != null) {
                b((android.media.projection.MediaProjection) null);
                try {
                    this.f128540g.unregisterCallback(this.f128542i);
                    this.f128540g.stop();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w("VirtualDisplayManager", "stop media projection session with exception ", th6);
                }
                this.f128540g = null;
            }
            b();
        }
    }

    public final void a(android.media.projection.MediaProjection mediaProjection) {
        this.f128535a.a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.i.a(this, mediaProjection));
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.media.projection.MediaProjection mediaProjection) {
        c3844x7a121c56.f128539f = false;
        if (mediaProjection == null) {
            java.util.HashMap hashMap = new java.util.HashMap(c3844x7a121c56.f128538e);
            c3844x7a121c56.f128538e.clear();
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener = ((com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a) it.next()).f128547d;
                if (virtualDisplayListener != null) {
                    virtualDisplayListener.mo31420x96877436(false, true);
                }
            }
            c3844x7a121c56.b();
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "Got session ".concat(java.lang.String.valueOf(mediaProjection)));
        c3844x7a121c56.f128540g = mediaProjection;
        mediaProjection.registerCallback(c3844x7a121c56.f128542i, c3844x7a121c56.f128537d);
        c3844x7a121c56.a();
        b(c3844x7a121c56.f128540g);
        c3844x7a121c56.a(true);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.view.Surface surface) {
        android.hardware.display.VirtualDisplay virtualDisplay;
        if (surface != null) {
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a remove = c3844x7a121c56.f128538e.remove(surface);
            if (remove != null && (virtualDisplay = remove.f128548e) != null) {
                virtualDisplay.release();
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "VirtualDisplay released, " + remove.f128548e);
            }
            c3844x7a121c56.a(true);
        }
    }

    public static void a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56 c3844x7a121c56, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener virtualDisplayListener) {
        byte b17 = 0;
        if (surface == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("VirtualDisplayManager", "surface is null!");
            virtualDisplayListener.mo31420x96877436(false, false);
            return;
        }
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a aVar = new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.a(b17);
        aVar.f128544a = surface;
        aVar.f128545b = i17;
        aVar.f128546c = i18;
        aVar.f128547d = virtualDisplayListener;
        aVar.f128548e = null;
        c3844x7a121c56.f128538e.put(surface, aVar);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l lVar = c3844x7a121c56.f128535a;
        java.lang.Runnable runnable = c3844x7a121c56.f128541h;
        if (runnable != null) {
            lVar.f127981a.remove(runnable);
            synchronized (lVar) {
                java.util.Iterator<com.tencent.liteav.base.util.l.a> it = lVar.f127983c.iterator();
                while (it.hasNext()) {
                    com.tencent.liteav.base.util.l.a next = it.next();
                    if (next != null && runnable == next.f127984a) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l.this.f127982b.removeCallbacks(next.f127986c);
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l.this.f127981a.remove(next.f127985b);
                        it.remove();
                    }
                }
            }
        }
        android.media.projection.MediaProjection mediaProjection2 = c3844x7a121c56.f128540g;
        if (mediaProjection2 != null || mediaProjection != null) {
            if (mediaProjection != null && mediaProjection2 != mediaProjection) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i("VirtualDisplayManager", "start capture with media projection from user:".concat(java.lang.String.valueOf(mediaProjection)));
                c3844x7a121c56.a(mediaProjection);
                return;
            } else {
                c3844x7a121c56.a();
                return;
            }
        }
        if (c3844x7a121c56.f128539f) {
            return;
        }
        c3844x7a121c56.f128539f = true;
        android.content.Intent intent = new android.content.Intent(c3844x7a121c56.f128536c, (java.lang.Class<?>) com.p314xaae8f345.p2926x359365.p2927x6b0147b.C25494xc324e916.TXScreenCaptureAssistantActivity.class);
        intent.addFlags(268435456);
        android.content.Context context = c3844x7a121c56.f128536c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/liteav/videoproducer/capture/VirtualDisplayManager", "a", "(Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager$VirtualDisplayListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/liteav/videoproducer/capture/VirtualDisplayManager", "a", "(Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager$VirtualDisplayListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
