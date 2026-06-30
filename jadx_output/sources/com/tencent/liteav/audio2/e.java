package com.tencent.liteav.audio2;

/* loaded from: classes13.dex */
public final class e extends android.telephony.PhoneStateListener implements com.tencent.liteav.audio2.c.a {

    /* renamed from: c, reason: collision with root package name */
    static com.tencent.liteav.audio2.c f46255c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.Class<?> f46258d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.Object f46259e;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.audio2.e.b f46261g;

    /* renamed from: f, reason: collision with root package name */
    int f46260f = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46263i = false;

    /* renamed from: a, reason: collision with root package name */
    android.telephony.TelephonyManager f46256a = (android.telephony.TelephonyManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("phone");

    /* renamed from: b, reason: collision with root package name */
    android.media.AudioManager f46257b = (android.media.AudioManager) com.tencent.liteav.base.ContextUtils.getApplicationContext().getSystemService("audio");

    /* renamed from: h, reason: collision with root package name */
    private com.tencent.liteav.base.util.l f46262h = new com.tencent.liteav.base.util.l("PhoneStateManager");

    /* loaded from: classes13.dex */
    public static class a implements java.lang.reflect.InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.tencent.liteav.audio2.e> f46264a;

        public a(com.tencent.liteav.audio2.e eVar) {
            this.f46264a = new java.lang.ref.WeakReference<>(eVar);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            com.tencent.liteav.audio2.e.b bVar;
            try {
                if ("onModeChanged".equals(method.getName())) {
                    int intValue = ((java.lang.Integer) objArr[0]).intValue();
                    com.tencent.liteav.audio2.e eVar = this.f46264a.get();
                    if (eVar != null && (bVar = eVar.f46261g) != null) {
                        if (intValue == 2) {
                            eVar.f46263i = true;
                            bVar.onInterruptedByPhoneCall();
                        } else if (eVar.f46263i) {
                            eVar.f46263i = false;
                            bVar.onResumedByPhoneCall();
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.Log.e("PhoneStateManager", "notify mode changed failed, " + th6.getMessage(), new java.lang.Object[0]);
            }
            return obj;
        }
    }

    /* loaded from: classes13.dex */
    public interface b {
        void onInterruptedByPhoneCall();

        void onResumedByPhoneCall();
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            f46255c = new com.tencent.liteav.audio2.c();
        }
    }

    public e(com.tencent.liteav.audio2.e.b bVar) {
        this.f46261g = bVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i17, java.lang.String str) {
        com.tencent.liteav.audio2.e.b bVar = this.f46261g;
        if (bVar == null || this.f46260f == i17) {
            return;
        }
        this.f46260f = i17;
        if (i17 == 2) {
            bVar.onInterruptedByPhoneCall();
        } else if (i17 == 0) {
            bVar.onResumedByPhoneCall();
        }
    }

    public static boolean b() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            return applicationContext.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e("PhoneStateManager", "check permission exception, " + th6.getMessage(), new java.lang.Object[0]);
            return true;
        }
    }

    public static void c() {
        if (android.os.Build.VERSION.SDK_INT >= 26 && f46255c != null) {
            com.tencent.liteav.base.Log.i("PhoneStateManager", "unregister audio playback callback.", new java.lang.Object[0]);
            f46255c.f46253a = null;
        }
    }

    @Override // com.tencent.liteav.audio2.c.a
    public final void a() {
        this.f46262h.a(com.tencent.liteav.audio2.f.a(this), 500L);
    }

    public static /* synthetic */ void a(com.tencent.liteav.audio2.e eVar) {
        com.tencent.liteav.audio2.e.b bVar = eVar.f46261g;
        if (bVar == null) {
            return;
        }
        try {
            if (eVar.f46257b.getMode() == 2) {
                eVar.f46263i = true;
                bVar.onInterruptedByPhoneCall();
            } else if (eVar.f46263i) {
                eVar.f46263i = false;
                bVar.onResumedByPhoneCall();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e("PhoneStateManager", "get Mode exception, " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
