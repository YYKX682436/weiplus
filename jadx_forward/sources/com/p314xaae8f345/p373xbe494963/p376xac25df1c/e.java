package com.p314xaae8f345.p373xbe494963.p376xac25df1c;

/* loaded from: classes13.dex */
public final class e extends android.telephony.PhoneStateListener implements com.tencent.liteav.audio2.c.a {

    /* renamed from: c, reason: collision with root package name */
    static com.p314xaae8f345.p373xbe494963.p376xac25df1c.c f127788c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.Class<?> f127791d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.Object f127792e;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.audio2.e.b f127794g;

    /* renamed from: f, reason: collision with root package name */
    int f127793f = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f127796i = false;

    /* renamed from: a, reason: collision with root package name */
    android.telephony.TelephonyManager f127789a = (android.telephony.TelephonyManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("phone");

    /* renamed from: b, reason: collision with root package name */
    android.media.AudioManager f127790b = (android.media.AudioManager) com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getSystemService("audio");

    /* renamed from: h, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l f127795h = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l("PhoneStateManager");

    /* loaded from: classes13.dex */
    public static class a implements java.lang.reflect.InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p373xbe494963.p376xac25df1c.e> f127797a;

        public a(com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar) {
            this.f127797a = new java.lang.ref.WeakReference<>(eVar);
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            com.tencent.liteav.audio2.e.b bVar;
            try {
                if ("onModeChanged".equals(method.getName())) {
                    int intValue = ((java.lang.Integer) objArr[0]).intValue();
                    com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar = this.f127797a.get();
                    if (eVar != null && (bVar = eVar.f127794g) != null) {
                        if (intValue == 2) {
                            eVar.f127796i = true;
                            bVar.mo29166x69019f72();
                        } else if (eVar.f127796i) {
                            eVar.f127796i = false;
                            bVar.mo29167x5835a83d();
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "notify mode changed failed, " + th6.getMessage(), new java.lang.Object[0]);
            }
            return obj;
        }
    }

    /* loaded from: classes13.dex */
    public interface b {
        /* renamed from: onInterruptedByPhoneCall */
        void mo29166x69019f72();

        /* renamed from: onResumedByPhoneCall */
        void mo29167x5835a83d();
    }

    static {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            f127788c = new com.p314xaae8f345.p373xbe494963.p376xac25df1c.c();
        }
    }

    public e(com.tencent.liteav.audio2.e.b bVar) {
        this.f127794g = bVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i17, java.lang.String str) {
        com.tencent.liteav.audio2.e.b bVar = this.f127794g;
        if (bVar == null || this.f127793f == i17) {
            return;
        }
        this.f127793f = i17;
        if (i17 == 2) {
            bVar.mo29166x69019f72();
        } else if (i17 == 0) {
            bVar.mo29167x5835a83d();
        }
    }

    public static boolean b() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            return false;
        }
        try {
            return m29240x6e669035.checkPermission("android.permission.READ_PHONE_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "check permission exception, " + th6.getMessage(), new java.lang.Object[0]);
            return true;
        }
    }

    public static void c() {
        if (android.os.Build.VERSION.SDK_INT >= 26 && f127788c != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("PhoneStateManager", "unregister audio playback callback.", new java.lang.Object[0]);
            f127788c.f127786a = null;
        }
    }

    @Override // com.tencent.liteav.audio2.c.a
    public final void a() {
        this.f127795h.a(com.p314xaae8f345.p373xbe494963.p376xac25df1c.f.a(this), 500L);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p376xac25df1c.e eVar) {
        com.tencent.liteav.audio2.e.b bVar = eVar.f127794g;
        if (bVar == null) {
            return;
        }
        try {
            if (eVar.f127790b.getMode() == 2) {
                eVar.f127796i = true;
                bVar.mo29166x69019f72();
            } else if (eVar.f127796i) {
                eVar.f127796i = false;
                bVar.mo29167x5835a83d();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e("PhoneStateManager", "get Mode exception, " + th6.getMessage(), new java.lang.Object[0]);
        }
    }
}
