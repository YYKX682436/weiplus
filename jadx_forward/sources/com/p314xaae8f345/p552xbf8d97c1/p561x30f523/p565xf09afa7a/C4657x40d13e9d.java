package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a;

/* renamed from: com.tencent.matrix.hook.pthread.PthreadHook */
/* loaded from: classes12.dex */
public class C4657x40d13e9d extends xh.b {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d f134210h = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f134211b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f134212c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f134213d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134214e = false;

    /* renamed from: f, reason: collision with root package name */
    public bi.a f134215f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f134216g = false;

    /* renamed from: addHookThreadNameNative */
    private native void m40940x61336db0(java.lang.String[] strArr);

    /* renamed from: dumpNative */
    private native void m40941x1a382f2b(java.lang.String str);

    /* renamed from: enableLoggerNative */
    private native void m40942x561212ea(boolean z17);

    /* renamed from: enableQuickenNative */
    private native void m40943x4a0ca64a(boolean z17);

    /* renamed from: enableTracePthreadReleaseNative */
    private native void m40944x7fc1c346(boolean z17);

    /* renamed from: enableTraceRenameNative */
    private native void m40945x3ea68397(boolean z17);

    /* renamed from: installHooksNative */
    private native void m40946x970feb4c(boolean z17);

    /* renamed from: setThreadStackShrinkEnabledNative */
    private native void m40947x2af020b3(boolean z17);

    /* renamed from: setThreadStackShrinkIgnoredCreatorSoPatternsNative */
    private native boolean m40948xee33d8d5(java.lang.String[] strArr);

    /* renamed from: setThreadTraceEnabledNative */
    private native void m40949x33543f9f(boolean z17);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-pthreadhook";
    }

    @Override // xh.b
    public boolean b() {
        m40940x61336db0((java.lang.String[]) ((java.util.HashSet) this.f134211b).toArray(new java.lang.String[0]));
        m40943x4a0ca64a(this.f134212c);
        m40945x3ea68397(this.f134212c);
        m40942x561212ea(false);
        m40944x7fc1c346(false);
        bi.a aVar = this.f134215f;
        if (aVar != null) {
            if (m40948xee33d8d5((java.lang.String[]) ((java.util.HashSet) this.f134215f.f102508b).toArray(new java.lang.String[((java.util.HashSet) aVar.f102508b).size()]))) {
                m40947x2af020b3(this.f134215f.f102507a);
            } else {
                oj.j.b("Matrix.Pthread", "setThreadStackShrinkIgnoredCreatorSoPatternsNative return false, do not enable ThreadStackShrinker.", new java.lang.Object[0]);
                m40947x2af020b3(false);
            }
        } else {
            m40948xee33d8d5(null);
            m40947x2af020b3(false);
        }
        m40949x33543f9f(this.f134214e);
        this.f134213d = true;
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        bi.a aVar;
        if ((this.f134214e || ((aVar = this.f134215f) != null && aVar.f102507a)) && !this.f134216g) {
            oj.j.c("Matrix.Pthread", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
            m40946x970feb4c(z17);
            this.f134216g = true;
        }
        return true;
    }

    public void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("path NOT valid: " + str);
        }
        if (this.f535999a == xh.a.COMMIT_SUCCESS) {
            m40941x1a382f2b(str);
        }
    }

    public com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d e(boolean z17) {
        this.f134212c = z17;
        if (this.f134213d) {
            m40943x4a0ca64a(z17);
        }
        return this;
    }

    public com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p565xf09afa7a.C4657x40d13e9d f(boolean z17) {
        if (this.f134213d) {
            m40945x3ea68397(z17);
        }
        return this;
    }
}
