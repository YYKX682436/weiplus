package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes13.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f127998a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.Callable<T> f127999b;

    public r(java.util.concurrent.Callable<T> callable) {
        this.f127999b = callable;
    }

    public final void a(T t17) {
        synchronized (this) {
            this.f127998a = t17;
        }
    }

    public final T a() {
        T t17 = this.f127998a;
        if (t17 instanceof java.lang.String) {
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) t17)) {
                return this.f127998a;
            }
        } else if (t17 != null) {
            return t17;
        }
        synchronized (this) {
            T t18 = this.f127998a;
            if (t18 instanceof java.lang.String) {
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) t18)) {
                    return this.f127998a;
                }
            } else if (t18 != null) {
                return t18;
            }
            try {
                this.f127998a = this.f127999b.call();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("Stash", "Get value failed. msg:" + e17.getMessage());
            }
            return this.f127998a;
        }
    }
}
