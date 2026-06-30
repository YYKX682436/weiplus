package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes13.dex */
public class VirtualDisplayManager {

    /* renamed from: b, reason: collision with root package name */
    private static volatile com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47001b;
    private byte _hellAccFlag_;

    /* renamed from: c, reason: collision with root package name */
    private final android.content.Context f47003c;

    /* renamed from: g, reason: collision with root package name */
    private android.media.projection.MediaProjection f47007g;

    /* renamed from: e, reason: collision with root package name */
    private final java.util.Map<android.view.Surface, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a> f47005e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    private boolean f47006f = false;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.Runnable f47008h = com.tencent.liteav.videoproducer.capture.f.a(this);

    /* renamed from: i, reason: collision with root package name */
    private final android.media.projection.MediaProjection.Callback f47009i = new com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    private final android.os.Handler f47004d = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.liteav.base.util.l f47002a = new com.tencent.liteav.base.util.l();

    /* renamed from: com.tencent.liteav.videoproducer.capture.VirtualDisplayManager$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends android.media.projection.MediaProjection.Callback {
        public AnonymousClass1() {
        }

        @Override // android.media.projection.MediaProjection.Callback
        public final void onStop() {
            com.tencent.liteav.base.util.LiteavLog.e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.this.f47002a.a(com.tencent.liteav.videoproducer.capture.j.a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.this));
        }
    }

    /* loaded from: classes13.dex */
    public interface VirtualDisplayListener {
        void onCaptureError();

        void onStartFinish(boolean z17, boolean z18);
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public android.view.Surface f47011a;

        /* renamed from: b, reason: collision with root package name */
        public int f47012b;

        /* renamed from: c, reason: collision with root package name */
        public int f47013c;

        /* renamed from: d, reason: collision with root package name */
        public com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener f47014d;

        /* renamed from: e, reason: collision with root package name */
        public android.hardware.display.VirtualDisplay f47015e;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }
    }

    private VirtualDisplayManager(android.content.Context context) {
        this.f47003c = context.getApplicationContext();
    }

    public static com.tencent.liteav.videoproducer.capture.VirtualDisplayManager a(android.content.Context context) {
        if (f47001b == null) {
            synchronized (com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.class) {
                if (f47001b == null) {
                    f47001b = new com.tencent.liteav.videoproducer.capture.VirtualDisplayManager(context);
                }
            }
        }
        return f47001b;
    }

    public static /* synthetic */ void c(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager) {
        java.util.HashMap hashMap = new java.util.HashMap(virtualDisplayManager.f47005e);
        virtualDisplayManager.f47005e.clear();
        for (com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a aVar : hashMap.values()) {
            com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener = aVar.f47014d;
            if (virtualDisplayListener != null) {
                if (aVar.f47015e != null) {
                    virtualDisplayListener.onCaptureError();
                } else {
                    virtualDisplayListener.onStartFinish(false, false);
                }
            }
        }
        virtualDisplayManager.a(false);
    }

    private void b() {
        com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "stopScreenCaptureService");
        try {
            this.f47003c.stopService(new android.content.Intent(this.f47003c, (java.lang.Class<?>) com.tencent.rtmp.video.ScreenCaptureService.class));
        } catch (java.lang.Throwable unused) {
        }
    }

    private static void b(android.media.projection.MediaProjection mediaProjection) {
        try {
            java.lang.Class.forName("com.tencent.liteav.audio.SystemLoopbackRecorder").getMethod("notifyMediaProjectionState", android.media.projection.MediaProjection.class).invoke(null, mediaProjection);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            com.tencent.liteav.base.util.LiteavLog.e("VirtualDisplayManager", "fail to send media projection session " + e17.getMessage());
        }
        try {
            int i17 = com.tencent.liteav.audio2.SystemLoopbackRecorder2.f46248a;
            com.tencent.liteav.audio2.SystemLoopbackRecorder2.class.getMethod("notifyMediaProjectionState", android.media.projection.MediaProjection.class).invoke(null, mediaProjection);
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e18) {
            com.tencent.liteav.base.util.LiteavLog.e("VirtualDisplayManager", "fail to send media projection session " + e18.getMessage());
        }
    }

    private void a() {
        for (com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a aVar : this.f47005e.values()) {
            if (aVar.f47015e == null) {
                try {
                    aVar.f47015e = this.f47007g.createVirtualDisplay("TXCScreenCapture", aVar.f47012b, aVar.f47013c, 1, 1, aVar.f47011a, null, null);
                    com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "create VirtualDisplay " + aVar.f47015e);
                    com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener = aVar.f47014d;
                    if (virtualDisplayListener != null) {
                        virtualDisplayListener.onStartFinish(true, false);
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.util.LiteavLog.e("VirtualDisplayManager", "create VirtualDisplay error ", th6);
                    com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener2 = aVar.f47014d;
                    if (virtualDisplayListener2 != null) {
                        virtualDisplayListener2.onStartFinish(false, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z17) {
        if (this.f47005e.isEmpty()) {
            if (z17) {
                this.f47002a.a(this.f47008h, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
                return;
            }
            com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "Stop media projection session " + this.f47007g);
            if (this.f47007g != null) {
                b((android.media.projection.MediaProjection) null);
                try {
                    this.f47007g.unregisterCallback(this.f47009i);
                    this.f47007g.stop();
                } catch (java.lang.Throwable th6) {
                    com.tencent.liteav.base.util.LiteavLog.w("VirtualDisplayManager", "stop media projection session with exception ", th6);
                }
                this.f47007g = null;
            }
            b();
        }
    }

    public final void a(android.media.projection.MediaProjection mediaProjection) {
        this.f47002a.a(com.tencent.liteav.videoproducer.capture.i.a(this, mediaProjection));
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.media.projection.MediaProjection mediaProjection) {
        virtualDisplayManager.f47006f = false;
        if (mediaProjection == null) {
            java.util.HashMap hashMap = new java.util.HashMap(virtualDisplayManager.f47005e);
            virtualDisplayManager.f47005e.clear();
            java.util.Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener = ((com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a) it.next()).f47014d;
                if (virtualDisplayListener != null) {
                    virtualDisplayListener.onStartFinish(false, true);
                }
            }
            virtualDisplayManager.b();
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "Got session ".concat(java.lang.String.valueOf(mediaProjection)));
        virtualDisplayManager.f47007g = mediaProjection;
        mediaProjection.registerCallback(virtualDisplayManager.f47009i, virtualDisplayManager.f47004d);
        virtualDisplayManager.a();
        b(virtualDisplayManager.f47007g);
        virtualDisplayManager.a(true);
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface) {
        android.hardware.display.VirtualDisplay virtualDisplay;
        if (surface != null) {
            com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a remove = virtualDisplayManager.f47005e.remove(surface);
            if (remove != null && (virtualDisplay = remove.f47015e) != null) {
                virtualDisplay.release();
                com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "VirtualDisplay released, " + remove.f47015e);
            }
            virtualDisplayManager.a(true);
        }
    }

    public static void a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        byte b17 = 0;
        if (surface == null) {
            com.tencent.liteav.base.util.LiteavLog.e("VirtualDisplayManager", "surface is null!");
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a aVar = new com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(b17);
        aVar.f47011a = surface;
        aVar.f47012b = i17;
        aVar.f47013c = i18;
        aVar.f47014d = virtualDisplayListener;
        aVar.f47015e = null;
        virtualDisplayManager.f47005e.put(surface, aVar);
        com.tencent.liteav.base.util.l lVar = virtualDisplayManager.f47002a;
        java.lang.Runnable runnable = virtualDisplayManager.f47008h;
        if (runnable != null) {
            lVar.f46448a.remove(runnable);
            synchronized (lVar) {
                java.util.Iterator<com.tencent.liteav.base.util.l.a> it = lVar.f46450c.iterator();
                while (it.hasNext()) {
                    com.tencent.liteav.base.util.l.a next = it.next();
                    if (next != null && runnable == next.f46451a) {
                        com.tencent.liteav.base.util.l.this.f46449b.removeCallbacks(next.f46453c);
                        com.tencent.liteav.base.util.l.this.f46448a.remove(next.f46452b);
                        it.remove();
                    }
                }
            }
        }
        android.media.projection.MediaProjection mediaProjection2 = virtualDisplayManager.f47007g;
        if (mediaProjection2 != null || mediaProjection != null) {
            if (mediaProjection != null && mediaProjection2 != mediaProjection) {
                com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "start capture with media projection from user:".concat(java.lang.String.valueOf(mediaProjection)));
                virtualDisplayManager.a(mediaProjection);
                return;
            } else {
                virtualDisplayManager.a();
                return;
            }
        }
        if (virtualDisplayManager.f47006f) {
            return;
        }
        virtualDisplayManager.f47006f = true;
        android.content.Intent intent = new android.content.Intent(virtualDisplayManager.f47003c, (java.lang.Class<?>) com.tencent.rtmp.video.TXScreenCapture.TXScreenCaptureAssistantActivity.class);
        intent.addFlags(268435456);
        android.content.Context context = virtualDisplayManager.f47003c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/liteav/videoproducer/capture/VirtualDisplayManager", "a", "(Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager$VirtualDisplayListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/liteav/videoproducer/capture/VirtualDisplayManager", "a", "(Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/VirtualDisplayManager$VirtualDisplayListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
