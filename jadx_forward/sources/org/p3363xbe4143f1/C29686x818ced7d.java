package org.p3363xbe4143f1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.libpag.PAGAnimator */
/* loaded from: classes13.dex */
public class C29686x818ced7d {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.ref.WeakReference f429294a;

    /* renamed from: b, reason: collision with root package name */
    private float f429295b;

    /* renamed from: nativeContext */
    private long f75010xffae8598 = 0;

    /* renamed from: org.libpag.PAGAnimator$Listener */
    /* loaded from: classes13.dex */
    public interface Listener {
        /* renamed from: onAnimationCancel */
        void mo154662x827d33f(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d);

        /* renamed from: onAnimationEnd */
        void mo154663xbb3aa236(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d);

        /* renamed from: onAnimationRepeat */
        void mo154664x21f9d260(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d);

        /* renamed from: onAnimationStart */
        void mo154665xd7e2f2fd(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d);

        /* renamed from: onAnimationUpdate */
        void mo154666x27addd8e(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d);
    }

    static {
        b56.a.a("pag");
        m154642xb90145c7();
    }

    private C29686x818ced7d(android.content.Context context, org.p3363xbe4143f1.C29686x818ced7d.Listener listener) {
        this.f429294a = null;
        this.f429295b = 1.0f;
        this.f429294a = new java.lang.ref.WeakReference(listener);
        if (context != null) {
            this.f429295b = android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        m154644x67b070a6();
    }

    public static org.p3363xbe4143f1.C29686x818ced7d a(android.content.Context context, org.p3363xbe4143f1.C29686x818ced7d.Listener listener) {
        if (listener == null) {
            return null;
        }
        return new org.p3363xbe4143f1.C29686x818ced7d(context, listener);
    }

    /* renamed from: doStart */
    private native void m154640x6c20e697();

    /* renamed from: nativeFinalize */
    private native void m154641xef578955();

    /* renamed from: nativeInit */
    private static native void m154642xb90145c7();

    /* renamed from: nativeRelease */
    private native void m154643x7f877f0();

    /* renamed from: nativeSetup */
    private native void m154644x67b070a6();

    /* renamed from: onAnimationCancel */
    private void m154645x827d33f() {
        org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
        if (listener != null) {
            listener.mo154662x827d33f(this);
        }
    }

    /* renamed from: onAnimationEnd */
    private void m154646xbb3aa236() {
        org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
        if (listener != null) {
            listener.mo154663xbb3aa236(this);
        }
    }

    /* renamed from: onAnimationRepeat */
    private void m154647x21f9d260() {
        org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
        if (listener != null) {
            listener.mo154664x21f9d260(this);
        }
    }

    /* renamed from: onAnimationStart */
    private void m154648xd7e2f2fd() {
        org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
        if (listener != null) {
            listener.mo154665xd7e2f2fd(this);
        }
    }

    /* renamed from: onAnimationUpdate */
    private void m154649x27addd8e() {
        org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
        if (listener != null) {
            listener.mo154666x27addd8e(this);
        }
    }

    /* renamed from: cancel */
    public native void m154650xae7a2e7a();

    /* renamed from: duration */
    public native long m154651x89444d94();

    /* renamed from: finalize */
    public void m154652xd764dc1e() {
        m154641xef578955();
    }

    /* renamed from: isRunning */
    public native boolean m154653x39e05d35();

    /* renamed from: isSync */
    public native boolean m154654xb9a8f6e5();

    /* renamed from: progress */
    public native double m154655xc454c22d();

    /* renamed from: repeatCount */
    public native int m154656x5dab7c34();

    /* renamed from: setDuration */
    public native void m154657xffd6ec16(long j17);

    /* renamed from: setProgress */
    public native void m154658x3ae760af(double d17);

    /* renamed from: setRepeatCount */
    public native void m154659xcde73672(int i17);

    /* renamed from: setSync */
    public native void m154660x76504a1d(boolean z17);

    /* renamed from: update */
    public native void m154661xce0038c9();

    public void a() {
        if (this.f429295b == 0.0f) {
            org.p3363xbe4143f1.C29686x818ced7d.Listener listener = (org.p3363xbe4143f1.C29686x818ced7d.Listener) this.f429294a.get();
            if (listener != null) {
                listener.mo154666x27addd8e(this);
                listener.mo154663xbb3aa236(this);
                return;
            }
            return;
        }
        m154640x6c20e697();
    }
}
