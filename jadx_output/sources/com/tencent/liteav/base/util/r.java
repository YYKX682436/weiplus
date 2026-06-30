package com.tencent.liteav.base.util;

/* loaded from: classes13.dex */
public final class r<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f46465a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.Callable<T> f46466b;

    public r(java.util.concurrent.Callable<T> callable) {
        this.f46466b = callable;
    }

    public final void a(T t17) {
        synchronized (this) {
            this.f46465a = t17;
        }
    }

    public final T a() {
        T t17 = this.f46465a;
        if (t17 instanceof java.lang.String) {
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) t17)) {
                return this.f46465a;
            }
        } else if (t17 != null) {
            return t17;
        }
        synchronized (this) {
            T t18 = this.f46465a;
            if (t18 instanceof java.lang.String) {
                if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) t18)) {
                    return this.f46465a;
                }
            } else if (t18 != null) {
                return t18;
            }
            try {
                this.f46465a = this.f46466b.call();
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.util.LiteavLog.e("Stash", "Get value failed. msg:" + e17.getMessage());
            }
            return this.f46465a;
        }
    }
}
