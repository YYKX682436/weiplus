package com.tencent.matrix.hook.pthread;

/* loaded from: classes12.dex */
public class PthreadHook extends xh.b {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.matrix.hook.pthread.PthreadHook f52677h = new com.tencent.matrix.hook.pthread.PthreadHook();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f52678b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f52679c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52680d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52681e = false;

    /* renamed from: f, reason: collision with root package name */
    public bi.a f52682f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52683g = false;

    private native void addHookThreadNameNative(java.lang.String[] strArr);

    private native void dumpNative(java.lang.String str);

    private native void enableLoggerNative(boolean z17);

    private native void enableQuickenNative(boolean z17);

    private native void enableTracePthreadReleaseNative(boolean z17);

    private native void enableTraceRenameNative(boolean z17);

    private native void installHooksNative(boolean z17);

    private native void setThreadStackShrinkEnabledNative(boolean z17);

    private native boolean setThreadStackShrinkIgnoredCreatorSoPatternsNative(java.lang.String[] strArr);

    private native void setThreadTraceEnabledNative(boolean z17);

    @Override // xh.b
    public java.lang.String a() {
        return "matrix-pthreadhook";
    }

    @Override // xh.b
    public boolean b() {
        addHookThreadNameNative((java.lang.String[]) ((java.util.HashSet) this.f52678b).toArray(new java.lang.String[0]));
        enableQuickenNative(this.f52679c);
        enableTraceRenameNative(this.f52679c);
        enableLoggerNative(false);
        enableTracePthreadReleaseNative(false);
        bi.a aVar = this.f52682f;
        if (aVar != null) {
            if (setThreadStackShrinkIgnoredCreatorSoPatternsNative((java.lang.String[]) ((java.util.HashSet) this.f52682f.f20975b).toArray(new java.lang.String[((java.util.HashSet) aVar.f20975b).size()]))) {
                setThreadStackShrinkEnabledNative(this.f52682f.f20974a);
            } else {
                oj.j.b("Matrix.Pthread", "setThreadStackShrinkIgnoredCreatorSoPatternsNative return false, do not enable ThreadStackShrinker.", new java.lang.Object[0]);
                setThreadStackShrinkEnabledNative(false);
            }
        } else {
            setThreadStackShrinkIgnoredCreatorSoPatternsNative(null);
            setThreadStackShrinkEnabledNative(false);
        }
        setThreadTraceEnabledNative(this.f52681e);
        this.f52680d = true;
        return true;
    }

    @Override // xh.b
    public boolean c(boolean z17) {
        bi.a aVar;
        if ((this.f52681e || ((aVar = this.f52682f) != null && aVar.f20974a)) && !this.f52683g) {
            oj.j.c("Matrix.Pthread", "#onHook, installHooksNative: debug=" + z17, new java.lang.Object[0]);
            installHooksNative(z17);
            this.f52683g = true;
        }
        return true;
    }

    public void d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("path NOT valid: " + str);
        }
        if (this.f454466a == xh.a.COMMIT_SUCCESS) {
            dumpNative(str);
        }
    }

    public com.tencent.matrix.hook.pthread.PthreadHook e(boolean z17) {
        this.f52679c = z17;
        if (this.f52680d) {
            enableQuickenNative(z17);
        }
        return this;
    }

    public com.tencent.matrix.hook.pthread.PthreadHook f(boolean z17) {
        if (this.f52680d) {
            enableTraceRenameNative(z17);
        }
        return this;
    }
}
